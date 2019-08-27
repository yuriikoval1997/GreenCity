package greencity.service;

import greencity.dto.PageableDto;
import greencity.dto.user.UserForListDto;
import greencity.entity.User;

import greencity.entity.enums.ROLE;
import greencity.entity.enums.UserStatus;
import org.springframework.data.domain.Pageable;

/** Provides the interface to manage {@code User} entity. */
public interface UserService {

    User save(User user);

    User update(User user);

    User findById(Long id);

    void deleteById(Long id);

    User findByEmail(String email);

    /**
     * Update {@code ROLE} of user.
     *
     * @param id {@code User} id.
     * @param role {@code ROLE} for user.
     * @author Rostyslav Khasanov
     */
    void updateRole(Long id, ROLE role);

    /**
     * Update {@code UserStatus} of user.
     *
     * @param id {@code User} id.
     * @param userStatus {@code UserStatus} for user.
     * @author Rostyslav Khasanov
     */
    void updateUserStatus(Long id, UserStatus userStatus);

    /**
     * Find by page {@code User}.
     *
     * @param pageable a value with pageable configuration.
     * @return a dto of {@code PageableDto<UserForDtoList>}.
     * @author Rostyslav Khasanov
     */
    PageableDto<UserForListDto> findByPage(Pageable pageable);
}

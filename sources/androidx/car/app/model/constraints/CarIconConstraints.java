package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class CarIconConstraints {
    private final int[] mAllowedTypes;
    public static final CarIconConstraints UNCONSTRAINED = create(new int[]{1, 2, 4});
    public static final CarIconConstraints DEFAULT = create(new int[]{1, 2});

    private static CarIconConstraints create(int[] iArr) {
        return new CarIconConstraints(iArr);
    }

    public void validateOrThrow(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        checkSupportedIcon(icon);
    }

    public IconCompat checkSupportedIcon(IconCompat iconCompat) {
        int type = iconCompat.getType();
        for (int i : this.mAllowedTypes) {
            if (type == i) {
                if (type != 4 || "content".equalsIgnoreCase(iconCompat.getUri().getScheme())) {
                    return iconCompat;
                }
                throw new IllegalArgumentException("Unsupported URI scheme for: " + iconCompat);
            }
        }
        throw new IllegalArgumentException("Custom icon type is not allowed: " + type);
    }

    private CarIconConstraints(int[] iArr) {
        this.mAllowedTypes = iArr;
    }
}

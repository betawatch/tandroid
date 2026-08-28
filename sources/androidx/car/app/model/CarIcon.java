package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final IconCompat mIcon;
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);
    public static final CarIcon PAN = forStandardType(7);
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i9) {
        this.mType = i9;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    private static CarIcon forStandardType(int i9) {
        return forStandardType(i9, CarColor.DEFAULT);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int i9;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (i9 = iconCompat2.i()) != iconCompat.i()) {
            return false;
        }
        if (i9 == 2) {
            return Objects.equals(this.mIcon.h(), iconCompat.h()) && this.mIcon.g() == iconCompat.g();
        }
        if (i9 == 4) {
            return Objects.equals(this.mIcon.j(), iconCompat.j());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int i9 = iconCompat.i();
        if (i9 != 2) {
            return i9 == 4 ? this.mIcon.j() : Integer.valueOf(i9);
        }
        return this.mIcon.h() + this.mIcon.g();
    }

    private static String typeToString(int i9) {
        switch (i9) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash());
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + "]";
    }

    private static CarIcon forStandardType(int i9, CarColor carColor) {
        return new CarIcon(null, carColor, i9);
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}

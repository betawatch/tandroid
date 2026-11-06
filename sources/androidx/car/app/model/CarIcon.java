package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i7) {
        this.mType = i7;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    private static CarIcon forStandardType(int i7) {
        return forStandardType(i7, CarColor.DEFAULT);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int i7;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (i7 = iconCompat2.i()) != iconCompat.i()) {
            return false;
        }
        if (i7 == 2) {
            return Objects.equals(this.mIcon.h(), iconCompat.h()) && this.mIcon.g() == iconCompat.g();
        }
        if (i7 == 4) {
            return Objects.equals(this.mIcon.j(), iconCompat.j());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int i7 = iconCompat.i();
        if (i7 != 2) {
            return i7 == 4 ? this.mIcon.j() : Integer.valueOf(i7);
        }
        return this.mIcon.h() + this.mIcon.g();
    }

    private static String typeToString(int i7) {
        switch (i7) {
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

    private static CarIcon forStandardType(int i7, CarColor carColor) {
        return new CarIcon(null, carColor, i7);
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}

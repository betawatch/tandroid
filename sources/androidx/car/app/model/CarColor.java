package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class CarColor {
    public static final int TYPE_BLUE = 6;
    public static final int TYPE_CUSTOM = 0;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_GREEN = 5;
    public static final int TYPE_PRIMARY = 2;
    public static final int TYPE_RED = 4;
    public static final int TYPE_SECONDARY = 3;
    public static final int TYPE_YELLOW = 7;
    private final int mColor;
    private final int mColorDark;
    private final int mType;
    public static final CarColor DEFAULT = create(1);
    public static final CarColor PRIMARY = create(2);
    public static final CarColor SECONDARY = create(3);
    public static final CarColor RED = create(4);
    public static final CarColor GREEN = create(5);
    public static final CarColor BLUE = create(6);
    public static final CarColor YELLOW = create(7);

    private CarColor() {
        this.mType = 1;
        this.mColor = 0;
        this.mColorDark = 0;
    }

    private static CarColor create(int i10) {
        return new CarColor(i10, 0, 0);
    }

    public static CarColor createCustom(int i10, int i11) {
        return new CarColor(0, i10, i11);
    }

    private static String typeToString(int i10) {
        switch (i10) {
            case 0:
                return "CUSTOM";
            case 1:
                return "DEFAULT";
            case 2:
                return "PRIMARY";
            case 3:
                return "SECONDARY";
            case 4:
                return "RED";
            case 5:
                return "GREEN";
            case 6:
                return "BLUE";
            case 7:
                return "YELLOW";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarColor)) {
            return false;
        }
        CarColor carColor = (CarColor) obj;
        return this.mColor == carColor.mColor && this.mColorDark == carColor.mColorDark && this.mType == carColor.mType;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getColorDark() {
        return this.mColorDark;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), Integer.valueOf(this.mColor), Integer.valueOf(this.mColorDark));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(typeToString(this.mType));
        sb.append(", color: ");
        sb.append(this.mColor);
        sb.append(", dark: ");
        return android.support.v4.media.a.m(this.mColorDark, "]", sb);
    }

    private CarColor(int i10, int i11, int i12) {
        this.mType = i10;
        this.mColor = i11;
        this.mColorDark = i12;
    }
}

package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan(CarIcon carIcon, int i9) {
        this.mIcon = carIcon;
        this.mAlignment = i9;
    }

    private static String alignmentToString(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? "unknown" : "center" : "baseline" : "bottom";
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[icon: ");
        sb2.append(this.mIcon);
        sb2.append(", alignment: ");
        return aa.d.r(sb2, alignmentToString(this.mAlignment), "]");
    }

    public static CarIconSpan create(CarIcon carIcon, int i9) {
        t.b.b.a(carIcon);
        if (i9 != 1 && i9 != 0 && i9 != 2) {
            throw new IllegalStateException(j3.r0.l(i9, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i9);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}

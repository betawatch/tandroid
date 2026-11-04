package androidx.car.app.model;

import j$.util.Objects;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan(CarIcon carIcon, int i3) {
        this.mIcon = carIcon;
        this.mAlignment = i3;
    }

    private static String alignmentToString(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? "unknown" : "center" : "baseline" : "bottom";
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
        return a1.g.s(sb2, alignmentToString(this.mAlignment), "]");
    }

    public static CarIconSpan create(CarIcon carIcon, int i3) {
        t.b.b.a(carIcon);
        if (i3 != 1 && i3 != 0 && i3 != 2) {
            throw new IllegalStateException(p1.i(i3, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i3);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}

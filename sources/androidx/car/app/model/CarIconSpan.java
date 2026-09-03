package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan(CarIcon carIcon, int i10) {
        this.mIcon = carIcon;
        this.mAlignment = i10;
    }

    private static String alignmentToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "center" : "baseline" : "bottom";
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
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return android.support.v4.media.a.r(sb, alignmentToString(this.mAlignment), "]");
    }

    public static CarIconSpan create(CarIcon carIcon, int i10) {
        t.b.b.a(carIcon);
        if (i10 != 1 && i10 != 0 && i10 != 2) {
            throw new IllegalStateException(kf.k0.j(i10, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i10);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}

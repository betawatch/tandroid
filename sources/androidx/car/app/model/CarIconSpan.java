package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan(CarIcon carIcon, int i7) {
        this.mIcon = carIcon;
        this.mAlignment = i7;
    }

    private static String alignmentToString(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "center" : "baseline" : "bottom";
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
        return a8.p0.s(sb2, alignmentToString(this.mAlignment), "]");
    }

    public static CarIconSpan create(CarIcon carIcon, int i7) {
        t.b.b.a(carIcon);
        if (i7 != 1 && i7 != 0 && i7 != 2) {
            throw new IllegalStateException(jg.g.j(i7, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i7);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}

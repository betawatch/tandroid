package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }

    public static ForegroundCarColorSpan create(CarColor carColor) {
        t.a aVar = t.a.b;
        aVar.getClass();
        if (aVar.a.contains(Integer.valueOf(carColor.getType()))) {
            return new ForegroundCarColorSpan(carColor);
        }
        throw new IllegalArgumentException("Car color type is not allowed: " + carColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForegroundCarColorSpan) {
            return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    public CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        return "[color: " + this.mCarColor + "]";
    }

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }
}

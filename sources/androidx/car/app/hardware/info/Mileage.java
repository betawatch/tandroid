package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.f;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public Mileage(f fVar) {
        fVar.getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerMeters(), mileage.getOdometerMeters()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getOdometerMeters() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getOdometerMeters(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}

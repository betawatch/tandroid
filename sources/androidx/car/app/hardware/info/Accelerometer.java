package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class Accelerometer {
    private final CarValue<List<Float>> mForces;

    public Accelerometer(CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mForces = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Accelerometer) {
            return Objects.equals(this.mForces, ((Accelerometer) obj).mForces);
        }
        return false;
    }

    public CarValue<List<Float>> getForces() {
        return this.mForces;
    }

    public int hashCode() {
        return Objects.hash(this.mForces);
    }

    public String toString() {
        return "[ forces: " + this.mForces + " ]";
    }

    private Accelerometer() {
        this.mForces = CarValue.UNKNOWN_FLOAT_LIST;
    }
}

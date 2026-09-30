package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

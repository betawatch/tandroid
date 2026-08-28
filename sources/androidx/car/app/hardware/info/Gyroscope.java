package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class Gyroscope {
    private final CarValue<List<Float>> mRotations;

    public Gyroscope(CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mRotations = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gyroscope) {
            return Objects.equals(this.mRotations, ((Gyroscope) obj).mRotations);
        }
        return false;
    }

    public CarValue<List<Float>> getRotations() {
        return this.mRotations;
    }

    public int hashCode() {
        return Objects.hash(this.mRotations);
    }

    public String toString() {
        return "[ rotations: " + this.mRotations + " ]";
    }

    private Gyroscope() {
        this.mRotations = CarValue.UNKNOWN_FLOAT_LIST;
    }
}

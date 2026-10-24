package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

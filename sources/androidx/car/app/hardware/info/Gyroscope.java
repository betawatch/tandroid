package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

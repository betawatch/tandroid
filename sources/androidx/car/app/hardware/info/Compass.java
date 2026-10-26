package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class Compass {
    private final CarValue<List<Float>> mOrientations;

    public Compass(CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mOrientations = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Compass) {
            return Objects.equals(this.mOrientations, ((Compass) obj).mOrientations);
        }
        return false;
    }

    public CarValue<List<Float>> getOrientations() {
        return this.mOrientations;
    }

    public int hashCode() {
        return Objects.hash(this.mOrientations);
    }

    public String toString() {
        return "[ orientations: " + this.mOrientations + " ]";
    }

    private Compass() {
        this.mOrientations = CarValue.UNKNOWN_FLOAT_LIST;
    }
}

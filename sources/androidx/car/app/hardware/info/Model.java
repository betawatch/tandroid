package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    public Model(g gVar) {
        gVar.getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public CarValue<String> getManufacturer() {
        CarValue<String> carValue = this.mManufacturer;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + "]";
    }

    private Model() {
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }
}

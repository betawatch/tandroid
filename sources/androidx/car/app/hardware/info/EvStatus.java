package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.e;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class EvStatus {
    private final CarValue<Boolean> mEvChargePortConnected;
    private final CarValue<Boolean> mEvChargePortOpen;

    public EvStatus(e eVar) {
        eVar.getClass();
        this.mEvChargePortConnected = null;
        this.mEvChargePortOpen = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public CarValue<Boolean> getEvChargePortConnected() {
        CarValue<Boolean> carValue = this.mEvChargePortConnected;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEvChargePortOpen() {
        CarValue<Boolean> carValue = this.mEvChargePortOpen;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + "]";
    }

    private EvStatus() {
        CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}

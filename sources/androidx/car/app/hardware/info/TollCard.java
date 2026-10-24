package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.k;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final CarValue<Integer> mCardState;

    public TollCard(k kVar) {
        kVar.getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TollCard) {
            return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
        }
        return false;
    }

    public CarValue<Integer> getCardState() {
        CarValue<Integer> carValue = this.mCardState;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mCardState);
    }

    public String toString() {
        return "[ tollcard state: " + this.mCardState + "]";
    }

    private TollCard() {
        this.mCardState = CarValue.UNKNOWN_INTEGER;
    }
}

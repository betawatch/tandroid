package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final CarValue<Integer> mCardState;

    public TollCard(sub subVar) {
        subVar.getClass();
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

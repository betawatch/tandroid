package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class Step {
    private final CarText mCue;
    private final List<Lane> mLanes;
    private final CarIcon mLanesImage;
    private final Maneuver mManeuver;
    private final CarText mRoad;

    public Step(Maneuver maneuver, List<Lane> list, CarIcon carIcon, CarText carText, CarText carText2) {
        this.mManeuver = maneuver;
        this.mLanes = androidx.car.app.utils.i.g(list);
        t.b.b.a(carIcon);
        this.mLanesImage = carIcon;
        this.mCue = carText;
        this.mRoad = carText2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad);
    }

    public CarText getCue() {
        return this.mCue;
    }

    public List<Lane> getLanes() {
        List<Lane> list = this.mLanes;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarIcon getLanesImage() {
        return this.mLanesImage;
    }

    public Maneuver getManeuver() {
        return this.mManeuver;
    }

    public CarText getRoad() {
        return this.mRoad;
    }

    public int hashCode() {
        return Objects.hash(this.mManeuver, this.mLanes, this.mLanesImage, this.mCue, this.mRoad);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[maneuver: ");
        sb2.append(this.mManeuver);
        sb2.append(", lane count: ");
        List<Lane> list = this.mLanes;
        sb2.append(list != null ? list.size() : 0);
        sb2.append(", lanes image: ");
        sb2.append(this.mLanesImage);
        sb2.append(", cue: ");
        sb2.append(CarText.toShortString(this.mCue));
        sb2.append(", road: ");
        sb2.append(CarText.toShortString(this.mRoad));
        sb2.append("]");
        return sb2.toString();
    }

    private Step() {
        this.mManeuver = null;
        this.mLanes = Collections.EMPTY_LIST;
        this.mLanesImage = null;
        this.mCue = null;
        this.mRoad = null;
    }
}

package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final g mPanModeDelegate;

    public MapController(b bVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public g getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}

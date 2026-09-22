package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

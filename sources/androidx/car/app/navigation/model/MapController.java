package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final wx7 mPanModeDelegate;

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
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

    public wx7 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    public MapController(ek6 ek6Var) {
        throw null;
    }
}

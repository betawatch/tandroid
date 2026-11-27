package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class MapTemplate implements kkb {
    private final ActionStrip mActionStrip;
    private final Header mHeader;
    private final ItemList mItemList;
    private final MapController mMapController;
    private final Pane mPane;

    private MapTemplate() {
        this.mMapController = null;
        this.mPane = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public Pane getPane() {
        return this.mPane;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mPane, this.mItemList, this.mHeader, this.mActionStrip);
    }

    public MapTemplate(lk6 lk6Var) {
        throw null;
    }
}

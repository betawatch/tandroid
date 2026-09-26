package androidx.car.app.model;

import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class r {
    public final ArrayList a;
    public final int b;
    public final h0 c;
    public final f0 d;
    public final CarText e;

    public r(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}

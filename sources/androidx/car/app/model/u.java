package androidx.car.app.model;

import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class u {
    public final boolean a;
    public final ItemList b;
    public final ArrayList c;
    public final CarText d;
    public final Action e;
    public final ActionStrip f;
    public final ArrayList g;

    public u(ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.g = new ArrayList(listTemplate.getActions());
    }
}

package androidx.car.app.model;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

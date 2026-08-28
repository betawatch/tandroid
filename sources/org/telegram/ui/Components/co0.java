package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class co0 implements ib {
    public final /* synthetic */ gc a;
    public final /* synthetic */ ve b;

    public co0(ve veVar, gc gcVar) {
        this.b = veVar;
        this.a = gcVar;
    }

    @Override // org.telegram.ui.Components.ib
    public final void c() {
        this.b.G.remove(this.a);
    }

    @Override // org.telegram.ui.Components.ib
    public final void d() {
        this.b.G.add(this.a);
    }

    @Override // org.telegram.ui.Components.ib
    public final /* synthetic */ void a(gc gcVar) {
    }

    @Override // org.telegram.ui.Components.ib
    public final /* synthetic */ void b() {
    }
}

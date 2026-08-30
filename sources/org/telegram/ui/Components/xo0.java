package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xo0 implements ib {
    public final /* synthetic */ ic a;
    public final /* synthetic */ ve b;

    public xo0(ve veVar, ic icVar) {
        this.b = veVar;
        this.a = icVar;
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
    public final /* synthetic */ void a(ic icVar) {
    }

    @Override // org.telegram.ui.Components.ib
    public final /* synthetic */ void b() {
    }
}

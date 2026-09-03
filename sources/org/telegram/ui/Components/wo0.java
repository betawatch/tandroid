package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wo0 implements ib {
    public final /* synthetic */ ic a;
    public final /* synthetic */ ve b;

    public wo0(ve veVar, ic icVar) {
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

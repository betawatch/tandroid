package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cn0 implements cb {
    public final /* synthetic */ ac a;
    public final /* synthetic */ le b;

    public cn0(le leVar, ac acVar) {
        this.b = leVar;
        this.a = acVar;
    }

    @Override // org.telegram.ui.Components.cb
    public final void a() {
        this.b.G.add(this.a);
    }

    @Override // org.telegram.ui.Components.cb
    public final void b() {
        this.b.G.remove(this.a);
    }

    @Override // org.telegram.ui.Components.cb
    public final /* synthetic */ void c(ac acVar) {
    }

    @Override // org.telegram.ui.Components.cb
    public final /* synthetic */ void d() {
    }
}

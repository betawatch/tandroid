package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class np0 implements sb {
    public final /* synthetic */ rc a;
    public final /* synthetic */ gf b;

    public np0(gf gfVar, rc rcVar) {
        this.b = gfVar;
        this.a = rcVar;
    }

    @Override // org.telegram.ui.Components.sb
    public final void c() {
        this.b.G.remove(this.a);
    }

    @Override // org.telegram.ui.Components.sb
    public final void d() {
        this.b.G.add(this.a);
    }

    @Override // org.telegram.ui.Components.sb
    public final /* synthetic */ void a(rc rcVar) {
    }

    @Override // org.telegram.ui.Components.sb
    public final /* synthetic */ void b() {
    }
}

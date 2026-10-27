package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ec1 implements mc1 {
    public boolean a;
    public final /* synthetic */ wn b;

    public ec1(wn wnVar, boolean z10) {
        this.b = wnVar;
        this.a = z10;
    }

    @Override // org.telegram.ui.mc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.mc1
    public final boolean a() {
        return this.a;
    }

    @Override // org.telegram.ui.mc1
    public final void j1(boolean z10) {
        boolean z11 = !this.a;
        this.a = z11;
        un unVar = this.b.ua;
        unVar.q(unVar.f, unVar.g, z10, Boolean.valueOf(z11), false);
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sn0 extends s4.o {
    public final /* synthetic */ wn0 b;

    public sn0(wn0 wn0Var) {
        this.b = wn0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        wn0 wn0Var = this.b;
        return ((tn0) wn0Var.n.get(i10)).equals(wn0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        wn0 wn0Var = this.b;
        return ((tn0) wn0Var.n.get(i10)).a.h == ((tn0) wn0Var.r.get(i11)).a.h;
    }

    @Override // s4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.n.size();
    }
}

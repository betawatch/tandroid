package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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

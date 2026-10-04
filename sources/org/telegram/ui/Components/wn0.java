package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class wn0 extends s4.o {
    public final /* synthetic */ ao0 b;

    public wn0(ao0 ao0Var) {
        this.b = ao0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        ao0 ao0Var = this.b;
        return ((xn0) ao0Var.n.get(i10)).equals(ao0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ao0 ao0Var = this.b;
        return ((xn0) ao0Var.n.get(i10)).a.h == ((xn0) ao0Var.r.get(i11)).a.h;
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

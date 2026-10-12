package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class go0 extends s4.o {
    public final /* synthetic */ ko0 b;

    public go0(ko0 ko0Var) {
        this.b = ko0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        ko0 ko0Var = this.b;
        return ((ho0) ko0Var.n.get(i10)).equals(ko0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ko0 ko0Var = this.b;
        return ((ho0) ko0Var.n.get(i10)).a.h == ((ho0) ko0Var.r.get(i11)).a.h;
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

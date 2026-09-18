package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class rn0 extends s4.o {
    public final /* synthetic */ vn0 b;

    public rn0(vn0 vn0Var) {
        this.b = vn0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        vn0 vn0Var = this.b;
        return ((sn0) vn0Var.n.get(i10)).equals(vn0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        vn0 vn0Var = this.b;
        return ((sn0) vn0Var.n.get(i10)).a.h == ((sn0) vn0Var.r.get(i11)).a.h;
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

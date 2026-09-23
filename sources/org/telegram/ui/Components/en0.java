package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class en0 extends s4.o {
    public final /* synthetic */ in0 b;

    public en0(in0 in0Var) {
        this.b = in0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        in0 in0Var = this.b;
        return ((fn0) in0Var.n.get(i10)).equals(in0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        in0 in0Var = this.b;
        return ((fn0) in0Var.n.get(i10)).a.h == ((fn0) in0Var.r.get(i11)).a.h;
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

package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ml0 extends v4.o {
    public final /* synthetic */ ql0 b;

    public ml0(ql0 ql0Var) {
        this.b = ql0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        ql0 ql0Var = this.b;
        return ((nl0) ql0Var.n.get(i7)).equals(ql0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        ql0 ql0Var = this.b;
        return ((nl0) ql0Var.n.get(i7)).a.h == ((nl0) ql0Var.r.get(i10)).a.h;
    }

    @Override // v4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // v4.o
    public final int e() {
        return this.b.n.size();
    }
}

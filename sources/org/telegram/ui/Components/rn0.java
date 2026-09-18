package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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

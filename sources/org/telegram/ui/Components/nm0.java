package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nm0 extends s4.n {
    public final /* synthetic */ rm0 b;

    public nm0(rm0 rm0Var) {
        this.b = rm0Var;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        rm0 rm0Var = this.b;
        return ((om0) rm0Var.n.get(i10)).equals(rm0Var.r.get(i11));
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        rm0 rm0Var = this.b;
        return ((om0) rm0Var.n.get(i10)).a.h == ((om0) rm0Var.r.get(i11)).a.h;
    }

    @Override // s4.n
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.n
    public final int e() {
        return this.b.n.size();
    }
}

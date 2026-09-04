package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class cs0 extends s4.s0 {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ ur0 b;
    public final /* synthetic */ xu0 c;

    public cs0(xu0 xu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.c = xu0Var;
        this.a = tr0Var;
        this.b = ur0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xu0 xu0Var = this.c;
        mu0[] mu0VarArr = xu0Var.t1;
        ur0 ur0Var = this.b;
        tr0 tr0Var = this.a;
        xu0Var.G(tr0Var, (ll0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = xu0Var.k0[0].F) == 0 || i13 == 5)) {
            mu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = tr0Var.F) == 0 || xu0.p0(i12))) {
            xu0.q(tr0Var, mu0VarArr, true);
        }
        tr0Var.h.K0(true);
        if (tr0Var.G != null) {
            tr0Var.invalidate();
        }
        xu0Var.o0();
    }
}

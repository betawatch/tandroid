package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jr0 extends s4.s0 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ br0 b;
    public final /* synthetic */ zt0 c;

    public jr0(zt0 zt0Var, ar0 ar0Var, br0 br0Var) {
        this.c = zt0Var;
        this.a = ar0Var;
        this.b = br0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.d1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zt0 zt0Var = this.c;
        ot0[] ot0VarArr = zt0Var.v1;
        br0 br0Var = this.b;
        ar0 ar0Var = this.a;
        zt0Var.N(ar0Var, (tk0) recyclerView, br0Var);
        if (i11 != 0 && ((i13 = zt0Var.m0[0].E) == 0 || i13 == 5)) {
            ot0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ar0Var.E) == 0 || zt0.x0(i12))) {
            zt0.p(ar0Var, ot0VarArr, true);
        }
        ar0Var.h.L0(true);
        if (ar0Var.F != null) {
            ar0Var.invalidate();
        }
    }
}

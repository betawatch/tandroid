package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class us0 extends s4.s0 {
    public final /* synthetic */ ls0 a;
    public final /* synthetic */ ms0 b;
    public final /* synthetic */ pv0 c;

    public us0(pv0 pv0Var, ls0 ls0Var, ms0 ms0Var) {
        this.c = pv0Var;
        this.a = ls0Var;
        this.b = ms0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        pv0 pv0Var = this.c;
        ev0[] ev0VarArr = pv0Var.t1;
        ms0 ms0Var = this.b;
        ls0 ls0Var = this.a;
        pv0Var.G(ls0Var, (zl0) recyclerView, ms0Var);
        if (i11 != 0 && ((i13 = pv0Var.k0[0].F) == 0 || i13 == 5)) {
            ev0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ls0Var.F) == 0 || pv0.p0(i12))) {
            pv0.q(ls0Var, ev0VarArr, true);
        }
        ls0Var.h.M0(true);
        if (ls0Var.G != null) {
            ls0Var.invalidate();
        }
        pv0Var.o0();
    }
}

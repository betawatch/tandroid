package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ys0 extends s4.r0 {
    public final /* synthetic */ ps0 a;
    public final /* synthetic */ qs0 b;
    public final /* synthetic */ tv0 c;

    public ys0(tv0 tv0Var, ps0 ps0Var, qs0 qs0Var) {
        this.c = tv0Var;
        this.a = ps0Var;
        this.b = qs0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        tv0 tv0Var = this.c;
        iv0[] iv0VarArr = tv0Var.t1;
        qs0 qs0Var = this.b;
        ps0 ps0Var = this.a;
        tv0Var.G(ps0Var, (im0) recyclerView, qs0Var);
        if (i11 != 0 && ((i13 = tv0Var.k0[0].F) == 0 || i13 == 5)) {
            iv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ps0Var.F) == 0 || tv0.q0(i12))) {
            tv0.r(ps0Var, iv0VarArr, true);
        }
        ps0Var.h.L0(true);
        if (ps0Var.G != null) {
            ps0Var.invalidate();
        }
        tv0Var.p0();
    }
}

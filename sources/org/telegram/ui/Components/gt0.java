package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gt0 extends s4.t0 {
    public final /* synthetic */ xs0 a;
    public final /* synthetic */ ys0 b;
    public final /* synthetic */ bw0 c;

    public gt0(bw0 bw0Var, xs0 xs0Var, ys0 ys0Var) {
        this.c = bw0Var;
        this.a = xs0Var;
        this.b = ys0Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        bw0 bw0Var = this.c;
        qv0[] qv0VarArr = bw0Var.t1;
        ys0 ys0Var = this.b;
        xs0 xs0Var = this.a;
        bw0Var.G(xs0Var, (qm0) recyclerView, ys0Var);
        if (i11 != 0 && ((i13 = bw0Var.k0[0].F) == 0 || i13 == 5)) {
            qv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = xs0Var.F) == 0 || bw0.p0(i12))) {
            bw0.q(xs0Var, qv0VarArr, true);
        }
        xs0Var.h.L0(true);
        if (xs0Var.G != null) {
            xs0Var.invalidate();
        }
        bw0Var.o0();
    }
}

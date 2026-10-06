package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class vs0 extends s4.s0 {
    public final /* synthetic */ ms0 a;
    public final /* synthetic */ ns0 b;
    public final /* synthetic */ qv0 c;

    public vs0(qv0 qv0Var, ms0 ms0Var, ns0 ns0Var) {
        this.c = qv0Var;
        this.a = ms0Var;
        this.b = ns0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        qv0 qv0Var = this.c;
        fv0[] fv0VarArr = qv0Var.t1;
        ns0 ns0Var = this.b;
        ms0 ms0Var = this.a;
        qv0Var.G(ms0Var, (zl0) recyclerView, ns0Var);
        if (i11 != 0 && ((i13 = qv0Var.k0[0].F) == 0 || i13 == 5)) {
            fv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ms0Var.F) == 0 || qv0.p0(i12))) {
            qv0.q(ms0Var, fv0VarArr, true);
        }
        ms0Var.h.M0(true);
        if (ms0Var.G != null) {
            ms0Var.invalidate();
        }
        qv0Var.o0();
    }
}

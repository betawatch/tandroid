package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ct0 extends s4.r0 {
    public final /* synthetic */ ts0 a;
    public final /* synthetic */ us0 b;
    public final /* synthetic */ xv0 c;

    public ct0(xv0 xv0Var, ts0 ts0Var, us0 us0Var) {
        this.c = xv0Var;
        this.a = ts0Var;
        this.b = us0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        xv0 xv0Var = this.c;
        mv0[] mv0VarArr = xv0Var.t1;
        us0 us0Var = this.b;
        ts0 ts0Var = this.a;
        xv0Var.G(ts0Var, (mm0) recyclerView, us0Var);
        if (i11 != 0 && ((i13 = xv0Var.k0[0].F) == 0 || i13 == 5)) {
            mv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ts0Var.F) == 0 || xv0.p0(i12))) {
            xv0.q(ts0Var, mv0VarArr, true);
        }
        ts0Var.h.L0(true);
        if (ts0Var.G != null) {
            ts0Var.invalidate();
        }
        xv0Var.o0();
    }
}

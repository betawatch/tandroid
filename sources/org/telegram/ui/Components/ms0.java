package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ms0 extends s4.s0 {
    public final /* synthetic */ ds0 a;
    public final /* synthetic */ es0 b;
    public final /* synthetic */ iv0 c;

    public ms0(iv0 iv0Var, ds0 ds0Var, es0 es0Var) {
        this.c = iv0Var;
        this.a = ds0Var;
        this.b = es0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        iv0 iv0Var = this.c;
        xu0[] xu0VarArr = iv0Var.t1;
        es0 es0Var = this.b;
        ds0 ds0Var = this.a;
        iv0Var.G(ds0Var, (vl0) recyclerView, es0Var);
        if (i11 != 0 && ((i13 = iv0Var.k0[0].F) == 0 || i13 == 5)) {
            xu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ds0Var.F) == 0 || iv0.p0(i12))) {
            iv0.q(ds0Var, xu0VarArr, true);
        }
        ds0Var.h.K0(true);
        if (ds0Var.G != null) {
            ds0Var.invalidate();
        }
        iv0Var.o0();
    }
}

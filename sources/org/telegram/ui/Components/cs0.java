package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cs0 extends f2.z0 {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ ur0 b;
    public final /* synthetic */ yu0 c;

    public cs0(yu0 yu0Var, tr0 tr0Var, ur0 ur0Var) {
        this.c = yu0Var;
        this.a = tr0Var;
        this.b = ur0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.Y0 = i10 != 0;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        yu0 yu0Var = this.c;
        nu0[] nu0VarArr = yu0Var.q1;
        ur0 ur0Var = this.b;
        tr0 tr0Var = this.a;
        yu0Var.G(tr0Var, (sl0) recyclerView, ur0Var);
        if (i11 != 0 && ((i13 = yu0Var.h0[0].C) == 0 || i13 == 5)) {
            nu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = tr0Var.C) == 0 || yu0.p0(i12))) {
            yu0.q(tr0Var, nu0VarArr, true);
        }
        tr0Var.h.K0(true);
        if (tr0Var.D != null) {
            tr0Var.invalidate();
        }
        yu0Var.o0();
    }
}

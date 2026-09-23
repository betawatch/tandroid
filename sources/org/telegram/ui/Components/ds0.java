package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ds0 extends s4.s0 {
    public final /* synthetic */ ur0 a;
    public final /* synthetic */ vr0 b;
    public final /* synthetic */ yu0 c;

    public ds0(yu0 yu0Var, ur0 ur0Var, vr0 vr0Var) {
        this.c = yu0Var;
        this.a = ur0Var;
        this.b = vr0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        yu0 yu0Var = this.c;
        nu0[] nu0VarArr = yu0Var.t1;
        vr0 vr0Var = this.b;
        ur0 ur0Var = this.a;
        yu0Var.G(ur0Var, (ml0) recyclerView, vr0Var);
        if (i11 != 0 && ((i13 = yu0Var.k0[0].F) == 0 || i13 == 5)) {
            nu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ur0Var.F) == 0 || yu0.p0(i12))) {
            yu0.q(ur0Var, nu0VarArr, true);
        }
        ur0Var.h.L0(true);
        if (ur0Var.G != null) {
            ur0Var.invalidate();
        }
        yu0Var.o0();
    }
}

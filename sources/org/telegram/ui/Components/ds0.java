package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ds0 extends f2.a1 {
    public final /* synthetic */ ur0 a;
    public final /* synthetic */ vr0 b;
    public final /* synthetic */ zu0 c;

    public ds0(zu0 zu0Var, ur0 ur0Var, vr0 vr0Var) {
        this.c = zu0Var;
        this.a = ur0Var;
        this.b = vr0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.Y0 = i10 != 0;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zu0 zu0Var = this.c;
        ou0[] ou0VarArr = zu0Var.q1;
        vr0 vr0Var = this.b;
        ur0 ur0Var = this.a;
        zu0Var.G(ur0Var, (tl0) recyclerView, vr0Var);
        if (i11 != 0 && ((i13 = zu0Var.h0[0].C) == 0 || i13 == 5)) {
            ou0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = ur0Var.C) == 0 || zu0.p0(i12))) {
            zu0.q(ur0Var, ou0VarArr, true);
        }
        ur0Var.h.K0(true);
        if (ur0Var.D != null) {
            ur0Var.invalidate();
        }
        zu0Var.o0();
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ur0 extends f2.a1 {
    public final /* synthetic */ lr0 a;
    public final /* synthetic */ mr0 b;
    public final /* synthetic */ qu0 c;

    public ur0(qu0 qu0Var, lr0 lr0Var, mr0 mr0Var) {
        this.c = qu0Var;
        this.a = lr0Var;
        this.b = mr0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.X0 = i10 != 0;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        qu0 qu0Var = this.c;
        fu0[] fu0VarArr = qu0Var.p1;
        mr0 mr0Var = this.b;
        lr0 lr0Var = this.a;
        qu0Var.G(lr0Var, (jl0) recyclerView, mr0Var);
        if (i11 != 0 && ((i13 = qu0Var.g0[0].B) == 0 || i13 == 5)) {
            fu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = lr0Var.B) == 0 || qu0.p0(i12))) {
            qu0.q(lr0Var, fu0VarArr, true);
        }
        lr0Var.h.K0(true);
        if (lr0Var.C != null) {
            lr0Var.invalidate();
        }
        qu0Var.o0();
    }
}

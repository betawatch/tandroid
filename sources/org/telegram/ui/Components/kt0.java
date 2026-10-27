package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kt0 extends s4.u0 {
    public final /* synthetic */ bt0 a;
    public final /* synthetic */ ct0 b;
    public final /* synthetic */ bw0 c;

    public kt0(bw0 bw0Var, bt0 bt0Var, ct0 ct0Var) {
        this.c = bw0Var;
        this.a = bt0Var;
        this.b = ct0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.d1 = i10 != 0;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        bw0 bw0Var = this.c;
        qv0[] qv0VarArr = bw0Var.v1;
        ct0 ct0Var = this.b;
        bt0 bt0Var = this.a;
        bw0Var.M(bt0Var, (nm0) recyclerView, ct0Var);
        if (i11 != 0 && ((i13 = bw0Var.m0[0].E) == 0 || i13 == 5)) {
            qv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = bt0Var.E) == 0 || bw0.w0(i12))) {
            bw0.t(bt0Var, qv0VarArr, true);
        }
        bt0Var.h.L0(true);
        if (bt0Var.F != null) {
            bt0Var.invalidate();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kq0 extends v4.t0 {
    public final /* synthetic */ aq0 a;
    public final /* synthetic */ bq0 b;
    public final /* synthetic */ ys0 c;

    public kq0(ys0 ys0Var, aq0 aq0Var, bq0 bq0Var) {
        this.c = ys0Var;
        this.a = aq0Var;
        this.b = bq0Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.e1 = i7 != 0;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        ys0 ys0Var = this.c;
        ns0[] ns0VarArr = ys0Var.w1;
        bq0 bq0Var = this.b;
        aq0 aq0Var = this.a;
        ys0Var.O(aq0Var, (uj0) recyclerView, bq0Var);
        if (i10 != 0 && ((i12 = ys0Var.n0[0].F) == 0 || i12 == 5)) {
            ns0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = aq0Var.F) == 0 || ys0.z0(i11))) {
            ys0.s(aq0Var, ns0VarArr, true);
        }
        aq0Var.h.L0(true);
        if (aq0Var.G != null) {
            aq0Var.invalidate();
        }
    }
}

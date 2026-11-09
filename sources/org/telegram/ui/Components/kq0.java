package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kq0 extends v4.s0 {
    public final /* synthetic */ aq0 a;
    public final /* synthetic */ bq0 b;
    public final /* synthetic */ zs0 c;

    public kq0(zs0 zs0Var, aq0 aq0Var, bq0 bq0Var) {
        this.c = zs0Var;
        this.a = aq0Var;
        this.b = bq0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.d1 = i7 != 0;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        zs0 zs0Var = this.c;
        os0[] os0VarArr = zs0Var.v1;
        bq0 bq0Var = this.b;
        aq0 aq0Var = this.a;
        zs0Var.O(aq0Var, (qj0) recyclerView, bq0Var);
        if (i10 != 0 && ((i12 = zs0Var.m0[0].E) == 0 || i12 == 5)) {
            os0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = aq0Var.E) == 0 || zs0.z0(i11))) {
            zs0.s(aq0Var, os0VarArr, true);
        }
        aq0Var.h.L0(true);
        if (aq0Var.F != null) {
            aq0Var.invalidate();
        }
    }
}

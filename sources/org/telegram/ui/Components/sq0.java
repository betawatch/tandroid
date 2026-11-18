package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sq0 extends v4.u0 {
    public final /* synthetic */ iq0 a;
    public final /* synthetic */ jq0 b;
    public final /* synthetic */ gt0 c;

    public sq0(gt0 gt0Var, iq0 iq0Var, jq0 jq0Var) {
        this.c = gt0Var;
        this.a = iq0Var;
        this.b = jq0Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.e1 = i7 != 0;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        gt0 gt0Var = this.c;
        vs0[] vs0VarArr = gt0Var.w1;
        jq0 jq0Var = this.b;
        iq0 iq0Var = this.a;
        gt0Var.O(iq0Var, (ck0) recyclerView, jq0Var);
        if (i10 != 0 && ((i12 = gt0Var.n0[0].F) == 0 || i12 == 5)) {
            vs0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = iq0Var.F) == 0 || gt0.z0(i11))) {
            gt0.s(iq0Var, vs0VarArr, true);
        }
        iq0Var.h.L0(true);
        if (iq0Var.G != null) {
            iq0Var.invalidate();
        }
    }
}

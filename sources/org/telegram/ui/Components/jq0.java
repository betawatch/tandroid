package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jq0 extends v4.s0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ aq0 b;
    public final /* synthetic */ ys0 c;

    public jq0(ys0 ys0Var, zp0 zp0Var, aq0 aq0Var) {
        this.c = ys0Var;
        this.a = zp0Var;
        this.b = aq0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.d1 = i7 != 0;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        ys0 ys0Var = this.c;
        ns0[] ns0VarArr = ys0Var.v1;
        aq0 aq0Var = this.b;
        zp0 zp0Var = this.a;
        ys0Var.O(zp0Var, (pj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = ys0Var.m0[0].E) == 0 || i12 == 5)) {
            ns0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.E) == 0 || ys0.z0(i11))) {
            ys0.s(zp0Var, ns0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.F != null) {
            zp0Var.invalidate();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iq0 extends u4.t0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ aq0 b;
    public final /* synthetic */ ws0 c;

    public iq0(ws0 ws0Var, zp0 zp0Var, aq0 aq0Var) {
        this.c = ws0Var;
        this.a = zp0Var;
        this.b = aq0Var;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        this.c.e1 = i3 != 0;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11;
        int i12;
        ws0 ws0Var = this.c;
        ls0[] ls0VarArr = ws0Var.w1;
        aq0 aq0Var = this.b;
        zp0 zp0Var = this.a;
        ws0Var.O(zp0Var, (tj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = ws0Var.n0[0].F) == 0 || i12 == 5)) {
            ls0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.F) == 0 || ws0.z0(i11))) {
            ws0.s(zp0Var, ls0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.G != null) {
            zp0Var.invalidate();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kr0 extends s4.s0 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ cr0 b;
    public final /* synthetic */ au0 c;

    public kr0(au0 au0Var, br0 br0Var, cr0 cr0Var) {
        this.c = au0Var;
        this.a = br0Var;
        this.b = cr0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.d1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        au0 au0Var = this.c;
        pt0[] pt0VarArr = au0Var.v1;
        cr0 cr0Var = this.b;
        br0 br0Var = this.a;
        au0Var.N(br0Var, (uk0) recyclerView, cr0Var);
        if (i11 != 0 && ((i13 = au0Var.m0[0].E) == 0 || i13 == 5)) {
            pt0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = br0Var.E) == 0 || au0.y0(i12))) {
            au0.p(br0Var, pt0VarArr, true);
        }
        br0Var.h.L0(true);
        if (br0Var.F != null) {
            br0Var.invalidate();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kr0 extends f2.b1 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ cr0 b;
    public final /* synthetic */ hu0 c;

    public kr0(hu0 hu0Var, br0 br0Var, cr0 cr0Var) {
        this.c = hu0Var;
        this.a = br0Var;
        this.b = cr0Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.X0 = i10 != 0;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        hu0 hu0Var = this.c;
        wt0[] wt0VarArr = hu0Var.p1;
        cr0 cr0Var = this.b;
        br0 br0Var = this.a;
        hu0Var.G(br0Var, (zk0) recyclerView, cr0Var);
        if (i11 != 0 && ((i13 = hu0Var.g0[0].B) == 0 || i13 == 5)) {
            wt0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = br0Var.B) == 0 || hu0.p0(i12))) {
            hu0.q(br0Var, wt0VarArr, true);
        }
        br0Var.h.K0(true);
        if (br0Var.C != null) {
            br0Var.invalidate();
        }
        hu0Var.o0();
    }
}

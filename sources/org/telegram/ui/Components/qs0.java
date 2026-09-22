package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qs0 extends s4.s0 {
    public final /* synthetic */ hs0 a;
    public final /* synthetic */ is0 b;
    public final /* synthetic */ lv0 c;

    public qs0(lv0 lv0Var, hs0 hs0Var, is0 is0Var) {
        this.c = lv0Var;
        this.a = hs0Var;
        this.b = is0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        lv0 lv0Var = this.c;
        av0[] av0VarArr = lv0Var.t1;
        is0 is0Var = this.b;
        hs0 hs0Var = this.a;
        lv0Var.G(hs0Var, (yl0) recyclerView, is0Var);
        if (i11 != 0 && ((i13 = lv0Var.k0[0].F) == 0 || i13 == 5)) {
            av0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = hs0Var.F) == 0 || lv0.p0(i12))) {
            lv0.q(hs0Var, av0VarArr, true);
        }
        hs0Var.h.M0(true);
        if (hs0Var.G != null) {
            hs0Var.invalidate();
        }
        lv0Var.o0();
    }
}

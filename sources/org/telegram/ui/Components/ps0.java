package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ps0 extends s4.s0 {
    public final /* synthetic */ gs0 a;
    public final /* synthetic */ hs0 b;
    public final /* synthetic */ kv0 c;

    public ps0(kv0 kv0Var, gs0 gs0Var, hs0 hs0Var) {
        this.c = kv0Var;
        this.a = gs0Var;
        this.b = hs0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        kv0 kv0Var = this.c;
        zu0[] zu0VarArr = kv0Var.t1;
        hs0 hs0Var = this.b;
        gs0 gs0Var = this.a;
        kv0Var.G(gs0Var, (wl0) recyclerView, hs0Var);
        if (i11 != 0 && ((i13 = kv0Var.k0[0].F) == 0 || i13 == 5)) {
            zu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = gs0Var.F) == 0 || kv0.p0(i12))) {
            kv0.q(gs0Var, zu0VarArr, true);
        }
        gs0Var.h.M0(true);
        if (gs0Var.G != null) {
            gs0Var.invalidate();
        }
        kv0Var.o0();
    }
}

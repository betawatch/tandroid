package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q50 extends s4.s0 {
    public final /* synthetic */ s4.a0 a;
    public final /* synthetic */ c60 b;

    public q50(c60 c60Var, s4.a0 a0Var) {
        this.b = c60Var;
        this.a = a0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c60 c60Var = this.b;
        c60.I0(c60Var);
        if (!c60Var.I1 || c60Var.H1) {
            return;
        }
        if (c60Var.J1 - this.a.N0() < 10) {
            c60Var.K0();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class o60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ a70 b;

    public o60(a70 a70Var, s4.c0 c0Var) {
        this.b = a70Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        a70 a70Var = this.b;
        a70.O(a70Var);
        if (!a70Var.R || a70Var.Q) {
            return;
        }
        if (a70Var.S - this.a.N0() < 10) {
            a70Var.X();
        }
    }
}

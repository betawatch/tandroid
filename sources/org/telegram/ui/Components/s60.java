package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class s60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ e70 b;

    public s60(e70 e70Var, s4.c0 c0Var) {
        this.b = e70Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e70 e70Var = this.b;
        e70.O(e70Var);
        if (!e70Var.R || e70Var.Q) {
            return;
        }
        if (e70Var.S - this.a.N0() < 10) {
            e70Var.X();
        }
    }
}

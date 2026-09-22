package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ c70 b;

    public q60(c70 c70Var, s4.c0 c0Var) {
        this.b = c70Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c70 c70Var = this.b;
        c70.O(c70Var);
        if (!c70Var.R || c70Var.Q) {
            return;
        }
        if (c70Var.S - this.a.N0() < 10) {
            c70Var.X();
        }
    }
}

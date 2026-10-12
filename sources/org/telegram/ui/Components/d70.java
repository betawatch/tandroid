package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d70 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ p70 b;

    public d70(p70 p70Var, s4.b0 b0Var) {
        this.b = p70Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p70 p70Var = this.b;
        p70.P(p70Var);
        if (!p70Var.R || p70Var.Q) {
            return;
        }
        if (p70Var.S - this.a.N0() < 10) {
            p70Var.Y();
        }
    }
}

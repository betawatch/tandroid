package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b50 extends v4.s0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ n50 b;

    public b50(n50 n50Var, v4.b0 b0Var) {
        this.b = n50Var;
        this.a = b0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n50 n50Var = this.b;
        n50.I0(n50Var);
        if (!n50Var.I1 || n50Var.H1) {
            return;
        }
        if (n50Var.J1 - this.a.N0() < 10) {
            n50Var.K0();
        }
    }
}

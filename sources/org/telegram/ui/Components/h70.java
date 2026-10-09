package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h70 extends s4.t0 {
    public final /* synthetic */ s4.d0 a;
    public final /* synthetic */ t70 b;

    public h70(t70 t70Var, s4.d0 d0Var) {
        this.b = t70Var;
        this.a = d0Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t70 t70Var = this.b;
        t70.P(t70Var);
        if (!t70Var.R || t70Var.Q) {
            return;
        }
        if (t70Var.S - this.a.N0() < 10) {
            t70Var.Y();
        }
    }
}

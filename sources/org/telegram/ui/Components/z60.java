package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class z60 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ l70 b;

    public z60(l70 l70Var, s4.b0 b0Var) {
        this.b = l70Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l70 l70Var = this.b;
        l70.P(l70Var);
        if (!l70Var.R || l70Var.Q) {
            return;
        }
        if (l70Var.S - this.a.N0() < 10) {
            l70Var.Y();
        }
    }
}

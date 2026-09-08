package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ r60 b;

    public f60(r60 r60Var, s4.c0 c0Var) {
        this.b = r60Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r60 r60Var = this.b;
        r60.O(r60Var);
        if (!r60Var.R || r60Var.Q) {
            return;
        }
        if (r60Var.S - this.a.N0() < 10) {
            r60Var.X();
        }
    }
}

package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ s60 b;

    public g60(s60 s60Var, s4.c0 c0Var) {
        this.b = s60Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s60 s60Var = this.b;
        s60.O(s60Var);
        if (!s60Var.R || s60Var.Q) {
            return;
        }
        if (s60Var.S - this.a.N0() < 10) {
            s60Var.X();
        }
    }
}

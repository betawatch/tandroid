package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class l50 extends v4.u0 {
    public final /* synthetic */ v4.c0 a;
    public final /* synthetic */ x50 b;

    public l50(x50 x50Var, v4.c0 c0Var) {
        this.b = x50Var;
        this.a = c0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        x50 x50Var = this.b;
        x50.J0(x50Var);
        if (!x50Var.M1 || x50Var.L1) {
            return;
        }
        if (x50Var.N1 - this.a.N0() < 10) {
            x50Var.L0();
        }
    }
}

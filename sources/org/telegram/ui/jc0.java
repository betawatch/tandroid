package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jc0 extends s4.r0 {
    public final /* synthetic */ sc0 a;

    public jc0(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        sc0 sc0Var = this.a;
        sc0Var.Q = z10;
        if (z10 || sc0Var.L == null) {
            return;
        }
        sc0Var.L = null;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sc0 sc0Var = this.a;
        sc0Var.A0(false);
        if (sc0Var.L != null) {
            sc0Var.N += i11;
        }
    }
}

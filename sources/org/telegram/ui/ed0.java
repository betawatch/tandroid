package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ed0 extends s4.r0 {
    public final /* synthetic */ nd0 a;

    public ed0(nd0 nd0Var) {
        this.a = nd0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        nd0 nd0Var = this.a;
        nd0Var.Q = z10;
        if (z10 || nd0Var.L == null) {
            return;
        }
        nd0Var.L = null;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nd0 nd0Var = this.a;
        nd0Var.z0(false);
        if (nd0Var.L != null) {
            nd0Var.N += i11;
        }
    }
}

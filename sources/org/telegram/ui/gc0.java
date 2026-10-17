package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class gc0 extends s4.r0 {
    public final /* synthetic */ pc0 a;

    public gc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        pc0 pc0Var = this.a;
        pc0Var.Q = z10;
        if (z10 || pc0Var.L == null) {
            return;
        }
        pc0Var.L = null;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        pc0 pc0Var = this.a;
        pc0Var.z0(false);
        if (pc0Var.L != null) {
            pc0Var.N += i11;
        }
    }
}

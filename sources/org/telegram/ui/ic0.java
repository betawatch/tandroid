package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ic0 extends s4.u0 {
    public final /* synthetic */ rc0 a;

    public ic0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        rc0 rc0Var = this.a;
        rc0Var.Q = z10;
        if (z10 || rc0Var.L == null) {
            return;
        }
        rc0Var.L = null;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rc0 rc0Var = this.a;
        rc0Var.B0(false);
        if (rc0Var.L != null) {
            rc0Var.N += i11;
        }
    }
}

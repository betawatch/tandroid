package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gc0 extends s4.u0 {
    public final /* synthetic */ pc0 a;

    public gc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        pc0 pc0Var = this.a;
        pc0Var.Q = z10;
        if (z10 || pc0Var.L == null) {
            return;
        }
        pc0Var.L = null;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        pc0 pc0Var = this.a;
        pc0Var.B0(false);
        if (pc0Var.L != null) {
            pc0Var.N += i11;
        }
    }
}

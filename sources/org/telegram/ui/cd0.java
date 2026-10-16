package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cd0 extends s4.r0 {
    public final /* synthetic */ ld0 a;

    public cd0(ld0 ld0Var) {
        this.a = ld0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        ld0 ld0Var = this.a;
        ld0Var.Q = z10;
        if (z10 || ld0Var.L == null) {
            return;
        }
        ld0Var.L = null;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ld0 ld0Var = this.a;
        ld0Var.z0(false);
        if (ld0Var.L != null) {
            ld0Var.N += i11;
        }
    }
}

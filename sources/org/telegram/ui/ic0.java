package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ic0 extends f2.a1 {
    public final /* synthetic */ rc0 a;

    public ic0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10 = i10 != 0;
        rc0 rc0Var = this.a;
        rc0Var.M = z10;
        if (z10 || rc0Var.H == null) {
            return;
        }
        rc0Var.H = null;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rc0 rc0Var = this.a;
        rc0Var.A0(false);
        if (rc0Var.H != null) {
            rc0Var.J += i11;
        }
    }
}

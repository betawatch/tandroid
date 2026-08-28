package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gc0 extends f2.d1 {
    public final /* synthetic */ pc0 a;

    public gc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z10 = i9 != 0;
        pc0 pc0Var = this.a;
        pc0Var.M = z10;
        if (z10 || pc0Var.H == null) {
            return;
        }
        pc0Var.H = null;
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        pc0 pc0Var = this.a;
        pc0Var.z0(false);
        if (pc0Var.H != null) {
            pc0Var.J += i10;
        }
    }
}

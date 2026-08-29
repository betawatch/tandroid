package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oo0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to0 b;

    public oo0(to0 to0Var, int i10) {
        this.b = to0Var;
        this.a = i10;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        to0 to0Var = this.b;
        yo0 yo0Var = to0Var.f0;
        if (to0Var.B != null) {
            if (to0Var.A == null || !to0Var.c()) {
                return;
            }
            to0Var.A.g(false);
            return;
        }
        jh.k7 k7Var = this.a == 1 ? yo0Var.c : yo0Var.b;
        if (k7Var == null || !to0Var.c()) {
            return;
        }
        k7Var.a();
    }
}

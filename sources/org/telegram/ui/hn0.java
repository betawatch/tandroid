package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hn0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn0 b;

    public hn0(nn0 nn0Var, int i10) {
        this.b = nn0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nn0 nn0Var = this.b;
        tn0 tn0Var = nn0Var.p0;
        nn0Var.h();
        if (nn0Var.K != null) {
            if (nn0Var.J == null || !nn0Var.c()) {
                return;
            }
            nn0Var.J.g(false);
            return;
        }
        rh.v5 v5Var = this.a == 1 ? tn0Var.c : tn0Var.b;
        if (v5Var == null || !nn0Var.c()) {
            return;
        }
        v5Var.b();
    }
}

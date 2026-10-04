package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class kp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp0 b;

    public kp0(qp0 qp0Var, int i10) {
        this.b = qp0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        qp0 qp0Var = this.b;
        wp0 wp0Var = qp0Var.p0;
        qp0Var.h();
        if (qp0Var.K != null) {
            if (qp0Var.J == null || !qp0Var.c()) {
                return;
            }
            qp0Var.J.g(false);
            return;
        }
        yh.k5 k5Var = this.a == 1 ? wp0Var.c : wp0Var.b;
        if (k5Var == null || !qp0Var.c()) {
            return;
        }
        k5Var.a();
    }
}

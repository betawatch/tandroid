package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        yh.l5 l5Var = this.a == 1 ? wp0Var.c : wp0Var.b;
        if (l5Var == null || !qp0Var.c()) {
            return;
        }
        l5Var.a();
    }
}

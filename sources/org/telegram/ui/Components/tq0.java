package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tq0 extends wt0 {
    public final /* synthetic */ zt0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(zt0 zt0Var, Context context) {
        super(zt0Var, context, 0, true);
        this.G = zt0Var;
    }

    @Override // org.telegram.ui.Components.wt0, s4.g0
    public final void f() {
        super.f();
        zt0 zt0Var = this.G;
        ss0 e02 = zt0Var.e0(9);
        if (e02 != null && e02.n.getVisibility() == 0) {
            zt0Var.h0.f();
        }
        if (e02 != null) {
            or0 or0Var = e02.w;
            th.x4 x4Var = this.s;
            or0Var.e(x4Var != null && (x4Var.k() || (zt0Var.r0() && this.s.g() > 0)), true);
        }
    }
}

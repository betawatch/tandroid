package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xt0 extends wt0 {
    public final /* synthetic */ yt0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(yt0 yt0Var, Context context, int i10) {
        super(yt0Var.e, context, i10, false);
        this.G = yt0Var;
    }

    @Override // org.telegram.ui.Components.wt0, s4.g0
    public final void f() {
        super.f();
        yt0 yt0Var = this.G;
        zt0 zt0Var = yt0Var.e;
        int i10 = yt0Var.a;
        int[] iArr = zt0.s2;
        ss0 e02 = zt0Var.e0(i10);
        if (e02 != null && e02.n.getVisibility() == 0) {
            yt0Var.d.f();
        }
        if (e02 != null) {
            or0 or0Var = e02.w;
            th.x4 x4Var = this.s;
            or0Var.e(x4Var != null && (x4Var.k() || (zt0Var.r0() && this.s.g() > 0)), true);
        }
    }
}

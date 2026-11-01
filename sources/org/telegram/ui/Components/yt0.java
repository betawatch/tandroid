package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yt0 extends xt0 {
    public final /* synthetic */ zt0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(zt0 zt0Var, Context context, int i10) {
        super(zt0Var.e, context, i10, false);
        this.G = zt0Var;
    }

    @Override // org.telegram.ui.Components.xt0, s4.g0
    public final void f() {
        super.f();
        zt0 zt0Var = this.G;
        au0 au0Var = zt0Var.e;
        int i10 = zt0Var.a;
        int[] iArr = au0.s2;
        ts0 f02 = au0Var.f0(i10);
        if (f02 != null && f02.n.getVisibility() == 0) {
            zt0Var.d.f();
        }
        if (f02 != null) {
            pr0 pr0Var = f02.w;
            th.x4 x4Var = this.s;
            pr0Var.e(x4Var != null && (x4Var.k() || (au0Var.s0() && this.s.g() > 0)), true);
        }
    }
}

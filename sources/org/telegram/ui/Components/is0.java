package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class is0 extends xt0 {
    public final /* synthetic */ au0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(au0 au0Var, Context context) {
        super(au0Var, context, 0, false);
        this.G = au0Var;
    }

    @Override // org.telegram.ui.Components.xt0, s4.g0
    public final void f() {
        super.f();
        au0 au0Var = this.G;
        ts0 f02 = au0Var.f0(8);
        if (f02 != null && f02.n.getVisibility() == 0) {
            au0Var.f0.f();
        }
        if (f02 != null) {
            pr0 pr0Var = f02.w;
            th.x4 x4Var = this.s;
            pr0Var.e(x4Var != null && (x4Var.k() || (au0Var.s0() && this.s.g() > 0)), true);
        }
    }
}

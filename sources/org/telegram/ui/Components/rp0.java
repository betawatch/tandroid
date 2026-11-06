package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rp0 extends us0 {
    public final /* synthetic */ xs0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(xs0 xs0Var, Context context) {
        super(xs0Var, context, 0, true);
        this.G = xs0Var;
    }

    @Override // org.telegram.ui.Components.us0, v4.g0
    public final void f() {
        super.f();
        xs0 xs0Var = this.G;
        sr0 g02 = xs0Var.g0(9);
        if (g02 != null && g02.n.getVisibility() == 0) {
            xs0Var.h0.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.w;
            di.q6 q6Var = this.s;
            nq0Var.e(q6Var != null && (q6Var.k() || (xs0Var.t0() && this.s.g() > 0)), true);
        }
    }
}

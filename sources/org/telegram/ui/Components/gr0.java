package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gr0 extends us0 {
    public final /* synthetic */ xs0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(xs0 xs0Var, Context context) {
        super(xs0Var, context, 0, false);
        this.G = xs0Var;
    }

    @Override // org.telegram.ui.Components.us0, v4.g0
    public final void f() {
        super.f();
        xs0 xs0Var = this.G;
        sr0 g02 = xs0Var.g0(8);
        if (g02 != null && g02.n.getVisibility() == 0) {
            xs0Var.f0.f();
        }
        if (g02 != null) {
            nq0 nq0Var = g02.w;
            di.q6 q6Var = this.s;
            nq0Var.e(q6Var != null && (q6Var.k() || (xs0Var.t0() && this.s.g() > 0)), true);
        }
    }
}

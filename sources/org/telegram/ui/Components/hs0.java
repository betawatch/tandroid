package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hs0 extends qv0 {
    public final /* synthetic */ tv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(tv0 tv0Var, Context context) {
        super(tv0Var, context, 0, true);
        this.G = tv0Var;
    }

    @Override // org.telegram.ui.Components.qv0, s4.g0
    public final void l() {
        super.l();
        tv0 tv0Var = this.G;
        mu0 W = tv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            tv0Var.f0.l();
        }
        if (W != null) {
            dt0 dt0Var = W.w;
            ci.a7 a7Var = this.s;
            dt0Var.e(a7Var != null && (a7Var.k() || (tv0Var.j0() && this.s.g() > 0)), true);
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rv0 extends qv0 {
    public final /* synthetic */ sv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(sv0 sv0Var, Context context, int i10) {
        super(sv0Var.e, context, i10, false);
        this.G = sv0Var;
    }

    @Override // org.telegram.ui.Components.qv0, s4.g0
    public final void l() {
        super.l();
        sv0 sv0Var = this.G;
        tv0 tv0Var = sv0Var.e;
        int i10 = sv0Var.a;
        int[] iArr = tv0.d2;
        mu0 W = tv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            sv0Var.d.l();
        }
        if (W != null) {
            dt0 dt0Var = W.w;
            ci.a7 a7Var = this.s;
            dt0Var.e(a7Var != null && (a7Var.k() || (tv0Var.j0() && this.s.g() > 0)), true);
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nr0 extends wu0 {
    public final /* synthetic */ zu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(zu0 zu0Var, Context context) {
        super(zu0Var, context, 0, true);
        this.D = zu0Var;
    }

    @Override // org.telegram.ui.Components.wu0, f2.p0
    public final void l() {
        super.l();
        zu0 zu0Var = this.D;
        rt0 W = zu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            zu0Var.c0.l();
        }
        if (W != null) {
            is0 is0Var = W.w;
            oh.l6 l6Var = this.s;
            is0Var.e(l6Var != null && (l6Var.k() || (zu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

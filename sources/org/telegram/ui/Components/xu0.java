package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xu0 extends wu0 {
    public final /* synthetic */ yu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(yu0 yu0Var, Context context, int i10) {
        super(yu0Var.e, context, i10, false);
        this.D = yu0Var;
    }

    @Override // org.telegram.ui.Components.wu0, f2.p0
    public final void l() {
        super.l();
        yu0 yu0Var = this.D;
        zu0 zu0Var = yu0Var.e;
        int i10 = yu0Var.a;
        int[] iArr = zu0.a2;
        rt0 W = zu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            yu0Var.d.l();
        }
        if (W != null) {
            is0 is0Var = W.w;
            oh.l6 l6Var = this.s;
            is0Var.e(l6Var != null && (l6Var.k() || (zu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

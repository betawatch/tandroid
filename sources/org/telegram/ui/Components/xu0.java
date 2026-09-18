package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xu0 extends wu0 {
    public final /* synthetic */ yu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(yu0 yu0Var, Context context, int i10) {
        super(yu0Var.e, context, i10, false);
        this.G = yu0Var;
    }

    @Override // org.telegram.ui.Components.wu0, s4.h0
    public final void l() {
        super.l();
        yu0 yu0Var = this.G;
        zu0 zu0Var = yu0Var.e;
        int i10 = yu0Var.a;
        int[] iArr = zu0.d2;
        st0 W = zu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            yu0Var.d.l();
        }
        if (W != null) {
            js0 js0Var = W.w;
            ai.d9 d9Var = this.s;
            js0Var.e(d9Var != null && (d9Var.k() || (zu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

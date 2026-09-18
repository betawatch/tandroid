package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mr0 extends wu0 {
    public final /* synthetic */ zu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(zu0 zu0Var, Context context) {
        super(zu0Var, context, 0, true);
        this.G = zu0Var;
    }

    @Override // org.telegram.ui.Components.wu0, s4.h0
    public final void l() {
        super.l();
        zu0 zu0Var = this.G;
        st0 W = zu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            zu0Var.f0.l();
        }
        if (W != null) {
            js0 js0Var = W.w;
            ai.d9 d9Var = this.s;
            js0Var.e(d9Var != null && (d9Var.k() || (zu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

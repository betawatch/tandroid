package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class et0 extends tu0 {
    public final /* synthetic */ zu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(zu0 zu0Var, Context context) {
        super(zu0Var, context);
        this.h = zu0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        zu0 zu0Var = this.h;
        st0 W = zu0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        zu0Var.I.l();
    }
}

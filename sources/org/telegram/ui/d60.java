package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ e60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(e60 e60Var, Context context) {
        super(context, false);
        this.h = e60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k60 k60Var = this.h.M;
        if (k60Var.Q.getVisibility() == 0 && k60Var.P2) {
            k60.N(k60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k60.N(this.h.M, this, false);
    }
}

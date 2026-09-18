package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ q60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(q60 q60Var, Context context) {
        super(context, true);
        this.h = q60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q60 q60Var = this.h;
        if (!q60Var.r || getParticipant() == null) {
            return;
        }
        q60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

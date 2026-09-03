package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ k60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(k60 k60Var, Context context) {
        super(context, true);
        this.h = k60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k60 k60Var = this.h;
        if (!k60Var.r || getParticipant() == null) {
            return;
        }
        k60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

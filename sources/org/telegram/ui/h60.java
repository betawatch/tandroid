package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ j60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(j60 j60Var, Context context) {
        super(context, true);
        this.h = j60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j60 j60Var = this.h;
        if (!j60Var.r || getParticipant() == null) {
            return;
        }
        j60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

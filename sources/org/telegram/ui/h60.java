package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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

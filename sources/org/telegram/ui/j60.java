package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ l60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(l60 l60Var, Context context) {
        super(context, true);
        this.h = l60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l60 l60Var = this.h;
        if (!l60Var.r || getParticipant() == null) {
            return;
        }
        l60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

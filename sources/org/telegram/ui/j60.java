package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

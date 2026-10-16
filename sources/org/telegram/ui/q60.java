package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ s60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(s60 s60Var, Context context) {
        super(context, true);
        this.h = s60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s60 s60Var = this.h;
        if (!s60Var.r || getParticipant() == null) {
            return;
        }
        s60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ p60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(p60 p60Var, Context context) {
        super(context, true);
        this.h = p60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p60 p60Var = this.h;
        if (!p60Var.r || getParticipant() == null) {
            return;
        }
        p60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

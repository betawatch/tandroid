package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ h60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(h60 h60Var, Context context) {
        super(context, false);
        this.h = h60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n60 n60Var = this.h.M;
        if (n60Var.Q.getVisibility() == 0 && n60Var.P2) {
            n60.O(n60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n60.O(this.h.M, this, false);
    }
}

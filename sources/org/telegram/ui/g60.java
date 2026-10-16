package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

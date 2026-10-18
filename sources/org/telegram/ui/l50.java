package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ m50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(m50 m50Var, Context context) {
        super(context, false);
        this.h = m50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s50 s50Var = this.h.M;
        if (s50Var.Q.getVisibility() == 0 && s50Var.P2) {
            s50.O(s50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s50.O(this.h.M, this, false);
    }
}

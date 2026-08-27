package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        s50 s50Var = this.h.I;
        if (s50Var.M.getVisibility() == 0 && s50Var.L2) {
            s50.N(s50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s50.N(this.h.I, this, false);
    }
}

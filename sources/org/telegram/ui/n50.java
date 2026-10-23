package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ o50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(o50 o50Var, Context context) {
        super(context, false);
        this.h = o50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u50 u50Var = this.h.M;
        if (u50Var.Q.getVisibility() == 0 && u50Var.P2) {
            u50.N(u50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u50.N(this.h.M, this, false);
    }
}

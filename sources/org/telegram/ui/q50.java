package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ r50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(r50 r50Var, Context context) {
        super(context, false);
        this.h = r50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x50 x50Var = this.h.M;
        if (x50Var.Q.getVisibility() == 0 && x50Var.P2) {
            x50.N(x50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x50.N(this.h.M, this, false);
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ b60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(b60 b60Var, Context context) {
        super(context, false);
        this.h = b60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h60 h60Var = this.h.M;
        if (h60Var.Q.getVisibility() == 0 && h60Var.P2) {
            h60.L(h60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h60.L(this.h.M, this, false);
    }
}

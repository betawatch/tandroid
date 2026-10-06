package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class l60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ n60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(n60 n60Var, Context context) {
        super(context, true);
        this.h = n60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n60 n60Var = this.h;
        if (!n60Var.r || getParticipant() == null) {
            return;
        }
        n60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}

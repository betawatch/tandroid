package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ k50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(k50 k50Var, Context context) {
        super(context, false);
        this.h = k50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q50 q50Var = this.h.M;
        if (q50Var.Q.getVisibility() == 0 && q50Var.P2) {
            q50.O(q50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q50.O(this.h.M, this, false);
    }
}

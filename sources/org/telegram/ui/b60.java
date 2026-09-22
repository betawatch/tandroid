package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ c60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(c60 c60Var, Context context) {
        super(context, false);
        this.h = c60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i60 i60Var = this.h.M;
        if (i60Var.Q.getVisibility() == 0 && i60Var.P2) {
            i60.N(i60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i60.N(this.h.M, this, false);
    }
}

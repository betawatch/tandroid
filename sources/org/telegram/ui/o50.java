package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ p50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(p50 p50Var, Context context) {
        super(context, false);
        this.h = p50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v50 v50Var = this.h.M;
        if (v50Var.Q.getVisibility() == 0 && v50Var.P2) {
            v50.N(v50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v50.N(this.h.M, this, false);
    }
}

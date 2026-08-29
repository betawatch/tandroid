package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ l50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(l50 l50Var, Context context) {
        super(context, false);
        this.h = l50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r50 r50Var = this.h.I;
        if (r50Var.M.getVisibility() == 0 && r50Var.L2) {
            r50.M(r50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r50.M(this.h.I, this, false);
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ i50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(i50 i50Var, Context context) {
        super(context, false);
        this.h = i50Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o50 o50Var = this.h.I;
        if (o50Var.M.getVisibility() == 0 && o50Var.L2) {
            o50.M(o50Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o50.M(this.h.I, this, false);
    }
}

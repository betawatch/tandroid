package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ d60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(d60 d60Var, Context context) {
        super(context, false);
        this.h = d60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j60 j60Var = this.h.M;
        if (j60Var.Q.getVisibility() == 0 && j60Var.P2) {
            j60.N(j60Var, this, true);
        }
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j60.N(this.h.M, this, false);
    }
}

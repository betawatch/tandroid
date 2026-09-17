package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cs0 extends mv0 {
    public final /* synthetic */ pv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(pv0 pv0Var, Context context) {
        super(pv0Var, context, 0, true);
        this.G = pv0Var;
    }

    @Override // org.telegram.ui.Components.mv0, s4.h0
    public final void l() {
        super.l();
        pv0 pv0Var = this.G;
        iu0 W = pv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            pv0Var.f0.l();
        }
        if (W != null) {
            zs0 zs0Var = W.w;
            ai.d9 d9Var = this.s;
            zs0Var.e(d9Var != null && (d9Var.k() || (pv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

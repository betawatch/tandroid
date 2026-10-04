package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class nv0 extends mv0 {
    public final /* synthetic */ ov0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(ov0 ov0Var, Context context, int i10) {
        super(ov0Var.e, context, i10, false);
        this.G = ov0Var;
    }

    @Override // org.telegram.ui.Components.mv0, s4.h0
    public final void l() {
        super.l();
        ov0 ov0Var = this.G;
        pv0 pv0Var = ov0Var.e;
        int i10 = ov0Var.a;
        int[] iArr = pv0.d2;
        iu0 W = pv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            ov0Var.d.l();
        }
        if (W != null) {
            zs0 zs0Var = W.w;
            ai.d9 d9Var = this.s;
            zs0Var.e(d9Var != null && (d9Var.k() || (pv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

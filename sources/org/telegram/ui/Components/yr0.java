package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class yr0 extends iv0 {
    public final /* synthetic */ lv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(lv0 lv0Var, Context context) {
        super(lv0Var, context, 0, true);
        this.G = lv0Var;
    }

    @Override // org.telegram.ui.Components.iv0, s4.h0
    public final void l() {
        super.l();
        lv0 lv0Var = this.G;
        eu0 W = lv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            lv0Var.f0.l();
        }
        if (W != null) {
            vs0 vs0Var = W.w;
            ai.d9 d9Var = this.s;
            vs0Var.e(d9Var != null && (d9Var.k() || (lv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

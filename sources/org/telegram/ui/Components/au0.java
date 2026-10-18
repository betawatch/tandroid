package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class au0 extends pv0 {
    public final /* synthetic */ sv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(sv0 sv0Var, Context context) {
        super(sv0Var, context, 0, false);
        this.G = sv0Var;
    }

    @Override // org.telegram.ui.Components.pv0, s4.g0
    public final void l() {
        super.l();
        sv0 sv0Var = this.G;
        lu0 W = sv0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            sv0Var.d0.l();
        }
        if (W != null) {
            ct0 ct0Var = W.w;
            ci.a7 a7Var = this.s;
            ct0Var.e(a7Var != null && (a7Var.k() || (sv0Var.j0() && this.s.g() > 0)), true);
        }
    }
}

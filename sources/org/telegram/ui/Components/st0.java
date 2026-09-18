package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class st0 extends hv0 {
    public final /* synthetic */ kv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(kv0 kv0Var, Context context) {
        super(kv0Var, context, 0, false);
        this.G = kv0Var;
    }

    @Override // org.telegram.ui.Components.hv0, s4.h0
    public final void l() {
        super.l();
        kv0 kv0Var = this.G;
        du0 W = kv0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            kv0Var.d0.l();
        }
        if (W != null) {
            us0 us0Var = W.w;
            ai.d9 d9Var = this.s;
            us0Var.e(d9Var != null && (d9Var.k() || (kv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

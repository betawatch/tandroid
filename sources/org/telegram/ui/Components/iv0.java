package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class iv0 extends hv0 {
    public final /* synthetic */ jv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(jv0 jv0Var, Context context, int i10) {
        super(jv0Var.e, context, i10, false);
        this.G = jv0Var;
    }

    @Override // org.telegram.ui.Components.hv0, s4.h0
    public final void l() {
        super.l();
        jv0 jv0Var = this.G;
        kv0 kv0Var = jv0Var.e;
        int i10 = jv0Var.a;
        int[] iArr = kv0.d2;
        du0 W = kv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            jv0Var.d.l();
        }
        if (W != null) {
            us0 us0Var = W.w;
            ai.d9 d9Var = this.s;
            us0Var.e(d9Var != null && (d9Var.k() || (kv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

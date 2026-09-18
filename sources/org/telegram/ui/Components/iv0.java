package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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

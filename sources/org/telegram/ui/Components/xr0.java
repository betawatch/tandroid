package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class xr0 extends hv0 {
    public final /* synthetic */ kv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(kv0 kv0Var, Context context) {
        super(kv0Var, context, 0, true);
        this.G = kv0Var;
    }

    @Override // org.telegram.ui.Components.hv0, s4.h0
    public final void l() {
        super.l();
        kv0 kv0Var = this.G;
        du0 W = kv0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            kv0Var.f0.l();
        }
        if (W != null) {
            us0 us0Var = W.w;
            ai.d9 d9Var = this.s;
            us0Var.e(d9Var != null && (d9Var.k() || (kv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

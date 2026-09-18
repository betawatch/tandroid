package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class pt0 extends ev0 {
    public final /* synthetic */ kv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(kv0 kv0Var, Context context) {
        super(kv0Var, context);
        this.h = kv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        kv0 kv0Var = this.h;
        du0 W = kv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        kv0Var.I.l();
    }
}

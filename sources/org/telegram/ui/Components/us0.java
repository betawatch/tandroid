package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class us0 extends kx0 {
    public final /* synthetic */ kv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(kv0 kv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = kv0Var;
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}

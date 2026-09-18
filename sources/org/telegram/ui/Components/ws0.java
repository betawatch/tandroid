package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ws0 extends FragmentContextView {
    public final /* synthetic */ kv0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, kv0 kv0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, kv0Var2, false, e6Var);
        this.P0 = kv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        kv0 kv0Var = this.P0;
        kv0Var.P0.i(kv0Var.Q0, i10 == 0, true);
    }
}

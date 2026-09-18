package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class co0 extends e40 {
    public final /* synthetic */ org.telegram.ui.ey c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(org.telegram.ui.ey eyVar, wl0 wl0Var, Context context, int i10) {
        super(wl0Var, context, i10);
        this.c0 = eyVar;
    }

    @Override // org.telegram.ui.Components.l61
    public final void N(boolean z10) {
        super.N(z10);
        yn0 yn0Var = this.c0.t0;
        yn0Var.e(false, z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}

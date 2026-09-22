package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pn0 extends e40 {
    public final /* synthetic */ org.telegram.ui.ey c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10) {
        super(ll0Var, context, i10);
        this.c0 = eyVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z10) {
        super.N(z10);
        ln0 ln0Var = this.c0.s0;
        ln0Var.e(false, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}

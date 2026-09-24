package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class co0 extends f40 {
    public final /* synthetic */ org.telegram.ui.zx c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(org.telegram.ui.zx zxVar, wl0 wl0Var, Context context, int i10) {
        super(wl0Var, context, i10);
        this.c0 = zxVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        super.N(z10);
        yn0 yn0Var = this.c0.s0;
        yn0Var.e(false, z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}

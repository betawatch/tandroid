package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class eo0 extends e40 {
    public final /* synthetic */ org.telegram.ui.ey c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo0(org.telegram.ui.ey eyVar, yl0 yl0Var, Context context, int i10) {
        super(yl0Var, context, i10);
        this.c0 = eyVar;
    }

    @Override // org.telegram.ui.Components.m61
    public final void N(boolean z10) {
        super.N(z10);
        ao0 ao0Var = this.c0.t0;
        ao0Var.e(false, z10);
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}

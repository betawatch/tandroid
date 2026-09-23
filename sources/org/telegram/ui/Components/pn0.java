package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pn0 extends f40 {
    public final /* synthetic */ org.telegram.ui.ay c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(org.telegram.ui.ay ayVar, ml0 ml0Var, Context context, int i10) {
        super(ml0Var, context, i10);
        this.c0 = ayVar;
    }

    @Override // org.telegram.ui.Components.v51
    public final void N(boolean z10) {
        super.N(z10);
        ln0 ln0Var = this.c0.s0;
        ln0Var.e(false, z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ho0 extends i40 {
    public final /* synthetic */ org.telegram.ui.dy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(org.telegram.ui.dy dyVar, zl0 zl0Var, Context context, int i10) {
        super(zl0Var, context, i10);
        this.c0 = dyVar;
    }

    @Override // org.telegram.ui.Components.w61
    public final void N(boolean z10) {
        super.N(z10);
        do0 do0Var = this.c0.u0;
        do0Var.e(false, z10);
        do0Var.d.setText(LocaleController.getString(R.string.NoResult));
        do0Var.e.setVisibility(8);
    }
}

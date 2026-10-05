package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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

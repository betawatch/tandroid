package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qn0 extends e40 {
    public final /* synthetic */ org.telegram.ui.gy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10) {
        super(ml0Var, context, i10);
        this.c0 = gyVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void N(boolean z10) {
        super.N(z10);
        mn0 mn0Var = this.c0.t0;
        mn0Var.e(false, z10);
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
    }
}

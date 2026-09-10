package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xn0 extends o40 {
    public final /* synthetic */ org.telegram.ui.gy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10) {
        super(vl0Var, context, i10);
        this.c0 = gyVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        super.N(z10);
        tn0 tn0Var = this.c0.s0;
        tn0Var.e(false, z10);
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qo0 extends r40 {
    public final /* synthetic */ org.telegram.ui.iy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10);
        this.c0 = iyVar;
    }

    @Override // org.telegram.ui.Components.z61
    public final void N(boolean z10) {
        super.N(z10);
        mo0 mo0Var = this.c0.s0;
        mo0Var.e(false, z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}

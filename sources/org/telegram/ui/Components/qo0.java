package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qo0 extends n40 {
    public final /* synthetic */ org.telegram.ui.nx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo0(org.telegram.ui.nx nxVar, mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10);
        this.e0 = nxVar;
    }

    @Override // org.telegram.ui.Components.b71
    public final void N(boolean z10) {
        super.N(z10);
        mo0 mo0Var = this.e0.s0;
        mo0Var.e(false, z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}

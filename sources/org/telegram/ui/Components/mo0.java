package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mo0 extends n40 {
    public final /* synthetic */ org.telegram.ui.nx c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(org.telegram.ui.nx nxVar, im0 im0Var, Context context, int i10) {
        super(im0Var, context, i10);
        this.c0 = nxVar;
    }

    @Override // org.telegram.ui.Components.s61
    public final void N(boolean z10) {
        super.N(z10);
        io0 io0Var = this.c0.s0;
        io0Var.e(false, z10);
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}

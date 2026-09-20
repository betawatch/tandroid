package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class co0 extends e40 {
    public final /* synthetic */ org.telegram.ui.ey c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(org.telegram.ui.ey eyVar, vl0 vl0Var, Context context, int i10) {
        super(vl0Var, context, i10);
        this.c0 = eyVar;
    }

    @Override // org.telegram.ui.Components.k61
    public final void N(boolean z10) {
        super.N(z10);
        yn0 yn0Var = this.c0.t0;
        yn0Var.e(false, z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}

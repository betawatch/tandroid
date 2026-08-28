package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ym0 extends o30 {
    public final /* synthetic */ org.telegram.ui.mx Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9) {
        super(wk0Var, context, i9);
        this.Y = mxVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void N(boolean z10) {
        super.N(z10);
        um0 um0Var = this.Y.o0;
        um0Var.e(false, z10);
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.e.setVisibility(8);
    }
}

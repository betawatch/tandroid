package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vm0 extends hs {
    public final /* synthetic */ org.telegram.ui.mx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9, int i10) {
        super(wk0Var, context, i9, i10, false, null);
        this.e0 = mxVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        um0 um0Var = this.e0.h0;
        um0Var.e(this.V || this.W || (arrayList = this.P) == null || !arrayList.isEmpty(), z10);
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.e.setVisibility(8);
    }
}

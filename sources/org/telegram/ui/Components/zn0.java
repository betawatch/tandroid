package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zn0 extends ss {
    public final /* synthetic */ org.telegram.ui.zx i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(org.telegram.ui.zx zxVar, wl0 wl0Var, Context context, int i10, int i11) {
        super(wl0Var, context, i10, i11, false, null);
        this.i0 = zxVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        yn0 yn0Var = this.i0.l0;
        yn0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
    }
}

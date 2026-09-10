package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class un0 extends xs {
    public final /* synthetic */ org.telegram.ui.gy i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10, int i11) {
        super(vl0Var, context, i10, i11, false, null);
        this.i0 = gyVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        tn0 tn0Var = this.i0.l0;
        tn0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tn0Var.e.setVisibility(8);
    }
}

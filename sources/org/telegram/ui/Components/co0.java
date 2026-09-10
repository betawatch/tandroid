package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class co0 extends zs {
    public final /* synthetic */ org.telegram.ui.wy d0;
    public final /* synthetic */ org.telegram.ui.gy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(org.telegram.ui.gy gyVar, vl0 vl0Var, Context context, int i10, int i11, org.telegram.ui.wy wyVar) {
        super(vl0Var, context, i10, i11);
        this.e0 = gyVar;
        this.d0 = wyVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        tn0 tn0Var = this.e0.g0;
        tn0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            tn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            tn0Var.e.setVisibility(8);
        } else {
            tn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            tn0Var.e.setVisibility(0);
            tn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

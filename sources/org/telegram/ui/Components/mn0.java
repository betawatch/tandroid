package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class mn0 extends qs {
    public final /* synthetic */ org.telegram.ui.ey i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10, int i11) {
        super(ll0Var, context, i10, i11, false, null);
        this.i0 = eyVar;
    }

    @Override // org.telegram.ui.Components.v51
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        ln0 ln0Var = this.i0.l0;
        ln0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
    }
}

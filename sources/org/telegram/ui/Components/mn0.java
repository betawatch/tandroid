package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mn0 extends ss {
    public final /* synthetic */ org.telegram.ui.ay i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(org.telegram.ui.ay ayVar, ml0 ml0Var, Context context, int i10, int i11) {
        super(ml0Var, context, i10, i11, false, null);
        this.i0 = ayVar;
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

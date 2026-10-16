package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class no0 extends et {
    public final /* synthetic */ org.telegram.ui.iy i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10, int i11) {
        super(mm0Var, context, i10, i11, false, null);
        this.i0 = iyVar;
    }

    @Override // org.telegram.ui.Components.a71
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        mo0 mo0Var = this.i0.l0;
        mo0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}

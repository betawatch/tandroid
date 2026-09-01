package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sn0 extends rs {
    public final /* synthetic */ org.telegram.ui.yx f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(org.telegram.ui.yx yxVar, tl0 tl0Var, Context context, int i10, int i11) {
        super(tl0Var, context, i10, i11, false, null);
        this.f0 = yxVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void N(boolean z4) {
        ArrayList arrayList;
        super.N(z4);
        rn0 rn0Var = this.f0.i0;
        rn0Var.e(this.W || this.X || (arrayList = this.Q) == null || !arrayList.isEmpty(), z4);
        rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        rn0Var.e.setVisibility(8);
    }
}

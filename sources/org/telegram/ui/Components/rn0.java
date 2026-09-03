package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rn0 extends rs {
    public final /* synthetic */ org.telegram.ui.yx f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(org.telegram.ui.yx yxVar, sl0 sl0Var, Context context, int i10, int i11) {
        super(sl0Var, context, i10, i11, false, null);
        this.f0 = yxVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        ArrayList arrayList;
        super.N(z4);
        qn0 qn0Var = this.f0.i0;
        qn0Var.e(this.W || this.X || (arrayList = this.Q) == null || !arrayList.isEmpty(), z4);
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
    }
}

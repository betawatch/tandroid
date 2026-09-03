package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class un0 extends i40 {
    public final /* synthetic */ org.telegram.ui.yx Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(org.telegram.ui.yx yxVar, sl0 sl0Var, Context context, int i10) {
        super(sl0Var, context, i10);
        this.Z = yxVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        super.N(z4);
        qn0 qn0Var = this.Z.p0;
        qn0Var.e(false, z4);
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
    }
}

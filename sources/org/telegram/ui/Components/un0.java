package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class un0 extends g40 {
    public final /* synthetic */ org.telegram.ui.xx Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10) {
        super(sl0Var, context, i10);
        this.Z = xxVar;
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

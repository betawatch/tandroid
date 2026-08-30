package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rn0 extends ps {
    public final /* synthetic */ org.telegram.ui.xx f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10, int i11) {
        super(sl0Var, context, i10, i11, false, null);
        this.f0 = xxVar;
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

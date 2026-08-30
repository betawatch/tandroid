package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yn0 extends rs {
    public final /* synthetic */ org.telegram.ui.oy a0;
    public final /* synthetic */ org.telegram.ui.xx b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(org.telegram.ui.xx xxVar, sl0 sl0Var, Context context, int i10, int i11, org.telegram.ui.oy oyVar) {
        super(sl0Var, context, i10, i11);
        this.b0 = xxVar;
        this.a0 = oyVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        qn0 qn0Var = this.b0.d0;
        qn0Var.e(this.T || this.U || (arrayList = this.M) == null || !arrayList.isEmpty() || (arrayList2 = this.N) == null || !arrayList2.isEmpty() || (arrayList3 = this.P) == null || !arrayList3.isEmpty() || (arrayList4 = this.O) == null || !arrayList4.isEmpty(), z4);
        if (!TextUtils.isEmpty(this.Y)) {
            qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            qn0Var.e.setVisibility(8);
        } else {
            qn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            qn0Var.e.setVisibility(0);
            qn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

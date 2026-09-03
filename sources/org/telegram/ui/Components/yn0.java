package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yn0 extends ts {
    public final /* synthetic */ org.telegram.ui.py a0;
    public final /* synthetic */ org.telegram.ui.yx b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(org.telegram.ui.yx yxVar, sl0 sl0Var, Context context, int i10, int i11, org.telegram.ui.py pyVar) {
        super(sl0Var, context, i10, i11);
        this.b0 = yxVar;
        this.a0 = pyVar;
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

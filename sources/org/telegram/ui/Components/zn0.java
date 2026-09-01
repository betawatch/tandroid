package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zn0 extends ts {
    public final /* synthetic */ org.telegram.ui.py a0;
    public final /* synthetic */ org.telegram.ui.yx b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(org.telegram.ui.yx yxVar, tl0 tl0Var, Context context, int i10, int i11, org.telegram.ui.py pyVar) {
        super(tl0Var, context, i10, i11);
        this.b0 = yxVar;
        this.a0 = pyVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void N(boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        rn0 rn0Var = this.b0.d0;
        rn0Var.e(this.T || this.U || (arrayList = this.M) == null || !arrayList.isEmpty() || (arrayList2 = this.N) == null || !arrayList2.isEmpty() || (arrayList3 = this.P) == null || !arrayList3.isEmpty() || (arrayList4 = this.O) == null || !arrayList4.isEmpty(), z4);
        if (!TextUtils.isEmpty(this.Y)) {
            rn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            rn0Var.e.setVisibility(8);
        } else {
            rn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            rn0Var.e.setVisibility(0);
            rn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

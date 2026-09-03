package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xn0 extends qs {
    public final /* synthetic */ org.telegram.ui.qy a0;
    public final /* synthetic */ org.telegram.ui.zx b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(rl0Var, context, i10, i11);
        this.b0 = zxVar;
        this.a0 = qyVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z4);
        pn0 pn0Var = this.b0.d0;
        pn0Var.e(this.T || this.U || (arrayList = this.M) == null || !arrayList.isEmpty() || (arrayList2 = this.N) == null || !arrayList2.isEmpty() || (arrayList3 = this.P) == null || !arrayList3.isEmpty() || (arrayList4 = this.O) == null || !arrayList4.isEmpty(), z4);
        if (!TextUtils.isEmpty(this.Y)) {
            pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            pn0Var.e.setVisibility(8);
        } else {
            pn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            pn0Var.e.setVisibility(0);
            pn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

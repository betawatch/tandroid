package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class un0 extends ts {
    public final /* synthetic */ org.telegram.ui.wy d0;
    public final /* synthetic */ org.telegram.ui.gy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10, int i11, org.telegram.ui.wy wyVar) {
        super(ml0Var, context, i10, i11);
        this.e0 = gyVar;
        this.d0 = wyVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mn0 mn0Var = this.e0.h0;
        mn0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            mn0Var.e.setVisibility(8);
        } else {
            mn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mn0Var.e.setVisibility(0);
            mn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

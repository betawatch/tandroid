package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class go0 extends us {
    public final /* synthetic */ org.telegram.ui.qy d0;
    public final /* synthetic */ org.telegram.ui.zx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go0(org.telegram.ui.zx zxVar, wl0 wl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(wl0Var, context, i10, i11);
        this.e0 = zxVar;
        this.d0 = qyVar;
    }

    @Override // org.telegram.ui.Components.j61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        yn0 yn0Var = this.e0.g0;
        yn0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            yn0Var.e.setVisibility(8);
        } else {
            yn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            yn0Var.e.setVisibility(0);
            yn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cn0 extends js {
    public final /* synthetic */ org.telegram.ui.dy Z;
    public final /* synthetic */ org.telegram.ui.mx a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(org.telegram.ui.mx mxVar, wk0 wk0Var, Context context, int i9, int i10, org.telegram.ui.dy dyVar) {
        super(wk0Var, context, i9, i10);
        this.a0 = mxVar;
        this.Z = dyVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        um0 um0Var = this.a0.c0;
        um0Var.e(this.S || this.T || (arrayList = this.L) == null || !arrayList.isEmpty() || (arrayList2 = this.M) == null || !arrayList2.isEmpty() || (arrayList3 = this.O) == null || !arrayList3.isEmpty() || (arrayList4 = this.N) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.X)) {
            um0Var.d.setText(LocaleController.getString(R.string.NoResult));
            um0Var.e.setVisibility(8);
        } else {
            um0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            um0Var.e.setVisibility(0);
            um0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

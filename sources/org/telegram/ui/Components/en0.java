package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class en0 extends hs {
    public final /* synthetic */ org.telegram.ui.gy Z;
    public final /* synthetic */ org.telegram.ui.px a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(org.telegram.ui.px pxVar, zk0 zk0Var, Context context, int i10, int i11, org.telegram.ui.gy gyVar) {
        super(zk0Var, context, i10, i11);
        this.a0 = pxVar;
        this.Z = gyVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        wm0 wm0Var = this.a0.c0;
        wm0Var.e(this.S || this.T || (arrayList = this.L) == null || !arrayList.isEmpty() || (arrayList2 = this.M) == null || !arrayList2.isEmpty() || (arrayList3 = this.O) == null || !arrayList3.isEmpty() || (arrayList4 = this.N) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.X)) {
            wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
            wm0Var.e.setVisibility(8);
        } else {
            wm0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            wm0Var.e.setVisibility(0);
            wm0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

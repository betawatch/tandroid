package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xm0 extends fs {
    public final /* synthetic */ org.telegram.ui.px e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(org.telegram.ui.px pxVar, zk0 zk0Var, Context context, int i10, int i11) {
        super(zk0Var, context, i10, i11, false, null);
        this.e0 = pxVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        wm0 wm0Var = this.e0.h0;
        wm0Var.e(this.V || this.W || (arrayList = this.P) == null || !arrayList.isEmpty(), z10);
        wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var.e.setVisibility(8);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class an0 extends t30 {
    public final /* synthetic */ org.telegram.ui.px Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(org.telegram.ui.px pxVar, zk0 zk0Var, Context context, int i10) {
        super(zk0Var, context, i10);
        this.Y = pxVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final void N(boolean z10) {
        super.N(z10);
        wm0 wm0Var = this.Y.o0;
        wm0Var.e(false, z10);
        wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var.e.setVisibility(8);
    }
}

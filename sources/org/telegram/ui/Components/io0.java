package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class io0 extends vs {
    public final /* synthetic */ org.telegram.ui.qy d0;
    public final /* synthetic */ org.telegram.ui.zx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(org.telegram.ui.zx zxVar, yl0 yl0Var, Context context, int i10, int i11, org.telegram.ui.qy qyVar) {
        super(yl0Var, context, i10, i11);
        this.e0 = zxVar;
        this.d0 = qyVar;
    }

    @Override // org.telegram.ui.Components.l61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ao0 ao0Var = this.e0.g0;
        ao0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
            ao0Var.e.setVisibility(8);
        } else {
            ao0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ao0Var.e.setVisibility(0);
            ao0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

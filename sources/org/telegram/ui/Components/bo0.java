package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class bo0 extends ts {
    public final /* synthetic */ org.telegram.ui.zx i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(org.telegram.ui.zx zxVar, yl0 yl0Var, Context context, int i10, int i11) {
        super(yl0Var, context, i10, i11, false, null);
        this.i0 = zxVar;
    }

    @Override // org.telegram.ui.Components.l61
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        ao0 ao0Var = this.i0.l0;
        ao0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        ao0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ao0Var.e.setVisibility(8);
    }
}

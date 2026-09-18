package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nn0 extends rs {
    public final /* synthetic */ org.telegram.ui.gy i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(org.telegram.ui.gy gyVar, ml0 ml0Var, Context context, int i10, int i11) {
        super(ml0Var, context, i10, i11, false, null);
        this.i0 = gyVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        mn0 mn0Var = this.i0.m0;
        mn0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
    }
}

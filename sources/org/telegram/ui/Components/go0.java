package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class go0 extends ts {
    public final /* synthetic */ org.telegram.ui.uy d0;
    public final /* synthetic */ org.telegram.ui.ey e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go0(org.telegram.ui.ey eyVar, wl0 wl0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(wl0Var, context, i10, i11);
        this.e0 = eyVar;
        this.d0 = uyVar;
    }

    @Override // org.telegram.ui.Components.l61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        yn0 yn0Var = this.e0.h0;
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

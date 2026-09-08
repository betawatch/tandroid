package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tn0 extends ss {
    public final /* synthetic */ org.telegram.ui.uy d0;
    public final /* synthetic */ org.telegram.ui.ey e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(org.telegram.ui.ey eyVar, ll0 ll0Var, Context context, int i10, int i11, org.telegram.ui.uy uyVar) {
        super(ll0Var, context, i10, i11);
        this.e0 = eyVar;
        this.d0 = uyVar;
    }

    @Override // org.telegram.ui.Components.v51
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        ln0 ln0Var = this.e0.g0;
        ln0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
            ln0Var.e.setVisibility(8);
        } else {
            ln0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ln0Var.e.setVisibility(0);
            ln0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

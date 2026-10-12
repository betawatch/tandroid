package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uo0 extends gt {
    public final /* synthetic */ org.telegram.ui.yy d0;
    public final /* synthetic */ org.telegram.ui.iy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(org.telegram.ui.iy iyVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.yy yyVar) {
        super(mm0Var, context, i10, i11);
        this.e0 = iyVar;
        this.d0 = yyVar;
    }

    @Override // org.telegram.ui.Components.z61
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mo0 mo0Var = this.e0.g0;
        mo0Var.e(this.W || this.X || (arrayList = this.P) == null || !arrayList.isEmpty() || (arrayList2 = this.Q) == null || !arrayList2.isEmpty() || (arrayList3 = this.S) == null || !arrayList3.isEmpty() || (arrayList4 = this.R) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.b0)) {
            mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
            mo0Var.e.setVisibility(8);
        } else {
            mo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

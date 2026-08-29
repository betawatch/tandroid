package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class on0 extends ns {
    public final /* synthetic */ org.telegram.ui.fy Z;
    public final /* synthetic */ org.telegram.ui.ox a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10, int i11, org.telegram.ui.fy fyVar) {
        super(jl0Var, context, i10, i11);
        this.a0 = oxVar;
        this.Z = fyVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        gn0 gn0Var = this.a0.c0;
        gn0Var.e(this.S || this.T || (arrayList = this.L) == null || !arrayList.isEmpty() || (arrayList2 = this.M) == null || !arrayList2.isEmpty() || (arrayList3 = this.O) == null || !arrayList3.isEmpty() || (arrayList4 = this.N) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.X)) {
            gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
            gn0Var.e.setVisibility(8);
        } else {
            gn0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            gn0Var.e.setVisibility(0);
            gn0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

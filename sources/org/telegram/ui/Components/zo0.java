package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zo0 extends et {
    public final /* synthetic */ org.telegram.ui.ey f0;
    public final /* synthetic */ org.telegram.ui.mx g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10, int i11, org.telegram.ui.ey eyVar) {
        super(nm0Var, context, i10, i11);
        this.g0 = mxVar;
        this.f0 = eyVar;
    }

    @Override // org.telegram.ui.Components.k71
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        ro0 ro0Var = this.g0.i0;
        ro0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.d0)) {
            ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
            ro0Var.e.setVisibility(8);
        } else {
            ro0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            ro0Var.e.setVisibility(0);
            ro0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}

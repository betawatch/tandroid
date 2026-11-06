package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class am0 extends xr {
    public final /* synthetic */ org.telegram.ui.ww f0;
    public final /* synthetic */ org.telegram.ui.fw g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7, int i10, org.telegram.ui.ww wwVar) {
        super(pj0Var, context, i7, i10);
        this.g0 = fwVar;
        this.f0 = wwVar;
    }

    @Override // org.telegram.ui.Components.f41
    public final void O(boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z9);
        sl0 sl0Var = this.g0.i0;
        sl0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z9);
        if (!TextUtils.isEmpty(this.d0)) {
            sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
            sl0Var.e.setVisibility(8);
        } else {
            sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748230, null));
            sl0Var.e.setVisibility(0);
            sl0Var.e.setText(org.telegram.messenger.hd.M0(2131748231, null));
        }
    }
}

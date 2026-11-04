package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dm0 extends xr {
    public final /* synthetic */ org.telegram.ui.uw g0;
    public final /* synthetic */ org.telegram.ui.cw h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(org.telegram.ui.cw cwVar, tj0 tj0Var, Context context, int i3, int i10, org.telegram.ui.uw uwVar) {
        super(tj0Var, context, i3, i10);
        this.h0 = cwVar;
        this.g0 = uwVar;
    }

    @Override // org.telegram.ui.Components.f41
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        vl0 vl0Var = this.h0.j0;
        vl0Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.e0)) {
            vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
            vl0Var.e.setVisibility(8);
        } else {
            vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748239, null));
            vl0Var.e.setVisibility(0);
            vl0Var.e.setText(org.telegram.messenger.bd.M0(2131748240, null));
        }
    }
}

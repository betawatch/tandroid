package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cn0 extends is {
    public final /* synthetic */ org.telegram.ui.zx f0;
    public final /* synthetic */ org.telegram.ui.jx g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(org.telegram.ui.jx jxVar, uk0 uk0Var, Context context, int i10, int i11, org.telegram.ui.zx zxVar) {
        super(uk0Var, context, i10, i11);
        this.g0 = jxVar;
        this.f0 = zxVar;
    }

    @Override // org.telegram.ui.Components.q51
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        um0 um0Var = this.g0.i0;
        um0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.d0)) {
            um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
            um0Var.e.setVisibility(8);
        } else {
            um0Var.d.setText(org.telegram.messenger.dd.L0(2131748248, null));
            um0Var.e.setVisibility(0);
            um0Var.e.setText(org.telegram.messenger.dd.L0(2131748249, null));
        }
    }
}

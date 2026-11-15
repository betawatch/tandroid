package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class em0 extends ds {
    public final /* synthetic */ org.telegram.ui.yw g0;
    public final /* synthetic */ org.telegram.ui.hw h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(org.telegram.ui.hw hwVar, uj0 uj0Var, Context context, int i7, int i10, org.telegram.ui.yw ywVar) {
        super(uj0Var, context, i7, i10);
        this.h0 = hwVar;
        this.g0 = ywVar;
    }

    @Override // org.telegram.ui.Components.p41
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        wl0 wl0Var = this.h0.j0;
        wl0Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.e0)) {
            wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
            wl0Var.e.setVisibility(8);
        } else {
            wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748231, null));
            wl0Var.e.setVisibility(0);
            wl0Var.e.setText(org.telegram.messenger.hd.M0(2131748232, null));
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pm0 extends ms {
    public final /* synthetic */ org.telegram.ui.cx g0;
    public final /* synthetic */ org.telegram.ui.kw h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7, int i10, org.telegram.ui.cx cxVar) {
        super(ek0Var, context, i7, i10);
        this.h0 = kwVar;
        this.g0 = cxVar;
    }

    @Override // org.telegram.ui.Components.c51
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        hm0 hm0Var = this.h0.j0;
        hm0Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.e0)) {
            hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
            hm0Var.e.setVisibility(8);
        } else {
            hm0Var.d.setText(org.telegram.messenger.hd.N0(2131748038, null));
            hm0Var.e.setVisibility(0);
            hm0Var.e.setText(org.telegram.messenger.hd.N0(2131748039, null));
        }
    }
}

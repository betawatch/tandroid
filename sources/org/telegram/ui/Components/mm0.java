package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mm0 extends ks {
    public final /* synthetic */ org.telegram.ui.cx g0;
    public final /* synthetic */ org.telegram.ui.kw h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7, int i10, org.telegram.ui.cx cxVar) {
        super(ck0Var, context, i7, i10);
        this.h0 = kwVar;
        this.g0 = cxVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        em0 em0Var = this.h0.j0;
        em0Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.e0)) {
            em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
            em0Var.e.setVisibility(8);
        } else {
            em0Var.d.setText(org.telegram.messenger.gd.M0(2131748039, null));
            em0Var.e.setVisibility(0);
            em0Var.e.setText(org.telegram.messenger.gd.M0(2131748040, null));
        }
    }
}

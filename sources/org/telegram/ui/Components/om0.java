package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class om0 extends js {
    public final /* synthetic */ org.telegram.ui.bx g0;
    public final /* synthetic */ org.telegram.ui.jw h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(org.telegram.ui.jw jwVar, ek0 ek0Var, Context context, int i7, int i10, org.telegram.ui.bx bxVar) {
        super(ek0Var, context, i7, i10);
        this.h0 = jwVar;
        this.g0 = bxVar;
    }

    @Override // org.telegram.ui.Components.b51
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        gm0 gm0Var = this.h0.j0;
        gm0Var.e(this.Z || this.a0 || (arrayList = this.S) == null || !arrayList.isEmpty() || (arrayList2 = this.T) == null || !arrayList2.isEmpty() || (arrayList3 = this.V) == null || !arrayList3.isEmpty() || (arrayList4 = this.U) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.e0)) {
            gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
            gm0Var.e.setVisibility(8);
        } else {
            gm0Var.d.setText(org.telegram.messenger.gd.N0(2131748038, null));
            gm0Var.e.setVisibility(0);
            gm0Var.e.setText(org.telegram.messenger.gd.N0(2131748039, null));
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bn0 extends is {
    public final /* synthetic */ org.telegram.ui.ay f0;
    public final /* synthetic */ org.telegram.ui.kx g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10, int i11, org.telegram.ui.ay ayVar) {
        super(tk0Var, context, i10, i11);
        this.g0 = kxVar;
        this.f0 = ayVar;
    }

    @Override // org.telegram.ui.Components.p51
    public final void O(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        tm0 tm0Var = this.g0.i0;
        tm0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.d0)) {
            tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
            tm0Var.e.setVisibility(8);
        } else {
            tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748248, null));
            tm0Var.e.setVisibility(0);
            tm0Var.e.setText(org.telegram.messenger.cd.L0(2131748249, null));
        }
    }
}

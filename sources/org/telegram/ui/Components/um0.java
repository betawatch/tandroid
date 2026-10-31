package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class um0 extends gs {
    public final /* synthetic */ org.telegram.ui.kx k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10, int i11) {
        super(tk0Var, context, i10, i11, false, null);
        this.k0 = kxVar;
    }

    @Override // org.telegram.ui.Components.p51
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        tm0 tm0Var = this.k0.n0;
        tm0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z10);
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
    }
}

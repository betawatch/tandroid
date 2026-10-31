package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xm0 extends m30 {
    public final /* synthetic */ org.telegram.ui.kx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10) {
        super(tk0Var, context, i10);
        this.e0 = kxVar;
    }

    @Override // org.telegram.ui.Components.p51
    public final void O(boolean z10) {
        super.O(z10);
        tm0 tm0Var = this.e0.u0;
        tm0Var.e(false, z10);
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
    }
}

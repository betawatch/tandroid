package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class os0 extends eu0 {
    public final /* synthetic */ hu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(hu0 hu0Var, Context context) {
        super(hu0Var, context, 0, false);
        this.C = hu0Var;
    }

    @Override // org.telegram.ui.Components.eu0, f2.q0
    public final void l() {
        super.l();
        hu0 hu0Var = this.C;
        zs0 W = hu0Var.W(8);
        if (W != null && W.r.getVisibility() == 0) {
            hu0Var.W.l();
        }
        if (W != null) {
            pr0 pr0Var = W.w;
            jh.j6 j6Var = this.s;
            pr0Var.e(j6Var != null && (j6Var.k() || (hu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

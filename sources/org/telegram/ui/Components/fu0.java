package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fu0 extends eu0 {
    public final /* synthetic */ gu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(gu0 gu0Var, Context context, int i10) {
        super(gu0Var.e, context, i10, false);
        this.C = gu0Var;
    }

    @Override // org.telegram.ui.Components.eu0, f2.q0
    public final void l() {
        super.l();
        gu0 gu0Var = this.C;
        hu0 hu0Var = gu0Var.e;
        int i10 = gu0Var.a;
        int[] iArr = hu0.Z1;
        zs0 W = hu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            gu0Var.d.l();
        }
        if (W != null) {
            pr0 pr0Var = W.w;
            jh.j6 j6Var = this.s;
            pr0Var.e(j6Var != null && (j6Var.k() || (hu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

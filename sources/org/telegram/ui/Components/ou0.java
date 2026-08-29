package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ou0 extends nu0 {
    public final /* synthetic */ pu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou0(pu0 pu0Var, Context context, int i10) {
        super(pu0Var.e, context, i10, false);
        this.C = pu0Var;
    }

    @Override // org.telegram.ui.Components.nu0, f2.p0
    public final void l() {
        super.l();
        pu0 pu0Var = this.C;
        qu0 qu0Var = pu0Var.e;
        int i10 = pu0Var.a;
        int[] iArr = qu0.Z1;
        it0 W = qu0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            pu0Var.d.l();
        }
        if (W != null) {
            zr0 zr0Var = W.w;
            lh.k6 k6Var = this.s;
            zr0Var.e(k6Var != null && (k6Var.k() || (qu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class er0 extends nu0 {
    public final /* synthetic */ qu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(qu0 qu0Var, Context context) {
        super(qu0Var, context, 0, true);
        this.C = qu0Var;
    }

    @Override // org.telegram.ui.Components.nu0, f2.p0
    public final void l() {
        super.l();
        qu0 qu0Var = this.C;
        it0 W = qu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            qu0Var.b0.l();
        }
        if (W != null) {
            zr0 zr0Var = W.w;
            lh.k6 k6Var = this.s;
            zr0Var.e(k6Var != null && (k6Var.k() || (qu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

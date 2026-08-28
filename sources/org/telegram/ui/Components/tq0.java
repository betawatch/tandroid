package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tq0 extends bu0 {
    public final /* synthetic */ eu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(eu0 eu0Var, Context context) {
        super(eu0Var, context, 0, true);
        this.C = eu0Var;
    }

    @Override // org.telegram.ui.Components.bu0, f2.r0
    public final void l() {
        super.l();
        eu0 eu0Var = this.C;
        xs0 W = eu0Var.W(9);
        if (W != null && W.r.getVisibility() == 0) {
            eu0Var.b0.l();
        }
        if (W != null) {
            or0 or0Var = W.w;
            ih.n6 n6Var = this.s;
            or0Var.e(n6Var != null && (n6Var.k() || (eu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

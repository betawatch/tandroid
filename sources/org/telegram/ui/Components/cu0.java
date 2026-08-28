package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cu0 extends bu0 {
    public final /* synthetic */ du0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(du0 du0Var, Context context, int i9) {
        super(du0Var.e, context, i9, false);
        this.C = du0Var;
    }

    @Override // org.telegram.ui.Components.bu0, f2.r0
    public final void l() {
        super.l();
        du0 du0Var = this.C;
        eu0 eu0Var = du0Var.e;
        int i9 = du0Var.a;
        int[] iArr = eu0.Z1;
        xs0 W = eu0Var.W(i9);
        if (W != null && W.r.getVisibility() == 0) {
            du0Var.d.l();
        }
        if (W != null) {
            or0 or0Var = W.w;
            ih.n6 n6Var = this.s;
            or0Var.e(n6Var != null && (n6Var.k() || (eu0Var.i0() && this.s.g() > 0)), true);
        }
    }
}

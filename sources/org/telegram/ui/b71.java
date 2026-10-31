package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b71 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int c = 0;
    public m.p3 b;

    static {
        org.telegram.ui.Components.z41.h(new b71());
    }

    @Override // org.telegram.ui.Components.z41
    public final void a(org.telegram.ui.Components.tk0 tk0Var, View view, org.telegram.ui.Components.a51 a51Var) {
        ((org.telegram.ui.Cells.s7) view).l(a51Var != null && a51Var.h, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((org.telegram.messenger.jj) a51Var.G, a51Var.v, false);
        s7Var.i(a51Var.e, false);
        s7Var.l(a51Var.h, false);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        if (this.b == null) {
            this.b = new m.p3(context, p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.b, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        return a51Var.q == a51Var2.q && a51Var.e == a51Var2.e && a51Var.B == a51Var2.B;
    }
}

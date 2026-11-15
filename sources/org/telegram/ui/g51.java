package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g51 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int c = 0;
    public m.o3 b;

    static {
        org.telegram.ui.Components.a41.h(new g51());
    }

    @Override // org.telegram.ui.Components.a41
    public final void a(org.telegram.ui.Components.uj0 uj0Var, View view, org.telegram.ui.Components.b41 b41Var) {
        ((org.telegram.ui.Cells.n7) view).l(b41Var != null && b41Var.h, false);
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        n7Var.k((org.telegram.messenger.gj) b41Var.G, b41Var.v, false);
        n7Var.i(b41Var.e, false);
        n7Var.l(b41Var.h, false);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.b == null) {
            this.b = new m.o3(context, e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.b, i7);
        n7Var.x0 = true;
        n7Var.e0 = true;
        return n7Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        return b41Var.q == b41Var2.q && b41Var.e == b41Var2.e && b41Var.B == b41Var2.B;
    }
}

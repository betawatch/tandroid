package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i51 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int c = 0;
    public ga.d b;

    static {
        org.telegram.ui.Components.m41.h(new i51());
    }

    @Override // org.telegram.ui.Components.m41
    public final void a(org.telegram.ui.Components.ek0 ek0Var, View view, org.telegram.ui.Components.n41 n41Var) {
        ((org.telegram.ui.Cells.o7) view).l(n41Var != null && n41Var.h, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.fj) n41Var.H, n41Var.w, false);
        o7Var.i(n41Var.e, false);
        o7Var.l(n41Var.h, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        if (this.b == null) {
            this.b = new ga.d(context, i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.b, i7);
        o7Var.x0 = true;
        o7Var.e0 = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        return n41Var.r == n41Var2.r && n41Var.e == n41Var2.e && n41Var.C == n41Var2.C;
    }
}

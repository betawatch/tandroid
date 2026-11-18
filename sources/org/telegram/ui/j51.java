package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j51 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int c = 0;
    public m.o3 b;

    static {
        org.telegram.ui.Components.k41.h(new j51());
    }

    @Override // org.telegram.ui.Components.k41
    public final void a(org.telegram.ui.Components.ck0 ck0Var, View view, org.telegram.ui.Components.l41 l41Var) {
        ((org.telegram.ui.Cells.o7) view).l(l41Var != null && l41Var.h, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.fj) l41Var.H, l41Var.w, false);
        o7Var.i(l41Var.e, false);
        o7Var.l(l41Var.h, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        if (this.b == null) {
            this.b = new m.o3(context, i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.b, i7);
        o7Var.x0 = true;
        o7Var.e0 = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.r == l41Var2.r && l41Var.e == l41Var2.e && l41Var.C == l41Var2.C;
    }
}

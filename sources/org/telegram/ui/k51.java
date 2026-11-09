package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k51 extends org.telegram.ui.Components.x31 {
    public static final /* synthetic */ int c = 0;
    public m.q3 b;

    static {
        org.telegram.ui.Components.x31.h(new k51());
    }

    @Override // org.telegram.ui.Components.x31
    public final void a(org.telegram.ui.Components.qj0 qj0Var, View view, org.telegram.ui.Components.y31 y31Var) {
        ((org.telegram.ui.Cells.o7) view).l(y31Var != null && y31Var.h, false);
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) y31Var.G, y31Var.v, false);
        o7Var.i(y31Var.e, false);
        o7Var.l(y31Var.h, false);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.b == null) {
            this.b = new m.q3(context, g6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.b, i7);
        o7Var.w0 = true;
        o7Var.d0 = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(org.telegram.ui.Components.y31 y31Var, org.telegram.ui.Components.y31 y31Var2) {
        return y31Var.q == y31Var2.q && y31Var.e == y31Var2.e && y31Var.B == y31Var2.B;
    }
}

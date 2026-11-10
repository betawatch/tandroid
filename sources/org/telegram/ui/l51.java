package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int c = 0;
    public m.q3 b;

    static {
        org.telegram.ui.Components.w31.h(new l51());
    }

    @Override // org.telegram.ui.Components.w31
    public final void a(org.telegram.ui.Components.pj0 pj0Var, View view, org.telegram.ui.Components.x31 x31Var) {
        ((org.telegram.ui.Cells.o7) view).l(x31Var != null && x31Var.h, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) x31Var.G, x31Var.v, false);
        o7Var.i(x31Var.e, false);
        o7Var.l(x31Var.h, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        if (this.b == null) {
            this.b = new m.q3(context, h6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.b, i7);
        o7Var.w0 = true;
        o7Var.d0 = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        return x31Var.q == x31Var2.q && x31Var.e == x31Var2.e && x31Var.B == x31Var2.B;
    }
}

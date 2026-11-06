package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j51 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int c = 0;
    public m.q3 b;

    static {
        org.telegram.ui.Components.q31.h(new j51());
    }

    @Override // org.telegram.ui.Components.q31
    public final void a(org.telegram.ui.Components.pj0 pj0Var, View view, org.telegram.ui.Components.r31 r31Var) {
        ((org.telegram.ui.Cells.o7) view).l(r31Var != null && r31Var.h, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) r31Var.G, r31Var.v, false);
        o7Var.i(r31Var.e, false);
        o7Var.l(r31Var.h, false);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.b == null) {
            this.b = new m.q3(context, f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.b, i7);
        o7Var.w0 = true;
        o7Var.d0 = true;
        return o7Var;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        return r31Var.q == r31Var2.q && r31Var.e == r31Var2.e && r31Var.B == r31Var2.B;
    }
}

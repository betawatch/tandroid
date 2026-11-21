package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j51 extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int c = 0;
    public m.o3 b;

    static {
        org.telegram.ui.Components.n41.h(new j51());
    }

    @Override // org.telegram.ui.Components.n41
    public final void a(org.telegram.ui.Components.ek0 ek0Var, View view, org.telegram.ui.Components.o41 o41Var) {
        ((org.telegram.ui.Cells.p7) view).l(o41Var != null && o41Var.h, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.k((org.telegram.messenger.fj) o41Var.H, o41Var.w, false);
        p7Var.i(o41Var.e, false);
        p7Var.l(o41Var.h, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        if (this.b == null) {
            this.b = new m.o3(context, h6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.b, i7);
        p7Var.x0 = true;
        p7Var.e0 = true;
        return p7Var;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        return o41Var.r == o41Var2.r && o41Var.e == o41Var2.e && o41Var.C == o41Var2.C;
    }
}

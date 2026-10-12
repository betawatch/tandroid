package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ob1 extends org.telegram.ui.Components.k61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.k61.setup(new ob1());
    }

    @Override // org.telegram.ui.Components.k61
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.l61 l61Var) {
        ((org.telegram.ui.Cells.t7) view).l(l61Var != null && l61Var.h, false);
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) l61Var.G, l61Var.v, false);
        t7Var.i(l61Var.e, false);
        t7Var.l(l61Var.h, false);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        return l61Var.q == l61Var2.q && l61Var.e == l61Var2.e && l61Var.B == l61Var2.B;
    }
}

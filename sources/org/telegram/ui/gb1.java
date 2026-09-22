package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gb1 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.h51.setup(new gb1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(org.telegram.ui.Components.ll0 ll0Var, View view, org.telegram.ui.Components.i51 i51Var) {
        ((org.telegram.ui.Cells.t7) view).l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) i51Var.G, i51Var.v, false);
        t7Var.i(i51Var.e, false);
        t7Var.l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        return i51Var.q == i51Var2.q && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B;
    }
}

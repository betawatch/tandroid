package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.i51.setup(new hb1());
    }

    @Override // org.telegram.ui.Components.i51
    public final void attachedView(org.telegram.ui.Components.ml0 ml0Var, View view, org.telegram.ui.Components.j51 j51Var) {
        ((org.telegram.ui.Cells.t7) view).l(j51Var.h, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) j51Var.G, j51Var.v, false);
        t7Var.i(j51Var.e, false);
        t7Var.l(j51Var.h, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        return j51Var.q == j51Var2.q && j51Var.e == j51Var2.e && j51Var.B == j51Var2.B;
    }
}

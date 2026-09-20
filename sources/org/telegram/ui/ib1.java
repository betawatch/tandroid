package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.v51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.t7 a;

    static {
        org.telegram.ui.Components.v51.setup(new ib1());
    }

    @Override // org.telegram.ui.Components.v51
    public final void attachedView(org.telegram.ui.Components.vl0 vl0Var, View view, org.telegram.ui.Components.w51 w51Var) {
        ((org.telegram.ui.Cells.u7) view).l(w51Var.h, false);
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.k((MessageObject) w51Var.G, w51Var.v, false);
        u7Var.i(w51Var.e, false);
        u7Var.l(w51Var.h, false);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.t7(context, f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.a, i10);
        u7Var.w0 = true;
        u7Var.d0 = true;
        return u7Var;
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        return w51Var.q == w51Var2.q && w51Var.e == w51Var2.e && w51Var.B == w51Var2.B;
    }
}

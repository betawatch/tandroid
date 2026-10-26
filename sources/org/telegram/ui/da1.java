package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class da1 extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.v7 a;

    static {
        org.telegram.ui.Components.s61.setup(new da1());
    }

    @Override // org.telegram.ui.Components.s61
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.t61 t61Var) {
        ((org.telegram.ui.Cells.w7) view).l(t61Var != null && t61Var.h, false);
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        w7Var.k((MessageObject) t61Var.G, t61Var.v, false);
        w7Var.i(t61Var.e, false);
        w7Var.l(t61Var.h, false);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.v7(context, u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.a, i10);
        w7Var.w0 = true;
        w7Var.d0 = true;
        return w7Var;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        return t61Var.q == t61Var2.q && t61Var.e == t61Var2.e && t61Var.B == t61Var2.B;
    }
}

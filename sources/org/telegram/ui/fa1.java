package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fa1 extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.v7 a;

    static {
        org.telegram.ui.Components.t61.setup(new fa1());
    }

    @Override // org.telegram.ui.Components.t61
    public final void attachedView(org.telegram.ui.Components.nm0 nm0Var, View view, org.telegram.ui.Components.u61 u61Var) {
        ((org.telegram.ui.Cells.w7) view).l(u61Var != null && u61Var.h, false);
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        w7Var.k((MessageObject) u61Var.G, u61Var.v, false);
        w7Var.i(u61Var.e, false);
        w7Var.l(u61Var.h, false);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.v7(context, u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.a, i10);
        w7Var.w0 = true;
        w7Var.d0 = true;
        return w7Var;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        return u61Var.q == u61Var2.q && u61Var.e == u61Var2.e && u61Var.B == u61Var2.B;
    }
}

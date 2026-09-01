package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oa1 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.q7 a;

    static {
        org.telegram.ui.Components.i51.setup(new oa1());
    }

    @Override // org.telegram.ui.Components.i51
    public final void attachedView(org.telegram.ui.Components.tl0 tl0Var, View view, org.telegram.ui.Components.j51 j51Var) {
        ((org.telegram.ui.Cells.r7) view).l(j51Var.h, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) j51Var.G, j51Var.v, false);
        r7Var.i(j51Var.e, false);
        r7Var.l(j51Var.h, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.q7(context, g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.a, i10);
        r7Var.t0 = true;
        r7Var.a0 = true;
        return r7Var;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        return j51Var.q == j51Var2.q && j51Var.e == j51Var2.e && j51Var.B == j51Var2.B;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.o61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.s7 a;

    static {
        org.telegram.ui.Components.o61.setup(new ib1());
    }

    @Override // org.telegram.ui.Components.o61
    public final void attachedView(org.telegram.ui.Components.qm0 qm0Var, View view, org.telegram.ui.Components.p61 p61Var) {
        ((org.telegram.ui.Cells.t7) view).l(p61Var != null && p61Var.h, false);
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) p61Var.G, p61Var.v, false);
        t7Var.i(p61Var.e, false);
        t7Var.l(p61Var.h, false);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.s7(context, e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.a, i10);
        t7Var.w0 = true;
        t7Var.d0 = true;
        return t7Var;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        return p61Var.q == p61Var2.q && p61Var.e == p61Var2.e && p61Var.B == p61Var2.B;
    }
}

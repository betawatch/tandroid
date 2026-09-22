package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.x51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.t7 a;

    static {
        org.telegram.ui.Components.x51.setup(new ib1());
    }

    @Override // org.telegram.ui.Components.x51
    public final void attachedView(org.telegram.ui.Components.yl0 yl0Var, View view, org.telegram.ui.Components.y51 y51Var) {
        ((org.telegram.ui.Cells.u7) view).l(y51Var.h, false);
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.k((MessageObject) y51Var.G, y51Var.v, false);
        u7Var.i(y51Var.e, false);
        u7Var.l(y51Var.h, false);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.t7(context, f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.a, i10);
        u7Var.w0 = true;
        u7Var.d0 = true;
        return u7Var;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(org.telegram.ui.Components.y51 y51Var, org.telegram.ui.Components.y51 y51Var2) {
        return y51Var.q == y51Var2.q && y51Var.e == y51Var2.e && y51Var.B == y51Var2.B;
    }
}

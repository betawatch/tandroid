package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class na1 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.q7 a;

    static {
        org.telegram.ui.Components.h51.setup(new na1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(org.telegram.ui.Components.sl0 sl0Var, View view, org.telegram.ui.Components.i51 i51Var) {
        ((org.telegram.ui.Cells.r7) view).l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) i51Var.G, i51Var.v, false);
        r7Var.i(i51Var.e, false);
        r7Var.l(i51Var.h, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.q7(context, f6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.a, i10);
        r7Var.t0 = true;
        r7Var.a0 = true;
        return r7Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        return i51Var.q == i51Var2.q && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B;
    }
}

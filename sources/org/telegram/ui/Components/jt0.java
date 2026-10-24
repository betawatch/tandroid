package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jt0 extends FragmentContextView {
    public final /* synthetic */ xv0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, xv0 xv0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, xv0Var2, false, g6Var);
        this.X0 = xv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        xv0 xv0Var = this.X0;
        xv0Var.P0.i(xv0Var.Q0, i10 == 0, true);
    }
}

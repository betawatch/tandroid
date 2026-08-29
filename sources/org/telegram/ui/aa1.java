package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aa1 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.o7 a;

    static {
        org.telegram.ui.Components.v41.setup(new aa1());
    }

    @Override // org.telegram.ui.Components.v41
    public final void attachedView(org.telegram.ui.Components.jl0 jl0Var, View view, org.telegram.ui.Components.w41 w41Var) {
        ((org.telegram.ui.Cells.p7) view).l(w41Var.h, false);
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.k((MessageObject) w41Var.G, w41Var.v, false);
        p7Var.i(w41Var.e, false);
        p7Var.l(w41Var.h, false);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.o7(context, c6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.a, i10);
        p7Var.s0 = true;
        p7Var.W = true;
        return p7Var;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        return w41Var.q == w41Var2.q && w41Var.e == w41Var2.e && w41Var.B == w41Var2.B;
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

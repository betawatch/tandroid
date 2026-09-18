package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ls0 extends FragmentContextView {
    public final /* synthetic */ zu0 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, zu0 zu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, o2Var, zu0Var2, false, f6Var);
        this.P0 = zu0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        zu0 zu0Var = this.P0;
        zu0Var.P0.i(zu0Var.Q0, i10 == 0, true);
    }
}

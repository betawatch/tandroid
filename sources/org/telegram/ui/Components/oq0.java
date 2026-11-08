package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oq0 extends FragmentContextView {
    public final /* synthetic */ xs0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, xs0 xs0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, xs0Var2, false, f6Var);
        this.X0 = xs0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        xs0 xs0Var = this.X0;
        xs0Var.R0.i(xs0Var.S0, i7 == 0, true);
    }
}

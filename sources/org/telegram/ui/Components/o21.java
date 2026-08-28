package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o21 extends f2.n {
    public final /* synthetic */ z21 F;

    public o21(z21 z21Var) {
        this.F = z21Var;
    }

    @Override // f2.n
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override // f2.n
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}

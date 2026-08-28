package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q20 extends f2.n {
    public final /* synthetic */ o50 F;

    public q20(o50 o50Var) {
        this.F = o50Var;
    }

    @Override // f2.n
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        o50 o50Var = this.F;
        o50Var.M.invalidate();
        o50Var.W1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50.I0(o50Var);
    }
}

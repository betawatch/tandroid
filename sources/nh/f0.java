package nh;

import android.view.ViewGroup;
import f2.q1;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f0 extends f2.n {
    public final /* synthetic */ g0 F;

    public f0(g0 g0Var) {
        this.F = g0Var;
    }

    @Override // f2.n
    public final void M() {
        ViewGroup viewGroup;
        g0 g0Var = this.F;
        viewGroup = ((f3) g0Var.f).containerView;
        viewGroup.invalidate();
        g0Var.c.invalidate();
    }

    @Override // f2.n
    public final void O() {
        ViewGroup viewGroup;
        g0 g0Var = this.F;
        viewGroup = ((f3) g0Var.f).containerView;
        viewGroup.invalidate();
        g0Var.c.invalidate();
    }

    @Override // f2.n
    public final void P(q1 q1Var) {
        ViewGroup viewGroup;
        g0 g0Var = this.F;
        viewGroup = ((f3) g0Var.f).containerView;
        viewGroup.invalidate();
        g0Var.c.invalidate();
        g0Var.d.invalidate();
    }

    @Override // f2.n
    public final void Q() {
        ViewGroup viewGroup;
        g0 g0Var = this.F;
        viewGroup = ((f3) g0Var.f).containerView;
        viewGroup.invalidate();
        g0Var.c.invalidate();
    }

    @Override // f2.t1
    public final boolean t(q1 q1Var) {
        return true;
    }
}

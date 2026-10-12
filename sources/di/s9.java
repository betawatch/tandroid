package di;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class s9 extends s4.k {
    public final /* synthetic */ x9 F;

    public s9(x9 x9Var) {
        this.F = x9Var;
    }

    @Override // s4.k
    public final void M() {
        ViewGroup viewGroup;
        x9 x9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x9Var.W).containerView;
        viewGroup.invalidate();
        x9Var.e.invalidate();
    }

    @Override // s4.k
    public final void O() {
        ViewGroup viewGroup;
        x9 x9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x9Var.W).containerView;
        viewGroup.invalidate();
        x9Var.e.invalidate();
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        x9 x9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x9Var.W).containerView;
        viewGroup.invalidate();
        x9Var.e.invalidate();
        x9Var.f.invalidate();
    }

    @Override // s4.k
    public final void Q() {
        ViewGroup viewGroup;
        x9 x9Var = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x9Var.W).containerView;
        viewGroup.invalidate();
        x9Var.e.invalidate();
    }

    @Override // s4.e1
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}

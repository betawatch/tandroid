package gi;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e3;
import s4.b1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g0 extends s4.k {
    public final /* synthetic */ h0 F;

    public g0(h0 h0Var) {
        this.F = h0Var;
    }

    @Override // s4.k
    public final void M() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((e3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.k
    public final void O() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((e3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.k
    public final void P(b1 b1Var) {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((e3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
        h0Var.d.invalidate();
    }

    @Override // s4.k
    public final void Q() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((e3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.e1
    public final boolean t(b1 b1Var) {
        return true;
    }
}

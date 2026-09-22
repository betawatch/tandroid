package fi;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f3;
import s4.c1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g0 extends s4.j {
    public final /* synthetic */ h0 F;

    public g0(h0 h0Var) {
        this.F = h0Var;
    }

    @Override // s4.j
    public final void M() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((f3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.j
    public final void O() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((f3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.j
    public final void P(c1 c1Var) {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((f3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
        h0Var.d.invalidate();
    }

    @Override // s4.j
    public final void Q() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((f3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.f1
    public final boolean t(c1 c1Var) {
        return true;
    }
}

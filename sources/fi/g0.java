package fi;

import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g3;
import s4.c1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        viewGroup = ((g3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.j
    public final void O() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((g3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.j
    public final void P(c1 c1Var) {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((g3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
        h0Var.d.invalidate();
    }

    @Override // s4.j
    public final void Q() {
        ViewGroup viewGroup;
        h0 h0Var = this.F;
        viewGroup = ((g3) h0Var.f).containerView;
        viewGroup.invalidate();
        h0Var.c.invalidate();
    }

    @Override // s4.f1
    public final boolean t(c1 c1Var) {
        return true;
    }
}

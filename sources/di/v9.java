package di;

import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class v9 extends s4.j {
    public final /* synthetic */ ba F;

    public v9(ba baVar) {
        this.F = baVar;
    }

    @Override // s4.j
    public final void M() {
        ViewGroup viewGroup;
        ba baVar = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.f3) baVar.W).containerView;
        viewGroup.invalidate();
        baVar.e.invalidate();
    }

    @Override // s4.j
    public final void O() {
        ViewGroup viewGroup;
        ba baVar = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.f3) baVar.W).containerView;
        viewGroup.invalidate();
        baVar.e.invalidate();
    }

    @Override // s4.j
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        ba baVar = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.f3) baVar.W).containerView;
        viewGroup.invalidate();
        baVar.e.invalidate();
        baVar.f.invalidate();
    }

    @Override // s4.j
    public final void Q() {
        ViewGroup viewGroup;
        ba baVar = this.F;
        viewGroup = ((org.telegram.ui.ActionBar.f3) baVar.W).containerView;
        viewGroup.invalidate();
        baVar.e.invalidate();
    }

    @Override // s4.f1
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}

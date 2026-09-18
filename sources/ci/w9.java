package ci;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class w9 extends s4.j {
    public final /* synthetic */ ba F;

    public w9(ba baVar) {
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

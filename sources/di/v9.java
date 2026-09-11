package di;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

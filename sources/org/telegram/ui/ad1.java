package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cd1 a;

    public ad1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        cd1 cd1Var = this.a;
        org.telegram.messenger.ij ijVar = cd1Var.n;
        if (i7 == -1) {
            cd1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                cd1.a0(cd1Var.d, ijVar, cd1Var.getParentActivity(), cd1Var.r, cd1Var.e);
            }
        } else if (ijVar != null) {
            ijVar.k.with_my_score = false;
            cd1Var.showDialog(org.telegram.ui.Components.no0.N0(cd1Var.getParentActivity(), ijVar, null, false, cd1Var.h));
        }
    }
}

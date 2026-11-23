package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cd1 a;

    public ad1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        cd1 cd1Var = this.a;
        org.telegram.messenger.gj gjVar = cd1Var.n;
        if (i7 == -1) {
            cd1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                cd1.a0(cd1Var.d, gjVar, cd1Var.getParentActivity(), cd1Var.r, cd1Var.e);
            }
        } else if (gjVar != null) {
            gjVar.k.with_my_score = false;
            cd1Var.showDialog(org.telegram.ui.Components.ap0.O0(cd1Var.getParentActivity(), gjVar, null, false, cd1Var.h));
        }
    }
}

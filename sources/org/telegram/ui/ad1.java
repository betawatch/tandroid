package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cd1 a;

    public ad1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        cd1 cd1Var = this.a;
        org.telegram.messenger.fj fjVar = cd1Var.n;
        if (i7 == -1) {
            cd1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                cd1.a0(cd1Var.d, fjVar, cd1Var.getParentActivity(), cd1Var.r, cd1Var.e);
            }
        } else if (fjVar != null) {
            fjVar.k.with_my_score = false;
            cd1Var.showDialog(org.telegram.ui.Components.yo0.O0(cd1Var.getParentActivity(), fjVar, null, false, cd1Var.h));
        }
    }
}

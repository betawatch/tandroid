package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            cd1Var.showDialog(org.telegram.ui.Components.ap0.O0(cd1Var.getParentActivity(), fjVar, null, false, cd1Var.h));
        }
    }
}

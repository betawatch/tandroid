package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bd1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ dd1 a;

    public bd1(dd1 dd1Var) {
        this.a = dd1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        dd1 dd1Var = this.a;
        org.telegram.messenger.ij ijVar = dd1Var.n;
        if (i7 == -1) {
            dd1Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                dd1.a0(dd1Var.d, ijVar, dd1Var.getParentActivity(), dd1Var.r, dd1Var.e);
            }
        } else if (ijVar != null) {
            ijVar.k.with_my_score = false;
            dd1Var.showDialog(org.telegram.ui.Components.mo0.N0(dd1Var.getParentActivity(), ijVar, null, false, dd1Var.h));
        }
    }
}

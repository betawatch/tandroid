package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bn extends qf.c {
    public final /* synthetic */ org.telegram.ui.Cells.s1 d;
    public final /* synthetic */ fn e;

    public bn(fn fnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = fnVar;
        this.d = s1Var;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new uj(this.e.a, 10), 250L);
    }

    @Override // qf.c
    public final void d() {
        fn fnVar = this.e;
        un unVar = fnVar.a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        unVar.Sb = s1Var.getMessageObject().getId();
        un unVar2 = fnVar.a;
        unVar2.Tb = 2;
        unVar2.Ub = null;
        s1Var.invalidate();
    }
}

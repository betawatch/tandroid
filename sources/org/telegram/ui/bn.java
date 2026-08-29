package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bn extends ye.c {
    public final /* synthetic */ org.telegram.ui.Cells.s1 d;
    public final /* synthetic */ fn e;

    public bn(fn fnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = fnVar;
        this.d = s1Var;
    }

    @Override // ye.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rj(this.e.a, 8), 250L);
    }

    @Override // ye.c
    public final void d() {
        fn fnVar = this.e;
        tn tnVar = fnVar.a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        tnVar.sb = s1Var.getMessageObject().getId();
        tn tnVar2 = fnVar.a;
        tnVar2.tb = 2;
        tnVar2.ub = null;
        s1Var.invalidate();
    }
}

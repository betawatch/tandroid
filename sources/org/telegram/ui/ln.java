package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ln extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ pn e;

    public ln(pn pnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = pnVar;
        this.d = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ck(this.e.a, 8), 250L);
    }

    @Override // nf.e
    public final void d() {
        pn pnVar = this.e;
        eo eoVar = pnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        eoVar.wb = t1Var.getMessageObject().getId();
        eo eoVar2 = pnVar.a;
        eoVar2.xb = 2;
        eoVar2.yb = null;
        t1Var.invalidate();
    }
}

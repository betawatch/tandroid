package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class en extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ in e;

    public en(in inVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = inVar;
        this.d = u1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new xj(this.e.a, 8), 250L);
    }

    @Override // nf.e
    public final void d() {
        in inVar = this.e;
        wn wnVar = inVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        wnVar.vb = u1Var.getMessageObject().getId();
        wn wnVar2 = inVar.a;
        wnVar2.wb = 2;
        wnVar2.xb = null;
        u1Var.invalidate();
    }
}

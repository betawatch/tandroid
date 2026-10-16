package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mn extends pf.c {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ qn e;

    public mn(qn qnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = qnVar;
        this.d = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gk(this.e.a, 9), 250L);
    }

    @Override // pf.c
    public final void d() {
        qn qnVar = this.e;
        fo foVar = qnVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        foVar.wb = u1Var.getMessageObject().getId();
        fo foVar2 = qnVar.a;
        foVar2.xb = 2;
        foVar2.yb = null;
        u1Var.invalidate();
    }
}

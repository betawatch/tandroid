package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class an extends pf.c {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ en e;

    public an(en enVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = enVar;
        this.d = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new vj(this.e.a, 9), 250L);
    }

    @Override // pf.c
    public final void d() {
        en enVar = this.e;
        sn snVar = enVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        snVar.wb = u1Var.getMessageObject().getId();
        sn snVar2 = enVar.a;
        snVar2.xb = 2;
        snVar2.yb = null;
        u1Var.invalidate();
    }
}

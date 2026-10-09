package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hn extends of.e {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ ln e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = lnVar;
        this.d = u1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ck(this.e.a, 9), 250L);
    }

    @Override // of.e
    public final void d() {
        ln lnVar = this.e;
        zn znVar = lnVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.wb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.a;
        znVar2.xb = 2;
        znVar2.yb = null;
        u1Var.invalidate();
    }
}

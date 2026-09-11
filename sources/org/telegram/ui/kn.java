package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class kn extends of.e {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ on e;

    public kn(on onVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = onVar;
        this.d = t1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ak(this.e.a, 8), 250L);
    }

    @Override // of.e
    public final void d() {
        on onVar = this.e;
        co coVar = onVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        coVar.wb = t1Var.getMessageObject().getId();
        co coVar2 = onVar.a;
        coVar2.xb = 2;
        coVar2.yb = null;
        t1Var.invalidate();
    }
}

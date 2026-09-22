package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jn extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ nn e;

    public jn(nn nnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = nnVar;
        this.d = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ak(this.e.a, 8), 250L);
    }

    @Override // nf.e
    public final void d() {
        nn nnVar = this.e;
        bo boVar = nnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        boVar.vb = t1Var.getMessageObject().getId();
        bo boVar2 = nnVar.a;
        boVar2.wb = 2;
        boVar2.xb = null;
        t1Var.invalidate();
    }
}

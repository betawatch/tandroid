package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fn extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ jn e;

    public fn(jn jnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = jnVar;
        this.d = t1Var;
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
        jn jnVar = this.e;
        xn xnVar = jnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        xnVar.vb = t1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.a;
        xnVar2.wb = 2;
        xnVar2.xb = null;
        t1Var.invalidate();
    }
}

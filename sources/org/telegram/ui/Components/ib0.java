package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ib0 extends g.o {
    public final /* synthetic */ ob0 c;

    public ib0(ob0 ob0Var) {
        this.c = ob0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        ob0 ob0Var = this.c;
        hg.j1 j1Var = ob0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = j1Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (j1Var.I() != null || j1Var.U != null) {
            i10 = i11;
        }
        hb0 hb0Var = ob0Var.d;
        hb0Var.B1();
        return hb0Var.R.get(i10);
    }
}

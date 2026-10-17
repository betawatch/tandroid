package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class cb0 extends g.o {
    public final /* synthetic */ ib0 c;

    public cb0(ib0 ib0Var) {
        this.c = ib0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        ib0 ib0Var = this.c;
        hg.j1 j1Var = ib0Var.f;
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
        bb0 bb0Var = ib0Var.d;
        bb0Var.B1();
        return bb0Var.R.get(i10);
    }
}

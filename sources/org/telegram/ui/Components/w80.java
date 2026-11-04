package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w80 extends g.p {
    public final /* synthetic */ c90 c;

    public w80(c90 c90Var) {
        this.c = c90Var;
    }

    @Override // g.p
    public final int i(int i3) {
        c90 c90Var = this.c;
        kg.e1 e1Var = c90Var.f;
        if (i3 == 0) {
            return 100;
        }
        int i10 = i3 - 1;
        Object J = e1Var.J(i10);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (e1Var.I() != null || e1Var.V != null) {
            i3 = i10;
        }
        v80 v80Var = c90Var.d;
        v80Var.B1();
        return v80Var.R.get(i3);
    }
}

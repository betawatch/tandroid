package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ta0 extends g.p {
    public final /* synthetic */ za0 c;

    public ta0(za0 za0Var) {
        this.c = za0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        za0 za0Var = this.c;
        gg.k1 k1Var = za0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = k1Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (k1Var.I() != null || k1Var.U != null) {
            i10 = i11;
        }
        sa0 sa0Var = za0Var.d;
        sa0Var.B1();
        return sa0Var.R.get(i10);
    }
}

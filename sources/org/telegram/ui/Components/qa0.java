package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qa0 extends g.p {
    public final /* synthetic */ wa0 c;

    public qa0(wa0 wa0Var) {
        this.c = wa0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        wa0 wa0Var = this.c;
        gg.k1 k1Var = wa0Var.f;
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
        pa0 pa0Var = wa0Var.d;
        pa0Var.B1();
        return pa0Var.R.get(i10);
    }
}

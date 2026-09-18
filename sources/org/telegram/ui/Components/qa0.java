package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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

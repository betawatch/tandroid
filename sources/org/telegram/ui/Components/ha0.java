package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ha0 extends g.p {
    public final /* synthetic */ na0 c;

    public ha0(na0 na0Var) {
        this.c = na0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        na0 na0Var = this.c;
        gg.k1 k1Var = na0Var.f;
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
        ga0 ga0Var = na0Var.d;
        ga0Var.B1();
        return ga0Var.R.get(i10);
    }
}

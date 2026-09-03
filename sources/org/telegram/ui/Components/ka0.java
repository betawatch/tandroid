package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ka0 extends f2.v {
    public final /* synthetic */ qa0 c;

    public ka0(qa0 qa0Var) {
        this.c = qa0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        qa0 qa0Var = this.c;
        tf.u0 u0Var = qa0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = u0Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (u0Var.I() != null || u0Var.R != null) {
            i10 = i11;
        }
        ja0 ja0Var = qa0Var.d;
        ja0Var.B1();
        return ja0Var.R.get(i10);
    }
}

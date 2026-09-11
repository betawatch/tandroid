package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ia0 extends g.p {
    public final /* synthetic */ oa0 c;

    public ia0(oa0 oa0Var) {
        this.c = oa0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        oa0 oa0Var = this.c;
        hg.k1 k1Var = oa0Var.f;
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
        ha0 ha0Var = oa0Var.d;
        ha0Var.B1();
        return ha0Var.R.get(i10);
    }
}

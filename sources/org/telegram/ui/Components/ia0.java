package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c90 extends g.p {
    public final /* synthetic */ i90 c;

    public c90(i90 i90Var) {
        this.c = i90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        i90 i90Var = this.c;
        jg.h1 h1Var = i90Var.f;
        if (i7 == 0) {
            return 100;
        }
        int i10 = i7 - 1;
        Object J = h1Var.J(i10);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (h1Var.I() != null || h1Var.V != null) {
            i7 = i10;
        }
        b90 b90Var = i90Var.d;
        b90Var.B1();
        return b90Var.R.get(i7);
    }
}

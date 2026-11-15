package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d90 extends g.p {
    public final /* synthetic */ j90 c;

    public d90(j90 j90Var) {
        this.c = j90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        j90 j90Var = this.c;
        jg.h1 h1Var = j90Var.f;
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
        c90 c90Var = j90Var.d;
        c90Var.B1();
        return c90Var.R.get(i7);
    }
}

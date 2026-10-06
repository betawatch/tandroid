package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class va0 extends g.p {
    public final /* synthetic */ bb0 c;

    public va0(bb0 bb0Var) {
        this.c = bb0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        bb0 bb0Var = this.c;
        gg.k1 k1Var = bb0Var.f;
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
        ua0 ua0Var = bb0Var.d;
        ua0Var.B1();
        return ua0Var.R.get(i10);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sa0 extends g.p {
    public final /* synthetic */ ya0 c;

    public sa0(ya0 ya0Var) {
        this.c = ya0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        ya0 ya0Var = this.c;
        gg.k1 k1Var = ya0Var.f;
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
        ra0 ra0Var = ya0Var.d;
        ra0Var.B1();
        return ra0Var.R.get(i10);
    }
}

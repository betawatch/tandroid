package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class la0 extends f2.v {
    public final /* synthetic */ ra0 c;

    public la0(ra0 ra0Var) {
        this.c = ra0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        ra0 ra0Var = this.c;
        uf.u0 u0Var = ra0Var.f;
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
        ka0 ka0Var = ra0Var.d;
        ka0Var.B1();
        return ka0Var.R.get(i10);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jb0 extends g.o {
    public final /* synthetic */ pb0 c;

    public jb0(pb0 pb0Var) {
        this.c = pb0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        pb0 pb0Var = this.c;
        gg.j1 j1Var = pb0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = j1Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (j1Var.I() != null || j1Var.U != null) {
            i10 = i11;
        }
        ib0 ib0Var = pb0Var.d;
        ib0Var.B1();
        return ib0Var.R.get(i10);
    }
}

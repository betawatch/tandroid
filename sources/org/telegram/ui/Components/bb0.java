package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bb0 extends g.o {
    public final /* synthetic */ hb0 c;

    public bb0(hb0 hb0Var) {
        this.c = hb0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        hb0 hb0Var = this.c;
        ig.j1 j1Var = hb0Var.f;
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
        ab0 ab0Var = hb0Var.d;
        ab0Var.C1();
        return ab0Var.R.get(i10);
    }
}

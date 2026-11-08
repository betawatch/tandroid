package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a90 extends g.p {
    public final /* synthetic */ g90 c;

    public a90(g90 g90Var) {
        this.c = g90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        g90 g90Var = this.c;
        jg.i1 i1Var = g90Var.f;
        if (i7 == 0) {
            return 100;
        }
        int i10 = i7 - 1;
        Object J = i1Var.J(i10);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (i1Var.I() != null || i1Var.U != null) {
            i7 = i10;
        }
        z80 z80Var = g90Var.d;
        z80Var.B1();
        return z80Var.R.get(i7);
    }
}

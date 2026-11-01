package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s90 extends g.o {
    public final /* synthetic */ y90 c;

    public s90(y90 y90Var) {
        this.c = y90Var;
    }

    @Override // g.o
    public final int i(int i10) {
        y90 y90Var = this.c;
        zf.x0 x0Var = y90Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = x0Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (x0Var.I() != null || x0Var.U != null) {
            i10 = i11;
        }
        r90 r90Var = y90Var.d;
        r90Var.B1();
        return r90Var.R.get(i10);
    }
}

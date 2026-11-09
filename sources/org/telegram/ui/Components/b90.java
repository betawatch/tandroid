package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b90 extends g.p {
    public final /* synthetic */ h90 c;

    public b90(h90 h90Var) {
        this.c = h90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        h90 h90Var = this.c;
        jg.i1 i1Var = h90Var.f;
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
        a90 a90Var = h90Var.d;
        a90Var.B1();
        return a90Var.R.get(i7);
    }
}

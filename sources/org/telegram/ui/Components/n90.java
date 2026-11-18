package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n90 extends g.p {
    public final /* synthetic */ t90 c;

    public n90(t90 t90Var) {
        this.c = t90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        t90 t90Var = this.c;
        jg.h1 h1Var = t90Var.f;
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
        m90 m90Var = t90Var.d;
        m90Var.B1();
        return m90Var.R.get(i7);
    }
}

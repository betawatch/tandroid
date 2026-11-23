package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m90 extends g.p {
    public final /* synthetic */ s90 c;

    public m90(s90 s90Var) {
        this.c = s90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        s90 s90Var = this.c;
        jg.h1 h1Var = s90Var.f;
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
        l90 l90Var = s90Var.d;
        l90Var.B1();
        return l90Var.R.get(i7);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p90 extends g.p {
    public final /* synthetic */ v90 c;

    public p90(v90 v90Var) {
        this.c = v90Var;
    }

    @Override // g.p
    public final int i(int i7) {
        v90 v90Var = this.c;
        jg.h1 h1Var = v90Var.f;
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
        o90 o90Var = v90Var.d;
        o90Var.B1();
        return o90Var.R.get(i7);
    }
}

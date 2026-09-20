package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pa0 extends g.p {
    public final /* synthetic */ va0 c;

    public pa0(va0 va0Var) {
        this.c = va0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        va0 va0Var = this.c;
        gg.k1 k1Var = va0Var.f;
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
        oa0 oa0Var = va0Var.d;
        oa0Var.B1();
        return oa0Var.R.get(i10);
    }
}

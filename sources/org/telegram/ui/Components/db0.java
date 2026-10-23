package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class db0 extends g.o {
    public final /* synthetic */ jb0 c;

    public db0(jb0 jb0Var) {
        this.c = jb0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        jb0 jb0Var = this.c;
        hg.j1 j1Var = jb0Var.f;
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
        cb0 cb0Var = jb0Var.d;
        cb0Var.B1();
        return cb0Var.R.get(i10);
    }
}

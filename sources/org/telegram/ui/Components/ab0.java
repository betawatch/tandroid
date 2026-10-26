package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ab0 extends g.o {
    public final /* synthetic */ gb0 c;

    public ab0(gb0 gb0Var) {
        this.c = gb0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        gb0 gb0Var = this.c;
        ig.j1 j1Var = gb0Var.f;
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
        za0 za0Var = gb0Var.d;
        za0Var.C1();
        return za0Var.R.get(i10);
    }
}

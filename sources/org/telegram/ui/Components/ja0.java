package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ja0 extends f2.v {
    public final /* synthetic */ pa0 c;

    public ja0(pa0 pa0Var) {
        this.c = pa0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        pa0 pa0Var = this.c;
        tf.u0 u0Var = pa0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = u0Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (u0Var.I() != null || u0Var.R != null) {
            i10 = i11;
        }
        ia0 ia0Var = pa0Var.d;
        ia0Var.B1();
        return ia0Var.R.get(i10);
    }
}

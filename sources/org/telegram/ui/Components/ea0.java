package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ea0 extends f2.v {
    public final /* synthetic */ ka0 c;

    public ea0(ka0 ka0Var) {
        this.c = ka0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        ka0 ka0Var = this.c;
        rf.v0 v0Var = ka0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = v0Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (v0Var.I() != null || v0Var.Q != null) {
            i10 = i11;
        }
        da0 da0Var = ka0Var.d;
        da0Var.B1();
        return da0Var.R.get(i10);
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q90 extends f2.x {
    public final /* synthetic */ w90 c;

    public q90(w90 w90Var) {
        this.c = w90Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        w90 w90Var = this.c;
        of.f1 f1Var = w90Var.f;
        if (i9 == 0) {
            return 100;
        }
        int i10 = i9 - 1;
        Object J = f1Var.J(i10);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (f1Var.I() != null || f1Var.Q != null) {
            i9 = i10;
        }
        p90 p90Var = w90Var.d;
        p90Var.B1();
        return p90Var.R.get(i9);
    }
}

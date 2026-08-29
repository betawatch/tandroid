package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yo implements hc1 {
    public final /* synthetic */ gp a;

    public yo(gp gpVar) {
        this.a = gpVar;
    }

    @Override // org.telegram.ui.hc1
    public final boolean U0() {
        return true;
    }

    @Override // org.telegram.ui.hc1
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.hc1
    public final void j1(boolean z10) {
        gp gpVar = this.a;
        org.telegram.ui.tn tnVar = gpVar.v;
        gpVar.J = !gpVar.J;
        if (gpVar.I != null) {
            gpVar.L = true;
            tnVar.a7 = true;
            TLRPC.WallPaper wallPaper = gpVar.v() ? null : gpVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = gpVar.I.a;
            if (b4Var.a) {
                gpVar.n.i(null, wallPaper, z10, Boolean.valueOf(gpVar.J), false);
            } else {
                gpVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(gpVar.J), false);
            }
            tnVar.a7 = false;
        }
    }
}

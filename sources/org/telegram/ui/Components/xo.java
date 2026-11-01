package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c91;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xo implements c91 {
    public final /* synthetic */ dp a;

    public xo(dp dpVar) {
        this.a = dpVar;
    }

    @Override // org.telegram.ui.c91
    public final void M1(boolean z10) {
        dp dpVar = this.a;
        org.telegram.ui.un unVar = dpVar.r1;
        dpVar.D1 = !dpVar.D1;
        if (dpVar.C1 != null) {
            dpVar.F1 = true;
            unVar.u7 = true;
            TLRPC.WallPaper wallPaper = dpVar.P0() ? null : dpVar.o1.g;
            org.telegram.ui.ActionBar.y3 y3Var = dpVar.C1.a;
            if (y3Var.a) {
                dpVar.o1.r(null, wallPaper, z10, Boolean.valueOf(dpVar.D1), false);
            } else {
                dpVar.o1.r(y3Var, wallPaper, z10, Boolean.valueOf(dpVar.D1), false);
            }
            unVar.u7 = false;
        }
    }

    @Override // org.telegram.ui.c91
    public final boolean a() {
        return this.a.D1;
    }

    @Override // org.telegram.ui.c91
    public final boolean b1() {
        return true;
    }
}

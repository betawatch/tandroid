package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class po implements org.telegram.ui.d71 {
    public final /* synthetic */ vo a;

    public po(vo voVar) {
        this.a = voVar;
    }

    @Override // org.telegram.ui.d71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.d71
    public final boolean a() {
        return this.a.E1;
    }

    @Override // org.telegram.ui.d71
    public final void l1(boolean z10) {
        vo voVar = this.a;
        org.telegram.ui.wm wmVar = voVar.s1;
        voVar.E1 = !voVar.E1;
        if (voVar.D1 != null) {
            voVar.G1 = true;
            wmVar.v7 = true;
            TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.p1.g;
            org.telegram.ui.ActionBar.p3 p3Var = voVar.D1.a;
            if (p3Var.a) {
                voVar.p1.r(null, wallPaper, z10, Boolean.valueOf(voVar.E1), false);
            } else {
                voVar.p1.r(p3Var, wallPaper, z10, Boolean.valueOf(voVar.E1), false);
            }
            wmVar.v7 = false;
        }
    }
}

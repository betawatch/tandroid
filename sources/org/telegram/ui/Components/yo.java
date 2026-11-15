package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.ui.l71 {
    public final /* synthetic */ ep a;

    public yo(ep epVar) {
        this.a = epVar;
    }

    @Override // org.telegram.ui.l71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.l71
    public final boolean a() {
        return this.a.H1;
    }

    @Override // org.telegram.ui.l71
    public final void m1(boolean z10) {
        ep epVar = this.a;
        org.telegram.ui.an anVar = epVar.v1;
        epVar.H1 = !epVar.H1;
        if (epVar.G1 != null) {
            epVar.J1 = true;
            anVar.v7 = true;
            TLRPC.WallPaper wallPaper = epVar.P0() ? null : epVar.s1.g;
            org.telegram.ui.ActionBar.p3 p3Var = epVar.G1.a;
            if (p3Var.a) {
                epVar.s1.r(null, wallPaper, z10, Boolean.valueOf(epVar.H1), false);
            } else {
                epVar.s1.r(p3Var, wallPaper, z10, Boolean.valueOf(epVar.H1), false);
            }
            anVar.v7 = false;
        }
    }
}

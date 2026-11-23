package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hp implements org.telegram.ui.p71 {
    public final /* synthetic */ np a;

    public hp(np npVar) {
        this.a = npVar;
    }

    @Override // org.telegram.ui.p71
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.p71
    public final boolean d() {
        return this.a.H1;
    }

    @Override // org.telegram.ui.p71
    public final void l1(boolean z10) {
        np npVar = this.a;
        org.telegram.ui.bn bnVar = npVar.v1;
        npVar.H1 = !npVar.H1;
        if (npVar.G1 != null) {
            npVar.J1 = true;
            bnVar.w7 = true;
            TLRPC.WallPaper wallPaper = npVar.Q0() ? null : npVar.s1.g;
            org.telegram.ui.ActionBar.s3 s3Var = npVar.G1.a;
            if (s3Var.a) {
                npVar.s1.r(null, wallPaper, z10, Boolean.valueOf(npVar.H1), false);
            } else {
                npVar.s1.r(s3Var, wallPaper, z10, Boolean.valueOf(npVar.H1), false);
            }
            bnVar.w7 = false;
        }
    }
}

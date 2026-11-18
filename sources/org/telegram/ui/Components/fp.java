package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fp implements org.telegram.ui.p71 {
    public final /* synthetic */ lp a;

    public fp(lp lpVar) {
        this.a = lpVar;
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
        lp lpVar = this.a;
        org.telegram.ui.bn bnVar = lpVar.v1;
        lpVar.H1 = !lpVar.H1;
        if (lpVar.G1 != null) {
            lpVar.J1 = true;
            bnVar.w7 = true;
            TLRPC.WallPaper wallPaper = lpVar.Q0() ? null : lpVar.s1.g;
            org.telegram.ui.ActionBar.t3 t3Var = lpVar.G1.a;
            if (t3Var.a) {
                lpVar.s1.r(null, wallPaper, z10, Boolean.valueOf(lpVar.H1), false);
            } else {
                lpVar.s1.r(t3Var, wallPaper, z10, Boolean.valueOf(lpVar.H1), false);
            }
            bnVar.w7 = false;
        }
    }
}

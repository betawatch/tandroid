package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ep implements org.telegram.ui.n71 {
    public final /* synthetic */ kp a;

    public ep(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.n71
    public final boolean O0() {
        return true;
    }

    @Override // org.telegram.ui.n71
    public final boolean b() {
        return this.a.H1;
    }

    @Override // org.telegram.ui.n71
    public final void b1(boolean z10) {
        kp kpVar = this.a;
        org.telegram.ui.bn bnVar = kpVar.v1;
        kpVar.H1 = !kpVar.H1;
        if (kpVar.G1 != null) {
            kpVar.J1 = true;
            bnVar.w7 = true;
            TLRPC.WallPaper wallPaper = kpVar.Q0() ? null : kpVar.s1.g;
            org.telegram.ui.ActionBar.s3 s3Var = kpVar.G1.a;
            if (s3Var.a) {
                kpVar.s1.r(null, wallPaper, z10, Boolean.valueOf(kpVar.H1), false);
            } else {
                kpVar.s1.r(s3Var, wallPaper, z10, Boolean.valueOf(kpVar.H1), false);
            }
            bnVar.w7 = false;
        }
    }
}

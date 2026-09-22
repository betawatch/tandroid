package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ep implements nd1 {
    public final /* synthetic */ mp a;

    public ep(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.nd1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.nd1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.nd1
    public final void o1(boolean z10) {
        mp mpVar = this.a;
        org.telegram.ui.bo boVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            boVar.e7 = true;
            TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
            org.telegram.ui.ActionBar.d4 d4Var = mpVar.M.a;
            if (d4Var.a) {
                mpVar.n.i(null, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.n.i(d4Var, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            }
            boVar.e7 = false;
        }
    }
}

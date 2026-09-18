package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ep implements od1 {
    public final /* synthetic */ mp a;

    public ep(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.od1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.od1
    public final void o1(boolean z10) {
        mp mpVar = this.a;
        org.telegram.ui.bo boVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            boVar.e7 = true;
            TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
            org.telegram.ui.ActionBar.e4 e4Var = mpVar.M.a;
            if (e4Var.a) {
                mpVar.n.i(null, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.n.i(e4Var, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            }
            boVar.e7 = false;
        }
    }
}

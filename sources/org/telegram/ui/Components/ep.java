package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ep implements od1 {
    public final /* synthetic */ mp a;

    public ep(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.od1
    public final boolean V0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.od1
    public final void o1(boolean z10) {
        mp mpVar = this.a;
        org.telegram.ui.zn znVar = mpVar.v;
        mpVar.N = !mpVar.N;
        if (mpVar.M != null) {
            mpVar.P = true;
            znVar.e7 = true;
            TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
            org.telegram.ui.ActionBar.d4 d4Var = mpVar.M.a;
            if (d4Var.a) {
                mpVar.n.i(null, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            } else {
                mpVar.n.i(d4Var, wallPaper, z10, Boolean.valueOf(mpVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}

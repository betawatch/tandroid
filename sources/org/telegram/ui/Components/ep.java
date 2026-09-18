package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.md1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ep implements md1 {
    public final /* synthetic */ mp a;

    public ep(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.md1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.md1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.md1
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

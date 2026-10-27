package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sp implements mc1 {
    public final /* synthetic */ zp a;

    public sp(zp zpVar) {
        this.a = zpVar;
    }

    @Override // org.telegram.ui.mc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.mc1
    public final boolean a() {
        return this.a.M;
    }

    @Override // org.telegram.ui.mc1
    public final void j1(boolean z10) {
        zp zpVar = this.a;
        org.telegram.ui.wn wnVar = zpVar.v;
        zpVar.M = !zpVar.M;
        if (zpVar.L != null) {
            zpVar.O = true;
            wnVar.u7 = true;
            TLRPC.WallPaper wallPaper = zpVar.A() ? null : zpVar.n.g;
            org.telegram.ui.ActionBar.h4 h4Var = zpVar.L.a;
            if (h4Var.a) {
                zpVar.n.q(null, wallPaper, z10, Boolean.valueOf(zpVar.M), false);
            } else {
                zpVar.n.q(h4Var, wallPaper, z10, Boolean.valueOf(zpVar.M), false);
            }
            wnVar.u7 = false;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rp implements kc1 {
    public final /* synthetic */ yp a;

    public rp(yp ypVar) {
        this.a = ypVar;
    }

    @Override // org.telegram.ui.kc1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.kc1
    public final boolean a() {
        return this.a.M;
    }

    @Override // org.telegram.ui.kc1
    public final void j1(boolean z10) {
        yp ypVar = this.a;
        org.telegram.ui.un unVar = ypVar.v;
        ypVar.M = !ypVar.M;
        if (ypVar.L != null) {
            ypVar.O = true;
            unVar.q7 = true;
            TLRPC.WallPaper wallPaper = ypVar.A() ? null : ypVar.n.g;
            org.telegram.ui.ActionBar.h4 h4Var = ypVar.L.a;
            if (h4Var.a) {
                ypVar.n.q(null, wallPaper, z10, Boolean.valueOf(ypVar.M), false);
            } else {
                ypVar.n.q(h4Var, wallPaper, z10, Boolean.valueOf(ypVar.M), false);
            }
            unVar.q7 = false;
        }
    }
}

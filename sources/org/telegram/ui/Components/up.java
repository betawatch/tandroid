package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.od1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class up implements od1 {
    public final /* synthetic */ cq a;

    public up(cq cqVar) {
        this.a = cqVar;
    }

    @Override // org.telegram.ui.od1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.od1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.od1
    public final void l1(boolean z10) {
        cq cqVar = this.a;
        org.telegram.ui.zn znVar = cqVar.v;
        cqVar.N = !cqVar.N;
        if (cqVar.M != null) {
            cqVar.P = true;
            znVar.e7 = true;
            TLRPC.WallPaper wallPaper = cqVar.x() ? null : cqVar.n.h;
            org.telegram.ui.ActionBar.c4 c4Var = cqVar.M.a;
            if (c4Var.a) {
                cqVar.n.i(null, wallPaper, z10, Boolean.valueOf(cqVar.N), false);
            } else {
                cqVar.n.i(c4Var, wallPaper, z10, Boolean.valueOf(cqVar.N), false);
            }
            znVar.e7 = false;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class dp implements nd1 {
    public final /* synthetic */ lp a;

    public dp(lp lpVar) {
        this.a = lpVar;
    }

    @Override // org.telegram.ui.nd1
    public final boolean Z0() {
        return true;
    }

    @Override // org.telegram.ui.nd1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.nd1
    public final void p1(boolean z10) {
        lp lpVar = this.a;
        org.telegram.ui.co coVar = lpVar.v;
        lpVar.N = !lpVar.N;
        if (lpVar.M != null) {
            lpVar.P = true;
            coVar.e7 = true;
            TLRPC.WallPaper wallPaper = lpVar.v() ? null : lpVar.n.h;
            org.telegram.ui.ActionBar.d4 d4Var = lpVar.M.a;
            if (d4Var.a) {
                lpVar.n.i(null, wallPaper, z10, Boolean.valueOf(lpVar.N), false);
            } else {
                lpVar.n.i(d4Var, wallPaper, z10, Boolean.valueOf(lpVar.N), false);
            }
            coVar.e7 = false;
        }
    }
}

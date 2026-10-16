package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.td1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rp implements td1 {
    public final /* synthetic */ zp a;

    public rp(zp zpVar) {
        this.a = zpVar;
    }

    @Override // org.telegram.ui.td1
    public final boolean Y0() {
        return true;
    }

    @Override // org.telegram.ui.td1
    public final boolean a() {
        return this.a.N;
    }

    @Override // org.telegram.ui.td1
    public final void o1(boolean z10) {
        zp zpVar = this.a;
        org.telegram.ui.fo foVar = zpVar.v;
        zpVar.N = !zpVar.N;
        if (zpVar.M != null) {
            zpVar.P = true;
            foVar.e7 = true;
            TLRPC.WallPaper wallPaper = zpVar.x() ? null : zpVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = zpVar.M.a;
            if (b4Var.a) {
                zpVar.n.i(null, wallPaper, z10, Boolean.valueOf(zpVar.N), false);
            } else {
                zpVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(zpVar.N), false);
            }
            foVar.e7 = false;
        }
    }
}

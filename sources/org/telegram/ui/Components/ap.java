package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ad1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ap implements ad1 {
    public final /* synthetic */ jp a;

    public ap(jp jpVar) {
        this.a = jpVar;
    }

    @Override // org.telegram.ui.ad1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.ad1
    public final boolean a() {
        return this.a.K;
    }

    @Override // org.telegram.ui.ad1
    public final void l1(boolean z4) {
        jp jpVar = this.a;
        org.telegram.ui.zn znVar = jpVar.v;
        jpVar.K = !jpVar.K;
        if (jpVar.J != null) {
            jpVar.M = true;
            znVar.b7 = true;
            TLRPC.WallPaper wallPaper = jpVar.v() ? null : jpVar.n.h;
            org.telegram.ui.ActionBar.e4 e4Var = jpVar.J.a;
            if (e4Var.a) {
                jpVar.n.i(null, wallPaper, z4, Boolean.valueOf(jpVar.K), false);
            } else {
                jpVar.n.i(e4Var, wallPaper, z4, Boolean.valueOf(jpVar.K), false);
            }
            znVar.b7 = false;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class so implements ec1 {
    public final /* synthetic */ ap a;

    public so(ap apVar) {
        this.a = apVar;
    }

    @Override // org.telegram.ui.ec1
    public final boolean X0() {
        return true;
    }

    @Override // org.telegram.ui.ec1
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ec1
    public final void n1(boolean z10) {
        ap apVar = this.a;
        org.telegram.ui.rn rnVar = apVar.v;
        apVar.J = !apVar.J;
        if (apVar.I != null) {
            apVar.L = true;
            rnVar.a7 = true;
            TLRPC.WallPaper wallPaper = apVar.w() ? null : apVar.n.h;
            org.telegram.ui.ActionBar.b4 b4Var = apVar.I.a;
            if (b4Var.a) {
                apVar.n.i(null, wallPaper, z10, Boolean.valueOf(apVar.J), false);
            } else {
                apVar.n.i(b4Var, wallPaper, z10, Boolean.valueOf(apVar.J), false);
            }
            rnVar.a7 = false;
        }
    }
}

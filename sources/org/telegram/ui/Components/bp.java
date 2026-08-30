package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bp implements tc1 {
    public final /* synthetic */ kp a;

    public bp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // org.telegram.ui.tc1
    public final boolean V0() {
        return true;
    }

    @Override // org.telegram.ui.tc1
    public final boolean a() {
        return this.a.K;
    }

    @Override // org.telegram.ui.tc1
    public final void n1(boolean z4) {
        kp kpVar = this.a;
        org.telegram.ui.xn xnVar = kpVar.v;
        kpVar.K = !kpVar.K;
        if (kpVar.J != null) {
            kpVar.M = true;
            xnVar.b7 = true;
            TLRPC.WallPaper wallPaper = kpVar.v() ? null : kpVar.n.h;
            org.telegram.ui.ActionBar.e4 e4Var = kpVar.J.a;
            if (e4Var.a) {
                kpVar.n.i(null, wallPaper, z4, Boolean.valueOf(kpVar.K), false);
            } else {
                kpVar.n.i(e4Var, wallPaper, z4, Boolean.valueOf(kpVar.K), false);
            }
            xnVar.b7 = false;
        }
    }
}

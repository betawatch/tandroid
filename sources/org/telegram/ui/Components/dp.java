package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dp implements vc1 {
    public final /* synthetic */ mp a;

    public dp(mp mpVar) {
        this.a = mpVar;
    }

    @Override // org.telegram.ui.vc1
    public final boolean T0() {
        return true;
    }

    @Override // org.telegram.ui.vc1
    public final boolean a() {
        return this.a.K;
    }

    @Override // org.telegram.ui.vc1
    public final void l1(boolean z4) {
        mp mpVar = this.a;
        org.telegram.ui.xn xnVar = mpVar.v;
        mpVar.K = !mpVar.K;
        if (mpVar.J != null) {
            mpVar.M = true;
            xnVar.b7 = true;
            TLRPC.WallPaper wallPaper = mpVar.v() ? null : mpVar.n.h;
            org.telegram.ui.ActionBar.f4 f4Var = mpVar.J.a;
            if (f4Var.a) {
                mpVar.n.i(null, wallPaper, z4, Boolean.valueOf(mpVar.K), false);
            } else {
                mpVar.n.i(f4Var, wallPaper, z4, Boolean.valueOf(mpVar.K), false);
            }
            xnVar.b7 = false;
        }
    }
}

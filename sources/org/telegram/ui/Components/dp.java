package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ad1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dp implements ad1 {
    public final /* synthetic */ mp a;

    public dp(mp mpVar) {
        this.a = mpVar;
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

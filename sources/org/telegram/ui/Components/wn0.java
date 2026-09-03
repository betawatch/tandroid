package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wn0 extends uf.z {
    public final /* synthetic */ org.telegram.ui.py F0;
    public final /* synthetic */ Context G0;
    public final /* synthetic */ org.telegram.ui.yx H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(org.telegram.ui.yx yxVar, Context context, org.telegram.ui.py pyVar, int i10, int i11, f2.l lVar, boolean z4, org.telegram.ui.py pyVar2, Context context2) {
        super(context, pyVar, i10, i11, lVar, z4);
        this.H0 = yxVar;
        this.F0 = pyVar2;
        this.G0 = context2;
    }

    @Override // f2.p0
    public final void l() {
        mh.d1 d1Var;
        int i10 = this.y0;
        super.l();
        org.telegram.ui.yx yxVar = this.H0;
        if (!yxVar.F0 && (d1Var = yxVar.S) != null) {
            d1Var.u0(0);
            yxVar.F0 = true;
        }
        if (h() != 0 || i10 == 0 || this.A0 > 0) {
            return;
        }
        yxVar.T.e(false, false);
    }
}

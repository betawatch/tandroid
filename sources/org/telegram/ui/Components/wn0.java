package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wn0 extends tf.z {
    public final /* synthetic */ org.telegram.ui.oy F0;
    public final /* synthetic */ Context G0;
    public final /* synthetic */ org.telegram.ui.xx H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn0(org.telegram.ui.xx xxVar, Context context, org.telegram.ui.oy oyVar, int i10, int i11, f2.l lVar, boolean z4, org.telegram.ui.oy oyVar2, Context context2) {
        super(context, oyVar, i10, i11, lVar, z4);
        this.H0 = xxVar;
        this.F0 = oyVar2;
        this.G0 = context2;
    }

    @Override // f2.o0
    public final void l() {
        lh.e1 e1Var;
        int i10 = this.y0;
        super.l();
        org.telegram.ui.xx xxVar = this.H0;
        if (!xxVar.F0 && (e1Var = xxVar.S) != null) {
            e1Var.u0(0);
            xxVar.F0 = true;
        }
        if (h() != 0 || i10 == 0 || this.A0 > 0) {
            return;
        }
        xxVar.T.e(false, false);
    }
}

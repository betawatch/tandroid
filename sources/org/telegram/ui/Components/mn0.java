package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mn0 extends rf.a0 {
    public final /* synthetic */ org.telegram.ui.fy E0;
    public final /* synthetic */ Context F0;
    public final /* synthetic */ org.telegram.ui.ox G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(org.telegram.ui.ox oxVar, Context context, org.telegram.ui.fy fyVar, int i10, int i11, f2.l lVar, boolean z10, org.telegram.ui.fy fyVar2, Context context2) {
        super(context, fyVar, i10, i11, lVar, z10);
        this.G0 = oxVar;
        this.E0 = fyVar2;
        this.F0 = context2;
    }

    @Override // f2.p0
    public final void l() {
        jh.e1 e1Var;
        int i10 = this.x0;
        super.l();
        org.telegram.ui.ox oxVar = this.G0;
        if (!oxVar.E0 && (e1Var = oxVar.R) != null) {
            e1Var.u0(0);
            oxVar.E0 = true;
        }
        if (h() != 0 || i10 == 0 || this.z0 > 0) {
            return;
        }
        oxVar.S.e(false, false);
    }
}

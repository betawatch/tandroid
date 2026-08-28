package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class an0 extends of.f0 {
    public final /* synthetic */ org.telegram.ui.dy E0;
    public final /* synthetic */ Context F0;
    public final /* synthetic */ org.telegram.ui.mx G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(org.telegram.ui.mx mxVar, Context context, org.telegram.ui.dy dyVar, int i9, int i10, f2.n nVar, boolean z10, org.telegram.ui.dy dyVar2, Context context2) {
        super(context, dyVar, i9, i10, nVar, z10);
        this.G0 = mxVar;
        this.E0 = dyVar2;
        this.F0 = context2;
    }

    @Override // f2.r0
    public final void l() {
        gh.f1 f1Var;
        int i9 = this.x0;
        super.l();
        org.telegram.ui.mx mxVar = this.G0;
        if (!mxVar.E0 && (f1Var = mxVar.R) != null) {
            f1Var.u0(0);
            mxVar.E0 = true;
        }
        if (h() != 0 || i9 == 0 || this.z0 > 0) {
            return;
        }
        mxVar.S.e(false, false);
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qx extends xu0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ rx I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(rx rxVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(i3, context, e6Var);
        this.I3 = rxVar;
        this.H3 = i10;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean D1() {
        return org.telegram.messenger.lc.e(8200);
    }

    @Override // org.telegram.ui.Components.xu0
    public final void H1(int i3) {
        sv svVar;
        jw jwVar;
        super.H1(i3);
        rx rxVar = this.I3;
        ey eyVar = rxVar.H;
        qx qxVar = rxVar.r;
        boolean z10 = qxVar.getSelectedCategory() == null;
        int i10 = ey.V2;
        eyVar.M(z10);
        int i11 = this.H3;
        if (i11 == 1 && (jwVar = eyVar.J) != null) {
            jwVar.n(qxVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (svVar = eyVar.C0) != null) {
            svVar.p0 = qxVar.getSelectedCategory() == null;
            svVar.invalidate();
        }
        rxVar.g(false);
    }
}

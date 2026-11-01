package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hy extends cw0 {
    public final /* synthetic */ int G3;
    public final /* synthetic */ iy H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(iy iyVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(i10, context, p6Var);
        this.H3 = iyVar;
        this.G3 = i11;
    }

    @Override // org.telegram.ui.Components.cw0
    public final boolean D1() {
        return org.telegram.messenger.tc.e(8200);
    }

    @Override // org.telegram.ui.Components.cw0
    public final void H1(int i10) {
        gw gwVar;
        zw zwVar;
        super.H1(i10);
        iy iyVar = this.H3;
        vy vyVar = iyVar.G;
        hy hyVar = iyVar.r;
        boolean z10 = hyVar.getSelectedCategory() == null;
        int i11 = vy.U2;
        vyVar.N(z10);
        int i12 = this.G3;
        if (i12 == 1 && (zwVar = vyVar.I) != null) {
            zwVar.n(hyVar.getSelectedCategory() == null);
        } else if (i12 == 0 && (gwVar = vyVar.B0) != null) {
            gwVar.o0 = hyVar.getSelectedCategory() == null;
            gwVar.invalidate();
        }
        iyVar.g(false);
    }
}

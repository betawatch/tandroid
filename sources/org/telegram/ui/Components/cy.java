package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cy extends kv0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ dy I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(dy dyVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(i7, context, i6Var);
        this.I3 = dyVar;
        this.H3 = i10;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean D1() {
        return org.telegram.messenger.pc.e(8200);
    }

    @Override // org.telegram.ui.Components.kv0
    public final void H1(int i7) {
        ew ewVar;
        vw vwVar;
        super.H1(i7);
        dy dyVar = this.I3;
        qy qyVar = dyVar.H;
        cy cyVar = dyVar.r;
        boolean z10 = cyVar.getSelectedCategory() == null;
        int i10 = qy.V2;
        qyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (vwVar = qyVar.J) != null) {
            vwVar.n(cyVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (ewVar = qyVar.C0) != null) {
            ewVar.p0 = cyVar.getSelectedCategory() == null;
            ewVar.invalidate();
        }
        dyVar.g(false);
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xx extends av0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ yx I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(yx yxVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(i7, context, e6Var);
        this.I3 = yxVar;
        this.H3 = i10;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return org.telegram.messenger.qc.e(8200);
    }

    @Override // org.telegram.ui.Components.av0
    public final void H1(int i7) {
        zv zvVar;
        qw qwVar;
        super.H1(i7);
        yx yxVar = this.I3;
        ly lyVar = yxVar.H;
        xx xxVar = yxVar.r;
        boolean z10 = xxVar.getSelectedCategory() == null;
        int i10 = ly.V2;
        lyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (qwVar = lyVar.J) != null) {
            qwVar.n(xxVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (zvVar = lyVar.C0) != null) {
            zvVar.p0 = xxVar.getSelectedCategory() == null;
            zvVar.invalidate();
        }
        yxVar.g(false);
    }
}

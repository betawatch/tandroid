package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fy extends lv0 {
    public final /* synthetic */ int H3;
    public final /* synthetic */ gy I3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(gy gyVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(i7, context, h6Var);
        this.I3 = gyVar;
        this.H3 = i10;
    }

    @Override // org.telegram.ui.Components.lv0
    public final boolean D1() {
        return org.telegram.messenger.qc.e(8200);
    }

    @Override // org.telegram.ui.Components.lv0
    public final void H1(int i7) {
        hw hwVar;
        yw ywVar;
        super.H1(i7);
        gy gyVar = this.I3;
        ty tyVar = gyVar.H;
        fy fyVar = gyVar.r;
        boolean z10 = fyVar.getSelectedCategory() == null;
        int i10 = ty.V2;
        tyVar.N(z10);
        int i11 = this.H3;
        if (i11 == 1 && (ywVar = tyVar.J) != null) {
            ywVar.n(fyVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (hwVar = tyVar.C0) != null) {
            hwVar.p0 = fyVar.getSelectedCategory() == null;
            hwVar.invalidate();
        }
        gyVar.g(false);
    }
}

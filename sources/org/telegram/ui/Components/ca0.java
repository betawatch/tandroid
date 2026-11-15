package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ca0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ org.telegram.ui.y7 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, false, mVar, e6Var);
        this.zd = y7Var;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        ((ea0) this.zd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        ea0.b((ea0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void x3(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.x3(gjVar, bjVar, z10, z11, z12, z13);
        ea0.b((ea0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((ea0) this.zd.d).f.invalidate();
    }
}

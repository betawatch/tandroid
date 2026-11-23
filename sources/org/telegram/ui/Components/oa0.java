package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class oa0 extends org.telegram.ui.Cells.r1 {
    public final /* synthetic */ org.telegram.ui.y7 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, false, mVar, h6Var);
        this.zd = y7Var;
    }

    @Override // org.telegram.ui.Cells.r1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        ((qa0) this.zd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.r1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        qa0.b((qa0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.r1
    public final void y3(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.y3(gjVar, bjVar, z10, z11, z12, z13);
        qa0.b((qa0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((qa0) this.zd.d).f.invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ba0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ org.telegram.ui.y7 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, false, mVar, e6Var);
        this.zd = y7Var;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        ((da0) this.zd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        da0.b((da0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void x3(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.x3(gjVar, bjVar, z10, z11, z12, z13);
        da0.b((da0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((da0) this.zd.d).f.invalidate();
    }
}

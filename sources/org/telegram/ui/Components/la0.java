package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class la0 extends org.telegram.ui.Cells.r1 {
    public final /* synthetic */ org.telegram.ui.z7 zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(org.telegram.ui.z7 z7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, false, mVar, i6Var);
        this.zd = z7Var;
    }

    @Override // org.telegram.ui.Cells.r1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        ((na0) this.zd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.r1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        na0.b((na0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.r1
    public final void y3(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.y3(fjVar, ajVar, z10, z11, z12, z13);
        na0.b((na0) this.zd.d, this);
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((na0) this.zd.d).f.invalidate();
    }
}

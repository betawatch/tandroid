package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sa0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ org.telegram.ui.x7 hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(org.telegram.ui.x7 x7Var, Context context, int i10, li.k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, false, kVar, p6Var);
        this.hd = x7Var;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        ((ua0) this.hd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ua0.b((ua0) this.hd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void s3(org.telegram.messenger.jj jjVar, org.telegram.messenger.ej ejVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.s3(jjVar, ejVar, z10, z11, z12, z13);
        ua0.b((ua0) this.hd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        ((ua0) this.hd.d).f.invalidate();
    }
}

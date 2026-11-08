package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class aa0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ org.telegram.ui.x7 ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(org.telegram.ui.x7 x7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, false, mVar, f6Var);
        this.ld = x7Var;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        super.invalidate();
        ((ca0) this.ld.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ca0.b((ca0) this.ld.d, this);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void w3(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        super.w3(ijVar, djVar, z9, z10, z11, z12);
        ca0.b((ca0) this.ld.d, this);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((ca0) this.ld.d).f.invalidate();
    }
}

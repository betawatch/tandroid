package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v90 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ org.telegram.ui.y7 kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(org.telegram.ui.y7 y7Var, Context context, int i3, k4.j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, false, jVar, e6Var);
        this.kd = y7Var;
    }

    @Override // org.telegram.ui.Cells.q1, org.telegram.ui.Cells.z, android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        super.invalidate();
        ((x90) this.kd.d).f.invalidate();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        x90.b((x90) this.kd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void u3(org.telegram.messenger.zi ziVar, org.telegram.messenger.ui uiVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.u3(ziVar, uiVar, z10, z11, z12, z13);
        x90.b((x90) this.kd.d, this);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        ((x90) this.kd.d).f.invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zl0 extends q20 {
    public final /* synthetic */ org.telegram.ui.cw f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl0(org.telegram.ui.cw cwVar, tj0 tj0Var, Context context, int i3) {
        super(tj0Var, context, i3);
        this.f0 = cwVar;
    }

    @Override // org.telegram.ui.Components.f41
    public final void O(boolean z10) {
        super.O(z10);
        vl0 vl0Var = this.f0.v0;
        vl0Var.e(false, z10);
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.e.setVisibility(8);
    }
}

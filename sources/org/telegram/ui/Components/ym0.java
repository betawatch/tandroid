package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ym0 extends m30 {
    public final /* synthetic */ org.telegram.ui.jx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(org.telegram.ui.jx jxVar, uk0 uk0Var, Context context, int i10) {
        super(uk0Var, context, i10);
        this.e0 = jxVar;
    }

    @Override // org.telegram.ui.Components.q51
    public final void O(boolean z10) {
        super.O(z10);
        um0 um0Var = this.e0.u0;
        um0Var.e(false, z10);
        um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var.e.setVisibility(8);
    }
}

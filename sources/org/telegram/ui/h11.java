package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h11 extends org.telegram.ui.Components.lv0 {
    public final /* synthetic */ k01 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h11(k01 k01Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.H3 = k01Var;
    }

    @Override // org.telegram.ui.Components.lv0
    public final boolean D1() {
        return org.telegram.messenger.qc.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // org.telegram.ui.Components.lv0
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}

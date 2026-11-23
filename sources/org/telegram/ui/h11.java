package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c11 extends org.telegram.ui.Components.av0 {
    public final /* synthetic */ f01 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(f01 f01Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.H3 = f01Var;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return org.telegram.messenger.qc.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // org.telegram.ui.Components.av0
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}

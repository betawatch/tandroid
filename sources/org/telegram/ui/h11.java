package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h11 extends org.telegram.ui.Components.av0 {
    public final /* synthetic */ k01 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h11(k01 k01Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.G3 = k01Var;
    }

    @Override // org.telegram.ui.Components.av0
    public final boolean D1() {
        return org.telegram.messenger.sc.e(16388) || this.G3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.av0
    public final void H1(int i7) {
        super.H1(i7);
        this.G3.d(false);
    }
}

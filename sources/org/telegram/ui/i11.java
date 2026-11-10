package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i11 extends org.telegram.ui.Components.zu0 {
    public final /* synthetic */ l01 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i11(l01 l01Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.G3 = l01Var;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean D1() {
        return org.telegram.messenger.sc.e(16388) || this.G3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void H1(int i7) {
        super.H1(i7);
        this.G3.d(false);
    }
}

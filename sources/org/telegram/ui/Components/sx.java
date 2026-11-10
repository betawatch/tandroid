package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sx extends zu0 {
    public final /* synthetic */ int G3;
    public final /* synthetic */ tx H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(tx txVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(i7, context, h6Var);
        this.H3 = txVar;
        this.G3 = i10;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean D1() {
        return org.telegram.messenger.sc.e(8200);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void H1(int i7) {
        tv tvVar;
        kw kwVar;
        super.H1(i7);
        tx txVar = this.H3;
        gy gyVar = txVar.G;
        sx sxVar = txVar.r;
        boolean z9 = sxVar.getSelectedCategory() == null;
        int i10 = gy.U2;
        gyVar.M(z9);
        int i11 = this.G3;
        if (i11 == 1 && (kwVar = gyVar.I) != null) {
            kwVar.n(sxVar.getSelectedCategory() == null);
        } else if (i11 == 0 && (tvVar = gyVar.B0) != null) {
            tvVar.o0 = sxVar.getSelectedCategory() == null;
            tvVar.invalidate();
        }
        txVar.g(false);
    }
}

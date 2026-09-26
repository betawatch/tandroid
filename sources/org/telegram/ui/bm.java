package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ jm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = jmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        wn wnVar = this.L.Q;
        int i10 = wn.Gc;
        return wnVar.R8();
    }
}

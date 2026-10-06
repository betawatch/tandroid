package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        yn ynVar = this.L.Q;
        int i10 = yn.Bc;
        return ynVar.S8();
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ jm I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.I = jmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        xn xnVar = this.I.N;
        int i10 = xn.Ec;
        return xnVar.R8();
    }
}

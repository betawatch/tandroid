package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bm extends org.telegram.ui.Cells.f0 {
    public final /* synthetic */ fm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.L = fmVar;
    }

    @Override // org.telegram.ui.Cells.f0
    public final int getSideMenuWidth() {
        un unVar = this.L.Q;
        int i10 = un.ad;
        return unVar.e9();
    }
}

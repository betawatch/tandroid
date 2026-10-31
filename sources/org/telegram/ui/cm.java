package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ fm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.f = fmVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        un unVar = this.f.Q;
        int i10 = un.ad;
        return unVar.e9();
    }
}

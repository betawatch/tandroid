package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ mm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(mm mmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = mmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        zn znVar = this.L.Q;
        int i10 = zn.Hc;
        return znVar.W8();
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ mm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(mm mmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f = mmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        zn znVar = this.f.Q;
        int i10 = zn.Hc;
        return znVar.W8();
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ jm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f = jmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        wn wnVar = this.f.Q;
        int i10 = wn.Gc;
        return wnVar.R8();
    }
}

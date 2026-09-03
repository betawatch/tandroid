package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ lm I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.I = lmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        zn znVar = this.I.N;
        int i10 = zn.Ec;
        return znVar.R8();
    }
}

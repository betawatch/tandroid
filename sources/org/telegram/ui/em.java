package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ lm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f = lmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        zn znVar = this.f.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}

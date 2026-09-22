package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ lm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = lmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        zn znVar = this.f.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}

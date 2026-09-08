package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ om L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(om omVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.L = omVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        co coVar = this.L.Q;
        int i10 = co.Hc;
        return coVar.R8();
    }
}

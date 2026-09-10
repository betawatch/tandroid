package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ pm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(pm pmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.L = pmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        eo eoVar = this.L.Q;
        int i10 = eo.Hc;
        return eoVar.R8();
    }
}

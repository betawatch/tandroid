package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ pm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(pm pmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = pmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        eo eoVar = this.f.Q;
        int i10 = eo.Hc;
        return eoVar.R8();
    }
}

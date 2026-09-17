package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ om f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(om omVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = omVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        co coVar = this.f.Q;
        int i10 = co.Hc;
        return coVar.R8();
    }
}

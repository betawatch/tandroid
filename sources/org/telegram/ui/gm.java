package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ nm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(nm nmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = nmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        bo boVar = this.f.Q;
        int i10 = bo.Gc;
        return boVar.R8();
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ lm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.L = lmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        zn znVar = this.L.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}

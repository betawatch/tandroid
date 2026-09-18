package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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

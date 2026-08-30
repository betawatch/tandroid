package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ jm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(jm jmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = jmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        xn xnVar = this.f.N;
        int i10 = xn.Ec;
        return xnVar.R8();
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Cells.f0 {
    public final /* synthetic */ jl L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.L = jlVar;
    }

    @Override // org.telegram.ui.Cells.f0
    public final int getSideMenuWidth() {
        an anVar = this.L.Q;
        int i7 = an.id;
        return anVar.l9();
    }
}

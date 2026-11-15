package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Cells.f0 {
    public final /* synthetic */ jl M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.M = jlVar;
    }

    @Override // org.telegram.ui.Cells.f0
    public final int getSideMenuWidth() {
        an anVar = this.M.R;
        int i7 = an.ld;
        return anVar.n9();
    }
}

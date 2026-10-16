package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ rm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(rm rmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.L = rmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        fo foVar = this.L.Q;
        int i10 = fo.Hc;
        return foVar.W8();
    }
}

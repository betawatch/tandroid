package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Cells.i0 {
    public final /* synthetic */ rm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(rm rmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.L = rmVar;
    }

    @Override // org.telegram.ui.Cells.i0
    public final int getSideMenuWidth() {
        fo foVar = this.L.Q;
        int i10 = fo.Hc;
        return foVar.W8();
    }
}

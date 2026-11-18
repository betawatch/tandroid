package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gl extends org.telegram.ui.Cells.g0 {
    public final /* synthetic */ kl M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.M = klVar;
    }

    @Override // org.telegram.ui.Cells.g0
    public final int getSideMenuWidth() {
        bn bnVar = this.M.R;
        int i7 = bn.md;
        return bnVar.n9();
    }
}

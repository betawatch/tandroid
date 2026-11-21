package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gl extends org.telegram.ui.Cells.g0 {
    public final /* synthetic */ kl M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(kl klVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.M = klVar;
    }

    @Override // org.telegram.ui.Cells.g0
    public final int getSideMenuWidth() {
        bn bnVar = this.M.R;
        int i7 = bn.md;
        return bnVar.n9();
    }
}

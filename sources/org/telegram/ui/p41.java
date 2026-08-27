package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p41 extends w51 {
    public final /* synthetic */ View M;
    public final /* synthetic */ TL_stars.TL_starGiftUnique N;
    public final /* synthetic */ q41 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p41(q41 q41Var, Context context, Runnable runnable, View view, j51 j51Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(q41Var.e, context, runnable, view, j51Var, c6Var);
        this.O = q41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.w51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.O.e.T0 = null;
    }
}

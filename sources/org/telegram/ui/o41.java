package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o41 extends v51 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ p41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(p41 p41Var, Context context, Runnable runnable, View view, i51 i51Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(p41Var.e, context, runnable, view, i51Var, d6Var);
        this.S = p41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.v51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

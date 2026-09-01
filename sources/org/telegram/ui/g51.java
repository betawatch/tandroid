package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g51 extends n61 {
    public final /* synthetic */ View N;
    public final /* synthetic */ TL_stars.TL_starGiftUnique O;
    public final /* synthetic */ h51 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(h51 h51Var, Context context, Runnable runnable, View view, a61 a61Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h51Var.e, context, runnable, view, a61Var, g6Var);
        this.P = h51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.n61, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.P.e.U0 = null;
    }
}

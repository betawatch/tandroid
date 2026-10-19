package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m41 extends t51 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ n41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(n41 n41Var, Context context, Runnable runnable, View view, g51 g51Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(n41Var.e, context, runnable, view, g51Var, d6Var);
        this.S = n41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.t51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

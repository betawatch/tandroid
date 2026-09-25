package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p51 extends w61 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ q51 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(q51 q51Var, Context context, Runnable runnable, View view, j61 j61Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(q51Var.e, context, runnable, view, j61Var, d6Var);
        this.S = q51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.w61, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

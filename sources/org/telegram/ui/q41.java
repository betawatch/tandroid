package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q41 extends x51 {
    public final /* synthetic */ View M;
    public final /* synthetic */ TL_stars.TL_starGiftUnique N;
    public final /* synthetic */ r41 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(r41 r41Var, Context context, Runnable runnable, View view, k51 k51Var, org.telegram.ui.ActionBar.b6 b6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(r41Var.e, context, runnable, view, k51Var, b6Var);
        this.O = r41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.x51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.O.e.T0 = null;
    }
}

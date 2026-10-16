package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g61 extends n71 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ h61 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(h61 h61Var, Context context, Runnable runnable, View view, a71 a71Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h61Var.e, context, runnable, view, a71Var, c6Var);
        this.S = h61Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.n71, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

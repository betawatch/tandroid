package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q41 extends x51 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ r41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(r41 r41Var, Context context, Runnable runnable, View view, k51 k51Var, org.telegram.ui.ActionBar.g6 g6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(r41Var.e, context, runnable, view, k51Var, g6Var);
        this.S = r41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.x51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

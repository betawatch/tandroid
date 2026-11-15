package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d01 extends j11 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ e01 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(e01 e01Var, Context context, Runnable runnable, View view, x01 x01Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(e01Var.e, context, runnable, view, x01Var, e6Var);
        this.T = e01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.j11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h01 extends n11 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ i01 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h01(i01 i01Var, Context context, Runnable runnable, View view, b11 b11Var, org.telegram.ui.ActionBar.i6 i6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(i01Var.e, context, runnable, view, b11Var, i6Var);
        this.T = i01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.n11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}

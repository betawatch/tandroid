package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g01 extends m11 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ h01 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(h01 h01Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.i6 i6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h01Var.e, context, runnable, view, a11Var, i6Var);
        this.T = h01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.m11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}

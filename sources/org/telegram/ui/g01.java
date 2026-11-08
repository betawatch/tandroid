package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g01 extends m11 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ h01 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(h01 h01Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(h01Var.e, context, runnable, view, a11Var, f6Var);
        this.S = h01Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.m11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

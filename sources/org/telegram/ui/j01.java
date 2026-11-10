package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j01 extends p11 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ k01 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(k01 k01Var, Context context, Runnable runnable, View view, d11 d11Var, org.telegram.ui.ActionBar.h6 h6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(k01Var.e, context, runnable, view, d11Var, h6Var);
        this.S = k01Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.p11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}

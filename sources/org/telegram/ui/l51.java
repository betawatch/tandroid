package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l51 extends t61 {
    public final /* synthetic */ View N;
    public final /* synthetic */ TL_stars.TL_starGiftUnique O;
    public final /* synthetic */ m51 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(m51 m51Var, Context context, Runnable runnable, View view, f61 f61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(m51Var.e, context, runnable, view, f61Var, f6Var);
        this.P = m51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.t61, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.P.e.U0 = null;
    }
}

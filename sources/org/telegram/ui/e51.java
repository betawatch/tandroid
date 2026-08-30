package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e51 extends m61 {
    public final /* synthetic */ View N;
    public final /* synthetic */ TL_stars.TL_starGiftUnique O;
    public final /* synthetic */ f51 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(f51 f51Var, Context context, Runnable runnable, View view, y51 y51Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(f51Var.e, context, runnable, view, y51Var, f6Var);
        this.P = f51Var;
        this.N = view2;
        this.O = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.m61, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.P.e.U0 = null;
    }
}

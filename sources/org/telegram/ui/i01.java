package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i01 extends o11 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ j01 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(j01 j01Var, Context context, Runnable runnable, View view, c11 c11Var, org.telegram.ui.ActionBar.h6 h6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(j01Var.e, context, runnable, view, c11Var, h6Var);
        this.T = j01Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.o11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}

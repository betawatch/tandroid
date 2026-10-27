package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f21 extends f61 {
    public final /* synthetic */ h21 e2;
    public final /* synthetic */ w51[] f2;
    public final /* synthetic */ i21 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(i21 i21Var, i21 i21Var2, Activity activity, Integer num, h21 h21Var, w51[] w51VarArr) {
        super(i21Var2, activity, false, num, 2, null);
        this.g2 = i21Var;
        this.e2 = h21Var;
        this.f2 = w51VarArr;
    }

    @Override // org.telegram.ui.f61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        i21 i21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.r2) i21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        h21 h21Var = this.e2;
        if (h21Var != null) {
            h21Var.a(true);
        }
        w51 w51Var = this.f2[0];
        if (w51Var != null) {
            i21Var.n = null;
            w51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.f61
    public final void r(o51 o51Var, bh.x0 x0Var) {
        int i10;
        i21 i21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.r2) i21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(x0Var.f);
        h21 h21Var = this.e2;
        if (h21Var != null) {
            h21Var.a(true);
        }
        w51 w51Var = this.f2[0];
        if (w51Var != null) {
            i21Var.n = null;
            w51Var.dismiss();
        }
    }
}

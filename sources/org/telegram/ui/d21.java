package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d21 extends c61 {
    public final /* synthetic */ f21 e2;
    public final /* synthetic */ t51[] f2;
    public final /* synthetic */ g21 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(g21 g21Var, g21 g21Var2, Activity activity, Integer num, f21 f21Var, t51[] t51VarArr) {
        super(g21Var2, activity, false, num, 2, null);
        this.g2 = g21Var;
        this.e2 = f21Var;
        this.f2 = t51VarArr;
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        g21 g21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        f21 f21Var = this.e2;
        if (f21Var != null) {
            f21Var.a(true);
        }
        t51 t51Var = this.f2[0];
        if (t51Var != null) {
            g21Var.n = null;
            t51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.c61
    public final void r(l51 l51Var, bh.x0 x0Var) {
        int i10;
        g21 g21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(x0Var.f);
        f21 f21Var = this.e2;
        if (f21Var != null) {
            f21Var.a(true);
        }
        t51 t51Var = this.f2[0];
        if (t51Var != null) {
            g21Var.n = null;
            t51Var.dismiss();
        }
    }
}

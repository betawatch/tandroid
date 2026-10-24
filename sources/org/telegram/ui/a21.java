package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a21 extends b61 {
    public final /* synthetic */ c21 e2;
    public final /* synthetic */ s51[] f2;
    public final /* synthetic */ d21 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(d21 d21Var, d21 d21Var2, Activity activity, Integer num, c21 c21Var, s51[] s51VarArr) {
        super(d21Var2, activity, false, num, 2, null);
        this.g2 = d21Var;
        this.e2 = c21Var;
        this.f2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        d21 d21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        c21 c21Var = this.e2;
        if (c21Var != null) {
            c21Var.a(true);
        }
        s51 s51Var = this.f2[0];
        if (s51Var != null) {
            d21Var.n = null;
            s51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.b61
    public final void r(k51 k51Var, ah.i1 i1Var) {
        int i10;
        d21 d21Var = this.g2;
        i10 = ((org.telegram.ui.ActionBar.o2) d21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f);
        c21 c21Var = this.e2;
        if (c21Var != null) {
            c21Var.a(true);
        }
        s51 s51Var = this.f2[0];
        if (s51Var != null) {
            d21Var.n = null;
            s51Var.dismiss();
        }
    }
}

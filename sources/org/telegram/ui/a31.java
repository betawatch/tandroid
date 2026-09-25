package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class a31 extends a71 {
    public final /* synthetic */ c31 d2;
    public final /* synthetic */ r61[] e2;
    public final /* synthetic */ d31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(d31 d31Var, d31 d31Var2, Activity activity, Integer num, c31 c31Var, r61[] r61VarArr) {
        super(d31Var2, activity, false, num, 2, null);
        this.f2 = d31Var;
        this.d2 = c31Var;
        this.e2 = r61VarArr;
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        d31 d31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        c31 c31Var = this.d2;
        if (c31Var != null) {
            c31Var.a(true);
        }
        r61 r61Var = this.e2[0];
        if (r61Var != null) {
            d31Var.n = null;
            r61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.a71
    public final void r(j61 j61Var, zg.o0 o0Var) {
        int i10;
        d31 d31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.m2) d31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f);
        c31 c31Var = this.d2;
        if (c31Var != null) {
            c31Var.a(true);
        }
        r61 r61Var = this.e2[0];
        if (r61Var != null) {
            d31Var.n = null;
            r61Var.dismiss();
        }
    }
}

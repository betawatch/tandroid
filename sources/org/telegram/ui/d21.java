package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d21 extends a61 {
    public final /* synthetic */ f21 Z1;
    public final /* synthetic */ r51[] a2;
    public final /* synthetic */ g21 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(g21 g21Var, g21 g21Var2, Activity activity, Integer num, f21 f21Var, r51[] r51VarArr) {
        super(g21Var2, activity, false, num, 2, null);
        this.b2 = g21Var;
        this.Z1 = f21Var;
        this.a2 = r51VarArr;
    }

    @Override // org.telegram.ui.a61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 == null) {
            return;
        }
        g21 g21Var = this.b2;
        i10 = ((org.telegram.ui.ActionBar.n2) g21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l10);
        f21 f21Var = this.Z1;
        if (f21Var != null) {
            f21Var.a(true);
        }
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            g21Var.n = null;
            r51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.a61
    public final void r(j51 j51Var, ig.q0 q0Var) {
        int i10;
        g21 g21Var = this.b2;
        i10 = ((org.telegram.ui.ActionBar.n2) g21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f);
        f21 f21Var = this.Z1;
        if (f21Var != null) {
            f21Var.a(true);
        }
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            g21Var.n = null;
            r51Var.dismiss();
        }
    }
}

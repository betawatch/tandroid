package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class px0 extends g11 {
    public final /* synthetic */ rx0 f2;
    public final /* synthetic */ x01[] g2;
    public final /* synthetic */ sx0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px0(sx0 sx0Var, sx0 sx0Var2, Activity activity, Integer num, rx0 rx0Var, x01[] x01VarArr) {
        super(sx0Var2, activity, false, num, 2, null);
        this.h2 = sx0Var;
        this.f2 = rx0Var;
        this.g2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        if (l10 == null) {
            return;
        }
        sx0 sx0Var = this.h2;
        i3 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        org.telegram.messenger.li.b0(i3).a2("animated_" + l10);
        rx0 rx0Var = this.f2;
        if (rx0Var != null) {
            rx0Var.a(true);
        }
        x01 x01Var = this.g2[0];
        if (x01Var != null) {
            sx0Var.n = null;
            x01Var.dismiss();
        }
    }

    @Override // org.telegram.ui.g11
    public final void r(q01 q01Var, dh.n0 n0Var) {
        int i3;
        sx0 sx0Var = this.h2;
        i3 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        org.telegram.messenger.li.b0(i3).a2(n0Var.f);
        rx0 rx0Var = this.f2;
        if (rx0Var != null) {
            rx0Var.a(true);
        }
        x01 x01Var = this.g2[0];
        if (x01Var != null) {
            sx0Var.n = null;
            x01Var.dismiss();
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cy0 extends t11 {
    public final /* synthetic */ ey0 e2;
    public final /* synthetic */ k11[] f2;
    public final /* synthetic */ fy0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(fy0 fy0Var, fy0 fy0Var2, Activity activity, Integer num, ey0 ey0Var, k11[] k11VarArr) {
        super(fy0Var2, activity, false, num, 2, null);
        this.g2 = fy0Var;
        this.e2 = ey0Var;
        this.f2 = k11VarArr;
    }

    @Override // org.telegram.ui.t11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        fy0 fy0Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2("animated_" + l10);
        ey0 ey0Var = this.e2;
        if (ey0Var != null) {
            ey0Var.a(true);
        }
        k11 k11Var = this.f2[0];
        if (k11Var != null) {
            fy0Var.n = null;
            k11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.t11
    public final void r(d11 d11Var, ch.o0 o0Var) {
        int i7;
        fy0 fy0Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2(o0Var.f);
        ey0 ey0Var = this.e2;
        if (ey0Var != null) {
            ey0Var.a(true);
        }
        k11 k11Var = this.f2[0];
        if (k11Var != null) {
            fy0Var.n = null;
            k11Var.dismiss();
        }
    }
}

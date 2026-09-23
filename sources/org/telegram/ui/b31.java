package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class b31 extends z61 {
    public final /* synthetic */ d31 d2;
    public final /* synthetic */ q61[] e2;
    public final /* synthetic */ e31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(e31 e31Var, e31 e31Var2, Activity activity, Integer num, d31 d31Var, q61[] q61VarArr) {
        super(e31Var2, activity, false, num, 2, null);
        this.f2 = e31Var;
        this.d2 = d31Var;
        this.e2 = q61VarArr;
    }

    @Override // org.telegram.ui.z61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        e31 e31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        d31 d31Var = this.d2;
        if (d31Var != null) {
            d31Var.a(true);
        }
        q61 q61Var = this.e2[0];
        if (q61Var != null) {
            e31Var.n = null;
            q61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.z61
    public final void r(i61 i61Var, zg.p0 p0Var) {
        int i10;
        e31 e31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f);
        d31 d31Var = this.d2;
        if (d31Var != null) {
            d31Var.a(true);
        }
        q61 q61Var = this.e2[0];
        if (q61Var != null) {
            e31Var.n = null;
            q61Var.dismiss();
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o31 extends l71 {
    public final /* synthetic */ q31 d2;
    public final /* synthetic */ c71[] e2;
    public final /* synthetic */ r31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(r31 r31Var, r31 r31Var2, Activity activity, Integer num, q31 q31Var, c71[] c71VarArr) {
        super(r31Var2, activity, false, num, 2, null);
        this.f2 = r31Var;
        this.d2 = q31Var;
        this.e2 = c71VarArr;
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        r31 r31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        q31 q31Var = this.d2;
        if (q31Var != null) {
            q31Var.a(true);
        }
        c71 c71Var = this.e2[0];
        if (c71Var != null) {
            r31Var.n = null;
            c71Var.dismiss();
        }
    }

    @Override // org.telegram.ui.l71
    public final void r(u61 u61Var, yg.p0 p0Var) {
        int i10;
        r31 r31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f);
        q31 q31Var = this.d2;
        if (q31Var != null) {
            q31Var.a(true);
        }
        c71 c71Var = this.e2[0];
        if (c71Var != null) {
            r31Var.n = null;
            c71Var.dismiss();
        }
    }
}

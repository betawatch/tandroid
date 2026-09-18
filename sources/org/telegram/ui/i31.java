package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class i31 extends g71 {
    public final /* synthetic */ k31 d2;
    public final /* synthetic */ x61[] e2;
    public final /* synthetic */ l31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(l31 l31Var, l31 l31Var2, Activity activity, Integer num, k31 k31Var, x61[] x61VarArr) {
        super(l31Var2, activity, false, num, 2, null);
        this.f2 = l31Var;
        this.d2 = k31Var;
        this.e2 = x61VarArr;
    }

    @Override // org.telegram.ui.g71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        l31 l31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        k31 k31Var = this.d2;
        if (k31Var != null) {
            k31Var.a(true);
        }
        x61 x61Var = this.e2[0];
        if (x61Var != null) {
            l31Var.n = null;
            x61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.g71
    public final void r(p61 p61Var, zg.o0 o0Var) {
        int i10;
        l31 l31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f);
        k31 k31Var = this.d2;
        if (k31Var != null) {
            k31Var.a(true);
        }
        x61 x61Var = this.e2[0];
        if (x61Var != null) {
            l31Var.n = null;
            x61Var.dismiss();
        }
    }
}

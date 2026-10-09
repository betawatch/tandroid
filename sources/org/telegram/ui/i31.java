package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i31 extends k71 {
    public final /* synthetic */ k31 d2;
    public final /* synthetic */ b71[] e2;
    public final /* synthetic */ l31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(l31 l31Var, l31 l31Var2, Activity activity, Integer num, k31 k31Var, b71[] b71VarArr) {
        super(l31Var2, activity, false, num, 2, null);
        this.f2 = l31Var;
        this.d2 = k31Var;
        this.e2 = b71VarArr;
    }

    @Override // org.telegram.ui.k71
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
        b71 b71Var = this.e2[0];
        if (b71Var != null) {
            l31Var.n = null;
            b71Var.dismiss();
        }
    }

    @Override // org.telegram.ui.k71
    public final void r(t61 t61Var, zg.n0 n0Var) {
        int i10;
        l31 l31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(n0Var.f);
        k31 k31Var = this.d2;
        if (k31Var != null) {
            k31Var.a(true);
        }
        b71 b71Var = this.e2[0];
        if (b71Var != null) {
            l31Var.n = null;
            b71Var.dismiss();
        }
    }
}

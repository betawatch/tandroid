package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class p31 extends r71 {
    public final /* synthetic */ r31 d2;
    public final /* synthetic */ i71[] e2;
    public final /* synthetic */ s31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(s31 s31Var, s31 s31Var2, Activity activity, Integer num, r31 r31Var, i71[] i71VarArr) {
        super(s31Var2, activity, false, num, 2, null);
        this.f2 = s31Var;
        this.d2 = r31Var;
        this.e2 = i71VarArr;
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        s31 s31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        r31 r31Var = this.d2;
        if (r31Var != null) {
            r31Var.a(true);
        }
        i71 i71Var = this.e2[0];
        if (i71Var != null) {
            s31Var.n = null;
            i71Var.dismiss();
        }
    }

    @Override // org.telegram.ui.r71
    public final void r(a71 a71Var, ah.i1 i1Var) {
        int i10;
        s31 s31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f);
        r31 r31Var = this.d2;
        if (r31Var != null) {
            r31Var.a(true);
        }
        i71 i71Var = this.e2[0];
        if (i71Var != null) {
            s31Var.n = null;
            i71Var.dismiss();
        }
    }
}

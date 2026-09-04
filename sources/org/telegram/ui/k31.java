package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k31 extends j71 {
    public final /* synthetic */ m31 d2;
    public final /* synthetic */ a71[] e2;
    public final /* synthetic */ n31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(n31 n31Var, n31 n31Var2, Activity activity, Integer num, m31 m31Var, a71[] a71VarArr) {
        super(n31Var2, activity, false, num, 2, null);
        this.f2 = n31Var;
        this.d2 = m31Var;
        this.e2 = a71VarArr;
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        n31 n31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        m31 m31Var = this.d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        a71 a71Var = this.e2[0];
        if (a71Var != null) {
            n31Var.n = null;
            a71Var.dismiss();
        }
    }

    @Override // org.telegram.ui.j71
    public final void r(s61 s61Var, ah.j1 j1Var) {
        int i10;
        n31 n31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(j1Var.f);
        m31 m31Var = this.d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        a71 a71Var = this.e2[0];
        if (a71Var != null) {
            n31Var.n = null;
            a71Var.dismiss();
        }
    }
}

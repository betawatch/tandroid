package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k31 extends i71 {
    public final /* synthetic */ m31 d2;
    public final /* synthetic */ z61[] e2;
    public final /* synthetic */ n31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(n31 n31Var, n31 n31Var2, Activity activity, Integer num, m31 m31Var, z61[] z61VarArr) {
        super(n31Var2, activity, false, num, 2, null);
        this.f2 = n31Var;
        this.d2 = m31Var;
        this.e2 = z61VarArr;
    }

    @Override // org.telegram.ui.i71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        n31 n31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        m31 m31Var = this.d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        z61 z61Var = this.e2[0];
        if (z61Var != null) {
            n31Var.n = null;
            z61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.i71
    public final void r(r61 r61Var, zg.p0 p0Var) {
        int i10;
        n31 n31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f);
        m31 m31Var = this.d2;
        if (m31Var != null) {
            m31Var.a(true);
        }
        z61 z61Var = this.e2[0];
        if (z61Var != null) {
            n31Var.n = null;
            z61Var.dismiss();
        }
    }
}

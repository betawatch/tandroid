package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j31 extends h71 {
    public final /* synthetic */ l31 d2;
    public final /* synthetic */ y61[] e2;
    public final /* synthetic */ m31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(m31 m31Var, m31 m31Var2, Activity activity, Integer num, l31 l31Var, y61[] y61VarArr) {
        super(m31Var2, activity, false, num, 2, null);
        this.f2 = m31Var;
        this.d2 = l31Var;
        this.e2 = y61VarArr;
    }

    @Override // org.telegram.ui.h71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        m31 m31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        l31 l31Var = this.d2;
        if (l31Var != null) {
            l31Var.a(true);
        }
        y61 y61Var = this.e2[0];
        if (y61Var != null) {
            m31Var.n = null;
            y61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.h71
    public final void r(q61 q61Var, zg.p0 p0Var) {
        int i10;
        m31 m31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(p0Var.f);
        l31 l31Var = this.d2;
        if (l31Var != null) {
            l31Var.a(true);
        }
        y61 y61Var = this.e2[0];
        if (y61Var != null) {
            m31Var.n = null;
            y61Var.dismiss();
        }
    }
}

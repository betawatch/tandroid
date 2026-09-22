package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t41 extends wm0 {
    public final /* synthetic */ e51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(e51 e51Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.h = e51Var;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void a(String str) {
        gg.g2 g2Var = this.h.v;
        gg.e2 e2Var = g2Var.S;
        int i10 = g2Var.c;
        if (g2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(g2Var.N, true);
            g2Var.N = 0;
        }
        if (g2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(g2Var.O, true);
            g2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            g2Var.R = null;
            g2Var.F.clear();
            g2Var.I.clear();
            g2Var.E.clear();
            g2Var.e.b(false);
            g2Var.l();
        } else {
            g2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(e2Var);
        AndroidUtilities.runOnUIThread(e2Var, 300L);
    }
}

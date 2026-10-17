package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class q51 extends un0 {
    public final /* synthetic */ b61 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(b61 b61Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 14.0f, d6Var);
        this.h = b61Var;
    }

    @Override // org.telegram.ui.Components.un0
    public final void a(String str) {
        hg.e2 e2Var = this.h.v;
        hg.c2 c2Var = e2Var.S;
        int i10 = e2Var.c;
        if (e2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(e2Var.N, true);
            e2Var.N = 0;
        }
        if (e2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(e2Var.O, true);
            e2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            e2Var.R = null;
            e2Var.F.clear();
            e2Var.I.clear();
            e2Var.E.clear();
            e2Var.e.b(false);
            e2Var.l();
        } else {
            e2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(c2Var);
        AndroidUtilities.runOnUIThread(c2Var, 300L);
    }
}

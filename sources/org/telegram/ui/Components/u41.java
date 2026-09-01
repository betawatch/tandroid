package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u41 extends fn0 {
    public final /* synthetic */ f51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(f51 f51Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 14.0f, g6Var);
        this.h = f51Var;
    }

    @Override // org.telegram.ui.Components.fn0
    public final void a(String str) {
        uf.m1 m1Var = this.h.v;
        uf.l1 l1Var = m1Var.P;
        int i10 = m1Var.c;
        if (m1Var.K != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.K, true);
            m1Var.K = 0;
        }
        if (m1Var.L != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(m1Var.L, true);
            m1Var.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            m1Var.O = null;
            m1Var.C.clear();
            m1Var.F.clear();
            m1Var.B.clear();
            m1Var.e.b(false);
            m1Var.l();
        } else {
            m1Var.O = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(l1Var);
        AndroidUtilities.runOnUIThread(l1Var, 300L);
    }
}

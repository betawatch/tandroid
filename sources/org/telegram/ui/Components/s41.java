package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s41 extends en0 {
    public final /* synthetic */ d51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(d51 d51Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 14.0f, g6Var);
        this.h = d51Var;
    }

    @Override // org.telegram.ui.Components.en0
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

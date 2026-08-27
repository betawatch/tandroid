package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y31 extends km0 {
    public final /* synthetic */ j41 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(j41 j41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 14.0f, c6Var);
        this.h = j41Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final void a(String str) {
        pf.l1 l1Var = this.h.v;
        pf.k1 k1Var = l1Var.O;
        int i10 = l1Var.c;
        if (l1Var.J != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(l1Var.J, true);
            l1Var.J = 0;
        }
        if (l1Var.K != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(l1Var.K, true);
            l1Var.K = 0;
        }
        if (TextUtils.isEmpty(str)) {
            l1Var.N = null;
            l1Var.B.clear();
            l1Var.E.clear();
            l1Var.A.clear();
            l1Var.e.b(false);
            l1Var.l();
        } else {
            l1Var.N = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(k1Var);
        AndroidUtilities.runOnUIThread(k1Var, 300L);
    }
}

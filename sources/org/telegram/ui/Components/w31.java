package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w31 extends hm0 {
    public final /* synthetic */ h41 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(h41 h41Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 14.0f, b6Var);
        this.h = h41Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final void a(String str) {
        of.y1 y1Var = this.h.v;
        of.w1 w1Var = y1Var.O;
        int i9 = y1Var.c;
        if (y1Var.J != 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(y1Var.J, true);
            y1Var.J = 0;
        }
        if (y1Var.K != 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(y1Var.K, true);
            y1Var.K = 0;
        }
        if (TextUtils.isEmpty(str)) {
            y1Var.N = null;
            y1Var.B.clear();
            y1Var.E.clear();
            y1Var.A.clear();
            y1Var.e.b(false);
            y1Var.l();
        } else {
            y1Var.N = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        AndroidUtilities.runOnUIThread(w1Var, 300L);
    }
}

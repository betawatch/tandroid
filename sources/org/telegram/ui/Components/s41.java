package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class s41 extends wm0 {
    public final /* synthetic */ d51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(d51 d51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.h = d51Var;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void a(String str) {
        hg.f2 f2Var = this.h.v;
        hg.d2 d2Var = f2Var.S;
        int i10 = f2Var.c;
        if (f2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(f2Var.N, true);
            f2Var.N = 0;
        }
        if (f2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(f2Var.O, true);
            f2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            f2Var.R = null;
            f2Var.F.clear();
            f2Var.I.clear();
            f2Var.E.clear();
            f2Var.e.b(false);
            f2Var.l();
        } else {
            f2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(d2Var);
        AndroidUtilities.runOnUIThread(d2Var, 300L);
    }
}

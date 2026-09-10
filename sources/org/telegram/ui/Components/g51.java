package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g51 extends gn0 {
    public final /* synthetic */ r51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(r51 r51Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.h = r51Var;
    }

    @Override // org.telegram.ui.Components.gn0
    public final void a(String str) {
        fg.h2 h2Var = this.h.v;
        fg.f2 f2Var = h2Var.S;
        int i10 = h2Var.c;
        if (h2Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(h2Var.N, true);
            h2Var.N = 0;
        }
        if (h2Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(h2Var.O, true);
            h2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            h2Var.R = null;
            h2Var.F.clear();
            h2Var.I.clear();
            h2Var.E.clear();
            h2Var.e.b(false);
            h2Var.l();
        } else {
            h2Var.R = str.toLowerCase();
        }
        AndroidUtilities.cancelRunOnUIThread(f2Var);
        AndroidUtilities.runOnUIThread(f2Var, 300L);
    }
}

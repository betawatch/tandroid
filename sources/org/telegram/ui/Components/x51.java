package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x51 extends yn0 {
    public final /* synthetic */ i61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(i61 i61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 14.0f, g6Var);
        this.f = i61Var;
    }

    @Override // org.telegram.ui.Components.yn0
    public final void a(String str) {
        hg.e2 e2Var = this.f.v;
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

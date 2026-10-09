package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a61 extends co0 {
    public final /* synthetic */ l61 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(l61 l61Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.h = l61Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final void a(String str) {
        gg.f2 f2Var = this.h.v;
        gg.d2 d2Var = f2Var.S;
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

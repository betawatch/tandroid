package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c31 extends il0 {
    public final /* synthetic */ n31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(n31 n31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 14.0f, e6Var);
        this.f = n31Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void a(String str) {
        kg.y1 y1Var = this.f.w;
        kg.w1 w1Var = y1Var.T;
        int i3 = y1Var.c;
        if (y1Var.O != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(y1Var.O, true);
            y1Var.O = 0;
        }
        if (y1Var.P != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(y1Var.P, true);
            y1Var.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            y1Var.S = null;
            y1Var.G.clear();
            y1Var.J.clear();
            y1Var.F.clear();
            y1Var.e.b(false);
            y1Var.f();
        } else {
            y1Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(w1Var);
        org.telegram.messenger.g0.i3(w1Var, 300L);
    }
}

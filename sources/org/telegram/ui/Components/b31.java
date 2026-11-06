package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b31 extends el0 {
    public final /* synthetic */ n31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b31(n31 n31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.f = n31Var;
    }

    @Override // org.telegram.ui.Components.el0
    public final void a(String str) {
        jg.d2 d2Var = this.f.w;
        jg.b2 b2Var = d2Var.S;
        int i7 = d2Var.c;
        if (d2Var.N != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(d2Var.N, true);
            d2Var.N = 0;
        }
        if (d2Var.O != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(d2Var.O, true);
            d2Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            d2Var.R = null;
            d2Var.F.clear();
            d2Var.I.clear();
            d2Var.E.clear();
            d2Var.e.b(false);
            d2Var.f();
        } else {
            d2Var.R = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(b2Var);
        org.telegram.messenger.g0.i3(b2Var, 300L);
    }
}

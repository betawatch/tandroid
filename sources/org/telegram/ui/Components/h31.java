package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h31 extends el0 {
    public final /* synthetic */ t31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h31(t31 t31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 14.0f, f6Var);
        this.f = t31Var;
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

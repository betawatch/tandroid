package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l41 extends im0 {
    public final /* synthetic */ x41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l41(x41 x41Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 14.0f, p6Var);
        this.f = x41Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final void a(String str) {
        zf.o1 o1Var = this.f.w;
        zf.n1 n1Var = o1Var.S;
        int i10 = o1Var.c;
        if (o1Var.N != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(o1Var.N, true);
            o1Var.N = 0;
        }
        if (o1Var.O != 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(o1Var.O, true);
            o1Var.O = 0;
        }
        if (TextUtils.isEmpty(str)) {
            o1Var.R = null;
            o1Var.F.clear();
            o1Var.I.clear();
            o1Var.E.clear();
            o1Var.e.b(false);
            o1Var.f();
        } else {
            o1Var.R = str.toLowerCase();
        }
        org.telegram.messenger.i0.r(n1Var);
        org.telegram.messenger.i0.h3(n1Var, 300L);
    }
}

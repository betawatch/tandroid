package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class z31 extends tl0 {
    public final /* synthetic */ k41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(k41 k41Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 14.0f, h6Var);
        this.f = k41Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void a(String str) {
        jg.c2 c2Var = this.f.w;
        jg.a2 a2Var = c2Var.T;
        int i7 = c2Var.c;
        if (c2Var.O != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(c2Var.O, true);
            c2Var.O = 0;
        }
        if (c2Var.P != 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(c2Var.P, true);
            c2Var.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            c2Var.S = null;
            c2Var.G.clear();
            c2Var.J.clear();
            c2Var.F.clear();
            c2Var.e.b(false);
            c2Var.f();
        } else {
            c2Var.S = str.toLowerCase();
        }
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.h3(a2Var, 300L);
    }
}

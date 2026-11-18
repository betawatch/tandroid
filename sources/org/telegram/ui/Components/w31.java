package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w31 extends rl0 {
    public final /* synthetic */ h41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(h41 h41Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 14.0f, i6Var);
        this.f = h41Var;
    }

    @Override // org.telegram.ui.Components.rl0
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

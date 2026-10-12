package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.Components.jr0 {
    public final /* synthetic */ qd1 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od1(qd1 qd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.b1 = qd1Var;
    }

    @Override // org.telegram.ui.Components.jr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            qd1 qd1Var = this.b1;
            if (m10 == 1) {
                qd1Var.a.l0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                qd1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class id1 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ kd1 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(kd1 kd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.b1 = kd1Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            kd1 kd1Var = this.b1;
            if (m10 == 1) {
                kd1Var.a.l0.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                kd1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

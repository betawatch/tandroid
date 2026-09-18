package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jd1 extends org.telegram.ui.Components.iq0 {
    public final /* synthetic */ ld1 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd1(ld1 ld1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.b1 = ld1Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            ld1 ld1Var = this.b1;
            if (m10 == 1) {
                ld1Var.a.l0.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                ld1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

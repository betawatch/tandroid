package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ec1 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ hc1 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(hc1 hc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.a1 = hc1Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            hc1 hc1Var = this.a1;
            if (m10 == 1) {
                hc1Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                hc1Var.a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

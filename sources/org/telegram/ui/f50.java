package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.Components.iq0 {
    public final /* synthetic */ k60 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(k60 k60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.b1 = k60Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            k60 k60Var = this.b1;
            if (m10 == 1) {
                k60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                k60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

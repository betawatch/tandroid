package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ ec1 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(ec1 ec1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.e1 = ec1Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            ec1 ec1Var = this.e1;
            if (m10 == 1) {
                ec1Var.a.m0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                ec1Var.a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

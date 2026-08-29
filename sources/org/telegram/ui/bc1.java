package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bc1 extends org.telegram.ui.Components.dq0 {
    public final /* synthetic */ ec1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(ec1 ec1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = ec1Var;
    }

    @Override // org.telegram.ui.Components.dq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            ec1 ec1Var = this.X0;
            if (m10 == 1) {
                ec1Var.a.h0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                ec1Var.a.h0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

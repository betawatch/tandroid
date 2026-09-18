package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class hd1 extends org.telegram.ui.Components.vq0 {
    public final /* synthetic */ jd1 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd1(jd1 jd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.b1 = jd1Var;
    }

    @Override // org.telegram.ui.Components.vq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            jd1 jd1Var = this.b1;
            if (m10 == 1) {
                jd1Var.a.l0.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                jd1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

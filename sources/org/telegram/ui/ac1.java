package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ac1 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ cc1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(cc1 cc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = cc1Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            cc1 cc1Var = this.X0;
            if (m10 == 1) {
                cc1Var.a.h0.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i9), 61);
            } else {
                cc1Var.a.h0.k(0L, 61, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

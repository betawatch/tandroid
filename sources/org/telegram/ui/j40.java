package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j40 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ o50 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(o50 o50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.X0 = o50Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            o50 o50Var = this.X0;
            if (m10 == 1) {
                o50Var.k1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i9), 41);
            } else {
                o50Var.k1().k(0L, 41, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

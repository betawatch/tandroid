package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ g60 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(g60 g60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.b1 = g60Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            g60 g60Var = this.b1;
            if (m10 == 1) {
                g60Var.l1().m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                g60Var.l1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

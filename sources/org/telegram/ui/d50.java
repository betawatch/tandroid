package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ i60 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(i60 i60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.b1 = i60Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            i60 i60Var = this.b1;
            if (m10 == 1) {
                i60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                i60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}

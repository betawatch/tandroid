package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class m40 extends org.telegram.ui.Components.dr0 {
    public final /* synthetic */ s50 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(s50 s50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.b1 = s50Var;
    }

    @Override // org.telegram.ui.Components.dr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            s50 s50Var = this.b1;
            if (m10 == 1) {
                s50Var.l1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i10), 41);
            } else {
                s50Var.l1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

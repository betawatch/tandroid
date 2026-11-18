package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b30 extends org.telegram.ui.Components.yo0 {
    public final /* synthetic */ f40 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(f40 f40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.V2 = f40Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = hVar.m();
            f40 f40Var = this.V2;
            if (m10 == 1) {
                f40Var.o1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 41);
            } else {
                f40Var.o1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

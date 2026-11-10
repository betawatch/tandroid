package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b30 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ f40 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(f40 f40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.U2 = f40Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            int m10 = hVar.m();
            f40 f40Var = this.U2;
            if (m10 == 1) {
                f40Var.n1().m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i7), 41);
            } else {
                f40Var.n1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}

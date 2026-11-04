package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h70 extends oo0 {
    public final /* synthetic */ m70 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(m70 m70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = m70Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.bd.a0(null, null, 2131749195, org.telegram.messenger.bd.G(i3, "Chats", new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j10 == 0 || j10 == org.telegram.messenger.h10.i(this.a).e()) ? org.telegram.messenger.bd.M0(2131749193, null) : org.telegram.messenger.bd.a0(null, null, 2131749192, org.telegram.messenger.hp.s1(this.a).B1(j10, true));
            }
            this.S2.e(org.telegram.messenger.g0.X2(a02));
        }
    }
}

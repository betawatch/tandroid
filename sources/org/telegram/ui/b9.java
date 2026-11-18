package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b9 extends org.telegram.ui.Components.yo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.x2 x2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = x2Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748995, org.telegram.messenger.gd.G(hVar == null ? 1 : hVar.m(), "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.j10.i(this.a).e()) ? org.telegram.messenger.gd.M0(2131748993, null) : org.telegram.messenger.gd.a0(null, null, 2131748992, org.telegram.messenger.mp.u1(this.a).D1(j3, true));
            }
            org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.lc(this.V2.F, this.J0).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(a02));
            Q.r = false;
            Q.j();
        }
    }
}

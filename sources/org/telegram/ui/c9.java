package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.Components.ap0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.w2 w2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = w2Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(hVar == null ? 1 : hVar.m(), "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.j10.i(this.a).e()) ? org.telegram.messenger.gd.N0(2131748992, null) : org.telegram.messenger.gd.a0(null, null, 2131748991, org.telegram.messenger.mp.u1(this.a).D1(j3, true));
            }
            org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.lc(this.V2.F, this.J0).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(a02));
            Q.r = false;
            Q.j();
        }
    }
}

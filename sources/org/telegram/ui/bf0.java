package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bf0 extends org.telegram.ui.Components.ap0 {
    public final /* synthetic */ cf0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(cf0 cf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = cf0Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        ff0 ff0Var = this.V2.L;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131748994, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == ff0Var.getUserConfig().e()) ? org.telegram.messenger.hd.N0(2131748992, null) : org.telegram.messenger.hd.a0(null, null, 2131748991, ff0Var.getMessagesController().D1(j3, true));
            }
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(ff0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}

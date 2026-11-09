package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class af0 extends org.telegram.ui.Components.no0 {
    public final /* synthetic */ bf0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(bf0 bf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.R2 = bf0Var;
    }

    @Override // org.telegram.ui.Components.no0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        ef0 ef0Var = this.R2.K;
        if (z9) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == ef0Var.getUserConfig().e()) ? org.telegram.messenger.id.M0(2131749185, null) : org.telegram.messenger.id.a0(null, null, 2131749184, ef0Var.getMessagesController().B1(j3, true));
            }
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(ef0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}

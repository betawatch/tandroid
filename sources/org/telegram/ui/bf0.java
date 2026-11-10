package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bf0 extends org.telegram.ui.Components.mo0 {
    public final /* synthetic */ cf0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf0(cf0 cf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.U2 = cf0Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        ff0 ff0Var = this.U2.K;
        if (z9) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749187, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == ff0Var.getUserConfig().e()) ? org.telegram.messenger.id.M0(2131749185, null) : org.telegram.messenger.id.a0(null, null, 2131749184, ff0Var.getMessagesController().B1(j3, true));
            }
            org.telegram.ui.Components.bc Q = org.telegram.ui.Components.gc.a0(ff0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}

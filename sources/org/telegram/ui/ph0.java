package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ qh0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(qh0 qh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.b1 = qh0Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        th0 th0Var = this.b1.K;
        if (z10) {
            if (iVar == null || iVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) iVar.n(0)).id;
                formatString = (j3 == 0 || j3 == th0Var.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, th0Var.getMessagesController().getPeerName(j3, true));
            }
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(th0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            Q.r = false;
            Q.k(true);
        }
    }
}

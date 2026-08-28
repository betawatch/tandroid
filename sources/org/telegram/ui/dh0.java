package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dh0 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ eh0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh0(eh0 eh0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = eh0Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        hh0 hh0Var = this.X0.G;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i9, new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                formatString = (j10 == 0 || j10 == hh0Var.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, hh0Var.getMessagesController().getPeerName(j10, true));
            }
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.oc.a0(hh0Var).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            Q.r = false;
            Q.k(true);
        }
    }
}

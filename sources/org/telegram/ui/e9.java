package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e9 extends org.telegram.ui.Components.iq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.b1 = g3Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (z10) {
            if (iVar == null || iVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", iVar == null ? 1 : iVar.m(), new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) iVar.n(0)).id;
                formatString = (j3 == 0 || j3 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j3, true));
            }
            org.telegram.ui.Components.oc Q = new org.telegram.ui.Components.vc(this.b1.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            Q.r = false;
            Q.j();
        }
    }
}

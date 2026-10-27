package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.nr0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.k3 k3Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.a1 = k3Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", hVar == null ? 1 : hVar.m(), new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                formatString = (j10 == 0 || j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            }
            org.telegram.ui.Components.qc R = new org.telegram.ui.Components.wc(this.a1.topBulletinContainer, this.resourcesProvider).R(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            R.s = false;
            R.j();
        }
    }
}

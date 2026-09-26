package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.b1 = e3Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (z10) {
            if (iVar == null || iVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", iVar == null ? 1 : iVar.m(), new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) iVar.n(0)).id;
                formatString = (j3 == 0 || j3 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j3, true));
            }
            org.telegram.ui.Components.qc Q = new org.telegram.ui.Components.xc(this.b1.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            Q.r = false;
            Q.j();
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a9 extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = f3Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", hVar == null ? 1 : hVar.m(), new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                formatString = (j10 == 0 || j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            }
            org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.oc(this.X0.topBulletinContainer, this.resourcesProvider).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(formatString));
            Q.r = false;
            Q.j();
        }
    }
}

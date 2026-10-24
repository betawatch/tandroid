package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m90 extends ir0 {
    public final /* synthetic */ r90 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(r90 r90Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.e1 = r90Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String formatString;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                formatString = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                formatString = (j10 == 0 || j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j10, true));
            }
            this.e1.e(R.raw.forward, AndroidUtilities.replaceTags(formatString));
        }
    }
}

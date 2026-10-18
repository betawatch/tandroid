package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class k30 extends w4 {
    public final /* synthetic */ s50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = s50Var;
    }

    @Override // org.telegram.ui.w4, org.telegram.ui.Components.fi0
    public final void c() {
        s50 s50Var = this.U;
        AccountInstance accountInstance = s50Var.d;
        l30 l30Var = s50Var.b;
        long dialogId = l30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            l30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

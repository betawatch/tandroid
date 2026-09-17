package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class b40 extends r4 {
    public final /* synthetic */ j60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = j60Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.jh0
    public final void c() {
        j60 j60Var = this.U;
        AccountInstance accountInstance = j60Var.d;
        c40 c40Var = j60Var.b;
        long dialogId = c40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            c40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

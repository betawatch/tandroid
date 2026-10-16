package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f40 extends v4 {
    public final /* synthetic */ n60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = n60Var;
    }

    @Override // org.telegram.ui.v4, org.telegram.ui.Components.ki0
    public final void c() {
        n60 n60Var = this.U;
        AccountInstance accountInstance = n60Var.d;
        g40 g40Var = n60Var.b;
        long dialogId = g40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            g40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

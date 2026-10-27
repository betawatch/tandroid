package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p30 extends u4 {
    public final /* synthetic */ x50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = x50Var;
    }

    @Override // org.telegram.ui.u4, org.telegram.ui.Components.ji0
    public final void c() {
        x50 x50Var = this.U;
        AccountInstance accountInstance = x50Var.d;
        q30 q30Var = x50Var.b;
        long dialogId = q30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            q30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

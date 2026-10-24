package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class l30 extends v4 {
    public final /* synthetic */ u50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = u50Var;
    }

    @Override // org.telegram.ui.v4, org.telegram.ui.Components.ji0
    public final void c() {
        u50 u50Var = this.U;
        AccountInstance accountInstance = u50Var.d;
        m30 m30Var = u50Var.b;
        long dialogId = m30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            m30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k30 extends r4 {
    public final /* synthetic */ r50 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.Q = r50Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.fh0
    public final void c() {
        r50 r50Var = this.Q;
        AccountInstance accountInstance = r50Var.d;
        l30 l30Var = r50Var.b;
        long dialogId = l30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            l30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

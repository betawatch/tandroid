package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d40 extends q4 {
    public final /* synthetic */ k60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = k60Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.kh0
    public final void c() {
        k60 k60Var = this.U;
        AccountInstance accountInstance = k60Var.d;
        e40 e40Var = k60Var.b;
        long dialogId = e40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            e40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

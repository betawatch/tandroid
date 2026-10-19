package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i30 extends w4 {
    public final /* synthetic */ q50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = q50Var;
    }

    @Override // org.telegram.ui.w4, org.telegram.ui.Components.fi0
    public final void c() {
        q50 q50Var = this.U;
        AccountInstance accountInstance = q50Var.d;
        j30 j30Var = q50Var.b;
        long dialogId = j30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            j30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

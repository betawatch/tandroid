package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h30 extends q4 {
    public final /* synthetic */ o50 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.Q = o50Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.vg0
    public final void c() {
        o50 o50Var = this.Q;
        AccountInstance accountInstance = o50Var.d;
        i30 i30Var = o50Var.b;
        long dialogId = i30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            i30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}

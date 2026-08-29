package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ vc(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
                break;
            case 1:
                this.b.lambda$loadWebBrowserConfig$511((TL_account.TL_webBrowserSettings) obj);
                break;
            default:
                this.b.lambda$getAvailableEffects$496((TLRPC.messages_AvailableEffects) obj);
                break;
        }
    }
}

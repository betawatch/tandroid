package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class uc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ uc(MessagesController messagesController, int i10) {
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

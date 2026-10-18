package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ xc(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadAppConfig$32((TLRPC.TL_help_appConfig) obj);
                break;
            case 1:
                this.b.lambda$loadWebBrowserConfig$514((TL_account.TL_webBrowserSettings) obj);
                break;
            default:
                this.b.lambda$getAvailableEffects$499((TLRPC.messages_AvailableEffects) obj);
                break;
        }
    }
}

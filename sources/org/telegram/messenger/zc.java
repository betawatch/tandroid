package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ zc(MessagesController messagesController, int i10) {
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
                this.b.lambda$loadWebBrowserConfig$517((TL_account.TL_webBrowserSettings) obj);
                break;
            default:
                this.b.lambda$getAvailableEffects$502((TLRPC.messages_AvailableEffects) obj);
                break;
        }
    }
}

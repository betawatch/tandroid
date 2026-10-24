package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class ea implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ ea(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateWebBrowserSettings$520((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$removeWebBrowserException$518((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.b.lambda$addWebBrowserException$516((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                this.b.lambda$loadStakeDiceInfo$510((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                this.b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                this.b.lambda$loadWebBrowserConfig$512((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                break;
            default:
                this.b.lambda$clearAllWebBrowserExceptions$519((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}

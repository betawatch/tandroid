package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ ga(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateWebBrowserSettings$523((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$removeWebBrowserException$521((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.b.lambda$addWebBrowserException$519((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                this.b.lambda$loadStakeDiceInfo$513((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                this.b.lambda$deleteReactionsFromMessage$131((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                this.b.lambda$loadWebBrowserConfig$515((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                break;
            default:
                this.b.lambda$clearAllWebBrowserExceptions$522((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}

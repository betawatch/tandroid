package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ z9(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateWebBrowserSettings$517((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$removeWebBrowserException$515((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.b.lambda$addWebBrowserException$513((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                this.b.lambda$loadStakeDiceInfo$507((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                this.b.lambda$deleteReactionsFromMessage$132((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                this.b.lambda$loadWebBrowserConfig$509((Long) obj, (TL_account.TL_webBrowserSettings) obj2);
                break;
            default:
                this.b.lambda$clearAllWebBrowserExceptions$516((TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}

package org.telegram.messenger;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ td(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$hidePromoDialog$135();
                break;
            case 1:
                this.b.lambda$putUsers$56();
                break;
            case 2:
                this.b.removePromoDialog();
                break;
            case 3:
                this.b.lambda$toggleChatJoinToSend$278();
                break;
            case 4:
                this.b.lambda$toggleChannelInvitesHistory$286();
                break;
            case 5:
                this.b.lambda$markAllTopicsAsRead$6();
                break;
            case 6:
                this.b.lambda$removeWebBrowserException$517();
                break;
            case 7:
                this.b.lambda$new$13();
                break;
            case 8:
                this.b.loadAppConfig();
                break;
            case 9:
                this.b.lambda$new$17();
                break;
            case 10:
                this.b.lambda$new$0();
                break;
            case 11:
                this.b.lambda$new$18();
                break;
            default:
                this.b.lambda$new$38();
                break;
        }
    }
}

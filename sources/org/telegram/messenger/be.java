package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ be(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleChatJoinToSend$278();
                break;
            case 1:
                this.b.lambda$toggleChannelInvitesHistory$286();
                break;
            case 2:
                this.b.lambda$removeWebBrowserException$519();
                break;
            case 3:
                this.b.lambda$new$13();
                break;
            case 4:
                this.b.lambda$markAllTopicsAsRead$6();
                break;
            case 5:
                this.b.loadAppConfig();
                break;
            case 6:
                this.b.lambda$new$17();
                break;
            case 7:
                this.b.lambda$new$0();
                break;
            case 8:
                this.b.lambda$new$18();
                break;
            case 9:
                this.b.lambda$new$38();
                break;
            case 10:
                this.b.requestIsUserContactBlocked();
                break;
            case 11:
                this.b.lambda$new$510();
                break;
            default:
                this.b.lambda$registerForPush$324();
                break;
        }
    }
}

package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ ed(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processLoadedDeleteTask$87();
                break;
            case 1:
                this.b.lambda$markAllTopicsAsRead$5();
                break;
            case 2:
                this.b.lambda$hidePromoDialog$136();
                break;
            case 3:
                this.b.removePromoDialog();
                break;
            case 4:
                this.b.lambda$putUsers$57();
                break;
            case 5:
                this.b.lambda$didReceivedNotification$42();
                break;
            case 6:
                this.b.lambda$addWebBrowserException$512();
                break;
            case 7:
                this.b.lambda$markAllTopicsAsRead$6();
                break;
            case 8:
                this.b.lambda$removeWebBrowserException$514();
                break;
            case 9:
                this.b.lambda$new$13();
                break;
            case 10:
                this.b.loadAppConfig();
                break;
            case 11:
                this.b.lambda$new$17();
                break;
            default:
                this.b.lambda$new$0();
                break;
        }
    }
}

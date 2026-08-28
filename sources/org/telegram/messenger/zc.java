package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ zc(MessagesController messagesController, int i9) {
        this.a = i9;
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

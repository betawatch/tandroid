package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;

    public /* synthetic */ bh(NotificationsController notificationsController, int i10) {
        this.a = i10;
        this.b = notificationsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$cleanup$2();
                break;
            case 1:
                this.b.lambda$hideNotifications$36();
                break;
            case 2:
                this.b.lambda$repeatNotificationMaybe$41();
                break;
            case 3:
                this.b.lambda$processIgnoreStories$17();
                break;
            case 4:
                this.b.lambda$updateBadge$34();
                break;
            case 5:
                this.b.lambda$deleteAllNotificationChannels$44();
                break;
            case 6:
                this.b.lambda$playOutChatSound$49();
                break;
            case 7:
                this.b.checkStoryPushes();
                break;
            case 8:
                this.b.lambda$new$0();
                break;
            case 9:
                this.b.lambda$new$1();
                break;
            case 10:
                this.b.lambda$showNotifications$35();
                break;
            case 11:
                this.b.lambda$forceShowPopupForReply$7();
                break;
            case 12:
                this.b.lambda$processIgnoreStoryReactions$18();
                break;
            default:
                this.b.lambda$playInChatSound$40();
                break;
        }
    }
}

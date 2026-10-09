package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;

    public /* synthetic */ zg(NotificationsController notificationsController, int i10) {
        this.a = i10;
        this.b = notificationsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$playInChatSound$41();
                break;
            case 1:
                this.b.lambda$cleanup$3();
                break;
            case 2:
                this.b.lambda$hideNotifications$37();
                break;
            case 3:
                this.b.lambda$repeatNotificationMaybe$42();
                break;
            case 4:
                this.b.lambda$processIgnoreStories$18();
                break;
            case 5:
                this.b.lambda$updateBadge$35();
                break;
            case 6:
                this.b.lambda$deleteAllNotificationChannels$45();
                break;
            case 7:
                this.b.lambda$playOutChatSound$50();
                break;
            case 8:
                this.b.checkStoryPushes();
                break;
            case 9:
                this.b.lambda$new$0();
                break;
            case 10:
                this.b.lambda$new$1();
                break;
            case 11:
                this.b.lambda$showNotifications$36();
                break;
            case 12:
                this.b.lambda$forceShowPopupForReply$8();
                break;
            default:
                this.b.lambda$processIgnoreStoryReactions$19();
                break;
        }
    }
}

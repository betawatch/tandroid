package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ int c;

    public /* synthetic */ sg(NotificationsController notificationsController, int i9, int i10) {
        this.a = i10;
        this.b = notificationsController;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processDialogsUpdateRead$29(this.c);
                break;
            case 1:
                this.b.lambda$removeDeletedHisoryFromNotifications$12(this.c);
                break;
            case 2:
                this.b.lambda$processSeenStoryReactions$14(this.c);
                break;
            case 3:
                this.b.lambda$processNewMessages$24(this.c);
                break;
            case 4:
                this.b.lambda$processNewMessages$26(this.c);
                break;
            case 5:
                this.b.lambda$setLastOnlineFromOtherDevice$5(this.c);
                break;
            case 6:
                this.b.lambda$processLoadedUnreadMessages$32(this.c);
                break;
            default:
                this.b.lambda$removeDeletedMessagesFromNotifications$9(this.c);
                break;
        }
    }
}

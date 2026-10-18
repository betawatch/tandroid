package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ int c;

    public /* synthetic */ ah(NotificationsController notificationsController, int i10, int i11) {
        this.a = i11;
        this.b = notificationsController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processSeenStoryReactions$15(this.c);
                break;
            case 1:
                this.b.lambda$setLastOnlineFromOtherDevice$6(this.c);
                break;
            case 2:
                this.b.lambda$processDialogsUpdateRead$30(this.c);
                break;
            case 3:
                this.b.lambda$processNewMessages$25(this.c);
                break;
            case 4:
                this.b.lambda$processNewMessages$27(this.c);
                break;
            case 5:
                this.b.lambda$removeDeletedMessagesFromNotifications$10(this.c);
                break;
            case 6:
                this.b.lambda$removeDeletedHisoryFromNotifications$13(this.c);
                break;
            default:
                this.b.lambda$processLoadedUnreadMessages$33(this.c);
                break;
        }
    }
}

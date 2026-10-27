package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ int c;

    public /* synthetic */ gh(NotificationsController notificationsController, int i10, int i11) {
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

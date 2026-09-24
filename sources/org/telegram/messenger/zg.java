package org.telegram.messenger;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ int c;

    public /* synthetic */ zg(NotificationsController notificationsController, int i10, int i11) {
        this.a = i11;
        this.b = notificationsController;
        this.c = i10;
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

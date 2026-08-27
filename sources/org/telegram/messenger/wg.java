package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ int c;

    public /* synthetic */ wg(NotificationsController notificationsController, int i10, int i11) {
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

package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

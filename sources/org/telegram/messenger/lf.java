package org.telegram.messenger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;

    public /* synthetic */ lf(int i10, long j3, MessagesStorage messagesStorage) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteStoryPushMessage$39(this.c);
                break;
            case 1:
                this.b.lambda$clearUserPhotos$92(this.c);
                break;
            case 2:
                this.b.lambda$removeAllTopics$56(this.c);
                break;
            case 3:
                this.b.lambda$deleteWallpaper$79(this.c);
                break;
            case 4:
                this.b.lambda$deleteSavedDialog$55(this.c);
                break;
            case 5:
                this.b.lambda$onDeleteQueryComplete$91(this.c);
                break;
            case 6:
                this.b.lambda$removePendingTask$11(this.c);
                break;
            default:
                this.b.lambda$loadChannelAdmins$123(this.c);
                break;
        }
    }
}

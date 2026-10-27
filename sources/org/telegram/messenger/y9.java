package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ y9(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$registerForPush$324();
                break;
            case 1:
                this.b.lambda$processUpdateArray$415();
                break;
            case 2:
                this.b.lambda$processUpdateArray$416();
                break;
            case 3:
                this.b.lambda$processUpdateArray$417();
                break;
            case 4:
                this.b.lambda$updateTimerProc$157();
                break;
            case 5:
                this.b.lambda$updateTimerProc$160();
                break;
            case 6:
                this.b.lambda$applyAppConfig$35();
                break;
            case 7:
                this.b.lambda$applyAppConfig$36();
                break;
            case 8:
                this.b.lambda$loadRemoteFilters$26();
                break;
            case 9:
                this.b.lambda$loadRemoteFilters$27();
                break;
            case 10:
                this.b.lambda$loadRemoteFilters$28();
                break;
            case 11:
                this.b.lambda$loadRemoteFilters$29();
                break;
            case 12:
                this.b.lambda$migrateDialogs$214();
                break;
            case 13:
                this.b.lambda$processUpdates$385();
                break;
            case 14:
                this.b.lambda$migrateDialogs$212();
                break;
            case 15:
                this.b.lambda$cleanup$51();
                break;
            case 16:
                this.b.lambda$cleanup$52();
                break;
            case 17:
                this.b.lambda$cleanup$53();
                break;
            case 18:
                this.b.lambda$processLoadedDeleteTask$86();
                break;
            case 19:
                this.b.lambda$didReceivedNotification$41();
                break;
            case 20:
                this.b.lambda$scheduleTranscriptionUpdate$37();
                break;
            case 21:
                this.b.lambda$toggleChannelForum$284();
                break;
            case 22:
                this.b.lambda$toggleChannelSignatures$282();
                break;
            case 23:
                this.b.lambda$addWebBrowserException$518();
                break;
            case 24:
                this.b.lambda$updateEmojiStatusUntil$480();
                break;
            case 25:
                this.b.lambda$checkPromoInfoInternal$165();
                break;
            case 26:
                this.b.lambda$markAllTopicsAsRead$5();
                break;
            case 27:
                this.b.lambda$hidePromoDialog$135();
                break;
            case 28:
                this.b.lambda$putUsers$56();
                break;
            default:
                this.b.removePromoDialog();
                break;
        }
    }
}

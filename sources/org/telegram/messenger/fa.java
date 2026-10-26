package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ fa(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTimerProc$157();
                break;
            case 1:
                this.b.lambda$updateTimerProc$160();
                break;
            case 2:
                this.b.lambda$applyAppConfig$35();
                break;
            case 3:
                this.b.lambda$applyAppConfig$36();
                break;
            case 4:
                this.b.lambda$loadRemoteFilters$26();
                break;
            case 5:
                this.b.lambda$loadRemoteFilters$27();
                break;
            case 6:
                this.b.lambda$loadRemoteFilters$28();
                break;
            case 7:
                this.b.lambda$loadRemoteFilters$29();
                break;
            case 8:
                this.b.lambda$migrateDialogs$214();
                break;
            case 9:
                this.b.lambda$removeWebBrowserException$519();
                break;
            case 10:
                this.b.lambda$processUpdates$385();
                break;
            case 11:
                this.b.lambda$addWebBrowserException$517();
                break;
            case 12:
                this.b.lambda$migrateDialogs$212();
                break;
            case 13:
                this.b.lambda$cleanup$51();
                break;
            case 14:
                this.b.lambda$cleanup$52();
                break;
            case 15:
                this.b.lambda$cleanup$53();
                break;
            case 16:
                this.b.lambda$processLoadedDeleteTask$86();
                break;
            case 17:
                this.b.lambda$didReceivedNotification$41();
                break;
            case 18:
                this.b.lambda$scheduleTranscriptionUpdate$37();
                break;
            case 19:
                this.b.lambda$toggleChannelForum$284();
                break;
            case 20:
                this.b.lambda$toggleChannelSignatures$282();
                break;
            case 21:
                this.b.lambda$updateEmojiStatusUntil$479();
                break;
            case 22:
                this.b.lambda$checkPromoInfoInternal$165();
                break;
            case 23:
                this.b.lambda$markAllTopicsAsRead$5();
                break;
            case 24:
                this.b.lambda$hidePromoDialog$135();
                break;
            case 25:
                this.b.lambda$processUpdateArray$414();
                break;
            case 26:
                this.b.lambda$processUpdateArray$415();
                break;
            case 27:
                this.b.lambda$processUpdateArray$416();
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

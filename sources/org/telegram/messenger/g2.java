package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;

    public /* synthetic */ g2(MessagesStorage messagesStorage, int i10) {
        this.a = i10;
        this.b = messagesStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FactCheckController.lambda$clearExpiredInDatabase$7(this.b);
                break;
            case 1:
                this.b.lambda$saveDialogFilter$73();
                break;
            case 2:
                this.b.lambda$clearLocalDatabase$43();
                break;
            case 3:
                this.b.lambda$fixNotificationSettings$9();
                break;
            case 4:
                this.b.lambda$getWallpapers$81();
                break;
            case 5:
                this.b.lambda$loadUnreadMessages$77();
                break;
            case 6:
                this.b.lambda$updateMutedDialogsFiltersCounters$36();
                break;
            case 7:
                this.b.lambda$openDatabase$1();
                break;
            case 8:
                this.b.lambda$openDatabase$2();
                break;
            case 9:
                this.b.lambda$updateFiltersReadCounter$119();
                break;
            case 10:
                this.b.lambda$clearLocalDatabase$44();
                break;
            case 11:
                this.b.lambda$checkSQLException$8();
                break;
            case 12:
                this.b.lambda$fullReset$62();
                break;
            case 13:
                this.b.lambda$new$0();
                break;
            case 14:
                this.b.lambda$resetAllUnreadCounters$250();
                break;
            case 15:
                this.b.lambda$reset$61();
                break;
            case 16:
                this.b.lambda$updateDbToLastVersion$3();
                break;
            case 17:
                this.b.lambda$updateDbToLastVersion$4();
                break;
            case 18:
                this.b.lambda$deleteDialog$89();
                break;
            case 19:
                this.b.lambda$loadDialogFilters$67();
                break;
            case 20:
                this.b.lambda$clearSentMedia$163();
                break;
            case 21:
                this.b.lambda$fullReset$63();
                break;
            case 22:
                this.b.lambda$loadPendingTasks$33();
                break;
            case 23:
                this.b.lambda$deleteAllStoryPushMessages$40();
                break;
            case 24:
                this.b.lambda$cleanup$5();
                break;
            case 25:
                this.b.lambda$deleteAllStoryReactionPushMessages$41();
                break;
            case 26:
                this.b.lambda$getContacts$151();
                break;
            default:
                this.b.lambda$broadcastQuickRepliesMessagesChange$223();
                break;
        }
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;

    public /* synthetic */ ga(MessagesController messagesController, int i10) {
        this.a = i10;
        this.b = messagesController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$updateTimerProc$152(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$updateTimerProc$153(tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$loadCurrentState$325(tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$getContentSettings$502(tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$sendBotStart$293(tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$loadSignUpNotificationsSettings$207(tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$reloadDialogsReadValue$64(tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$completeReadTask$238(tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$markMentionMessageAsRead$234(tLObject, tL_error);
                break;
            case 9:
                this.b.lambda$toggleChannelForum$286(tLObject, tL_error);
                break;
            case 10:
                this.b.lambda$setDialogHistoryTTL$137(tLObject, tL_error);
                break;
            case 11:
                this.b.lambda$loadUnreadDialogs$362(tLObject, tL_error);
                break;
            case 12:
                this.b.lambda$checkTosUpdate$163(tLObject, tL_error);
                break;
            case 13:
                this.b.lambda$reloadReactionsNotifySettings$205(tLObject, tL_error);
                break;
            case 14:
                this.b.lambda$loadHintDialogs$196(tLObject, tL_error);
                break;
            case 15:
                this.b.lambda$reloadUser$56(tLObject, tL_error);
                break;
            case 16:
                this.b.lambda$processUpdateArray$414(tLObject, tL_error);
                break;
            case 17:
                this.b.lambda$markMessageContentAsRead$232(tLObject, tL_error);
                break;
            case 18:
                this.b.lambda$loadRemoteFilters$30(tLObject, tL_error);
                break;
            case 19:
                this.b.lambda$didReceivedNotification$43(tLObject, tL_error);
                break;
            case 20:
                this.b.lambda$loadGlobalNotificationsSettings$203(tLObject, tL_error);
                break;
            case 21:
                this.b.lambda$performLogout$322(tLObject, tL_error);
                break;
            case 22:
                this.b.lambda$checkPeerColors$491(tLObject, tL_error);
                break;
            case 23:
                this.b.lambda$checkPeerColors$493(tLObject, tL_error);
                break;
            case 24:
                this.b.lambda$loadSuggestedFilters$25(tLObject, tL_error);
                break;
            case 25:
                this.b.lambda$toggleChannelInvitesHistory$288(tLObject, tL_error);
                break;
            default:
                this.b.lambda$toggleChannelSignatures$284(tLObject, tL_error);
                break;
        }
    }
}

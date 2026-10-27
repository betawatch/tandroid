package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j4(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((GiftAuctionController) this.c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.b);
                break;
            case 1:
                ((TranslateController) this.c).lambda$pushPollToTranslate$27(this.b, (TranslateController.PendingPollTranslation) this.d);
                break;
            case 2:
                ((TranslateController) this.c).lambda$pushRichMessageToTranslate$30(this.b, (TranslateController.PendingRichTranslation) this.d);
                break;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.c, this.b, (org.telegram.ui.Components.yc[]) this.d);
                break;
            case 4:
                ((ChatThemeController) this.c).lambda$processUpdate$13(this.b, (TLRPC.UserFull) this.d);
                break;
            case 5:
                ((LocationController) this.c).lambda$loadLiveLocations$25(this.b, (TLObject) this.d);
                break;
            case 6:
                ((MediaDataController) this.c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.b);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$savePinnedMessages$166((ArrayList) this.d, this.b);
                break;
            case 8:
                ((MediaDataController) this.c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.b);
                break;
            case 9:
                MessagesController.lambda$convertToMegaGroup$262((MessagesStorage.LongCallback) this.c, (TLRPC.Updates) this.d, this.b);
                break;
            case 10:
                ((MessagesController) this.c).lambda$addUsersToChannel$272((TLRPC.TL_messages_invitedUsers) this.d, this.b);
                break;
            case 11:
                ((MessagesController) this.c).lambda$updateTimerProc$158(this.b, (TLRPC.TL_chatOnlines) this.d);
                break;
            case 12:
                ((MessagesController) this.c).lambda$processUpdateArray$399(this.b, (TL_update.TL_updateMessageWidgetData) this.d);
                break;
            case 13:
                ((MessagesController) this.c).lambda$saveSavedReactionsTags$495(this.b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                break;
            case 14:
                ((MessagesController) this.c).lambda$getSavedReactionTags$493((TLRPC.messages_SavedReactionTags) this.d, this.b);
                break;
            case 15:
                ((MessagesController) this.c).lambda$addUserToChat$303((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.b);
                break;
            case 16:
                ((MessagesController) this.c).lambda$didAddedNewTask$81(this.b, (SparseArray) this.d);
                break;
            case 17:
                ((MessagesStorage) this.c).lambda$updateUserInfoContactBlocked$135(this.b, (TL_account.RequirementToContact) this.d);
                break;
            case 18:
                ((MessagesStorage) this.c).lambda$deleteAllReactionsFromChat$86((SparseArray) this.d, this.b);
                break;
            case 19:
                ((MessagesStorage) this.c).lambda$isDialogHasTopMessage$179(this.b, (Runnable) this.d);
                break;
            case 20:
                ((MessagesStorage) this.c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.b);
                break;
            case 21:
                ((MessagesStorage) this.c).lambda$saveStoryAlbumsCache$273(this.b, (List) this.d);
                break;
            case 22:
                ((MessagesStorage) this.c).lambda$overwriteChannel$193(this.b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                break;
            case 23:
                ((MessagesStorage) this.c).lambda$createOrEditTopic$203(this.b, (TLRPC.TL_forumTopic) this.d);
                break;
            case 24:
                ((MessagesStorage) this.c).lambda$createPendingTask$10(this.b, (NativeByteBuffer) this.d);
                break;
            case 25:
                ((MessagesStorage) this.c).lambda$putChannelAdmins$128(this.b, (a0.h) this.d);
                break;
            case 26:
                ((NotificationsController) this.c).lambda$showTonConnectNotification$2((String) this.d, this.b);
                break;
            case 27:
                ((NotificationsController) this.c).lambda$loadTopicsNotificationsExceptions$55(this.b, (Consumer) this.d);
                break;
            case 28:
                ((SavedMessagesController) this.c).lambda$hasSavedMessages$14((TLObject) this.d, this.b);
                break;
            default:
                ((SecretChatHelper) this.c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ j4(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
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
                ((ChatThemeController) this.c).lambda$processUpdate$13(this.b, (TLRPC.UserFull) this.d);
                break;
            case 4:
                ((LocationController) this.c).lambda$loadLiveLocations$25(this.b, (TLObject) this.d);
                break;
            case 5:
                ((MediaDataController) this.c).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.d, this.b);
                break;
            case 6:
                ((MediaDataController) this.c).lambda$putBotInfo$201((TL_bots.BotInfo) this.d, this.b);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$savePinnedMessages$166((ArrayList) this.d, this.b);
                break;
            case 8:
                ((MessagesController) this.c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.b);
                break;
            case 9:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.c, (TLRPC.Updates) this.d, this.b);
                break;
            case 10:
                ((MessagesController) this.c).lambda$saveSavedReactionsTags$489(this.b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                break;
            case 11:
                ((MessagesController) this.c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.b);
                break;
            case 12:
                ((MessagesController) this.c).lambda$didAddedNewTask$82(this.b, (SparseArray) this.d);
                break;
            case 13:
                ((MessagesController) this.c).lambda$updateTimerProc$159(this.b, (TLRPC.TL_chatOnlines) this.d);
                break;
            case 14:
                ((MessagesController) this.c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.b);
                break;
            case 15:
                ((MessagesStorage) this.c).lambda$updateUserInfoContactBlocked$131(this.b, (TL_account.RequirementToContact) this.d);
                break;
            case 16:
                ((MessagesStorage) this.c).lambda$isDialogHasTopMessage$175(this.b, (Runnable) this.d);
                break;
            case 17:
                ((MessagesStorage) this.c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.b);
                break;
            case 18:
                ((MessagesStorage) this.c).lambda$saveStoryAlbumsCache$269(this.b, (List) this.d);
                break;
            case 19:
                ((MessagesStorage) this.c).lambda$overwriteChannel$189(this.b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                break;
            case 20:
                ((MessagesStorage) this.c).lambda$createOrEditTopic$199(this.b, (TLRPC.TL_forumTopic) this.d);
                break;
            case 21:
                ((MessagesStorage) this.c).lambda$createPendingTask$10(this.b, (NativeByteBuffer) this.d);
                break;
            case 22:
                ((MessagesStorage) this.c).lambda$putChannelAdmins$124(this.b, (a0.h) this.d);
                break;
            case 23:
                ((MessagesStorage) this.c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.b);
                break;
            case 24:
                ((NotificationsController) this.c).lambda$loadTopicsNotificationsExceptions$54(this.b, (Consumer) this.d);
                break;
            case 25:
                ((SavedMessagesController) this.c).lambda$hasSavedMessages$14((TLObject) this.d, this.b);
                break;
            case 26:
                ((SecretChatHelper) this.c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.b);
                break;
            case 27:
                ((TopicsController) this.c).lambda$loadTopics$4(this.b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                break;
            default:
                ((TopicsController) this.c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ d4(BaseController baseController, long j10, Object obj, int i10) {
        this.a = i10;
        this.c = baseController;
        this.b = j10;
        this.d = obj;
    }
}

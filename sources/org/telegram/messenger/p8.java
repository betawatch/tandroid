package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p8(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, (String) this.c);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.d, (String) this.c);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.d, (TLObject) this.c);
                break;
            case 3:
                ((MediaDataController) this.b).lambda$clearBotKeyboard$194((ArrayList) this.d, (MessagesStorage.TopicKey) this.c);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$30((String) this.c, (Utilities.Callback) this.d);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$processLoadedMedia$135((ArrayList) this.d, (h9) this.c);
                break;
            case 6:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.d, (Utilities.Callback) this.c);
                break;
            case 7:
                ((MessagesController) this.b).lambda$requestIsUserContactBlocked$499((TLObject) this.d, (ArrayList) this.c);
                break;
            case 8:
                ((MessagesController) this.b).lambda$addUsersToChat$295((TLRPC.Chat) this.d, (TLRPC.TL_messages_invitedUsers) this.c);
                break;
            case 9:
                ((MessagesController) this.b).lambda$processMessageIDUpdate$377((long[]) this.d, (TL_update.TL_updateMessageID) this.c);
                break;
            case 10:
                ((MessagesController) this.b).lambda$getChannelDifference$343((ArrayList) this.d, (TLRPC.updates_ChannelDifference) this.c);
                break;
            case 11:
                ((MessagesController) this.b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.d, (ob) this.c);
                break;
            case 12:
                ((MessagesController) this.b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.d, (pb) this.c);
                break;
            case 13:
                ((MessagesController) this.b).lambda$getDifference$354((ArrayList) this.d, (TLRPC.updates_Difference) this.c);
                break;
            case 14:
                MessagesController.lambda$openByUserName$463((org.telegram.ui.ActionBar.e2[]) this.b, (boolean[]) this.d, (org.telegram.ui.ActionBar.r2) this.c);
                break;
            case 15:
                ((MessagesController) this.b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.d, (String) this.c);
                break;
            case 16:
                ((MessagesController) this.b).lambda$addUserToChat$308((TLRPC.Updates) this.d, (Runnable) this.c);
                break;
            case 17:
                ((MessagesController) this.b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.d, (LongSparseIntArray) this.c);
                break;
            case 18:
                ((MessagesController) this.b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.x6) this.d, (org.telegram.ui.ActionBar.w6) this.c);
                break;
            case 19:
                ((MessagesController.SavedMusicList) this.b).lambda$load$0((TLObject) this.d, (ArrayList) this.c);
                break;
            case 20:
                ((MessagesStorage) this.b).lambda$applyPhoneBookUpdates$151((String) this.c, (String) this.d);
                break;
            case 21:
                ((MessagesStorage) this.b).lambda$replaceMessageIfExists$235((MessageObject) this.d, (ArrayList) this.c);
                break;
            case 22:
                ((MessagesStorage) this.b).lambda$getNewTask$114((a0.h) this.d, (a0.h) this.c);
                break;
            case 23:
                ((MessagesStorage) this.b).lambda$saveBotCache$129((TLObject) this.d, (String) this.c);
                break;
            case 24:
                ((SavedMessagesController) this.b).lambda$saveCache$11((MessagesStorage) this.d, (ArrayList) this.c);
                break;
            case 25:
                ((SecretChatHelper) this.b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.d, (TLRPC.EncryptedChat) this.c);
                break;
            case 26:
                ((SendMessagesHelper) this.b).lambda$sendVote$34((String) this.c, (Runnable) this.d);
                break;
            case 27:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$52((TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.c);
                break;
            case 28:
                ((SendMessagesHelper) this.b).lambda$sendMessage$17((TLRPC.TL_error) this.d, (TLRPC.TL_messages_forwardMessages) this.c);
                break;
            default:
                ((TelegramMediaSession) this.b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.c);
                break;
        }
    }

    public /* synthetic */ p8(BaseController baseController, String str, Object obj, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = str;
        this.d = obj;
    }
}

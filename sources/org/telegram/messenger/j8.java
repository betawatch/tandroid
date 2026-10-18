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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j8(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.c, (String) this.d);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$clearBotKeyboard$194((ArrayList) this.c, (MessagesStorage.TopicKey) this.d);
                break;
            case 3:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.c);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$processLoadedMedia$135((ArrayList) this.c, (b9) this.d);
                break;
            case 5:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.c, (Utilities.Callback) this.d);
                break;
            case 6:
                ((MessagesController) this.b).lambda$addUsersToChat$295((TLRPC.Chat) this.c, (TLRPC.TL_messages_invitedUsers) this.d);
                break;
            case 7:
                ((MessagesController) this.b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.c, (ib) this.d);
                break;
            case 8:
                ((MessagesController) this.b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.c, (jb) this.d);
                break;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.b2[]) this.b, (boolean[]) this.c, (org.telegram.ui.ActionBar.n2) this.d);
                break;
            case 10:
                ((MessagesController) this.b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.c, (String) this.d);
                break;
            case 11:
                ((MessagesController) this.b).lambda$processMessageIDUpdate$375((long[]) this.c, (TL_update.TL_updateMessageID) this.d);
                break;
            case 12:
                ((MessagesController) this.b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.c, (LongSparseIntArray) this.d);
                break;
            case 13:
                ((MessagesController) this.b).lambda$getDifference$352((ArrayList) this.c, (TLRPC.updates_Difference) this.d);
                break;
            case 14:
                ((MessagesController) this.b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.c, (org.telegram.ui.ActionBar.f6) this.d);
                break;
            case 15:
                ((MessagesController) this.b).lambda$getChannelDifference$341((ArrayList) this.c, (TLRPC.updates_ChannelDifference) this.d);
                break;
            case 16:
                ((MessagesController) this.b).lambda$requestIsUserContactBlocked$497((TLObject) this.c, (ArrayList) this.d);
                break;
            case 17:
                ((MessagesController.SavedMusicList) this.b).lambda$load$0((TLObject) this.c, (ArrayList) this.d);
                break;
            case 18:
                ((MessagesStorage) this.b).lambda$saveBotCache$126((TLObject) this.c, (String) this.d);
                break;
            case 19:
                ((MessagesStorage) this.b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.c);
                break;
            case 20:
                ((MessagesStorage) this.b).lambda$replaceMessageIfExists$232((MessageObject) this.c, (ArrayList) this.d);
                break;
            case 21:
                ((MessagesStorage) this.b).lambda$getNewTask$111((a0.h) this.c, (a0.h) this.d);
                break;
            case 22:
                ((SavedMessagesController) this.b).lambda$saveCache$11((MessagesStorage) this.c, (ArrayList) this.d);
                break;
            case 23:
                ((SecretChatHelper) this.b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.c, (TLRPC.EncryptedChat) this.d);
                break;
            case 24:
                ((SendMessagesHelper) this.b).lambda$sendVote$34((String) this.d, (Runnable) this.c);
                break;
            case 25:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$52((TLObject) this.c, (SendMessagesHelper.DelayedMessage) this.d);
                break;
            case 26:
                ((SendMessagesHelper) this.b).lambda$sendMessage$17((TLRPC.TL_error) this.c, (TLRPC.TL_messages_forwardMessages) this.d);
                break;
            case 27:
                ((TelegramMediaSession) this.b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.c, (String) this.d);
                break;
            case 28:
                ((TranslateController) this.b).lambda$checkDialogMessageSure$10((ArrayList) this.c, (ArrayList) this.d);
                break;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.b, (Utilities.Callback[]) this.c, (Runnable) this.d);
                break;
        }
    }

    public /* synthetic */ j8(BaseController baseController, String str, Object obj, int i10) {
        this.a = i10;
        this.b = baseController;
        this.d = str;
        this.c = obj;
    }
}

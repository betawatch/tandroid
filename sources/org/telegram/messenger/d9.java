package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d9(int i10, Object obj, Object obj2, String str) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$30((String) this.c, (Utilities.Callback) this.d);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$preloadPremiumPreviewStickers$205((TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 2:
                ((MediaDataController) this.b).lambda$processLoadedMedia$135((ArrayList) this.c, (c7) this.d);
                break;
            case 3:
                ((MediaDataController) this.b).lambda$saveToRingtones$203((TLObject) this.c, (TLRPC.Document) this.d);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.c, (Utilities.Callback) this.d);
                break;
            case 5:
                ((MessagesController) this.b).lambda$requestIsUserContactBlocked$494((TLObject) this.c, (ArrayList) this.d);
                break;
            case 6:
                ((MessagesController) this.b).lambda$setUserAdminRole$104((TLRPC.TL_channels_editAdmin) this.c, (fb) this.d);
                break;
            case 7:
                ((MessagesController) this.b).lambda$setUserAdminRole$109((TLRPC.TL_messages_editChatAdmin) this.c, (gb) this.d);
                break;
            case 8:
                ((MessagesController) this.b).lambda$updateChatAbout$289((TLRPC.ChatFull) this.d, (String) this.c);
                break;
            case 9:
                ((MessagesController) this.b).lambda$addUsersToChat$296((TLRPC.Chat) this.c, (TLRPC.TL_messages_invitedUsers) this.d);
                break;
            case 10:
                MessagesController.lambda$openByUserName$458((org.telegram.ui.ActionBar.d2[]) this.b, (boolean[]) this.c, (org.telegram.ui.ActionBar.p2) this.d);
                break;
            case 11:
                ((MessagesController) this.b).lambda$didReceivedNotification$50((org.telegram.ui.ActionBar.i6) this.c, (org.telegram.ui.ActionBar.h6) this.d);
                break;
            case 12:
                ((MessagesController) this.b).lambda$processDialogsUpdateRead$223((LongSparseIntArray) this.c, (LongSparseIntArray) this.d);
                break;
            case 13:
                ((MessagesController) this.b).lambda$getDifference$353((ArrayList) this.c, (TLRPC.updates_Difference) this.d);
                break;
            case 14:
                ((MessagesController) this.b).lambda$getChannelDifference$342((ArrayList) this.c, (TLRPC.updates_ChannelDifference) this.d);
                break;
            case 15:
                ((MessagesController.SavedMusicList) this.b).lambda$load$0((TLObject) this.c, (ArrayList) this.d);
                break;
            case 16:
                ((MessagesStorage) this.b).lambda$saveBotCache$126((TLObject) this.d, (String) this.c);
                break;
            case 17:
                ((MessagesStorage) this.b).lambda$applyPhoneBookUpdates$148((String) this.c, (String) this.d);
                break;
            case 18:
                ((MessagesStorage) this.b).lambda$replaceMessageIfExists$232((MessageObject) this.c, (ArrayList) this.d);
                break;
            case 19:
                ((MessagesStorage) this.b).lambda$getNewTask$111((a0.h) this.c, (a0.h) this.d);
                break;
            case 20:
                ((SavedMessagesController) this.b).lambda$saveCache$11((MessagesStorage) this.c, (ArrayList) this.d);
                break;
            case 21:
                ((SecretChatHelper) this.b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.c, (TLRPC.EncryptedChat) this.d);
                break;
            case 22:
                ((SendMessagesHelper) this.b).lambda$sendVote$31((String) this.c, (Runnable) this.d);
                break;
            case 23:
                ((SendMessagesHelper) this.b).lambda$performSendDelayedMessage$49((TLObject) this.c, (SendMessagesHelper.DelayedMessage) this.d);
                break;
            case 24:
                ((SendMessagesHelper) this.b).lambda$sendMessage$14((TLRPC.TL_error) this.c, (TLRPC.TL_messages_forwardMessages) this.d);
                break;
            case 25:
                ((TelegramMediaSession) this.b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.d, (String) this.c);
                break;
            case 26:
                ((TranslateController) this.b).lambda$checkDialogMessageSure$10((ArrayList) this.c, (ArrayList) this.d);
                break;
            case 27:
                Utilities.lambda$raceCallbacks$1((int[]) this.b, (Utilities.Callback[]) this.c, (Runnable) this.d);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.c, (String) this.b, (byte[]) this.d);
                break;
        }
    }

    public /* synthetic */ d9(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ d9(String str, String str2, byte[] bArr) {
        this.a = 28;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}

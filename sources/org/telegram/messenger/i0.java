package org.telegram.messenger;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BirthdayController) this.c).lambda$new$1(this.b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.e);
                break;
            case 1:
                ((MessagesController) this.c).lambda$checkChatlistFolderUpdate$477((TLObject) this.d, this.b, (MessagesController.ChatlistUpdatesStat) this.e);
                break;
            case 2:
                ((ContactsController) this.c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 3:
                ((ContactsController) this.c).lambda$processLoadedContacts$37((ArrayList) this.d, this.b, (ArrayList) this.e);
                break;
            case 4:
                ((ImageLoader) this.c).lambda$fileDidLoaded$11((String) this.d, this.b, (File) this.e);
                break;
            case 5:
                ((LocaleController) this.c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.b, (Runnable) this.e);
                break;
            case 6:
                ((MediaDataController) this.c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$loadBotInfo$197((Utilities.Callback) this.d, (TL_bots.BotInfo) this.e, this.b);
                break;
            case 8:
                ((MediaDataController) this.c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.e, this.b);
                break;
            case 9:
                ((MessagesController) this.c).lambda$processLoadedDeleteTask$88((a0.h) this.d, (a0.h) this.e, this.b);
                break;
            case 10:
                ((MessagesController) this.c).lambda$loadFullUser$70((TLRPC.UserFull) this.d, (TLRPC.User) this.e, this.b);
                break;
            case 11:
                ((MessagesController) this.c).lambda$loadMessagesInternal$184(this.b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                break;
            case 12:
                ((MessagesController) this.c).lambda$loadMessagesInternal$182(this.b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                break;
            case 13:
                ((MessagesController) this.c).lambda$loadMessagesInternal$177(this.b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                break;
            case 14:
                ((MessagesController) this.c).lambda$loadMessagesInternal$179(this.b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                break;
            case 15:
                ((MessagesStorage) this.c).lambda$hasAuthMessage$176(this.b, (boolean[]) this.d, (CountDownLatch) this.e);
                break;
            case 16:
                ((MessagesStorage) this.c).lambda$getBotCache$127(this.b, (String) this.d, (RequestDelegate) this.e);
                break;
            case 17:
                PasskeysController.lambda$create$6((Context) this.c, this.b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.e);
                break;
            default:
                ((SecretChatHelper) this.c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.e, this.b);
                break;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ i0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = baseController;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
    }
}

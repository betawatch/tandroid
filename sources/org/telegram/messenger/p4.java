package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ImageLoader) this.c).lambda$runHttpFileLoadTasks$14((ImageLoader.HttpFileTask) this.d, this.b);
                break;
            case 1:
                ((MediaDataController.1) this.c).lambda$run$0((Runnable) this.d, this.b);
                break;
            case 2:
                ((DownloadController) this.c).lambda$onDownloadFail$8((MessageObject) this.d, this.b);
                break;
            case 3:
                ((FileLoader) this.c).lambda$changePriority$11((String) this.d, this.b);
                break;
            case 4:
                ((ImageLoader) this.c).lambda$changeFileLoadingPriorityForImageReceiver$3((ImageReceiver) this.d, this.b);
                break;
            case 5:
                ((LocationController) this.c).lambda$saveSharingLocation$18(this.b, (LocationController.SharingLocationInfo) this.d);
                break;
            case 6:
                ((MediaDataController) this.c).lambda$putPremiumPromoToCache$10((TLRPC.TL_help_premiumPromo) this.d, this.b);
                break;
            case 7:
                ((MediaDataController) this.c).lambda$addRecentSticker$23(this.b, (TLRPC.Document) this.d);
                break;
            case 8:
                ((MediaDataController) this.c).lambda$updateEmojiStatuses$234(this.b, (TL_account.TL_emojiStatuses) this.d);
                break;
            case 9:
                ((MediaDataController) this.c).lambda$toggleStickerSetInternal$116((TLRPC.StickerSet) this.d, this.b);
                break;
            case 10:
                ((MediaDataController) this.c).lambda$loadStickers$93(this.b, (Utilities.Callback) this.d);
                break;
            case 11:
                ((MessagesController) this.c).lambda$checkCanOpenChat$454(this.b, (org.telegram.ui.ActionBar.o2) this.d);
                break;
            case 12:
                ((MessagesController) this.c).lambda$loadGlobalNotificationsSettings$200((TLObject) this.d, this.b);
                break;
            case 13:
                ((MessagesController) this.c).lambda$migrateDialogs$214((TLRPC.messages_Dialogs) this.d, this.b);
                break;
            case 14:
                ((MessagesController) this.c).lambda$toggleChatNoForwards$276((Utilities.Callback2) this.d, this.b);
                break;
            case 15:
                ((MessagesController.DialogPhotos) this.c).lambda$loadCache$4(this.b, (HashMap) this.d);
                break;
            case 16:
                ((MessagesStorage) this.c).lambda$markMessageAsSendError$209(this.b, (TLRPC.Message) this.d);
                break;
            case 17:
                ((MessagesStorage) this.c).lambda$broadcastScheduledMessagesChange$222((Long) this.d, this.b);
                break;
            case 18:
                ((MessagesStorage) this.c).lambda$putDialogs$253((TLRPC.messages_Dialogs) this.d, this.b);
                break;
            case 19:
                ((NotificationCenter) this.c).lambda$postNotificationNameOnUIThread$1(this.b, (Object[]) this.d);
                break;
            case 20:
                ((NotificationsController) this.c).lambda$processNewMessages$25((ArrayList) this.d, this.b);
                break;
            case 21:
                ((SecretChatHelper) this.c).lambda$performSendEncryptedRequest$4((TLRPC.Message) this.d, this.b);
                break;
            default:
                ((UserNameResolver) this.c).lambda$resolve$2((String) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ p4(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }
}

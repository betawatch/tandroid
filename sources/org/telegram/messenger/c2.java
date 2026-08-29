package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DownloadController) this.b).lambda$deleteRecentFiles$13((ArrayList) this.c);
                break;
            case 1:
                ((DownloadController) this.b).lambda$loadAutoDownloadConfig$1((TLObject) this.c);
                break;
            case 2:
                ((FactCheckController) this.b).lambda$applyFactCheck$14((TLRPC.Updates) this.c);
                break;
            case 3:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.b, (TLRPC.TL_factCheck) this.c);
                break;
            case 4:
                ((FileLoadOperation) this.b).lambda$start$11((boolean[]) this.c);
                break;
            case 5:
                ((FileLoadOperation) this.b).lambda$addPart$2((ArrayList) this.c);
                break;
            case 6:
                ((FileLoader) this.b).lambda$uploadFile$19((NotificationCenter.NotificationCenterDelegate[]) this.c);
                break;
            case 7:
                ((FileLoader) this.b).lambda$checkCurrentDownloadsFiles$17((ArrayList) this.c);
                break;
            case 8:
                FileLog.lambda$e$2((String) this.b, (Throwable) this.c);
                break;
            case 9:
                ((FilePathDatabase) this.b).lambda$removeFiles$6((List) this.c);
                break;
            case 10:
                ((FileRefController) this.b).lambda$onRequestComplete$47((TLRPC.User) this.c);
                break;
            case 11:
                ((FileRefController) this.b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.c);
                break;
            case 12:
                ((GiftAuctionController) this.b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.c);
                break;
            case 13:
                ((ImageLoader) this.b).lambda$checkMediaPaths$1((Runnable) this.c);
                break;
            case 14:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.b, (Runnable) this.c);
                break;
            case 15:
                ((MediaController) this.b).lambda$playEmojiSound$17((File) this.c);
                break;
            case 16:
                ((MediaController) this.b).lambda$processMediaObserver$6((ArrayList) this.c);
                break;
            case 17:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.b, (TLRPC.TL_document) this.c);
                break;
            case 18:
                ((MediaController) this.b).lambda$startAudioAgain$7((MessageObject) this.c);
                break;
            case 19:
                ((MediaDataController) this.b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.c);
                break;
            case 20:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.b, (Runnable) this.c);
                break;
            case 21:
                MediaDataController.lambda$fillWithAnimatedEmoji$228((boolean[]) this.b, (w6) this.c);
                break;
            case 22:
                ((MediaDataController) this.b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.c);
                break;
            case 23:
                ((MessageObject) this.b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.c);
                break;
            case 24:
                ((MessagesController) this.b).lambda$getDifference$351((TLRPC.updates_Difference) this.c);
                break;
            case 25:
                ((MessagesController) this.b).lambda$requestContactToken$475((Utilities.Callback) this.c);
                break;
            case 26:
                ((MessagesController) this.b).lambda$checkTosUpdate$162((TLRPC.TL_help_termsOfServiceUpdate) this.c);
                break;
            case 27:
                ((MessagesController) this.b).lambda$changeChatAvatar$318((Runnable) this.c);
                break;
            case 28:
                ((MessagesController) this.b).lambda$createChat$260((TLRPC.Updates) this.c);
                break;
            default:
                ((MessagesController) this.b).lambda$processUpdateArray$392((TL_update.TL_updateServiceNotification) this.c);
                break;
        }
    }
}

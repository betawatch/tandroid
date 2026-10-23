package org.telegram.messenger;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.b).lambda$applyFactCheck$14((TLRPC.Updates) this.c);
                break;
            case 1:
                FactCheckController.lambda$saveToDatabase$6((MessagesStorage) this.b, (TLRPC.TL_factCheck) this.c);
                break;
            case 2:
                ((FileLoadOperation) this.b).lambda$start$12((boolean[]) this.c);
                break;
            case 3:
                ((FileLoadOperation) this.b).lambda$addPart$3((ArrayList) this.c);
                break;
            case 4:
                ((FileLoader) this.b).lambda$uploadFile$21((NotificationCenter.NotificationCenterDelegate[]) this.c);
                break;
            case 5:
                ((FileLoader) this.b).lambda$checkCurrentDownloadsFiles$19((ArrayList) this.c);
                break;
            case 6:
                FileLog.lambda$e$3((String) this.b, (Throwable) this.c);
                break;
            case 7:
                ((FilePathDatabase) this.b).lambda$removeFiles$6((List) this.c);
                break;
            case 8:
                ((FileRefController) this.b).lambda$onRequestComplete$47((TLRPC.User) this.c);
                break;
            case 9:
                ((FileRefController) this.b).lambda$onRequestComplete$50((TLRPC.TL_messages_stickerSet) this.c);
                break;
            case 10:
                ((GiftAuctionController) this.b).lambda$sendBid$7((TLRPC.TL_payments_paymentResult) this.c);
                break;
            case 11:
                ((ImageLoader) this.b).lambda$checkMediaPaths$1((Runnable) this.c);
                break;
            case 12:
                ImageLoader.lambda$checkMediaPaths$0((SparseArray) this.b, (Runnable) this.c);
                break;
            case 13:
                ((MediaController) this.b).lambda$playEmojiSound$17((File) this.c);
                break;
            case 14:
                MediaController.lambda$playEmojiSound$18((AccountInstance) this.b, (TLRPC.TL_document) this.c);
                break;
            case 15:
                ((MediaController) this.b).lambda$processMediaObserver$6((ArrayList) this.c);
                break;
            case 16:
                ((MediaController) this.b).lambda$startAudioAgain$7((MessageObject) this.c);
                break;
            case 17:
                MediaDataController.lambda$loadReplyMessagesForMessages$172((AtomicInteger) this.b, (Runnable) this.c);
                break;
            case 18:
                MediaDataController.lambda$fillWithAnimatedEmoji$229((boolean[]) this.b, (a7) this.c);
                break;
            case 19:
                ((MediaDataController) this.b).lambda$loadGroupStickerSet$44((TLRPC.StickerSet) this.c);
                break;
            case 20:
                ((MediaDataController) this.b).lambda$loadHints$147((TLRPC.TL_contacts_topPeers) this.c);
                break;
            case 21:
                ((MessageObject) this.b).lambda$loadAnimatedEmojiDocument$0((TLRPC.Document) this.c);
                break;
            case 22:
                ((MessagesController) this.b).lambda$processUpdateArray$415((TL_update.TL_updateChannel) this.c);
                break;
            case 23:
                ((MessagesController) this.b).lambda$createChat$256((TLRPC.TL_messages_invitedUsers) this.c);
                break;
            case 24:
                ((MessagesController) this.b).lambda$processMessageIDUpdate$376((TL_update.TL_updateMessageID) this.c);
                break;
            case 25:
                ((MessagesController) this.b).lambda$createChat$259((TLRPC.Updates) this.c);
                break;
            case 26:
                MessagesController.lambda$addUserToChat$298((Utilities.Callback) this.b, (Runnable) this.c);
                break;
            case 27:
                ((MessagesController) this.b).lambda$checkChatInviter$370((TLRPC.TL_channels_channelParticipant) this.c);
                break;
            case 28:
                ((MessagesController) this.b).lambda$checkTosUpdate$161((TLRPC.TL_help_termsOfServiceUpdate) this.c);
                break;
            default:
                ((MessagesController) this.b).lambda$processUpdateArray$395((TL_update.TL_updateServiceNotification) this.c);
                break;
        }
    }
}

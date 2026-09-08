package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i10, Object obj, Object obj2, ArrayList arrayList) {
        this.a = i10;
        this.d = arrayList;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BirthdayController) this.b).lambda$new$0((BirthdayController.TL_birthdays) this.c, (ArrayList) this.d);
                break;
            case 1:
                ((ImageLoader.5) this.b).lambda$fileLoadProgressChanged$7((String) this.c, (FileLoadOperation) this.d);
                break;
            case 2:
                ((ImageLoader.CacheOutTask) this.b).lambda$onPostExecute$0((Drawable) this.c, (String) this.d);
                break;
            case 3:
                ((SendMessagesHelper.ImportingHistory.3) this.b).lambda$run$0((TLRPC.TL_error) this.c, (TLRPC.TL_messages_startHistoryImport) this.d);
                break;
            case 4:
                ((SendMessagesHelper.ImportingSticker.1) this.b).lambda$run$0((TLObject) this.c, (Runnable) this.d);
                break;
            case 5:
                ((TranslateController) this.b).lambda$detectStoryLanguage$33((TL_stories.StoryItem) this.c, (TranslateController.StoryKey) this.d);
                break;
            case 6:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.b, (org.telegram.ui.Components.ad[]) this.c, (fg.b) this.d);
                break;
            case 7:
                ((BetaUpdaterController) this.b).lambda$checkForUpdate$1((String) this.c, (Runnable) this.d);
                break;
            case 8:
                BillingController.lambda$launchBillingFlow$3((ArrayList) this.d, (AtomicInteger) this.b, (a0) this.c);
                break;
            case 9:
                BillingController.lambda$onPurchasesUpdatedInternal$7((AccountInstance) this.b, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, (TL_update.TL_updateSentPhoneCode) this.d);
                break;
            case 10:
                ((CacheFetcher) this.b).lambda$saveCallback$2((Pair) this.c, (Utilities.Callback) this.d);
                break;
            case 11:
                ChannelBoostsController.lambda$getBoostsStats$0((TLObject) this.b, (e2.h) this.c, (TLRPC.TL_error) this.d);
                break;
            case 12:
                ChatThemeController.lambda$saveWallpaperPatternBitmap$12((File) this.b, (List) this.c, (Bitmap) this.d);
                break;
            case 13:
                CodeHighlighting.lambda$highlightEditable$0((ArrayList) this.d, (SpannableString) this.b, (Utilities.Callback) this.c);
                break;
            case 14:
                ((ContactsController) this.b).lambda$addContact$51((TLRPC.Updates) this.c, (TLRPC.User) this.d);
                break;
            case 15:
                ((ContactsController) this.b).lambda$reloadContactsStatuses$58((SharedPreferences.Editor) this.c, (Vector) this.d);
                break;
            case 16:
                ((ContactsController) this.b).lambda$applyContactsUpdates$48((ArrayList) this.d, (ArrayList) this.c);
                break;
            case 17:
                ((DispatchQueuePoolBackground) this.b).lambda$execute$1((Runnable) this.c, (DispatchQueue) this.d);
                break;
            case 18:
                ((DownloadController) this.b).lambda$loadDownloadingFiles$10((ArrayList) this.d, (ArrayList) this.c);
                break;
            case 19:
                FactCheckController.lambda$getFromDatabase$5((MessagesStorage) this.b, (ArrayList) this.d, (Utilities.Callback) this.c);
                break;
            case 20:
                ((FileLoadOperation) this.b).lambda$getCurrentFile$3((File[]) this.c, (CountDownLatch) this.d);
                break;
            case 21:
                FileLoadOperation.lambda$cancelRequests$15((FileLoadOperation.RequestInfo) this.b, (int[]) this.c, (Runnable) this.d);
                break;
            case 22:
                ((FileLoader) this.b).lambda$setForceStreamLoadingFile$6((TLRPC.FileLocation) this.c, (String) this.d);
                break;
            case 23:
                ((FileLoader) this.b).lambda$checkDownloadQueue$15((FileLoaderPriorityQueue) this.c, (FileLoadOperation) this.d);
                break;
            case 24:
                ((FilePathDatabase) this.b).lambda$saveFileDialogId$5((File) this.c, (FilePathDatabase.FileMeta) this.d);
                break;
            case 25:
                LocaleController.lambda$applyRemoteLanguage$13((int[]) this.b, (int[]) this.c, (Runnable) this.d);
                break;
            case 26:
                ((LocationController) this.b).lambda$addSharingLocation$11((LocationController.SharingLocationInfo) this.c, (LocationController.SharingLocationInfo) this.d);
                break;
            case 27:
                ((MediaDataController) this.b).lambda$processLoadedDiceStickers$88((String) this.c, (TLRPC.TL_messages_stickerSet) this.d);
                break;
            case 28:
                ((MediaDataController) this.b).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.c, (String) this.d);
                break;
            default:
                ((MediaDataController) this.b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.c, (String) this.d);
                break;
        }
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ f0(BaseController baseController, ArrayList arrayList, Object obj, int i10) {
        this.a = i10;
        this.b = baseController;
        this.d = arrayList;
        this.c = obj;
    }
}

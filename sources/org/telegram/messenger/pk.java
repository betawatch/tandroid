package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pk(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((SendMessagesHelper.ImportingHistory.1) this.d).lambda$run$0((TLObject) this.c, (TLRPC.TL_messages_initHistoryImport) this.e, (TLRPC.TL_error) this.b);
                break;
            case 1:
                ((SendMessagesHelper.ImportingStickers.1) this.d).lambda$run$0((TLRPC.TL_error) this.b, (TLRPC.TL_stickers_createStickerSet) this.e, (TLObject) this.c);
                break;
            case 2:
                ((TranslateController) this.d).lambda$detectPhotoLanguage$41((MessageObject) this.c, (TranslateController.MessageKey) this.e, (Utilities.Callback) this.b);
                break;
            case 3:
                ((TranslateController) this.d).lambda$detectStoryLanguage$31((TL_stories.StoryItem) this.c, (String) this.e, (TranslateController.StoryKey) this.b);
                break;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.d, (org.telegram.ui.Components.ad[]) this.c, (fg.b) this.e, (Activity) this.b);
                break;
            case 5:
                CodeHighlighting.lambda$highlightEditable$1((String) this.d, (String) this.c, (SpannableString) this.e, (Utilities.Callback) this.b);
                break;
            case 6:
                ((FilePathDatabase) this.d).lambda$lookupFiles$7((ArrayList) this.c, (LongSparseArray) this.e, (CountDownLatch) this.b);
                break;
            case 7:
                ((FilePathDatabase) this.d).lambda$checkMediaExistance$2((ArrayList) this.c, (long[]) this.e, (CountDownLatch) this.b);
                break;
            case 8:
                ((FileRefController) this.d).lambda$requestReferenceFromServer$0((String) this.c, (String) this.e, (bi.a8) this.b);
                break;
            case 9:
                ((ImageLoader) this.d).lambda$replaceImageInCache$5((String) this.c, (String) this.e, (ImageLocation) this.b);
                break;
            case 10:
                ((LocationController) this.d).lambda$loadSharingLocations$16((ArrayList) this.c, (ArrayList) this.e, (ArrayList) this.b);
                break;
            case 11:
                ((MediaController) this.d).lambda$generateWaveform$39((String) this.c, (String) this.e, (MessageObject) this.b);
                break;
            case 12:
                ((MediaController) this.d).lambda$prepareResumedRecording$24((File) this.c, (TLRPC.TL_document) this.e, (MediaDataController.DraftVoice) this.b);
                break;
            case 13:
                ((MediaController) this.d).lambda$generateWaveform$38((String) this.c, (byte[]) this.e, (MessageObject) this.b);
                break;
            case 14:
                ((MediaDataController) this.d).lambda$loadSavedReactions$239((TLRPC.TL_error) this.b, (TLObject) this.c, (SharedPreferences) this.e);
                break;
            case 15:
                ((MediaDataController) this.d).lambda$getEmojiSuggestions$219((String[]) this.c, (MediaDataController.KeywordResultCallback) this.e, (ArrayList) this.b);
                break;
            case 16:
                MediaDataController.lambda$getEmojiSuggestions$222((CountDownLatch) this.d, (MediaDataController.KeywordResultCallback) this.c, (ArrayList) this.e, (String) this.b);
                break;
            case 17:
                MediaDataController.lambda$getAnimatedEmojiByKeywords$216((String) this.d, (ArrayList) this.c, (ArrayList) this.e, (Utilities.Callback) this.b);
                break;
            case 18:
                ((MediaDataController) this.d).lambda$getEmojiNames$218((String[]) this.c, (String) this.e, (Utilities.Callback) this.b);
                break;
            case 19:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$227((boolean[]) this.c, (ArrayList[]) this.e, (s6) this.b);
                break;
            case 20:
                ((MessagesController) this.d).lambda$setUserAdminRole$106((TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.n2) this.c, (TLRPC.TL_messages_editChatAdmin) this.e);
                break;
            case 21:
                ((MessagesController) this.d).lambda$createChat$259((TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.n2) this.c, (TLRPC.TL_channels_createChannel) this.e);
                break;
            case 22:
                ((MessagesController) this.d).lambda$addUsersToChannel$272((TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.n2) this.c, (TLRPC.TL_channels_inviteToChannel) this.e);
                break;
            case 23:
                ((MessagesController) this.d).lambda$createChat$256((TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.n2) this.c, (TLRPC.TL_messages_createChat) this.e);
                break;
            case 24:
                ((MessagesController) this.d).lambda$completeDialogsReset$211((TLRPC.messages_Dialogs) this.c, (a0.i) this.e, (a0.i) this.b);
                break;
            case 25:
                ((MessagesController) this.d).lambda$getDifference$356((ArrayList) this.c, (TLRPC.updates_Difference) this.e, (a0.i) this.b);
                break;
            case 26:
                ((MessagesController) this.d).lambda$getDifference$357((TLRPC.updates_Difference) this.c, (a0.i) this.e, (a0.i) this.b);
                break;
            case 27:
                ((MessagesStorage) this.d).lambda$putEncryptedChat$178((TLRPC.EncryptedChat) this.c, (TLRPC.User) this.e, (TLRPC.Dialog) this.b);
                break;
            case 28:
                ((MessagesStorage) this.d).lambda$addRecentLocalFile$82((TLRPC.Document) this.c, (String) this.e, (String) this.b);
                break;
            default:
                ((MessagesStorage) this.d).lambda$markMessagesAsRead$219((LongSparseIntArray) this.c, (LongSparseIntArray) this.e, (SparseIntArray) this.b);
                break;
        }
    }

    public /* synthetic */ pk(BaseController baseController, TLRPC.TL_error tL_error, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.d = baseController;
        this.b = tL_error;
        this.c = obj;
        this.e = obj2;
    }

    public /* synthetic */ pk(SendMessagesHelper.ImportingStickers.1 r22, TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
        this.a = 1;
        this.d = r22;
        this.b = tL_error;
        this.e = tL_stickers_createStickerSet;
        this.c = tLObject;
    }
}

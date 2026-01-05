package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.BotWebViewSheet;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class SendMessagesHelper extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    private static final int ERROR_TYPE_FILE_TOO_LARGE = 2;
    private static final int ERROR_TYPE_UNSUPPORTED = 1;
    private static volatile SendMessagesHelper[] Instance = null;
    public static final int MEDIA_TYPE_DICE = 11;
    public static final int MEDIA_TYPE_STORY = 12;
    private static DispatchQueue mediaSendQueue = new DispatchQueue("mediaSendQueue");
    private static ThreadPoolExecutor mediaSendThreadPool;
    private final HashMap<String, ArrayList<DelayedMessage>> delayedMessages;
    private final SparseArray<TLRPC.Message> editingMessages;
    private final HashMap<String, ImportingHistory> importingHistoryFiles;
    private final LongSparseArray importingHistoryMap;
    private final HashMap<String, ImportingStickers> importingStickersFiles;
    private final HashMap<String, ImportingStickers> importingStickersMap;
    private LocationProvider locationProvider;
    private final SparseArray<TLRPC.Message> sendingMessages;
    private final LongSparseArray sendingMessagesIdDialogs;
    private final SparseArray<MessageObject> unsentMessages;
    private final SparseArray<TLRPC.Message> uploadMessages;
    private final LongSparseArray uploadingMessagesIdDialogs;
    private final LongSparseArray voteSendTime;
    private final HashMap<String, Boolean> waitingForCallback;
    private final HashMap<String, List<String>> waitingForCallbackMap;
    private final HashMap<String, MessageObject> waitingForLocation;
    private final HashMap<Integer, Boolean> waitingForTodoUpdate;
    private final HashMap<String, byte[]> waitingForVote;

    public static class SendingMediaInfo {
        public boolean canDeleteAfter;
        public String caption;
        public String coverPath;
        public TLRPC.Photo coverPhoto;
        public TLRPC.VideoSize emojiMarkup;
        public ArrayList<TLRPC.MessageEntity> entities;
        public boolean forceImage;
        public boolean hasMediaSpoilers;
        public boolean highQuality;
        public TLRPC.BotInlineResult inlineResult;
        public boolean isVideo;
        public ArrayList<TLRPC.InputDocument> masks;
        public MediaController.PhotoEntry originalPhotoEntry;
        public String paintPath;
        public HashMap<String, String> params;
        public String path;
        public MediaController.SearchImage searchImage;
        public long stars;
        public String thumbPath;
        public int ttl;
        public boolean updateStickersOrder;
        public Uri uri;
        public VideoEditedInfo videoEditedInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendCallback$32(String str) {
    }

    public static boolean checkUpdateStickersOrder(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) {
                if (animatedEmojiSpan.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public TLRPC.InputReplyTo createReplyInput(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().getInputPeer(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public TLRPC.InputReplyTo createReplyInput(int i) {
        return createReplyInput(null, i, 0, null);
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.InputPeer inputPeer, int i, int i2, ChatActivity.ReplyQuote replyQuote) {
        MessageObject messageObject;
        TLRPC.TodoItem todoItem;
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = i;
        if (i2 != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = i2;
        }
        if (replyQuote != null && replyQuote.todo && (todoItem = replyQuote.task) != null) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = todoItem.id;
        } else if (replyQuote != null && !replyQuote.todo) {
            String text = replyQuote.getText();
            tL_inputReplyToMessage.quote_text = text;
            if (!TextUtils.isEmpty(text)) {
                tL_inputReplyToMessage.flags |= 4;
                ArrayList<TLRPC.MessageEntity> entities = replyQuote.getEntities();
                tL_inputReplyToMessage.quote_entities = entities;
                if (entities != null && !entities.isEmpty()) {
                    tL_inputReplyToMessage.quote_entities = new ArrayList<>(tL_inputReplyToMessage.quote_entities);
                    tL_inputReplyToMessage.flags |= 8;
                }
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = replyQuote.start;
            }
        }
        if (replyQuote != null && (messageObject = replyQuote.message) != null) {
            TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (inputPeer2 != null && !MessageObject.peersEqual(inputPeer2, inputPeer)) {
                tL_inputReplyToMessage.flags |= 2;
                tL_inputReplyToMessage.reply_to_peer_id = inputPeer2;
            }
        }
        return tL_inputReplyToMessage;
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i = tL_messageReplyHeader.flags;
        if ((i & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            int i2 = tL_messageReplyHeader.flags;
            if ((i2 & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if ((i2 & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((i2 & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        return tL_inputReplyToMessage;
    }

    public class ImportingHistory {
        public long dialogId;
        public double estimatedUploadSpeed;
        public String historyPath;
        public long importId;
        private long lastUploadSize;
        private long lastUploadTime;
        public TLRPC.InputPeer peer;
        public long totalSize;
        public int uploadProgress;
        public long uploadedSize;
        public ArrayList<Uri> mediaPaths = new ArrayList<>();
        public HashSet<String> uploadSet = new HashSet<>();
        public HashMap<String, Float> uploadProgresses = new HashMap<>();
        public HashMap<String, Long> uploadSize = new HashMap<>();
        public ArrayList<String> uploadMedia = new ArrayList<>();
        public int timeUntilFinish = ConnectionsManager.DEFAULT_DATACENTER_ID;

        public ImportingHistory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initImport(TLRPC.InputFile inputFile) {
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile;
            tL_messages_initHistoryImport.media_count = this.mediaPaths.size();
            tL_messages_initHistoryImport.peer = this.peer;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new 1(tL_messages_initHistoryImport), 2);
        }

        class 1 implements RequestDelegate {
            final /* synthetic */ TLRPC.TL_messages_initHistoryImport val$req;

            1(TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
                this.val$req = tL_messages_initHistoryImport;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingHistory$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.1.this.lambda$run$0(tLObject, tL_messages_initHistoryImport, tL_error);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(TLObject tLObject, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport, TLRPC.TL_error tL_error) {
                if (!(tLObject instanceof TLRPC.TL_messages_historyImport)) {
                    SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_initHistoryImport, tL_error);
                    return;
                }
                ImportingHistory importingHistory = ImportingHistory.this;
                importingHistory.importId = ((TLRPC.TL_messages_historyImport) tLObject).id;
                importingHistory.uploadSet.remove(importingHistory.historyPath);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                if (ImportingHistory.this.uploadSet.isEmpty()) {
                    ImportingHistory.this.startImport();
                }
                ImportingHistory.this.lastUploadTime = SystemClock.elapsedRealtime();
                int size = ImportingHistory.this.uploadMedia.size();
                for (int i = 0; i < size; i++) {
                    SendMessagesHelper.this.getFileLoader().uploadFile(ImportingHistory.this.uploadMedia.get(i), false, true, 67108864);
                }
            }
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onFileFailedToUpload(String str) {
            if (str.equals(this.historyPath)) {
                SendMessagesHelper.this.importingHistoryMap.remove(this.dialogId);
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.code = 400;
                tL_error.text = "IMPORT_UPLOAD_FAILED";
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                return;
            }
            this.uploadSet.remove(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUploadProgress(String str, long j, float f) {
            this.uploadProgresses.put(str, Float.valueOf(f));
            this.uploadSize.put(str, Long.valueOf(j));
            this.uploadedSize = 0L;
            Iterator<Map.Entry<String, Long>> it = this.uploadSize.entrySet().iterator();
            while (it.hasNext()) {
                this.uploadedSize += it.next().getValue().longValue();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!str.equals(this.historyPath)) {
                long j2 = this.uploadedSize;
                if (j2 != this.lastUploadSize) {
                    if (elapsedRealtime != this.lastUploadTime) {
                        double d = (j2 - r2) / ((elapsedRealtime - r4) / 1000.0d);
                        double d2 = this.estimatedUploadSpeed;
                        if (d2 == 0.0d) {
                            this.estimatedUploadSpeed = d;
                        } else {
                            this.estimatedUploadSpeed = (d * 0.01d) + (d2 * 0.99d);
                        }
                        this.timeUntilFinish = (int) (((this.totalSize - j2) * 1000) / this.estimatedUploadSpeed);
                        this.lastUploadSize = j2;
                        this.lastUploadTime = elapsedRealtime;
                    }
                }
            }
            int uploadedCount = (int) ((getUploadedCount() / getTotalCount()) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onMediaImport(String str, long j, TLRPC.InputFile inputFile) {
            String str2;
            addUploadProgress(str, j, 1.0f);
            TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
            tL_messages_uploadImportedMedia.peer = this.peer;
            tL_messages_uploadImportedMedia.import_id = this.importId;
            tL_messages_uploadImportedMedia.file_name = new File(str).getName();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = tL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str2 = "txt";
            } else {
                str2 = tL_messages_uploadImportedMedia.file_name.substring(lastIndexOf + 1).toLowerCase();
            }
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str2);
            if (mimeTypeFromExtension == null) {
                if ("opus".equals(str2)) {
                    mimeTypeFromExtension = "audio/opus";
                } else if ("webp".equals(str2)) {
                    mimeTypeFromExtension = "image/webp";
                } else {
                    mimeTypeFromExtension = "text/plain";
                }
            }
            if (mimeTypeFromExtension.equals("image/jpg") || mimeTypeFromExtension.equals("image/jpeg")) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedDocument;
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new 2(str), 2);
        }

        class 2 implements RequestDelegate {
            final /* synthetic */ String val$path;

            2(String str) {
                this.val$path = str;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final String str = this.val$path;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingHistory$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.2.this.lambda$run$0(str);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(String str) {
                ImportingHistory.this.uploadSet.remove(str);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                if (ImportingHistory.this.uploadSet.isEmpty()) {
                    ImportingHistory.this.startImport();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void startImport() {
            TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
            tL_messages_startHistoryImport.peer = this.peer;
            tL_messages_startHistoryImport.import_id = this.importId;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new 3(tL_messages_startHistoryImport));
        }

        class 3 implements RequestDelegate {
            final /* synthetic */ TLRPC.TL_messages_startHistoryImport val$req;

            3(TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                this.val$req = tL_messages_startHistoryImport;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingHistory$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.3.this.lambda$run$0(tL_error, tL_messages_startHistoryImport);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(TLRPC.TL_error tL_error, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                if (tL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_startHistoryImport, tL_error);
                }
            }
        }

        public void setImportProgress(int i) {
            if (i == 100) {
                SendMessagesHelper.this.importingHistoryMap.remove(this.dialogId);
            }
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId));
        }
    }

    public static class ImportingSticker {
        public boolean animated;
        public String emoji;
        public TLRPC.TL_inputStickerSetItem item;
        public String mimeType;
        public String path;
        public boolean validated;
        public VideoEditedInfo videoEditedInfo;

        public void uploadMedia(int i, TLRPC.InputFile inputFile, Runnable runnable) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = this.mimeType;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_uploadMedia, new 1(runnable), 2);
        }

        class 1 implements RequestDelegate {
            final /* synthetic */ Runnable val$onFinish;

            1(Runnable runnable) {
                this.val$onFinish = runnable;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final Runnable runnable = this.val$onFinish;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingSticker$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.ImportingSticker.1.this.lambda$run$0(tLObject, runnable);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(TLObject tLObject, Runnable runnable) {
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    ImportingSticker.this.item = new TLRPC.TL_inputStickerSetItem();
                    ImportingSticker.this.item.document = new TLRPC.TL_inputDocument();
                    ImportingSticker importingSticker = ImportingSticker.this;
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = importingSticker.item;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document.id;
                    inputDocument.access_hash = document.access_hash;
                    inputDocument.file_reference = document.file_reference;
                    String str = importingSticker.emoji;
                    if (str == null) {
                        str = "";
                    }
                    tL_inputStickerSetItem.emoji = str;
                    importingSticker.mimeType = document.mime_type;
                } else {
                    ImportingSticker importingSticker2 = ImportingSticker.this;
                    if (importingSticker2.animated) {
                        importingSticker2.mimeType = "application/x-bad-tgsticker";
                    }
                }
                runnable.run();
            }
        }
    }

    public class ImportingStickers {
        public double estimatedUploadSpeed;
        private long lastUploadSize;
        private long lastUploadTime;
        public String shortName;
        public String software;
        public String title;
        public long totalSize;
        public int uploadProgress;
        public long uploadedSize;
        public HashMap<String, ImportingSticker> uploadSet = new HashMap<>();
        public HashMap<String, Float> uploadProgresses = new HashMap<>();
        public HashMap<String, Long> uploadSize = new HashMap<>();
        public ArrayList<ImportingSticker> uploadMedia = new ArrayList<>();
        public int timeUntilFinish = ConnectionsManager.DEFAULT_DATACENTER_ID;

        public ImportingStickers() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initImport() {
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            this.lastUploadTime = SystemClock.elapsedRealtime();
            int size = this.uploadMedia.size();
            for (int i = 0; i < size; i++) {
                SendMessagesHelper.this.getFileLoader().uploadFile(this.uploadMedia.get(i).path, false, true, 67108864);
            }
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onFileFailedToUpload(String str) {
            ImportingSticker remove = this.uploadSet.remove(str);
            if (remove != null) {
                this.uploadMedia.remove(remove);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUploadProgress(String str, long j, float f) {
            this.uploadProgresses.put(str, Float.valueOf(f));
            this.uploadSize.put(str, Long.valueOf(j));
            this.uploadedSize = 0L;
            Iterator<Map.Entry<String, Long>> it = this.uploadSize.entrySet().iterator();
            while (it.hasNext()) {
                this.uploadedSize += it.next().getValue().longValue();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.uploadedSize;
            if (j2 != this.lastUploadSize) {
                if (elapsedRealtime != this.lastUploadTime) {
                    double d = (j2 - r0) / ((elapsedRealtime - r2) / 1000.0d);
                    double d2 = this.estimatedUploadSpeed;
                    if (d2 == 0.0d) {
                        this.estimatedUploadSpeed = d;
                    } else {
                        this.estimatedUploadSpeed = (d * 0.01d) + (d2 * 0.99d);
                    }
                    this.timeUntilFinish = (int) (((this.totalSize - j2) * 1000) / this.estimatedUploadSpeed);
                    this.lastUploadSize = j2;
                    this.lastUploadTime = elapsedRealtime;
                }
            }
            int uploadedCount = (int) ((getUploadedCount() / getTotalCount()) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onMediaImport(final String str, long j, TLRPC.InputFile inputFile) {
            addUploadProgress(str, j, 1.0f);
            ImportingSticker importingSticker = this.uploadSet.get(str);
            if (importingSticker == null) {
                return;
            }
            importingSticker.uploadMedia(SendMessagesHelper.this.currentAccount, inputFile, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingStickers$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.ImportingStickers.this.lambda$onMediaImport$0(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMediaImport$0(String str) {
            this.uploadSet.remove(str);
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            if (this.uploadSet.isEmpty()) {
                startImport();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void startImport() {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = this.title;
            tL_stickers_createStickerSet.short_name = this.shortName;
            String str = this.software;
            if (str != null) {
                tL_stickers_createStickerSet.software = str;
                tL_stickers_createStickerSet.flags |= 8;
            }
            int size = this.uploadMedia.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = this.uploadMedia.get(i).item;
                if (tL_inputStickerSetItem != null) {
                    tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
                }
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new 1(tL_stickers_createStickerSet));
        }

        class 1 implements RequestDelegate {
            final /* synthetic */ TLRPC.TL_stickers_createStickerSet val$req;

            1(TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
                this.val$req = tL_stickers_createStickerSet;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$ImportingStickers$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.ImportingStickers.1.this.lambda$run$0(tL_error, tL_stickers_createStickerSet, tLObject);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$run$0(TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
                SendMessagesHelper.this.importingStickersMap.remove(ImportingStickers.this.shortName);
                if (tL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName);
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName, tL_stickers_createStickerSet, tL_error);
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    NotificationCenter notificationCenter = SendMessagesHelper.this.getNotificationCenter();
                    int i = NotificationCenter.stickersImportComplete;
                    if (notificationCenter.hasObservers(i)) {
                        SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, tLObject);
                    } else {
                        SendMessagesHelper.this.getMediaDataController().toggleStickerSet(null, tLObject, 2, null, false, false);
                    }
                }
            }
        }

        public void setImportProgress(int i) {
            if (i == 100) {
                SendMessagesHelper.this.importingStickersMap.remove(this.shortName);
            }
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        mediaSendThreadPool = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Instance = new SendMessagesHelper[4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MediaSendPrepareWorker {
        public volatile String parentObject;
        public volatile TLRPC.TL_photo photo;
        public CountDownLatch sync;

        private MediaSendPrepareWorker() {
        }
    }

    public static class LocationProvider {
        private LocationProviderDelegate delegate;
        private GpsLocationListener gpsLocationListener;
        private Location lastKnownLocation;
        private LocationManager locationManager;
        private Runnable locationQueryCancelRunnable;
        private GpsLocationListener networkLocationListener;

        public interface LocationProviderDelegate {
            void onLocationAcquired(Location location);

            void onUnableLocationAcquire();
        }

        private class GpsLocationListener implements LocationListener {
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }

            private GpsLocationListener() {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                if (location == null || LocationProvider.this.locationQueryCancelRunnable == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("found location " + location);
                }
                LocationProvider.this.lastKnownLocation = location;
                if (location.getAccuracy() < 100.0f) {
                    if (LocationProvider.this.delegate != null) {
                        LocationProvider.this.delegate.onLocationAcquired(location);
                    }
                    if (LocationProvider.this.locationQueryCancelRunnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(LocationProvider.this.locationQueryCancelRunnable);
                    }
                    LocationProvider.this.cleanup();
                }
            }
        }

        public LocationProvider() {
            this.gpsLocationListener = new GpsLocationListener();
            this.networkLocationListener = new GpsLocationListener();
        }

        public LocationProvider(LocationProviderDelegate locationProviderDelegate) {
            this.gpsLocationListener = new GpsLocationListener();
            this.networkLocationListener = new GpsLocationListener();
            this.delegate = locationProviderDelegate;
        }

        public void setDelegate(LocationProviderDelegate locationProviderDelegate) {
            this.delegate = locationProviderDelegate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cleanup() {
            this.locationManager.removeUpdates(this.gpsLocationListener);
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.lastKnownLocation = null;
            this.locationQueryCancelRunnable = null;
        }

        public void start() {
            if (this.locationManager == null) {
                this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
            }
            try {
                this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                Location lastKnownLocation = this.locationManager.getLastKnownLocation("gps");
                this.lastKnownLocation = lastKnownLocation;
                if (lastKnownLocation == null) {
                    this.lastKnownLocation = this.locationManager.getLastKnownLocation("network");
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            Runnable runnable = this.locationQueryCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$LocationProvider$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.LocationProvider.this.lambda$start$0();
                }
            };
            this.locationQueryCancelRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 5000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$start$0() {
            LocationProviderDelegate locationProviderDelegate = this.delegate;
            if (locationProviderDelegate != null) {
                Location location = this.lastKnownLocation;
                if (location != null) {
                    locationProviderDelegate.onLocationAcquired(location);
                } else {
                    locationProviderDelegate.onUnableLocationAcquire();
                }
            }
            cleanup();
        }

        public void stop() {
            if (this.locationManager == null) {
                return;
            }
            Runnable runnable = this.locationQueryCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            cleanup();
        }
    }

    protected class DelayedMessageSendAfterRequest {
        public DelayedMessage delayedMessage;
        public MessageObject msgObj;
        public ArrayList<MessageObject> msgObjs;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public TLObject request;
        public boolean scheduled;

        protected DelayedMessageSendAfterRequest() {
        }
    }

    protected class DelayedMessage {
        public TLRPC.InputFile coverFile;
        public TLRPC.PhotoSize coverPhotoSize;
        public TLRPC.EncryptedChat encryptedChat;
        public HashMap<Object, Object> extraHashMap;
        public int finalGroupMessage;
        public boolean forceReupload;
        public long groupId;
        public String httpLocation;
        public ArrayList<String> httpLocations;
        public ArrayList<TLRPC.InputMedia> inputMedias;
        public TLRPC.InputMedia inputUploadMedia;
        public TLObject locationParent;
        public ArrayList<TLRPC.PhotoSize> locations;
        public ArrayList<MessageObject> messageObjects;
        public ArrayList<TLRPC.Message> messages;
        public MessageObject obj;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public boolean paidMedia;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public long peer;
        public boolean performCoverUpload;
        public boolean performMediaUpload;
        public TLRPC.PhotoSize photoSize;
        ArrayList<DelayedMessageSendAfterRequest> requests;
        private boolean retriedToSend;
        public boolean[] retriedToSendArray;
        public boolean scheduled;
        public TLObject sendEncryptedRequest;
        public TLObject sendRequest;
        public int topMessageId;
        public int type;
        public VideoEditedInfo videoEditedInfo;
        public ArrayList<VideoEditedInfo> videoEditedInfos;

        public boolean getRetriedToSend(int i) {
            boolean[] zArr;
            if (i < 0 || (zArr = this.retriedToSendArray) == null || i >= zArr.length) {
                return this.retriedToSend;
            }
            return zArr[i];
        }

        public void setRetriedToSend(int i, boolean z) {
            if (i < 0) {
                this.retriedToSend = z;
                return;
            }
            if (this.retriedToSendArray == null) {
                this.retriedToSendArray = new boolean[this.messageObjects.size()];
            }
            this.retriedToSendArray[i] = z;
        }

        public DelayedMessage(long j) {
            this.peer = j;
        }

        public void initForGroup(long j) {
            this.type = 4;
            this.groupId = j;
            this.messageObjects = new ArrayList<>();
            this.messages = new ArrayList<>();
            this.inputMedias = new ArrayList<>();
            this.originalPaths = new ArrayList<>();
            this.parentObjects = new ArrayList<>();
            this.extraHashMap = new HashMap<>();
            this.locations = new ArrayList<>();
            this.httpLocations = new ArrayList<>();
            this.videoEditedInfos = new ArrayList<>();
        }

        public void addDelayedRequest(TLObject tLObject, MessageObject messageObject, String str, Object obj, DelayedMessage delayedMessage, boolean z) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = SendMessagesHelper.this.new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObj = messageObject;
            delayedMessageSendAfterRequest.originalPath = str;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObject = obj;
            delayedMessageSendAfterRequest.scheduled = z;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }

        public void addDelayedRequest(TLObject tLObject, ArrayList<MessageObject> arrayList, ArrayList<String> arrayList2, ArrayList<Object> arrayList3, DelayedMessage delayedMessage, boolean z) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = SendMessagesHelper.this.new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObjs = arrayList;
            delayedMessageSendAfterRequest.originalPaths = arrayList2;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObjects = arrayList3;
            delayedMessageSendAfterRequest.scheduled = z;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }

        public void sendDelayedRequests() {
            ArrayList<DelayedMessageSendAfterRequest> arrayList = this.requests;
            if (arrayList != null) {
                int i = this.type;
                if (i == 4 || i == 0) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = this.requests.get(i2);
                        TLObject tLObject = delayedMessageSendAfterRequest.request;
                        if (tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia) {
                            SendMessagesHelper.this.getSecretChatHelper().performSendEncryptedRequest((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessageSendAfterRequest.request, this);
                        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$52((TLRPC.TL_messages_sendMultiMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        } else {
                            if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                                if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$52(tL_messages_sendMedia, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                                }
                            }
                            SendMessagesHelper.this.performSendMessageRequest(tLObject, delayedMessageSendAfterRequest.msgObj, delayedMessageSendAfterRequest.originalPath, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.parentObject, null, delayedMessageSendAfterRequest.scheduled);
                        }
                    }
                    this.requests = null;
                }
            }
        }

        public void markAsError() {
            if (this.type == 4) {
                for (int i = 0; i < this.messageObjects.size(); i++) {
                    MessageObject messageObject = this.messageObjects.get(i);
                    SendMessagesHelper.this.getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                    TLRPC.Message message = messageObject.messageOwner;
                    message.send_state = 2;
                    message.errorAllowedPriceStars = 0L;
                    message.errorNewPriceStars = 0L;
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                    SendMessagesHelper.this.processSentMessage(messageObject.getId());
                    SendMessagesHelper.this.removeFromUploadingMessages(messageObject.getId(), this.scheduled);
                }
                SendMessagesHelper.this.delayedMessages.remove("group_" + this.groupId);
            } else {
                MessagesStorage messagesStorage = SendMessagesHelper.this.getMessagesStorage();
                MessageObject messageObject2 = this.obj;
                messagesStorage.markMessageAsSendError(messageObject2.messageOwner, messageObject2.scheduled ? 1 : 0);
                TLRPC.Message message2 = this.obj.messageOwner;
                message2.send_state = 2;
                message2.errorAllowedPriceStars = 0L;
                message2.errorNewPriceStars = 0L;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(this.obj.getId()));
                SendMessagesHelper.this.processSentMessage(this.obj.getId());
                SendMessagesHelper.this.removeFromUploadingMessages(this.obj.getId(), this.scheduled);
            }
            sendDelayedRequests();
        }
    }

    public static SendMessagesHelper getInstance(int i) {
        SendMessagesHelper sendMessagesHelper = Instance[i];
        if (sendMessagesHelper == null) {
            synchronized (SendMessagesHelper.class) {
                try {
                    sendMessagesHelper = Instance[i];
                    if (sendMessagesHelper == null) {
                        SendMessagesHelper[] sendMessagesHelperArr = Instance;
                        SendMessagesHelper sendMessagesHelper2 = new SendMessagesHelper(i);
                        sendMessagesHelperArr[i] = sendMessagesHelper2;
                        sendMessagesHelper = sendMessagesHelper2;
                    }
                } finally {
                }
            }
        }
        return sendMessagesHelper;
    }

    public SendMessagesHelper(int i) {
        super(i);
        this.delayedMessages = new HashMap<>();
        this.unsentMessages = new SparseArray<>();
        this.sendingMessages = new SparseArray<>();
        this.editingMessages = new SparseArray<>();
        this.uploadMessages = new SparseArray<>();
        this.sendingMessagesIdDialogs = new LongSparseArray();
        this.uploadingMessagesIdDialogs = new LongSparseArray();
        this.waitingForLocation = new HashMap<>();
        this.waitingForCallback = new HashMap<>();
        this.waitingForCallbackMap = new HashMap<>();
        this.waitingForVote = new HashMap<>();
        this.voteSendTime = new LongSparseArray();
        this.importingHistoryFiles = new HashMap<>();
        this.importingHistoryMap = new LongSparseArray();
        this.importingStickersFiles = new HashMap<>();
        this.importingStickersMap = new HashMap<>();
        this.locationProvider = new LocationProvider(new LocationProvider.LocationProviderDelegate() { // from class: org.telegram.messenger.SendMessagesHelper.1
            @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
            public void onLocationAcquired(Location location) {
                SendMessagesHelper.this.sendLocation(location);
                SendMessagesHelper.this.waitingForLocation.clear();
            }

            @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
            public void onUnableLocationAcquire() {
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wasUnableToFindCurrentLocation, new HashMap(SendMessagesHelper.this.waitingForLocation));
                SendMessagesHelper.this.waitingForLocation.clear();
            }
        });
        this.waitingForTodoUpdate = new HashMap<>();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$new$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.filePreparingStarted);
        getNotificationCenter().addObserver(this, NotificationCenter.fileNewChunkAvailable);
        getNotificationCenter().addObserver(this, NotificationCenter.filePreparingFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidFailedLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
    }

    public void cleanup() {
        this.delayedMessages.clear();
        this.unsentMessages.clear();
        this.sendingMessages.clear();
        this.editingMessages.clear();
        this.sendingMessagesIdDialogs.clear();
        this.uploadMessages.clear();
        this.uploadingMessagesIdDialogs.clear();
        this.waitingForLocation.clear();
        this.waitingForCallback.clear();
        this.waitingForVote.clear();
        this.importingHistoryFiles.clear();
        this.importingHistoryMap.clear();
        this.importingStickersFiles.clear();
        this.importingStickersMap.clear();
        this.locationProvider.stop();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03fa  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        ArrayList<DelayedMessage> arrayList;
        char c;
        final MessageObject messageObject;
        String str2;
        ArrayList<DelayedMessage> arrayList2;
        ArrayList<DelayedMessage> arrayList3;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputFile inputFile;
        String str3;
        String str4;
        ArrayList<DelayedMessage> arrayList4;
        int i7;
        int i8;
        TLObject tLObject;
        TLRPC.TL_decryptedMessage tL_decryptedMessage;
        int i9;
        ArrayList<DelayedMessage> arrayList5;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        String str5;
        String str6;
        int i10;
        boolean z;
        HashMap<Object, Object> hashMap;
        HashMap<Object, Object> hashMap2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        TLRPC.PhotoSize photoSize3;
        DelayedMessage delayedMessage;
        TLRPC.PhotoSize photoSize4;
        MessageObject messageObject2;
        VideoEditedInfo videoEditedInfo;
        int i11 = 0;
        boolean z2 = true;
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str7 = (String) objArr[0];
            ImportingHistory importingHistory = this.importingHistoryFiles.get(str7);
            if (importingHistory != null) {
                importingHistory.addUploadProgress(str7, ((Long) objArr[1]).longValue(), r2.longValue() / ((Long) objArr[2]).longValue());
            }
            ImportingStickers importingStickers = this.importingStickersFiles.get(str7);
            if (importingStickers != null) {
                importingStickers.addUploadProgress(str7, ((Long) objArr[1]).longValue(), r2.longValue() / ((Long) objArr[2]).longValue());
                return;
            }
            return;
        }
        String str8 = "_ct";
        String str9 = "_t";
        if (i == NotificationCenter.fileUploaded) {
            String str10 = (String) objArr[0];
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            TLRPC.InputEncryptedFile inputEncryptedFile2 = (TLRPC.InputEncryptedFile) objArr[2];
            ImportingHistory importingHistory2 = this.importingHistoryFiles.get(str10);
            if (importingHistory2 != null) {
                if (str10.equals(importingHistory2.historyPath)) {
                    importingHistory2.initImport(inputFile2);
                } else {
                    importingHistory2.onMediaImport(str10, ((Long) objArr[5]).longValue(), inputFile2);
                }
            }
            ImportingStickers importingStickers2 = this.importingStickersFiles.get(str10);
            if (importingStickers2 != null) {
                importingStickers2.onMediaImport(str10, ((Long) objArr[5]).longValue(), inputFile2);
            }
            ArrayList<DelayedMessage> arrayList6 = this.delayedMessages.get(str10);
            if (arrayList6 != null) {
                int i12 = 0;
                while (i12 < arrayList6.size()) {
                    DelayedMessage delayedMessage2 = arrayList6.get(i12);
                    TLObject tLObject2 = delayedMessage2.sendRequest;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                            HashMap<Object, Object> hashMap3 = delayedMessage2.extraHashMap;
                            if (hashMap3 == null) {
                                inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.get(i11);
                            } else {
                                inputMedia = (TLRPC.InputMedia) hashMap3.get(str10);
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                        inputMedia = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                    } else {
                        inputMedia = tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia ? (TLRPC.InputMedia) delayedMessage2.extraHashMap.get(str10) : null;
                    }
                    if (inputFile2 == null || inputMedia == null) {
                        inputFile = inputFile2;
                        str3 = str9;
                        str4 = str8;
                        ArrayList<DelayedMessage> arrayList7 = arrayList6;
                        int i13 = i12;
                        arrayList4 = arrayList7;
                        if (inputEncryptedFile2 == null || (tLObject = delayedMessage2.sendEncryptedRequest) == null) {
                            i7 = i13;
                        } else {
                            if (delayedMessage2.type == 4) {
                                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) tLObject;
                                TLRPC.InputEncryptedFile inputEncryptedFile3 = (TLRPC.InputEncryptedFile) delayedMessage2.extraHashMap.get(str10);
                                int indexOf = tL_messages_sendEncryptedMultiMedia.files.indexOf(inputEncryptedFile3);
                                if (indexOf >= 0) {
                                    tL_messages_sendEncryptedMultiMedia.files.set(indexOf, inputEncryptedFile2);
                                    if (inputEncryptedFile3.id == 1) {
                                        delayedMessage2.photoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str10 + str3);
                                    }
                                    tL_decryptedMessage = tL_messages_sendEncryptedMultiMedia.messages.get(indexOf);
                                } else {
                                    tL_decryptedMessage = null;
                                }
                            } else {
                                tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                            }
                            if (tL_decryptedMessage != null) {
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                                if ((decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument)) {
                                    tL_decryptedMessage.media.size = ((Long) objArr[5]).longValue();
                                }
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                                decryptedMessageMedia2.key = (byte[]) objArr[3];
                                decryptedMessageMedia2.iv = (byte[]) objArr[4];
                                if (delayedMessage2.type == 4) {
                                    uploadMultiMedia(delayedMessage2, null, inputEncryptedFile2, str10);
                                } else {
                                    SecretChatHelper secretChatHelper = getSecretChatHelper();
                                    MessageObject messageObject3 = delayedMessage2.obj;
                                    secretChatHelper.performSendEncryptedRequest(tL_decryptedMessage, messageObject3.messageOwner, delayedMessage2.encryptedChat, inputEncryptedFile2, delayedMessage2.originalPath, messageObject3);
                                }
                            }
                            arrayList4.remove(i13);
                            i7 = i13 - 1;
                        }
                        i8 = 1;
                    } else {
                        int i14 = delayedMessage2.type;
                        if (i14 == 0) {
                            inputMedia.file = inputFile2;
                            i9 = i12;
                            inputFile = inputFile2;
                            str5 = str10;
                            arrayList5 = arrayList6;
                            inputEncryptedFile = inputEncryptedFile2;
                            str3 = str9;
                            str6 = str8;
                            lambda$performSendMessageRequest$66(delayedMessage2.sendRequest, delayedMessage2.obj, delayedMessage2.originalPath, delayedMessage2, true, null, delayedMessage2.parentObject, null, delayedMessage2.scheduled);
                        } else {
                            i9 = i12;
                            arrayList5 = arrayList6;
                            inputEncryptedFile = inputEncryptedFile2;
                            inputFile = inputFile2;
                            str5 = str10;
                            str3 = str9;
                            str6 = str8;
                            if (i14 == z2) {
                                if (inputMedia.file == null) {
                                    delayedMessage = delayedMessage2;
                                    TLRPC.PhotoSize photoSize5 = delayedMessage.coverPhotoSize;
                                    if (photoSize5 == null || delayedMessage.performMediaUpload) {
                                        inputMedia.file = inputFile;
                                        if (delayedMessage.coverFile == null && photoSize5 != null) {
                                            performSendDelayedMessage(delayedMessage);
                                        } else if (inputMedia.thumb == null && (photoSize4 = delayedMessage.photoSize) != null && photoSize4.location != null && ((messageObject2 = delayedMessage.obj) == null || (videoEditedInfo = messageObject2.videoEditedInfo) == null || !videoEditedInfo.isSticker)) {
                                            performSendDelayedMessage(delayedMessage);
                                        } else {
                                            performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                        }
                                    }
                                } else {
                                    delayedMessage = delayedMessage2;
                                }
                                if (delayedMessage.coverFile == null && delayedMessage.coverPhotoSize != null) {
                                    delayedMessage.coverFile = inputFile;
                                    delayedMessage.performCoverUpload = z2;
                                    performSendDelayedMessage(delayedMessage);
                                } else {
                                    inputMedia.thumb = inputFile;
                                    inputMedia.flags |= 4;
                                    performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                }
                            } else if (i14 == 2) {
                                if (inputMedia.file == null) {
                                    inputMedia.file = inputFile;
                                    if (inputMedia.thumb == null && (photoSize3 = delayedMessage2.photoSize) != null && photoSize3.location != null) {
                                        performSendDelayedMessage(delayedMessage2);
                                    } else {
                                        performSendMessageRequest(delayedMessage2.sendRequest, delayedMessage2.obj, delayedMessage2.originalPath, null, delayedMessage2.parentObject, null, delayedMessage2.scheduled);
                                    }
                                } else {
                                    inputMedia.thumb = inputFile;
                                    inputMedia.flags |= 4;
                                    performSendMessageRequest(delayedMessage2.sendRequest, delayedMessage2.obj, delayedMessage2.originalPath, null, delayedMessage2.parentObject, null, delayedMessage2.scheduled);
                                }
                            } else if (i14 == 3) {
                                inputMedia.file = inputFile;
                                performSendMessageRequest(delayedMessage2.sendRequest, delayedMessage2.obj, delayedMessage2.originalPath, null, delayedMessage2.parentObject, null, delayedMessage2.scheduled);
                            } else {
                                if (i14 != 4) {
                                    str10 = str5;
                                    str4 = str6;
                                } else if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                    if (inputMedia.file == null) {
                                        inputMedia.file = inputFile;
                                        HashMap<Object, Object> hashMap4 = delayedMessage2.extraHashMap;
                                        StringBuilder sb = new StringBuilder();
                                        str10 = str5;
                                        sb.append(str10);
                                        sb.append("_i");
                                        int indexOf2 = delayedMessage2.messageObjects.indexOf((MessageObject) hashMap4.get(sb.toString()));
                                        if (delayedMessage2.extraHashMap.containsKey(str10 + str3)) {
                                            delayedMessage2.photoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str10 + str3);
                                        }
                                        HashMap<Object, Object> hashMap5 = delayedMessage2.extraHashMap;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str10);
                                        str4 = str6;
                                        sb2.append(str4);
                                        if (hashMap5.containsKey(sb2.toString())) {
                                            delayedMessage2.coverPhotoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str10 + str4);
                                        }
                                        if (inputMedia.video_cover == null && (photoSize2 = delayedMessage2.coverPhotoSize) != null && photoSize2.location != null) {
                                            delayedMessage2.performCoverUpload = z2;
                                            performSendDelayedMessage(delayedMessage2, indexOf2);
                                        } else if (inputMedia.thumb == null && (photoSize = delayedMessage2.photoSize) != null && photoSize.location != null) {
                                            delayedMessage2.performMediaUpload = z2;
                                            performSendDelayedMessage(delayedMessage2, indexOf2);
                                        } else {
                                            uploadMultiMedia(delayedMessage2, inputMedia, null, str10);
                                        }
                                        i10 = i9;
                                        arrayList4 = arrayList5;
                                        arrayList4.remove(i10);
                                        i7 = i10 - 1;
                                        inputEncryptedFile2 = inputEncryptedFile;
                                        i8 = 1;
                                    } else {
                                        str10 = str5;
                                        str4 = str6;
                                        String str11 = (String) delayedMessage2.extraHashMap.get(str10 + "_doc");
                                        MessageObject messageObject4 = (MessageObject) delayedMessage2.extraHashMap.get(str11 + "_i");
                                        if (delayedMessage2.extraHashMap.containsKey(str11 + str3)) {
                                            delayedMessage2.photoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str11 + str3);
                                        }
                                        if (delayedMessage2.extraHashMap.containsKey(str11 + str4)) {
                                            delayedMessage2.coverPhotoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str11 + str4);
                                        }
                                        int indexOf3 = delayedMessage2.messageObjects.indexOf(messageObject4);
                                        if (delayedMessage2.coverFile == null && delayedMessage2.coverPhotoSize != null) {
                                            delayedMessage2.coverFile = inputFile;
                                            delayedMessage2.performCoverUpload = z2;
                                            performSendDelayedMessage(delayedMessage2, indexOf3);
                                        } else {
                                            inputMedia.thumb = inputFile;
                                            inputMedia.flags |= 4;
                                            uploadMultiMedia(delayedMessage2, inputMedia, null, (String) delayedMessage2.extraHashMap.get(str10 + "_o"));
                                        }
                                    }
                                } else {
                                    str10 = str5;
                                    str4 = str6;
                                    if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                        HashMap<Object, Object> hashMap6 = delayedMessage2.extraHashMap;
                                        if (hashMap6 != null) {
                                            if (hashMap6.containsKey(str10 + "_doc")) {
                                                z = true;
                                                String str12 = z ? str10 : (String) delayedMessage2.extraHashMap.get(str10 + "_doc");
                                                MessageObject messageObject5 = (MessageObject) delayedMessage2.extraHashMap.get(str12 + "_i");
                                                hashMap = delayedMessage2.extraHashMap;
                                                if (hashMap != null) {
                                                    if (hashMap.containsKey(str12 + str3)) {
                                                        delayedMessage2.photoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str12 + str3);
                                                    }
                                                }
                                                hashMap2 = delayedMessage2.extraHashMap;
                                                if (hashMap2 != null) {
                                                    if (hashMap2.containsKey(str12 + str4)) {
                                                        delayedMessage2.coverPhotoSize = (TLRPC.PhotoSize) delayedMessage2.extraHashMap.get(str12 + str4);
                                                    }
                                                }
                                                int indexOf4 = delayedMessage2.messageObjects.indexOf(messageObject5);
                                                if (!z && delayedMessage2.coverFile == null && delayedMessage2.coverPhotoSize != null) {
                                                    delayedMessage2.coverFile = inputFile;
                                                    delayedMessage2.performCoverUpload = z2;
                                                    performSendDelayedMessage(delayedMessage2, indexOf4);
                                                } else if (delayedMessage2.photoSize == null && inputMedia.thumb == null) {
                                                    inputMedia.thumb = inputFile;
                                                    inputMedia.flags |= 4;
                                                    uploadMultiMedia(delayedMessage2, inputMedia, null, (String) delayedMessage2.extraHashMap.get(str10 + "_o"));
                                                } else {
                                                    inputMedia.file = inputFile;
                                                    uploadMultiMedia(delayedMessage2, inputMedia, null, str10);
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        MessageObject messageObject52 = (MessageObject) delayedMessage2.extraHashMap.get(str12 + "_i");
                                        hashMap = delayedMessage2.extraHashMap;
                                        if (hashMap != null) {
                                        }
                                        hashMap2 = delayedMessage2.extraHashMap;
                                        if (hashMap2 != null) {
                                        }
                                        int indexOf42 = delayedMessage2.messageObjects.indexOf(messageObject52);
                                        if (!z) {
                                        }
                                        if (delayedMessage2.photoSize == null) {
                                        }
                                        inputMedia.file = inputFile;
                                        uploadMultiMedia(delayedMessage2, inputMedia, null, str10);
                                    } else {
                                        inputMedia.file = inputFile;
                                        uploadMultiMedia(delayedMessage2, inputMedia, null, str10);
                                    }
                                }
                                i10 = i9;
                                arrayList4 = arrayList5;
                                arrayList4.remove(i10);
                                i7 = i10 - 1;
                                inputEncryptedFile2 = inputEncryptedFile;
                                i8 = 1;
                            }
                        }
                        i10 = i9;
                        str10 = str5;
                        arrayList4 = arrayList5;
                        str4 = str6;
                        arrayList4.remove(i10);
                        i7 = i10 - 1;
                        inputEncryptedFile2 = inputEncryptedFile;
                        i8 = 1;
                    }
                    int i15 = i7 + i8;
                    arrayList6 = arrayList4;
                    str8 = str4;
                    inputFile2 = inputFile;
                    str9 = str3;
                    i11 = 0;
                    z2 = true;
                    i12 = i15;
                }
                if (arrayList6.isEmpty()) {
                    this.delayedMessages.remove(str10);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadFailed) {
            String str13 = (String) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            ImportingHistory importingHistory3 = this.importingHistoryFiles.get(str13);
            if (importingHistory3 != null) {
                importingHistory3.onFileFailedToUpload(str13);
            }
            ImportingStickers importingStickers3 = this.importingStickersFiles.get(str13);
            if (importingStickers3 != null) {
                importingStickers3.onFileFailedToUpload(str13);
            }
            ArrayList<DelayedMessage> arrayList8 = this.delayedMessages.get(str13);
            if (arrayList8 != null) {
                int i16 = 0;
                while (i16 < arrayList8.size()) {
                    DelayedMessage delayedMessage3 = arrayList8.get(i16);
                    if ((booleanValue && delayedMessage3.sendEncryptedRequest != null) || (!booleanValue && delayedMessage3.sendRequest != null)) {
                        delayedMessage3.markAsError();
                        arrayList8.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                if (arrayList8.isEmpty()) {
                    this.delayedMessages.remove(str13);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject6 = (MessageObject) objArr[0];
            if (messageObject6.getId() == 0) {
                return;
            }
            ArrayList<DelayedMessage> arrayList9 = this.delayedMessages.get(messageObject6.messageOwner.attachPath);
            if (arrayList9 != null) {
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayList9.size()) {
                        break;
                    }
                    DelayedMessage delayedMessage4 = arrayList9.get(i17);
                    if (delayedMessage4.type == 4) {
                        int indexOf5 = delayedMessage4.messageObjects.indexOf(messageObject6);
                        delayedMessage4.photoSize = (TLRPC.PhotoSize) delayedMessage4.extraHashMap.get(messageObject6.messageOwner.attachPath + "_t");
                        if (delayedMessage4.extraHashMap.containsKey(messageObject6.messageOwner.attachPath + "_ct")) {
                            delayedMessage4.coverPhotoSize = (TLRPC.PhotoSize) delayedMessage4.extraHashMap.get(messageObject6.messageOwner.attachPath + "_ct");
                        }
                        delayedMessage4.performMediaUpload = true;
                        performSendDelayedMessage(delayedMessage4, indexOf5);
                        arrayList9.remove(i17);
                    } else {
                        if (delayedMessage4.obj == messageObject6) {
                            delayedMessage4.videoEditedInfo = null;
                            performSendDelayedMessage(delayedMessage4);
                            arrayList9.remove(i17);
                            break;
                        }
                        i17++;
                    }
                }
                if (arrayList9.isEmpty()) {
                    this.delayedMessages.remove(messageObject6.messageOwner.attachPath);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileNewChunkAvailable) {
            MessageObject messageObject7 = (MessageObject) objArr[0];
            if (messageObject7.getId() == 0) {
                return;
            }
            String str14 = (String) objArr[1];
            long longValue = ((Long) objArr[2]).longValue();
            long longValue2 = ((Long) objArr[3]).longValue();
            getFileLoader().checkUploadNewDataAvailable(str14, DialogObject.isEncryptedDialog(messageObject7.getDialogId()), longValue, longValue2, (Float) objArr[4]);
            if (longValue2 == 0 || (arrayList3 = this.delayedMessages.get(messageObject7.messageOwner.attachPath)) == null) {
                return;
            }
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                DelayedMessage delayedMessage5 = arrayList3.get(i18);
                if (delayedMessage5.type == 4) {
                    int i19 = 0;
                    while (true) {
                        if (i19 >= delayedMessage5.messageObjects.size()) {
                            break;
                        }
                        MessageObject messageObject8 = delayedMessage5.messageObjects.get(i19);
                        if (messageObject8 == messageObject7) {
                            delayedMessage5.obj.shouldRemoveVideoEditedInfo = true;
                            messageObject8.messageOwner.params.remove("ve");
                            TLRPC.Document document = delayedMessage5.obj.getDocument();
                            if (document != null) {
                                document.size = longValue2;
                            }
                            ArrayList<TLRPC.Message> arrayList10 = new ArrayList<>();
                            arrayList10.add(messageObject8.messageOwner);
                            if (messageObject8.isQuickReply()) {
                                i5 = messageObject8.getQuickReplyId();
                                i6 = 5;
                            } else if (messageObject8.scheduled) {
                                i5 = 0;
                                i6 = 1;
                            } else {
                                i5 = 0;
                                i6 = 0;
                            }
                            if (!delayedMessage5.paidMedia || i19 == 0) {
                                getMessagesStorage().putMessages(arrayList10, false, true, false, 0, i6, i5);
                            }
                        } else {
                            i19++;
                        }
                    }
                } else {
                    MessageObject messageObject9 = delayedMessage5.obj;
                    if (messageObject9 == messageObject7) {
                        messageObject9.shouldRemoveVideoEditedInfo = true;
                        messageObject9.messageOwner.params.remove("ve");
                        TLRPC.Document document2 = delayedMessage5.obj.getDocument();
                        if (document2 != null) {
                            document2.size = longValue2;
                        }
                        ArrayList<TLRPC.Message> arrayList11 = new ArrayList<>();
                        arrayList11.add(delayedMessage5.obj.messageOwner);
                        if (delayedMessage5.obj.isQuickReply()) {
                            i3 = delayedMessage5.obj.getQuickReplyId();
                            i4 = 5;
                        } else if (delayedMessage5.obj.scheduled) {
                            i3 = 0;
                            i4 = 1;
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                        getMessagesStorage().putMessages(arrayList11, false, true, false, 0, i4, i3);
                        return;
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.filePreparingFailed) {
            MessageObject messageObject10 = (MessageObject) objArr[0];
            if (messageObject10.getId() == 0 || (arrayList2 = this.delayedMessages.get((str2 = (String) objArr[1]))) == null) {
                return;
            }
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                DelayedMessage delayedMessage6 = arrayList2.get(i20);
                if (delayedMessage6.type == 4) {
                    for (int i21 = 0; i21 < delayedMessage6.messages.size(); i21++) {
                        if (delayedMessage6.messageObjects.get(i21) == messageObject10) {
                            delayedMessage6.markAsError();
                            arrayList2.remove(i20);
                            i20--;
                            break;
                        }
                    }
                    i20++;
                } else {
                    if (delayedMessage6.obj == messageObject10) {
                        delayedMessage6.markAsError();
                        arrayList2.remove(i20);
                        i20--;
                        break;
                    }
                    i20++;
                }
            }
            if (arrayList2.isEmpty()) {
                this.delayedMessages.remove(str2);
                return;
            }
            return;
        }
        if (i == NotificationCenter.httpFileDidLoad) {
            final String str15 = (String) objArr[0];
            ArrayList<DelayedMessage> arrayList12 = this.delayedMessages.get(str15);
            if (arrayList12 != null) {
                for (int i22 = 0; i22 < arrayList12.size(); i22++) {
                    final DelayedMessage delayedMessage7 = arrayList12.get(i22);
                    int i23 = delayedMessage7.type;
                    if (i23 == 0) {
                        messageObject = delayedMessage7.obj;
                        c = 0;
                    } else {
                        if (i23 == 2) {
                            messageObject = delayedMessage7.obj;
                        } else if (i23 == 4) {
                            MessageObject messageObject11 = (MessageObject) delayedMessage7.extraHashMap.get(str15);
                            messageObject = messageObject11;
                            if (messageObject11.getDocument() == null) {
                                c = 0;
                            }
                        } else {
                            c = 65535;
                            messageObject = null;
                        }
                        c = 1;
                    }
                    if (c == 0) {
                        final File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str15) + "." + ImageLoader.getHttpUrlExtension(str15, "file"));
                        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda60
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.this.lambda$didReceivedNotification$2(file, messageObject, delayedMessage7, str15);
                            }
                        });
                    } else if (c == 1) {
                        final File file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(str15) + ".gif");
                        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda61
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.this.lambda$didReceivedNotification$4(delayedMessage7, file2, messageObject);
                            }
                        });
                    }
                }
                this.delayedMessages.remove(str15);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str16 = (String) objArr[0];
            ArrayList<DelayedMessage> arrayList13 = this.delayedMessages.get(str16);
            if (arrayList13 != null) {
                for (int i24 = 0; i24 < arrayList13.size(); i24++) {
                    performSendDelayedMessage(arrayList13.get(i24));
                }
                this.delayedMessages.remove(str16);
                return;
            }
            return;
        }
        if ((i == NotificationCenter.httpFileDidFailedLoad || i == NotificationCenter.fileLoadFailed) && (arrayList = this.delayedMessages.get((str = (String) objArr[0]))) != null) {
            for (int i25 = 0; i25 < arrayList.size(); i25++) {
                arrayList.get(i25).markAsError();
            }
            this.delayedMessages.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$2(final File file, final MessageObject messageObject, final DelayedMessage delayedMessage, final String str) {
        final TLRPC.TL_photo generatePhotoSizes = generatePhotoSizes(file.toString(), null);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda57
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$didReceivedNotification$1(generatePhotoSizes, messageObject, file, delayedMessage, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$1(TLRPC.TL_photo tL_photo, MessageObject messageObject, File file, DelayedMessage delayedMessage, String str) {
        if (tL_photo != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.media.photo = tL_photo;
            message.attachPath = file.toString();
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            arrayList.add(messageObject.messageOwner);
            getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, messageObject.messageOwner);
            ArrayList<TLRPC.PhotoSize> arrayList2 = tL_photo.sizes;
            delayedMessage.photoSize = arrayList2.get(arrayList2.size() - 1);
            delayedMessage.locationParent = tL_photo;
            delayedMessage.httpLocation = null;
            if (delayedMessage.type == 4) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, delayedMessage.messageObjects.indexOf(messageObject));
                return;
            } else {
                performSendDelayedMessage(delayedMessage);
                return;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("can't load image " + str + " to file " + file.toString());
        }
        delayedMessage.markAsError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$4(final DelayedMessage delayedMessage, final File file, final MessageObject messageObject) {
        final TLRPC.Document document = delayedMessage.obj.getDocument();
        if (document.thumbs.isEmpty() || (document.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (loadBitmap != null) {
                    document.thumbs.clear();
                    document.thumbs.add(ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, delayedMessage.sendEncryptedRequest != null));
                    loadBitmap.recycle();
                }
            } catch (Exception e) {
                document.thumbs.clear();
                FileLog.e(e);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$didReceivedNotification$3(delayedMessage, file, document, messageObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$3(DelayedMessage delayedMessage, File file, TLRPC.Document document, MessageObject messageObject) {
        delayedMessage.httpLocation = null;
        delayedMessage.obj.messageOwner.attachPath = file.toString();
        if (!document.thumbs.isEmpty()) {
            TLRPC.PhotoSize photoSize = document.thumbs.get(0);
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                delayedMessage.photoSize = photoSize;
                delayedMessage.locationParent = document;
            }
        }
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        arrayList.add(messageObject.messageOwner);
        getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, delayedMessage.obj.messageOwner);
    }

    private void revertEditingMessageObject(MessageObject messageObject) {
        messageObject.cancelEditing = true;
        TLRPC.Message message = messageObject.messageOwner;
        message.media = messageObject.previousMedia;
        message.message = messageObject.previousMessage;
        ArrayList<TLRPC.MessageEntity> arrayList = messageObject.previousMessageEntities;
        message.entities = arrayList;
        message.attachPath = messageObject.previousAttachPath;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        messageObject.previousMedia = null;
        messageObject.previousMessage = null;
        messageObject.previousMessageEntities = null;
        messageObject.previousAttachPath = null;
        messageObject.videoEditedInfo = null;
        messageObject.type = -1;
        messageObject.setType();
        messageObject.caption = null;
        if (messageObject.type != 0) {
            messageObject.generateCaption();
        } else {
            messageObject.resetLayout();
        }
        ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
        arrayList2.add(messageObject.messageOwner);
        getMessagesStorage().putMessages(arrayList2, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(messageObject);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList3);
    }

    public void cancelSendingMessage(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        if (messageObject != null && messageObject.type == 29) {
            Iterator<Map.Entry<String, ArrayList<DelayedMessage>>> it = this.delayedMessages.entrySet().iterator();
            DelayedMessage delayedMessage = null;
            while (it.hasNext()) {
                ArrayList<DelayedMessage> value = it.next().getValue();
                for (int i = 0; i < value.size(); i++) {
                    DelayedMessage delayedMessage2 = value.get(i);
                    if (delayedMessage2.type == 4) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= delayedMessage2.messageObjects.size()) {
                                break;
                            }
                            if (delayedMessage2.messageObjects.get(i2).getId() == messageObject.getId()) {
                                delayedMessage = delayedMessage2;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (delayedMessage != null) {
                        break;
                    }
                }
            }
            if (delayedMessage != null) {
                arrayList.clear();
                arrayList.addAll(delayedMessage.messageObjects);
            }
        }
        cancelSendingMessage(arrayList);
    }

    public void cancelSendingMessage(ArrayList<MessageObject> arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        long j = 0;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (i < arrayList.size()) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject.scheduled) {
                i3 = 1;
            }
            long dialogId = messageObject.getDialogId();
            arrayList4.add(Integer.valueOf(messageObject.getId()));
            if (messageObject.isQuickReply()) {
                i2 = messageObject.getQuickReplyId();
            }
            TLRPC.Message removeFromSendingMessages = removeFromSendingMessages(messageObject.getId(), messageObject.scheduled);
            if (removeFromSendingMessages != null) {
                getConnectionsManager().cancelRequest(removeFromSendingMessages.reqId, true);
            }
            StarsController.getInstance(this.currentAccount).hidePaidMessageToast(messageObject);
            for (Map.Entry<String, ArrayList<DelayedMessage>> entry : this.delayedMessages.entrySet()) {
                ArrayList<DelayedMessage> value = entry.getValue();
                int i4 = 0;
                while (true) {
                    if (i4 >= value.size()) {
                        z = z2;
                        break;
                    }
                    DelayedMessage delayedMessage = value.get(i4);
                    z = z2;
                    if (delayedMessage.type == 4) {
                        MessageObject messageObject2 = null;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= delayedMessage.messageObjects.size()) {
                                i5 = -1;
                                break;
                            }
                            messageObject2 = delayedMessage.messageObjects.get(i5);
                            if (messageObject2.getId() == messageObject.getId()) {
                                removeFromUploadingMessages(messageObject.getId(), messageObject.scheduled);
                                break;
                            }
                            i5++;
                        }
                        if (i5 >= 0) {
                            delayedMessage.messageObjects.remove(i5);
                            delayedMessage.messages.remove(i5);
                            delayedMessage.originalPaths.remove(i5);
                            if (!delayedMessage.parentObjects.isEmpty()) {
                                delayedMessage.parentObjects.remove(i5);
                            }
                            TLObject tLObject = delayedMessage.sendRequest;
                            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i5);
                            } else {
                                if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                    TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                    if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                        ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i5);
                                    }
                                }
                                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                                tL_messages_sendEncryptedMultiMedia.messages.remove(i5);
                                tL_messages_sendEncryptedMultiMedia.files.remove(i5);
                            }
                            MediaController.getInstance().cancelVideoConvert(messageObject);
                            String str = (String) delayedMessage.extraHashMap.get(messageObject2);
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            if (delayedMessage.messageObjects.isEmpty()) {
                                delayedMessage.sendDelayedRequests();
                            } else {
                                if (delayedMessage.finalGroupMessage == messageObject.getId()) {
                                    ArrayList<MessageObject> arrayList5 = delayedMessage.messageObjects;
                                    MessageObject messageObject3 = arrayList5.get(arrayList5.size() - 1);
                                    delayedMessage.finalGroupMessage = messageObject3.getId();
                                    messageObject3.messageOwner.params.put("final", "1");
                                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                    tL_messages_messages.messages.add(messageObject3.messageOwner);
                                    getMessagesStorage().putMessages((TLRPC.messages_Messages) tL_messages_messages, delayedMessage.peer, -2, 0, false, i3, 0L);
                                }
                                if (!arrayList3.contains(delayedMessage)) {
                                    arrayList3.add(delayedMessage);
                                }
                            }
                        }
                    } else if (delayedMessage.obj.getId() == messageObject.getId()) {
                        removeFromUploadingMessages(messageObject.getId(), messageObject.scheduled);
                        value.remove(i4);
                        delayedMessage.sendDelayedRequests();
                        MediaController.getInstance().cancelVideoConvert(delayedMessage.obj);
                        if (value.size() == 0) {
                            arrayList2.add(entry.getKey());
                            if (delayedMessage.sendEncryptedRequest != null) {
                                z2 = true;
                            }
                        }
                    } else {
                        i4++;
                        z2 = z;
                    }
                }
                z2 = z;
            }
            i++;
            j = dialogId;
        }
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            String str2 = (String) arrayList2.get(i6);
            if (str2.startsWith("http")) {
                ImageLoader.getInstance().cancelLoadHttpFile(str2);
            } else {
                getFileLoader().cancelFileUpload(str2, z2);
            }
            this.delayedMessages.remove(str2);
        }
        int size = arrayList3.size();
        for (int i7 = 0; i7 < size; i7++) {
            sendReadyToSendGroup((DelayedMessage) arrayList3.get(i7), false, true);
        }
        int i8 = 1;
        if (arrayList.size() == 1 && arrayList.get(0).isEditing() && arrayList.get(0).previousMedia != null) {
            revertEditingMessageObject(arrayList.get(0));
            return;
        }
        if (!arrayList.isEmpty() && arrayList.get(0).isQuickReply()) {
            i8 = 5;
        } else if (i3 == 0) {
            i8 = 0;
        }
        getMessagesController().deleteMessages(arrayList4, null, null, j, i2, false, i8);
    }

    public boolean retrySendMessage(MessageObject messageObject, boolean z, long j) {
        if (messageObject.getId() >= 0) {
            if (messageObject.isEditing()) {
                editMessage(messageObject, null, null, null, null, null, null, true, messageObject.hasMediaSpoilers(), messageObject);
            }
            return false;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
            if (encryptedChat == null) {
                getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                messageObject.messageOwner.send_state = 2;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                processSentMessage(messageObject.getId());
                return false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message.random_id == 0) {
                message.random_id = getNextRandomId();
            }
            TLRPC.DecryptedMessageAction decryptedMessageAction = messageObject.messageOwner.action.encryptedAction;
            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                getSecretChatHelper().sendTTLMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                getSecretChatHelper().sendMessagesDeleteMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                getSecretChatHelper().sendClearHistoryMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                getSecretChatHelper().sendNotifyLayerMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                getSecretChatHelper().sendMessagesReadMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                getSecretChatHelper().sendScreenshotMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                    getSecretChatHelper().sendResendMessage(encryptedChat, 0, 0, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                    getSecretChatHelper().sendCommitKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                    getSecretChatHelper().sendAbortKeyMessage(encryptedChat, messageObject.messageOwner, 0L);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                    getSecretChatHelper().sendRequestKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                    getSecretChatHelper().sendAcceptKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                    getSecretChatHelper().sendNoopMessage(encryptedChat, messageObject.messageOwner);
                }
            }
            return true;
        }
        if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
            sendScreenshotMessage(getMessagesController().getUser(Long.valueOf(messageObject.getDialogId())), messageObject.getReplyMsgId(), messageObject.messageOwner);
        }
        if (z) {
            this.unsentMessages.put(messageObject.getId(), messageObject);
        }
        SendMessageParams of = SendMessageParams.of(messageObject);
        of.payStars = j;
        sendMessage(of);
        return true;
    }

    protected void processSentMessage(int i) {
        int size = this.unsentMessages.size();
        this.unsentMessages.remove(i);
        if (size == 0 || this.unsentMessages.size() != 0) {
            return;
        }
        checkUnsentMessages();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processForwardFromMyName(MessageObject messageObject, long j, long j2, long j3, MessageSuggestionParams messageSuggestionParams) {
        HashMap hashMap;
        TLRPC.Photo photo;
        if (messageObject == null) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageMedia messageMedia = message.media;
        ArrayList arrayList = null;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
            if (DialogObject.isEncryptedDialog(j)) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2.peer_id != null) {
                    TLRPC.MessageMedia messageMedia2 = message2.media;
                    if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("parentObject", "sent_" + messageObject.messageOwner.peer_id.channel_id + "_" + messageObject.getId() + "_" + messageObject.getDialogId() + "_" + messageObject.type + "_" + messageObject.getSize());
                        hashMap = hashMap2;
                        TLRPC.Message message3 = messageObject.messageOwner;
                        TLRPC.MessageMedia messageMedia3 = message3.media;
                        photo = messageMedia3.photo;
                        if (!(photo instanceof TLRPC.TL_photo)) {
                            SendMessageParams of = SendMessageParams.of((TLRPC.TL_photo) photo, null, j, messageObject.replyMessageObject, null, message3.message, message3.entities, null, hashMap, true, 0, 0, messageMedia3.ttl_seconds, messageObject, false);
                            of.payStars = j2;
                            of.monoForumPeer = j3;
                            of.suggestionParams = messageSuggestionParams;
                            sendMessage(of);
                            return;
                        }
                        TLRPC.Document document = messageMedia3.document;
                        if (document instanceof TLRPC.TL_document) {
                            SendMessageParams of2 = SendMessageParams.of((TLRPC.TL_document) document, null, message3.attachPath, j, messageObject.replyMessageObject, null, message3.message, message3.entities, null, hashMap, true, 0, 0, messageMedia3.ttl_seconds, messageObject, null, false);
                            of2.payStars = j2;
                            of2.monoForumPeer = j3;
                            of2.suggestionParams = messageSuggestionParams;
                            sendMessage(of2);
                            return;
                        }
                        if ((messageMedia3 instanceof TLRPC.TL_messageMediaVenue) || (messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                            SendMessageParams of3 = SendMessageParams.of(messageMedia3, j, messageObject.replyMessageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
                            of3.payStars = j2;
                            of3.monoForumPeer = j3;
                            of3.suggestionParams = messageSuggestionParams;
                            sendMessage(of3);
                            return;
                        }
                        if (messageMedia3.phone_number != null) {
                            TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                            tL_userContact_old2.phone = messageMedia4.phone_number;
                            tL_userContact_old2.first_name = messageMedia4.first_name;
                            tL_userContact_old2.last_name = messageMedia4.last_name;
                            tL_userContact_old2.id = messageMedia4.user_id;
                            SendMessageParams of4 = SendMessageParams.of((TLRPC.User) tL_userContact_old2, j, messageObject.replyMessageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
                            of4.monoForumPeer = j3;
                            of4.suggestionParams = messageSuggestionParams;
                            of4.payStars = j2;
                            sendMessage(of4);
                            return;
                        }
                        if (DialogObject.isEncryptedDialog(j)) {
                            return;
                        }
                        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                        arrayList2.add(messageObject);
                        sendMessage(arrayList2, j, true, false, true, 0, 0, null, -1, j2, j3, messageSuggestionParams);
                        return;
                    }
                }
            }
            hashMap = null;
            TLRPC.Message message32 = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia32 = message32.media;
            photo = messageMedia32.photo;
            if (!(photo instanceof TLRPC.TL_photo)) {
            }
        } else {
            if (message.message != null) {
                TLRPC.WebPage webPage = messageMedia instanceof TLRPC.TL_messageMediaWebPage ? messageMedia.webpage : null;
                ArrayList<TLRPC.MessageEntity> arrayList3 = message.entities;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList = new ArrayList();
                    for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
                        TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                SendMessageParams of5 = SendMessageParams.of(messageObject.messageOwner.message, j, messageObject.replyMessageObject, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                of5.payStars = j2;
                of5.monoForumPeer = j3;
                of5.suggestionParams = messageSuggestionParams;
                sendMessage(of5);
                return;
            }
            if (DialogObject.isEncryptedDialog(j)) {
                ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                arrayList4.add(messageObject);
                sendMessage(arrayList4, j, true, false, true, 0, 0, null, -1, j2, j3, messageSuggestionParams);
            }
        }
    }

    public void sendScreenshotMessage(TLRPC.User user, int i, TLRPC.Message message) {
        TLRPC.Message message2 = message;
        if (user == null || i == 0 || user.id == getUserConfig().getClientUserId()) {
            return;
        }
        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
        tL_inputPeerUser.access_hash = user.access_hash;
        tL_inputPeerUser.user_id = user.id;
        if (message2 != null) {
            tL_messages_sendScreenshotNotification.reply_to = createReplyInput(i);
            tL_messages_sendScreenshotNotification.random_id = message2.random_id;
        } else {
            message2 = new TLRPC.TL_messageService();
            message2.random_id = getNextRandomId();
            message2.dialog_id = user.id;
            message2.unread = true;
            message2.out = true;
            int newMessageId = getUserConfig().getNewMessageId();
            message2.id = newMessageId;
            message2.local_id = newMessageId;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            message2.from_id = tL_peerUser;
            tL_peerUser.user_id = getUserConfig().getClientUserId();
            message2.flags |= NotificationCenter.goingToPreviewTheme;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            message2.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = i;
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            message2.peer_id = tL_peerUser2;
            tL_peerUser2.user_id = user.id;
            message2.date = getConnectionsManager().getCurrentTime();
            message2.action = new TLRPC.TL_messageActionScreenshotTaken();
            getUserConfig().saveConfig(false);
        }
        tL_messages_sendScreenshotNotification.random_id = message2.random_id;
        MessageObject messageObject = new MessageObject(this.currentAccount, message2, false, true);
        messageObject.messageOwner.send_state = 1;
        messageObject.wasJustSent = true;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        getMessagesController().updateInterfaceWithMessages(message2.dialog_id, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
        arrayList2.add(message2);
        getMessagesStorage().putMessages(arrayList2, false, true, false, 0, false, 0, 0L);
        performSendMessageRequest(tL_messages_sendScreenshotNotification, messageObject, null, null, null, null, false);
    }

    public void sendSticker(TLRPC.Document document, String str, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject.SendAnimationData sendAnimationData, final boolean z, final int i, final int i2, boolean z2, final Object obj, final String str2, final int i3, final long j2, final long j3, final MessageSuggestionParams messageSuggestionParams) {
        final TLRPC.Document document2;
        HashMap hashMap;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            if (getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) == null) {
                return;
            }
            TLRPC.TL_document_layer82 tL_document_layer82 = new TLRPC.TL_document_layer82();
            tL_document_layer82.id = document.id;
            tL_document_layer82.access_hash = document.access_hash;
            tL_document_layer82.date = document.date;
            tL_document_layer82.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            tL_document_layer82.file_reference = bArr2;
            if (bArr2 == null) {
                tL_document_layer82.file_reference = new byte[0];
            }
            tL_document_layer82.size = document.size;
            tL_document_layer82.dc_id = document.dc_id;
            tL_document_layer82.attributes = new ArrayList<>();
            for (int i4 = 0; i4 < document.attributes.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    tL_document_layer82.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    tL_document_layer82.attributes.add(documentAttribute);
                }
            }
            if (tL_document_layer82.mime_type == null) {
                tL_document_layer82.mime_type = "";
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 10);
            if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize)) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || pathToAttach.exists()) {
                    try {
                        if (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = closestPhotoSizeWithSize.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            pathToAttach.length();
                            byte[] bArr3 = new byte[(int) pathToAttach.length()];
                            new RandomAccessFile(pathToAttach, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = closestPhotoSizeWithSize.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = closestPhotoSizeWithSize.size;
                        photoSize.w = closestPhotoSizeWithSize.w;
                        photoSize.h = closestPhotoSizeWithSize.h;
                        photoSize.type = closestPhotoSizeWithSize.type;
                        photoSize.bytes = bArr;
                        tL_document_layer82.thumbs.add(photoSize);
                        tL_document_layer82.flags |= 1;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if (tL_document_layer82.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                tL_document_layer82.thumbs.add(tL_photoSizeEmpty);
            }
            document2 = tL_document_layer82;
        } else {
            document2 = document;
        }
        if (MessageObject.isGifDocument(document2)) {
            mediaSendQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda98
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$sendSticker$6(document2, j, messageObject, messageObject2, z, i, i2, obj, sendAnimationData, storyItem, replyQuote, str2, i3, j2, j3, messageSuggestionParams);
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("query", str);
        }
        SendMessageParams of = SendMessageParams.of((TLRPC.TL_document) document2, null, null, j, messageObject, messageObject2, null, null, null, hashMap, z, i, i2, 0, obj, sendAnimationData, z2);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str2;
        of.quick_reply_shortcut_id = i3;
        of.payStars = j2;
        of.monoForumPeer = j3;
        of.suggestionParams = messageSuggestionParams;
        sendMessage(of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSticker$6(final TLRPC.Document document, final long j, final MessageObject messageObject, final MessageObject messageObject2, final boolean z, final int i, final int i2, final Object obj, final MessageObject.SendAnimationData sendAnimationData, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final String str, final int i3, final long j2, final long j3, final MessageSuggestionParams messageSuggestionParams) {
        String str2;
        final Bitmap[] bitmapArr = new Bitmap[1];
        String key = ImageLocation.getForDocument(document).getKey(null, null, false);
        if ("video/mp4".equals(document.mime_type)) {
            str2 = ".mp4";
        } else if ("video/x-matroska".equals(document.mime_type)) {
            str2 = ".mkv";
        } else {
            str2 = "";
        }
        File file = new File(FileLoader.getDirectory(3), key + str2);
        if (!file.exists()) {
            file = new File(FileLoader.getDirectory(2), key + str2);
        }
        ensureMediaThumbExists(getAccountInstance(), false, document, file.getAbsolutePath(), null, 0L);
        final String[] strArr = {getKeyForPhotoSize(getAccountInstance(), FileLoader.getClosestPhotoSizeWithSize(document.thumbs, NotificationCenter.chatlistFolderUpdate), bitmapArr, true, true)};
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendSticker$5(bitmapArr, strArr, document, j, messageObject, messageObject2, z, i, i2, obj, sendAnimationData, storyItem, replyQuote, str, i3, j2, j3, messageSuggestionParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSticker$5(Bitmap[] bitmapArr, String[] strArr, TLRPC.Document document, long j, MessageObject messageObject, MessageObject messageObject2, boolean z, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str, int i3, long j2, long j3, MessageSuggestionParams messageSuggestionParams) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        SendMessageParams of = SendMessageParams.of((TLRPC.TL_document) document, null, null, j, messageObject, messageObject2, null, null, null, null, z, i, i2, 0, obj, sendAnimationData, false);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str;
        of.quick_reply_shortcut_id = i3;
        of.payStars = j2;
        of.monoForumPeer = j3;
        of.suggestionParams = messageSuggestionParams;
        sendMessage(of);
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j, boolean z, boolean z2, boolean z3, int i, long j2) {
        return sendMessage(arrayList, j, z, z2, z3, i, null, -1, j2);
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j, boolean z, boolean z2, boolean z3, int i, MessageObject messageObject, int i2, long j2) {
        return sendMessage(arrayList, j, z, z2, z3, i, 0, messageObject, i2, j2, 0L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0810, code lost:
    
        if (r14.contains(java.lang.Integer.valueOf(r4.reply_to_msg_id)) != false) goto L349;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int sendMessage(final ArrayList<MessageObject> arrayList, final long j, final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final MessageObject messageObject, final int i3, long j2, final long j3, final MessageSuggestionParams messageSuggestionParams) {
        TLRPC.UserFull userFull;
        long j4;
        boolean z4;
        boolean z5;
        long j5;
        String str;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean canSendEmbed;
        boolean canSendPolls;
        boolean canSendRoundVideo;
        boolean canSendVoice;
        boolean canSendMusic;
        TLRPC.Chat chat;
        String str2;
        boolean z11;
        long j6;
        TLRPC.ChatFull chatFull;
        int i4;
        LongSparseArray longSparseArray;
        long j7;
        long j8;
        String str3;
        TLRPC.Chat chat2;
        ArrayList<Long> arrayList2;
        ArrayList<MessageObject> arrayList3;
        ArrayList<Integer> arrayList4;
        final LongSparseArray longSparseArray2;
        final TLRPC.Peer peer;
        boolean z12;
        TLRPC.InputPeer inputPeer;
        LongSparseArray longSparseArray3;
        ArrayList<Integer> arrayList5;
        ArrayList<MessageObject> arrayList6;
        int i5;
        boolean z13;
        long j9;
        String str4;
        TLRPC.Chat chat3;
        LongSparseArray longSparseArray4;
        long j10;
        LongSparseArray longSparseArray5;
        long j11;
        long j12;
        LongSparseArray longSparseArray6;
        long j13;
        TLRPC.Chat chat4;
        long sendAsPeerId;
        String str5;
        LongSparseArray longSparseArray7;
        int currentTime;
        boolean z14;
        long j14;
        TLRPC.Message message;
        ArrayList arrayList7;
        ArrayList<MessageObject> arrayList8;
        ArrayList<Long> arrayList9;
        ArrayList<Integer> arrayList10;
        int i6;
        final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages;
        boolean z15;
        TLRPC.InputPeer inputPeer2;
        int i7;
        MessageObject messageObject2;
        long j15;
        final ArrayList arrayList11;
        Runnable runnable;
        TLRPC.Message message2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Peer peer2;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer3;
        int i8;
        ArrayList<MessageObject> arrayList12 = arrayList;
        boolean z16 = z;
        boolean z17 = z2;
        if (arrayList12 == null || arrayList.isEmpty()) {
            return 0;
        }
        long clientUserId = getUserConfig().getClientUserId();
        if (!DialogObject.isEncryptedDialog(j)) {
            TLRPC.Peer peer4 = getMessagesController().getPeer(j);
            long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(j);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(j));
            }
            if (sendPaidMessagesStars != j2) {
                AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, j, Math.max(1, arrayList.size()), new Utilities.Callback() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        SendMessagesHelper.this.lambda$sendMessage$7(arrayList, j, z, z2, z3, i, i2, messageObject, i3, j3, messageSuggestionParams, (Long) obj);
                    }
                });
                return 0;
            }
            if (DialogObject.isUserDialog(j)) {
                if (getMessagesController().getUser(Long.valueOf(j)) == null) {
                    return 0;
                }
                TLRPC.UserFull userFull2 = getMessagesController().getUserFull(j);
                if (userFull2 != null) {
                    canSendVoice = !userFull2.voice_messages_forbidden;
                    canSendRoundVideo = canSendVoice;
                    j6 = 0;
                    str2 = null;
                    chat = null;
                    z11 = false;
                    z6 = false;
                    z7 = true;
                    z8 = true;
                    z9 = true;
                    canSendMusic = true;
                    canSendPolls = true;
                } else {
                    j6 = 0;
                    str2 = null;
                    chat = null;
                    z11 = false;
                    z6 = false;
                    z7 = true;
                    z8 = true;
                    z9 = true;
                    canSendMusic = true;
                    canSendPolls = true;
                    canSendVoice = true;
                    canSendRoundVideo = true;
                }
                z10 = true;
                canSendEmbed = true;
            } else {
                TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j));
                if (ChatObject.isChannel(chat5)) {
                    z4 = chat5.signatures;
                    boolean z18 = chat5.megagroup;
                    z5 = !z18;
                    j4 = (z18 || !chat5.has_link || (chatFull = getMessagesController().getChatFull(chat5.id)) == null) ? 0L : chatFull.linked_chat_id;
                } else {
                    j4 = 0;
                    z4 = false;
                    z5 = false;
                }
                if (chat5 != null) {
                    j5 = j4;
                    str = getMessagesController().getAdminRank(chat5.id, clientUserId);
                } else {
                    j5 = j4;
                    str = null;
                }
                boolean canSendStickers = ChatObject.canSendStickers(chat5);
                boolean canSendPhoto = ChatObject.canSendPhoto(chat5);
                boolean canSendVideo = ChatObject.canSendVideo(chat5);
                boolean canSendDocument = ChatObject.canSendDocument(chat5);
                z6 = z4;
                z7 = canSendStickers;
                z8 = canSendPhoto;
                z9 = canSendVideo;
                z10 = canSendDocument;
                canSendEmbed = ChatObject.canSendEmbed(chat5);
                canSendPolls = ChatObject.canSendPolls(chat5);
                canSendRoundVideo = ChatObject.canSendRoundVideo(chat5);
                canSendVoice = ChatObject.canSendVoice(chat5);
                canSendMusic = ChatObject.canSendMusic(chat5);
                chat = chat5;
                str2 = str;
                long j16 = j5;
                z11 = z5;
                j6 = j16;
            }
            LongSparseArray longSparseArray8 = new LongSparseArray();
            ArrayList<MessageObject> arrayList13 = new ArrayList<>();
            ArrayList arrayList14 = new ArrayList();
            ArrayList<Long> arrayList15 = new ArrayList<>();
            ArrayList<Integer> arrayList16 = new ArrayList<>();
            LongSparseArray longSparseArray9 = new LongSparseArray();
            TLRPC.InputPeer inputPeer3 = getMessagesController().getInputPeer(j);
            boolean z19 = j == clientUserId;
            TLRPC.InputPeer inputPeer4 = inputPeer3;
            final ArrayList arrayList17 = arrayList14;
            ArrayList<Long> arrayList18 = arrayList15;
            ArrayList<Integer> arrayList19 = arrayList16;
            LongSparseArray longSparseArray10 = longSparseArray9;
            ArrayList<MessageObject> arrayList20 = arrayList13;
            int i9 = 0;
            int i10 = 0;
            while (i9 < arrayList.size()) {
                MessageObject messageObject3 = arrayList12.get(i9);
                if (messageObject3.getId() <= 0 || messageObject3.needDrawBluredPreview()) {
                    i4 = i9;
                    longSparseArray = longSparseArray8;
                    j7 = j6;
                    j8 = clientUserId;
                    str3 = str2;
                    chat2 = chat;
                    arrayList2 = arrayList18;
                    arrayList3 = arrayList20;
                    arrayList4 = arrayList19;
                    longSparseArray2 = longSparseArray10;
                    peer = peer4;
                    z12 = z11;
                    inputPeer = inputPeer4;
                    if (messageObject3.type == 0 && !TextUtils.isEmpty(messageObject3.messageText)) {
                        TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                        TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                        SendMessageParams of = SendMessageParams.of(messageObject3.messageText.toString(), j, null, messageObject, webPage, webPage != null, messageObject3.messageOwner.entities, null, null, z3, i, i2, null, false);
                        of.suggestionParams = messageSuggestionParams;
                        of.monoForumPeer = j3;
                        of.quick_reply_shortcut = messageObject3.getQuickReplyName();
                        of.quick_reply_shortcut_id = messageObject3.getQuickReplyId();
                        sendMessage(of);
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    }
                    longSparseArray3 = longSparseArray2;
                    arrayList18 = arrayList2;
                    arrayList5 = arrayList4;
                    arrayList6 = arrayList3;
                } else {
                    if (messageObject3.isSticker() || messageObject3.isAnimatedSticker() || messageObject3.isGif() || messageObject3.isGame()) {
                        i5 = i9;
                        z13 = true;
                    } else {
                        i5 = i9;
                        z13 = false;
                    }
                    if (!z7 && z13) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 8) ? 4 : 1;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList21 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList21;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (!z8 && (messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !messageObject3.isVideo() && !z13) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 16) ? 10 : 12;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList212 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList212;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (!canSendMusic && messageObject3.isMusic()) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 18) ? 19 : 20;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList2122 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList2122;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (!z9 && (messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && messageObject3.isVideo() && !z13) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 17) ? 9 : 11;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList21222 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList21222;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (!canSendPolls && (messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 10) ? 6 : 3;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList212222 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList212222;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (!canSendPolls && (messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaToDo)) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 10) ? 21 : 22;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList2122222 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList2122222;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else if (canSendVoice || !MessageObject.isVoiceMessage(messageObject3.messageOwner)) {
                        if (canSendRoundVideo || !MessageObject.isRoundVideoMessage(messageObject3.messageOwner)) {
                            if (z10 || !(messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaDocument) || z13) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                if (z16) {
                                    j9 = j6;
                                    str4 = str2;
                                    chat3 = chat;
                                    longSparseArray4 = longSparseArray8;
                                } else {
                                    boolean z20 = messageObject3.getDialogId() == clientUserId && messageObject3.isFromUser() && messageObject3.messageOwner.from_id.user_id == clientUserId;
                                    if (messageObject3.isForwarded()) {
                                        TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                                        tL_message.fwd_from = tL_messageFwdHeader;
                                        TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject3.messageOwner.fwd_from;
                                        str4 = str2;
                                        if ((messageFwdHeader2.flags & 1) != 0) {
                                            tL_messageFwdHeader.flags |= 1;
                                            tL_messageFwdHeader.from_id = messageFwdHeader2.from_id;
                                        }
                                        if ((messageFwdHeader2.flags & 32) != 0) {
                                            tL_messageFwdHeader.flags |= 32;
                                            tL_messageFwdHeader.from_name = messageFwdHeader2.from_name;
                                        }
                                        if ((messageFwdHeader2.flags & 4) != 0) {
                                            tL_messageFwdHeader.flags |= 4;
                                            tL_messageFwdHeader.channel_post = messageFwdHeader2.channel_post;
                                        }
                                        if ((messageFwdHeader2.flags & 8) != 0) {
                                            tL_messageFwdHeader.flags |= 8;
                                            tL_messageFwdHeader.post_author = messageFwdHeader2.post_author;
                                        }
                                        if ((j == clientUserId || z11) && (messageFwdHeader2.flags & 16) != 0 && !UserObject.isReplyUser(messageObject3.getDialogId())) {
                                            TLRPC.MessageFwdHeader messageFwdHeader3 = tL_message.fwd_from;
                                            messageFwdHeader3.flags |= 16;
                                            TLRPC.MessageFwdHeader messageFwdHeader4 = messageObject3.messageOwner.fwd_from;
                                            messageFwdHeader3.saved_from_peer = messageFwdHeader4.saved_from_peer;
                                            messageFwdHeader3.saved_from_msg_id = messageFwdHeader4.saved_from_msg_id;
                                        }
                                        tL_message.fwd_from.date = messageObject3.messageOwner.fwd_from.date;
                                        tL_message.flags = 4;
                                    } else {
                                        str4 = str2;
                                        if (!z20) {
                                            long fromChatId = messageObject3.getFromChatId();
                                            TLRPC.TL_messageFwdHeader tL_messageFwdHeader2 = new TLRPC.TL_messageFwdHeader();
                                            tL_message.fwd_from = tL_messageFwdHeader2;
                                            chat3 = chat;
                                            tL_messageFwdHeader2.channel_post = messageObject3.getId();
                                            tL_message.fwd_from.flags |= 4;
                                            if (messageObject3.isFromUser()) {
                                                TLRPC.MessageFwdHeader messageFwdHeader5 = tL_message.fwd_from;
                                                messageFwdHeader5.from_id = messageObject3.messageOwner.from_id;
                                                messageFwdHeader5.flags |= 1;
                                                j9 = j6;
                                                longSparseArray4 = longSparseArray8;
                                            } else {
                                                tL_message.fwd_from.from_id = new TLRPC.TL_peerChannel();
                                                TLRPC.MessageFwdHeader messageFwdHeader6 = tL_message.fwd_from;
                                                TLRPC.Peer peer5 = messageFwdHeader6.from_id;
                                                TLRPC.Message message3 = messageObject3.messageOwner;
                                                TLRPC.Peer peer6 = message3.peer_id;
                                                j9 = j6;
                                                longSparseArray4 = longSparseArray8;
                                                peer5.channel_id = peer6.channel_id;
                                                messageFwdHeader6.flags |= 1;
                                                if (message3.post && fromChatId > 0) {
                                                    TLRPC.Peer peer7 = message3.from_id;
                                                    if (peer7 != null) {
                                                        peer6 = peer7;
                                                    }
                                                    messageFwdHeader6.from_id = peer6;
                                                }
                                            }
                                            if (messageObject3.messageOwner.post_author == null && !messageObject3.isOutOwner() && fromChatId > 0 && messageObject3.messageOwner.post && (user = getMessagesController().getUser(Long.valueOf(fromChatId))) != null) {
                                                tL_message.fwd_from.post_author = ContactsController.formatName(user.first_name, user.last_name);
                                                tL_message.fwd_from.flags |= 8;
                                            }
                                            tL_message.date = messageObject3.messageOwner.date;
                                            tL_message.flags = 4;
                                            if (j == clientUserId && (messageFwdHeader = tL_message.fwd_from) != null) {
                                                messageFwdHeader.flags |= 16;
                                                messageFwdHeader.saved_from_msg_id = messageObject3.getId();
                                                TLRPC.MessageFwdHeader messageFwdHeader7 = tL_message.fwd_from;
                                                peer3 = messageObject3.messageOwner.peer_id;
                                                messageFwdHeader7.saved_from_peer = peer3;
                                                if (peer3.user_id == clientUserId) {
                                                    peer3.user_id = messageObject3.getDialogId();
                                                }
                                            }
                                        }
                                    }
                                    j9 = j6;
                                    chat3 = chat;
                                    longSparseArray4 = longSparseArray8;
                                    if (j == clientUserId) {
                                        messageFwdHeader.flags |= 16;
                                        messageFwdHeader.saved_from_msg_id = messageObject3.getId();
                                        TLRPC.MessageFwdHeader messageFwdHeader72 = tL_message.fwd_from;
                                        peer3 = messageObject3.messageOwner.peer_id;
                                        messageFwdHeader72.saved_from_peer = peer3;
                                        if (peer3.user_id == clientUserId) {
                                        }
                                    }
                                }
                                HashMap<String, String> hashMap = new HashMap<>();
                                tL_message.params = hashMap;
                                hashMap.put("fwd_id", "" + messageObject3.getId());
                                tL_message.params.put("fwd_peer", "" + messageObject3.getDialogId());
                                if (!messageObject3.messageOwner.restriction_reason.isEmpty()) {
                                    tL_message.restriction_reason = messageObject3.messageOwner.restriction_reason;
                                    tL_message.flags |= TLObject.FLAG_22;
                                }
                                if (!canSendEmbed && (messageObject3.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage)) {
                                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                                } else {
                                    tL_message.media = messageObject3.messageOwner.media;
                                }
                                TLRPC.Message message4 = messageObject3.messageOwner;
                                tL_message.invert_media = message4.invert_media;
                                if (tL_message.media != null) {
                                    tL_message.flags |= 512;
                                }
                                long j17 = message4.via_bot_id;
                                if (j17 != 0) {
                                    tL_message.via_bot_id = j17;
                                    tL_message.flags |= 2048;
                                }
                                if (j9 != 0) {
                                    TLRPC.TL_messageReplies tL_messageReplies = new TLRPC.TL_messageReplies();
                                    tL_message.replies = tL_messageReplies;
                                    tL_messageReplies.comments = true;
                                    j10 = j9;
                                    tL_messageReplies.channel_id = j10;
                                    tL_messageReplies.flags |= 1;
                                    tL_message.flags |= TLObject.FLAG_23;
                                } else {
                                    j10 = j9;
                                }
                                if (!z17 || tL_message.media == null) {
                                    tL_message.message = messageObject3.messageOwner.message;
                                }
                                if (tL_message.message == null) {
                                    tL_message.message = "";
                                }
                                tL_message.fwd_msg_id = messageObject3.getId();
                                TLRPC.Message message5 = messageObject3.messageOwner;
                                tL_message.attachPath = message5.attachPath;
                                tL_message.entities = message5.entities;
                                if (message5.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                                    tL_message.reply_markup = new TLRPC.TL_replyInlineMarkup();
                                    int size = messageObject3.messageOwner.reply_markup.rows.size();
                                    int i11 = 0;
                                    boolean z21 = false;
                                    while (true) {
                                        if (i11 >= size) {
                                            longSparseArray5 = longSparseArray4;
                                            j11 = j10;
                                            break;
                                        }
                                        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow2 = messageObject3.messageOwner.reply_markup.rows.get(i11);
                                        int size2 = tL_keyboardButtonRow2.buttons.size();
                                        int i12 = size;
                                        int i13 = 0;
                                        TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow3 = null;
                                        while (true) {
                                            longSparseArray5 = longSparseArray4;
                                            if (i13 >= size2) {
                                                j11 = j10;
                                                break;
                                            }
                                            TLRPC.KeyboardButton keyboardButton = tL_keyboardButtonRow2.buttons.get(i13);
                                            boolean z22 = z21;
                                            boolean z23 = keyboardButton instanceof TLRPC.TL_keyboardButtonUrlAuth;
                                            j11 = j10;
                                            if (!z23 && !(keyboardButton instanceof TLRPC.TL_keyboardButtonUrl) && !(keyboardButton instanceof TLRPC.TL_keyboardButtonSwitchInline) && !(keyboardButton instanceof TLRPC.TL_keyboardButtonBuy)) {
                                                z21 = true;
                                                break;
                                            }
                                            if (z23) {
                                                TLRPC.TL_keyboardButtonUrlAuth tL_keyboardButtonUrlAuth = new TLRPC.TL_keyboardButtonUrlAuth();
                                                tL_keyboardButtonUrlAuth.flags = keyboardButton.flags;
                                                String str6 = keyboardButton.fwd_text;
                                                if (str6 != null) {
                                                    tL_keyboardButtonUrlAuth.fwd_text = str6;
                                                    tL_keyboardButtonUrlAuth.text = str6;
                                                } else {
                                                    tL_keyboardButtonUrlAuth.text = keyboardButton.text;
                                                }
                                                tL_keyboardButtonUrlAuth.url = keyboardButton.url;
                                                tL_keyboardButtonUrlAuth.button_id = keyboardButton.button_id;
                                                keyboardButton = tL_keyboardButtonUrlAuth;
                                            }
                                            if (tL_keyboardButtonRow3 == null) {
                                                tL_keyboardButtonRow = new TLRPC.TL_keyboardButtonRow();
                                                tL_message.reply_markup.rows.add(tL_keyboardButtonRow);
                                            } else {
                                                tL_keyboardButtonRow = tL_keyboardButtonRow3;
                                            }
                                            tL_keyboardButtonRow.buttons.add(keyboardButton);
                                            i13++;
                                            tL_keyboardButtonRow3 = tL_keyboardButtonRow;
                                            longSparseArray4 = longSparseArray5;
                                            z21 = z22;
                                            j10 = j11;
                                        }
                                        if (z21) {
                                            break;
                                        }
                                        i11++;
                                        size = i12;
                                        longSparseArray4 = longSparseArray5;
                                        j10 = j11;
                                    }
                                    if (z21) {
                                        messageObject3.messageOwner.reply_markup = null;
                                        tL_message.flags &= -65;
                                        if (!tL_message.entities.isEmpty()) {
                                            tL_message.flags |= 128;
                                        }
                                        if (tL_message.attachPath == null) {
                                            tL_message.attachPath = "";
                                        }
                                        int newMessageId = getUserConfig().getNewMessageId();
                                        tL_message.id = newMessageId;
                                        tL_message.local_id = newMessageId;
                                        tL_message.out = true;
                                        j12 = messageObject3.messageOwner.grouped_id;
                                        if (j12 == 0) {
                                            longSparseArray6 = longSparseArray5;
                                            Long l = (Long) longSparseArray6.get(j12);
                                            if (l == null) {
                                                l = Long.valueOf(Utilities.random.nextLong());
                                                longSparseArray6.put(messageObject3.messageOwner.grouped_id, l);
                                            }
                                            tL_message.grouped_id = l.longValue();
                                            tL_message.flags |= 131072;
                                        } else {
                                            longSparseArray6 = longSparseArray5;
                                        }
                                        if (peer4.channel_id == 0 && z11) {
                                            if (z6) {
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                tL_message.from_id = tL_peerUser;
                                                tL_peerUser.user_id = clientUserId;
                                            } else {
                                                tL_message.from_id = peer4;
                                            }
                                            tL_message.post = true;
                                            j13 = j;
                                            str5 = str4;
                                            chat4 = chat3;
                                        } else {
                                            j13 = j;
                                            chat4 = chat3;
                                            sendAsPeerId = ChatObject.getSendAsPeerId(chat4, getMessagesController().getChatFull(-j13), true);
                                            if (sendAsPeerId != clientUserId) {
                                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                tL_message.from_id = tL_peerUser2;
                                                tL_peerUser2.user_id = clientUserId;
                                                tL_message.flags |= 256;
                                                str5 = str4;
                                            } else {
                                                tL_message.from_id = getMessagesController().getPeer(sendAsPeerId);
                                                str5 = str4;
                                                if (str4 != null) {
                                                    tL_message.post_author = str5;
                                                    tL_message.flags |= 65536;
                                                }
                                            }
                                        }
                                        if (tL_message.random_id == 0) {
                                            tL_message.random_id = getNextRandomId();
                                        }
                                        ArrayList<Long> arrayList22 = arrayList18;
                                        arrayList22.add(Long.valueOf(tL_message.random_id));
                                        LongSparseArray longSparseArray11 = longSparseArray10;
                                        longSparseArray11.put(tL_message.random_id, tL_message);
                                        ArrayList<Integer> arrayList23 = arrayList19;
                                        arrayList23.add(Integer.valueOf(tL_message.fwd_msg_id));
                                        if (i == 0) {
                                            longSparseArray7 = longSparseArray11;
                                            currentTime = i;
                                        } else {
                                            longSparseArray7 = longSparseArray11;
                                            currentTime = getConnectionsManager().getCurrentTime();
                                        }
                                        tL_message.date = currentTime;
                                        LongSparseArray longSparseArray12 = longSparseArray6;
                                        TLRPC.InputPeer inputPeer5 = inputPeer4;
                                        z14 = inputPeer5 instanceof TLRPC.TL_inputPeerChannel;
                                        if (z14 || !z11) {
                                            j14 = clientUserId;
                                            message = messageObject3.messageOwner;
                                            if ((message.flags & 1024) != 0 && i == 0) {
                                                tL_message.views = message.views;
                                                tL_message.flags |= 1024;
                                            }
                                            tL_message.unread = true;
                                        } else {
                                            j14 = clientUserId;
                                            if (i == 0) {
                                                tL_message.views = 1;
                                                tL_message.flags |= 1024;
                                            }
                                        }
                                        tL_message.dialog_id = j13;
                                        tL_message.peer_id = peer4;
                                        if (!MessageObject.isVoiceMessage(tL_message) || MessageObject.isRoundVideoMessage(tL_message)) {
                                            if (!z14 && messageObject3.getChannelId() != 0) {
                                                tL_message.media_unread = messageObject3.isContentUnread();
                                            } else {
                                                tL_message.media_unread = true;
                                            }
                                        }
                                        if (messageObject == null && messageSuggestionParams == null && (messageReplyHeader = (message2 = messageObject3.messageOwner).reply_to) != null) {
                                            peer2 = messageReplyHeader.reply_to_peer_id;
                                            if (peer2 != null || MessageObject.peersEqual(peer2, message2.peer_id)) {
                                                messageReplyHeader2 = messageObject3.messageOwner.reply_to;
                                                if ((messageReplyHeader2.flags & 16) != 0) {
                                                }
                                            }
                                            tL_message.flags |= 8;
                                            tL_message.reply_to = messageObject3.messageOwner.reply_to;
                                        }
                                        String str7 = str5;
                                        TLRPC.Chat chat6 = chat4;
                                        if (j2 > 0) {
                                            tL_message.flags2 |= 64;
                                            tL_message.paid_message_stars = j2;
                                        }
                                        if (j3 != 0) {
                                            tL_message.saved_peer_id = getMessagesController().getPeer(j3);
                                            tL_message.flags |= TLObject.FLAG_28;
                                        }
                                        if (messageSuggestionParams != null) {
                                            tL_message.suggested_post = messageSuggestionParams.toTl();
                                        }
                                        z12 = z11;
                                        TLRPC.Peer peer8 = peer4;
                                        MessageObject messageObject4 = new MessageObject(this.currentAccount, tL_message, true, true);
                                        messageObject4.scheduled = i == 0;
                                        messageObject4.messageOwner.send_state = 1;
                                        messageObject4.wasJustSent = true;
                                        ArrayList<MessageObject> arrayList24 = arrayList20;
                                        arrayList24.add(messageObject4);
                                        arrayList7 = arrayList17;
                                        arrayList7.add(tL_message);
                                        StarsController.getInstance(this.currentAccount).beforeSendingMessage(messageObject4);
                                        if (messageObject3.replyMessageObject != null) {
                                            int i14 = 0;
                                            while (i14 < arrayList.size()) {
                                                arrayList8 = arrayList;
                                                arrayList10 = arrayList23;
                                                arrayList9 = arrayList22;
                                                if (arrayList8.get(i14).getId() == messageObject3.replyMessageObject.getId()) {
                                                    TLRPC.Message message6 = messageObject4.messageOwner;
                                                    MessageObject messageObject5 = messageObject3.replyMessageObject;
                                                    message6.replyMessage = messageObject5.messageOwner;
                                                    messageObject4.replyMessageObject = messageObject5;
                                                    break;
                                                }
                                                i14++;
                                                arrayList22 = arrayList9;
                                                arrayList23 = arrayList10;
                                            }
                                        }
                                        arrayList8 = arrayList;
                                        arrayList9 = arrayList22;
                                        arrayList10 = arrayList23;
                                        putToSendingMessages(tL_message, i == 0);
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("forward message user_id = " + inputPeer5.user_id + " chat_id = " + inputPeer5.chat_id + " channel_id = " + inputPeer5.channel_id + " access_hash = " + inputPeer5.access_hash);
                                        }
                                        if (messageObject != null && messageSuggestionParams == null) {
                                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                            tL_message.reply_to = tL_messageReplyHeader;
                                            tL_messageReplyHeader.flags |= 16;
                                            tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                            if (messageObject.isTopicMainMessage) {
                                                TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
                                                messageReplyHeader3.forum_topic = true;
                                                messageReplyHeader3.flags |= 8;
                                                if (arrayList7.size() != 100) {
                                                    i6 = i5;
                                                    if (i6 != arrayList.size() - 1 && (i6 == arrayList.size() - 1 || arrayList8.get(i6 + 1).getDialogId() == messageObject3.getDialogId())) {
                                                        arrayList17 = arrayList7;
                                                        inputPeer = inputPeer5;
                                                        i4 = i6;
                                                        arrayList3 = arrayList24;
                                                        chat2 = chat6;
                                                        longSparseArray2 = longSparseArray7;
                                                        j8 = j14;
                                                        str3 = str7;
                                                        longSparseArray = longSparseArray12;
                                                        j7 = j11;
                                                        arrayList2 = arrayList9;
                                                        arrayList4 = arrayList10;
                                                        peer = peer8;
                                                        longSparseArray3 = longSparseArray2;
                                                        arrayList18 = arrayList2;
                                                        arrayList5 = arrayList4;
                                                        arrayList6 = arrayList3;
                                                    }
                                                } else {
                                                    i6 = i5;
                                                }
                                                getMessagesStorage().putMessages(new ArrayList<>(arrayList7), false, true, false, 0, i != 0 ? 1 : 0, 0L);
                                                getMessagesController().updateInterfaceWithMessages(j13, arrayList24, i != 0 ? 1 : 0);
                                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                                getUserConfig().saveConfig(false);
                                                tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                                tL_messages_forwardMessages.to_peer = inputPeer5;
                                                if (z3) {
                                                    if (!MessagesController.getNotificationsSettings(this.currentAccount).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + j13, false)) {
                                                        z15 = false;
                                                        tL_messages_forwardMessages.silent = z15;
                                                        if (messageObject != null) {
                                                            tL_messages_forwardMessages.top_msg_id = messageObject.getId();
                                                            tL_messages_forwardMessages.flags |= 512;
                                                        }
                                                        if (i == 0) {
                                                            tL_messages_forwardMessages.schedule_date = i;
                                                            int i15 = tL_messages_forwardMessages.flags;
                                                            tL_messages_forwardMessages.flags = i15 | 1024;
                                                            if (i2 != 0) {
                                                                tL_messages_forwardMessages.schedule_repeat_period = i2;
                                                                tL_messages_forwardMessages.flags = i15 | 16778240;
                                                            }
                                                        }
                                                        if (!(messageObject3.messageOwner.peer_id instanceof TLRPC.TL_peerChannel)) {
                                                            inputPeer2 = inputPeer5;
                                                            TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(messageObject3.messageOwner.peer_id.channel_id));
                                                            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                                            tL_messages_forwardMessages.from_peer = tL_inputPeerChannel;
                                                            i7 = i6;
                                                            tL_inputPeerChannel.channel_id = messageObject3.messageOwner.peer_id.channel_id;
                                                            if (chat7 != null) {
                                                                tL_inputPeerChannel.access_hash = chat7.access_hash;
                                                            }
                                                        } else {
                                                            inputPeer2 = inputPeer5;
                                                            i7 = i6;
                                                            tL_messages_forwardMessages.from_peer = new TLRPC.TL_inputPeerEmpty();
                                                        }
                                                        ArrayList<Long> arrayList25 = arrayList9;
                                                        tL_messages_forwardMessages.random_id = arrayList25;
                                                        ArrayList<Integer> arrayList26 = arrayList10;
                                                        tL_messages_forwardMessages.id = arrayList26;
                                                        tL_messages_forwardMessages.drop_author = z;
                                                        tL_messages_forwardMessages.drop_media_captions = z2;
                                                        tL_messages_forwardMessages.with_my_score = arrayList.size() != 1 && arrayList8.get(0).messageOwner.with_my_score;
                                                        if (i3 >= 0) {
                                                            tL_messages_forwardMessages.flags |= 1048576;
                                                            tL_messages_forwardMessages.video_timestamp = i3;
                                                        }
                                                        if (j2 <= 0) {
                                                            tL_messages_forwardMessages.flags |= TLObject.FLAG_21;
                                                            messageObject2 = messageObject3;
                                                            j15 = j3;
                                                            tL_messages_forwardMessages.allow_paid_stars = tL_messages_forwardMessages.id.size() * j2;
                                                        } else {
                                                            messageObject2 = messageObject3;
                                                            j15 = j3;
                                                        }
                                                        if (messageSuggestionParams != null) {
                                                            tL_messages_forwardMessages.suggested_post = messageSuggestionParams.toTl();
                                                            if (messageObject != null) {
                                                                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                                                tL_messages_forwardMessages.reply_to = tL_inputReplyToMessage;
                                                                tL_inputReplyToMessage.reply_to_msg_id = messageObject.getId();
                                                            }
                                                        }
                                                        applyMonoForumPeerId(tL_messages_forwardMessages, j15);
                                                        arrayList11 = new ArrayList(arrayList24);
                                                        final boolean z24 = i != 2147483646;
                                                        peer = peer8;
                                                        arrayList17 = arrayList7;
                                                        inputPeer = inputPeer2;
                                                        i4 = i7;
                                                        longSparseArray2 = longSparseArray7;
                                                        longSparseArray = longSparseArray12;
                                                        arrayList2 = arrayList25;
                                                        arrayList4 = arrayList26;
                                                        j7 = j11;
                                                        j8 = j14;
                                                        final boolean z25 = z19;
                                                        final MessageObject messageObject6 = messageObject2;
                                                        arrayList3 = arrayList24;
                                                        str3 = str7;
                                                        chat2 = chat6;
                                                        final Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda8
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.this.lambda$sendMessage$17(tL_messages_forwardMessages, j, i, z24, z25, longSparseArray2, arrayList17, arrayList11, messageObject6, peer);
                                                            }
                                                        };
                                                        runnable = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda9
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.this.lambda$sendMessage$18(tL_messages_forwardMessages, arrayList11, runnable2);
                                                            }
                                                        };
                                                        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList11, runnable)) {
                                                            runnable.run();
                                                        }
                                                        if (i4 != arrayList.size() - 1) {
                                                            arrayList6 = new ArrayList<>();
                                                            ArrayList arrayList27 = new ArrayList();
                                                            ArrayList<Long> arrayList28 = new ArrayList<>();
                                                            arrayList5 = new ArrayList<>();
                                                            longSparseArray3 = new LongSparseArray();
                                                            arrayList17 = arrayList27;
                                                            arrayList18 = arrayList28;
                                                        }
                                                        longSparseArray3 = longSparseArray2;
                                                        arrayList18 = arrayList2;
                                                        arrayList5 = arrayList4;
                                                        arrayList6 = arrayList3;
                                                    }
                                                }
                                                z15 = true;
                                                tL_messages_forwardMessages.silent = z15;
                                                if (messageObject != null) {
                                                }
                                                if (i == 0) {
                                                }
                                                if (!(messageObject3.messageOwner.peer_id instanceof TLRPC.TL_peerChannel)) {
                                                }
                                                ArrayList<Long> arrayList252 = arrayList9;
                                                tL_messages_forwardMessages.random_id = arrayList252;
                                                ArrayList<Integer> arrayList262 = arrayList10;
                                                tL_messages_forwardMessages.id = arrayList262;
                                                tL_messages_forwardMessages.drop_author = z;
                                                tL_messages_forwardMessages.drop_media_captions = z2;
                                                tL_messages_forwardMessages.with_my_score = arrayList.size() != 1 && arrayList8.get(0).messageOwner.with_my_score;
                                                if (i3 >= 0) {
                                                }
                                                if (j2 <= 0) {
                                                }
                                                if (messageSuggestionParams != null) {
                                                }
                                                applyMonoForumPeerId(tL_messages_forwardMessages, j15);
                                                arrayList11 = new ArrayList(arrayList24);
                                                if (i != 2147483646) {
                                                }
                                                peer = peer8;
                                                arrayList17 = arrayList7;
                                                inputPeer = inputPeer2;
                                                i4 = i7;
                                                longSparseArray2 = longSparseArray7;
                                                longSparseArray = longSparseArray12;
                                                arrayList2 = arrayList252;
                                                arrayList4 = arrayList262;
                                                j7 = j11;
                                                j8 = j14;
                                                final boolean z252 = z19;
                                                final MessageObject messageObject62 = messageObject2;
                                                arrayList3 = arrayList24;
                                                str3 = str7;
                                                chat2 = chat6;
                                                final Runnable runnable22 = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda8
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.this.lambda$sendMessage$17(tL_messages_forwardMessages, j, i, z24, z252, longSparseArray2, arrayList17, arrayList11, messageObject62, peer);
                                                    }
                                                };
                                                runnable = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda9
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.this.lambda$sendMessage$18(tL_messages_forwardMessages, arrayList11, runnable22);
                                                    }
                                                };
                                                if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList11, runnable)) {
                                                }
                                                if (i4 != arrayList.size() - 1) {
                                                }
                                                longSparseArray3 = longSparseArray2;
                                                arrayList18 = arrayList2;
                                                arrayList5 = arrayList4;
                                                arrayList6 = arrayList3;
                                            }
                                        }
                                        if (arrayList7.size() != 100) {
                                        }
                                        getMessagesStorage().putMessages(new ArrayList<>(arrayList7), false, true, false, 0, i != 0 ? 1 : 0, 0L);
                                        getMessagesController().updateInterfaceWithMessages(j13, arrayList24, i != 0 ? 1 : 0);
                                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                        getUserConfig().saveConfig(false);
                                        tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                        tL_messages_forwardMessages.to_peer = inputPeer5;
                                        if (z3) {
                                        }
                                        z15 = true;
                                        tL_messages_forwardMessages.silent = z15;
                                        if (messageObject != null) {
                                        }
                                        if (i == 0) {
                                        }
                                        if (!(messageObject3.messageOwner.peer_id instanceof TLRPC.TL_peerChannel)) {
                                        }
                                        ArrayList<Long> arrayList2522 = arrayList9;
                                        tL_messages_forwardMessages.random_id = arrayList2522;
                                        ArrayList<Integer> arrayList2622 = arrayList10;
                                        tL_messages_forwardMessages.id = arrayList2622;
                                        tL_messages_forwardMessages.drop_author = z;
                                        tL_messages_forwardMessages.drop_media_captions = z2;
                                        tL_messages_forwardMessages.with_my_score = arrayList.size() != 1 && arrayList8.get(0).messageOwner.with_my_score;
                                        if (i3 >= 0) {
                                        }
                                        if (j2 <= 0) {
                                        }
                                        if (messageSuggestionParams != null) {
                                        }
                                        applyMonoForumPeerId(tL_messages_forwardMessages, j15);
                                        arrayList11 = new ArrayList(arrayList24);
                                        if (i != 2147483646) {
                                        }
                                        peer = peer8;
                                        arrayList17 = arrayList7;
                                        inputPeer = inputPeer2;
                                        i4 = i7;
                                        longSparseArray2 = longSparseArray7;
                                        longSparseArray = longSparseArray12;
                                        arrayList2 = arrayList2522;
                                        arrayList4 = arrayList2622;
                                        j7 = j11;
                                        j8 = j14;
                                        final boolean z2522 = z19;
                                        final MessageObject messageObject622 = messageObject2;
                                        arrayList3 = arrayList24;
                                        str3 = str7;
                                        chat2 = chat6;
                                        final Runnable runnable222 = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                SendMessagesHelper.this.lambda$sendMessage$17(tL_messages_forwardMessages, j, i, z24, z2522, longSparseArray2, arrayList17, arrayList11, messageObject622, peer);
                                            }
                                        };
                                        runnable = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda9
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                SendMessagesHelper.this.lambda$sendMessage$18(tL_messages_forwardMessages, arrayList11, runnable222);
                                            }
                                        };
                                        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList11, runnable)) {
                                        }
                                        if (i4 != arrayList.size() - 1) {
                                        }
                                        longSparseArray3 = longSparseArray2;
                                        arrayList18 = arrayList2;
                                        arrayList5 = arrayList4;
                                        arrayList6 = arrayList3;
                                    } else {
                                        tL_message.flags |= 64;
                                    }
                                } else {
                                    longSparseArray5 = longSparseArray4;
                                    j11 = j10;
                                }
                                if (!tL_message.entities.isEmpty()) {
                                }
                                if (tL_message.attachPath == null) {
                                }
                                int newMessageId2 = getUserConfig().getNewMessageId();
                                tL_message.id = newMessageId2;
                                tL_message.local_id = newMessageId2;
                                tL_message.out = true;
                                j12 = messageObject3.messageOwner.grouped_id;
                                if (j12 == 0) {
                                }
                                if (peer4.channel_id == 0) {
                                }
                                j13 = j;
                                chat4 = chat3;
                                sendAsPeerId = ChatObject.getSendAsPeerId(chat4, getMessagesController().getChatFull(-j13), true);
                                if (sendAsPeerId != clientUserId) {
                                }
                                if (tL_message.random_id == 0) {
                                }
                                ArrayList<Long> arrayList222 = arrayList18;
                                arrayList222.add(Long.valueOf(tL_message.random_id));
                                LongSparseArray longSparseArray112 = longSparseArray10;
                                longSparseArray112.put(tL_message.random_id, tL_message);
                                ArrayList<Integer> arrayList232 = arrayList19;
                                arrayList232.add(Integer.valueOf(tL_message.fwd_msg_id));
                                if (i == 0) {
                                }
                                tL_message.date = currentTime;
                                LongSparseArray longSparseArray122 = longSparseArray6;
                                TLRPC.InputPeer inputPeer52 = inputPeer4;
                                z14 = inputPeer52 instanceof TLRPC.TL_inputPeerChannel;
                                if (z14) {
                                }
                                j14 = clientUserId;
                                message = messageObject3.messageOwner;
                                if ((message.flags & 1024) != 0) {
                                    tL_message.views = message.views;
                                    tL_message.flags |= 1024;
                                }
                                tL_message.unread = true;
                                tL_message.dialog_id = j13;
                                tL_message.peer_id = peer4;
                                if (!MessageObject.isVoiceMessage(tL_message)) {
                                }
                                if (!z14) {
                                }
                                tL_message.media_unread = true;
                                if (messageObject == null) {
                                    peer2 = messageReplyHeader.reply_to_peer_id;
                                    if (peer2 != null) {
                                    }
                                    messageReplyHeader2 = messageObject3.messageOwner.reply_to;
                                    if ((messageReplyHeader2.flags & 16) != 0) {
                                    }
                                }
                                String str72 = str5;
                                TLRPC.Chat chat62 = chat4;
                                if (j2 > 0) {
                                }
                                if (j3 != 0) {
                                }
                                if (messageSuggestionParams != null) {
                                }
                                z12 = z11;
                                TLRPC.Peer peer82 = peer4;
                                MessageObject messageObject42 = new MessageObject(this.currentAccount, tL_message, true, true);
                                messageObject42.scheduled = i == 0;
                                messageObject42.messageOwner.send_state = 1;
                                messageObject42.wasJustSent = true;
                                ArrayList<MessageObject> arrayList242 = arrayList20;
                                arrayList242.add(messageObject42);
                                arrayList7 = arrayList17;
                                arrayList7.add(tL_message);
                                StarsController.getInstance(this.currentAccount).beforeSendingMessage(messageObject42);
                                if (messageObject3.replyMessageObject != null) {
                                }
                                arrayList8 = arrayList;
                                arrayList9 = arrayList222;
                                arrayList10 = arrayList232;
                                putToSendingMessages(tL_message, i == 0);
                                if (BuildVars.LOGS_ENABLED) {
                                }
                                if (messageObject != null) {
                                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                                    tL_message.reply_to = tL_messageReplyHeader2;
                                    tL_messageReplyHeader2.flags |= 16;
                                    tL_messageReplyHeader2.reply_to_msg_id = messageObject.getId();
                                    if (messageObject.isTopicMainMessage) {
                                    }
                                }
                                if (arrayList7.size() != 100) {
                                }
                                getMessagesStorage().putMessages(new ArrayList<>(arrayList7), false, true, false, 0, i != 0 ? 1 : 0, 0L);
                                getMessagesController().updateInterfaceWithMessages(j13, arrayList242, i != 0 ? 1 : 0);
                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                getUserConfig().saveConfig(false);
                                tL_messages_forwardMessages = new TLRPC.TL_messages_forwardMessages();
                                tL_messages_forwardMessages.to_peer = inputPeer52;
                                if (z3) {
                                }
                                z15 = true;
                                tL_messages_forwardMessages.silent = z15;
                                if (messageObject != null) {
                                }
                                if (i == 0) {
                                }
                                if (!(messageObject3.messageOwner.peer_id instanceof TLRPC.TL_peerChannel)) {
                                }
                                ArrayList<Long> arrayList25222 = arrayList9;
                                tL_messages_forwardMessages.random_id = arrayList25222;
                                ArrayList<Integer> arrayList26222 = arrayList10;
                                tL_messages_forwardMessages.id = arrayList26222;
                                tL_messages_forwardMessages.drop_author = z;
                                tL_messages_forwardMessages.drop_media_captions = z2;
                                tL_messages_forwardMessages.with_my_score = arrayList.size() != 1 && arrayList8.get(0).messageOwner.with_my_score;
                                if (i3 >= 0) {
                                }
                                if (j2 <= 0) {
                                }
                                if (messageSuggestionParams != null) {
                                }
                                applyMonoForumPeerId(tL_messages_forwardMessages, j15);
                                arrayList11 = new ArrayList(arrayList242);
                                if (i != 2147483646) {
                                }
                                peer = peer82;
                                arrayList17 = arrayList7;
                                inputPeer = inputPeer2;
                                i4 = i7;
                                longSparseArray2 = longSparseArray7;
                                longSparseArray = longSparseArray122;
                                arrayList2 = arrayList25222;
                                arrayList4 = arrayList26222;
                                j7 = j11;
                                j8 = j14;
                                final boolean z25222 = z19;
                                final MessageObject messageObject6222 = messageObject2;
                                arrayList3 = arrayList242;
                                str3 = str72;
                                chat2 = chat62;
                                final Runnable runnable2222 = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$sendMessage$17(tL_messages_forwardMessages, j, i, z24, z25222, longSparseArray2, arrayList17, arrayList11, messageObject6222, peer);
                                    }
                                };
                                runnable = new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$sendMessage$18(tL_messages_forwardMessages, arrayList11, runnable2222);
                                    }
                                };
                                if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList11, runnable)) {
                                }
                                if (i4 != arrayList.size() - 1) {
                                }
                                longSparseArray3 = longSparseArray2;
                                arrayList18 = arrayList2;
                                arrayList5 = arrayList4;
                                arrayList6 = arrayList3;
                            } else {
                                if (i10 == 0) {
                                    i8 = ChatObject.isActionBannedByDefault(chat, 19) ? 17 : 18;
                                    i10 = i8;
                                    longSparseArray = longSparseArray8;
                                    j7 = j6;
                                    j8 = clientUserId;
                                    str3 = str2;
                                    chat2 = chat;
                                    i4 = i5;
                                    arrayList5 = arrayList19;
                                    longSparseArray3 = longSparseArray10;
                                    z12 = z11;
                                    inputPeer = inputPeer4;
                                    ArrayList<MessageObject> arrayList21222222 = arrayList20;
                                    peer = peer4;
                                    arrayList6 = arrayList21222222;
                                }
                                longSparseArray = longSparseArray8;
                                j7 = j6;
                                j8 = clientUserId;
                                str3 = str2;
                                chat2 = chat;
                                arrayList2 = arrayList18;
                                i4 = i5;
                                arrayList3 = arrayList20;
                                arrayList4 = arrayList19;
                                longSparseArray2 = longSparseArray10;
                                peer = peer4;
                                z12 = z11;
                                inputPeer = inputPeer4;
                                longSparseArray3 = longSparseArray2;
                                arrayList18 = arrayList2;
                                arrayList5 = arrayList4;
                                arrayList6 = arrayList3;
                            }
                        } else if (chat != null) {
                            if (i10 == 0) {
                                i8 = ChatObject.isActionBannedByDefault(chat, 21) ? 15 : 16;
                                i10 = i8;
                                longSparseArray = longSparseArray8;
                                j7 = j6;
                                j8 = clientUserId;
                                str3 = str2;
                                chat2 = chat;
                                i4 = i5;
                                arrayList5 = arrayList19;
                                longSparseArray3 = longSparseArray10;
                                z12 = z11;
                                inputPeer = inputPeer4;
                                ArrayList<MessageObject> arrayList212222222 = arrayList20;
                                peer = peer4;
                                arrayList6 = arrayList212222222;
                            }
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            arrayList2 = arrayList18;
                            i4 = i5;
                            arrayList3 = arrayList20;
                            arrayList4 = arrayList19;
                            longSparseArray2 = longSparseArray10;
                            peer = peer4;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            longSparseArray3 = longSparseArray2;
                            arrayList18 = arrayList2;
                            arrayList5 = arrayList4;
                            arrayList6 = arrayList3;
                        } else {
                            if (i10 == 0) {
                                i8 = 8;
                                i10 = i8;
                                longSparseArray = longSparseArray8;
                                j7 = j6;
                                j8 = clientUserId;
                                str3 = str2;
                                chat2 = chat;
                                i4 = i5;
                                arrayList5 = arrayList19;
                                longSparseArray3 = longSparseArray10;
                                z12 = z11;
                                inputPeer = inputPeer4;
                                ArrayList<MessageObject> arrayList2122222222 = arrayList20;
                                peer = peer4;
                                arrayList6 = arrayList2122222222;
                            }
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            arrayList2 = arrayList18;
                            i4 = i5;
                            arrayList3 = arrayList20;
                            arrayList4 = arrayList19;
                            longSparseArray2 = longSparseArray10;
                            peer = peer4;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            longSparseArray3 = longSparseArray2;
                            arrayList18 = arrayList2;
                            arrayList5 = arrayList4;
                            arrayList6 = arrayList3;
                        }
                    } else if (chat != null) {
                        if (i10 == 0) {
                            i8 = ChatObject.isActionBannedByDefault(chat, 20) ? 13 : 14;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList21222222222 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList21222222222;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    } else {
                        if (i10 == 0) {
                            i8 = 7;
                            i10 = i8;
                            longSparseArray = longSparseArray8;
                            j7 = j6;
                            j8 = clientUserId;
                            str3 = str2;
                            chat2 = chat;
                            i4 = i5;
                            arrayList5 = arrayList19;
                            longSparseArray3 = longSparseArray10;
                            z12 = z11;
                            inputPeer = inputPeer4;
                            ArrayList<MessageObject> arrayList212222222222 = arrayList20;
                            peer = peer4;
                            arrayList6 = arrayList212222222222;
                        }
                        longSparseArray = longSparseArray8;
                        j7 = j6;
                        j8 = clientUserId;
                        str3 = str2;
                        chat2 = chat;
                        arrayList2 = arrayList18;
                        i4 = i5;
                        arrayList3 = arrayList20;
                        arrayList4 = arrayList19;
                        longSparseArray2 = longSparseArray10;
                        peer = peer4;
                        z12 = z11;
                        inputPeer = inputPeer4;
                        longSparseArray3 = longSparseArray2;
                        arrayList18 = arrayList2;
                        arrayList5 = arrayList4;
                        arrayList6 = arrayList3;
                    }
                }
                i9 = i4 + 1;
                arrayList12 = arrayList;
                z16 = z;
                z17 = z2;
                z11 = z12;
                inputPeer4 = inputPeer;
                longSparseArray8 = longSparseArray;
                clientUserId = j8;
                str2 = str3;
                chat = chat2;
                arrayList19 = arrayList5;
                longSparseArray10 = longSparseArray3;
                j6 = j7;
                TLRPC.Peer peer9 = peer;
                arrayList20 = arrayList6;
                peer4 = peer9;
            }
            return i10;
        }
        long j18 = getMessagesController().getEncryptedChat(Integer.valueOf((int) j)).user_id;
        boolean z26 = (!DialogObject.isUserDialog(j18) || getMessagesController().getUser(Long.valueOf(j18)) == null || (userFull = getMessagesController().getUserFull(j18)) == null) ? true : !userFull.voice_messages_forbidden;
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            MessageObject messageObject7 = arrayList.get(i17);
            if (z26 || !MessageObject.isVoiceMessage(messageObject7.messageOwner)) {
                if (!z26 && MessageObject.isRoundVideoMessage(messageObject7.messageOwner) && i16 == 0) {
                    i16 = 8;
                }
            } else if (i16 == 0) {
                i16 = 7;
            }
        }
        ArrayList<MessageObject> arrayList29 = arrayList;
        if (i16 == 0) {
            int i18 = 0;
            while (i18 < arrayList.size()) {
                processForwardFromMyName(arrayList29.get(i18), j, j2, j3, messageSuggestionParams);
                i18++;
                arrayList29 = arrayList;
            }
        }
        return i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$7(ArrayList arrayList, long j, boolean z, boolean z2, boolean z3, int i, int i2, MessageObject messageObject, int i3, long j2, MessageSuggestionParams messageSuggestionParams, Long l) {
        sendMessage(arrayList, j, z, z2, z3, i, i2, messageObject, i3, l.longValue(), j2, messageSuggestionParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$17(final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, final long j, final int i, final boolean z, final boolean z2, final LongSparseArray longSparseArray, final ArrayList arrayList, final ArrayList arrayList2, final MessageObject messageObject, final TLRPC.Peer peer) {
        getConnectionsManager().sendRequest(tL_messages_forwardMessages, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda17
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendMessage$16(j, i, z, z2, longSparseArray, arrayList, arrayList2, messageObject, peer, tL_messages_forwardMessages, tLObject, tL_error);
            }
        }, 68);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$sendMessage$16(final long j, final int i, boolean z, boolean z2, LongSparseArray longSparseArray, ArrayList arrayList, final ArrayList arrayList2, final MessageObject messageObject, final TLRPC.Peer peer, final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_error tL_error2;
        String str;
        String str2;
        TLRPC.Message message;
        TLRPC.Message message2;
        int i2;
        int i3;
        long j2;
        TLRPC.Updates updates;
        SparseLongArray sparseLongArray;
        int i4;
        final TLRPC.Message message3;
        int indexOf;
        int i5 = i;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        int i6 = -1;
        if (tL_error == null) {
            SparseLongArray sparseLongArray2 = new SparseLongArray();
            TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
            int i7 = 0;
            while (i7 < updates2.updates.size()) {
                TLRPC.Update update = updates2.updates.get(i7);
                if (update instanceof TLRPC.TL_updateMessageID) {
                    TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) update;
                    sparseLongArray2.put(tL_updateMessageID.id, tL_updateMessageID.random_id);
                    updates2.updates.remove(i7);
                    i7--;
                }
                i7++;
            }
            getNotificationCenter().postNotificationNameOnUIThread(NotificationCenter.savedMessagesForwarded, sparseLongArray2);
            Integer num = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(j));
            if (num == null) {
                num = Integer.valueOf(getMessagesStorage().getDialogReadMax(true, j));
                getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(j), num);
            }
            Integer num2 = num;
            int i8 = 0;
            int i9 = 0;
            while (i8 < updates2.updates.size()) {
                TLRPC.Update update2 = updates2.updates.get(i8);
                boolean z3 = update2 instanceof TLRPC.TL_updateNewMessage;
                if (z3 || (update2 instanceof TLRPC.TL_updateNewChannelMessage) || (update2 instanceof TLRPC.TL_updateNewScheduledMessage) || (update2 instanceof TLRPC.TL_updateQuickReplyMessage)) {
                    int i10 = i9;
                    int i11 = i5 != 0 ? 1 : 0;
                    updates2.updates.remove(i8);
                    int i12 = i8 - 1;
                    if (z3) {
                        TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update2;
                        message = tL_updateNewMessage.message;
                        getMessagesController().processNewDifferenceParams(i6, tL_updateNewMessage.pts, i6, tL_updateNewMessage.pts_count);
                    } else if (update2 instanceof TLRPC.TL_updateNewScheduledMessage) {
                        message2 = ((TLRPC.TL_updateNewScheduledMessage) update2).message;
                        i2 = 1;
                        i3 = (z || message2.date == 2147483646) ? i2 : 0;
                        ImageLoader.saveMessageThumbs(message2);
                        if (i3 == 0) {
                            message2.unread = num2.intValue() < message2.id;
                        }
                        if (!z2) {
                            message2.out = true;
                            message2.unread = false;
                            message2.media_unread = false;
                        }
                        j2 = sparseLongArray2.get(message2.id);
                        if (j2 != 0 || (message3 = (TLRPC.Message) longSparseArray.get(j2)) == null || (indexOf = arrayList3.indexOf(message3)) == -1) {
                            updates = updates2;
                            sparseLongArray = sparseLongArray2;
                            i9 = i10;
                            i8 = i12;
                        } else {
                            TLRPC.Updates updates3 = updates2;
                            MessageObject messageObject2 = (MessageObject) arrayList4.get(indexOf);
                            arrayList3.remove(indexOf);
                            arrayList4.remove(indexOf);
                            final int i13 = message3.id;
                            final ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(message2);
                            TLRPC.Message message4 = messageObject2.messageOwner;
                            message4.post_author = message2.post_author;
                            if ((message2.flags & 33554432) != 0) {
                                message4.ttl_period = message2.ttl_period;
                                message4.flags |= 33554432;
                            }
                            updates = updates3;
                            updateMediaPaths(messageObject2, message2, message2.id, null, true);
                            final int mediaExistanceFlags = messageObject2.getMediaExistanceFlags();
                            message3.id = message2.id;
                            int i14 = i10 + 1;
                            if (i11 != i3) {
                                final int i15 = i3;
                                sparseLongArray = sparseLongArray2;
                                final int i16 = i11;
                                final TLRPC.Message message5 = message2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda39
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$sendMessage$10(arrayList5, i15, i13, message3, i16, message5, messageObject, i);
                                    }
                                });
                            } else {
                                sparseLongArray = sparseLongArray2;
                                final TLRPC.Message message6 = message2;
                                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda40
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$sendMessage$12(i, message6, message3, peer, i13, arrayList5, j, mediaExistanceFlags);
                                    }
                                });
                            }
                            i8 = i12;
                            i9 = i14;
                        }
                        i4 = 1;
                    } else if (update2 instanceof TLRPC.TL_updateQuickReplyMessage) {
                        QuickRepliesController.getInstance(this.currentAccount).processUpdate(update2, null, 0);
                        message = ((TLRPC.TL_updateQuickReplyMessage) update2).message;
                    } else {
                        TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TLRPC.TL_updateNewChannelMessage) update2;
                        message = tL_updateNewChannelMessage.message;
                        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, message.peer_id.channel_id);
                    }
                    message2 = message;
                    i2 = 0;
                    if (z) {
                    }
                    ImageLoader.saveMessageThumbs(message2);
                    if (i3 == 0) {
                    }
                    if (!z2) {
                    }
                    j2 = sparseLongArray2.get(message2.id);
                    if (j2 != 0) {
                    }
                    updates = updates2;
                    sparseLongArray = sparseLongArray2;
                    i9 = i10;
                    i8 = i12;
                    i4 = 1;
                } else {
                    updates = updates2;
                    sparseLongArray = sparseLongArray2;
                    i4 = 1;
                }
                i8 += i4;
                i5 = i;
                arrayList3 = arrayList;
                updates2 = updates;
                sparseLongArray2 = sparseLongArray;
                i6 = -1;
                arrayList4 = arrayList2;
            }
            int i17 = i9;
            TLRPC.Updates updates4 = updates2;
            if (!updates4.updates.isEmpty()) {
                getMessagesController().processUpdates(updates4, false);
            }
            getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, i17);
            tL_error2 = tL_error;
        } else {
            tL_error2 = tL_error;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$sendMessage$13(tL_error2, tL_messages_forwardMessages);
                }
            });
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            final TLRPC.Message message7 = (TLRPC.Message) arrayList.get(i18);
            getMessagesStorage().markMessageAsSendError(message7, i != 0 ? 1 : 0);
            if (tL_error2 != null && (str2 = tL_error2.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                StarsController.getInstance(this.currentAccount);
                message7.errorAllowedPriceStars = StarsController.getAllowedPaidStars(tL_messages_forwardMessages);
                message7.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23)) / tL_messages_forwardMessages.id.size();
                getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message7), message7);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda42
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$sendMessage$14(message7, i);
                }
            });
        }
        if (tL_error2 == null || (str = tL_error2.text) == null || !str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$15(arrayList2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$10(final ArrayList arrayList, final int i, final int i2, final TLRPC.Message message, final int i3, final TLRPC.Message message2, final MessageObject messageObject, final int i4) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$9(arrayList, i, i2, message, i3, message2, messageObject, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$9(ArrayList arrayList, final int i, final int i2, final TLRPC.Message message, final int i3, final TLRPC.Message message2, final MessageObject messageObject, final int i4) {
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$8(i2, message, i3, i, message2, messageObject, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$8(int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, MessageObject messageObject, int i4) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        getMessagesController().deleteMessages(arrayList, null, null, message.dialog_id, false, i2, false, 0L, null, 0, i3 == 1, message2.id);
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        arrayList2.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, i3);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, i4 != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$12(final int i, final TLRPC.Message message, final TLRPC.Message message2, TLRPC.Peer peer, final int i2, ArrayList arrayList, final long j, final int i3) {
        int i4 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? i != 0 ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message2.random_id, MessageObject.getPeerId(peer), Integer.valueOf(i2), message2.id, 0, false, i != 0 ? 1 : 0, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i4, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$11(message2, j, i2, message, i3, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$11(TLRPC.Message message, long j, int i, TLRPC.Message message2, int i2, int i3) {
        message.send_state = 0;
        getMediaDataController().increasePeerRaiting(j);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message2.id), message2, Long.valueOf(j), 0L, Integer.valueOf(i2), Boolean.valueOf(i3 != 0));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message2.id), message2, Long.valueOf(j), 0L, Integer.valueOf(i2), Boolean.valueOf(i3 != 0));
        processSentMessage(i);
        removeFromSendingMessages(i, i3 != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$13(TLRPC.TL_error tL_error, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages) {
        AlertsCreator.processError(this.currentAccount, tL_error, null, tL_messages_forwardMessages, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$14(TLRPC.Message message, int i) {
        message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.id));
        processSentMessage(message.id);
        removeFromSendingMessages(message.id, i != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$15(ArrayList arrayList) {
        StarsController.getInstance(this.currentAccount).showPriceChangedToast(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$18(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, ArrayList arrayList, Runnable runnable) {
        if (BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList, runnable)) {
            runnable.run();
        }
    }

    public static int canSendMessageToChat(TLRPC.Chat chat, MessageObject messageObject) {
        boolean canSendStickers = ChatObject.canSendStickers(chat);
        boolean canSendPhoto = ChatObject.canSendPhoto(chat);
        boolean canSendVideo = ChatObject.canSendVideo(chat);
        boolean canSendDocument = ChatObject.canSendDocument(chat);
        ChatObject.canSendEmbed(chat);
        boolean canSendPolls = ChatObject.canSendPolls(chat);
        boolean canSendRoundVideo = ChatObject.canSendRoundVideo(chat);
        boolean canSendVoice = ChatObject.canSendVoice(chat);
        boolean canSendMusic = ChatObject.canSendMusic(chat);
        boolean z = messageObject.isSticker() || messageObject.isAnimatedSticker() || messageObject.isGif() || messageObject.isGame();
        if (!canSendStickers && z) {
            return ChatObject.isActionBannedByDefault(chat, 8) ? 4 : 1;
        }
        if (!canSendPhoto && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(chat, 16) ? 10 : 12;
        }
        if (!canSendMusic && messageObject.isMusic()) {
            return ChatObject.isActionBannedByDefault(chat, 18) ? 19 : 20;
        }
        if (!canSendVideo && messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(chat, 17) ? 9 : 11;
        }
        if (!canSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
            return ChatObject.isActionBannedByDefault(chat, 10) ? 6 : 3;
        }
        if (!canSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaToDo)) {
            return ChatObject.isActionBannedByDefault(chat, 10) ? 21 : 22;
        }
        if (!canSendVoice && MessageObject.isVoiceMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(chat, 20) ? 13 : 14;
        }
        if (!canSendRoundVideo && MessageObject.isRoundVideoMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(chat, 21) ? 15 : 16;
        }
        if (canSendDocument || !(messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaDocument) || z) {
            return 0;
        }
        return ChatObject.isActionBannedByDefault(chat, 19) ? 17 : 18;
    }

    private void writePreviousMessageData(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str2 = message.attachPath;
        serializedData.writeString(str2 != null ? str2 : "");
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            message.entities.get(i).serializeToStream(serializedData);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x05b1, code lost:
    
        if (r4 == 19) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0462, code lost:
    
        if (r7.muted == false) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05ab A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05d1 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05e5 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0604 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0613 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x065b A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0660 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05da A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0161 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0170 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029e A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030b A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:9:0x0024, B:11:0x002e, B:13:0x0040, B:19:0x0057, B:22:0x0061, B:25:0x0066, B:27:0x006a, B:28:0x0097, B:31:0x009d, B:33:0x00a3, B:34:0x00aa, B:35:0x01c4, B:37:0x01c8, B:38:0x01cc, B:43:0x01e4, B:48:0x01ed, B:50:0x01f1, B:52:0x01ff, B:54:0x0203, B:55:0x0218, B:57:0x021c, B:59:0x0222, B:60:0x020c, B:62:0x0212, B:63:0x0228, B:65:0x022c, B:66:0x0268, B:67:0x026b, B:69:0x029e, B:71:0x02a6, B:74:0x02ab, B:75:0x02b2, B:76:0x02b5, B:78:0x02e3, B:80:0x02eb, B:88:0x030b, B:90:0x030f, B:92:0x0313, B:95:0x032d, B:97:0x0331, B:100:0x05a7, B:102:0x05ab, B:107:0x05b4, B:109:0x05d1, B:110:0x05e1, B:112:0x05e5, B:114:0x05f5, B:115:0x05fd, B:117:0x0604, B:118:0x060f, B:120:0x0613, B:122:0x0629, B:124:0x0655, B:125:0x0631, B:127:0x0645, B:129:0x064b, B:131:0x065b, B:134:0x0660, B:141:0x0680, B:143:0x0695, B:150:0x06a2, B:152:0x06b9, B:156:0x06c1, B:163:0x06e0, B:165:0x06f6, B:172:0x0703, B:174:0x0719, B:178:0x0721, B:181:0x05da, B:183:0x05de, B:186:0x0319, B:188:0x031d, B:191:0x0352, B:193:0x035b, B:195:0x0363, B:197:0x0374, B:199:0x038b, B:200:0x0394, B:203:0x03c4, B:205:0x03da, B:207:0x03e0, B:209:0x03e6, B:212:0x03e9, B:213:0x03a1, B:215:0x03bb, B:216:0x03c0, B:219:0x040a, B:221:0x0413, B:223:0x041d, B:225:0x042e, B:227:0x043f, B:229:0x044e, B:232:0x045e, B:235:0x046b, B:237:0x0471, B:239:0x047a, B:242:0x04b0, B:244:0x04c8, B:246:0x04d5, B:247:0x04d9, B:249:0x04e3, B:251:0x04fb, B:253:0x04f2, B:255:0x04f6, B:256:0x0489, B:258:0x04a7, B:259:0x04ac, B:265:0x050e, B:268:0x054e, B:271:0x0564, B:274:0x056b, B:276:0x0578, B:278:0x057d, B:279:0x052a, B:281:0x0545, B:282:0x054a, B:285:0x058c, B:287:0x0596, B:296:0x0237, B:298:0x024b, B:300:0x0251, B:301:0x025a, B:303:0x0262, B:306:0x01d9, B:308:0x01e1, B:310:0x0072, B:312:0x0076, B:317:0x0086, B:319:0x0089, B:324:0x00b9, B:326:0x00cb, B:327:0x00d0, B:329:0x00fa, B:331:0x010d, B:333:0x0113, B:335:0x0119, B:337:0x01b2, B:338:0x011c, B:340:0x0142, B:346:0x0161, B:347:0x016a, B:349:0x0170, B:351:0x0182, B:353:0x01a6), top: B:8:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void editMessage(MessageObject messageObject, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str, TLRPC.PhotoSize photoSize, HashMap<String, String> hashMap, boolean z, boolean z2, Object obj) {
        long j;
        char c;
        Object obj2;
        String str2;
        char c2;
        HashMap<String, String> hashMap2;
        VideoEditedInfo videoEditedInfo2;
        TLRPC.TL_document tL_document2;
        boolean z3;
        VideoEditedInfo videoEditedInfo3;
        long j2;
        HashMap<String, String> hashMap3;
        char c3;
        Object obj3;
        TLRPC.InputMedia inputMedia;
        boolean z4;
        DelayedMessage delayedMessage;
        VideoEditedInfo videoEditedInfo4;
        char c4;
        VideoEditedInfo videoEditedInfo5;
        TLRPC.InputMedia inputMedia2;
        boolean z5;
        boolean z6;
        TLRPC.InputMedia inputMedia3;
        TLRPC.InputMedia inputMedia4;
        boolean z7;
        String str3;
        TLRPC.InputMedia inputMedia5;
        boolean z8;
        TLRPC.InputMedia inputMedia6;
        TLRPC.Message message;
        CharSequence charSequence;
        TLRPC.InputMedia inputMedia7;
        TLRPC.InputMedia inputMedia8;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        TLRPC.TL_document tL_document3 = tL_document;
        if (messageObject == null) {
            return;
        }
        HashMap<String, String> hashMap4 = hashMap == null ? new HashMap<>() : hashMap;
        TLRPC.Message message2 = messageObject.messageOwner;
        messageObject.cancelEditing = false;
        try {
            long dialogId = messageObject.getDialogId();
            boolean z9 = !DialogObject.isEncryptedDialog(dialogId) || ((encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialogId)))) != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101);
            if (z) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                        tL_photo2 = (TLRPC.TL_photo) messageMedia.photo;
                        videoEditedInfo2 = videoEditedInfo;
                        c2 = 2;
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        tL_document3 = (TLRPC.TL_document) messageMedia.document;
                        if (!MessageObject.isVideoDocument(tL_document3) && videoEditedInfo == null) {
                            c2 = 7;
                            videoEditedInfo2 = messageObject.videoEditedInfo;
                        }
                        c2 = 3;
                        videoEditedInfo2 = messageObject.videoEditedInfo;
                    } else {
                        videoEditedInfo2 = videoEditedInfo;
                        c2 = messageMedia instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 65535;
                    }
                    HashMap<String, String> hashMap5 = message2.params;
                    obj2 = (obj == null || hashMap5 == null || !hashMap5.containsKey("parentObject")) ? obj : hashMap5.get("parentObject");
                    messageObject.editingMessage = message2.message;
                    messageObject.editingMessageEntities = message2.entities;
                    str2 = message2.attachPath;
                    j = dialogId;
                    hashMap2 = hashMap5;
                }
                videoEditedInfo2 = videoEditedInfo;
                c2 = 1;
                HashMap<String, String> hashMap52 = message2.params;
                if (obj == null) {
                }
                messageObject.editingMessage = message2.message;
                messageObject.editingMessageEntities = message2.entities;
                str2 = message2.attachPath;
                j = dialogId;
                hashMap2 = hashMap52;
            } else {
                TLRPC.MessageMedia messageMedia2 = message2.media;
                messageObject.previousMedia = messageMedia2;
                messageObject.previousMessage = message2.message;
                messageObject.previousMessageEntities = message2.entities;
                messageObject.previousAttachPath = message2.attachPath;
                if (messageMedia2 == null) {
                    new TLRPC.TL_messageMediaEmpty();
                }
                SerializedData serializedData = new SerializedData(true);
                writePreviousMessageData(message2, serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.length());
                writePreviousMessageData(message2, serializedData2);
                j = dialogId;
                hashMap4.put("prevMedia", Base64.encodeToString(serializedData2.toByteArray(), 0));
                serializedData2.cleanup();
                if (tL_photo2 != null) {
                    TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                    message2.media = tL_messageMediaPhoto;
                    tL_messageMediaPhoto.flags |= 3;
                    tL_messageMediaPhoto.photo = tL_photo2;
                    tL_messageMediaPhoto.spoiler = z2;
                    if (str != null && str.length() > 0 && str.startsWith("http")) {
                        message2.attachPath = str;
                    } else {
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_photo2.sizes;
                        message2.attachPath = FileLoader.getInstance(this.currentAccount).getPathToAttach(arrayList.get(arrayList.size() - 1).location, true).toString();
                    }
                    c = 2;
                } else if (tL_document3 != null) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    message2.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_document3;
                    tL_messageMediaDocument.spoiler = z2;
                    if (!MessageObject.isVideoDocument(tL_document) && videoEditedInfo == null) {
                        c = 7;
                        if (videoEditedInfo != null) {
                            hashMap4.put("ve", videoEditedInfo.getString());
                        }
                        message2.attachPath = str;
                        if (!(photoSize instanceof ImageLoader.PhotoSizeFromPhoto)) {
                            TLRPC.MessageMedia messageMedia3 = message2.media;
                            messageMedia3.flags |= 512;
                            messageMedia3.video_cover = ((ImageLoader.PhotoSizeFromPhoto) photoSize).photo;
                        } else if (photoSize != null) {
                            TLRPC.TL_photo tL_photo3 = new TLRPC.TL_photo();
                            tL_photo3.date = getConnectionsManager().getCurrentTime();
                            tL_photo3.sizes.add(photoSize);
                            tL_photo3.file_reference = new byte[0];
                            TLRPC.MessageMedia messageMedia4 = message2.media;
                            messageMedia4.video_cover = tL_photo3;
                            messageMedia4.flags |= 512;
                        }
                    }
                    c = 3;
                    if (videoEditedInfo != null) {
                    }
                    message2.attachPath = str;
                    if (!(photoSize instanceof ImageLoader.PhotoSizeFromPhoto)) {
                    }
                } else {
                    c = messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaToDo ? '\n' : (char) 1;
                }
                message2.params = hashMap4;
                message2.send_state = 3;
                message2.errorNewPriceStars = 0L;
                message2.errorAllowedPriceStars = 0L;
                obj2 = obj;
                str2 = str;
                c2 = c;
                hashMap2 = hashMap4;
                videoEditedInfo2 = videoEditedInfo;
            }
            if (message2.attachPath == null) {
                message2.attachPath = "";
            }
            message2.local_id = 0;
            int i = messageObject.type;
            if ((i == 3 || videoEditedInfo2 != null || i == 2) && !TextUtils.isEmpty(message2.attachPath)) {
                messageObject.attachPathExists = true;
            }
            VideoEditedInfo videoEditedInfo6 = messageObject.videoEditedInfo;
            if (videoEditedInfo6 != null && videoEditedInfo2 == null) {
                videoEditedInfo2 = videoEditedInfo6;
            }
            if (z) {
                tL_document2 = tL_document3;
                z3 = z9;
                videoEditedInfo3 = videoEditedInfo2;
            } else {
                CharSequence charSequence2 = messageObject.editingMessage;
                if (charSequence2 != null) {
                    String str4 = message2.message;
                    String charSequence3 = charSequence2.toString();
                    message2.message = charSequence3;
                    messageObject.caption = null;
                    if (c2 == 1) {
                        ArrayList<TLRPC.MessageEntity> arrayList2 = messageObject.editingMessageEntities;
                        if (arrayList2 != null) {
                            message2.entities = arrayList2;
                            message2.flags |= 128;
                        } else if (!TextUtils.equals(str4, charSequence3)) {
                            message2.flags &= -129;
                        }
                        TLRPC.Message message3 = messageObject.messageOwner;
                        if (message3 != null && (message3.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            messageObject.generateCaption();
                        }
                    } else {
                        ArrayList<TLRPC.MessageEntity> arrayList3 = messageObject.editingMessageEntities;
                        if (arrayList3 != null) {
                            message2.entities = arrayList3;
                            message2.flags |= 128;
                            videoEditedInfo3 = videoEditedInfo2;
                        } else {
                            videoEditedInfo3 = videoEditedInfo2;
                            ArrayList<TLRPC.MessageEntity> entities = getMediaDataController().getEntities(new CharSequence[]{messageObject.editingMessage}, z9);
                            if (entities != null && !entities.isEmpty()) {
                                message2.entities = entities;
                                message2.flags |= 128;
                            } else if (!TextUtils.equals(str4, message2.message)) {
                                message2.flags &= -129;
                            }
                        }
                        messageObject.generateCaption();
                        ArrayList<TLRPC.Message> arrayList4 = new ArrayList<>();
                        arrayList4.add(message2);
                        getMessagesStorage().putMessages(arrayList4, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
                        getMessagesController().getTopicsController().processEditedMessage(message2);
                        messageObject.type = -1;
                        messageObject.setType();
                        if (c2 == 1) {
                            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
                            if (!(messageMedia5 instanceof TLRPC.TL_messageMediaPhoto) && !(messageMedia5 instanceof TLRPC.TL_messageMediaDocument)) {
                                messageObject.resetLayout();
                                messageObject.checkLayout();
                            }
                            messageObject.generateCaption();
                        }
                        messageObject.createMessageSendInfo();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(messageObject);
                        tL_document2 = tL_document3;
                        z3 = z9;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList5);
                    }
                }
                videoEditedInfo3 = videoEditedInfo2;
                ArrayList<TLRPC.Message> arrayList42 = new ArrayList<>();
                arrayList42.add(message2);
                getMessagesStorage().putMessages(arrayList42, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
                getMessagesController().getTopicsController().processEditedMessage(message2);
                messageObject.type = -1;
                messageObject.setType();
                if (c2 == 1) {
                }
                messageObject.createMessageSendInfo();
                ArrayList arrayList52 = new ArrayList();
                arrayList52.add(messageObject);
                tL_document2 = tL_document3;
                z3 = z9;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList52);
            }
            String str5 = (hashMap2 == null || !hashMap2.containsKey("originalPath")) ? null : hashMap2.get("originalPath");
            if (c2 >= 1) {
                if (c2 > 3) {
                }
                if (c2 != 1) {
                    TLRPC.MessageMedia messageMedia6 = message2.media;
                    if ((messageMedia6 == null || (messageMedia6 instanceof TLRPC.TL_messageMediaEmpty) || (messageMedia6.webpage instanceof TLRPC.TL_webPageEmpty)) && !messageObject.editingMessageSearchWebPage) {
                        inputMedia8 = new TLRPC.TL_inputMediaEmpty();
                    } else if (messageMedia6 == null || messageMedia6.webpage == null) {
                        c3 = c2;
                        hashMap3 = hashMap2;
                        j2 = j;
                        delayedMessage = null;
                        z6 = false;
                        z4 = false;
                        inputMedia5 = null;
                    } else {
                        TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                        TLRPC.MessageMedia messageMedia7 = message2.media;
                        tL_inputMediaWebPage.url = messageMedia7.webpage.url;
                        tL_inputMediaWebPage.force_small_media = messageMedia7.force_small_media;
                        tL_inputMediaWebPage.force_large_media = messageMedia7.force_large_media;
                        inputMedia8 = tL_inputMediaWebPage;
                    }
                    c3 = c2;
                    hashMap3 = hashMap2;
                    j2 = j;
                    inputMedia7 = inputMedia8;
                    delayedMessage = null;
                    z6 = false;
                    z4 = false;
                    inputMedia5 = inputMedia7;
                } else {
                    if (c2 == 2) {
                        TLRPC.InputMedia tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                        tL_inputMediaUploadedPhoto.spoiler = z2;
                        if (hashMap2 != null && (str3 = hashMap2.get("masks")) != null) {
                            SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(str3));
                            boolean z10 = false;
                            int readInt32 = serializedData3.readInt32(false);
                            int i2 = 0;
                            while (i2 < readInt32) {
                                tL_inputMediaUploadedPhoto.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData3, serializedData3.readInt32(z10), z10));
                                i2++;
                                readInt32 = readInt32;
                                z10 = false;
                            }
                            tL_inputMediaUploadedPhoto.flags |= 1;
                            serializedData3.cleanup();
                        }
                        HashMap<String, String> hashMap6 = hashMap2;
                        if (tL_photo2.access_hash == 0) {
                            inputMedia4 = tL_inputMediaUploadedPhoto;
                            z7 = true;
                        } else {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputMediaPhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = tL_photo2.id;
                            tL_inputPhoto.access_hash = tL_photo2.access_hash;
                            byte[] bArr = tL_photo2.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            tL_inputMediaPhoto.spoiler = z2;
                            inputMedia4 = tL_inputMediaPhoto;
                            z7 = false;
                        }
                        j2 = j;
                        DelayedMessage delayedMessage2 = new DelayedMessage(j2);
                        delayedMessage2.type = 0;
                        delayedMessage2.obj = messageObject;
                        delayedMessage2.originalPath = str5;
                        delayedMessage2.parentObject = obj2;
                        delayedMessage2.inputUploadMedia = tL_inputMediaUploadedPhoto;
                        delayedMessage2.performMediaUpload = z7;
                        if (str2 != null && str2.length() > 0 && str2.startsWith("http")) {
                            delayedMessage2.httpLocation = str2;
                        } else {
                            ArrayList<TLRPC.PhotoSize> arrayList6 = tL_photo2.sizes;
                            delayedMessage2.photoSize = arrayList6.get(arrayList6.size() - 1);
                            delayedMessage2.locationParent = tL_photo2;
                        }
                        hashMap3 = hashMap6;
                        c3 = c2;
                        delayedMessage = delayedMessage2;
                        z4 = z7;
                        inputMedia3 = inputMedia4;
                    } else {
                        HashMap<String, String> hashMap7 = hashMap2;
                        j2 = j;
                        if (c2 == 3) {
                            TLRPC.InputMedia tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                            tL_inputMediaUploadedDocument.spoiler = z2;
                            if (hashMap7 != null) {
                                hashMap3 = hashMap7;
                                String str6 = hashMap3.get("masks");
                                if (str6 != null) {
                                    SerializedData serializedData4 = new SerializedData(Utilities.hexToBytes(str6));
                                    boolean z11 = false;
                                    int readInt322 = serializedData4.readInt32(false);
                                    int i3 = 0;
                                    while (i3 < readInt322) {
                                        tL_inputMediaUploadedDocument.stickers.add(TLRPC.InputDocument.TLdeserialize(serializedData4, serializedData4.readInt32(z11), z11));
                                        i3++;
                                        z11 = false;
                                    }
                                    tL_inputMediaUploadedDocument.flags |= 1;
                                    serializedData4.cleanup();
                                }
                            } else {
                                hashMap3 = hashMap7;
                            }
                            TLRPC.TL_document tL_document4 = tL_document2;
                            tL_inputMediaUploadedDocument.mime_type = tL_document4.mime_type;
                            tL_inputMediaUploadedDocument.attributes = tL_document4.attributes;
                            if (messageObject.isGif()) {
                                videoEditedInfo4 = videoEditedInfo3;
                            } else {
                                if (videoEditedInfo3 != null) {
                                    videoEditedInfo4 = videoEditedInfo3;
                                } else {
                                    videoEditedInfo4 = videoEditedInfo3;
                                }
                                tL_inputMediaUploadedDocument.nosound_video = true;
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("nosound_video = true");
                                }
                            }
                            char c5 = c2;
                            if (tL_document4.access_hash == 0) {
                                inputMedia2 = tL_inputMediaUploadedDocument;
                                c4 = c5;
                                videoEditedInfo5 = videoEditedInfo4;
                                z4 = true;
                            } else {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_inputMediaDocument.id = tL_inputDocument;
                                c4 = c5;
                                videoEditedInfo5 = videoEditedInfo4;
                                tL_inputDocument.id = tL_document4.id;
                                tL_inputDocument.access_hash = tL_document4.access_hash;
                                byte[] bArr2 = tL_document4.file_reference;
                                tL_inputDocument.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument.file_reference = new byte[0];
                                }
                                tL_inputMediaDocument.spoiler = z2;
                                inputMedia2 = tL_inputMediaDocument;
                                z4 = false;
                            }
                            DelayedMessage delayedMessage3 = new DelayedMessage(j2);
                            delayedMessage3.type = 1;
                            delayedMessage3.obj = messageObject;
                            delayedMessage3.originalPath = str5;
                            delayedMessage3.parentObject = obj2;
                            delayedMessage3.inputUploadMedia = tL_inputMediaUploadedDocument;
                            if (!tL_document4.thumbs.isEmpty()) {
                                TLRPC.PhotoSize photoSize2 = tL_document4.thumbs.get(0);
                                if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                                    delayedMessage3.photoSize = photoSize2;
                                    delayedMessage3.locationParent = tL_document4;
                                }
                            }
                            delayedMessage3.videoEditedInfo = videoEditedInfo5;
                            if (photoSize instanceof ImageLoader.PhotoSizeFromPhoto) {
                                tL_inputMediaUploadedDocument.video_cover = ((ImageLoader.PhotoSizeFromPhoto) photoSize).inputPhoto;
                                tL_inputMediaUploadedDocument.flags |= 64;
                            } else if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                delayedMessage3.coverPhotoSize = photoSize;
                                z5 = true;
                                delayedMessage3.performMediaUpload = z4;
                                delayedMessage3.performCoverUpload = z5;
                                c3 = c4;
                                z6 = z5;
                                delayedMessage = delayedMessage3;
                                inputMedia5 = inputMedia2;
                            }
                            z5 = false;
                            delayedMessage3.performMediaUpload = z4;
                            delayedMessage3.performCoverUpload = z5;
                            c3 = c4;
                            z6 = z5;
                            delayedMessage = delayedMessage3;
                            inputMedia5 = inputMedia2;
                        } else {
                            VideoEditedInfo videoEditedInfo7 = videoEditedInfo3;
                            hashMap3 = hashMap7;
                            TLRPC.TL_document tL_document5 = tL_document2;
                            if (c2 == 7) {
                                TLRPC.InputMedia tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                                tL_inputMediaUploadedDocument2.mime_type = tL_document5.mime_type;
                                tL_inputMediaUploadedDocument2.attributes = tL_document5.attributes;
                                tL_inputMediaUploadedDocument2.spoiler = z2;
                                char c6 = c2;
                                if (tL_document5.access_hash == 0) {
                                    inputMedia = tL_inputMediaUploadedDocument2;
                                    obj3 = obj2;
                                    z4 = true;
                                } else {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                                    TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                    tL_inputMediaDocument2.id = tL_inputDocument2;
                                    obj3 = obj2;
                                    tL_inputDocument2.id = tL_document5.id;
                                    tL_inputDocument2.access_hash = tL_document5.access_hash;
                                    byte[] bArr3 = tL_document5.file_reference;
                                    tL_inputDocument2.file_reference = bArr3;
                                    if (bArr3 == null) {
                                        tL_inputDocument2.file_reference = new byte[0];
                                    }
                                    tL_inputMediaDocument2.spoiler = z2;
                                    inputMedia = tL_inputMediaDocument2;
                                    z4 = false;
                                }
                                DelayedMessage delayedMessage4 = new DelayedMessage(j2);
                                delayedMessage4.originalPath = str5;
                                delayedMessage4.type = 2;
                                delayedMessage4.obj = messageObject;
                                if (!tL_document5.thumbs.isEmpty()) {
                                    if (videoEditedInfo7 != null) {
                                        if (!videoEditedInfo7.isSticker) {
                                        }
                                    }
                                    TLRPC.PhotoSize photoSize3 = tL_document5.thumbs.get(0);
                                    if (!(photoSize3 instanceof TLRPC.TL_photoStrippedSize)) {
                                        delayedMessage4.photoSize = photoSize3;
                                        delayedMessage4.locationParent = tL_document5;
                                    }
                                }
                                obj2 = obj3;
                                delayedMessage4.parentObject = obj2;
                                delayedMessage4.inputUploadMedia = tL_inputMediaUploadedDocument2;
                                delayedMessage4.performMediaUpload = z4;
                                delayedMessage = delayedMessage4;
                                c3 = c6;
                                inputMedia3 = inputMedia;
                            } else {
                                c3 = c2;
                                if (c3 == '\n') {
                                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
                                    if (media instanceof TLRPC.TL_messageMediaToDo) {
                                        TLRPC.TL_inputMediaTodo tL_inputMediaTodo = new TLRPC.TL_inputMediaTodo();
                                        tL_inputMediaTodo.todo = ((TLRPC.TL_messageMediaToDo) media).todo;
                                        inputMedia7 = tL_inputMediaTodo;
                                        delayedMessage = null;
                                        z6 = false;
                                        z4 = false;
                                        inputMedia5 = inputMedia7;
                                    }
                                }
                                delayedMessage = null;
                                z6 = false;
                                z4 = false;
                                inputMedia5 = null;
                            }
                        }
                    }
                    z6 = false;
                    inputMedia5 = inputMedia3;
                }
                z8 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
                inputMedia6 = inputMedia5;
                if (z8) {
                    int i4 = messageObject.type;
                    if (i4 != 0) {
                        inputMedia6 = inputMedia5;
                    }
                    inputMedia6 = null;
                }
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.id = messageObject.getId();
                tL_messages_editMessage.peer = getMessagesController().getInputPeer(j2);
                message = messageObject.messageOwner;
                tL_messages_editMessage.invert_media = message.invert_media;
                if (inputMedia6 == null) {
                    tL_messages_editMessage.flags |= 16384;
                    tL_messages_editMessage.media = inputMedia6;
                } else if (!messageObject.editingMessageSearchWebPage) {
                    tL_messages_editMessage.no_webpage = true;
                }
                if (messageObject.scheduled) {
                    tL_messages_editMessage.schedule_date = message.date;
                    int i5 = tL_messages_editMessage.flags;
                    tL_messages_editMessage.flags = 32768 | i5;
                    int i6 = message.schedule_repeat_period;
                    if (i6 != 0) {
                        tL_messages_editMessage.schedule_repeat_period = i6;
                        tL_messages_editMessage.flags = i5 | 294912;
                    }
                }
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                    tL_messages_editMessage.flags |= 131072;
                }
                charSequence = messageObject.editingMessage;
                if (charSequence != null) {
                    tL_messages_editMessage.message = charSequence.toString();
                    int i7 = tL_messages_editMessage.flags;
                    tL_messages_editMessage.flags = i7 | 2048;
                    tL_messages_editMessage.no_webpage = !messageObject.editingMessageSearchWebPage;
                    ArrayList<TLRPC.MessageEntity> arrayList7 = messageObject.editingMessageEntities;
                    if (arrayList7 != null) {
                        tL_messages_editMessage.entities = arrayList7;
                        tL_messages_editMessage.flags = i7 | 2056;
                    } else {
                        ArrayList<TLRPC.MessageEntity> entities2 = getMediaDataController().getEntities(new CharSequence[]{messageObject.editingMessage}, z3);
                        if (entities2 != null && !entities2.isEmpty()) {
                            tL_messages_editMessage.entities = entities2;
                            tL_messages_editMessage.flags |= 8;
                        }
                    }
                    messageObject.editingMessage = null;
                    messageObject.editingMessageEntities = null;
                }
                if (delayedMessage != null) {
                    delayedMessage.sendRequest = tL_messages_editMessage;
                }
                if (c3 != 1) {
                    performSendMessageRequest(tL_messages_editMessage, messageObject, null, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                    return;
                }
                if (c3 == 2) {
                    if (!z4 && !z6) {
                        lambda$performSendMessageRequest$66(tL_messages_editMessage, messageObject, str5, null, true, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                        return;
                    }
                    performSendDelayedMessage(delayedMessage);
                    return;
                }
                if (c3 == 3) {
                    if (!z4 && !z6) {
                        performSendMessageRequest(tL_messages_editMessage, messageObject, str5, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                        return;
                    }
                    performSendDelayedMessage(delayedMessage);
                    return;
                }
                if (c3 == 6) {
                    performSendMessageRequest(tL_messages_editMessage, messageObject, str5, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                    return;
                }
                if (c3 == 7) {
                    if (!z4 && !z6) {
                        performSendMessageRequest(tL_messages_editMessage, messageObject, str5, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                        return;
                    }
                    performSendDelayedMessage(delayedMessage);
                    return;
                }
                if (c3 != '\b') {
                    if (c3 == '\n') {
                        performSendMessageRequest(tL_messages_editMessage, messageObject, str5, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                        return;
                    }
                    return;
                } else {
                    if (!z4 && !z6) {
                        performSendMessageRequest(tL_messages_editMessage, messageObject, str5, delayedMessage, obj2, hashMap3, messageObject.scheduled);
                        return;
                    }
                    performSendDelayedMessage(delayedMessage);
                    return;
                }
            }
            if ((c2 < 5 || c2 > '\b') && c2 != '\n') {
                return;
            }
            if (c2 != 1) {
            }
            z8 = inputMedia5 instanceof TLRPC.TL_inputMediaEmpty;
            inputMedia6 = inputMedia5;
            if (z8) {
            }
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage2.id = messageObject.getId();
            tL_messages_editMessage2.peer = getMessagesController().getInputPeer(j2);
            message = messageObject.messageOwner;
            tL_messages_editMessage2.invert_media = message.invert_media;
            if (inputMedia6 == null) {
            }
            if (messageObject.scheduled) {
            }
            if ((message.flags & TLObject.FLAG_30) != 0) {
            }
            charSequence = messageObject.editingMessage;
            if (charSequence != null) {
            }
            if (delayedMessage != null) {
            }
            if (c3 != 1) {
            }
        } catch (Exception e) {
            FileLog.e(e);
            revertEditingMessageObject(messageObject);
        }
    }

    public int editMessage(MessageObject messageObject, String str, boolean z, final BaseFragment baseFragment, ArrayList<TLRPC.MessageEntity> arrayList, int i, int i2) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return 0;
        }
        final TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        tL_messages_editMessage.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (str != null) {
            tL_messages_editMessage.message = str;
            tL_messages_editMessage.flags |= 2048;
            tL_messages_editMessage.no_webpage = !z;
        }
        tL_messages_editMessage.id = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (message.flags & TLObject.FLAG_30) != 0) {
            tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage.flags |= 131072;
        }
        if (arrayList != null) {
            tL_messages_editMessage.entities = arrayList;
            tL_messages_editMessage.flags |= 8;
        }
        if (i != 0) {
            tL_messages_editMessage.schedule_date = i;
            int i3 = tL_messages_editMessage.flags;
            tL_messages_editMessage.flags = 32768 | i3;
            if (i2 != 0) {
                tL_messages_editMessage.schedule_repeat_period = i2;
                tL_messages_editMessage.flags = i3 | 294912;
            }
        }
        return getConnectionsManager().sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda46
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$editMessage$20(baseFragment, tL_messages_editMessage, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$editMessage$20(final BaseFragment baseFragment, final TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$editMessage$19(tL_error, baseFragment, tL_messages_editMessage);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$editMessage$19(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_editMessage, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLocation(Location location) {
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
        Iterator<Map.Entry<String, MessageObject>> it = this.waitingForLocation.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject value = it.next().getValue();
            sendMessage(SendMessageParams.of((TLRPC.MessageMedia) tL_messageMediaGeo, value.getDialogId(), value, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    public void sendCurrentLocation(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        if (messageObject == null || keyboardButton == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(keyboardButton.data));
        sb.append("_");
        sb.append(keyboardButton instanceof TLRPC.TL_keyboardButtonGame ? "1" : "0");
        this.waitingForLocation.put(sb.toString(), messageObject);
        this.locationProvider.start();
    }

    public boolean isSendingCurrentLocation(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        if (messageObject == null || keyboardButton == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(keyboardButton.data));
        sb.append("_");
        sb.append(keyboardButton instanceof TLRPC.TL_keyboardButtonGame ? "1" : "0");
        return this.waitingForLocation.containsKey(sb.toString());
    }

    public void sendNotificationCallback(final long j, final int i, final byte[] bArr) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendNotificationCallback$23(j, i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendNotificationCallback$23(long j, int i, byte[] bArr) {
        TLRPC.Chat chatSync;
        TLRPC.User userSync;
        final String str = j + "_" + i + "_" + Utilities.bytesToHex(bArr) + "_0";
        this.waitingForCallback.put(str, Boolean.TRUE);
        final List<String> list = this.waitingForCallbackMap.get(j + "_" + i);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.waitingForCallbackMap.put(j + "_" + i, arrayList);
            list = arrayList;
        }
        list.add(str);
        if (DialogObject.isUserDialog(j)) {
            if (getMessagesController().getUser(Long.valueOf(j)) == null && (userSync = getMessagesStorage().getUserSync(j)) != null) {
                getMessagesController().putUser(userSync, true);
            }
        } else {
            long j2 = -j;
            if (getMessagesController().getChat(Long.valueOf(j2)) == null && (chatSync = getMessagesStorage().getChatSync(j2)) != null) {
                getMessagesController().putChat(chatSync, true);
            }
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().getInputPeer(j);
        tL_messages_getBotCallbackAnswer.msg_id = i;
        tL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = bArr;
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda32
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendNotificationCallback$22(str, list, tLObject, tL_error);
            }
        }, 2);
        getMessagesController().markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendNotificationCallback$22(final String str, final List list, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda76
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendNotificationCallback$21(str, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendNotificationCallback$21(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void onMessageEdited(TLRPC.Message message) {
        if (message == null || message.reply_markup == null) {
            return;
        }
        List<String> remove = this.waitingForCallbackMap.remove(message.dialog_id + "_" + message.id);
        if (remove != null) {
            Iterator<String> it = remove.iterator();
            while (it.hasNext()) {
                this.waitingForCallback.remove(it.next());
            }
        }
    }

    public byte[] isSendingVote(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        return this.waitingForVote.get("poll_" + messageObject.getPollId());
    }

    public int sendVote(final MessageObject messageObject, ArrayList<TLRPC.PollAnswer> arrayList, final Runnable runnable) {
        byte[] bArr;
        if (messageObject == null) {
            return 0;
        }
        final String str = "poll_" + messageObject.getPollId();
        if (this.waitingForCallback.containsKey(str)) {
            return 0;
        }
        TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
        tL_messages_sendVote.msg_id = messageObject.getId();
        tL_messages_sendVote.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (arrayList != null) {
            bArr = new byte[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i);
                if (pollAnswer != null) {
                    tL_messages_sendVote.options.add(pollAnswer.option);
                    bArr[i] = pollAnswer.option[0];
                }
            }
        } else {
            bArr = new byte[0];
        }
        this.waitingForVote.put(str, bArr);
        return getConnectionsManager().sendRequest(tL_messages_sendVote, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendVote$25(messageObject, str, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendVote$25(MessageObject messageObject, final String str, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.voteSendTime.put(messageObject.getPollId(), 0L);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            this.voteSendTime.put(messageObject.getPollId(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendVote$24(str, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendVote$24(String str, Runnable runnable) {
        this.waitingForVote.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    public Boolean getSendingTodoValue(MessageObject messageObject, TLRPC.TodoItem todoItem) {
        return this.waitingForTodoUpdate.get(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.id))));
    }

    public int toggleTodo(final long j, final MessageObject messageObject, final TLRPC.TodoItem todoItem, final boolean z, final Runnable runnable) {
        if (messageObject == null) {
            return 0;
        }
        final int hash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.id));
        this.waitingForTodoUpdate.put(Integer.valueOf(hash), Boolean.valueOf(z));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.getId();
        tL_messages_toggleTodoCompleted.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (z) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        return getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda78
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$toggleTodo$27(messageObject, todoItem, z, j, hash, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleTodo$27(MessageObject messageObject, TLRPC.TodoItem todoItem, final boolean z, long j, final int i, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesStorage().toggleTodo(messageObject.getDialogId(), messageObject.getId(), todoItem.id, z, j);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$toggleTodo$26(i, z, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleTodo$26(int i, boolean z, Runnable runnable) {
        Boolean bool = this.waitingForTodoUpdate.get(Integer.valueOf(i));
        if (bool != null && bool.booleanValue() == z) {
            this.waitingForTodoUpdate.remove(Integer.valueOf(i));
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    protected long getVoteSendTime(long j) {
        return ((Long) this.voteSendTime.get(j, 0L)).longValue();
    }

    public void sendReaction(MessageObject messageObject, ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2, BaseFragment baseFragment, final Runnable runnable) {
        if (messageObject == null || baseFragment == null) {
            return;
        }
        TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.isThreadMessage && message.fwd_from != null) {
            tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getFromChatId());
            tL_messages_sendReaction.msg_id = messageObject.messageOwner.fwd_from.saved_from_msg_id;
        } else {
            tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_sendReaction.msg_id = messageObject.getId();
        }
        tL_messages_sendReaction.add_to_recent = z2;
        if (z2 && visibleReaction != null) {
            MediaDataController.getInstance(this.currentAccount).recentReactions.add(0, ReactionsUtils.toTLReaction(visibleReaction));
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = arrayList.get(i);
                if (visibleReaction2.documentId != 0) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = visibleReaction2.documentId;
                    tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji);
                    tL_messages_sendReaction.flags |= 1;
                } else if (visibleReaction2.emojicon != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = visibleReaction2.emojicon;
                    tL_messages_sendReaction.reaction.add(tL_reactionEmoji);
                    tL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z) {
            tL_messages_sendReaction.flags |= 2;
            tL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tL_messages_sendReaction, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda102
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendReaction$28(runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendReaction$28(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void requestUrlAuth(final String str, final ChatActivity chatActivity, final boolean z) {
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.url = str;
        tL_messages_requestUrlAuth.flags |= 4;
        getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda96
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.lambda$requestUrlAuth$30(ChatActivity.this, tL_messages_requestUrlAuth, str, z, tLObject, tL_error);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestUrlAuth$30(final ChatActivity chatActivity, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final String str, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda100
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$requestUrlAuth$29(TLObject.this, chatActivity, tL_messages_requestUrlAuth, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestUrlAuth$29(TLObject tLObject, ChatActivity chatActivity, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, boolean z) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                chatActivity.showRequestUrlAlert((TLRPC.TL_urlAuthResultRequest) tLObject, tL_messages_requestUrlAuth, str, z);
                return;
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                AlertsCreator.showOpenUrlAlert(chatActivity, ((TLRPC.TL_urlAuthResultAccepted) tLObject).url, false, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                    AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
                    return;
                }
                return;
            }
        }
        AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
    }

    public void sendCallback(boolean z, MessageObject messageObject, TLRPC.KeyboardButton keyboardButton, ChatActivity chatActivity) {
        lambda$sendCallback$33(z, messageObject, keyboardButton, null, null, chatActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* renamed from: sendCallback, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$sendCallback$33(final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity, final ChatActivity chatActivity) {
        boolean z2;
        int i;
        List<String> list;
        final List<String> list2;
        if (messageObject == null || keyboardButton == null || chatActivity == null) {
            return;
        }
        boolean z3 = keyboardButton instanceof TLRPC.TL_keyboardButtonUrlAuth;
        if (z3) {
            i = 3;
        } else {
            if (!(keyboardButton instanceof TLRPC.TL_keyboardButtonGame)) {
                z2 = z;
                i = keyboardButton instanceof TLRPC.TL_keyboardButtonBuy ? 2 : 0;
                final String str = messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(keyboardButton.data) + "_" + i;
                this.waitingForCallback.put(str, Boolean.TRUE);
                list = this.waitingForCallbackMap.get(messageObject.getDialogId() + "_" + messageObject.getId());
                if (list != null) {
                    HashMap<String, List<String>> hashMap = this.waitingForCallbackMap;
                    String str2 = messageObject.getDialogId() + "_" + messageObject.getId();
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(str2, arrayList);
                    list2 = arrayList;
                } else {
                    list2 = list;
                }
                list2.add(str);
                final TLObject[] tLObjectArr = new TLObject[1];
                final boolean z4 = z2;
                RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda113
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        SendMessagesHelper.this.lambda$sendCallback$39(str, list2, z4, messageObject, keyboardButton, chatActivity, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z, tLObject, tL_error);
                    }
                };
                if (!z2) {
                    getMessagesStorage().getBotCache(str, requestDelegate);
                    return;
                }
                if (z3) {
                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                    tL_messages_requestUrlAuth.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                    tL_messages_requestUrlAuth.msg_id = messageObject.getId();
                    tL_messages_requestUrlAuth.button_id = keyboardButton.button_id;
                    tL_messages_requestUrlAuth.flags |= 2;
                    tLObjectArr[0] = tL_messages_requestUrlAuth;
                    getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, requestDelegate, 2);
                    return;
                }
                if (keyboardButton instanceof TLRPC.TL_keyboardButtonBuy) {
                    if ((messageObject.messageOwner.media.flags & 4) == 0) {
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                        tL_inputInvoiceMessage.msg_id = messageObject.getId();
                        tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(messageObject.messageOwner.peer_id);
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(null);
                        if (makeThemeParams != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = makeThemeParams.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tLObjectArr[0] = tL_payments_getPaymentForm;
                        getConnectionsManager().sendRequest(tL_payments_getPaymentForm, requestDelegate, 2);
                        return;
                    }
                    TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                    tL_payments_getPaymentReceipt.msg_id = messageObject.messageOwner.media.receipt_msg_id;
                    tL_payments_getPaymentReceipt.peer = getMessagesController().getInputPeer(messageObject.messageOwner.peer_id);
                    tLObjectArr[0] = tL_payments_getPaymentReceipt;
                    getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, requestDelegate, 2);
                    return;
                }
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tL_messages_getBotCallbackAnswer.msg_id = messageObject.getId();
                tL_messages_getBotCallbackAnswer.game = keyboardButton instanceof TLRPC.TL_keyboardButtonGame;
                if (keyboardButton.requires_password) {
                    tL_messages_getBotCallbackAnswer.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
                    tL_messages_getBotCallbackAnswer.flags |= 4;
                }
                byte[] bArr = keyboardButton.data;
                if (bArr != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = bArr;
                }
                getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, requestDelegate, 2);
                return;
            }
            i = 1;
        }
        z2 = false;
        final String str3 = messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(keyboardButton.data) + "_" + i;
        this.waitingForCallback.put(str3, Boolean.TRUE);
        list = this.waitingForCallbackMap.get(messageObject.getDialogId() + "_" + messageObject.getId());
        if (list != null) {
        }
        list2.add(str3);
        final TLObject[] tLObjectArr2 = new TLObject[1];
        final boolean z42 = z2;
        RequestDelegate requestDelegate2 = new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda113
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendCallback$39(str3, list2, z42, messageObject, keyboardButton, chatActivity, twoStepVerificationActivity, tLObjectArr2, inputCheckPasswordSRP, z, tLObject, tL_error);
            }
        };
        if (!z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$39(final String str, final List list, final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject[] tLObjectArr, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final boolean z2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendCallback$38(str, list, z, tLObject, messageObject, keyboardButton, chatActivity, twoStepVerificationActivity, tLObjectArr, tL_error, inputCheckPasswordSRP, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$38(final String str, final List list, boolean z, TLObject tLObject, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final boolean z2) {
        String str2;
        this.waitingForCallback.remove(str);
        list.remove(str);
        boolean z3 = false;
        if (z && tLObject == null) {
            sendCallback(false, messageObject, keyboardButton, chatActivity);
            return;
        }
        if (tLObject != null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.finishFragment();
            }
            long fromChatId = messageObject.getFromChatId();
            long j = messageObject.messageOwner.via_bot_id;
            if (j != 0) {
                fromChatId = j;
            }
            if (fromChatId > 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    str2 = ContactsController.formatName(user.first_name, user.last_name);
                }
                str2 = null;
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    str2 = chat.title;
                }
                str2 = null;
            }
            if (str2 == null) {
                str2 = "bot";
            }
            if (keyboardButton instanceof TLRPC.TL_keyboardButtonUrlAuth) {
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    chatActivity.showRequestUrlAlert((TLRPC.TL_urlAuthResultRequest) tLObject, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr[0], keyboardButton.url, false);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    AlertsCreator.showOpenUrlAlert(chatActivity, ((TLRPC.TL_urlAuthResultAccepted) tLObject).url, false, false);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        AlertsCreator.showOpenUrlAlert(chatActivity, keyboardButton.url, false, true);
                        return;
                    }
                    return;
                }
            }
            if (keyboardButton instanceof TLRPC.TL_keyboardButtonBuy) {
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    StarsController.getInstance(this.currentAccount).openPaymentForm(messageObject, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda91
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.this.lambda$sendCallback$31(str, list);
                        }
                    }, new Utilities.Callback() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda92
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            SendMessagesHelper.lambda$sendCallback$32((String) obj);
                        }
                    });
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    getMessagesController().putUsers(paymentForm.users, false);
                    chatActivity.presentFragment(new PaymentFormActivity(paymentForm, messageObject, chatActivity));
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
                        Context context = LaunchActivity.instance;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        StarsIntroActivity.showTransactionSheet(context, false, this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, (Theme.ResourcesProvider) null);
                        return;
                    }
                    if (tLObject instanceof TLRPC.PaymentReceipt) {
                        chatActivity.presentFragment(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject));
                        return;
                    }
                    return;
                }
            }
            TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject;
            if (!z && tL_messages_botCallbackAnswer.cache_time != 0 && !keyboardButton.requires_password) {
                getMessagesStorage().saveBotCache(str, tL_messages_botCallbackAnswer);
            }
            String str3 = tL_messages_botCallbackAnswer.message;
            if (str3 != null) {
                if (tL_messages_botCallbackAnswer.alert) {
                    if (chatActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity());
                    builder.setTitle(str2);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    builder.setMessage(tL_messages_botCallbackAnswer.message);
                    chatActivity.showDialog(builder.create());
                    return;
                }
                chatActivity.showAlert(str2, str3);
                return;
            }
            if (tL_messages_botCallbackAnswer.url == null || chatActivity.getParentActivity() == null) {
                return;
            }
            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(fromChatId));
            boolean z4 = user2 != null && user2.verified;
            if (keyboardButton instanceof TLRPC.TL_keyboardButtonGame) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                if (tL_game == null) {
                    return;
                }
                String str4 = tL_messages_botCallbackAnswer.url;
                if (!z4) {
                    if (MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("askgame_" + fromChatId, true)) {
                        z3 = true;
                    }
                }
                chatActivity.showOpenGameAlert(tL_game, messageObject, str4, z3, fromChatId);
                return;
            }
            AlertsCreator.showOpenUrlAlert(chatActivity, tL_messages_botCallbackAnswer.url, false, false);
            return;
        }
        if (tL_error == null || chatActivity.getParentActivity() == null) {
            return;
        }
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(chatActivity.getParentActivity());
                builder2.setTitle(LocaleController.getString(R.string.BotOwnershipTransfer));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferReadyAlertText", R.string.BotOwnershipTransferReadyAlertText, new Object[0])));
                builder2.setPositiveButton(LocaleController.getString(R.string.BotOwnershipTransferChangeOwner), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda93
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        SendMessagesHelper.this.lambda$sendCallback$34(z2, messageObject, keyboardButton, chatActivity, alertDialog, i);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                chatActivity.showDialog(builder2.create());
                return;
            }
            return;
        }
        if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
            }
            AlertDialog.Builder builder3 = new AlertDialog.Builder(chatActivity.getParentActivity());
            builder3.setTitle(LocaleController.getString(R.string.EditAdminTransferAlertTitle));
            LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            builder3.setView(linearLayout);
            TextView textView = new TextView(chatActivity.getParentActivity());
            int i = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferAlertText", R.string.BotOwnershipTransferAlertText, new Object[0])));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(chatActivity.getParentActivity());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(chatActivity.getParentActivity());
            int i2 = R.drawable.list_circle;
            imageView.setImageResource(i2);
            imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            int color = Theme.getColor(i);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            TextView textView2 = new TextView(chatActivity.getParentActivity());
            textView2.setTextColor(Theme.getColor(i));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText1)));
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(chatActivity.getParentActivity());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(chatActivity.getParentActivity());
            imageView2.setImageResource(i2);
            imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
            TextView textView3 = new TextView(chatActivity.getParentActivity());
            textView3.setTextColor(Theme.getColor(i));
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText2)));
            if (LocaleController.isRTL) {
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                builder3.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda95
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        SendMessagesHelper.lambda$sendCallback$35(ChatActivity.this, alertDialog, i3);
                    }
                });
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(chatActivity.getParentActivity());
                textView4.setTextColor(Theme.getColor(i));
                textView4.setTextSize(1, 16.0f);
                textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                builder3.setNegativeButton(LocaleController.getString(R.string.OK), null);
            }
            chatActivity.showDialog(builder3.create());
            return;
        }
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda94
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    SendMessagesHelper.this.lambda$sendCallback$37(twoStepVerificationActivity, z2, messageObject, keyboardButton, chatActivity, tLObject2, tL_error2);
                }
            }, 8);
        } else if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$31(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$34(final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, AlertDialog alertDialog, int i) {
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(0, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.TwoStepVerificationActivity.TwoStepVerificationActivityDelegate
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                SendMessagesHelper.this.lambda$sendCallback$33(z, messageObject, keyboardButton, twoStepVerificationActivity, chatActivity, inputCheckPasswordSRP);
            }
        });
        chatActivity.presentFragment(twoStepVerificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendCallback$35(ChatActivity chatActivity, AlertDialog alertDialog, int i) {
        chatActivity.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$37(final TwoStepVerificationActivity twoStepVerificationActivity, final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda103
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$sendCallback$36(tL_error, tLObject, twoStepVerificationActivity, z, messageObject, keyboardButton, chatActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallback$36(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, MessageObject messageObject, TLRPC.KeyboardButton keyboardButton, ChatActivity chatActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$sendCallback$33(z, messageObject, keyboardButton, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity, chatActivity);
        }
    }

    public boolean isSendingCallback(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        int i = 0;
        if (messageObject == null || keyboardButton == null) {
            return false;
        }
        if (keyboardButton instanceof TLRPC.TL_keyboardButtonUrlAuth) {
            i = 3;
        } else if (keyboardButton instanceof TLRPC.TL_keyboardButtonGame) {
            i = 1;
        } else if (keyboardButton instanceof TLRPC.TL_keyboardButtonBuy) {
            i = 2;
        }
        return this.waitingForCallback.containsKey(messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(keyboardButton.data) + "_" + i);
    }

    public void sendGame(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null || tL_inputMediaGame == null) {
            return;
        }
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
        tL_messages_sendMedia.peer = inputPeer;
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + (-inputPeer.channel_id), false);
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + (-inputPeer.chat_id), false);
        } else {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + inputPeer.user_id, false);
        }
        tL_messages_sendMedia.random_id = j != 0 ? j : getNextRandomId();
        tL_messages_sendMedia.message = "";
        tL_messages_sendMedia.media = tL_inputMediaGame;
        long sendAsPeerId = ChatObject.getSendAsPeerId(getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)), getMessagesController().getChatFull(inputPeer.chat_id));
        if (sendAsPeerId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            tL_messages_sendMedia.send_as = getMessagesController().getInputPeer(sendAsPeerId);
        }
        long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(DialogObject.getPeerDialogId(inputPeer));
        if (sendPaidMessagesStars <= 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(DialogObject.getPeerDialogId(inputPeer)));
        }
        if (sendPaidMessagesStars > 0) {
            tL_messages_sendMedia.flags |= TLObject.FLAG_21;
            tL_messages_sendMedia.allow_paid_stars = sendPaidMessagesStars;
        }
        if (j2 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(3);
                nativeByteBuffer.writeInt64(j);
                inputPeer.serializeToStream(nativeByteBuffer);
                tL_inputMediaGame.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_sendMedia, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda105
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        SendMessagesHelper.this.lambda$sendGame$40(j2, tLObject, tL_error);
                    }
                });
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_sendMedia, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda105
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$sendGame$40(j2, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendGame$40(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public void sendMessage(org.telegram.messenger.SendMessagesHelper.SendMessageParams r107) {
        /*
            Method dump skipped, instructions count: 10449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(org.telegram.messenger.SendMessagesHelper$SendMessageParams):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$41(SendMessageParams sendMessageParams, Long l) {
        sendMessageParams.payStars = l.longValue();
        sendMessage(sendMessageParams);
    }

    private void performSendDelayedMessage(DelayedMessage delayedMessage) {
        performSendDelayedMessage(delayedMessage, -1);
    }

    private TLRPC.PhotoSize getThumbForSecretChat(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.w = photoSize.w;
                    tL_photoSize_layer127.h = photoSize.h;
                    tL_photoSize_layer127.size = photoSize.size;
                    byte[] bArr = photoSize.bytes;
                    tL_photoSize_layer127.bytes = bArr;
                    if (bArr == null) {
                        tL_photoSize_layer127.bytes = new byte[0];
                    }
                    TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                    tL_photoSize_layer127.location = tL_fileLocation_layer82;
                    TLRPC.FileLocation fileLocation = photoSize.location;
                    tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                    tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                    tL_fileLocation_layer82.local_id = fileLocation.local_id;
                    tL_fileLocation_layer82.secret = fileLocation.secret;
                    return tL_photoSize_layer127;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:342:0x088f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void performSendDelayedMessage(final DelayedMessage delayedMessage, int i) {
        boolean z;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        boolean z2;
        TLRPC.InputFile inputFile;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer2;
        TLRPC.InputMedia inputMedia2;
        TLRPC.PhotoSize photoSize;
        TLRPC.InputMedia inputMedia3;
        TLRPC.PhotoSize photoSize2;
        final TLRPC.InputMedia inputMedia4;
        TLRPC.InputPeer inputPeer3;
        String str;
        VideoEditedInfo videoEditedInfo;
        TLRPC.InputMedia inputMedia5;
        TLRPC.PhotoSize photoSize3;
        int i2 = delayedMessage.type;
        if (i2 == 0) {
            String str2 = delayedMessage.httpLocation;
            if (str2 != null) {
                putToDelayedMessages(str2, delayedMessage);
                ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "file", this.currentAccount);
                return;
            }
            if (delayedMessage.sendRequest != null) {
                String file = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
                putToDelayedMessages(file, delayedMessage);
                getFileLoader().uploadFile(file, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            String file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
            if (delayedMessage.sendEncryptedRequest != null && (photoSize3 = delayedMessage.photoSize) != null && photoSize3.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(delayedMessage.photoSize), delayedMessage);
                    getFileLoader().loadFile(ImageLocation.getForObject(delayedMessage.photoSize, delayedMessage.locationParent), delayedMessage.parentObject, "jpg", 3, 0);
                    return;
                }
            }
            putToDelayedMessages(file2, delayedMessage);
            getFileLoader().uploadFile(file2, true, true, 16777216);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 1) {
            VideoEditedInfo videoEditedInfo2 = delayedMessage.videoEditedInfo;
            if (videoEditedInfo2 != null && videoEditedInfo2.needConvert() && delayedMessage.performMediaUpload) {
                MessageObject messageObject = delayedMessage.obj;
                String str3 = messageObject.messageOwner.attachPath;
                TLRPC.Document document = messageObject.getDocument();
                if (str3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(FileLoader.getDirectory(4));
                    sb.append("/");
                    sb.append(document.id);
                    sb.append(".");
                    sb.append(delayedMessage.videoEditedInfo.isSticker ? "webm" : "mp4");
                    str3 = sb.toString();
                }
                putToDelayedMessages(str3, delayedMessage);
                if (!delayedMessage.videoEditedInfo.alreadyScheduledConverting) {
                    MediaController.getInstance().scheduleVideoConvert(delayedMessage.obj);
                }
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            VideoEditedInfo videoEditedInfo3 = delayedMessage.videoEditedInfo;
            if (videoEditedInfo3 != null) {
                TLRPC.InputFile inputFile2 = videoEditedInfo3.file;
                if (inputFile2 != null) {
                    TLObject tLObject = delayedMessage.sendRequest;
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                    } else {
                        inputMedia5 = ((TLRPC.TL_messages_editMessage) tLObject).media;
                    }
                    inputMedia5.file = inputFile2;
                    videoEditedInfo3.file = null;
                } else if (videoEditedInfo3.encryptedFile != null) {
                    TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) delayedMessage.sendEncryptedRequest;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                    decryptedMessageMedia.size = videoEditedInfo3.estimatedSize;
                    decryptedMessageMedia.key = videoEditedInfo3.key;
                    decryptedMessageMedia.iv = videoEditedInfo3.iv;
                    SecretChatHelper secretChatHelper = getSecretChatHelper();
                    MessageObject messageObject2 = delayedMessage.obj;
                    secretChatHelper.performSendEncryptedRequest(tL_decryptedMessage, messageObject2.messageOwner, delayedMessage.encryptedChat, delayedMessage.videoEditedInfo.encryptedFile, delayedMessage.originalPath, messageObject2);
                    delayedMessage.videoEditedInfo.encryptedFile = null;
                    return;
                }
            }
            TLObject tLObject2 = delayedMessage.sendRequest;
            if (tLObject2 != null) {
                if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    inputMedia4 = tL_messages_sendMedia.media;
                    inputPeer3 = tL_messages_sendMedia.peer;
                } else {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject2;
                    inputMedia4 = tL_messages_editMessage.media;
                    inputPeer3 = tL_messages_editMessage.peer;
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if (inputMedia4.file == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && delayedMessage.performMediaUpload) {
                    MessageObject messageObject3 = delayedMessage.obj;
                    String str4 = messageObject3.messageOwner.attachPath;
                    TLRPC.Document document2 = messageObject3.getDocument();
                    if (str4 == null) {
                        str4 = FileLoader.getDirectory(4) + "/" + document2.id + ".mp4";
                    }
                    String str5 = str4;
                    putToDelayedMessages(str5, delayedMessage);
                    VideoEditedInfo videoEditedInfo4 = delayedMessage.obj.videoEditedInfo;
                    if (videoEditedInfo4 == null || !videoEditedInfo4.notReadyYet) {
                        if (videoEditedInfo4 != null && videoEditedInfo4.needConvert()) {
                            getFileLoader().uploadFile(str5, false, false, document2.size, 33554432, false);
                        } else {
                            getFileLoader().uploadFile(str5, false, false, 33554432);
                        }
                    }
                    putToUploadingMessages(delayedMessage.obj);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && delayedMessage.coverFile == null && delayedMessage.coverPhotoSize != null && delayedMessage.performCoverUpload) {
                    String str6 = FileLoader.getDirectory(4) + "/" + delayedMessage.coverPhotoSize.location.volume_id + "_" + delayedMessage.coverPhotoSize.location.local_id + ".jpg";
                    putToDelayedMessages(str6, delayedMessage);
                    getFileLoader().uploadFile(str6, false, true, 16777216);
                    putToUploadingMessages(delayedMessage.obj);
                    return;
                }
                if (inputPhoto == null && delayedMessage.coverFile != null && delayedMessage.performCoverUpload) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer3;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = delayedMessage.coverFile;
                    tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
                    getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda79
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            SendMessagesHelper.this.lambda$performSendDelayedMessage$43(inputMedia4, delayedMessage, tLObject3, tL_error);
                        }
                    });
                    return;
                }
                MessageObject messageObject4 = delayedMessage.obj;
                if (messageObject4 != null && (videoEditedInfo = messageObject4.videoEditedInfo) != null && videoEditedInfo.isSticker) {
                    str = "webp";
                } else {
                    str = "jpg";
                }
                String str7 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + "." + str;
                putToDelayedMessages(str7, delayedMessage);
                getFileLoader().uploadFile(str7, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            MessageObject messageObject5 = delayedMessage.obj;
            String str8 = messageObject5.messageOwner.attachPath;
            TLRPC.Document document3 = messageObject5.getDocument();
            if (str8 == null) {
                str8 = FileLoader.getDirectory(4) + "/" + document3.id + ".mp4";
            }
            if (delayedMessage.sendEncryptedRequest != null && document3.dc_id != 0) {
                File file4 = new File(str8);
                if (!file4.exists() && (file4 = getFileLoader().getPathToMessage(delayedMessage.obj.messageOwner)) != null && file4.exists()) {
                    TLRPC.Message message = delayedMessage.obj.messageOwner;
                    String absolutePath = file4.getAbsolutePath();
                    message.attachPath = absolutePath;
                    delayedMessage.obj.attachPathExists = true;
                    str8 = absolutePath;
                }
                if ((file4 == null || (!file4.exists() && delayedMessage.obj.getDocument() != null)) && (file4 = getFileLoader().getPathToAttach(delayedMessage.obj.getDocument(), false)) != null && file4.exists()) {
                    TLRPC.Message message2 = delayedMessage.obj.messageOwner;
                    String absolutePath2 = file4.getAbsolutePath();
                    message2.attachPath = absolutePath2;
                    delayedMessage.obj.attachPathExists = true;
                    str8 = absolutePath2;
                }
                if (file4 == null || !file4.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(document3), delayedMessage);
                    getFileLoader().loadFile(document3, delayedMessage.parentObject, 3, 0);
                    return;
                }
            }
            String str9 = str8;
            putToDelayedMessages(str9, delayedMessage);
            VideoEditedInfo videoEditedInfo5 = delayedMessage.obj.videoEditedInfo;
            if (videoEditedInfo5 == null || !videoEditedInfo5.notReadyYet) {
                if (videoEditedInfo5 != null && videoEditedInfo5.needConvert()) {
                    getFileLoader().uploadFile(str9, true, false, document3.size, 33554432, false);
                } else {
                    getFileLoader().uploadFile(str9, true, false, 33554432);
                }
            }
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 2) {
            String str10 = delayedMessage.httpLocation;
            if (str10 != null) {
                putToDelayedMessages(str10, delayedMessage);
                ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "gif", this.currentAccount);
                return;
            }
            TLObject tLObject3 = delayedMessage.sendRequest;
            if (tLObject3 != null) {
                if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                    inputMedia3 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                } else {
                    inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject3).media;
                }
                if (inputMedia3.file == null) {
                    String str11 = delayedMessage.obj.messageOwner.attachPath;
                    putToDelayedMessages(str11, delayedMessage);
                    getFileLoader().uploadFile(str11, delayedMessage.sendRequest == null, false, 67108864);
                    putToUploadingMessages(delayedMessage.obj);
                    return;
                }
                if (inputMedia3.thumb != null || (photoSize2 = delayedMessage.photoSize) == null || (photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    return;
                }
                String str12 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + ".jpg";
                putToDelayedMessages(str12, delayedMessage);
                getFileLoader().uploadFile(str12, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            MessageObject messageObject6 = delayedMessage.obj;
            String str13 = messageObject6.messageOwner.attachPath;
            TLRPC.Document document4 = messageObject6.getDocument();
            if (delayedMessage.sendEncryptedRequest != null && document4.dc_id != 0) {
                File file5 = new File(str13);
                if (!file5.exists() && (file5 = getFileLoader().getPathToMessage(delayedMessage.obj.messageOwner)) != null && file5.exists()) {
                    TLRPC.Message message3 = delayedMessage.obj.messageOwner;
                    String absolutePath3 = file5.getAbsolutePath();
                    message3.attachPath = absolutePath3;
                    delayedMessage.obj.attachPathExists = true;
                    str13 = absolutePath3;
                }
                if ((file5 == null || (!file5.exists() && delayedMessage.obj.getDocument() != null)) && (file5 = getFileLoader().getPathToAttach(delayedMessage.obj.getDocument(), false)) != null && file5.exists()) {
                    TLRPC.Message message4 = delayedMessage.obj.messageOwner;
                    String absolutePath4 = file5.getAbsolutePath();
                    message4.attachPath = absolutePath4;
                    delayedMessage.obj.attachPathExists = true;
                    str13 = absolutePath4;
                }
                if (file5 == null || !file5.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(document4), delayedMessage);
                    getFileLoader().loadFile(document4, delayedMessage.parentObject, 3, 0);
                    return;
                }
            }
            putToDelayedMessages(str13, delayedMessage);
            getFileLoader().uploadFile(str13, true, false, 67108864);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 3) {
            String str14 = delayedMessage.obj.messageOwner.attachPath;
            putToDelayedMessages(str14, delayedMessage);
            getFileLoader().uploadFile(str14, delayedMessage.sendRequest == null, true, ConnectionsManager.FileTypeAudio);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                final String str15 = "stickerset_" + delayedMessage.obj.getId();
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) delayedMessage.parentObject;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda81
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                        SendMessagesHelper.this.lambda$performSendDelayedMessage$47(delayedMessage, str15, tLObject4, tL_error);
                    }
                });
                putToDelayedMessages(str15, delayedMessage);
                return;
            }
            return;
        }
        boolean z3 = i < 0;
        if (delayedMessage.performMediaUpload || delayedMessage.performCoverUpload) {
            int size = i < 0 ? delayedMessage.messageObjects.size() - 1 : i;
            final MessageObject messageObject7 = delayedMessage.messageObjects.get(size);
            TLRPC.Document document5 = messageObject7.getDocument();
            if (document5 == null && (MessageObject.getMedia(messageObject7) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject7);
                TLRPC.MessageExtendedMedia messageExtendedMedia = size >= tL_messageMediaPaidMedia.extended_media.size() ? null : tL_messageMediaPaidMedia.extended_media.get(size);
                TLRPC.MessageMedia messageMedia = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia ? ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media : null;
                document5 = messageMedia == null ? null : messageMedia.document;
            }
            if (document5 != null) {
                VideoEditedInfo videoEditedInfo6 = delayedMessage.videoEditedInfo;
                if (videoEditedInfo6 != null && videoEditedInfo6.needConvert() && delayedMessage.performMediaUpload) {
                    String str16 = messageObject7.messageOwner.attachPath;
                    if (str16 == null) {
                        str16 = FileLoader.getDirectory(4) + "/" + document5.id + ".mp4";
                    }
                    putToDelayedMessages(str16, delayedMessage);
                    delayedMessage.extraHashMap.put(messageObject7, str16);
                    delayedMessage.extraHashMap.put(str16 + "_i", messageObject7);
                    TLRPC.PhotoSize photoSize4 = delayedMessage.photoSize;
                    if (photoSize4 != null && photoSize4.location != null) {
                        delayedMessage.extraHashMap.put(str16 + "_t", delayedMessage.photoSize);
                    }
                    TLRPC.PhotoSize photoSize5 = delayedMessage.coverPhotoSize;
                    if (photoSize5 != null && photoSize5.location != null) {
                        delayedMessage.extraHashMap.put(str16 + "_ct", delayedMessage.coverPhotoSize);
                    }
                    if (!delayedMessage.videoEditedInfo.alreadyScheduledConverting) {
                        MediaController.getInstance().scheduleVideoConvert(messageObject7);
                    }
                    delayedMessage.obj = messageObject7;
                    putToUploadingMessages(messageObject7);
                    z = z3;
                } else {
                    String str17 = messageObject7.messageOwner.attachPath;
                    if (str17 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        z = z3;
                        sb2.append(document5.id);
                        sb2.append(".mp4");
                        str17 = sb2.toString();
                    } else {
                        z = z3;
                    }
                    final String str18 = str17;
                    TLObject tLObject4 = delayedMessage.sendRequest;
                    if (tLObject4 != null) {
                        if (tLObject4 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject4;
                            inputPeer2 = tL_messages_sendMultiMedia.peer;
                            inputMedia2 = tL_messages_sendMultiMedia.multi_media.get(size).media;
                        } else {
                            if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject4;
                                inputPeer2 = tL_messages_sendMedia2.peer;
                                TLRPC.InputMedia inputMedia6 = tL_messages_sendMedia2.media;
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia2 = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(size);
                                } else {
                                    inputPeer = inputPeer2;
                                }
                            } else {
                                inputPeer = null;
                            }
                            inputMedia = null;
                            if (inputMedia == null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && delayedMessage.performMediaUpload) {
                                putToDelayedMessages(str18, delayedMessage);
                                delayedMessage.extraHashMap.put(messageObject7, str18);
                                delayedMessage.extraHashMap.put(str18, inputMedia);
                                delayedMessage.extraHashMap.put(str18 + "_i", messageObject7);
                                TLRPC.PhotoSize photoSize6 = delayedMessage.photoSize;
                                if (photoSize6 != null && photoSize6.location != null) {
                                    delayedMessage.extraHashMap.put(str18 + "_t", delayedMessage.photoSize);
                                }
                                TLRPC.PhotoSize photoSize7 = delayedMessage.coverPhotoSize;
                                if (photoSize7 != null && photoSize7.location != null) {
                                    String str19 = FileLoader.getDirectory(4) + "/" + delayedMessage.coverPhotoSize.location.volume_id + "_" + delayedMessage.coverPhotoSize.location.local_id + ".jpg";
                                    delayedMessage.extraHashMap.put(str18 + "_ct", delayedMessage.coverPhotoSize);
                                    delayedMessage.extraHashMap.put(str19 + "_doc", str18);
                                }
                                VideoEditedInfo videoEditedInfo7 = messageObject7.videoEditedInfo;
                                if (videoEditedInfo7 != null && videoEditedInfo7.needConvert()) {
                                    getFileLoader().uploadFile(str18, false, false, document5.size, 33554432, false);
                                } else {
                                    getFileLoader().uploadFile(str18, false, false, 33554432);
                                }
                                putToUploadingMessages(messageObject7);
                            } else {
                                photoSize = delayedMessage.coverPhotoSize;
                                if (photoSize == null && delayedMessage.coverFile == null && inputMedia.video_cover == null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(FileLoader.getDirectory(4));
                                    sb3.append("/");
                                    TLRPC.InputMedia inputMedia7 = inputMedia;
                                    sb3.append(delayedMessage.coverPhotoSize.location.volume_id);
                                    sb3.append("_");
                                    sb3.append(delayedMessage.coverPhotoSize.location.local_id);
                                    sb3.append(".jpg");
                                    String sb4 = sb3.toString();
                                    putToDelayedMessages(sb4, delayedMessage);
                                    TLRPC.PhotoSize photoSize8 = delayedMessage.coverPhotoSize;
                                    if (photoSize8 != null && photoSize8.location != null) {
                                        String str20 = FileLoader.getDirectory(4) + "/" + delayedMessage.coverPhotoSize.location.volume_id + "_" + delayedMessage.coverPhotoSize.location.local_id + ".jpg";
                                        delayedMessage.extraHashMap.put(str18 + "_ct", delayedMessage.coverPhotoSize);
                                        delayedMessage.extraHashMap.put(str20 + "_doc", str18);
                                    }
                                    delayedMessage.extraHashMap.put(sb4 + "_o", str18);
                                    delayedMessage.extraHashMap.put(str18 + "_i", messageObject7);
                                    delayedMessage.extraHashMap.put(messageObject7, sb4);
                                    delayedMessage.extraHashMap.put(sb4, inputMedia7);
                                    getFileLoader().uploadFile(sb4, false, true, 16777216);
                                    putToUploadingMessages(messageObject7);
                                } else {
                                    final TLRPC.InputMedia inputMedia8 = inputMedia;
                                    if (photoSize == null && delayedMessage.coverFile != null && inputMedia8 != null && inputMedia8.video_cover == null) {
                                        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                                        tL_messages_uploadMedia2.peer = inputPeer;
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                        tL_inputMediaUploadedPhoto2.file = delayedMessage.coverFile;
                                        tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto2;
                                        getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda80
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject5, TLRPC.TL_error tL_error) {
                                                SendMessagesHelper.this.lambda$performSendDelayedMessage$45(inputMedia8, delayedMessage, str18, messageObject7, tLObject5, tL_error);
                                            }
                                        });
                                    } else if (delayedMessage.photoSize != null) {
                                        String str21 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + ".jpg";
                                        putToDelayedMessages(str21, delayedMessage);
                                        delayedMessage.extraHashMap.put(str21 + "_o", str18);
                                        delayedMessage.extraHashMap.put(messageObject7, str21);
                                        delayedMessage.extraHashMap.put(str21, inputMedia8);
                                        getFileLoader().uploadFile(str21, false, true, 16777216);
                                        putToUploadingMessages(messageObject7);
                                    }
                                }
                            }
                        }
                        TLRPC.InputPeer inputPeer4 = inputPeer2;
                        inputMedia = inputMedia2;
                        inputPeer = inputPeer4;
                        if (inputMedia == null) {
                        }
                        photoSize = delayedMessage.coverPhotoSize;
                        if (photoSize == null) {
                        }
                        final TLRPC.InputMedia inputMedia82 = inputMedia;
                        if (photoSize == null) {
                        }
                        if (delayedMessage.photoSize != null) {
                        }
                    } else {
                        TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                        putToDelayedMessages(str18, delayedMessage);
                        delayedMessage.extraHashMap.put(messageObject7, str18);
                        delayedMessage.extraHashMap.put(str18, tL_messages_sendEncryptedMultiMedia.files.get(size));
                        delayedMessage.extraHashMap.put(str18 + "_i", messageObject7);
                        TLRPC.PhotoSize photoSize9 = delayedMessage.photoSize;
                        if (photoSize9 != null && photoSize9.location != null) {
                            delayedMessage.extraHashMap.put(str18 + "_t", delayedMessage.photoSize);
                        }
                        VideoEditedInfo videoEditedInfo8 = messageObject7.videoEditedInfo;
                        if (videoEditedInfo8 != null && videoEditedInfo8.needConvert()) {
                            getFileLoader().uploadFile(str18, true, false, document5.size, 33554432, false);
                        } else {
                            getFileLoader().uploadFile(str18, true, false, 33554432);
                        }
                        putToUploadingMessages(messageObject7);
                    }
                }
                inputFile = null;
                delayedMessage.videoEditedInfo = null;
                delayedMessage.photoSize = null;
                delayedMessage.coverPhotoSize = null;
            } else {
                z = z3;
                String str22 = delayedMessage.httpLocation;
                if (str22 != null) {
                    putToDelayedMessages(str22, delayedMessage);
                    delayedMessage.extraHashMap.put(messageObject7, delayedMessage.httpLocation);
                    delayedMessage.extraHashMap.put(delayedMessage.httpLocation, messageObject7);
                    ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "file", this.currentAccount);
                    inputFile = null;
                    delayedMessage.httpLocation = null;
                } else {
                    TLObject tLObject5 = delayedMessage.sendRequest;
                    if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                        inputEncryptedFile = ((TLRPC.TL_messages_sendMultiMedia) tLObject5).multi_media.get(size).media;
                    } else {
                        if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                            TLRPC.InputMedia inputMedia9 = ((TLRPC.TL_messages_sendMedia) tLObject5).media;
                            if (inputMedia9 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                inputEncryptedFile = ((TLRPC.TL_inputMediaPaidMedia) inputMedia9).extended_media.get(size);
                            }
                        }
                        inputEncryptedFile = ((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest).files.get(size);
                    }
                    String file6 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
                    putToDelayedMessages(file6, delayedMessage);
                    delayedMessage.extraHashMap.put(file6, inputEncryptedFile);
                    delayedMessage.extraHashMap.put(messageObject7, file6);
                    z2 = true;
                    getFileLoader().uploadFile(file6, delayedMessage.sendEncryptedRequest != null, true, 16777216);
                    putToUploadingMessages(messageObject7);
                    inputFile = null;
                    delayedMessage.photoSize = null;
                    delayedMessage.coverFile = inputFile;
                    delayedMessage.performMediaUpload = false;
                    delayedMessage.performCoverUpload = false;
                }
            }
            z2 = true;
            delayedMessage.coverFile = inputFile;
            delayedMessage.performMediaUpload = false;
            delayedMessage.performCoverUpload = false;
        } else {
            if (!delayedMessage.messageObjects.isEmpty()) {
                ArrayList<MessageObject> arrayList = delayedMessage.messageObjects;
                putToSendingMessages(arrayList.get(arrayList.size() - 1).messageOwner, delayedMessage.finalGroupMessage != 0);
            }
            z = z3;
            z2 = true;
        }
        sendReadyToSendGroup(delayedMessage, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$43(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda101
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendDelayedMessage$42(tLObject, inputMedia, delayedMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$42(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject;
        VideoEditedInfo videoEditedInfo;
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia.flags |= 64;
                inputMedia.video_cover = tL_inputPhoto;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                inputMedia.flags |= 8;
                inputMedia.video_cover = tL_inputPhoto;
            }
            TLRPC.InputMedia inputMedia2 = delayedMessage.inputUploadMedia;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia2.flags |= 64;
                inputMedia2.video_cover = tL_inputPhoto;
            }
            if (delayedMessage.performMediaUpload && inputMedia.thumb == null && (photoSize = delayedMessage.photoSize) != null && photoSize.location != null && ((messageObject = delayedMessage.obj) == null || (videoEditedInfo = messageObject.videoEditedInfo) == null || !videoEditedInfo.isSticker)) {
                performSendDelayedMessage(delayedMessage);
                return;
            } else {
                performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, delayedMessage, delayedMessage.parentObject, null, delayedMessage.scheduled);
                return;
            }
        }
        delayedMessage.markAsError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$45(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final String str, final MessageObject messageObject, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendDelayedMessage$44(tLObject, inputMedia, delayedMessage, str, messageObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$44(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, String str, MessageObject messageObject) {
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia.flags |= 64;
                inputMedia.video_cover = tL_inputPhoto;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                inputMedia.flags |= 8;
                inputMedia.video_cover = tL_inputPhoto;
            }
            TLRPC.PhotoSize photoSize = null;
            delayedMessage.coverFile = null;
            delayedMessage.coverPhotoSize = null;
            HashMap<Object, Object> hashMap = delayedMessage.extraHashMap;
            if (hashMap != null) {
                hashMap.remove(str + "_ct");
            }
            int indexOf = delayedMessage.messageObjects.indexOf(messageObject);
            ArrayList<TLRPC.InputMedia> arrayList = delayedMessage.inputMedias;
            if (arrayList != null && indexOf >= 0 && indexOf < arrayList.size()) {
                TLRPC.InputMedia inputMedia2 = delayedMessage.inputMedias.get(indexOf);
                if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia2.flags |= 64;
                    inputMedia2.video_cover = tL_inputPhoto;
                }
            }
            HashMap<Object, Object> hashMap2 = delayedMessage.extraHashMap;
            if (hashMap2 != null) {
                if (hashMap2.containsKey(str + "_t")) {
                    photoSize = (TLRPC.PhotoSize) delayedMessage.extraHashMap.get(str + "_t");
                }
            }
            delayedMessage.photoSize = photoSize;
            if (inputMedia.thumb == null && photoSize != null && photoSize.location != null) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, indexOf);
                return;
            } else {
                sendReadyToSendGroup(delayedMessage, false, true);
                return;
            }
        }
        delayedMessage.markAsError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$47(final DelayedMessage delayedMessage, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendDelayedMessage$46(tLObject, delayedMessage, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendDelayedMessage$46(TLObject tLObject, DelayedMessage delayedMessage, String str) {
        boolean z;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getMediaDataController().storeTempStickerSet(tL_messages_stickerSet);
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) delayedMessage.locationParent;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z = true;
        } else {
            z = false;
        }
        ArrayList<DelayedMessage> remove = this.delayedMessages.remove(str);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        if (z) {
            getMessagesStorage().replaceMessageIfExists(remove.get(0).obj.messageOwner, null, null, false);
        }
        SecretChatHelper secretChatHelper = getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) delayedMessage.sendEncryptedRequest;
        MessageObject messageObject = delayedMessage.obj;
        secretChatHelper.performSendEncryptedRequest(decryptedMessage, messageObject.messageOwner, delayedMessage.encryptedChat, null, null, messageObject);
    }

    private void uploadMultiMedia(final DelayedMessage delayedMessage, final TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        if (inputMedia == null) {
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                int i = 0;
                while (true) {
                    if (i >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tL_messages_sendEncryptedMultiMedia.files.get(i) == inputEncryptedFile) {
                        putToSendingMessages(delayedMessage.messages.get(i), delayedMessage.scheduled);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i++;
                }
                sendReadyToSendGroup(delayedMessage, false, true);
                return;
            }
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.media = inputMedia;
        TLObject tLObject = delayedMessage.sendRequest;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
            int i2 = 0;
            while (true) {
                if (i2 >= tL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia) {
                    putToSendingMessages(delayedMessage.messages.get(i2), delayedMessage.scheduled);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i2++;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                int i3 = 0;
                while (true) {
                    if (i3 >= tL_inputMediaPaidMedia.extended_media.size()) {
                        break;
                    }
                    if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia) {
                        putToSendingMessages(delayedMessage.messages.get(i3), delayedMessage.scheduled);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i3++;
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda34
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$uploadMultiMedia$49(inputMedia, delayedMessage, tLObject2, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadMultiMedia$49(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$uploadMultiMedia$48(tLObject, inputMedia, delayedMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$uploadMultiMedia$48(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage) {
        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
        if (tLObject != null) {
            TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) tLObject;
            if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) && (messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputMediaPhoto.id = tL_inputPhoto;
                TLRPC.Photo photo = messageMedia.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.spoiler = inputMedia.spoiler;
                tL_inputMediaDocument = tL_inputMediaPhoto;
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("set uploaded photo");
                    tL_inputMediaDocument = tL_inputMediaPhoto;
                }
            } else if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) && (messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputMediaDocument2.id = tL_inputDocument;
                TLRPC.Document document = messageMedia.document;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument2.spoiler = inputMedia.spoiler;
                TLRPC.Photo photo2 = messageMedia.video_cover;
                if (photo2 != null) {
                    TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto2.id = photo2.id;
                    tL_inputPhoto2.access_hash = photo2.access_hash;
                    tL_inputPhoto2.file_reference = photo2.file_reference;
                    tL_inputMediaDocument2.flags |= 8;
                    tL_inputMediaDocument2.video_cover = tL_inputPhoto2;
                }
                tL_inputMediaDocument = tL_inputMediaDocument2;
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("set uploaded document");
                    tL_inputMediaDocument = tL_inputMediaDocument2;
                }
            }
            if (tL_inputMediaDocument == null) {
                int i = inputMedia.ttl_seconds;
                if (i != 0) {
                    tL_inputMediaDocument.ttl_seconds = i;
                    tL_inputMediaDocument.flags |= 1;
                }
                TLObject tLObject2 = delayedMessage.sendRequest;
                if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject2;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= tL_messages_sendMultiMedia.multi_media.size()) {
                            break;
                        }
                        if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia) {
                            tL_messages_sendMultiMedia.multi_media.get(i2).media = tL_inputMediaDocument;
                            break;
                        }
                        i2++;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= tL_inputMediaPaidMedia.extended_media.size()) {
                                break;
                            }
                            if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia) {
                                tL_inputMediaPaidMedia.extended_media.set(i3, tL_inputMediaDocument);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                sendReadyToSendGroup(delayedMessage, false, true);
                return;
            }
            delayedMessage.markAsError();
            return;
        }
        tL_inputMediaDocument = null;
        if (tL_inputMediaDocument == null) {
        }
    }

    private void sendReadyToSendGroup(DelayedMessage delayedMessage, boolean z, boolean z2) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        DelayedMessage findMaxDelayedMessageForMessageId2;
        ArrayList<MessageObject> arrayList;
        if (delayedMessage.messageObjects.isEmpty()) {
            delayedMessage.markAsError();
            return;
        }
        String str = "group_" + delayedMessage.groupId;
        int i = delayedMessage.finalGroupMessage;
        ArrayList<MessageObject> arrayList2 = delayedMessage.messageObjects;
        int i2 = 1;
        if (i != arrayList2.get(arrayList2.size() - 1).getId()) {
            if (z) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("final message not added, add");
                }
                putToDelayedMessages(str, delayedMessage);
                return;
            } else {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("final message not added");
                    return;
                }
                return;
            }
        }
        int i3 = 0;
        if (z) {
            this.delayedMessages.remove(str);
            if (!delayedMessage.scheduled) {
                MessageObject messageObject = delayedMessage.obj;
                i2 = ((messageObject == null || !messageObject.isQuickReply()) && ((arrayList = delayedMessage.messageObjects) == null || arrayList.isEmpty() || !delayedMessage.messageObjects.get(0).isQuickReply())) ? 0 : 5;
            }
            if (delayedMessage.paidMedia) {
                ArrayList<MessageObject> arrayList3 = new ArrayList<>();
                arrayList3.add(delayedMessage.messageObjects.get(0));
                ArrayList<TLRPC.Message> arrayList4 = new ArrayList<>();
                arrayList4.add(delayedMessage.messages.get(0));
                getMessagesStorage().putMessages(arrayList4, false, true, false, 0, i2, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage.peer, arrayList3, i2);
            } else {
                getMessagesStorage().putMessages(delayedMessage.messages, false, true, false, 0, i2, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage.peer, delayedMessage.messageObjects, i2);
            }
            if (!delayedMessage.scheduled) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("add message");
            }
        }
        TLObject tLObject = delayedMessage.sendRequest;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            while (i3 < tL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC.InputMedia inputMedia = tL_messages_sendMultiMedia.multi_media.get(i3).media;
                if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("multi media not ready");
                        return;
                    }
                    return;
                }
                if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && i3 < delayedMessage.messageObjects.size()) {
                    MessageObject messageObject2 = delayedMessage.messageObjects.get(i3);
                    String str2 = messageObject2.messageOwner.attachPath;
                    if (str2 == null) {
                        str2 = FileLoader.getDirectory(4) + "/" + messageObject2.getDocument().id + ".mp4";
                    }
                    if (delayedMessage.extraHashMap.containsKey(str2 + "_ct") && inputMedia.video_cover == null) {
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("cover media not ready");
                            return;
                        }
                        return;
                    }
                }
                i3++;
            }
            if (z2 && (findMaxDelayedMessageForMessageId2 = findMaxDelayedMessageForMessageId(delayedMessage.finalGroupMessage, delayedMessage.peer)) != null) {
                findMaxDelayedMessageForMessageId2.addDelayedRequest(delayedMessage.sendRequest, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
                ArrayList<DelayedMessageSendAfterRequest> arrayList5 = delayedMessage.requests;
                if (arrayList5 != null) {
                    findMaxDelayedMessageForMessageId2.requests.addAll(arrayList5);
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("has maxDelayedMessage, delay");
                    return;
                }
                return;
            }
        } else {
            if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    while (i3 < tL_inputMediaPaidMedia.extended_media.size()) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(i3);
                        if ((inputMedia3 instanceof TLRPC.TL_inputMediaUploadedPhoto) || (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("multi media not ready");
                                return;
                            }
                            return;
                        }
                        i3++;
                    }
                    if (z2 && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(delayedMessage.finalGroupMessage, delayedMessage.peer)) != null) {
                        findMaxDelayedMessageForMessageId.addDelayedRequest(delayedMessage.sendRequest, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
                        ArrayList<DelayedMessageSendAfterRequest> arrayList6 = delayedMessage.requests;
                        if (arrayList6 != null) {
                            findMaxDelayedMessageForMessageId.requests.addAll(arrayList6);
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("has maxDelayedMessage, delay");
                            return;
                        }
                        return;
                    }
                }
            }
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
            while (i3 < tL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tL_messages_sendEncryptedMultiMedia.files.get(i3) instanceof TLRPC.TL_inputEncryptedFile) {
                    return;
                } else {
                    i3++;
                }
            }
        }
        TLObject tLObject2 = delayedMessage.sendRequest;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            lambda$performSendMessageRequestMulti$52((TLRPC.TL_messages_sendMultiMedia) tLObject2, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
        } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
            lambda$performSendMessageRequestMulti$52((TLRPC.TL_messages_sendMedia) tLObject2, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
        } else {
            getSecretChatHelper().performSendEncryptedRequest((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest, delayedMessage);
        }
        delayedMessage.sendDelayedRequests();
    }

    protected void putToSendingMessages(final TLRPC.Message message, final boolean z) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda114
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$putToSendingMessages$50(message, z);
                }
            });
        } else {
            putToSendingMessages(message, z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putToSendingMessages$50(TLRPC.Message message, boolean z) {
        putToSendingMessages(message, z, true);
    }

    protected void putToSendingMessages(TLRPC.Message message, boolean z, boolean z2) {
        if (message == null) {
            return;
        }
        int i = message.id;
        if (i > 0) {
            this.editingMessages.put(i, message);
            return;
        }
        boolean z3 = this.sendingMessages.indexOfKey(i) >= 0;
        removeFromUploadingMessages(message.id, z);
        this.sendingMessages.put(message.id, message);
        if (z || z3) {
            return;
        }
        long dialogId = MessageObject.getDialogId(message);
        LongSparseArray longSparseArray = this.sendingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(((Integer) longSparseArray.get(dialogId, 0)).intValue() + 1));
        if (z2) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    protected TLRPC.Message removeFromSendingMessages(int i, boolean z) {
        if (i > 0) {
            TLRPC.Message message = this.editingMessages.get(i);
            if (message == null) {
                return message;
            }
            this.editingMessages.remove(i);
            return message;
        }
        TLRPC.Message message2 = this.sendingMessages.get(i);
        if (message2 != null) {
            this.sendingMessages.remove(i);
            if (!z) {
                long dialogId = MessageObject.getDialogId(message2);
                Integer num = (Integer) this.sendingMessagesIdDialogs.get(dialogId);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        this.sendingMessagesIdDialogs.remove(dialogId);
                    } else {
                        this.sendingMessagesIdDialogs.put(dialogId, Integer.valueOf(intValue));
                    }
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
                }
            }
        }
        return message2;
    }

    public int getSendingMessageId(long j) {
        for (int i = 0; i < this.sendingMessages.size(); i++) {
            TLRPC.Message valueAt = this.sendingMessages.valueAt(i);
            if (valueAt.dialog_id == j) {
                return valueAt.id;
            }
        }
        for (int i2 = 0; i2 < this.uploadMessages.size(); i2++) {
            TLRPC.Message valueAt2 = this.uploadMessages.valueAt(i2);
            if (valueAt2.dialog_id == j) {
                return valueAt2.id;
            }
        }
        return 0;
    }

    protected void putToUploadingMessages(MessageObject messageObject) {
        if (messageObject == null || messageObject.getId() > 0 || messageObject.scheduled) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = this.uploadMessages.indexOfKey(message.id) >= 0;
        this.uploadMessages.put(message.id, message);
        if (z) {
            return;
        }
        long dialogId = MessageObject.getDialogId(message);
        LongSparseArray longSparseArray = this.uploadingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(((Integer) longSparseArray.get(dialogId, 0)).intValue() + 1));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
    }

    protected void removeFromUploadingMessages(int i, boolean z) {
        TLRPC.Message message;
        if (i > 0 || z || (message = this.uploadMessages.get(i)) == null) {
            return;
        }
        this.uploadMessages.remove(i);
        long dialogId = MessageObject.getDialogId(message);
        Integer num = (Integer) this.uploadingMessagesIdDialogs.get(dialogId);
        if (num != null) {
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                this.uploadingMessagesIdDialogs.remove(dialogId);
            } else {
                this.uploadingMessagesIdDialogs.put(dialogId, Integer.valueOf(intValue));
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    public boolean isSendingMessage(int i) {
        return this.sendingMessages.indexOfKey(i) >= 0 || this.editingMessages.indexOfKey(i) >= 0;
    }

    public boolean isSendingPaidMessage(int i, int i2) {
        HashMap<String, ArrayList<DelayedMessage>> hashMap = this.delayedMessages;
        DelayedMessage delayedMessage = null;
        if (hashMap != null) {
            for (ArrayList<DelayedMessage> arrayList : hashMap.values()) {
                if (arrayList != null) {
                    Iterator<DelayedMessage> it = arrayList.iterator();
                    while (it.hasNext()) {
                        DelayedMessage next = it.next();
                        ArrayList<TLRPC.Message> arrayList2 = next.messages;
                        if (arrayList2 != null) {
                            Iterator<TLRPC.Message> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                TLRPC.Message next2 = it2.next();
                                if (next2 != null && next2.id == i) {
                                    delayedMessage = next;
                                    break;
                                }
                            }
                            if (delayedMessage != null) {
                                break;
                            }
                        }
                    }
                    if (delayedMessage != null) {
                        break;
                    }
                }
            }
        }
        if (delayedMessage != null && i2 >= 0 && i2 < delayedMessage.messages.size()) {
            i = delayedMessage.messages.get(i2).id;
        }
        return this.sendingMessages.indexOfKey(i) >= 0 || this.editingMessages.indexOfKey(i) >= 0;
    }

    public boolean isSendingMessageIdDialog(long j) {
        return ((Integer) this.sendingMessagesIdDialogs.get(j, 0)).intValue() > 0;
    }

    public boolean isUploadingMessageIdDialog(long j) {
        return ((Integer) this.uploadingMessagesIdDialogs.get(j, 0)).intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: performSendMessageRequestMulti, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$performSendMessageRequestMulti$52(final TLObject tLObject, final ArrayList<MessageObject> arrayList, final ArrayList<String> arrayList2, final ArrayList<Object> arrayList3, final DelayedMessage delayedMessage, final boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putToSendingMessages(arrayList.get(i).messageOwner, z);
        }
        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, arrayList, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$51(tLObject, arrayList, arrayList2, arrayList3, delayedMessage, z);
            }
        }) && BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, arrayList, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$52(tLObject, arrayList, arrayList2, arrayList3, delayedMessage, z);
            }
        })) {
            getConnectionsManager().sendRequest(tLObject, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda64
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$61(arrayList3, tLObject, arrayList, arrayList2, delayedMessage, z, tLObject2, tL_error);
                }
            }, (QuickAckDelegate) null, 68);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$61(ArrayList arrayList, final TLObject tLObject, final ArrayList arrayList2, final ArrayList arrayList3, final DelayedMessage delayedMessage, final boolean z, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            final int fileRefErrorIndex = FileRefController.getFileRefErrorIndex(tL_error.text);
            if (arrayList != null) {
                ArrayList arrayList4 = new ArrayList(arrayList);
                if (fileRefErrorIndex >= 0) {
                    int i = 0;
                    while (i < arrayList4.size()) {
                        arrayList4.set(i, fileRefErrorIndex == i ? arrayList4.get(i) : null);
                        i++;
                    }
                }
                getFileRefController().requestReference(arrayList4, tLObject, arrayList2, arrayList3, arrayList4, delayedMessage, Boolean.valueOf(z));
                return;
            }
            if (delayedMessage != null && !delayedMessage.getRetriedToSend(fileRefErrorIndex)) {
                delayedMessage.setRetriedToSend(fileRefErrorIndex, true);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda111
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequestMulti$53(tLObject, fileRefErrorIndex, delayedMessage, arrayList2, z);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda112
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$60(tL_error, tLObject2, z, arrayList2, arrayList3, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$53(TLObject tLObject, int i, DelayedMessage delayedMessage, ArrayList arrayList, boolean z) {
        boolean z2;
        int i2;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputMedia inputMedia2;
        int i3;
        TLRPC.TL_inputSingleMedia tL_inputSingleMedia;
        TLRPC.InputMedia inputMedia3;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            int size = tL_messages_sendMultiMedia.multi_media.size();
            z2 = false;
            while (i3 < size) {
                if (i < 0) {
                    if (delayedMessage.parentObjects.get(i3) == null) {
                    }
                    removeFromSendingMessages(((MessageObject) arrayList.get(i3)).getId(), z);
                    tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i3);
                    inputMedia3 = tL_inputSingleMedia.media;
                    if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                    }
                    delayedMessage.videoEditedInfo = delayedMessage.videoEditedInfos.get(i3);
                    delayedMessage.httpLocation = delayedMessage.httpLocations.get(i3);
                    TLRPC.PhotoSize photoSize = delayedMessage.locations.get(i3);
                    delayedMessage.photoSize = photoSize;
                    delayedMessage.performMediaUpload = true;
                    if (tL_inputSingleMedia.media.file != null) {
                    }
                    z2 = true;
                    performSendDelayedMessage(delayedMessage, i3);
                } else {
                    i3 = i != i3 ? i3 + 1 : 0;
                    removeFromSendingMessages(((MessageObject) arrayList.get(i3)).getId(), z);
                    tL_inputSingleMedia = tL_messages_sendMultiMedia.multi_media.get(i3);
                    inputMedia3 = tL_inputSingleMedia.media;
                    if (!(inputMedia3 instanceof TLRPC.TL_inputMediaPhoto)) {
                        tL_inputSingleMedia.media = delayedMessage.inputMedias.get(i3);
                    } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                        tL_inputSingleMedia.media = delayedMessage.inputMedias.get(i3);
                    }
                    delayedMessage.videoEditedInfo = delayedMessage.videoEditedInfos.get(i3);
                    delayedMessage.httpLocation = delayedMessage.httpLocations.get(i3);
                    TLRPC.PhotoSize photoSize2 = delayedMessage.locations.get(i3);
                    delayedMessage.photoSize = photoSize2;
                    delayedMessage.performMediaUpload = true;
                    if (tL_inputSingleMedia.media.file != null || photoSize2 != null) {
                        z2 = true;
                    }
                    performSendDelayedMessage(delayedMessage, i3);
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject).media;
            int size2 = tL_inputMediaPaidMedia.extended_media.size();
            z2 = false;
            while (i2 < size2) {
                if (i < 0) {
                    if (delayedMessage.parentObjects.get(i2) == null) {
                    }
                    removeFromSendingMessages(((MessageObject) arrayList.get(i2)).getId(), z);
                    inputMedia = tL_inputMediaPaidMedia.extended_media.get(i2);
                    if (!(inputMedia instanceof TLRPC.TL_inputMediaPhoto)) {
                    }
                    inputMedia = inputMedia2;
                    delayedMessage.videoEditedInfo = delayedMessage.videoEditedInfos.get(i2);
                    delayedMessage.httpLocation = delayedMessage.httpLocations.get(i2);
                    TLRPC.PhotoSize photoSize3 = delayedMessage.locations.get(i2);
                    delayedMessage.photoSize = photoSize3;
                    delayedMessage.performMediaUpload = true;
                    if (inputMedia.file != null) {
                    }
                    z2 = true;
                    performSendDelayedMessage(delayedMessage, i2);
                } else {
                    i2 = i != i2 ? i2 + 1 : 0;
                    removeFromSendingMessages(((MessageObject) arrayList.get(i2)).getId(), z);
                    inputMedia = tL_inputMediaPaidMedia.extended_media.get(i2);
                    if (!(inputMedia instanceof TLRPC.TL_inputMediaPhoto)) {
                        ArrayList<TLRPC.InputMedia> arrayList2 = tL_inputMediaPaidMedia.extended_media;
                        inputMedia2 = delayedMessage.inputMedias.get(i2);
                        arrayList2.set(i2, inputMedia2);
                    } else {
                        if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                            ArrayList<TLRPC.InputMedia> arrayList3 = tL_inputMediaPaidMedia.extended_media;
                            inputMedia2 = delayedMessage.inputMedias.get(i2);
                            arrayList3.set(i2, inputMedia2);
                        }
                        delayedMessage.videoEditedInfo = delayedMessage.videoEditedInfos.get(i2);
                        delayedMessage.httpLocation = delayedMessage.httpLocations.get(i2);
                        TLRPC.PhotoSize photoSize32 = delayedMessage.locations.get(i2);
                        delayedMessage.photoSize = photoSize32;
                        delayedMessage.performMediaUpload = true;
                        if (inputMedia.file != null || photoSize32 != null) {
                            z2 = true;
                        }
                        performSendDelayedMessage(delayedMessage, i2);
                    }
                    inputMedia = inputMedia2;
                    delayedMessage.videoEditedInfo = delayedMessage.videoEditedInfos.get(i2);
                    delayedMessage.httpLocation = delayedMessage.httpLocations.get(i2);
                    TLRPC.PhotoSize photoSize322 = delayedMessage.locations.get(i2);
                    delayedMessage.photoSize = photoSize322;
                    delayedMessage.performMediaUpload = true;
                    if (inputMedia.file != null) {
                    }
                    z2 = true;
                    performSendDelayedMessage(delayedMessage, i2);
                }
            }
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TLRPC.Message message = ((MessageObject) arrayList.get(i4)).messageOwner;
            getMessagesStorage().markMessageAsSendError(message, z ? 1 : 0);
            message.send_state = 2;
            message.errorAllowedPriceStars = 0L;
            message.errorNewPriceStars = 0L;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.id));
            processSentMessage(message.id);
            removeFromSendingMessages(message.id, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$60(TLRPC.TL_error tL_error, TLObject tLObject, final boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        final SendMessagesHelper sendMessagesHelper;
        char c;
        TLRPC.TL_error tL_error2;
        boolean z2;
        String str;
        int i;
        TLRPC.Updates updates;
        TLRPC.Message message;
        ArrayList arrayList3;
        int i2;
        TLRPC.Message message2;
        TLRPC.Updates updates2;
        LongSparseArray longSparseArray;
        SparseArray sparseArray;
        ArrayList arrayList4;
        int i3;
        String quickReplyName;
        int i4;
        TLRPC.MessageReplyHeader messageReplyHeader;
        ArrayList arrayList5 = arrayList;
        if (tL_error == null) {
            SparseArray sparseArray2 = new SparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList6 = updates3.updates;
            boolean z3 = z ? 1 : 0;
            int i5 = 0;
            LongSparseArray longSparseArray3 = null;
            while (i5 < arrayList6.size()) {
                TLRPC.Update update = arrayList6.get(i5);
                if (update instanceof TLRPC.TL_updateMessageID) {
                    TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) update;
                    longSparseArray2.put(tL_updateMessageID.random_id, Integer.valueOf(tL_updateMessageID.id));
                    arrayList6.remove(i5);
                    i5--;
                } else {
                    if (update instanceof TLRPC.TL_updateNewMessage) {
                        final TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update;
                        TLRPC.Message message3 = tL_updateNewMessage.message;
                        sparseArray2.put(message3.id, message3);
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda47
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$54(tL_updateNewMessage);
                            }
                        });
                        arrayList6.remove(i5);
                    } else if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                        final TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TLRPC.TL_updateNewChannelMessage) update;
                        final long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(updateChannelId));
                        if ((chat == null || chat.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                            if (longSparseArray3 == null) {
                                longSparseArray3 = new LongSparseArray();
                            }
                            long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                            SparseArray sparseArray3 = (SparseArray) longSparseArray3.get(dialogId);
                            if (sparseArray3 == null) {
                                sparseArray3 = new SparseArray();
                                longSparseArray3.put(dialogId, sparseArray3);
                            }
                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                            int i6 = messageReplyHeader2.reply_to_top_id;
                            if (i6 == 0) {
                                i6 = messageReplyHeader2.reply_to_msg_id;
                            }
                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i6);
                            if (messageReplies == null) {
                                messageReplies = new TLRPC.TL_messageReplies();
                                sparseArray3.put(i6, messageReplies);
                            }
                            TLRPC.MessageReplies messageReplies2 = messageReplies;
                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                            if (peer != null) {
                                messageReplies2.recent_repliers.add(0, peer);
                            }
                            messageReplies2.replies++;
                        }
                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                        sparseArray2.put(message4.id, message4);
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda48
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$55(tL_updateNewChannelMessage);
                            }
                        });
                        arrayList6.remove(i5);
                        i5--;
                        if (tL_updateNewChannelMessage.message.pinned) {
                            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda49
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$56(tL_updateNewChannelMessage, updateChannelId);
                                }
                            });
                        }
                    } else if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                        TLRPC.Message message5 = ((TLRPC.TL_updateNewScheduledMessage) update).message;
                        sparseArray2.put(message5.id, message5);
                        arrayList6.remove(i5);
                        i5--;
                        i4 = 1;
                        z3 = true;
                        i5 += i4;
                    } else if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                        if (arrayList.isEmpty()) {
                            i3 = 0;
                            quickReplyName = null;
                        } else {
                            i3 = 0;
                            quickReplyName = ((MessageObject) arrayList5.get(0)).getQuickReplyName();
                        }
                        quickRepliesController.processUpdate(update, quickReplyName, (arrayList.isEmpty() ? null : Integer.valueOf(((MessageObject) arrayList5.get(i3)).getQuickReplyId())).intValue());
                        TLRPC.Message message6 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                        sparseArray2.put(message6.id, message6);
                        arrayList6.remove(i5);
                    }
                    i5--;
                    i4 = 1;
                    z3 = false;
                    i5 += i4;
                }
                i4 = 1;
                i5 += i4;
            }
            if (longSparseArray3 != null) {
                getMessagesStorage().putChannelViews(null, null, longSparseArray3, true);
                i = 0;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, longSparseArray3, Boolean.TRUE);
            } else {
                i = 0;
            }
            int[] iArr = new int[1];
            iArr[i] = i;
            final int[] iArr2 = {i};
            final ArrayList arrayList7 = new ArrayList();
            int i7 = 0;
            while (i7 < arrayList.size()) {
                final MessageObject messageObject = (MessageObject) arrayList5.get(i7);
                String str2 = (String) arrayList2.get(i7);
                TLRPC.Message message7 = messageObject.messageOwner;
                int i8 = message7.id;
                ArrayList arrayList8 = new ArrayList();
                int i9 = i7;
                Integer num = (Integer) longSparseArray2.get(message7.random_id);
                if (num == null || (message = (TLRPC.Message) sparseArray2.get(num.intValue())) == null) {
                    updates = updates3;
                    z2 = true;
                    break;
                }
                MessageObject.getDialogId(message);
                arrayList8.add(message);
                if ((message.flags & 33554432) != 0) {
                    TLRPC.Message message8 = messageObject.messageOwner;
                    arrayList3 = arrayList8;
                    message8.ttl_period = message.ttl_period;
                    message8.flags |= 33554432;
                } else {
                    arrayList3 = arrayList8;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    arrayList4 = arrayList3;
                    i2 = i8;
                    updates2 = updates3;
                    longSparseArray = longSparseArray2;
                    sparseArray = sparseArray2;
                    message2 = message7;
                    updateMediaPaths((MessageObject) arrayList5.get(0), message, message.id, arrayList2, false, -1);
                } else {
                    i2 = i8;
                    message2 = message7;
                    updates2 = updates3;
                    longSparseArray = longSparseArray2;
                    sparseArray = sparseArray2;
                    arrayList4 = arrayList3;
                    updateMediaPaths(messageObject, message, message.id, str2, false);
                }
                final int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                message2.id = message.id;
                int i10 = message.quick_reply_shortcut_id;
                message2.quick_reply_shortcut_id = i10;
                if (i10 != 0) {
                    message2.flags |= TLObject.FLAG_30;
                }
                final long j = message.grouped_id;
                if (!z) {
                    Integer num2 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message.dialog_id));
                    if (num2 == null) {
                        num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(message.out, message.dialog_id));
                        getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message.dialog_id), num2);
                    }
                    message.unread = num2.intValue() < message.id;
                }
                iArr[0] = iArr[0] + 1;
                arrayList7.add(Integer.valueOf(i2));
                getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                message2.send_state = 0;
                message2.errorAllowedPriceStars = 0L;
                message2.errorNewPriceStars = 0L;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i2), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z3));
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i2), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z3));
                final boolean z4 = z3;
                final TLRPC.Message message9 = message2;
                final int i11 = i2;
                final ArrayList arrayList9 = arrayList4;
                final int[] iArr3 = iArr;
                final SparseArray sparseArray4 = sparseArray;
                arrayList7 = arrayList7;
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda50
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequestMulti$58(z4, message9, i11, arrayList9, iArr2, iArr3, z, messageObject, sparseArray4, arrayList7, j, mediaExistanceFlags);
                    }
                });
                i7 = i9 + 1;
                arrayList5 = arrayList;
                longSparseArray2 = longSparseArray;
                iArr = iArr;
                updates3 = updates2;
                sparseArray2 = sparseArray;
            }
            updates = updates3;
            z2 = false;
            c = 0;
            sendMessagesHelper = this;
            final TLRPC.Updates updates4 = updates;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$59(updates4);
                }
            });
            tL_error2 = tL_error;
        } else {
            sendMessagesHelper = this;
            c = 0;
            tL_error2 = tL_error;
            AlertsCreator.processError(sendMessagesHelper.currentAccount, tL_error2, null, tLObject2, new Object[0]);
            z2 = true;
        }
        if (z2) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i12);
                TLRPC.Message message10 = messageObject2.messageOwner;
                getMessagesStorage().markMessageAsSendError(message10, z ? 1 : 0);
                message10.send_state = 2;
                if (!z && tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    StarsController.getInstance(sendMessagesHelper.currentAccount);
                    message10.errorAllowedPriceStars = StarsController.getAllowedPaidStars(tLObject2);
                    message10.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                    StarsController starsController = StarsController.getInstance(sendMessagesHelper.currentAccount);
                    MessageObject[] messageObjectArr = new MessageObject[1];
                    messageObjectArr[c] = messageObject2;
                    starsController.showPriceChangedToast(Arrays.asList(messageObjectArr));
                    getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message10), message10);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i13 = NotificationCenter.messageSendError;
                Object[] objArr = new Object[1];
                objArr[c] = Integer.valueOf(message10.id);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
                sendMessagesHelper.processSentMessage(message10.id);
                sendMessagesHelper.removeFromSendingMessages(message10.id, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$54(TLRPC.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$55(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$56(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$58(final boolean z, final TLRPC.Message message, final int i, ArrayList arrayList, final int[] iArr, final int[] iArr2, final boolean z2, final MessageObject messageObject, final SparseArray sparseArray, final ArrayList arrayList2, final long j, final int i2) {
        int i3 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i), message.id, 0, false, i3, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i3, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$57(iArr, iArr2, z2, z, messageObject, sparseArray, arrayList2, message, i, j, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$57(int[] iArr, int[] iArr2, boolean z, boolean z2, MessageObject messageObject, SparseArray sparseArray, ArrayList arrayList, TLRPC.Message message, int i, long j, int i2) {
        char c;
        char c2;
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 != iArr2[0] || z == z2) {
            c = 0;
            c2 = 1;
        } else {
            long dialogId = messageObject.getDialogId();
            int keyAt = (!z2 || sparseArray.size() <= 1) ? 0 : sparseArray.keyAt(0);
            c2 = 1;
            c = 0;
            getMessagesController().deleteMessages(arrayList, null, null, dialogId, false, z ? 1 : 0, false, 0L, null, 0, z2 && !z, keyAt);
        }
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.messageReceivedByServer;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(message.id);
        Long valueOf3 = Long.valueOf(message.dialog_id);
        Long valueOf4 = Long.valueOf(j);
        Integer valueOf5 = Integer.valueOf(i2);
        Boolean valueOf6 = Boolean.valueOf(z2);
        Object[] objArr = new Object[7];
        objArr[c] = valueOf;
        objArr[c2] = valueOf2;
        objArr[2] = message;
        objArr[3] = valueOf3;
        objArr[4] = valueOf4;
        objArr[5] = valueOf5;
        objArr[6] = valueOf6;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, objArr);
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i5 = NotificationCenter.messageReceivedByServer2;
        Integer valueOf7 = Integer.valueOf(i);
        Integer valueOf8 = Integer.valueOf(message.id);
        Long valueOf9 = Long.valueOf(message.dialog_id);
        Long valueOf10 = Long.valueOf(j);
        Integer valueOf11 = Integer.valueOf(i2);
        Boolean valueOf12 = Boolean.valueOf(z2);
        Object[] objArr2 = new Object[7];
        objArr2[c] = valueOf7;
        objArr2[c2] = valueOf8;
        objArr2[2] = message;
        objArr2[3] = valueOf9;
        objArr2[4] = valueOf10;
        objArr2[5] = valueOf11;
        objArr2[6] = valueOf12;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i5, objArr2);
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequestMulti$59(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performSendMessageRequest(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, Object obj, HashMap<String, String> hashMap, boolean z) {
        lambda$performSendMessageRequest$66(tLObject, messageObject, str, null, false, delayedMessage, obj, hashMap, z);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    private org.telegram.messenger.SendMessagesHelper.DelayedMessage findMaxDelayedMessageForMessageId(int r12, long r13) {
        /*
            r11 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<org.telegram.messenger.SendMessagesHelper$DelayedMessage>> r0 = r11.delayedMessages
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        Ld:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r5 = 0
            r6 = 0
        L25:
            if (r6 >= r4) goto Ld
            java.lang.Object r7 = r3.get(r6)
            org.telegram.messenger.SendMessagesHelper$DelayedMessage r7 = (org.telegram.messenger.SendMessagesHelper.DelayedMessage) r7
            int r8 = r7.type
            r9 = 4
            if (r8 == r9) goto L34
            if (r8 != 0) goto L6b
        L34:
            long r8 = r7.peer
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 != 0) goto L6b
            org.telegram.messenger.MessageObject r8 = r7.obj
            if (r8 == 0) goto L43
            int r8 = r8.getId()
            goto L61
        L43:
            java.util.ArrayList<org.telegram.messenger.MessageObject> r8 = r7.messageObjects
            if (r8 == 0) goto L60
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L60
            java.util.ArrayList<org.telegram.messenger.MessageObject> r8 = r7.messageObjects
            int r9 = r8.size()
            int r9 = r9 + (-1)
            java.lang.Object r8 = r8.get(r9)
            org.telegram.messenger.MessageObject r8 = (org.telegram.messenger.MessageObject) r8
            int r8 = r8.getId()
            goto L61
        L60:
            r8 = 0
        L61:
            if (r8 == 0) goto L6b
            if (r8 <= r12) goto L6b
            if (r1 != 0) goto L6b
            if (r2 >= r8) goto L6b
            r1 = r7
            r2 = r8
        L6b:
            int r6 = r6 + 1
            goto L25
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.findMaxDelayedMessageForMessageId(int, long):org.telegram.messenger.SendMessagesHelper$DelayedMessage");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: performSendMessageRequest, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$performSendMessageRequest$66(final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap<String, String> hashMap, final boolean z2) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        ArrayList<DelayedMessageSendAfterRequest> arrayList;
        if (!(tLObject instanceof TLRPC.TL_messages_editMessage) && z && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(messageObject.getId(), messageObject.getDialogId())) != null) {
            findMaxDelayedMessageForMessageId.addDelayedRequest(tLObject, messageObject, str, obj, delayedMessage2, delayedMessage != null ? delayedMessage.scheduled : false);
            if (delayedMessage == null || (arrayList = delayedMessage.requests) == null) {
                return;
            }
            findMaxDelayedMessageForMessageId.requests.addAll(arrayList);
            return;
        }
        final TLRPC.Message message = messageObject.messageOwner;
        putToSendingMessages(message, z2);
        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, messageObject, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda87
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$62(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
            }
        }) && BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, messageObject, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda88
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$63(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
            }
        })) {
            message.reqId = getConnectionsManager().sendRequest(tLObject, new RequestDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda89
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$81(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2, message, tLObject2, tL_error);
                }
            }, new QuickAckDelegate() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda90
                @Override // org.telegram.tgnet.QuickAckDelegate
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$83(message);
                }
            }, (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
            if (delayedMessage != null) {
                delayedMessage.sendDelayedRequests();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$81(final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap hashMap, final boolean z2, final TLRPC.Message message, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tL_error != null && (((tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_editMessage)) && FileRefController.isFileRefError(tL_error.text))) {
            if (FileRefController.isFileRefErrorCover(tL_error.text)) {
                if (removeCoverFromRequest(tLObject)) {
                    lambda$performSendMessageRequest$66(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
                    return;
                }
            } else if (obj != null) {
                getFileRefController().requestReference(obj, tLObject, messageObject, str, delayedMessage, Boolean.valueOf(z), delayedMessage2, Boolean.valueOf(z2));
                return;
            } else if (delayedMessage2 != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequest$64(message, z2, tLObject, delayedMessage2);
                    }
                });
                return;
            }
        }
        if (tL_error != null && (tLObject instanceof TLRPC.TL_messages_sendMedia)) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                    getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda3
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            SendMessagesHelper.this.lambda$performSendMessageRequest$65(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2, (TLRPC.EmojiGameInfo) obj2, (TLRPC.TL_error) obj3);
                        }
                    });
                    return;
                } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    final TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                    final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.this.lambda$performSendMessageRequest$67(safeLastFragment, tL_inputMediaStakeDice, tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$70(tL_error, message, tLObject2, messageObject, str, z2, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$80(z2, tL_error, message, tLObject2, messageObject, str, tLObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$64(TLRPC.Message message, boolean z, TLObject tLObject, DelayedMessage delayedMessage) {
        removeFromSendingMessages(message.id, z);
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            }
        }
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$65(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z, DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z2, TLRPC.EmojiGameInfo emojiGameInfo, TLRPC.TL_error tL_error) {
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            String str2 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if (inputMedia instanceof TLRPC.TL_inputMediaStakeDice) {
                ((TLRPC.TL_inputMediaStakeDice) inputMedia).game_hash = str2;
            }
            lambda$performSendMessageRequest$66(tL_messages_sendMedia, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$67(BaseFragment baseFragment, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap hashMap, final boolean z2) {
        new TONIntroActivity.StarsNeededSheet(baseFragment.getContext(), baseFragment.getResourceProvider(), AmountUtils$Amount.fromNano(tL_inputMediaStakeDice.ton_amount, AmountUtils$Currency.TON), false, new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda99
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$66(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, hashMap, z2);
            }
        }).show();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        cancelSendingMessage(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$70(TLRPC.TL_error tL_error, final TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, final boolean z, TLObject tLObject2) {
        int i = 0;
        TLRPC.Message message2 = null;
        if (tL_error == null) {
            String str2 = message.attachPath;
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                TLRPC.Update update = arrayList.get(i);
                if (update instanceof TLRPC.TL_updateEditMessage) {
                    message2 = ((TLRPC.TL_updateEditMessage) update).message;
                    break;
                }
                if (update instanceof TLRPC.TL_updateEditChannelMessage) {
                    message2 = ((TLRPC.TL_updateEditChannelMessage) update).message;
                    break;
                }
                if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                    message2 = ((TLRPC.TL_updateNewScheduledMessage) update).message;
                    break;
                } else {
                    if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                        QuickRepliesController.getInstance(this.currentAccount).processUpdate(update, MessageObject.getQuickReplyName(message), MessageObject.getQuickReplyId(message));
                        message2 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                        break;
                    }
                    i++;
                }
            }
            TLRPC.Message message3 = message2;
            if (message3 != null) {
                ImageLoader.saveMessageThumbs(message3);
                updateMediaPaths(messageObject, message3, message3.id, str, false);
            }
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda104
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$69(updates, message, z);
                }
            });
            return;
        }
        AlertsCreator.processError(this.currentAccount, tL_error, null, tLObject2, new Object[0]);
        removeFromSendingMessages(message.id, z);
        revertEditingMessageObject(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$69(TLRPC.Updates updates, final TLRPC.Message message, final boolean z) {
        getMessagesController().processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda83
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$68(message, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$68(TLRPC.Message message, boolean z) {
        processSentMessage(message.id);
        removeFromSendingMessages(message.id, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    public /* synthetic */ void lambda$performSendMessageRequest$80(final boolean z, TLRPC.TL_error tL_error, final TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, TLObject tLObject2) {
        TLRPC.TL_error tL_error2;
        boolean z2;
        ?? r10;
        String str2;
        int i;
        final boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = z;
        if (tL_error == null) {
            int i5 = message.id;
            final ArrayList arrayList = new ArrayList();
            boolean z12 = message.date == 2147483646;
            if (tLObject instanceof TLRPC.TL_updateShortSentMessage) {
                final TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject;
                i = i5;
                z4 = false;
                updateMediaPaths(messageObject, null, tL_updateShortSentMessage.id, null, false);
                int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                int i6 = tL_updateShortSentMessage.id;
                message.id = i6;
                message.local_id = i6;
                message.date = tL_updateShortSentMessage.date;
                message.entities = tL_updateShortSentMessage.entities;
                message.out = tL_updateShortSentMessage.out;
                if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                    message.ttl_period = tL_updateShortSentMessage.ttl_period;
                    message.flags |= 33554432;
                }
                TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                if (messageMedia != null) {
                    message.media = messageMedia;
                    message.flags |= 512;
                    ImageLoader.saveMessageThumbs(message);
                }
                TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                    message.message = tL_updateShortSentMessage.message;
                }
                if (!message.entities.isEmpty()) {
                    message.flags |= 128;
                }
                Integer num = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message.dialog_id));
                if (num == null) {
                    num = Integer.valueOf(getMessagesStorage().getDialogReadMax(message.out, message.dialog_id));
                    getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message.dialog_id), num);
                }
                message.unread = num.intValue() < message.id;
                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda67
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequest$71(tL_updateShortSentMessage);
                    }
                });
                arrayList.add(message);
                i2 = mediaExistanceFlags;
                z3 = false;
            } else {
                i = i5;
                if (tLObject instanceof TLRPC.Updates) {
                    final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList2 = updates.updates;
                    boolean z13 = z11 ? 1 : 0;
                    int i7 = 0;
                    TLRPC.Message message2 = null;
                    LongSparseArray longSparseArray = null;
                    while (i7 < arrayList2.size()) {
                        TLRPC.Update update = arrayList2.get(i7);
                        if (update instanceof TLRPC.TL_updateNewMessage) {
                            final TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update;
                            TLRPC.Message message3 = tL_updateNewMessage.message;
                            if (message3.action == null) {
                                arrayList.add(message3);
                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda68
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$performSendMessageRequest$72(tL_updateNewMessage);
                                    }
                                });
                                arrayList2.remove(i7);
                                i7--;
                                z7 = z13;
                                message2 = message3;
                                i4 = 1;
                            }
                            i4 = 1;
                            z7 = z13;
                        } else {
                            if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                                final TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TLRPC.TL_updateNewChannelMessage) update;
                                final long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(updateChannelId));
                                if ((chat == null || chat.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                    if (longSparseArray == null) {
                                        longSparseArray = new LongSparseArray();
                                    }
                                    long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                                    SparseArray sparseArray = (SparseArray) longSparseArray.get(dialogId);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        longSparseArray.put(dialogId, sparseArray);
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                    int i8 = messageReplyHeader2.reply_to_top_id;
                                    if (i8 == 0) {
                                        i8 = messageReplyHeader2.reply_to_msg_id;
                                    }
                                    TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i8);
                                    if (messageReplies == null) {
                                        messageReplies = new TLRPC.TL_messageReplies();
                                        sparseArray.put(i8, messageReplies);
                                    }
                                    TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                    if (peer != null) {
                                        messageReplies.recent_repliers.add(0, peer);
                                    }
                                    messageReplies.replies++;
                                }
                                message2 = tL_updateNewChannelMessage.message;
                                arrayList.add(message2);
                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda69
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.this.lambda$performSendMessageRequest$73(tL_updateNewChannelMessage);
                                    }
                                });
                                arrayList2.remove(i7);
                                i7--;
                                if (tL_updateNewChannelMessage.message.pinned) {
                                    Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda70
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SendMessagesHelper.this.lambda$performSendMessageRequest$74(tL_updateNewChannelMessage, updateChannelId);
                                        }
                                    });
                                }
                                i4 = 1;
                            } else if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                                TLRPC.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TLRPC.TL_updateNewScheduledMessage) update;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((TLRPC.Message) arrayList.get(i9)).id == tL_updateNewScheduledMessage.message.id) {
                                        arrayList.remove(i9);
                                        break;
                                    }
                                    i9++;
                                }
                                message2 = tL_updateNewScheduledMessage.message;
                                arrayList.add(message2);
                                arrayList2.remove(i7);
                                i7--;
                                i4 = 1;
                                z7 = true;
                            } else if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                                QuickRepliesController.getInstance(this.currentAccount).processUpdate(update, messageObject.getQuickReplyName(), messageObject.getQuickReplyId());
                                message2 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                                arrayList.add(message2);
                                arrayList2.remove(i7);
                                i7--;
                                z7 = z13;
                                i4 = 1;
                            } else {
                                if (update instanceof TLRPC.TL_updateDeleteScheduledMessages) {
                                    TLRPC.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TLRPC.TL_updateDeleteScheduledMessages) update;
                                    if (messageObject.getDialogId() == DialogObject.getPeerDialogId(tL_updateDeleteScheduledMessages.peer)) {
                                        Iterator<Integer> it = tL_updateDeleteScheduledMessages.messages.iterator();
                                        while (it.hasNext()) {
                                            int intValue = it.next().intValue();
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= arrayList.size()) {
                                                    break;
                                                }
                                                if (((TLRPC.Message) arrayList.get(i10)).id == intValue) {
                                                    arrayList.remove(i10);
                                                    break;
                                                }
                                                i10++;
                                            }
                                        }
                                        i4 = 1;
                                        arrayList2.remove(i7);
                                        i7--;
                                    }
                                }
                                i4 = 1;
                                z7 = z13;
                            }
                            z7 = false;
                        }
                        i7 += i4;
                        z13 = z7;
                    }
                    if (longSparseArray != null) {
                        getMessagesStorage().putChannelViews(null, null, longSparseArray, true);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, longSparseArray, Boolean.TRUE);
                    }
                    if (message2 != null) {
                        MessageObject.getDialogId(message2);
                        boolean z14 = (!z12 || message2.date == 2147483646) ? z13 : false;
                        ImageLoader.saveMessageThumbs(message2);
                        if (!z14) {
                            Integer num2 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message2.dialog_id));
                            if (num2 == null) {
                                num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(message2.out, message2.dialog_id));
                                getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message2.dialog_id), num2);
                            }
                            message2.unread = num2.intValue() < message2.id;
                        }
                        TLRPC.Message message4 = messageObject.messageOwner;
                        message4.post_author = message2.post_author;
                        if ((message2.flags & 33554432) != 0) {
                            message4.ttl_period = message2.ttl_period;
                            message4.flags |= 33554432;
                        }
                        message4.entities = message2.entities;
                        int i11 = message2.quick_reply_shortcut_id;
                        message4.quick_reply_shortcut_id = i11;
                        if (i11 != 0) {
                            message4.flags |= TLObject.FLAG_30;
                        }
                        updateMediaPaths(messageObject, message2, message2.id, str, false);
                        i3 = messageObject.getMediaExistanceFlags();
                        message.id = message2.id;
                        z5 = z14;
                        z6 = false;
                    } else {
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb = new StringBuilder();
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                sb.append(arrayList2.get(i12).getClass().getSimpleName());
                                sb.append(", ");
                            }
                            FileLog.d("can't find message in updates " + ((Object) sb));
                        }
                        z5 = z13;
                        i3 = 0;
                        z6 = true;
                    }
                    Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda71
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.this.lambda$performSendMessageRequest$75(updates);
                        }
                    });
                    i2 = i3;
                    z4 = z6;
                    z3 = z5;
                } else {
                    z3 = z;
                    i2 = 0;
                    z4 = false;
                }
            }
            if (MessageObject.isLiveLocationMessage(message) && message.via_bot_id == 0 && TextUtils.isEmpty(message.via_bot_name)) {
                getLocationController().addSharingLocation(message);
            }
            if (z4) {
                z8 = z;
            } else {
                getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                message.send_state = 0;
                message.errorNewPriceStars = 0L;
                message.errorAllowedPriceStars = 0L;
                boolean z15 = z;
                if (z15 != z3) {
                    final ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Integer.valueOf(i));
                    final ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
                    final int i13 = i;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda72
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.this.lambda$performSendMessageRequest$77(arrayList, z, z3, message, arrayList3, arrayList4, i13);
                        }
                    });
                    z8 = z15;
                } else {
                    z9 = z4;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
                    final int i14 = i;
                    final int i15 = i2;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda73
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.this.lambda$performSendMessageRequest$79(z, message, i14, arrayList, i15);
                        }
                    });
                    z10 = z15;
                    tL_error2 = tL_error;
                    z2 = z9;
                    r10 = z10;
                }
            }
            z9 = z4;
            z10 = z8;
            tL_error2 = tL_error;
            z2 = z9;
            r10 = z10;
        } else {
            tL_error2 = tL_error;
            AlertsCreator.processError(this.currentAccount, tL_error2, null, tLObject2, new Object[0]);
            z2 = true;
            r10 = z11;
        }
        if (z2) {
            getMessagesStorage().markMessageAsSendError(message, r10);
            message.send_state = 2;
            if (tL_error2 != null && (str2 = tL_error2.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                StarsController.getInstance(this.currentAccount);
                message.errorAllowedPriceStars = StarsController.getAllowedPaidStars(tLObject2);
                message.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                StarsController.getInstance(this.currentAccount).showPriceChangedToast(Arrays.asList(messageObject));
                getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message), message);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.id));
            processSentMessage(message.id);
            removeFromSendingMessages(message.id, r10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$71(TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$72(TLRPC.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$73(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$74(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$75(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$77(ArrayList arrayList, final boolean z, final boolean z2, final TLRPC.Message message, final ArrayList arrayList2, final ArrayList arrayList3, final int i) {
        getMessagesStorage().putMessages(arrayList, true, false, false, 0, false, !z ? 1 : 0, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$76(z2, message, arrayList2, z, arrayList3, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$76(boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        getMessagesController().deleteMessages(arrayList, null, null, message.dialog_id, false, z2 ? 1 : 0, false, 0L, null, 0, !z2 && z, (!z || message == null) ? 0 : message.id);
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, z ? 1 : 0);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$79(final boolean z, final TLRPC.Message message, final int i, ArrayList arrayList, final int i2) {
        int i3 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i), message.id, 0, false, z ? 1 : 0, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i3, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$78(message, i, i2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$78(TLRPC.Message message, int i, int i2, boolean z) {
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$83(final TLRPC.Message message) {
        final int i = message.id;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$82(message, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSendMessageRequest$82(TLRPC.Message message, int i) {
        message.send_state = 0;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByAck, Integer.valueOf(i));
    }

    private boolean removeCoverFromRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                tL_inputMediaUploadedDocument.video_cover = null;
                tL_inputMediaUploadedDocument.flags &= -65;
                return true;
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                tL_inputMediaDocument.video_cover = null;
                tL_inputMediaDocument.flags &= -9;
                return true;
            }
            if (!(inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal)) {
                return false;
            }
            TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
            tL_inputMediaDocumentExternal.video_cover = null;
            tL_inputMediaDocumentExternal.flags &= -5;
            return true;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_editMessage)) {
            return false;
        }
        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_editMessage) tLObject).media;
        if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
            tL_inputMediaUploadedDocument2.video_cover = null;
            tL_inputMediaUploadedDocument2.flags &= -65;
            return true;
        }
        if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            tL_inputMediaDocument2.video_cover = null;
            tL_inputMediaDocument2.flags &= -9;
            return true;
        }
        if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal)) {
            return false;
        }
        TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
        tL_inputMediaDocumentExternal2.video_cover = null;
        tL_inputMediaDocumentExternal2.flags &= -5;
        return true;
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.Message message, int i, String str, boolean z) {
        updateMediaPaths(messageObject, message, i, Collections.singletonList(str), z, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x06ff, code lost:
    
        if (r7.h > 90) goto L325;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateMediaPaths(MessageObject messageObject, TLRPC.Message message, int i, List<String> list, boolean z, int i2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        boolean z2;
        TLRPC.PhotoSize photoSize;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia2;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia3;
        String str;
        String str2;
        String str3;
        TLRPC.Message message2;
        byte[] bArr;
        TLRPC.MessageMedia messageMedia3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        byte[] bArr2;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia4;
        TLRPC.Message message3;
        String str4;
        MessageObject messageObject2;
        TLRPC.Photo photo;
        TLRPC.MessageMedia messageMedia4;
        String str5;
        TLRPC.Message message4;
        String str6;
        String str7;
        boolean z3;
        TLRPC.Message message5;
        String str8;
        String str9;
        File file;
        VideoEditedInfo videoEditedInfo;
        TLRPC.PhotoSize photoSize2;
        String str10;
        TLRPC.Message message6;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia5;
        String str11;
        String str12;
        File file2;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia6;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia7;
        TLRPC.PhotoSize photoSize3;
        TLRPC.PhotoSize photoSize4;
        TLObject tLObject;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia8;
        TLRPC.PhotoSize photoSize5;
        TLObject tLObject2;
        boolean z4;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia9;
        TLRPC.Document document;
        TLRPC.Photo photo2;
        TLRPC.MessageMedia messageMedia5;
        TLRPC.WebPage webPage;
        TLRPC.Document document2;
        TLRPC.MessageMedia messageMedia6;
        TLRPC.WebPage webPage2;
        TLRPC.Photo photo3;
        TLRPC.MessageMedia messageMedia7;
        TLRPC.Document document3;
        TLRPC.MessageMedia messageMedia8;
        TLRPC.Photo photo4;
        TLRPC.MessageMedia messageMedia9;
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia10;
        String sb;
        TLRPC.Message message7 = message;
        TLRPC.Message message8 = messageObject.messageOwner;
        String str13 = (list.isEmpty() || Math.max(0, i2) >= list.size()) ? null : list.get(Math.max(0, i2));
        TLRPC.MessageMedia messageMedia10 = message7 == null ? null : message7.media;
        TLRPC.MessageMedia messageMedia11 = message8 == null ? null : message8.media;
        TLRPC.MessageMedia messageMedia12 = message8.media;
        if (messageMedia12 != null) {
            if (messageMedia12.storyItem != null) {
                message7.media = messageMedia12;
            } else {
                if (messageObject.isLiveLocation()) {
                    TLRPC.MessageMedia messageMedia13 = message7.media;
                    if (messageMedia13 instanceof TLRPC.TL_messageMediaGeoLive) {
                        message8.media.period = messageMedia13.period;
                    }
                }
                if (messageObject.isDice()) {
                    TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) message8.media;
                    TLRPC.TL_messageMediaDice tL_messageMediaDice2 = (TLRPC.TL_messageMediaDice) message7.media;
                    tL_messageMediaDice.value = tL_messageMediaDice2.value;
                    tL_messageMediaDice.flags = tL_messageMediaDice2.flags;
                    tL_messageMediaDice.game_outcome = tL_messageMediaDice2.game_outcome;
                    StarsController.getInstance(this.currentAccount, true).invalidateBalance();
                } else {
                    TLRPC.MessageMedia messageMedia14 = message8.media;
                    TLRPC.Photo photo5 = messageMedia14.photo;
                    if (photo5 != null) {
                        photoSize5 = FileLoader.getClosestPhotoSizeWithSize(photo5.sizes, 40);
                        photoSize = (message7 == null || (messageMedia8 = message7.media) == null || (photo4 = messageMedia8.photo) == null) ? photoSize5 : FileLoader.getClosestPhotoSizeWithSize(photo4.sizes, 40);
                        tLObject2 = message8.media.photo;
                    } else {
                        TLRPC.Document document4 = messageMedia14.document;
                        if (document4 != null) {
                            photoSize5 = FileLoader.getClosestPhotoSizeWithSize(document4.thumbs, 40);
                            photoSize = (message7 == null || (messageMedia7 = message7.media) == null || (document3 = messageMedia7.document) == null) ? photoSize5 : FileLoader.getClosestPhotoSizeWithSize(document3.thumbs, 40);
                            tLObject2 = message8.media.document;
                        } else {
                            TLRPC.WebPage webPage3 = messageMedia14.webpage;
                            if (webPage3 != null) {
                                TLRPC.Photo photo6 = webPage3.photo;
                                if (photo6 != null) {
                                    photoSize5 = FileLoader.getClosestPhotoSizeWithSize(photo6.sizes, 40);
                                    photoSize = (message7 == null || (messageMedia6 = message7.media) == null || (webPage2 = messageMedia6.webpage) == null || (photo3 = webPage2.photo) == null) ? photoSize5 : FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 40);
                                    tLObject2 = message8.media.webpage.photo;
                                } else {
                                    TLRPC.Document document5 = webPage3.document;
                                    if (document5 != null) {
                                        photoSize5 = FileLoader.getClosestPhotoSizeWithSize(document5.thumbs, 40);
                                        photoSize = (message7 == null || (messageMedia5 = message7.media) == null || (webPage = messageMedia5.webpage) == null || (document2 = webPage.document) == null) ? photoSize5 : FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 40);
                                        tLObject2 = message8.media.webpage.document;
                                    }
                                }
                            } else if ((messageMedia14 instanceof TLRPC.TL_messageMediaPaidMedia) && (messageMedia10 instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia14;
                                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageMedia10;
                                if (tL_messageMediaPaidMedia.extended_media.isEmpty() || tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                                    return;
                                }
                                if (i2 == -1) {
                                    int i3 = 0;
                                    while (i3 < tL_messageMediaPaidMedia.extended_media.size()) {
                                        updateMediaPaths(messageObject, message, i, list, z, i3);
                                        i3++;
                                        tL_messageMediaPaidMedia = tL_messageMediaPaidMedia;
                                    }
                                    return;
                                }
                                boolean z5 = tL_messageMediaPaidMedia2.extended_media.size() > 1;
                                if (i2 < 0 || i2 >= tL_messageMediaPaidMedia2.extended_media.size()) {
                                    return;
                                }
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i2);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia11 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia;
                                    tL_messageExtendedMedia6 = tL_messageExtendedMedia11;
                                    messageMedia10 = tL_messageExtendedMedia11.media;
                                } else {
                                    tL_messageExtendedMedia6 = null;
                                }
                                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i2);
                                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                                    tL_messageExtendedMedia7 = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                                    messageMedia11 = tL_messageExtendedMedia7.media;
                                    TLRPC.Photo photo7 = messageMedia11.photo;
                                    if (photo7 != null) {
                                        photoSize3 = FileLoader.getClosestPhotoSizeWithSize(photo7.sizes, 40);
                                        photoSize4 = (messageMedia10 == null || (photo2 = messageMedia10.photo) == null) ? photoSize3 : FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 40);
                                        tLObject = messageMedia11.photo;
                                    } else {
                                        TLRPC.Document document6 = messageMedia11.document;
                                        if (document6 != null) {
                                            photoSize3 = FileLoader.getClosestPhotoSizeWithSize(document6.thumbs, 40);
                                            photoSize4 = (messageMedia10 == null || (document = messageMedia10.document) == null) ? photoSize3 : FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                                            tLObject = messageMedia11.document;
                                        }
                                    }
                                    boolean z6 = z5;
                                    tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
                                    photoSize5 = photoSize3;
                                    tLObject2 = tLObject;
                                    z4 = z6;
                                    TLRPC.PhotoSize photoSize6 = photoSize4;
                                    tL_messageExtendedMedia9 = tL_messageExtendedMedia6;
                                    photoSize = photoSize6;
                                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || !(photoSize5 instanceof TLRPC.TL_photoStrippedSize)) {
                                        messageMedia9 = messageMedia10;
                                        tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
                                        tL_messageExtendedMedia = tL_messageExtendedMedia9;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("stripped");
                                        messageMedia9 = messageMedia10;
                                        sb2.append(FileRefController.getKeyForParentObject(messageObject));
                                        String sb3 = sb2.toString();
                                        if (message7 != null) {
                                            sb = "stripped" + FileRefController.getKeyForParentObject(message);
                                            tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
                                            tL_messageExtendedMedia = tL_messageExtendedMedia9;
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("strippedmessage");
                                            sb4.append(i);
                                            sb4.append("_");
                                            tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
                                            tL_messageExtendedMedia = tL_messageExtendedMedia9;
                                            sb4.append(messageObject.getChannelId());
                                            sb4.append("_");
                                            sb4.append(messageObject.scheduled);
                                            sb = sb4.toString();
                                        }
                                        ImageLoader.getInstance().replaceImageInCache(sb3, sb, ImageLocation.getForObject(photoSize, tLObject2), z);
                                    }
                                    messageMedia = messageMedia9;
                                    messageMedia2 = messageMedia11;
                                    z2 = z4;
                                    tL_messageExtendedMedia2 = tL_messageExtendedMedia10;
                                } else {
                                    tL_messageExtendedMedia7 = null;
                                }
                                photoSize3 = null;
                                photoSize4 = null;
                                tLObject = null;
                                boolean z62 = z5;
                                tL_messageExtendedMedia8 = tL_messageExtendedMedia7;
                                photoSize5 = photoSize3;
                                tLObject2 = tLObject;
                                z4 = z62;
                                TLRPC.PhotoSize photoSize62 = photoSize4;
                                tL_messageExtendedMedia9 = tL_messageExtendedMedia6;
                                photoSize = photoSize62;
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                }
                                messageMedia9 = messageMedia10;
                                tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
                                tL_messageExtendedMedia = tL_messageExtendedMedia9;
                                messageMedia = messageMedia9;
                                messageMedia2 = messageMedia11;
                                z2 = z4;
                                tL_messageExtendedMedia2 = tL_messageExtendedMedia10;
                            }
                        }
                    }
                    tL_messageExtendedMedia8 = null;
                    tL_messageExtendedMedia9 = null;
                    z4 = false;
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    }
                    messageMedia9 = messageMedia10;
                    tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
                    tL_messageExtendedMedia = tL_messageExtendedMedia9;
                    messageMedia = messageMedia9;
                    messageMedia2 = messageMedia11;
                    z2 = z4;
                    tL_messageExtendedMedia2 = tL_messageExtendedMedia10;
                }
            }
            photoSize5 = null;
            photoSize = null;
            tLObject2 = null;
            tL_messageExtendedMedia8 = null;
            tL_messageExtendedMedia9 = null;
            z4 = false;
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
            }
            messageMedia9 = messageMedia10;
            tL_messageExtendedMedia10 = tL_messageExtendedMedia8;
            tL_messageExtendedMedia = tL_messageExtendedMedia9;
            messageMedia = messageMedia9;
            messageMedia2 = messageMedia11;
            z2 = z4;
            tL_messageExtendedMedia2 = tL_messageExtendedMedia10;
        } else {
            messageMedia = messageMedia10;
            messageMedia2 = messageMedia11;
            z2 = false;
            photoSize = null;
            tL_messageExtendedMedia = null;
            tL_messageExtendedMedia2 = null;
        }
        if (message7 == null) {
            return;
        }
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia12 = tL_messageExtendedMedia;
        if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia2.photo != null) {
            if (messageMedia.ttl_seconds != 0 || messageObject.scheduled) {
                photoSize2 = photoSize;
                str10 = "s";
                message6 = message8;
                tL_messageExtendedMedia5 = tL_messageExtendedMedia2;
            } else {
                int i4 = messageObject.sentHighQuality ? 6 : 0;
                MessagesStorage messagesStorage = getMessagesStorage();
                tL_messageExtendedMedia5 = tL_messageExtendedMedia2;
                TLRPC.Photo photo8 = messageMedia.photo;
                message6 = message8;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("sent_");
                photoSize2 = photoSize;
                str10 = "s";
                sb5.append(message7.peer_id.channel_id);
                sb5.append("_");
                sb5.append(message7.id);
                sb5.append("_");
                sb5.append(DialogObject.getPeerDialogId(message7.peer_id));
                sb5.append("_");
                sb5.append(1);
                sb5.append("_");
                sb5.append(MessageObject.getMediaSize(messageMedia2));
                messagesStorage.putSentFile(str13, photo8, i4, sb5.toString());
            }
            if (messageMedia2.photo.sizes.size() == 1 && (messageMedia2.photo.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                messageMedia2.photo.sizes = messageMedia.photo.sizes;
            } else {
                int i5 = 0;
                while (i5 < messageMedia2.photo.sizes.size()) {
                    TLRPC.PhotoSize photoSize7 = messageMedia2.photo.sizes.get(i5);
                    if (photoSize7 != null && photoSize7.location != null && photoSize7.type != null) {
                        for (int i6 = 0; i6 < messageMedia.photo.sizes.size(); i6++) {
                            TLRPC.PhotoSize photoSize8 = messageMedia.photo.sizes.get(i6);
                            if (photoSize8 != null && photoSize8.location != null && !(photoSize8 instanceof TLRPC.TL_photoSizeEmpty) && (str12 = photoSize8.type) != null && ((photoSize7.location.volume_id == -2147483648L && str12.equals(photoSize7.type)) || (photoSize8.w == photoSize7.w && photoSize8.h == photoSize7.h))) {
                                String str14 = photoSize7.location.volume_id + "_" + photoSize7.location.local_id;
                                String str15 = photoSize8.location.volume_id + "_" + photoSize8.location.local_id;
                                if (!str14.equals(str15)) {
                                    File file3 = new File(FileLoader.getDirectory(4), str14 + ".jpg");
                                    if (messageMedia.ttl_seconds == 0 && ((messageMedia.photo.sizes.size() == 1 || photoSize8.w > 90 || photoSize8.h > 90) && !z2)) {
                                        file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(photoSize8);
                                    } else {
                                        file2 = new File(FileLoader.getDirectory(4), str15 + ".jpg");
                                    }
                                    file3.renameTo(file2);
                                    ImageLoader.getInstance().replaceImageInCache(str14, str15, ImageLocation.getForPhoto(photoSize8, messageMedia.photo), z);
                                    photoSize7.location = photoSize8.location;
                                    photoSize7.size = photoSize8.size;
                                }
                                message7 = message;
                            }
                        }
                        String str16 = photoSize7.location.volume_id + "_" + photoSize7.location.local_id;
                        new File(FileLoader.getDirectory(4), str16 + ".jpg").delete();
                        str11 = str10;
                        if (!str11.equals(photoSize7.type) || photoSize2 == null) {
                            message7 = message;
                        } else {
                            TLRPC.PhotoSize photoSize9 = photoSize2;
                            messageMedia2.photo.sizes.set(i5, photoSize9);
                            ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize9, messageMedia.photo);
                            message7 = message;
                            ImageLoader.getInstance().replaceImageInCache(str16, forPhoto.getKey(message7, null, false), forPhoto, z);
                        }
                        i5++;
                        str10 = str11;
                    }
                    str11 = str10;
                    i5++;
                    str10 = str11;
                }
            }
            if (!z2) {
                TLRPC.Message message9 = message6;
                message9.message = message7.message;
                message7.attachPath = message9.attachPath;
            } else if (tL_messageExtendedMedia5 != null && tL_messageExtendedMedia12 != null) {
                tL_messageExtendedMedia5.attachPath = tL_messageExtendedMedia12.attachPath;
            }
            TLRPC.Photo photo9 = messageMedia2.photo;
            TLRPC.Photo photo10 = messageMedia.photo;
            photo9.id = photo10.id;
            photo9.dc_id = photo10.dc_id;
            photo9.access_hash = photo10.access_hash;
            return;
        }
        TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia13 = tL_messageExtendedMedia2;
        TLRPC.Message message10 = message8;
        if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document != null && (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia2.document != null) {
            if (messageMedia.ttl_seconds == 0 && ((videoEditedInfo = messageObject.videoEditedInfo) == null || (videoEditedInfo.mediaEntities == null && TextUtils.isEmpty(videoEditedInfo.paintPath) && messageObject.videoEditedInfo.cropState == null))) {
                boolean isVideoMessage = MessageObject.isVideoMessage(message);
                if (isVideoMessage || MessageObject.isGifMessage(message)) {
                    tL_messageExtendedMedia3 = tL_messageExtendedMedia13;
                    if (MessageObject.isGifDocument(messageMedia.document) == MessageObject.isGifDocument(messageMedia2.document)) {
                        if (messageObject.scheduled) {
                            str = ".jpg";
                            str2 = "s";
                        } else {
                            str2 = "s";
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message7, false, false);
                            MessagesStorage messagesStorage2 = getMessagesStorage();
                            TLRPC.Document document7 = messageMedia.document;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("sent_");
                            str = ".jpg";
                            sb6.append(message7.peer_id.channel_id);
                            sb6.append("_");
                            sb6.append(message7.id);
                            sb6.append("_");
                            sb6.append(DialogObject.getPeerDialogId(message7.peer_id));
                            sb6.append("_");
                            sb6.append(messageObject3.type);
                            sb6.append("_");
                            sb6.append(messageObject3.getSize());
                            messagesStorage2.putSentFile(str13, document7, 2, sb6.toString());
                        }
                        if (isVideoMessage) {
                            message7.attachPath = message10.attachPath;
                        }
                    }
                } else {
                    tL_messageExtendedMedia3 = tL_messageExtendedMedia13;
                }
                str = ".jpg";
                str2 = "s";
                if (!MessageObject.isVoiceMessage(message) && !MessageObject.isRoundVideoMessage(message) && !messageObject.scheduled) {
                    MessageObject messageObject4 = new MessageObject(this.currentAccount, message7, false, false);
                    getMessagesStorage().putSentFile(str13, messageMedia.document, 1, "sent_" + message7.peer_id.channel_id + "_" + message7.id + "_" + DialogObject.getPeerDialogId(message7.peer_id) + "_" + messageObject4.type + "_" + messageObject4.getSize());
                }
            } else {
                tL_messageExtendedMedia3 = tL_messageExtendedMedia13;
                str = ".jpg";
                str2 = "s";
            }
            TLRPC.Photo photo11 = messageMedia2.video_cover;
            if (photo11 != null && (photo = messageMedia.video_cover) != null) {
                FileLoader.getClosestPhotoSizeWithSize(photo11.sizes, 40);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
                if (photo11.sizes.size() == 1 && (photo11.sizes.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
                    photo11.sizes = photo.sizes;
                } else {
                    int i7 = 0;
                    while (i7 < photo11.sizes.size()) {
                        TLRPC.PhotoSize photoSize10 = photo11.sizes.get(i7);
                        if (photoSize10 == null || photoSize10.location == null || photoSize10.type == null) {
                            messageMedia4 = messageMedia2;
                            str5 = str13;
                            message4 = message10;
                            str6 = str2;
                            str7 = str;
                        } else {
                            int i8 = 0;
                            while (i8 < photo.sizes.size()) {
                                TLRPC.PhotoSize photoSize11 = photo.sizes.get(i8);
                                if (photoSize11 == null || photoSize11.location == null || (photoSize11 instanceof TLRPC.TL_photoSizeEmpty) || (str9 = photoSize11.type) == null) {
                                    messageMedia4 = messageMedia2;
                                    str5 = str13;
                                    message5 = message10;
                                    str8 = str;
                                } else {
                                    str5 = str13;
                                    messageMedia4 = messageMedia2;
                                    if ((photoSize10.location.volume_id == -2147483648L && str9.equals(photoSize10.type)) || (photoSize11.w == photoSize10.w && photoSize11.h == photoSize10.h)) {
                                        String str17 = photoSize10.location.volume_id + "_" + photoSize10.location.local_id;
                                        String str18 = photoSize11.location.volume_id + "_" + photoSize11.location.local_id;
                                        if (str17.equals(str18)) {
                                            message4 = message10;
                                            str6 = str2;
                                            str7 = str;
                                        } else {
                                            File directory = FileLoader.getDirectory(4);
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append(str17);
                                            message4 = message10;
                                            str7 = str;
                                            sb7.append(str7);
                                            File file4 = new File(directory, sb7.toString());
                                            if (messageMedia.ttl_seconds == 0) {
                                                if (photo.sizes.size() != 1) {
                                                    if (photoSize11.w <= 90) {
                                                    }
                                                }
                                                if (!z2) {
                                                    z3 = z2;
                                                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(photoSize11, true);
                                                    file4.renameTo(file);
                                                    ImageLoader.getInstance().replaceImageInCache(str17, str18, ImageLocation.getForPhoto(photoSize11, photo), z);
                                                    photoSize10.location = photoSize11.location;
                                                    photoSize10.size = photoSize11.size;
                                                    str6 = str2;
                                                    i7++;
                                                    z2 = z3;
                                                    str2 = str6;
                                                    str = str7;
                                                    str13 = str5;
                                                    messageMedia2 = messageMedia4;
                                                    message10 = message4;
                                                }
                                            }
                                            z3 = z2;
                                            file = new File(FileLoader.getDirectory(4), str18 + str7);
                                            file4.renameTo(file);
                                            ImageLoader.getInstance().replaceImageInCache(str17, str18, ImageLocation.getForPhoto(photoSize11, photo), z);
                                            photoSize10.location = photoSize11.location;
                                            photoSize10.size = photoSize11.size;
                                            str6 = str2;
                                            i7++;
                                            z2 = z3;
                                            str2 = str6;
                                            str = str7;
                                            str13 = str5;
                                            messageMedia2 = messageMedia4;
                                            message10 = message4;
                                        }
                                    } else {
                                        message5 = message10;
                                        str8 = str;
                                    }
                                }
                                i8++;
                                z2 = z2;
                                str = str8;
                                str13 = str5;
                                messageMedia2 = messageMedia4;
                                message10 = message5;
                            }
                            messageMedia4 = messageMedia2;
                            str5 = str13;
                            message4 = message10;
                            str7 = str;
                            z3 = z2;
                            String str19 = photoSize10.location.volume_id + "_" + photoSize10.location.local_id;
                            new File(FileLoader.getDirectory(4), str19 + str7).delete();
                            str6 = str2;
                            if (str6.equals(photoSize10.type) && closestPhotoSizeWithSize != null) {
                                photo11.sizes.set(i7, closestPhotoSizeWithSize);
                                ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo);
                                ImageLoader.getInstance().replaceImageInCache(str19, forPhoto2.getKey(message7, null, false), forPhoto2, z);
                                i7++;
                                z2 = z3;
                                str2 = str6;
                                str = str7;
                                str13 = str5;
                                messageMedia2 = messageMedia4;
                                message10 = message4;
                            }
                            i7++;
                            z2 = z3;
                            str2 = str6;
                            str = str7;
                            str13 = str5;
                            messageMedia2 = messageMedia4;
                            message10 = message4;
                        }
                        z3 = z2;
                        i7++;
                        z2 = z3;
                        str2 = str6;
                        str = str7;
                        str13 = str5;
                        messageMedia2 = messageMedia4;
                        message10 = message4;
                    }
                }
                TLRPC.MessageMedia messageMedia15 = messageMedia2;
                str3 = str13;
                message2 = message10;
                bArr = null;
                photo11.id = photo.id;
                photo11.dc_id = photo.dc_id;
                photo11.access_hash = photo.access_hash;
                messageMedia3 = messageMedia15;
            } else {
                str3 = str13;
                message2 = message10;
                bArr = null;
                String str20 = str;
                messageMedia3 = messageMedia2;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageMedia3.document.thumbs, NotificationCenter.chatlistFolderUpdate);
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, NotificationCenter.chatlistFolderUpdate);
                if (closestPhotoSizeWithSize2 != null && (fileLocation2 = closestPhotoSizeWithSize2.location) != null && fileLocation2.volume_id == -2147483648L && closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize3.location != null && !(closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty)) {
                    String str21 = closestPhotoSizeWithSize2.location.volume_id + "_" + closestPhotoSizeWithSize2.location.local_id;
                    String str22 = closestPhotoSizeWithSize3.location.volume_id + "_" + closestPhotoSizeWithSize3.location.local_id;
                    if (!str21.equals(str22)) {
                        new File(FileLoader.getDirectory(4), str21 + str20).renameTo(new File(FileLoader.getDirectory(4), str22 + str20));
                        ImageLoader.getInstance().replaceImageInCache(str21, str22, ImageLocation.getForDocument(closestPhotoSizeWithSize3, messageMedia.document), z);
                        closestPhotoSizeWithSize2.location = closestPhotoSizeWithSize3.location;
                        closestPhotoSizeWithSize2.size = closestPhotoSizeWithSize3.size;
                    }
                } else if (closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize2 != null && MessageObject.isStickerMessage(message) && (fileLocation = closestPhotoSizeWithSize2.location) != null) {
                    closestPhotoSizeWithSize3.location = fileLocation;
                } else if (closestPhotoSizeWithSize2 == null || (closestPhotoSizeWithSize2.location instanceof TLRPC.TL_fileLocationUnavailable) || (closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty)) {
                    messageMedia3.document.thumbs = messageMedia.document.thumbs;
                }
            }
            TLRPC.Document document8 = messageMedia3.document;
            TLRPC.Document document9 = messageMedia.document;
            document8.dc_id = document9.dc_id;
            document8.id = document9.id;
            document8.access_hash = document9.access_hash;
            int i9 = 0;
            while (true) {
                if (i9 >= messageMedia3.document.attributes.size()) {
                    bArr2 = bArr;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = messageMedia3.document.attributes.get(i9);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    bArr2 = documentAttribute.waveform;
                    break;
                }
                i9++;
            }
            messageMedia3.document.attributes = messageMedia.document.attributes;
            if (bArr2 != null) {
                for (int i10 = 0; i10 < messageMedia3.document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute2 = messageMedia3.document.attributes.get(i10);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        documentAttribute2.waveform = bArr2;
                        documentAttribute2.flags |= 4;
                    }
                }
            }
            TLRPC.Document document10 = messageMedia3.document;
            TLRPC.Document document11 = messageMedia.document;
            document10.size = document11.size;
            document10.mime_type = document11.mime_type;
            if ((message7.flags & 4) == 0 && ((MessageObject.isOut(message) || message7.dialog_id == getUserConfig().getClientUserId()) && !MessageObject.isQuickReply(message))) {
                if (MessageObject.isNewGifDocument(messageMedia.document)) {
                    if (MessageObject.isDocumentHasAttachedStickers(messageMedia.document) ? getMessagesController().saveGifsWithStickers : true) {
                        getMediaDataController().addRecentGif(messageMedia.document, message7.date, true);
                    }
                } else if (MessageObject.isStickerDocument(messageMedia.document) || MessageObject.isAnimatedStickerDocument(messageMedia.document, true)) {
                    tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
                    getMediaDataController().addRecentSticker(0, message, messageMedia.document, message7.date, false);
                    if (tL_messageExtendedMedia4 == null) {
                        str4 = tL_messageExtendedMedia4.attachPath;
                        message3 = message2;
                    } else {
                        message3 = message2;
                        str4 = message3.attachPath;
                    }
                    if (str4 != null || !str4.startsWith(FileLoader.getDirectory(4).getAbsolutePath()) || MessageObject.isGifDocument(messageMedia.document)) {
                        if (tL_messageExtendedMedia4 == null) {
                            tL_messageExtendedMedia4.attachPath = str4;
                            return;
                        } else {
                            message7.attachPath = str4;
                            message7.message = message3.message;
                            return;
                        }
                    }
                    File file5 = new File(str4);
                    File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(messageMedia.document, messageMedia.ttl_seconds != 0);
                    if (!file5.renameTo(pathToAttach)) {
                        if (file5.exists()) {
                            if (tL_messageExtendedMedia4 != null) {
                                tL_messageExtendedMedia4.attachPath = str4;
                            } else {
                                message7.attachPath = str4;
                            }
                        } else if (tL_messageExtendedMedia4 == null) {
                            messageObject2 = messageObject;
                            messageObject2.attachPathExists = false;
                            if (tL_messageExtendedMedia4 == null) {
                                messageObject2.mediaExists = pathToAttach.exists();
                            }
                            message7.message = message3.message;
                            return;
                        }
                        messageObject2 = messageObject;
                        if (tL_messageExtendedMedia4 == null) {
                        }
                        message7.message = message3.message;
                        return;
                    }
                    if (MessageObject.isVideoMessage(message)) {
                        messageObject.attachPathExists = true;
                        return;
                    }
                    messageObject.mediaExists = messageObject.attachPathExists;
                    messageObject.attachPathExists = false;
                    if (tL_messageExtendedMedia4 != null) {
                        tL_messageExtendedMedia4.attachPath = "";
                    } else {
                        message3.attachPath = "";
                    }
                    if (str3 != null) {
                        String str23 = str3;
                        if (str23.startsWith("http")) {
                            getMessagesStorage().addRecentLocalFile(str23, pathToAttach.toString(), messageMedia3.document);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            tL_messageExtendedMedia4 = tL_messageExtendedMedia3;
            if (tL_messageExtendedMedia4 == null) {
            }
            if (str4 != null) {
            }
            if (tL_messageExtendedMedia4 == null) {
            }
        } else {
            TLRPC.MessageMedia messageMedia16 = message7.media;
            if ((messageMedia16 instanceof TLRPC.TL_messageMediaContact) && (message10.media instanceof TLRPC.TL_messageMediaContact)) {
                message10.media = messageMedia16;
                return;
            }
            if (messageMedia16 instanceof TLRPC.TL_messageMediaWebPage) {
                message10.media = messageMedia16;
                return;
            }
            if (messageMedia16 instanceof TLRPC.TL_messageMediaGeo) {
                TLRPC.GeoPoint geoPoint = messageMedia16.geo;
                TLRPC.GeoPoint geoPoint2 = message10.media.geo;
                geoPoint.lat = geoPoint2.lat;
                geoPoint._long = geoPoint2._long;
                return;
            }
            if ((messageMedia16 instanceof TLRPC.TL_messageMediaGame) || (messageMedia16 instanceof TLRPC.TL_messageMediaInvoice)) {
                message10.media = messageMedia16;
                if (!TextUtils.isEmpty(message7.message)) {
                    message10.entities = message7.entities;
                    message10.message = message7.message;
                }
                TLRPC.ReplyMarkup replyMarkup = message7.reply_markup;
                if (replyMarkup != null) {
                    message10.reply_markup = replyMarkup;
                    message10.flags |= 64;
                    return;
                }
                return;
            }
            if (messageMedia16 instanceof TLRPC.TL_messageMediaPoll) {
                message10.media = messageMedia16;
            }
        }
    }

    private void putToDelayedMessages(String str, DelayedMessage delayedMessage) {
        ArrayList<DelayedMessage> arrayList = this.delayedMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.delayedMessages.put(str, arrayList);
        }
        arrayList.add(delayedMessage);
    }

    protected ArrayList<DelayedMessage> getDelayedMessages(String str) {
        return this.delayedMessages.get(str);
    }

    public long getNextRandomId() {
        long j = 0;
        while (j == 0) {
            j = Utilities.random.nextLong();
        }
        return j;
    }

    public void checkUnsentMessages() {
        getMessagesStorage().getUnsentMessages(MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    protected void processUnsentMessages(final ArrayList<TLRPC.Message> arrayList, final ArrayList<TLRPC.Message> arrayList2, final ArrayList<TLRPC.User> arrayList3, final ArrayList<TLRPC.Chat> arrayList4, final ArrayList<TLRPC.EncryptedChat> arrayList5) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda86
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$processUnsentMessages$84(arrayList3, arrayList4, arrayList5, arrayList, arrayList2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processUnsentMessages$84(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        HashMap<String, String> hashMap;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int size = arrayList4.size();
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList4.get(i), false, true);
            long groupId = messageObject.getGroupId();
            if (groupId != 0 && (hashMap = messageObject.messageOwner.params) != null && !hashMap.containsKey("final") && (i == size - 1 || ((TLRPC.Message) arrayList4.get(i + 1)).grouped_id != groupId)) {
                messageObject.messageOwner.params.put("final", "1");
            }
            retrySendMessage(messageObject, true, 0L);
        }
        if (arrayList5 != null) {
            for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                MessageObject messageObject2 = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList5.get(i2), false, true);
                messageObject2.scheduled = true;
                retrySendMessage(messageObject2, true, 0L);
            }
        }
    }

    public ImportingStickers getImportingStickers(String str) {
        return this.importingStickersMap.get(str);
    }

    public ImportingHistory getImportingHistory(long j) {
        return (ImportingHistory) this.importingHistoryMap.get(j);
    }

    public boolean isImportingStickers() {
        return this.importingStickersMap.size() != 0;
    }

    public boolean isImportingHistory() {
        return this.importingHistoryMap.size() != 0;
    }

    public void prepareImportHistory(final long j, final Uri uri, final ArrayList<Uri> arrayList, final MessagesStorage.LongCallback longCallback) {
        if (this.importingHistoryMap.get(j) != null) {
            longCallback.run(0L);
            return;
        }
        if (DialogObject.isChatDialog(j)) {
            long j2 = -j;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat != null && !chat.megagroup) {
                getMessagesController().convertToMegaGroup(null, j2, null, new MessagesStorage.LongCallback() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda30
                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                    public final void run(long j3) {
                        SendMessagesHelper.this.lambda$prepareImportHistory$85(uri, arrayList, longCallback, j3);
                    }
                });
                return;
            }
        }
        new Thread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$prepareImportHistory$90(arrayList, j, uri, longCallback);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareImportHistory$85(Uri uri, ArrayList arrayList, MessagesStorage.LongCallback longCallback, long j) {
        if (j != 0) {
            prepareImportHistory(-j, uri, arrayList, longCallback);
        } else {
            longCallback.run(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareImportHistory$90(ArrayList arrayList, final long j, Uri uri, final MessagesStorage.LongCallback longCallback) {
        int i;
        ArrayList arrayList2 = arrayList != null ? arrayList : new ArrayList();
        final ImportingHistory importingHistory = new ImportingHistory();
        importingHistory.mediaPaths = arrayList2;
        importingHistory.dialogId = j;
        importingHistory.peer = getMessagesController().getInputPeer(j);
        final HashMap hashMap = new HashMap();
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size + 1) {
            Uri uri2 = i3 == 0 ? uri : (Uri) arrayList2.get(i3 - 1);
            if (uri2 == null || AndroidUtilities.isInternalUri(uri2)) {
                i = i3;
                if (i == 0) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda55
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagesStorage.LongCallback.this.run(0L);
                        }
                    });
                    return;
                }
            } else {
                String fixFileName = FileLoader.fixFileName(MediaController.getFileName(uri));
                String str = (fixFileName == null || !fixFileName.endsWith(".zip")) ? "txt" : "zip";
                String copyFileToCache = MediaController.copyFileToCache(uri2, str);
                if ("zip".equals(str)) {
                    File file = new File(copyFileToCache);
                    try {
                        try {
                            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
                            try {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                while (true) {
                                    if (nextEntry == null) {
                                        break;
                                    }
                                    String name = nextEntry.getName();
                                    if (name == null) {
                                        nextEntry = zipInputStream.getNextEntry();
                                    } else {
                                        int lastIndexOf = name.lastIndexOf("/");
                                        if (lastIndexOf >= 0) {
                                            name = name.substring(lastIndexOf + 1);
                                        }
                                        if (name.endsWith(".txt")) {
                                            File createFileInCache = MediaController.createFileInCache(name, "txt");
                                            copyFileToCache = createFileInCache.getAbsolutePath();
                                            FileOutputStream fileOutputStream = new FileOutputStream(createFileInCache);
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int read = zipInputStream.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr, i2, read);
                                                }
                                            }
                                            fileOutputStream.close();
                                        } else {
                                            nextEntry = zipInputStream.getNextEntry();
                                        }
                                    }
                                }
                                zipInputStream.closeEntry();
                                zipInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    zipInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    try {
                        file.delete();
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                }
                if (copyFileToCache == null) {
                    i = i3;
                } else {
                    File file2 = new File(copyFileToCache);
                    if (file2.exists()) {
                        long length = file2.length();
                        if (length != 0) {
                            i = i3;
                            importingHistory.totalSize += length;
                            if (i != 0) {
                                importingHistory.uploadMedia.add(copyFileToCache);
                            } else {
                                if (length > 33554432) {
                                    file2.delete();
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda53
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SendMessagesHelper.lambda$prepareImportHistory$88(MessagesStorage.LongCallback.this);
                                        }
                                    });
                                    return;
                                }
                                importingHistory.historyPath = copyFileToCache;
                            }
                            importingHistory.uploadSet.add(copyFileToCache);
                            hashMap.put(copyFileToCache, importingHistory);
                        }
                    }
                    i = i3;
                    if (i == 0) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda54
                            @Override // java.lang.Runnable
                            public final void run() {
                                MessagesStorage.LongCallback.this.run(0L);
                            }
                        });
                        return;
                    }
                }
            }
            i3 = i + 1;
            i2 = 0;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$prepareImportHistory$89(hashMap, j, importingHistory, longCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareImportHistory$88(MessagesStorage.LongCallback longCallback) {
        Toast.makeText(ApplicationLoader.applicationContext, LocaleController.getString(R.string.ImportFileTooLarge), 0).show();
        longCallback.run(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareImportHistory$89(HashMap hashMap, long j, ImportingHistory importingHistory, MessagesStorage.LongCallback longCallback) {
        this.importingHistoryFiles.putAll(hashMap);
        this.importingHistoryMap.put(j, importingHistory);
        getFileLoader().uploadFile(importingHistory.historyPath, false, true, 0L, 67108864, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j));
        longCallback.run(j);
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) ImportingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void prepareImportStickers(final String str, final String str2, final String str3, final ArrayList<ImportingSticker> arrayList, final MessagesStorage.StringCallback stringCallback) {
        if (this.importingStickersMap.get(str2) != null) {
            stringCallback.run(null);
        } else {
            new Thread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.this.lambda$prepareImportStickers$93(str, str2, str3, arrayList, stringCallback);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareImportStickers$93(String str, final String str2, String str3, ArrayList arrayList, final MessagesStorage.StringCallback stringCallback) {
        final ImportingStickers importingStickers = new ImportingStickers();
        importingStickers.title = str;
        importingStickers.shortName = str2;
        importingStickers.software = str3;
        final HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImportingSticker importingSticker = (ImportingSticker) arrayList.get(i);
            File file = new File(importingSticker.path);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    importingStickers.totalSize += length;
                    importingStickers.uploadMedia.add(importingSticker);
                    importingStickers.uploadSet.put(importingSticker.path, importingSticker);
                    hashMap.put(importingSticker.path, importingStickers);
                }
            }
            if (i == 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda84
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesStorage.StringCallback.this.run(null);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda85
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.this.lambda$prepareImportStickers$92(importingStickers, hashMap, str2, stringCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareImportStickers$92(ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        if (importingStickers.uploadMedia.get(0).item != null) {
            importingStickers.startImport();
        } else {
            this.importingStickersFiles.putAll(hashMap);
            this.importingStickersMap.put(str, importingStickers);
            importingStickers.initImport();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, str);
            stringCallback.run(str);
        }
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) ImportingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public TLRPC.TL_photo generatePhotoSizes(String str, Uri uri) {
        return generatePhotoSizes(null, str, uri, false);
    }

    public TLRPC.TL_photo generatePhotoSizes(TLRPC.TL_photo tL_photo, String str, Uri uri, boolean z) {
        TLRPC.PhotoSize scaleAndSaveImage;
        Bitmap loadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), true);
        if (loadBitmap == null) {
            loadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, true);
        if (scaleAndSaveImage2 != null) {
            arrayList.add(scaleAndSaveImage2);
        }
        if (z) {
            scaleAndSaveImage = ImageLoader.scaleAndSaveImage(null, loadBitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), 99, false, 101, 101, false);
        } else {
            scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), true, 80, false, 101, 101);
        }
        if (scaleAndSaveImage != null) {
            arrayList.add(scaleAndSaveImage);
        }
        if (loadBitmap != null) {
            loadBitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().saveConfig(false);
        TLRPC.TL_photo tL_photo2 = tL_photo == null ? new TLRPC.TL_photo() : tL_photo;
        tL_photo2.date = getConnectionsManager().getCurrentTime();
        tL_photo2.sizes = arrayList;
        tL_photo2.file_reference = new byte[0];
        return tL_photo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0528 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int prepareSendingDocumentInternal(final AccountInstance accountInstance, String str, String str2, Uri uri, String str3, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final ArrayList<TLRPC.MessageEntity> arrayList, final MessageObject messageObject3, long[] jArr, boolean z, CharSequence charSequence, final boolean z2, final int i, final int i2, Integer[] numArr, boolean z3, final String str4, final int i3, final long j2, final boolean z4, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        String str5;
        String str6;
        File file;
        String str7;
        String lowerCase;
        AudioInfo audioInfo;
        long j5;
        int i4;
        String str8;
        String str9;
        Bitmap cover;
        String str10;
        String str11;
        boolean z5;
        Object obj;
        Object obj2;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        String str12;
        boolean z6;
        Bitmap bitmap;
        File file2;
        String str13;
        String str14;
        String str15;
        boolean z7;
        MimeTypeMap mimeTypeMap;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        long j6;
        int i5;
        int i6;
        int i7;
        final String str16;
        TLRPC.TL_document tL_document;
        final String str17;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3;
        boolean z8;
        String str18;
        TLRPC.TL_document tL_document2;
        final HashMap hashMap;
        String str19;
        boolean z9;
        int i8;
        int i9;
        TLRPC.PhotoSize scaleAndSaveImage;
        Bitmap loadBitmap;
        String str20;
        char c;
        String str21;
        TLRPC.TL_document tL_document3;
        String str22;
        MediaMetadataRetriever mediaMetadataRetriever;
        Exception exc;
        MediaMetadataRetriever mediaMetadataRetriever2;
        String str23;
        Bitmap bitmap2;
        String str24;
        int i10;
        Throwable th;
        boolean z10;
        Bitmap bitmap3;
        int i11;
        String str25;
        String str26;
        Bitmap bitmap4;
        int ceil;
        boolean z11;
        if ((str == null || str.length() == 0) && uri == null) {
            return 1;
        }
        if (uri != null && AndroidUtilities.isInternalUri(uri)) {
            return 1;
        }
        if (str != null && AndroidUtilities.isInternalUri(Uri.fromFile(new File(str)))) {
            return 1;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null || str != null) {
            str5 = str;
        } else {
            if (checkFileSize(accountInstance, uri)) {
                return 2;
            }
            str6 = str3 != null ? singleton.getExtensionFromMimeType(str3) : null;
            if (str6 == null) {
                str6 = "txt";
                z11 = false;
            } else {
                z11 = true;
            }
            String copyFileToCache = MediaController.copyFileToCache(uri, str6);
            if (copyFileToCache == null) {
                return 1;
            }
            if (z11) {
                str5 = copyFileToCache;
                file = new File(str5);
                if (!file.exists() && file.length() != 0) {
                    if (!FileLoader.checkUploadFileSize(accountInstance.getCurrentAccount(), file.length())) {
                        return 2;
                    }
                    boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
                    String name = file.getName();
                    if (str6 == null) {
                        int lastIndexOf = str5.lastIndexOf(46);
                        if (lastIndexOf == -1) {
                            str7 = "";
                            lowerCase = str7.toLowerCase();
                            if (!lowerCase.equals("mp3") || lowerCase.equals("m4a")) {
                                audioInfo = AudioInfo.getAudioInfo(file);
                                if (audioInfo != null) {
                                    long duration = audioInfo.getDuration();
                                    j5 = 0;
                                    if (duration != 0) {
                                        str8 = audioInfo.getArtist();
                                        str9 = audioInfo.getTitle();
                                        i4 = (int) (duration / 1000);
                                    } else {
                                        i4 = 0;
                                        str8 = null;
                                        str9 = null;
                                    }
                                    cover = audioInfo.getCover();
                                    str10 = str8;
                                    str11 = str9;
                                    z5 = false;
                                }
                                j5 = 0;
                                cover = null;
                                str11 = null;
                                str10 = null;
                                i4 = 0;
                                z5 = false;
                            } else {
                                if (lowerCase.equals("opus") || lowerCase.equals("ogg") || lowerCase.equals("flac")) {
                                    try {
                                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                        try {
                                            try {
                                                mediaMetadataRetriever2.setDataSource(file.getAbsolutePath());
                                                if (mediaMetadataRetriever2.extractMetadata(9) != null) {
                                                    str25 = lowerCase;
                                                    try {
                                                        ceil = (int) Math.ceil(Long.parseLong(r0) / 1000.0f);
                                                    } catch (Exception e) {
                                                        e = e;
                                                        lowerCase = str25;
                                                        exc = e;
                                                        bitmap3 = null;
                                                        str23 = null;
                                                        i11 = 0;
                                                        str24 = null;
                                                        i10 = i11;
                                                        bitmap2 = bitmap3;
                                                        try {
                                                            FileLog.e(exc);
                                                            if (mediaMetadataRetriever2 != null) {
                                                            }
                                                            str11 = str23;
                                                            cover = bitmap2;
                                                            str10 = str24;
                                                            i4 = i10;
                                                            j5 = 0;
                                                            z5 = false;
                                                            String str27 = lowerCase;
                                                            if (i4 != 0) {
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                            z6 = false;
                                                            if (!z6) {
                                                            }
                                                            bitmap = cover;
                                                            file2 = file;
                                                            str13 = str5;
                                                            str14 = str12;
                                                            str15 = "";
                                                            z7 = isEncryptedDialog;
                                                            mimeTypeMap = singleton;
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            j6 = j5;
                                                            i5 = 0;
                                                            i6 = 2;
                                                            i7 = -1;
                                                            str16 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            str19 = str14;
                                                            if (str19 != null) {
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            Integer valueOf = Integer.valueOf(i5);
                                                            if (numArr != null) {
                                                            }
                                                            z9 = false;
                                                            if (z8) {
                                                            }
                                                            final TLRPC.TL_document tL_document4 = tL_document2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document4, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                }
                                                            });
                                                            return 0;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            th = th;
                                                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                                                            if (mediaMetadataRetriever2 != null) {
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        String extractMetadata = mediaMetadataRetriever2.extractMetadata(7);
                                                        i11 = ceil;
                                                        try {
                                                            str23 = extractMetadata;
                                                            str26 = mediaMetadataRetriever2.extractMetadata(2);
                                                        } catch (Exception e2) {
                                                            exc = e2;
                                                            str23 = extractMetadata;
                                                            bitmap3 = null;
                                                            str24 = null;
                                                            lowerCase = str25;
                                                            i10 = i11;
                                                            bitmap2 = bitmap3;
                                                            FileLog.e(exc);
                                                            if (mediaMetadataRetriever2 != null) {
                                                            }
                                                            str11 = str23;
                                                            cover = bitmap2;
                                                            str10 = str24;
                                                            i4 = i10;
                                                            j5 = 0;
                                                            z5 = false;
                                                            String str272 = lowerCase;
                                                            if (i4 != 0) {
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                            z6 = false;
                                                            if (!z6) {
                                                            }
                                                            bitmap = cover;
                                                            file2 = file;
                                                            str13 = str5;
                                                            str14 = str12;
                                                            str15 = "";
                                                            z7 = isEncryptedDialog;
                                                            mimeTypeMap = singleton;
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            j6 = j5;
                                                            i5 = 0;
                                                            i6 = 2;
                                                            i7 = -1;
                                                            str16 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            str19 = str14;
                                                            if (str19 != null) {
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            Integer valueOf2 = Integer.valueOf(i5);
                                                            if (numArr != null) {
                                                            }
                                                            z9 = false;
                                                            if (z8) {
                                                            }
                                                            final TLRPC.TL_document tL_document42 = tL_document2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document42, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                }
                                                            });
                                                            return 0;
                                                        }
                                                    } catch (Exception e3) {
                                                        i11 = ceil;
                                                        lowerCase = str25;
                                                        exc = e3;
                                                        bitmap3 = null;
                                                        str23 = null;
                                                        str24 = null;
                                                        i10 = i11;
                                                        bitmap2 = bitmap3;
                                                        FileLog.e(exc);
                                                        if (mediaMetadataRetriever2 != null) {
                                                        }
                                                        str11 = str23;
                                                        cover = bitmap2;
                                                        str10 = str24;
                                                        i4 = i10;
                                                        j5 = 0;
                                                        z5 = false;
                                                        String str2722 = lowerCase;
                                                        if (i4 != 0) {
                                                        }
                                                        if (str2 == null) {
                                                        }
                                                        z6 = false;
                                                        if (!z6) {
                                                        }
                                                        bitmap = cover;
                                                        file2 = file;
                                                        str13 = str5;
                                                        str14 = str12;
                                                        str15 = "";
                                                        z7 = isEncryptedDialog;
                                                        mimeTypeMap = singleton;
                                                        tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                        j6 = j5;
                                                        i5 = 0;
                                                        i6 = 2;
                                                        i7 = -1;
                                                        str16 = null;
                                                        tL_document = null;
                                                        if (tL_document != null) {
                                                        }
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        str19 = str14;
                                                        if (str19 != null) {
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (str16 != null) {
                                                        }
                                                        Integer valueOf22 = Integer.valueOf(i5);
                                                        if (numArr != null) {
                                                        }
                                                        z9 = false;
                                                        if (z8) {
                                                        }
                                                        final TLRPC.TL_document tL_document422 = tL_document2;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document422, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                            }
                                                        });
                                                        return 0;
                                                    }
                                                } else {
                                                    str25 = lowerCase;
                                                    str26 = null;
                                                    str23 = null;
                                                    i11 = 0;
                                                }
                                                try {
                                                    byte[] embeddedPicture = mediaMetadataRetriever2.getEmbeddedPicture();
                                                    if (embeddedPicture != null) {
                                                        str24 = str26;
                                                        try {
                                                            bitmap4 = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            lowerCase = str25;
                                                            exc = e;
                                                            bitmap3 = null;
                                                            i10 = i11;
                                                            bitmap2 = bitmap3;
                                                            FileLog.e(exc);
                                                            if (mediaMetadataRetriever2 != null) {
                                                                try {
                                                                    mediaMetadataRetriever2.release();
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z10 = false;
                                                                    FileLog.e(e);
                                                                    str11 = str23;
                                                                    cover = bitmap2;
                                                                    str10 = str24;
                                                                    j5 = 0;
                                                                    z5 = z10;
                                                                    i4 = i10;
                                                                    String str27222 = lowerCase;
                                                                    if (i4 != 0) {
                                                                    }
                                                                    if (str2 == null) {
                                                                    }
                                                                    z6 = false;
                                                                    if (!z6) {
                                                                    }
                                                                    bitmap = cover;
                                                                    file2 = file;
                                                                    str13 = str5;
                                                                    str14 = str12;
                                                                    str15 = "";
                                                                    z7 = isEncryptedDialog;
                                                                    mimeTypeMap = singleton;
                                                                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                                    j6 = j5;
                                                                    i5 = 0;
                                                                    i6 = 2;
                                                                    i7 = -1;
                                                                    str16 = null;
                                                                    tL_document = null;
                                                                    if (tL_document != null) {
                                                                    }
                                                                    if (charSequence != null) {
                                                                    }
                                                                    hashMap = new HashMap();
                                                                    str19 = str14;
                                                                    if (str19 != null) {
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (str16 != null) {
                                                                    }
                                                                    Integer valueOf222 = Integer.valueOf(i5);
                                                                    if (numArr != null) {
                                                                    }
                                                                    z9 = false;
                                                                    if (z8) {
                                                                    }
                                                                    final TLRPC.TL_document tL_document4222 = tL_document2;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document4222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                        }
                                                                    });
                                                                    return 0;
                                                                }
                                                            }
                                                            str11 = str23;
                                                            cover = bitmap2;
                                                            str10 = str24;
                                                            i4 = i10;
                                                            j5 = 0;
                                                            z5 = false;
                                                            String str272222 = lowerCase;
                                                            if (i4 != 0) {
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                            z6 = false;
                                                            if (!z6) {
                                                            }
                                                            bitmap = cover;
                                                            file2 = file;
                                                            str13 = str5;
                                                            str14 = str12;
                                                            str15 = "";
                                                            z7 = isEncryptedDialog;
                                                            mimeTypeMap = singleton;
                                                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                            j6 = j5;
                                                            i5 = 0;
                                                            i6 = 2;
                                                            i7 = -1;
                                                            str16 = null;
                                                            tL_document = null;
                                                            if (tL_document != null) {
                                                            }
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            str19 = str14;
                                                            if (str19 != null) {
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            Integer valueOf2222 = Integer.valueOf(i5);
                                                            if (numArr != null) {
                                                            }
                                                            z9 = false;
                                                            if (z8) {
                                                            }
                                                            final TLRPC.TL_document tL_document42222 = tL_document2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document42222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                }
                                                            });
                                                            return 0;
                                                        }
                                                    } else {
                                                        str24 = str26;
                                                        bitmap4 = null;
                                                    }
                                                    try {
                                                        if (messageObject3 == null) {
                                                            lowerCase = str25;
                                                            try {
                                                                if (lowerCase.equals("ogg")) {
                                                                    cover = bitmap4;
                                                                    if (MediaController.isOpusFile(file.getAbsolutePath()) == 1) {
                                                                        z10 = true;
                                                                        mediaMetadataRetriever2.release();
                                                                        str11 = str23;
                                                                        str10 = str24;
                                                                        z5 = z10;
                                                                        i4 = i11;
                                                                        j5 = 0;
                                                                    }
                                                                    z10 = false;
                                                                    mediaMetadataRetriever2.release();
                                                                    str11 = str23;
                                                                    str10 = str24;
                                                                    z5 = z10;
                                                                    i4 = i11;
                                                                    j5 = 0;
                                                                }
                                                            } catch (Exception e6) {
                                                                Bitmap bitmap5 = bitmap4;
                                                                exc = e6;
                                                                bitmap3 = bitmap5;
                                                                i10 = i11;
                                                                bitmap2 = bitmap3;
                                                                FileLog.e(exc);
                                                                if (mediaMetadataRetriever2 != null) {
                                                                }
                                                                str11 = str23;
                                                                cover = bitmap2;
                                                                str10 = str24;
                                                                i4 = i10;
                                                                j5 = 0;
                                                                z5 = false;
                                                                String str2722222 = lowerCase;
                                                                if (i4 != 0) {
                                                                }
                                                                if (str2 == null) {
                                                                }
                                                                z6 = false;
                                                                if (!z6) {
                                                                }
                                                                bitmap = cover;
                                                                file2 = file;
                                                                str13 = str5;
                                                                str14 = str12;
                                                                str15 = "";
                                                                z7 = isEncryptedDialog;
                                                                mimeTypeMap = singleton;
                                                                tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                                j6 = j5;
                                                                i5 = 0;
                                                                i6 = 2;
                                                                i7 = -1;
                                                                str16 = null;
                                                                tL_document = null;
                                                                if (tL_document != null) {
                                                                }
                                                                if (charSequence != null) {
                                                                }
                                                                hashMap = new HashMap();
                                                                str19 = str14;
                                                                if (str19 != null) {
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (str16 != null) {
                                                                }
                                                                Integer valueOf22222 = Integer.valueOf(i5);
                                                                if (numArr != null) {
                                                                }
                                                                z9 = false;
                                                                if (z8) {
                                                                }
                                                                final TLRPC.TL_document tL_document422222 = tL_document2;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document422222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                    }
                                                                });
                                                                return 0;
                                                            }
                                                        } else {
                                                            lowerCase = str25;
                                                        }
                                                        mediaMetadataRetriever2.release();
                                                        str11 = str23;
                                                        str10 = str24;
                                                        z5 = z10;
                                                        i4 = i11;
                                                        j5 = 0;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        i10 = i11;
                                                        bitmap2 = cover;
                                                        FileLog.e(e);
                                                        str11 = str23;
                                                        cover = bitmap2;
                                                        str10 = str24;
                                                        j5 = 0;
                                                        z5 = z10;
                                                        i4 = i10;
                                                        String str27222222 = lowerCase;
                                                        if (i4 != 0) {
                                                        }
                                                        if (str2 == null) {
                                                        }
                                                        z6 = false;
                                                        if (!z6) {
                                                        }
                                                        bitmap = cover;
                                                        file2 = file;
                                                        str13 = str5;
                                                        str14 = str12;
                                                        str15 = "";
                                                        z7 = isEncryptedDialog;
                                                        mimeTypeMap = singleton;
                                                        tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                        j6 = j5;
                                                        i5 = 0;
                                                        i6 = 2;
                                                        i7 = -1;
                                                        str16 = null;
                                                        tL_document = null;
                                                        if (tL_document != null) {
                                                        }
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        str19 = str14;
                                                        if (str19 != null) {
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (str16 != null) {
                                                        }
                                                        Integer valueOf222222 = Integer.valueOf(i5);
                                                        if (numArr != null) {
                                                        }
                                                        z9 = false;
                                                        if (z8) {
                                                        }
                                                        final TLRPC.TL_document tL_document4222222 = tL_document2;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document4222222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                            }
                                                        });
                                                        return 0;
                                                    }
                                                    cover = bitmap4;
                                                    z10 = false;
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    str24 = str26;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (mediaMetadataRetriever2 != null) {
                                                try {
                                                    mediaMetadataRetriever2.release();
                                                    throw th;
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                    throw th;
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e11) {
                                        exc = e11;
                                        mediaMetadataRetriever2 = null;
                                        str23 = null;
                                        bitmap2 = null;
                                        str24 = null;
                                        i10 = 0;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = null;
                                        th = th;
                                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                                        if (mediaMetadataRetriever2 != null) {
                                        }
                                    }
                                }
                                j5 = 0;
                                cover = null;
                                str11 = null;
                                str10 = null;
                                i4 = 0;
                                z5 = false;
                            }
                            String str272222222 = lowerCase;
                            if (i4 != 0) {
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio4 = new TLRPC.TL_documentAttributeAudio();
                                obj = "m4a";
                                obj2 = "mp3";
                                tL_documentAttributeAudio4.duration = i4;
                                tL_documentAttributeAudio4.title = str11;
                                tL_documentAttributeAudio4.performer = str10;
                                if (str11 == null) {
                                    tL_documentAttributeAudio4.title = "";
                                }
                                int i12 = tL_documentAttributeAudio4.flags;
                                tL_documentAttributeAudio4.flags = i12 | 1;
                                if (str10 == null) {
                                    tL_documentAttributeAudio4.performer = "";
                                }
                                tL_documentAttributeAudio4.flags = i12 | 3;
                                if (z5) {
                                    tL_documentAttributeAudio4.voice = true;
                                }
                                tL_documentAttributeAudio = tL_documentAttributeAudio4;
                            } else {
                                obj = "m4a";
                                obj2 = "mp3";
                                tL_documentAttributeAudio = null;
                            }
                            if (str2 == null) {
                                str12 = str2;
                            } else {
                                if (str2.endsWith("attheme")) {
                                    str12 = str2;
                                    z6 = true;
                                    if (!z6 || isEncryptedDialog) {
                                        bitmap = cover;
                                        file2 = file;
                                        str13 = str5;
                                        str14 = str12;
                                        str15 = "";
                                        z7 = isEncryptedDialog;
                                        mimeTypeMap = singleton;
                                        tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                        j6 = j5;
                                        i5 = 0;
                                        i6 = 2;
                                        i7 = -1;
                                        str16 = null;
                                        tL_document = null;
                                    } else {
                                        Object[] sentFile = accountInstance.getMessagesStorage().getSentFile(str12, !isEncryptedDialog ? 1 : 4);
                                        if (sentFile != null) {
                                            Object obj3 = sentFile[0];
                                            if (obj3 instanceof TLRPC.TL_document) {
                                                tL_document3 = (TLRPC.TL_document) obj3;
                                                str21 = (String) sentFile[1];
                                                if (tL_document3 == null || str5.equals(str12) || isEncryptedDialog) {
                                                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                } else {
                                                    MessagesStorage messagesStorage = accountInstance.getMessagesStorage();
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str5);
                                                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                                    sb.append(file.length());
                                                    Object[] sentFile2 = messagesStorage.getSentFile(sb.toString(), !isEncryptedDialog ? 1 : 4);
                                                    if (sentFile2 != null) {
                                                        Object obj4 = sentFile2[0];
                                                        if (obj4 instanceof TLRPC.TL_document) {
                                                            str21 = (String) sentFile2[1];
                                                            tL_document = (TLRPC.TL_document) obj4;
                                                            file2 = file;
                                                            str13 = str5;
                                                            bitmap = cover;
                                                            i6 = 2;
                                                            str14 = str12;
                                                            str15 = "";
                                                            z7 = isEncryptedDialog;
                                                            mimeTypeMap = singleton;
                                                            j6 = j5;
                                                            i5 = 0;
                                                            i7 = -1;
                                                            ensureMediaThumbExists(accountInstance, isEncryptedDialog, tL_document, str13, null, 0L);
                                                            str16 = str21;
                                                        }
                                                    }
                                                }
                                                tL_document = tL_document3;
                                                file2 = file;
                                                str13 = str5;
                                                bitmap = cover;
                                                i6 = 2;
                                                str14 = str12;
                                                str15 = "";
                                                z7 = isEncryptedDialog;
                                                mimeTypeMap = singleton;
                                                j6 = j5;
                                                i5 = 0;
                                                i7 = -1;
                                                ensureMediaThumbExists(accountInstance, isEncryptedDialog, tL_document, str13, null, 0L);
                                                str16 = str21;
                                            }
                                        }
                                        str21 = null;
                                        tL_document3 = null;
                                        if (tL_document3 == null) {
                                        }
                                        tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                                        tL_document = tL_document3;
                                        file2 = file;
                                        str13 = str5;
                                        bitmap = cover;
                                        i6 = 2;
                                        str14 = str12;
                                        str15 = "";
                                        z7 = isEncryptedDialog;
                                        mimeTypeMap = singleton;
                                        j6 = j5;
                                        i5 = 0;
                                        i7 = -1;
                                        ensureMediaThumbExists(accountInstance, isEncryptedDialog, tL_document, str13, null, 0L);
                                        str16 = str21;
                                    }
                                    if (tL_document != null) {
                                        TLRPC.TL_document tL_document5 = new TLRPC.TL_document();
                                        tL_document5.id = j6;
                                        tL_document5.date = accountInstance.getConnectionsManager().getCurrentTime();
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = name;
                                        tL_document5.file_reference = new byte[i5];
                                        tL_document5.attributes.add(tL_documentAttributeFilename);
                                        tL_document5.size = file2.length();
                                        tL_document5.dc_id = i5;
                                        if (tL_documentAttributeAudio2 != null) {
                                            tL_documentAttributeAudio3 = tL_documentAttributeAudio2;
                                            tL_document5.attributes.add(tL_documentAttributeAudio3);
                                        } else {
                                            tL_documentAttributeAudio3 = tL_documentAttributeAudio2;
                                        }
                                        if (str7.length() != 0) {
                                            switch (str272222222.hashCode()) {
                                                case 106458:
                                                    str20 = str272222222;
                                                    if (str20.equals(obj)) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 108272:
                                                    str20 = str272222222;
                                                    if (str20.equals(obj2)) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 109967:
                                                    str20 = str272222222;
                                                    if (str20.equals("ogg")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 3145576:
                                                    str20 = str272222222;
                                                    if (str20.equals("flac")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 3418175:
                                                    str20 = str272222222;
                                                    if (str20.equals("opus")) {
                                                        c = 4;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 3645340:
                                                    str20 = str272222222;
                                                    if (str20.equals("webp")) {
                                                        c = 5;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                default:
                                                    str20 = str272222222;
                                                    c = 65535;
                                                    break;
                                            }
                                            switch (c) {
                                                case 0:
                                                    tL_document5.mime_type = "audio/m4a";
                                                    break;
                                                case 1:
                                                    tL_document5.mime_type = "audio/mpeg";
                                                    break;
                                                case 2:
                                                    tL_document5.mime_type = "audio/ogg";
                                                    break;
                                                case 3:
                                                    tL_document5.mime_type = "audio/flac";
                                                    break;
                                                case 4:
                                                    tL_document5.mime_type = "audio/opus";
                                                    break;
                                                case 5:
                                                    tL_document5.mime_type = "image/webp";
                                                    break;
                                                default:
                                                    String mimeTypeFromExtension = mimeTypeMap.getMimeTypeFromExtension(str20);
                                                    if (mimeTypeFromExtension != null) {
                                                        tL_document5.mime_type = mimeTypeFromExtension;
                                                        break;
                                                    } else {
                                                        tL_document5.mime_type = "application/octet-stream";
                                                        break;
                                                    }
                                            }
                                        } else {
                                            tL_document5.mime_type = "application/octet-stream";
                                        }
                                        if (!z3 && tL_document5.mime_type.equals("image/gif") && (messageObject3 == null || messageObject3.getGroupIdForUse() == j6)) {
                                            try {
                                                loadBitmap = ImageLoader.loadBitmap(file2.getAbsolutePath(), null, 90.0f, 90.0f, true);
                                            } catch (Exception e12) {
                                                e = e12;
                                                z8 = z7;
                                            }
                                            if (loadBitmap != null) {
                                                tL_documentAttributeFilename.file_name = "animation.gif";
                                                tL_document5.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                z8 = z7;
                                                try {
                                                    TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, z8);
                                                    if (scaleAndSaveImage2 != null) {
                                                        tL_document5.thumbs.add(scaleAndSaveImage2);
                                                        tL_document5.flags |= 1;
                                                    }
                                                    loadBitmap.recycle();
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    FileLog.e(e);
                                                    if (bitmap != null) {
                                                    }
                                                    if (tL_document5.mime_type.equals("image/webp")) {
                                                    }
                                                    str17 = str13;
                                                    str18 = str15;
                                                    tL_document2 = tL_document5;
                                                    if (charSequence != null) {
                                                    }
                                                    hashMap = new HashMap();
                                                    str19 = str14;
                                                    if (str19 != null) {
                                                    }
                                                    if (z3) {
                                                    }
                                                    if (str16 != null) {
                                                    }
                                                    Integer valueOf2222222 = Integer.valueOf(i5);
                                                    if (numArr != null) {
                                                    }
                                                    z9 = false;
                                                    if (z8) {
                                                    }
                                                    final TLRPC.TL_document tL_document42222222 = tL_document2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document42222222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                        }
                                                    });
                                                    return 0;
                                                }
                                                if (bitmap != null) {
                                                    TLRPC.PhotoSize scaleAndSaveImage3 = ImageLoader.scaleAndSaveImage(bitmap, 132.0f, 132.0f, 55, z8);
                                                    if (scaleAndSaveImage3 != null) {
                                                        tL_document5.thumbs.add(scaleAndSaveImage3);
                                                        tL_document5.flags |= 1;
                                                    }
                                                    bitmap.recycle();
                                                }
                                                if (tL_document5.mime_type.equals("image/webp") || messageObject3 != null) {
                                                    str17 = str13;
                                                } else {
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    try {
                                                        options.inJustDecodeBounds = true;
                                                        str17 = str13;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        str17 = str13;
                                                    }
                                                    try {
                                                        BitmapFactory.decodeFile(str17, options);
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        FileLog.e(e);
                                                        i8 = options.outWidth;
                                                        if (i8 != 0) {
                                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                            str18 = str15;
                                                            tL_documentAttributeSticker.alt = str18;
                                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                            tL_document5.attributes.add(tL_documentAttributeSticker);
                                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                                            tL_documentAttributeImageSize.w = options.outWidth;
                                                            tL_documentAttributeImageSize.h = options.outHeight;
                                                            tL_document5.attributes.add(tL_documentAttributeImageSize);
                                                            scaleAndSaveImage = ImageLoader.scaleAndSaveImage(null, ImageLoader.loadBitmap(file2.getAbsolutePath(), null, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, false, 400.0f, 400.0f, 100, z8, 0, 0, false);
                                                            if (scaleAndSaveImage != null) {
                                                            }
                                                            tL_document2 = tL_document5;
                                                            if (charSequence != null) {
                                                            }
                                                            hashMap = new HashMap();
                                                            str19 = str14;
                                                            if (str19 != null) {
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (str16 != null) {
                                                            }
                                                            Integer valueOf22222222 = Integer.valueOf(i5);
                                                            if (numArr != null) {
                                                            }
                                                            z9 = false;
                                                            if (z8) {
                                                            }
                                                            final TLRPC.TL_document tL_document422222222 = tL_document2;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document422222222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                                }
                                                            });
                                                            return 0;
                                                        }
                                                        str18 = str15;
                                                        tL_document2 = tL_document5;
                                                        if (charSequence != null) {
                                                        }
                                                        hashMap = new HashMap();
                                                        str19 = str14;
                                                        if (str19 != null) {
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (str16 != null) {
                                                        }
                                                        Integer valueOf222222222 = Integer.valueOf(i5);
                                                        if (numArr != null) {
                                                        }
                                                        z9 = false;
                                                        if (z8) {
                                                        }
                                                        final TLRPC.TL_document tL_document4222222222 = tL_document2;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document4222222222, str17, hashMap, str16, j, messageObject, messageObject2, r14, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                            }
                                                        });
                                                        return 0;
                                                    }
                                                    i8 = options.outWidth;
                                                    if (i8 != 0 && (i9 = options.outHeight) != 0 && i8 <= 800 && i9 <= 800) {
                                                        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker2 = new TLRPC.TL_documentAttributeSticker();
                                                        str18 = str15;
                                                        tL_documentAttributeSticker2.alt = str18;
                                                        tL_documentAttributeSticker2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                        tL_document5.attributes.add(tL_documentAttributeSticker2);
                                                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize2 = new TLRPC.TL_documentAttributeImageSize();
                                                        tL_documentAttributeImageSize2.w = options.outWidth;
                                                        tL_documentAttributeImageSize2.h = options.outHeight;
                                                        tL_document5.attributes.add(tL_documentAttributeImageSize2);
                                                        scaleAndSaveImage = ImageLoader.scaleAndSaveImage(null, ImageLoader.loadBitmap(file2.getAbsolutePath(), null, 400.0f, 400.0f, true), Bitmap.CompressFormat.PNG, false, 400.0f, 400.0f, 100, z8, 0, 0, false);
                                                        if (scaleAndSaveImage != null) {
                                                            tL_document5.thumbs.add(scaleAndSaveImage);
                                                            tL_document5.flags |= 1;
                                                        }
                                                        tL_document2 = tL_document5;
                                                    }
                                                }
                                                str18 = str15;
                                                tL_document2 = tL_document5;
                                            }
                                        }
                                        z8 = z7;
                                        if (bitmap != null) {
                                        }
                                        if (tL_document5.mime_type.equals("image/webp")) {
                                        }
                                        str17 = str13;
                                        str18 = str15;
                                        tL_document2 = tL_document5;
                                    } else {
                                        str17 = str13;
                                        tL_documentAttributeAudio3 = tL_documentAttributeAudio2;
                                        z8 = z7;
                                        str18 = str15;
                                        tL_document2 = tL_document;
                                    }
                                    final String charSequence2 = charSequence != null ? charSequence.toString() : str18;
                                    hashMap = new HashMap();
                                    str19 = str14;
                                    if (str19 != null) {
                                        hashMap.put("originalPath", str19);
                                    }
                                    if (z3 && tL_documentAttributeAudio3 == null) {
                                        hashMap.put("forceDocument", "1");
                                    }
                                    if (str16 != null) {
                                        hashMap.put("parentObject", str16);
                                    }
                                    Integer valueOf2222222222 = Integer.valueOf(i5);
                                    if (numArr != null) {
                                        valueOf2222222222 = numArr[i5];
                                        String str28 = tL_document2.mime_type;
                                        if (str28 != null && str28.toLowerCase().startsWith("image/webp")) {
                                            numArr[i5] = Integer.valueOf(i7);
                                            z9 = true;
                                            if (z8 && jArr != null) {
                                                if (numArr != null && valueOf2222222222 != null && valueOf2222222222 != numArr[i5]) {
                                                    finishGroup(accountInstance, jArr[i5], i);
                                                    jArr[i5] = Utilities.random.nextLong();
                                                }
                                                if (!z9) {
                                                    hashMap.put("groupId", str18 + jArr[i5]);
                                                    if (z) {
                                                        hashMap.put("final", "1");
                                                    }
                                                }
                                            }
                                            final TLRPC.TL_document tL_document42222222222 = tL_document2;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document42222222222, str17, hashMap, str16, j, messageObject, messageObject2, charSequence2, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                                }
                                            });
                                            return 0;
                                        }
                                        String str29 = tL_document2.mime_type;
                                        if ((str29 != null && (str29.toLowerCase().startsWith("image/") || tL_document2.mime_type.toLowerCase().startsWith("video/mp4"))) || MessageObject.canPreviewDocument(tL_document2)) {
                                            numArr[i5] = 1;
                                        } else if (tL_documentAttributeAudio3 != null) {
                                            numArr[i5] = Integer.valueOf(i6);
                                        } else {
                                            numArr[i5] = Integer.valueOf(i5);
                                        }
                                    }
                                    z9 = false;
                                    if (z8) {
                                    }
                                    final TLRPC.TL_document tL_document422222222222 = tL_document2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document422222222222, str17, hashMap, str16, j, messageObject, messageObject2, charSequence2, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                        }
                                    });
                                    return 0;
                                }
                                if (tL_documentAttributeAudio != null) {
                                    str22 = str2 + MediaStreamTrack.AUDIO_TRACK_KIND + file.length();
                                } else {
                                    str22 = str2 + "" + file.length();
                                }
                                str12 = str22;
                            }
                            z6 = false;
                            if (!z6) {
                            }
                            bitmap = cover;
                            file2 = file;
                            str13 = str5;
                            str14 = str12;
                            str15 = "";
                            z7 = isEncryptedDialog;
                            mimeTypeMap = singleton;
                            tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                            j6 = j5;
                            i5 = 0;
                            i6 = 2;
                            i7 = -1;
                            str16 = null;
                            tL_document = null;
                            if (tL_document != null) {
                            }
                            if (charSequence != null) {
                            }
                            hashMap = new HashMap();
                            str19 = str14;
                            if (str19 != null) {
                            }
                            if (z3) {
                                hashMap.put("forceDocument", "1");
                            }
                            if (str16 != null) {
                            }
                            Integer valueOf22222222222 = Integer.valueOf(i5);
                            if (numArr != null) {
                            }
                            z9 = false;
                            if (z8) {
                            }
                            final TLRPC.TL_document tL_document4222222222222 = tL_document2;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document4222222222222, str17, hashMap, str16, j, messageObject, messageObject2, charSequence2, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                                }
                            });
                            return 0;
                        }
                        str6 = str5.substring(lastIndexOf + 1);
                    }
                    str7 = str6;
                    lowerCase = str7.toLowerCase();
                    if (!lowerCase.equals("mp3")) {
                    }
                    audioInfo = AudioInfo.getAudioInfo(file);
                    if (audioInfo != null) {
                    }
                    j5 = 0;
                    cover = null;
                    str11 = null;
                    str10 = null;
                    i4 = 0;
                    z5 = false;
                    String str2722222222 = lowerCase;
                    if (i4 != 0) {
                    }
                    if (str2 == null) {
                    }
                    z6 = false;
                    if (!z6) {
                    }
                    bitmap = cover;
                    file2 = file;
                    str13 = str5;
                    str14 = str12;
                    str15 = "";
                    z7 = isEncryptedDialog;
                    mimeTypeMap = singleton;
                    tL_documentAttributeAudio2 = tL_documentAttributeAudio;
                    j6 = j5;
                    i5 = 0;
                    i6 = 2;
                    i7 = -1;
                    str16 = null;
                    tL_document = null;
                    if (tL_document != null) {
                    }
                    if (charSequence != null) {
                    }
                    hashMap = new HashMap();
                    str19 = str14;
                    if (str19 != null) {
                    }
                    if (z3) {
                    }
                    if (str16 != null) {
                    }
                    Integer valueOf222222222222 = Integer.valueOf(i5);
                    if (numArr != null) {
                    }
                    z9 = false;
                    if (z8) {
                    }
                    final TLRPC.TL_document tL_document42222222222222 = tL_document2;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda66
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.lambda$prepareSendingDocumentInternal$94(MessageObject.this, accountInstance, tL_document42222222222222, str17, hashMap, str16, j, messageObject, messageObject2, charSequence2, arrayList, z2, i, i2, storyItem, replyQuote, str4, i3, j2, z4, j3, j4, messageSuggestionParams);
                        }
                    });
                    return 0;
                }
            }
            str5 = copyFileToCache;
        }
        str6 = null;
        file = new File(str5);
        return !file.exists() ? 1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingDocumentInternal$94(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap hashMap, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, String str3, ArrayList arrayList, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str4, int i3, long j2, boolean z2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, str, null, hashMap, false, false, str2);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_document, null, str, j, messageObject2, messageObject3, str3, arrayList, null, hashMap, z, i, i2, 0, str2, null, false);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str4;
        of.quick_reply_shortcut_id = i3;
        of.effect_id = j2;
        of.invert_media = z2;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    private static boolean checkFileSize(AccountInstance accountInstance, Uri uri) {
        long j = 0;
        try {
            AssetFileDescriptor openAssetFileDescriptor = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r", null);
            if (openAssetFileDescriptor != null) {
                openAssetFileDescriptor.getLength();
            }
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            j = query.getLong(columnIndex);
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return !FileLoader.checkUploadFileSize(accountInstance.getCurrentAccount(), j);
    }

    public static void prepareSendingDocument(AccountInstance accountInstance, String str, String str2, Uri uri, String str3, String str4, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, int i, InputContentInfoCompat inputContentInfoCompat, String str5, int i2, boolean z2) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        prepareSendingDocuments(accountInstance, arrayList2, arrayList3, arrayList, str3, str4, j, messageObject, messageObject2, storyItem, replyQuote, messageObject3, z, i, inputContentInfoCompat, str5, i2, 0L, z2, 0L);
    }

    public static void prepareSendingAudioDocuments(final AccountInstance accountInstance, final ArrayList<MessageObject> arrayList, final CharSequence charSequence, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final boolean z, final int i, final int i2, final MessageObject messageObject3, final String str, final int i3, final long j2, final boolean z2, final long j3) {
        new Thread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda77
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingAudioDocuments$96(arrayList, j, accountInstance, charSequence, messageObject3, messageObject, messageObject2, z, i, i2, storyItem, str, i3, j2, z2, j3);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$prepareSendingAudioDocuments$96(ArrayList arrayList, final long j, final AccountInstance accountInstance, CharSequence charSequence, final MessageObject messageObject, final MessageObject messageObject2, final MessageObject messageObject3, final boolean z, final int i, final int i2, final TL_stories.StoryItem storyItem, final String str, final int i3, final long j2, final boolean z2, final long j3) {
        final TLRPC.TL_document tL_document;
        String str2;
        final HashMap hashMap;
        int size = arrayList.size();
        long j4 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            final MessageObject messageObject4 = (MessageObject) arrayList.get(i4);
            String str3 = messageObject4.messageOwner.attachPath;
            File file = new File(str3);
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
            if (!isEncryptedDialog && size > 1 && i5 % 10 == 0) {
                j4 = Utilities.random.nextLong();
                i5 = 0;
            }
            if (str3 != null) {
                str3 = str3 + MediaStreamTrack.AUDIO_TRACK_KIND + file.length();
            }
            if (!isEncryptedDialog) {
                Object[] sentFile = accountInstance.getMessagesStorage().getSentFile(str3, !isEncryptedDialog ? 1 : 4);
                if (sentFile != null) {
                    Object obj = sentFile[0];
                    if (obj instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) obj;
                        String str4 = (String) sentFile[1];
                        ensureMediaThumbExists(accountInstance, isEncryptedDialog, tL_document, str3, null, 0L);
                        str2 = str4;
                        if (tL_document == null) {
                            tL_document = (TLRPC.TL_document) messageObject4.messageOwner.media.document;
                        }
                        if (!isEncryptedDialog && accountInstance.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) == null) {
                            return;
                        }
                        CharSequence[] charSequenceArr = {charSequence};
                        final ArrayList<TLRPC.MessageEntity> entities = i4 != 0 ? accountInstance.getMediaDataController().getEntities(charSequenceArr, true) : null;
                        final String charSequence2 = i4 == 0 ? charSequenceArr[0].toString() : null;
                        hashMap = new HashMap();
                        if (str3 != null) {
                            hashMap.put("originalPath", str3);
                        }
                        if (str2 != null) {
                            hashMap.put("parentObject", str2);
                        }
                        i5++;
                        hashMap.put("groupId", "" + j4);
                        if (i5 != 10 || i4 == size - 1) {
                            hashMap.put("final", "1");
                        }
                        final String str5 = str2;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda35
                            @Override // java.lang.Runnable
                            public final void run() {
                                SendMessagesHelper.lambda$prepareSendingAudioDocuments$95(MessageObject.this, accountInstance, tL_document, messageObject4, hashMap, str5, j, messageObject2, messageObject3, charSequence2, entities, z, i, i2, storyItem, str, i3, j2, z2, j3);
                            }
                        });
                        i4++;
                    }
                }
            }
            tL_document = null;
            str2 = null;
            if (tL_document == null) {
            }
            if (!isEncryptedDialog) {
            }
            CharSequence[] charSequenceArr2 = {charSequence};
            if (i4 != 0) {
            }
            final String charSequence22 = i4 == 0 ? charSequenceArr2[0].toString() : null;
            hashMap = new HashMap();
            if (str3 != null) {
            }
            if (str2 != null) {
            }
            i5++;
            hashMap.put("groupId", "" + j4);
            if (i5 != 10) {
            }
            hashMap.put("final", "1");
            final String str52 = str2;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingAudioDocuments$95(MessageObject.this, accountInstance, tL_document, messageObject4, hashMap, str52, j, messageObject2, messageObject3, charSequence22, entities, z, i, i2, storyItem, str, i3, j2, z2, j3);
                }
            });
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingAudioDocuments$95(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, MessageObject messageObject2, HashMap hashMap, String str, long j, MessageObject messageObject3, MessageObject messageObject4, String str2, ArrayList arrayList, boolean z, int i, int i2, TL_stories.StoryItem storyItem, String str3, int i3, long j2, boolean z2, long j3) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, messageObject2.messageOwner.attachPath, null, hashMap, false, false, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_document, null, messageObject2.messageOwner.attachPath, j, messageObject3, messageObject4, str2, arrayList, null, hashMap, z, i, i2, 0, str, null, false, false);
        of.replyToStoryItem = storyItem;
        of.quick_reply_shortcut = str3;
        of.quick_reply_shortcut_id = i3;
        of.effect_id = j2;
        of.invert_media = z2;
        of.payStars = j3;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    private static void finishGroup(final AccountInstance accountInstance, final long j, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$finishGroup$97(AccountInstance.this, j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishGroup$97(AccountInstance accountInstance, long j, int i) {
        SendMessagesHelper sendMessagesHelper = accountInstance.getSendMessagesHelper();
        ArrayList<DelayedMessage> arrayList = sendMessagesHelper.delayedMessages.get("group_" + j);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        DelayedMessage delayedMessage = arrayList.get(0);
        ArrayList<MessageObject> arrayList2 = delayedMessage.messageObjects;
        MessageObject messageObject = arrayList2.get(arrayList2.size() - 1);
        delayedMessage.finalGroupMessage = messageObject.getId();
        messageObject.messageOwner.params.put("final", "1");
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(messageObject.messageOwner);
        if (!delayedMessage.paidMedia) {
            accountInstance.getMessagesStorage().putMessages((TLRPC.messages_Messages) tL_messages_messages, delayedMessage.peer, -2, 0, false, i != 0 ? 1 : 0, 0L);
        }
        sendMessagesHelper.sendReadyToSendGroup(delayedMessage, true, true);
    }

    public static void prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Uri> arrayList3, String str, String str2, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, int i, InputContentInfoCompat inputContentInfoCompat, String str3, int i2, long j2, boolean z2, long j3) {
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, str, null, str2, j, messageObject, messageObject2, storyItem, replyQuote, messageObject3, z, i, 0, inputContentInfoCompat, str3, i2, j2, z2, j3, 0L, null);
    }

    public static void prepareSendingDocuments(final AccountInstance accountInstance, final ArrayList<String> arrayList, final ArrayList<String> arrayList2, final ArrayList<Uri> arrayList3, final String str, final ArrayList<TLRPC.MessageEntity> arrayList4, final String str2, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject messageObject3, final boolean z, final int i, final int i2, final InputContentInfoCompat inputContentInfoCompat, final String str3, final int i3, final long j2, final boolean z2, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingDocuments$98(j, arrayList, str, accountInstance, i, arrayList2, str2, messageObject, messageObject2, storyItem, replyQuote, arrayList4, messageObject3, z, i2, inputContentInfoCompat, str3, i3, j2, z2, j3, j4, messageSuggestionParams, arrayList3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingDocuments$98(long j, ArrayList arrayList, String str, AccountInstance accountInstance, int i, ArrayList arrayList2, String str2, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList arrayList3, MessageObject messageObject3, boolean z, int i2, InputContentInfoCompat inputContentInfoCompat, String str3, int i3, long j2, boolean z2, long j3, long j4, MessageSuggestionParams messageSuggestionParams, ArrayList arrayList4) {
        Integer[] numArr;
        long[] jArr;
        ArrayList arrayList5;
        int i4;
        boolean z3;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3 = accountInstance;
        int i5 = i;
        int i6 = 1;
        long[] jArr2 = new long[1];
        Integer[] numArr2 = new Integer[1];
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        int i7 = 10;
        if (arrayList != null) {
            int size = arrayList.size();
            i4 = 0;
            int i8 = 0;
            boolean z4 = true;
            int i9 = 0;
            while (i9 < size) {
                String str4 = i9 == 0 ? str : null;
                if (!isEncryptedDialog && size > i6 && i8 % 10 == 0) {
                    long j5 = jArr2[0];
                    if (j5 != 0) {
                        finishGroup(accountInstance3, j5, i5);
                    }
                    jArr2[0] = Utilities.random.nextLong();
                    i8 = 0;
                }
                int i10 = i8 + 1;
                long j6 = jArr2[0];
                int i11 = i9;
                int i12 = size;
                Integer[] numArr3 = numArr2;
                long[] jArr3 = jArr2;
                i4 = prepareSendingDocumentInternal(accountInstance, (String) arrayList.get(i9), (String) arrayList2.get(i9), null, str2, j, messageObject, messageObject2, storyItem, replyQuote, i9 == 0 ? arrayList3 : null, messageObject3, jArr3, i10 == i7 || i9 == size + (-1), str4, z, i, i2, numArr3, inputContentInfoCompat == null, str3, i3, z4 ? j2 : 0L, z2, j3, j4, messageSuggestionParams);
                long j7 = jArr3[0];
                i8 = (j6 != j7 || j7 == -1) ? 1 : i10;
                i9 = i11 + 1;
                accountInstance3 = accountInstance;
                i5 = i;
                size = i12;
                numArr2 = numArr3;
                jArr2 = jArr3;
                z4 = false;
                i7 = 10;
                i6 = 1;
            }
            numArr = numArr2;
            jArr = jArr2;
            arrayList5 = arrayList4;
            z3 = z4;
        } else {
            numArr = numArr2;
            jArr = jArr2;
            arrayList5 = arrayList4;
            i4 = 0;
            z3 = true;
        }
        if (arrayList5 != null) {
            jArr[0] = 0;
            int size2 = arrayList4.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String str5 = (i14 == 0 && (arrayList == null || arrayList.size() == 0)) ? str : null;
                ArrayList arrayList6 = (i14 == 0 && (arrayList == null || arrayList.size() == 0)) ? arrayList3 : null;
                if (isEncryptedDialog) {
                    accountInstance2 = accountInstance;
                } else if (size2 <= 1 || i13 % 10 != 0) {
                    accountInstance2 = accountInstance;
                } else {
                    long j8 = jArr[0];
                    accountInstance2 = accountInstance;
                    if (j8 != 0) {
                        finishGroup(accountInstance2, j8, i);
                    }
                    jArr[0] = Utilities.random.nextLong();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                long j9 = jArr[0];
                int i16 = i14;
                int i17 = size2;
                i4 = prepareSendingDocumentInternal(accountInstance, null, null, (Uri) arrayList5.get(i14), str2, j, messageObject, messageObject2, storyItem, replyQuote, arrayList6, messageObject3, jArr, i15 == 10 || i14 == size2 + (-1), str5, z, i, i2, numArr, inputContentInfoCompat == null, str3, i3, z3 ? j2 : 0L, z2, j3, j4, messageSuggestionParams);
                long j10 = jArr[0];
                i13 = (j9 != j10 || j10 == -1) ? 1 : i15;
                i14 = i16 + 1;
                arrayList5 = arrayList4;
                size2 = i17;
                z3 = false;
            }
        }
        if (inputContentInfoCompat != null) {
            inputContentInfoCompat.releasePermission();
        }
        handleError(i4, accountInstance);
    }

    private static void handleError(final int i, final AccountInstance accountInstance) {
        if (i != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$handleError$99(i, accountInstance);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleError$99(int i, AccountInstance accountInstance) {
        try {
            if (i == 1) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.UnsupportedAttachment));
            } else if (i != 2) {
            } else {
                NotificationCenter.getInstance(accountInstance.getCurrentAccount()).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserShowLimitReachedDialog, 6);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, ChatActivity.ReplyQuote replyQuote, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, boolean z, int i2, int i3, String str2, int i4) {
        prepareSendingPhoto(accountInstance, str, null, uri, j, messageObject, messageObject2, null, null, arrayList, arrayList2, inputContentInfoCompat, i, messageObject3, null, z, i2, 0, i3, false, charSequence, str2, i4, 0L, 0L, 0L, null);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2, CharSequence charSequence, String str3, int i4, long j2, long j3) {
        prepareSendingPhoto(accountInstance, str, str2, uri, j, messageObject, messageObject2, storyItem, replyQuote, arrayList, arrayList2, inputContentInfoCompat, i, messageObject3, videoEditedInfo, z, i2, 0, i3, z2, charSequence, str3, i4, j2, j3, 0L, null);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, int i4, boolean z2, CharSequence charSequence, String str3, int i5, long j2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        SendingMediaInfo sendingMediaInfo = new SendingMediaInfo();
        sendingMediaInfo.path = str;
        sendingMediaInfo.thumbPath = str2;
        sendingMediaInfo.uri = uri;
        if (charSequence != null) {
            sendingMediaInfo.caption = charSequence.toString();
        }
        sendingMediaInfo.entities = arrayList;
        sendingMediaInfo.ttl = i;
        if (arrayList2 != null) {
            sendingMediaInfo.masks = new ArrayList<>(arrayList2);
        }
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(sendingMediaInfo);
        prepareSendingMedia(accountInstance, arrayList3, j, messageObject, messageObject2, null, replyQuote, z2, false, messageObject3, z, i2, 0, i4, false, inputContentInfoCompat, str3, i5, j2, false, j3, j4, messageSuggestionParams);
    }

    public static void prepareSendingBotContextResult(BaseFragment baseFragment, AccountInstance accountInstance, TLRPC.BotInlineResult botInlineResult, HashMap<String, String> hashMap, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, boolean z, int i, int i2, String str, int i3, long j2) {
        prepareSendingBotContextResult(baseFragment, accountInstance, botInlineResult, hashMap, j, messageObject, messageObject2, storyItem, replyQuote, z, i, i2, str, i3, j2, 0L);
    }

    public static void prepareSendingBotContextResult(final BaseFragment baseFragment, final AccountInstance accountInstance, final TLRPC.BotInlineResult botInlineResult, final HashMap<String, String> hashMap, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, final int i, final int i2, final String str, final int i3, final long j2, final long j3) {
        SendMessageParams of;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda97
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingBotContextResult$103(j, botInlineResult, accountInstance, hashMap, baseFragment, messageObject, messageObject2, z, i, i2, str, i3, storyItem, replyQuote, j2, j3);
                }
            }).run();
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (DialogObject.isEncryptedDialog(j)) {
                for (int i4 = 0; i4 < botInlineResult.send_message.entities.size(); i4++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i4);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str2 = botInlineResult.send_message.message;
                        int i5 = messageEntity.offset;
                        tL_webPagePending.url = str2.substring(i5, messageEntity.length + i5);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            SendMessageParams of2 = SendMessageParams.of(botInlineMessage2.message, j, messageObject, messageObject2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z, i, i2, null, false);
            of2.quick_reply_shortcut = str;
            of2.quick_reply_shortcut_id = i3;
            of2.replyQuote = replyQuote;
            of2.payStars = j2;
            of2.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str3 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str3;
            tL_messageMediaVenue.venue_type = str3;
            if (str3 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            SendMessageParams of3 = SendMessageParams.of(tL_messageMediaVenue, j, messageObject, messageObject2, botInlineMessage3.reply_markup, hashMap, z, i, i2);
            of3.quick_reply_shortcut = str;
            of3.quick_reply_shortcut_id = i3;
            of3.replyQuote = replyQuote;
            of3.payStars = j2;
            of3.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of3);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period != 0 || botInlineMessage.proximity_notification_radius != 0) {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                int i6 = botInlineMessage4.period;
                if (i6 == 0) {
                    i6 = 900;
                }
                tL_messageMediaGeoLive.period = i6;
                tL_messageMediaGeoLive.geo = botInlineMessage4.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage4.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage4.proximity_notification_radius;
                of = SendMessageParams.of(tL_messageMediaGeoLive, j, messageObject, messageObject2, botInlineMessage4.reply_markup, hashMap, z, i, i2);
            } else {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage5.geo;
                tL_messageMediaGeo.heading = botInlineMessage5.heading;
                of = SendMessageParams.of(tL_messageMediaGeo, j, messageObject, messageObject2, botInlineMessage5.reply_markup, hashMap, z, i, i2);
            }
            of.quick_reply_shortcut = str;
            of.quick_reply_shortcut_id = i3;
            of.replyQuote = replyQuote;
            of.payStars = j2;
            of.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
            tL_user.phone = botInlineMessage6.phone_number;
            tL_user.first_name = botInlineMessage6.first_name;
            tL_user.last_name = botInlineMessage6.last_name;
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = botInlineResult.send_message.vcard;
            restrictionReason.platform = "";
            restrictionReason.reason = "";
            tL_user.restriction_reason.add(restrictionReason);
            SendMessageParams of4 = SendMessageParams.of(tL_user, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, hashMap, z, i, i2);
            of4.quick_reply_shortcut = str;
            of4.quick_reply_shortcut_id = i3;
            of4.replyQuote = replyQuote;
            of4.payStars = j2;
            of4.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of4);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
            TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
            tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
            tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
            tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
            tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
            TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
            if (webDocument != null) {
                tL_messageMediaInvoice.webPhoto = webDocument;
                tL_messageMediaInvoice.flags |= 1;
            }
            tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
            tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
            tL_messageMediaInvoice.start_param = "";
            SendMessageParams of5 = SendMessageParams.of(tL_messageMediaInvoice, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, hashMap, z, i, i2);
            of5.quick_reply_shortcut = str;
            of5.quick_reply_shortcut_id = i3;
            of5.replyQuote = replyQuote;
            of5.payStars = j2;
            of5.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of5);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            SendMessageParams of6 = SendMessageParams.of(botInlineMessage7.message, j, messageObject, messageObject2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z, i, i2, null, false);
            of6.quick_reply_shortcut = str;
            of6.quick_reply_shortcut_id = i3;
            of6.replyQuote = replyQuote;
            of6.payStars = j2;
            of6.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(of6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x055b  */
    /* JADX WARN: Type inference failed for: r0v82, types: [org.telegram.tgnet.TLRPC$TL_game] */
    /* JADX WARN: Type inference failed for: r16v8, types: [org.telegram.tgnet.TLRPC$TL_game] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v25, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, org.telegram.tgnet.TLRPC$TL_document] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r9v21, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r9v26, types: [org.telegram.messenger.FileLoader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$prepareSendingBotContextResult$103(final long j, final TLRPC.BotInlineResult botInlineResult, final AccountInstance accountInstance, final HashMap hashMap, final BaseFragment baseFragment, final MessageObject messageObject, final MessageObject messageObject2, final boolean z, final int i, final int i2, final String str, final int i3, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final long j2, final long j3) {
        String str2;
        Object obj;
        char c;
        String str3;
        char c2;
        String str4;
        TLRPC.TL_photo tL_photo;
        Bitmap loadBitmap;
        boolean z2;
        int i4;
        char c3;
        TLRPC.TL_photo tL_photo2;
        TLRPC.TL_photo tL_photo3;
        final TLObject tLObject;
        TLRPC.TL_document tL_document;
        final Bitmap[] bitmapArr;
        final String[] strArr;
        TLRPC.InputPeer inputPeer;
        int i5;
        TLRPC.WebDocument webDocument;
        TLRPC.TL_document tL_document2;
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        String str5 = null;
        if (!"game".equals(botInlineResult.type)) {
            if (botInlineResult instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.Document document = botInlineResult.document;
                if (document != null) {
                    if (document instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) document;
                        tL_photo2 = null;
                        tL_photo = null;
                        tL_photo3 = tL_photo;
                        tL_document2 = tL_document;
                    }
                } else {
                    TLRPC.Photo photo = botInlineResult.photo;
                    if (photo != null && (photo instanceof TLRPC.TL_photo)) {
                        tL_photo2 = (TLRPC.TL_photo) photo;
                        tL_document = null;
                        tL_photo = null;
                        tL_photo3 = tL_photo;
                        tL_document2 = tL_document;
                    }
                }
            } else {
                TLRPC.WebDocument webDocument2 = botInlineResult.content;
                if (webDocument2 != null) {
                    String httpUrlExtension = ImageLoader.getHttpUrlExtension(webDocument2.url, null);
                    File file = new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.content.url) + (TextUtils.isEmpty(httpUrlExtension) ? FileLoader.getExtensionByMimeType(botInlineResult.content.mime_type) : "." + httpUrlExtension));
                    if (file.exists()) {
                        str2 = file.getAbsolutePath();
                    } else {
                        str2 = botInlineResult.content.url;
                    }
                    String str6 = botInlineResult.type;
                    str6.hashCode();
                    switch (str6.hashCode()) {
                        case -1890252483:
                            obj = "gif";
                            if (str6.equals("sticker")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102340:
                            obj = "gif";
                            if (str6.equals(obj)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3143036:
                            if (str6.equals("file")) {
                                obj = "gif";
                                c = 2;
                                break;
                            }
                            obj = "gif";
                            c = 65535;
                            break;
                        case 93166550:
                            if (str6.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                obj = "gif";
                                c = 3;
                                break;
                            }
                            obj = "gif";
                            c = 65535;
                            break;
                        case 106642994:
                            if (str6.equals("photo")) {
                                obj = "gif";
                                c = 4;
                                break;
                            }
                            obj = "gif";
                            c = 65535;
                            break;
                        case 112202875:
                            if (str6.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                obj = "gif";
                                c = 5;
                                break;
                            }
                            obj = "gif";
                            c = 65535;
                            break;
                        case 112386354:
                            if (str6.equals("voice")) {
                                c = 6;
                                obj = "gif";
                                break;
                            }
                            obj = "gif";
                            c = 65535;
                            break;
                        default:
                            obj = "gif";
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                            TLRPC.TL_document tL_document3 = new TLRPC.TL_document();
                            tL_document3.id = 0L;
                            tL_document3.size = 0L;
                            tL_document3.dc_id = 0;
                            tL_document3.mime_type = botInlineResult.content.mime_type;
                            tL_document3.file_reference = new byte[0];
                            tL_document3.date = accountInstance.getConnectionsManager().getCurrentTime();
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                            tL_document3.attributes.add(tL_documentAttributeFilename);
                            String str7 = botInlineResult.type;
                            str7.hashCode();
                            switch (str7.hashCode()) {
                                case -1890252483:
                                    str3 = "file";
                                    if (str7.equals("sticker")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 102340:
                                    str3 = "file";
                                    if (str7.equals(obj)) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3143036:
                                    str3 = "file";
                                    if (str7.equals(str3)) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93166550:
                                    if (str7.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        str3 = "file";
                                        c2 = 3;
                                        break;
                                    }
                                    str3 = "file";
                                    c2 = 65535;
                                    break;
                                case 112202875:
                                    if (str7.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        str3 = "file";
                                        c2 = 4;
                                        break;
                                    }
                                    str3 = "file";
                                    c2 = 65535;
                                    break;
                                case 112386354:
                                    if (str7.equals("voice")) {
                                        str3 = "file";
                                        c2 = 5;
                                        break;
                                    }
                                    str3 = "file";
                                    c2 = 65535;
                                    break;
                                default:
                                    str3 = "file";
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    str4 = "x";
                                    TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                    tL_documentAttributeSticker.alt = "";
                                    tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                    tL_document3.attributes.add(tL_documentAttributeSticker);
                                    TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                    int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                                    tL_documentAttributeImageSize.w = inlineResultWidthAndHeight[0];
                                    tL_documentAttributeImageSize.h = inlineResultWidthAndHeight[1];
                                    tL_document3.attributes.add(tL_documentAttributeImageSize);
                                    tL_documentAttributeFilename.file_name = "sticker.webp";
                                    try {
                                        if (botInlineResult.thumb != null) {
                                            tL_photo = null;
                                            try {
                                                Bitmap loadBitmap2 = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                if (loadBitmap2 != null) {
                                                    TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap2, 90.0f, 90.0f, 55, false);
                                                    if (scaleAndSaveImage != null) {
                                                        tL_document3.thumbs.add(scaleAndSaveImage);
                                                        tL_document3.flags |= 1;
                                                    }
                                                    loadBitmap2.recycle();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                FileLog.e(th);
                                                if (tL_documentAttributeFilename.file_name == null) {
                                                }
                                                if (tL_document3.mime_type == null) {
                                                }
                                                if (tL_document3.thumbs.isEmpty()) {
                                                }
                                                str5 = str2;
                                                tL_photo2 = tL_photo;
                                                tL_photo3 = tL_photo2;
                                                tLObject = tL_document3;
                                                if (hashMap != null) {
                                                }
                                                bitmapArr = new Bitmap[1];
                                                strArr = new String[1];
                                                if (isEncryptedDialog) {
                                                }
                                                if (!MessageObject.isGifDocument((TLRPC.Document) tLObject)) {
                                                }
                                                if (DialogObject.isEncryptedDialog(j)) {
                                                }
                                                if (inputPeer == null) {
                                                }
                                                final String str8 = str5;
                                                final TLRPC.TL_photo tL_photo4 = tL_photo2;
                                                final ?? r16 = tL_photo3;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda24
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.lambda$prepareSendingBotContextResult$102(TLRPC.TL_document.this, bitmapArr, strArr, str8, j, messageObject, messageObject2, botInlineResult, hashMap, z, i, i2, tL_photo4, r16, str, i3, storyItem, replyQuote, j2, j3, accountInstance);
                                                    }
                                                });
                                            }
                                        }
                                        tL_photo = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        tL_photo = null;
                                    }
                                    break;
                                case 1:
                                    str4 = "x";
                                    tL_documentAttributeFilename.file_name = "animation.gif";
                                    if (str2.endsWith("mp4")) {
                                        tL_document3.mime_type = "video/mp4";
                                        tL_document3.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                    } else {
                                        tL_document3.mime_type = "image/gif";
                                    }
                                    int i6 = isEncryptedDialog ? 90 : NotificationCenter.chatlistFolderUpdate;
                                    try {
                                        if (str2.endsWith("mp4")) {
                                            loadBitmap = createVideoThumbnail(str2, 1);
                                            if (loadBitmap == null) {
                                                TLRPC.WebDocument webDocument3 = botInlineResult.thumb;
                                                if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                    String httpUrlExtension2 = ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, null);
                                                    loadBitmap = createVideoThumbnail(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + (TextUtils.isEmpty(httpUrlExtension2) ? FileLoader.getExtensionByMimeType(botInlineResult.thumb.mime_type) : "." + httpUrlExtension2)).getAbsolutePath(), 1);
                                                }
                                            }
                                        } else {
                                            float f = i6;
                                            loadBitmap = ImageLoader.loadBitmap(str2, null, f, f, true);
                                        }
                                        if (loadBitmap != null) {
                                            float f2 = i6;
                                            if (i6 > 90) {
                                                i4 = 80;
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                                i4 = 55;
                                            }
                                            TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap, f2, f2, i4, z2);
                                            if (scaleAndSaveImage2 != null) {
                                                tL_document3.thumbs.add(scaleAndSaveImage2);
                                                tL_document3.flags |= 1;
                                            }
                                            loadBitmap.recycle();
                                        }
                                    } catch (Throwable th3) {
                                        FileLog.e(th3);
                                    }
                                    tL_photo = null;
                                    break;
                                case 2:
                                    str4 = "x";
                                    int lastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                                    if (lastIndexOf != -1) {
                                        tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(lastIndexOf + 1);
                                    } else {
                                        tL_documentAttributeFilename.file_name = str3;
                                    }
                                    tL_photo = null;
                                    break;
                                case 3:
                                    str4 = "x";
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(botInlineResult);
                                    tL_documentAttributeAudio.title = botInlineResult.title;
                                    int i7 = tL_documentAttributeAudio.flags;
                                    tL_documentAttributeAudio.flags = i7 | 1;
                                    String str9 = botInlineResult.description;
                                    if (str9 != null) {
                                        tL_documentAttributeAudio.performer = str9;
                                        tL_documentAttributeAudio.flags = i7 | 3;
                                    }
                                    tL_documentAttributeFilename.file_name = "audio.mp3";
                                    tL_document3.attributes.add(tL_documentAttributeAudio);
                                    tL_photo = null;
                                    break;
                                case 4:
                                    tL_documentAttributeFilename.file_name = "video.mp4";
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                    int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                                    tL_documentAttributeVideo.w = inlineResultWidthAndHeight2[0];
                                    tL_documentAttributeVideo.h = inlineResultWidthAndHeight2[1];
                                    str4 = "x";
                                    tL_documentAttributeVideo.duration = MessageObject.getInlineResultDuration(botInlineResult);
                                    tL_documentAttributeVideo.supports_streaming = true;
                                    tL_document3.attributes.add(tL_documentAttributeVideo);
                                    try {
                                        if (botInlineResult.thumb != null) {
                                            Bitmap loadBitmap3 = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                            if (loadBitmap3 != null) {
                                                TLRPC.PhotoSize scaleAndSaveImage3 = ImageLoader.scaleAndSaveImage(loadBitmap3, 90.0f, 90.0f, 55, false);
                                                if (scaleAndSaveImage3 != null) {
                                                    tL_document3.thumbs.add(scaleAndSaveImage3);
                                                    tL_document3.flags |= 1;
                                                }
                                                loadBitmap3.recycle();
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        FileLog.e(th4);
                                    }
                                    tL_photo = null;
                                    break;
                                case 5:
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio2.duration = MessageObject.getInlineResultDuration(botInlineResult);
                                    tL_documentAttributeAudio2.voice = true;
                                    tL_documentAttributeFilename.file_name = "audio.ogg";
                                    tL_document3.attributes.add(tL_documentAttributeAudio2);
                                default:
                                    str4 = "x";
                                    tL_photo = null;
                                    break;
                            }
                            if (tL_documentAttributeFilename.file_name == null) {
                                tL_documentAttributeFilename.file_name = str3;
                            }
                            if (tL_document3.mime_type == null) {
                                tL_document3.mime_type = "application/octet-stream";
                            }
                            if (tL_document3.thumbs.isEmpty()) {
                                c3 = 0;
                            } else {
                                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                                c3 = 0;
                                tL_photoSize.w = inlineResultWidthAndHeight3[0];
                                tL_photoSize.h = inlineResultWidthAndHeight3[1];
                                tL_photoSize.size = 0;
                                tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_photoSize.type = str4;
                                tL_document3.thumbs.add(tL_photoSize);
                                tL_document3.flags |= 1;
                            }
                            str5 = str2;
                            tL_photo2 = tL_photo;
                            tL_photo3 = tL_photo2;
                            tLObject = tL_document3;
                            break;
                        case 4:
                            tL_photo2 = file.exists() ? accountInstance.getSendMessagesHelper().generatePhotoSizes(str2, null) : null;
                            if (tL_photo2 == null) {
                                tL_photo2 = new TLRPC.TL_photo();
                                tL_photo2.date = accountInstance.getConnectionsManager().getCurrentTime();
                                tL_photo2.file_reference = new byte[0];
                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                int[] inlineResultWidthAndHeight4 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                                tL_photoSize2.w = inlineResultWidthAndHeight4[0];
                                tL_photoSize2.h = inlineResultWidthAndHeight4[1];
                                tL_photoSize2.size = 1;
                                tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                tL_photoSize2.type = "x";
                                tL_photo2.sizes.add(tL_photoSize2);
                            }
                            tL_photo = null;
                            tL_photo3 = tL_photo;
                            c3 = 0;
                            str5 = str2;
                            tLObject = tL_photo3;
                            break;
                        default:
                            tL_photo2 = null;
                            tL_photo = null;
                            tL_photo3 = tL_photo;
                            c3 = 0;
                            str5 = str2;
                            tLObject = tL_photo3;
                            break;
                    }
                    if (hashMap != null && (webDocument = botInlineResult.content) != null) {
                        hashMap.put("originalPath", webDocument.url);
                    }
                    bitmapArr = new Bitmap[1];
                    strArr = new String[1];
                    if (isEncryptedDialog && tLObject != 0) {
                        for (i5 = 0; i5 < tLObject.attributes.size(); i5++) {
                            if (tLObject.attributes.get(i5) instanceof TLRPC.TL_documentAttributeVideo) {
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = (TLRPC.TL_documentAttributeVideo) tLObject.attributes.get(i5);
                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo2.flags;
                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo2.round_message;
                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo2.supports_streaming;
                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo2.duration;
                                tL_documentAttributeVideo_layer159.w = tL_documentAttributeVideo2.w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tLObject.attributes.set(i5, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (!MessageObject.isGifDocument((TLRPC.Document) tLObject)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLObject.thumbs, NotificationCenter.chatlistFolderUpdate);
                        File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tLObject);
                        if (!pathToAttach.exists()) {
                            pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tLObject, true);
                        }
                        ensureMediaThumbExists(accountInstance, isEncryptedDialog, tLObject, pathToAttach.getAbsolutePath(), null, 0L);
                        strArr[c3] = getKeyForPhotoSize(accountInstance, closestPhotoSizeWithSize, bitmapArr, true, true);
                    }
                    inputPeer = DialogObject.isEncryptedDialog(j) ? accountInstance.getMessagesController().getInputPeer(j) : tL_photo;
                    if (inputPeer == null && inputPeer.user_id != 0 && accountInstance.getMessagesController().getUserFull(inputPeer.user_id) != null && accountInstance.getMessagesController().getUserFull(inputPeer.user_id).voice_messages_forbidden && tLObject != 0) {
                        if (MessageObject.isVoiceDocument(tLObject)) {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda22
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AlertsCreator.showSendMediaAlert(7, BaseFragment.this, null);
                                }
                            });
                            return;
                        } else {
                            if (MessageObject.isRoundVideoDocument(tLObject)) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda23
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AlertsCreator.showSendMediaAlert(8, BaseFragment.this, null);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    final String str82 = str5;
                    final TLRPC.TL_photo tL_photo42 = tL_photo2;
                    final TLRPC.TL_game r162 = tL_photo3;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda24
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.lambda$prepareSendingBotContextResult$102(TLRPC.TL_document.this, bitmapArr, strArr, str82, j, messageObject, messageObject2, botInlineResult, hashMap, z, i, i2, tL_photo42, r162, str, i3, storyItem, replyQuote, j2, j3, accountInstance);
                        }
                    });
                }
            }
            tL_photo = null;
            c3 = 0;
            tL_photo2 = null;
            tLObject = 0;
            str5 = null;
            tL_photo3 = null;
            if (hashMap != null) {
                hashMap.put("originalPath", webDocument.url);
            }
            bitmapArr = new Bitmap[1];
            strArr = new String[1];
            if (isEncryptedDialog) {
                while (i5 < tLObject.attributes.size()) {
                }
            }
            if (!MessageObject.isGifDocument((TLRPC.Document) tLObject)) {
            }
            if (DialogObject.isEncryptedDialog(j)) {
            }
            if (inputPeer == null) {
            }
            final String str822 = str5;
            final TLRPC.TL_photo tL_photo422 = tL_photo2;
            final TLRPC.TL_game r1622 = tL_photo3;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingBotContextResult$102(TLRPC.TL_document.this, bitmapArr, strArr, str822, j, messageObject, messageObject2, botInlineResult, hashMap, z, i, i2, tL_photo422, r1622, str, i3, storyItem, replyQuote, j2, j3, accountInstance);
                }
            });
        }
        if (isEncryptedDialog) {
            return;
        }
        ?? tL_game = new TLRPC.TL_game();
        tL_game.title = botInlineResult.title;
        tL_game.description = botInlineResult.description;
        tL_game.short_name = botInlineResult.id;
        TLRPC.Photo photo2 = botInlineResult.photo;
        tL_game.photo = photo2;
        if (photo2 == null) {
            tL_game.photo = new TLRPC.TL_photoEmpty();
        }
        TLRPC.Document document2 = botInlineResult.document;
        if (document2 instanceof TLRPC.TL_document) {
            tL_game.document = document2;
            tL_game.flags |= 1;
        }
        tL_photo3 = tL_game;
        tL_photo2 = null;
        tL_document2 = null;
        tL_photo = null;
        c3 = 0;
        tLObject = tL_document2;
        if (hashMap != null) {
        }
        bitmapArr = new Bitmap[1];
        strArr = new String[1];
        if (isEncryptedDialog) {
        }
        if (!MessageObject.isGifDocument((TLRPC.Document) tLObject)) {
        }
        if (DialogObject.isEncryptedDialog(j)) {
        }
        if (inputPeer == null) {
        }
        final String str8222 = str5;
        final TLRPC.TL_photo tL_photo4222 = tL_photo2;
        final TLRPC.TL_game r16222 = tL_photo3;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingBotContextResult$102(TLRPC.TL_document.this, bitmapArr, strArr, str8222, j, messageObject, messageObject2, botInlineResult, hashMap, z, i, i2, tL_photo4222, r16222, str, i3, storyItem, replyQuote, j2, j3, accountInstance);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingBotContextResult$102(TLRPC.TL_document tL_document, Bitmap[] bitmapArr, String[] strArr, String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.BotInlineResult botInlineResult, HashMap hashMap, boolean z, int i, int i2, TLRPC.TL_photo tL_photo, TLRPC.TL_game tL_game, String str2, int i3, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, long j2, long j3, AccountInstance accountInstance) {
        SendMessageParams sendMessageParams;
        if (tL_document != null) {
            if (bitmapArr[0] != null && strArr[0] != null) {
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
            }
            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
            sendMessageParams = SendMessageParams.of(tL_document, null, str, j, messageObject, messageObject2, botInlineMessage.message, botInlineMessage.entities, botInlineMessage.reply_markup, hashMap, z, i, i2, 0, botInlineResult, null, false);
        } else {
            sendMessageParams = null;
            if (tL_photo != null) {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                String str3 = webDocument != null ? webDocument.url : null;
                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                sendMessageParams = SendMessageParams.of(tL_photo, str3, j, messageObject, messageObject2, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z, i, i2, 0, botInlineResult, false);
            } else if (tL_game != null) {
                sendMessageParams = SendMessageParams.of(tL_game, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, (HashMap<String, String>) hashMap, z, i, i2);
            }
        }
        if (sendMessageParams != null) {
            sendMessageParams.quick_reply_shortcut = str2;
            sendMessageParams.quick_reply_shortcut_id = i3;
            sendMessageParams.replyToStoryItem = storyItem;
            sendMessageParams.replyQuote = replyQuote;
            sendMessageParams.payStars = j2;
            sendMessageParams.monoForumPeer = j3;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParams);
        }
    }

    public static String getTrimmedString(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return trim;
        }
        while (str.startsWith("\n")) {
            str = str.substring(1);
        }
        while (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void prepareSendingText(AccountInstance accountInstance, String str, long j, boolean z, int i, int i2, long j2) {
        prepareSendingText(accountInstance, str, j, 0L, z, i, i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingText$105(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final int i2, final long j3) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda82
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$104(str, j, accountInstance, j2, z, i, i2, j3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingText$106(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final int i2, final long j3) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$105(str, j, accountInstance, j2, z, i, i2, j3);
            }
        });
    }

    public static void prepareSendingText(final AccountInstance accountInstance, final String str, final long j, final long j2, final boolean z, final int i, final int i2, final long j3) {
        accountInstance.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda59
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$106(str, j2, accountInstance, j, z, i, i2, j3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$prepareSendingText$104(String str, long j, AccountInstance accountInstance, long j2, boolean z, int i, int i2, long j3) {
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        String trimmedString = getTrimmedString(str);
        if (trimmedString.length() != 0) {
            int ceil = (int) Math.ceil(trimmedString.length() / 4096.0f);
            int i3 = 0;
            if (j != 0 && (findTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j2, j)) != null && findTopic.topicStartMessage != null) {
                messageObject = new MessageObject(accountInstance.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                messageObject.isTopicMainMessage = true;
                while (i3 < ceil) {
                    int i4 = i3 + 1;
                    SendMessageParams of = SendMessageParams.of(trimmedString.substring(i3 * 4096, Math.min(i4 * 4096, trimmedString.length())), j2, messageObject, messageObject, null, true, null, null, null, z, i, i2, null, false);
                    if (i3 == 0) {
                        of.effect_id = j3;
                    }
                    accountInstance.getSendMessagesHelper().sendMessage(of);
                    i3 = i4;
                }
            }
            messageObject = null;
            while (i3 < ceil) {
            }
        }
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z, TLObject tLObject, String str, Uri uri, long j) {
        ensureMediaThumbExists(accountInstance, z, tLObject, str, uri, j, false);
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z, TLObject tLObject, String str, Uri uri, long j, boolean z2) {
        TLRPC.PhotoSize scaleAndSaveImage;
        TLRPC.PhotoSize scaleAndSaveImage2;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, 90);
            boolean exists = ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoPathSize)) ? true : FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true).exists();
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, AndroidUtilities.getPhotoSize(z2));
            boolean exists2 = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, false).exists();
            if (exists && exists2) {
                return;
            }
            Bitmap loadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), true);
            if (loadBitmap == null) {
                loadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = loadBitmap;
            if (!exists2 && (scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize2, bitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), 80, false, 101, 101, false)) != closestPhotoSizeWithSize2) {
                tL_photo.sizes.add(0, scaleAndSaveImage2);
            }
            if (!exists && (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize, bitmap, 90.0f, 90.0f, 55, true, false)) != closestPhotoSizeWithSize) {
                tL_photo.sizes.add(0, scaleAndSaveImage);
            }
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((MessageObject.isVideoDocument(tL_document) || MessageObject.isNewGifDocument(tL_document)) && MessageObject.isDocumentHasThumb(tL_document)) {
                ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                int i = NotificationCenter.chatlistFolderUpdate;
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(arrayList, NotificationCenter.chatlistFolderUpdate);
                if ((closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoPathSize) || FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize3, true).exists()) {
                    return;
                }
                Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, j);
                Bitmap createVideoThumbnail = createVideoThumbnailAtTime == null ? createVideoThumbnail(str, 1) : createVideoThumbnailAtTime;
                if (z) {
                    i = 90;
                }
                float f = i;
                tL_document.thumbs.set(0, ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize3, createVideoThumbnail, f, f, i > 90 ? 80 : 55, false, true));
            }
        }
    }

    public static String getKeyForPhotoSize(AccountInstance accountInstance, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z, boolean z2) {
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        Point messageSize = ChatMessageCell.getMessageSize(photoSize.w, photoSize.h);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(photoSize, z2);
                FileInputStream fileInputStream = new FileInputStream(pathToAttach);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / messageSize.x, options.outHeight / messageSize.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(pathToAttach);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (messageSize.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize.y / AndroidUtilities.density)));
    }

    public static boolean shouldSendWebPAsSticker(String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return options.outWidth < 800 && options.outHeight < 800;
    }

    public static void prepareSendingMedia(final AccountInstance accountInstance, final ArrayList<SendingMediaInfo> arrayList, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, boolean z2, final MessageObject messageObject3, final boolean z3, final int i, final int i2, int i3, final boolean z4, final InputContentInfoCompat inputContentInfoCompat, final String str, final int i4, final long j2, final boolean z5, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        final boolean z6;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z6 = z2;
                break;
            } else {
                if (arrayList.get(i5).ttl > 0) {
                    z6 = false;
                    break;
                }
                i5++;
            }
        }
        mediaSendQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingMedia$112(arrayList, j, z, z6, accountInstance, messageObject3, messageObject, messageObject2, z3, i, i2, storyItem, replyQuote, str, i4, j2, z5, j3, j4, messageSuggestionParams, inputContentInfoCompat, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0a57, code lost:
    
        if (r1 == (r10 - 1)) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0774, code lost:
    
        if (r8 != null) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f9, code lost:
    
        if (shouldSendWebPAsSticker(null, r8.uri) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d9 A[Catch: Exception -> 0x03bc, TRY_LEAVE, TryCatch #10 {Exception -> 0x03bc, blocks: (B:189:0x03b4, B:146:0x03c1, B:183:0x03d0, B:148:0x03d9), top: B:188:0x03b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x076f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0f46 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0df4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x10b0  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x1195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$prepareSendingMedia$112(ArrayList arrayList, final long j, boolean z, boolean z2, final AccountInstance accountInstance, final MessageObject messageObject, final MessageObject messageObject2, final MessageObject messageObject3, final boolean z3, final int i, final int i2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final String str, final int i3, final long j2, final boolean z4, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams, InputContentInfoCompat inputContentInfoCompat, final boolean z5) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ArrayList arrayList2;
        boolean z6;
        int i4;
        int i5;
        HashMap hashMap;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList3;
        boolean z7;
        int i9;
        long j5;
        MediaController.SearchImage searchImage;
        int i10;
        ArrayList arrayList4;
        int i11;
        HashMap hashMap2;
        String str10;
        String str11;
        String str12;
        String str13;
        long j6;
        int i12;
        boolean z8;
        String str14;
        String str15;
        HashMap hashMap3;
        VideoEditedInfo videoEditedInfo;
        int i13;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        long j7;
        int i14;
        Object obj;
        SendingMediaInfo sendingMediaInfo;
        ArrayList arrayList5;
        String str21;
        long j8;
        boolean z9;
        long j9;
        String str22;
        File file;
        String str23;
        String str24;
        Object obj2;
        TLRPC.TL_document tL_document;
        String str25;
        Object obj3;
        SendingMediaInfo sendingMediaInfo2;
        TLRPC.TL_document tL_document2;
        final Bitmap bitmap;
        final String str26;
        int i15;
        TLRPC.PhotoSize photoSize;
        String str27;
        TLRPC.PhotoSize fileToSize;
        String str28;
        final String str29;
        String str30;
        ArrayList arrayList6;
        long j10;
        int i16;
        int i17;
        String str31;
        ArrayList<TLRPC.InputDocument> arrayList7;
        int size;
        int i18;
        int i19;
        TLRPC.PhotoSize photoSize2;
        String str32;
        String str33;
        String str34;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        int i20;
        int i21;
        TLRPC.FileLocation fileLocation;
        MediaController.SearchImage searchImage2;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        ArrayList arrayList8;
        boolean z10;
        Object obj4;
        String str42;
        HashMap hashMap4;
        String str43;
        String str44;
        Object obj5;
        String str45;
        Object obj6;
        Object obj7;
        final TLRPC.TL_photo tL_photo;
        String str46;
        String str47;
        String str48;
        TLRPC.TL_photo tL_photo2;
        TLRPC.TL_photo tL_photo3;
        String str49;
        long j11;
        int i22;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str50;
        AccountInstance accountInstance2;
        ArrayList arrayList11;
        int i23;
        long j12;
        int i24;
        int i25;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ?? r38;
        Uri uri;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Uri uri2;
        ArrayList arrayList15;
        String str51;
        final TLRPC.TL_photo tL_photo4;
        boolean z11;
        String str52;
        long j13;
        int i26;
        Uri uri3;
        boolean z12;
        File file2;
        TLRPC.TL_document tL_document3;
        String str53;
        String str54;
        Object obj8;
        String str55;
        File file3;
        int i27;
        Bitmap createVideoThumbnail;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        int i28;
        int i29;
        final boolean z13;
        String str63;
        String str64;
        String str65;
        String str66;
        boolean z14;
        boolean z15;
        String str67;
        1 r11;
        final SendingMediaInfo sendingMediaInfo3;
        String str68;
        TLRPC.TL_photo tL_photo5;
        TLRPC.TL_photo tL_photo6;
        String str69;
        Object[] sentFile;
        Object obj9;
        Uri uri4;
        Uri uri5;
        ArrayList arrayList16 = arrayList;
        String str70 = "parentObject";
        String str71 = "masks";
        String str72 = "-2147483648_";
        String str73 = "x";
        String str74 = "video/mp4";
        long currentTimeMillis = System.currentTimeMillis();
        int size2 = arrayList.size();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        String str75 = ".webp";
        String str76 = ".gif";
        String str77 = "_";
        boolean z16 = true;
        if (z || !z2) {
            str2 = "_";
            str3 = ".gif";
            str4 = ".webp";
            str5 = "video/mp4";
            str6 = "-2147483648_";
            str7 = "x";
            str8 = "masks";
            str9 = "parentObject";
            arrayList2 = null;
            z6 = isEncryptedDialog;
            i4 = size2;
            i5 = 1;
            hashMap = null;
        } else {
            HashMap hashMap5 = new HashMap();
            int i30 = 0;
            while (i30 < size2) {
                int i31 = size2;
                SendingMediaInfo sendingMediaInfo4 = (SendingMediaInfo) arrayList16.get(i30);
                if (sendingMediaInfo4.searchImage == null && !sendingMediaInfo4.isVideo && sendingMediaInfo4.videoEditedInfo == null) {
                    MediaController.PhotoEntry photoEntry = sendingMediaInfo4.originalPhotoEntry;
                    String str78 = str74;
                    if (photoEntry != null && sendingMediaInfo4.highQuality) {
                        photoEntry.rebuildPhoto(z16);
                        String str79 = sendingMediaInfo4.originalPhotoEntry.imagePath;
                        if (str79 != null) {
                            sendingMediaInfo4.path = str79;
                        }
                    }
                    String str80 = sendingMediaInfo4.path;
                    if (str80 != null || (uri5 = sendingMediaInfo4.uri) == null) {
                        str64 = str80;
                    } else {
                        str80 = AndroidUtilities.getPath(uri5);
                        str64 = sendingMediaInfo4.uri.toString();
                    }
                    if (str80 == null || sendingMediaInfo4.ttl > 0) {
                        str65 = str76;
                        str66 = str75;
                        z14 = false;
                    } else {
                        if (str80.endsWith(str76)) {
                            str65 = str76;
                            z14 = false;
                        } else {
                            z14 = str80.endsWith(str75);
                            str65 = str76;
                            if (!z14) {
                                str66 = str75;
                            }
                        }
                        str66 = str75;
                        if (arrayList.size() > 1 || ((z14 && !shouldSendWebPAsSticker(str80, null)) || !TextUtils.isEmpty(sendingMediaInfo4.caption))) {
                            sendingMediaInfo4.forceImage = true;
                            if (str80 != null) {
                                File file4 = new File(str80);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str64);
                                z15 = isEncryptedDialog;
                                sb.append(file4.length());
                                sb.append(str77);
                                sb.append(file4.lastModified());
                                str67 = sb.toString();
                            } else {
                                z15 = isEncryptedDialog;
                                str67 = null;
                            }
                            if (z15 && sendingMediaInfo4.ttl == 0) {
                                int i32 = sendingMediaInfo4.highQuality ? !z15 ? 6 : 7 : !z15 ? 0 : 3;
                                Object[] sentFile2 = accountInstance.getMessagesStorage().getSentFile(str67, i32);
                                if (sentFile2 != null) {
                                    Object obj10 = sentFile2[0];
                                    if (obj10 instanceof TLRPC.TL_photo) {
                                        str69 = (String) sentFile2[1];
                                        tL_photo6 = (TLRPC.TL_photo) obj10;
                                        if (tL_photo6 == null && sendingMediaInfo4.uri != null && (sentFile = accountInstance.getMessagesStorage().getSentFile(AndroidUtilities.getPath(sendingMediaInfo4.uri), i32)) != null) {
                                            obj9 = sentFile[0];
                                            if (obj9 instanceof TLRPC.TL_photo) {
                                                tL_photo6 = (TLRPC.TL_photo) obj9;
                                                str69 = (String) sentFile[1];
                                                TLRPC.TL_photo tL_photo7 = tL_photo6;
                                                String str81 = str69;
                                                str56 = str77;
                                                str57 = str65;
                                                str58 = str66;
                                                str62 = str70;
                                                str60 = str73;
                                                i28 = i31;
                                                str63 = str72;
                                                str61 = str71;
                                                z13 = z15;
                                                sendingMediaInfo3 = sendingMediaInfo4;
                                                r11 = null;
                                                str59 = str78;
                                                ensureMediaThumbExists(accountInstance, z15, tL_photo7, sendingMediaInfo4.path, sendingMediaInfo4.uri, 0L, sendingMediaInfo4.highQuality);
                                                tL_photo5 = tL_photo7;
                                                str68 = str81;
                                            }
                                        }
                                        TLRPC.TL_photo tL_photo72 = tL_photo6;
                                        String str812 = str69;
                                        str56 = str77;
                                        str57 = str65;
                                        str58 = str66;
                                        str62 = str70;
                                        str60 = str73;
                                        i28 = i31;
                                        str63 = str72;
                                        str61 = str71;
                                        z13 = z15;
                                        sendingMediaInfo3 = sendingMediaInfo4;
                                        r11 = null;
                                        str59 = str78;
                                        ensureMediaThumbExists(accountInstance, z15, tL_photo72, sendingMediaInfo4.path, sendingMediaInfo4.uri, 0L, sendingMediaInfo4.highQuality);
                                        tL_photo5 = tL_photo72;
                                        str68 = str812;
                                    }
                                }
                                tL_photo6 = null;
                                str69 = null;
                                if (tL_photo6 == null) {
                                    obj9 = sentFile[0];
                                    if (obj9 instanceof TLRPC.TL_photo) {
                                    }
                                }
                                TLRPC.TL_photo tL_photo722 = tL_photo6;
                                String str8122 = str69;
                                str56 = str77;
                                str57 = str65;
                                str58 = str66;
                                str62 = str70;
                                str60 = str73;
                                i28 = i31;
                                str63 = str72;
                                str61 = str71;
                                z13 = z15;
                                sendingMediaInfo3 = sendingMediaInfo4;
                                r11 = null;
                                str59 = str78;
                                ensureMediaThumbExists(accountInstance, z15, tL_photo722, sendingMediaInfo4.path, sendingMediaInfo4.uri, 0L, sendingMediaInfo4.highQuality);
                                tL_photo5 = tL_photo722;
                                str68 = str8122;
                            } else {
                                str56 = str77;
                                str61 = str71;
                                str59 = str78;
                                str57 = str65;
                                str58 = str66;
                                z13 = z15;
                                str60 = str73;
                                str62 = str70;
                                i28 = i31;
                                r11 = null;
                                str63 = str72;
                                sendingMediaInfo3 = sendingMediaInfo4;
                                str68 = null;
                                tL_photo5 = null;
                            }
                            final MediaSendPrepareWorker mediaSendPrepareWorker = new MediaSendPrepareWorker();
                            hashMap5.put(sendingMediaInfo3, mediaSendPrepareWorker);
                            if (tL_photo5 != null) {
                                mediaSendPrepareWorker.parentObject = str68;
                                mediaSendPrepareWorker.photo = tL_photo5;
                                i29 = 1;
                            } else {
                                i29 = 1;
                                mediaSendPrepareWorker.sync = new CountDownLatch(1);
                                mediaSendThreadPool.execute(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda106
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.lambda$prepareSendingMedia$107(SendMessagesHelper.MediaSendPrepareWorker.this, accountInstance, sendingMediaInfo3, z13);
                                    }
                                });
                            }
                            i30 += i29;
                            isEncryptedDialog = z13;
                            size2 = i28;
                            str71 = str61;
                            str72 = str63;
                            str70 = str62;
                            str73 = str60;
                            str77 = str56;
                            str76 = str57;
                            str75 = str58;
                            str74 = str59;
                            z16 = true;
                        }
                        str56 = str77;
                        str61 = str71;
                        str59 = str78;
                        str57 = str65;
                        str58 = str66;
                        i29 = 1;
                        z13 = isEncryptedDialog;
                        str60 = str73;
                        str62 = str70;
                        i28 = i31;
                    }
                    if (!ImageLoader.shouldSendImageAsDocument(sendingMediaInfo4.path, sendingMediaInfo4.uri)) {
                        if (str80 == null && (uri4 = sendingMediaInfo4.uri) != null && (MediaController.isGif(uri4) || (z14 = MediaController.isWebp(sendingMediaInfo4.uri)))) {
                            if (arrayList.size() <= 1) {
                                Object obj11 = z14 ? null : null;
                                if (TextUtils.isEmpty(sendingMediaInfo4.caption)) {
                                    str56 = str77;
                                    str61 = str71;
                                    str59 = str78;
                                    str57 = str65;
                                    str58 = str66;
                                    i29 = 1;
                                    z13 = isEncryptedDialog;
                                    str60 = str73;
                                    str62 = str70;
                                    i28 = i31;
                                }
                            }
                            sendingMediaInfo4.forceImage = true;
                            if (str80 != null) {
                            }
                            if (z15) {
                            }
                            str56 = str77;
                            str61 = str71;
                            str59 = str78;
                            str57 = str65;
                            str58 = str66;
                            z13 = z15;
                            str60 = str73;
                            str62 = str70;
                            i28 = i31;
                            r11 = null;
                            str63 = str72;
                            sendingMediaInfo3 = sendingMediaInfo4;
                            str68 = null;
                            tL_photo5 = null;
                            final MediaSendPrepareWorker mediaSendPrepareWorker2 = new MediaSendPrepareWorker();
                            hashMap5.put(sendingMediaInfo3, mediaSendPrepareWorker2);
                            if (tL_photo5 != null) {
                            }
                            i30 += i29;
                            isEncryptedDialog = z13;
                            size2 = i28;
                            str71 = str61;
                            str72 = str63;
                            str70 = str62;
                            str73 = str60;
                            str77 = str56;
                            str76 = str57;
                            str75 = str58;
                            str74 = str59;
                            z16 = true;
                        }
                        if (str80 != null) {
                        }
                        if (z15) {
                        }
                        str56 = str77;
                        str61 = str71;
                        str59 = str78;
                        str57 = str65;
                        str58 = str66;
                        z13 = z15;
                        str60 = str73;
                        str62 = str70;
                        i28 = i31;
                        r11 = null;
                        str63 = str72;
                        sendingMediaInfo3 = sendingMediaInfo4;
                        str68 = null;
                        tL_photo5 = null;
                        final MediaSendPrepareWorker mediaSendPrepareWorker22 = new MediaSendPrepareWorker();
                        hashMap5.put(sendingMediaInfo3, mediaSendPrepareWorker22);
                        if (tL_photo5 != null) {
                        }
                        i30 += i29;
                        isEncryptedDialog = z13;
                        size2 = i28;
                        str71 = str61;
                        str72 = str63;
                        str70 = str62;
                        str73 = str60;
                        str77 = str56;
                        str76 = str57;
                        str75 = str58;
                        str74 = str59;
                        z16 = true;
                    }
                    str56 = str77;
                    str61 = str71;
                    str59 = str78;
                    str57 = str65;
                    str58 = str66;
                    i29 = 1;
                    z13 = isEncryptedDialog;
                    str60 = str73;
                    str62 = str70;
                    i28 = i31;
                } else {
                    str56 = str77;
                    str57 = str76;
                    str58 = str75;
                    str59 = str74;
                    str60 = str73;
                    str61 = str71;
                    str62 = str70;
                    i28 = i31;
                    i29 = 1;
                    z13 = isEncryptedDialog;
                }
                str63 = str72;
                i30 += i29;
                isEncryptedDialog = z13;
                size2 = i28;
                str71 = str61;
                str72 = str63;
                str70 = str62;
                str73 = str60;
                str77 = str56;
                str76 = str57;
                str75 = str58;
                str74 = str59;
                z16 = true;
            }
            str2 = str77;
            str3 = str76;
            str4 = str75;
            str5 = str74;
            str6 = str72;
            str7 = str73;
            str8 = str71;
            str9 = str70;
            arrayList2 = null;
            z6 = isEncryptedDialog;
            i4 = size2;
            i5 = 1;
            hashMap = hashMap5;
        }
        ArrayList arrayList17 = arrayList2;
        ArrayList arrayList18 = arrayList17;
        ArrayList arrayList19 = arrayList18;
        ArrayList arrayList20 = arrayList19;
        ArrayList arrayList21 = arrayList20;
        ArrayList arrayList22 = arrayList21;
        int i33 = 0;
        int i34 = 0;
        long j14 = 0;
        long j15 = 0;
        ArrayList arrayList23 = arrayList21;
        while (i34 < i4) {
            final SendingMediaInfo sendingMediaInfo5 = (SendingMediaInfo) arrayList16.get(i34);
            boolean z17 = i33 == 0;
            if (z2 && i4 > i5) {
                if (i33 % 10 == 0) {
                    j15 = Utilities.random.nextLong();
                    j5 = j15;
                    i9 = 0;
                    searchImage = sendingMediaInfo5.searchImage;
                    ArrayList arrayList24 = arrayList17;
                    ArrayList arrayList25 = arrayList20;
                    i10 = i34;
                    if (searchImage == null && sendingMediaInfo5.videoEditedInfo == null) {
                        ArrayList arrayList26 = arrayList18;
                        if (searchImage.type == 1) {
                            final HashMap hashMap6 = new HashMap();
                            TLRPC.Document document = sendingMediaInfo5.searchImage.document;
                            if (document instanceof TLRPC.TL_document) {
                                tL_document3 = (TLRPC.TL_document) document;
                                file2 = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tL_document3, true);
                            } else {
                                file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo5.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo5.searchImage.imageUrl, "jpg"));
                                tL_document3 = null;
                            }
                            if (tL_document3 == null) {
                                TLRPC.TL_document tL_document4 = new TLRPC.TL_document();
                                tL_document4.id = 0L;
                                tL_document4.file_reference = new byte[0];
                                tL_document4.date = accountInstance.getConnectionsManager().getCurrentTime();
                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                tL_documentAttributeFilename.file_name = "animation.gif";
                                tL_document4.attributes.add(tL_documentAttributeFilename);
                                tL_document4.size = sendingMediaInfo5.searchImage.size;
                                tL_document4.dc_id = 0;
                                if (!z && file2.toString().endsWith("mp4")) {
                                    str54 = str5;
                                    tL_document4.mime_type = str54;
                                    tL_document4.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                } else {
                                    str54 = str5;
                                    tL_document4.mime_type = "image/gif";
                                }
                                if (file2.exists()) {
                                    file3 = file2;
                                } else {
                                    file2 = null;
                                    file3 = null;
                                }
                                if (file2 == null) {
                                    file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo5.searchImage.thumbUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo5.searchImage.thumbUrl, "jpg"));
                                    if (!file2.exists()) {
                                        file2 = null;
                                    }
                                }
                                if (file2 != null) {
                                    if (!z6) {
                                        try {
                                            if (sendingMediaInfo5.ttl == 0) {
                                                i27 = NotificationCenter.chatlistFolderUpdate;
                                                if (!file2.getAbsolutePath().endsWith("mp4")) {
                                                    try {
                                                        createVideoThumbnail = createVideoThumbnail(file2.getAbsolutePath(), 1);
                                                        obj8 = null;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        obj8 = null;
                                                        FileLog.e(e);
                                                        if (tL_document4.thumbs.isEmpty()) {
                                                        }
                                                        tL_document3 = tL_document4;
                                                        file2 = file3;
                                                        if (file2 != null) {
                                                        }
                                                        str55 = sendingMediaInfo5.searchImage.imageUrl;
                                                        if (str55 != null) {
                                                        }
                                                        final String str82 = null;
                                                        String str83 = str53;
                                                        ArrayList arrayList27 = arrayList19;
                                                        final TLRPC.TL_document tL_document5 = tL_document3;
                                                        str19 = str6;
                                                        z8 = z6;
                                                        final boolean z18 = z17;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda107
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.lambda$prepareSendingMedia$108(MessageObject.this, accountInstance, tL_document5, r7, hashMap6, sendingMediaInfo5, str82, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, z18, j2, z4, j3, j4, messageSuggestionParams);
                                                            }
                                                        });
                                                        i14 = i4;
                                                        i33 = i9;
                                                        arrayList18 = arrayList26;
                                                        arrayList17 = arrayList24;
                                                        arrayList19 = arrayList27;
                                                        arrayList20 = arrayList25;
                                                        i13 = i10;
                                                        str14 = str83;
                                                        str18 = str8;
                                                        str20 = str9;
                                                        obj = null;
                                                        long j16 = j5;
                                                        str17 = str2;
                                                        str16 = str54;
                                                        hashMap3 = hashMap;
                                                        j7 = j16;
                                                        i34 = i13 + 1;
                                                        arrayList16 = arrayList;
                                                        hashMap = hashMap3;
                                                        str7 = str14;
                                                        str2 = str17;
                                                        str5 = str16;
                                                        z6 = z8;
                                                        str8 = str18;
                                                        str9 = str20;
                                                        j14 = j7;
                                                        str6 = str19;
                                                        i4 = i14;
                                                        i5 = 1;
                                                        arrayList23 = arrayList23;
                                                    }
                                                } else {
                                                    float f = i27;
                                                    obj8 = null;
                                                    createVideoThumbnail = ImageLoader.loadBitmap(file2.getAbsolutePath(), null, f, f, true);
                                                }
                                                if (createVideoThumbnail != null) {
                                                    try {
                                                        float f2 = i27;
                                                        TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(createVideoThumbnail, f2, f2, i27 > 90 ? 80 : 55, z6);
                                                        if (scaleAndSaveImage != null) {
                                                            tL_document4.thumbs.add(scaleAndSaveImage);
                                                            tL_document4.flags |= 1;
                                                        }
                                                        createVideoThumbnail.recycle();
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        FileLog.e(e);
                                                        if (tL_document4.thumbs.isEmpty()) {
                                                        }
                                                        tL_document3 = tL_document4;
                                                        file2 = file3;
                                                        if (file2 != null) {
                                                        }
                                                        str55 = sendingMediaInfo5.searchImage.imageUrl;
                                                        if (str55 != null) {
                                                        }
                                                        final String str822 = null;
                                                        String str832 = str53;
                                                        ArrayList arrayList272 = arrayList19;
                                                        final TLRPC.TL_document tL_document52 = tL_document3;
                                                        str19 = str6;
                                                        z8 = z6;
                                                        final boolean z182 = z17;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda107
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                SendMessagesHelper.lambda$prepareSendingMedia$108(MessageObject.this, accountInstance, tL_document52, r7, hashMap6, sendingMediaInfo5, str822, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, z182, j2, z4, j3, j4, messageSuggestionParams);
                                                            }
                                                        });
                                                        i14 = i4;
                                                        i33 = i9;
                                                        arrayList18 = arrayList26;
                                                        arrayList17 = arrayList24;
                                                        arrayList19 = arrayList272;
                                                        arrayList20 = arrayList25;
                                                        i13 = i10;
                                                        str14 = str832;
                                                        str18 = str8;
                                                        str20 = str9;
                                                        obj = null;
                                                        long j162 = j5;
                                                        str17 = str2;
                                                        str16 = str54;
                                                        hashMap3 = hashMap;
                                                        j7 = j162;
                                                        i34 = i13 + 1;
                                                        arrayList16 = arrayList;
                                                        hashMap = hashMap3;
                                                        str7 = str14;
                                                        str2 = str17;
                                                        str5 = str16;
                                                        z6 = z8;
                                                        str8 = str18;
                                                        str9 = str20;
                                                        j14 = j7;
                                                        str6 = str19;
                                                        i4 = i14;
                                                        i5 = 1;
                                                        arrayList23 = arrayList23;
                                                    }
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            obj8 = null;
                                            FileLog.e(e);
                                            if (tL_document4.thumbs.isEmpty()) {
                                            }
                                            tL_document3 = tL_document4;
                                            file2 = file3;
                                            if (file2 != null) {
                                            }
                                            str55 = sendingMediaInfo5.searchImage.imageUrl;
                                            if (str55 != null) {
                                            }
                                            final String str8222 = null;
                                            String str8322 = str53;
                                            ArrayList arrayList2722 = arrayList19;
                                            final TLRPC.TL_document tL_document522 = tL_document3;
                                            str19 = str6;
                                            z8 = z6;
                                            final boolean z1822 = z17;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda107
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    SendMessagesHelper.lambda$prepareSendingMedia$108(MessageObject.this, accountInstance, tL_document522, r7, hashMap6, sendingMediaInfo5, str8222, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, z1822, j2, z4, j3, j4, messageSuggestionParams);
                                                }
                                            });
                                            i14 = i4;
                                            i33 = i9;
                                            arrayList18 = arrayList26;
                                            arrayList17 = arrayList24;
                                            arrayList19 = arrayList2722;
                                            arrayList20 = arrayList25;
                                            i13 = i10;
                                            str14 = str8322;
                                            str18 = str8;
                                            str20 = str9;
                                            obj = null;
                                            long j1622 = j5;
                                            str17 = str2;
                                            str16 = str54;
                                            hashMap3 = hashMap;
                                            j7 = j1622;
                                            i34 = i13 + 1;
                                            arrayList16 = arrayList;
                                            hashMap = hashMap3;
                                            str7 = str14;
                                            str2 = str17;
                                            str5 = str16;
                                            z6 = z8;
                                            str8 = str18;
                                            str9 = str20;
                                            j14 = j7;
                                            str6 = str19;
                                            i4 = i14;
                                            i5 = 1;
                                            arrayList23 = arrayList23;
                                        }
                                    }
                                    i27 = 90;
                                    if (!file2.getAbsolutePath().endsWith("mp4")) {
                                    }
                                    if (createVideoThumbnail != null) {
                                    }
                                } else {
                                    obj8 = null;
                                }
                                if (tL_document4.thumbs.isEmpty()) {
                                    str53 = str7;
                                } else {
                                    TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                    MediaController.SearchImage searchImage3 = sendingMediaInfo5.searchImage;
                                    tL_photoSize.w = searchImage3.width;
                                    tL_photoSize.h = searchImage3.height;
                                    tL_photoSize.size = 0;
                                    tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                    str53 = str7;
                                    tL_photoSize.type = str53;
                                    tL_document4.thumbs.add(tL_photoSize);
                                    tL_document4.flags |= 1;
                                }
                                tL_document3 = tL_document4;
                                file2 = file3;
                            } else {
                                str53 = str7;
                                str54 = str5;
                                obj8 = null;
                            }
                            final String file5 = file2 != null ? sendingMediaInfo5.searchImage.imageUrl : file2.toString();
                            str55 = sendingMediaInfo5.searchImage.imageUrl;
                            if (str55 != null) {
                                hashMap6.put("originalPath", str55);
                            }
                            final String str82222 = null;
                            String str83222 = str53;
                            ArrayList arrayList27222 = arrayList19;
                            final TLRPC.TL_document tL_document5222 = tL_document3;
                            str19 = str6;
                            z8 = z6;
                            final boolean z18222 = z17;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda107
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SendMessagesHelper.lambda$prepareSendingMedia$108(MessageObject.this, accountInstance, tL_document5222, file5, hashMap6, sendingMediaInfo5, str82222, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, z18222, j2, z4, j3, j4, messageSuggestionParams);
                                }
                            });
                            i14 = i4;
                            i33 = i9;
                            arrayList18 = arrayList26;
                            arrayList17 = arrayList24;
                            arrayList19 = arrayList27222;
                            arrayList20 = arrayList25;
                            i13 = i10;
                            str14 = str83222;
                            str18 = str8;
                            str20 = str9;
                            obj = null;
                            long j16222 = j5;
                            str17 = str2;
                            str16 = str54;
                            hashMap3 = hashMap;
                            j7 = j16222;
                            i34 = i13 + 1;
                            arrayList16 = arrayList;
                            hashMap = hashMap3;
                            str7 = str14;
                            str2 = str17;
                            str5 = str16;
                            z6 = z8;
                            str8 = str18;
                            str9 = str20;
                            j14 = j7;
                            str6 = str19;
                            i4 = i14;
                            i5 = 1;
                            arrayList23 = arrayList23;
                        } else {
                            ArrayList arrayList28 = arrayList19;
                            hashMap2 = hashMap;
                            str10 = str8;
                            str19 = str6;
                            str12 = str9;
                            String str84 = str7;
                            str13 = str5;
                            z8 = z6;
                            int i35 = i4;
                            TLRPC.Photo photo = searchImage.photo;
                            TLRPC.TL_photo tL_photo8 = photo instanceof TLRPC.TL_photo ? (TLRPC.TL_photo) photo : null;
                            if (tL_photo8 == null) {
                                File file6 = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo5.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo5.searchImage.imageUrl, "jpg"));
                                if (!file6.exists() || file6.length() == 0) {
                                    uri3 = null;
                                } else {
                                    uri3 = null;
                                    tL_photo8 = accountInstance.getSendMessagesHelper().generatePhotoSizes(file6.toString(), null);
                                    if (tL_photo8 != null) {
                                        z12 = false;
                                        if (tL_photo8 == null) {
                                            File file7 = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo5.searchImage.thumbUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo5.searchImage.thumbUrl, "jpg"));
                                            if (file7.exists()) {
                                                tL_photo8 = accountInstance.getSendMessagesHelper().generatePhotoSizes(file7.toString(), uri3);
                                            }
                                            if (tL_photo8 == null) {
                                                tL_photo8 = new TLRPC.TL_photo();
                                                tL_photo8.date = accountInstance.getConnectionsManager().getCurrentTime();
                                                tL_photo8.file_reference = new byte[0];
                                                TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                MediaController.SearchImage searchImage4 = sendingMediaInfo5.searchImage;
                                                tL_photoSize2.w = searchImage4.width;
                                                tL_photoSize2.h = searchImage4.height;
                                                tL_photoSize2.size = 0;
                                                tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                                str51 = str84;
                                                tL_photoSize2.type = str51;
                                                tL_photo8.sizes.add(tL_photoSize2);
                                                tL_photo4 = tL_photo8;
                                                z11 = z12;
                                            }
                                        }
                                        str51 = str84;
                                        tL_photo4 = tL_photo8;
                                        z11 = z12;
                                    }
                                }
                                z12 = true;
                                if (tL_photo8 == null) {
                                }
                                str51 = str84;
                                tL_photo4 = tL_photo8;
                                z11 = z12;
                            } else {
                                str51 = str84;
                                tL_photo4 = tL_photo8;
                                z11 = true;
                            }
                            final HashMap hashMap7 = new HashMap();
                            String str85 = sendingMediaInfo5.searchImage.imageUrl;
                            if (str85 != null) {
                                hashMap7.put("originalPath", str85);
                            }
                            if (z2) {
                                int i36 = i9 + 1;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("");
                                str52 = str51;
                                j13 = j5;
                                sb2.append(j13);
                                hashMap7.put("groupId", sb2.toString());
                                if (i36 != 10) {
                                    i26 = i10;
                                    if (i26 != i35 - 1) {
                                        i9 = i36;
                                    }
                                } else {
                                    i26 = i10;
                                }
                                hashMap7.put("final", "1");
                                i9 = i36;
                                j15 = 0;
                            } else {
                                str52 = str51;
                                j13 = j5;
                                i26 = i10;
                            }
                            final String str86 = null;
                            i12 = i26;
                            final boolean z19 = z11;
                            j6 = j13;
                            str14 = str52;
                            i11 = i35;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda108
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SendMessagesHelper.lambda$prepareSendingMedia$109(MessageObject.this, accountInstance, tL_photo4, z19, sendingMediaInfo5, hashMap7, str86, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, i3, str, j2, z4, j3, j4, messageSuggestionParams);
                                }
                            });
                            i33 = i9;
                            str17 = str2;
                            arrayList18 = arrayList26;
                            arrayList17 = arrayList24;
                            arrayList19 = arrayList28;
                            arrayList20 = arrayList25;
                            arrayList15 = arrayList23;
                            str16 = str13;
                            str18 = str10;
                            str20 = str12;
                            hashMap3 = hashMap2;
                            i13 = i12;
                            j7 = j6;
                            i14 = i11;
                            arrayList23 = arrayList15;
                        }
                    } else {
                        ArrayList arrayList29 = arrayList18;
                        arrayList4 = arrayList19;
                        i11 = i4;
                        hashMap2 = hashMap;
                        str10 = str8;
                        str11 = str6;
                        str12 = str9;
                        str13 = str5;
                        j6 = j5;
                        i12 = i10;
                        z8 = z6;
                        str14 = str7;
                        if (!sendingMediaInfo5.isVideo || sendingMediaInfo5.videoEditedInfo != null) {
                            str15 = str2;
                            hashMap3 = hashMap2;
                            if (z) {
                                videoEditedInfo = sendingMediaInfo5.videoEditedInfo;
                                if (videoEditedInfo == null) {
                                    videoEditedInfo = createCompressionSettings(sendingMediaInfo5.path);
                                }
                            } else {
                                videoEditedInfo = null;
                            }
                            if (z && (videoEditedInfo != null || sendingMediaInfo5.path.endsWith("mp4"))) {
                                if (sendingMediaInfo5.path == null && (searchImage2 = sendingMediaInfo5.searchImage) != null) {
                                    if (searchImage2.photo instanceof TLRPC.TL_photo) {
                                        sendingMediaInfo5.path = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(sendingMediaInfo5.searchImage.photo, true).getAbsolutePath();
                                    } else {
                                        sendingMediaInfo5.path = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo5.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo5.searchImage.imageUrl, "jpg")).getAbsolutePath();
                                    }
                                }
                                String str87 = sendingMediaInfo5.path;
                                File file8 = new File(str87);
                                String str88 = str87 + file8.length() + str15 + file8.lastModified();
                                if (videoEditedInfo != null) {
                                    boolean z20 = videoEditedInfo.muted;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str88);
                                    sb3.append(videoEditedInfo.estimatedDuration);
                                    sb3.append(str15);
                                    sb3.append(videoEditedInfo.startTime);
                                    sb3.append(str15);
                                    sb3.append(videoEditedInfo.endTime);
                                    sb3.append(videoEditedInfo.muted ? "_m" : "");
                                    String sb4 = sb3.toString();
                                    if (videoEditedInfo.resultWidth != videoEditedInfo.originalWidth) {
                                        sb4 = sb4 + str15 + videoEditedInfo.resultWidth;
                                    }
                                    long j17 = videoEditedInfo.startTime;
                                    if (j17 >= 0) {
                                        z9 = z20;
                                        str21 = sb4;
                                        j8 = j17;
                                    } else {
                                        str21 = sb4;
                                        z9 = z20;
                                        j8 = 0;
                                    }
                                } else {
                                    str21 = str88;
                                    j8 = 0;
                                    z9 = false;
                                }
                                if (z8) {
                                    j9 = j8;
                                    str22 = str21;
                                    str17 = str15;
                                    file = file8;
                                    str23 = "mp4";
                                    str24 = str87;
                                } else {
                                    long j18 = j8;
                                    if (sendingMediaInfo5.ttl == 0 && (videoEditedInfo == null || (videoEditedInfo.filterState == null && videoEditedInfo.paintPath == null && videoEditedInfo.mediaEntities == null && videoEditedInfo.cropState == null))) {
                                        Object[] sentFile3 = accountInstance.getMessagesStorage().getSentFile(str21, !z8 ? 2 : 5);
                                        if (sentFile3 != null) {
                                            String str89 = str21;
                                            Object obj12 = sentFile3[0];
                                            if (obj12 instanceof TLRPC.TL_document) {
                                                TLRPC.TL_document tL_document6 = (TLRPC.TL_document) obj12;
                                                String str90 = (String) sentFile3[1];
                                                j9 = j18;
                                                str22 = str89;
                                                str17 = str15;
                                                str24 = str87;
                                                obj2 = "1";
                                                file = file8;
                                                str23 = "mp4";
                                                ensureMediaThumbExists(accountInstance, z8, tL_document6, sendingMediaInfo5.path, null, j9);
                                                tL_document = tL_document6;
                                                str25 = str90;
                                                if (tL_document != null) {
                                                    String str91 = sendingMediaInfo5.thumbPath;
                                                    Bitmap decodeFile = str91 != null ? BitmapFactory.decodeFile(str91) : null;
                                                    if (decodeFile == null && (decodeFile = createVideoThumbnailAtTime(sendingMediaInfo5.path, j9)) == null) {
                                                        decodeFile = createVideoThumbnail(sendingMediaInfo5.path, 1);
                                                    }
                                                    if (decodeFile != null) {
                                                        int max = (z8 || sendingMediaInfo5.ttl != 0) ? 90 : Math.max(decodeFile.getWidth(), decodeFile.getHeight());
                                                        float f3 = max;
                                                        sendingMediaInfo2 = sendingMediaInfo5;
                                                        photoSize2 = ImageLoader.scaleAndSaveImage(null, decodeFile, (videoEditedInfo == null || !videoEditedInfo.isSticker) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, false, f3, f3, max > 90 ? 80 : 55, z8, 0, 0, false);
                                                        if (photoSize2 == null || photoSize2.location == null) {
                                                            i19 = 0;
                                                            str32 = null;
                                                        } else {
                                                            i19 = 0;
                                                            str32 = getKeyForPhotoSize(accountInstance, photoSize2, null, true, false);
                                                        }
                                                    } else {
                                                        sendingMediaInfo2 = sendingMediaInfo5;
                                                        i19 = 0;
                                                        photoSize2 = null;
                                                        str32 = null;
                                                    }
                                                    TLRPC.TL_document tL_document7 = new TLRPC.TL_document();
                                                    tL_document7.file_reference = new byte[i19];
                                                    if (photoSize2 != null) {
                                                        tL_document7.thumbs.add(photoSize2);
                                                        tL_document7.flags |= 1;
                                                    }
                                                    VideoEditedInfo videoEditedInfo2 = sendingMediaInfo2.videoEditedInfo;
                                                    if (videoEditedInfo2 != null && videoEditedInfo2.isSticker) {
                                                        tL_document7.mime_type = "video/webm";
                                                        str33 = str13;
                                                    } else {
                                                        str33 = str13;
                                                        tL_document7.mime_type = str33;
                                                    }
                                                    Bitmap bitmap2 = decodeFile;
                                                    accountInstance.getUserConfig().saveConfig(false);
                                                    VideoEditedInfo videoEditedInfo3 = sendingMediaInfo2.videoEditedInfo;
                                                    if (videoEditedInfo3 != null && videoEditedInfo3.isSticker) {
                                                        tL_document7.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                        TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                                        tL_documentAttributeSticker.alt = "👍";
                                                        tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                                        tL_document7.attributes.add(tL_documentAttributeSticker);
                                                        if (photoSize2 != null && (fileLocation = photoSize2.location) != null) {
                                                            obj3 = obj2;
                                                            str34 = str33;
                                                            str32 = String.format(Locale.US, "%d_%d@b1", Long.valueOf(fileLocation.volume_id), Integer.valueOf(photoSize2.location.local_id));
                                                            if (!z8) {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                                            } else {
                                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                tL_documentAttributeVideo.supports_streaming = true;
                                                            }
                                                            tL_document7.attributes.add(tL_documentAttributeVideo);
                                                            if (videoEditedInfo == null && (videoEditedInfo.needConvert() || !sendingMediaInfo2.isVideo)) {
                                                                if (sendingMediaInfo2.isVideo && videoEditedInfo.muted) {
                                                                    fillVideoAttribute(sendingMediaInfo2.path, tL_documentAttributeVideo, videoEditedInfo);
                                                                    videoEditedInfo.originalWidth = tL_documentAttributeVideo.w;
                                                                    videoEditedInfo.originalHeight = tL_documentAttributeVideo.h;
                                                                } else {
                                                                    tL_documentAttributeVideo.duration = (int) (videoEditedInfo.estimatedDuration / 1000);
                                                                }
                                                                int i37 = videoEditedInfo.rotationValue;
                                                                MediaController.CropState cropState = videoEditedInfo.cropState;
                                                                if (cropState != null) {
                                                                    i20 = cropState.transformWidth;
                                                                    i21 = cropState.transformHeight;
                                                                } else {
                                                                    i20 = videoEditedInfo.resultWidth;
                                                                    i21 = videoEditedInfo.resultHeight;
                                                                }
                                                                if (i37 == 90 || i37 == 270) {
                                                                    tL_documentAttributeVideo.w = i21;
                                                                    tL_documentAttributeVideo.h = i20;
                                                                } else {
                                                                    tL_documentAttributeVideo.w = i20;
                                                                    tL_documentAttributeVideo.h = i21;
                                                                }
                                                                tL_document7.size = videoEditedInfo.estimatedSize;
                                                            } else {
                                                                if (file.exists()) {
                                                                    tL_document7.size = (int) file.length();
                                                                }
                                                                fillVideoAttribute(sendingMediaInfo2.path, tL_documentAttributeVideo, null);
                                                            }
                                                            tL_document2 = tL_document7;
                                                            str26 = str32;
                                                            bitmap = bitmap2;
                                                            str16 = str34;
                                                        }
                                                    }
                                                    obj3 = obj2;
                                                    str34 = str33;
                                                    if (!z8) {
                                                    }
                                                    tL_document7.attributes.add(tL_documentAttributeVideo);
                                                    if (videoEditedInfo == null) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    fillVideoAttribute(sendingMediaInfo2.path, tL_documentAttributeVideo, null);
                                                    tL_document2 = tL_document7;
                                                    str26 = str32;
                                                    bitmap = bitmap2;
                                                    str16 = str34;
                                                } else {
                                                    obj3 = obj2;
                                                    sendingMediaInfo2 = sendingMediaInfo5;
                                                    long j19 = j9;
                                                    if (tL_document.thumbs.isEmpty()) {
                                                        str16 = str13;
                                                        tL_document2 = tL_document;
                                                        bitmap = null;
                                                        str26 = null;
                                                    } else {
                                                        String str92 = sendingMediaInfo2.thumbPath;
                                                        Bitmap decodeFile2 = str92 != null ? BitmapFactory.decodeFile(str92) : null;
                                                        if (decodeFile2 == null && (decodeFile2 = createVideoThumbnailAtTime(sendingMediaInfo2.path, j19)) == null) {
                                                            decodeFile2 = createVideoThumbnail(sendingMediaInfo2.path, 1);
                                                        }
                                                        if (decodeFile2 != null) {
                                                            int max2 = (z8 || sendingMediaInfo2.ttl != 0) ? 90 : Math.max(decodeFile2.getWidth(), decodeFile2.getHeight());
                                                            float f4 = max2;
                                                            str16 = str13;
                                                            photoSize = ImageLoader.scaleAndSaveImage(null, decodeFile2, (videoEditedInfo == null || !videoEditedInfo.isSticker) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP, false, f4, f4, max2 > 90 ? 80 : 55, z8, 0, 0, false);
                                                            if (photoSize == null || photoSize.location == null) {
                                                                i15 = 1;
                                                                str27 = null;
                                                            } else {
                                                                i15 = 1;
                                                                str27 = getKeyForPhotoSize(accountInstance, photoSize, null, true, false);
                                                            }
                                                        } else {
                                                            str16 = str13;
                                                            i15 = 1;
                                                            photoSize = null;
                                                            str27 = null;
                                                        }
                                                        if (photoSize != null) {
                                                            tL_document.thumbs.add(photoSize);
                                                            tL_document.flags |= i15;
                                                        }
                                                        bitmap = decodeFile2;
                                                        tL_document2 = tL_document;
                                                        str26 = str27;
                                                    }
                                                }
                                                fileToSize = ImageLoader.fileToSize(sendingMediaInfo2.coverPath, false);
                                                if (fileToSize == null && sendingMediaInfo2.coverPhoto != null) {
                                                    fileToSize = new ImageLoader.PhotoSizeFromPhoto(sendingMediaInfo2.coverPhoto);
                                                }
                                                final TLRPC.PhotoSize photoSize3 = fileToSize;
                                                if (videoEditedInfo != null && videoEditedInfo.muted) {
                                                    size = tL_document2.attributes.size();
                                                    i18 = 0;
                                                    while (true) {
                                                        if (i18 >= size) {
                                                            if (tL_document2.attributes.get(i18) instanceof TLRPC.TL_documentAttributeAnimated) {
                                                                break;
                                                            } else {
                                                                i18++;
                                                            }
                                                        } else {
                                                            tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (videoEditedInfo != null || (!videoEditedInfo.needConvert() && sendingMediaInfo2.isVideo)) {
                                                    str28 = str11;
                                                    str29 = str24;
                                                } else {
                                                    String str93 = videoEditedInfo.isSticker ? "webm" : str23;
                                                    StringBuilder sb5 = new StringBuilder();
                                                    str28 = str11;
                                                    sb5.append(str28);
                                                    sb5.append(SharedConfig.getLastLocalId());
                                                    sb5.append(".");
                                                    sb5.append(str93);
                                                    File file9 = new File(FileLoader.getDirectory(4), sb5.toString());
                                                    SharedConfig.saveConfig();
                                                    str29 = file9.getAbsolutePath();
                                                }
                                                final HashMap hashMap8 = new HashMap();
                                                str30 = str22;
                                                if (str30 != null) {
                                                    hashMap8.put("originalPath", str30);
                                                }
                                                if (str25 != null) {
                                                    hashMap8.put(str12, str25);
                                                }
                                                if (z9 && z2) {
                                                    int i38 = i9 + 1;
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append("");
                                                    str19 = str28;
                                                    j10 = j6;
                                                    sb6.append(j10);
                                                    hashMap8.put("groupId", sb6.toString());
                                                    if (i38 != 10) {
                                                        i16 = i11;
                                                        arrayList6 = arrayList4;
                                                        i13 = i12;
                                                        if (i13 != i16 - 1) {
                                                            i17 = i38;
                                                        }
                                                    } else {
                                                        arrayList6 = arrayList4;
                                                        i13 = i12;
                                                        i16 = i11;
                                                    }
                                                    hashMap8.put("final", obj3);
                                                    i17 = i38;
                                                    j15 = 0;
                                                } else {
                                                    arrayList6 = arrayList4;
                                                    str19 = str28;
                                                    i13 = i12;
                                                    j10 = j6;
                                                    i16 = i11;
                                                    i17 = i9;
                                                }
                                                if (!z8 || ((videoEditedInfo != null && videoEditedInfo.isSticker) || (arrayList7 = sendingMediaInfo2.masks) == null || arrayList7.isEmpty())) {
                                                    str31 = str10;
                                                } else {
                                                    tL_document2.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                                                    SerializedData serializedData = new SerializedData((sendingMediaInfo2.masks.size() * 20) + 4);
                                                    serializedData.writeInt32(sendingMediaInfo2.masks.size());
                                                    for (int i39 = 0; i39 < sendingMediaInfo2.masks.size(); i39++) {
                                                        sendingMediaInfo2.masks.get(i39).serializeToStream(serializedData);
                                                    }
                                                    str31 = str10;
                                                    hashMap8.put(str31, Utilities.bytesToHex(serializedData.toByteArray()));
                                                    serializedData.cleanup();
                                                }
                                                final SendingMediaInfo sendingMediaInfo6 = sendingMediaInfo2;
                                                final VideoEditedInfo videoEditedInfo4 = videoEditedInfo;
                                                final String str94 = str25;
                                                final TLRPC.TL_document tL_document8 = tL_document2;
                                                str18 = str31;
                                                str20 = str12;
                                                j7 = j10;
                                                obj = null;
                                                i14 = i16;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda110
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.lambda$prepareSendingMedia$110(bitmap, str26, messageObject, accountInstance, videoEditedInfo4, tL_document8, str29, hashMap8, sendingMediaInfo6, str94, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, j2, z4, photoSize3, j3, j4, messageSuggestionParams);
                                                    }
                                                });
                                                i33 = i17;
                                                arrayList18 = arrayList29;
                                                arrayList17 = arrayList24;
                                                arrayList19 = arrayList6;
                                                arrayList20 = arrayList25;
                                            } else {
                                                str17 = str15;
                                                file = file8;
                                                str23 = "mp4";
                                                str24 = str87;
                                                j9 = j18;
                                                str22 = str89;
                                            }
                                        }
                                    }
                                    str22 = str21;
                                    str17 = str15;
                                    file = file8;
                                    str23 = "mp4";
                                    str24 = str87;
                                    j9 = j18;
                                }
                                obj2 = "1";
                                tL_document = null;
                                str25 = null;
                                if (tL_document != null) {
                                }
                                fileToSize = ImageLoader.fileToSize(sendingMediaInfo2.coverPath, false);
                                if (fileToSize == null) {
                                    fileToSize = new ImageLoader.PhotoSizeFromPhoto(sendingMediaInfo2.coverPhoto);
                                }
                                final TLRPC.PhotoSize photoSize32 = fileToSize;
                                if (videoEditedInfo != null) {
                                    size = tL_document2.attributes.size();
                                    i18 = 0;
                                    while (true) {
                                        if (i18 >= size) {
                                        }
                                        i18++;
                                    }
                                }
                                if (videoEditedInfo != null) {
                                }
                                str28 = str11;
                                str29 = str24;
                                final HashMap hashMap82 = new HashMap();
                                str30 = str22;
                                if (str30 != null) {
                                }
                                if (str25 != null) {
                                }
                                if (z9) {
                                }
                                arrayList6 = arrayList4;
                                str19 = str28;
                                i13 = i12;
                                j10 = j6;
                                i16 = i11;
                                i17 = i9;
                                if (z8) {
                                }
                                str31 = str10;
                                final SendingMediaInfo sendingMediaInfo62 = sendingMediaInfo2;
                                final VideoEditedInfo videoEditedInfo42 = videoEditedInfo;
                                final String str942 = str25;
                                final TLRPC.TL_document tL_document82 = tL_document2;
                                str18 = str31;
                                str20 = str12;
                                j7 = j10;
                                obj = null;
                                i14 = i16;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda110
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.lambda$prepareSendingMedia$110(bitmap, str26, messageObject, accountInstance, videoEditedInfo42, tL_document82, str29, hashMap82, sendingMediaInfo62, str942, j, messageObject2, messageObject3, z3, i, i2, storyItem, replyQuote, str, i3, j2, z4, photoSize32, j3, j4, messageSuggestionParams);
                                    }
                                });
                                i33 = i17;
                                arrayList18 = arrayList29;
                                arrayList17 = arrayList24;
                                arrayList19 = arrayList6;
                                arrayList20 = arrayList25;
                            } else {
                                i13 = i12;
                                str16 = str13;
                                str17 = str15;
                                str18 = str10;
                                str19 = str11;
                                str20 = str12;
                                j7 = j6;
                                i14 = i11;
                                obj = null;
                                if (arrayList4 != null) {
                                    arrayList19 = new ArrayList();
                                    arrayList18 = new ArrayList();
                                    arrayList20 = new ArrayList();
                                    ArrayList arrayList30 = new ArrayList();
                                    arrayList17 = new ArrayList();
                                    sendingMediaInfo = sendingMediaInfo5;
                                    arrayList5 = arrayList30;
                                } else {
                                    sendingMediaInfo = sendingMediaInfo5;
                                    arrayList5 = arrayList22;
                                    arrayList18 = arrayList29;
                                    arrayList17 = arrayList24;
                                    arrayList19 = arrayList4;
                                    arrayList20 = arrayList25;
                                }
                                arrayList19.add(sendingMediaInfo.path);
                                arrayList18.add(sendingMediaInfo.path);
                                arrayList17.add(sendingMediaInfo.uri);
                                arrayList20.add(sendingMediaInfo.caption);
                                arrayList5.add(sendingMediaInfo.entities);
                                arrayList22 = arrayList5;
                                i33 = i9;
                            }
                            i34 = i13 + 1;
                            arrayList16 = arrayList;
                            hashMap = hashMap3;
                            str7 = str14;
                            str2 = str17;
                            str5 = str16;
                            z6 = z8;
                            str8 = str18;
                            str9 = str20;
                            j14 = j7;
                            str6 = str19;
                            i4 = i14;
                            i5 = 1;
                            arrayList23 = arrayList23;
                        } else {
                            String str95 = sendingMediaInfo5.path;
                            if (str95 != null || (uri2 = sendingMediaInfo5.uri) == null) {
                                str35 = str95;
                                str36 = str35;
                            } else {
                                String path = (Build.VERSION.SDK_INT < 30 || !"content".equals(uri2.getScheme())) ? AndroidUtilities.getPath(sendingMediaInfo5.uri) : null;
                                str35 = sendingMediaInfo5.uri.toString();
                                str36 = path;
                            }
                            if (inputContentInfoCompat == null || sendingMediaInfo5.uri == null || !inputContentInfoCompat.getDescription().hasMimeType("image/png")) {
                                str37 = str4;
                                str38 = str11;
                            } else {
                                try {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(sendingMediaInfo5.uri);
                                    try {
                                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                                        StringBuilder sb7 = new StringBuilder();
                                        str38 = str11;
                                        try {
                                            sb7.append(str38);
                                            sb7.append(SharedConfig.getLastLocalId());
                                            str37 = str4;
                                            try {
                                                sb7.append(str37);
                                                File file10 = new File(FileLoader.getDirectory(4), sb7.toString());
                                                fileOutputStream = new FileOutputStream(file10);
                                                try {
                                                    decodeStream.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
                                                    SharedConfig.saveConfig();
                                                    sendingMediaInfo5.uri = Uri.fromFile(file10);
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        FileLog.e(th);
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream = null;
                                                FileLog.e(th);
                                                if (inputStream != null) {
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str37 = str4;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str37 = str4;
                                        str38 = str11;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    str37 = str4;
                                    str38 = str11;
                                    inputStream = null;
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (z || ImageLoader.shouldSendImageAsDocument(sendingMediaInfo5.path, sendingMediaInfo5.uri)) {
                                str39 = str3;
                                str40 = str36 != null ? FileLoader.getFileExtension(new File(str36)) : "";
                            } else {
                                if (sendingMediaInfo5.forceImage || str36 == null) {
                                    str39 = str3;
                                } else {
                                    str39 = str3;
                                    if ((str36.endsWith(str39) || str36.endsWith(str37)) && sendingMediaInfo5.ttl <= 0) {
                                        str40 = str36.endsWith(str39) ? "gif" : "webp";
                                    }
                                }
                                if (!sendingMediaInfo5.forceImage && str36 == null && (uri = sendingMediaInfo5.uri) != null) {
                                    if (MediaController.isGif(uri)) {
                                        str35 = sendingMediaInfo5.uri.toString();
                                        str41 = MediaController.copyFileToCache(sendingMediaInfo5.uri, "gif");
                                        r38 = "gif";
                                    } else if (MediaController.isWebp(sendingMediaInfo5.uri)) {
                                        str35 = sendingMediaInfo5.uri.toString();
                                        str41 = MediaController.copyFileToCache(sendingMediaInfo5.uri, "webp");
                                        r38 = "webp";
                                    }
                                    z10 = true;
                                    arrayList8 = r38;
                                    if (z10) {
                                        if (arrayList4 == null) {
                                            arrayList19 = new ArrayList();
                                            arrayList18 = new ArrayList();
                                            arrayList14 = new ArrayList();
                                            ArrayList arrayList31 = new ArrayList();
                                            arrayList13 = new ArrayList();
                                            arrayList12 = arrayList31;
                                        } else {
                                            arrayList19 = arrayList4;
                                            arrayList12 = arrayList22;
                                            arrayList18 = arrayList29;
                                            arrayList13 = arrayList24;
                                            arrayList14 = arrayList25;
                                        }
                                        arrayList19.add(str41);
                                        arrayList18.add(str35);
                                        arrayList13.add(sendingMediaInfo5.uri);
                                        arrayList14.add(sendingMediaInfo5.caption);
                                        arrayList12.add(sendingMediaInfo5.entities);
                                        arrayList20 = arrayList14;
                                        arrayList17 = arrayList13;
                                        arrayList22 = arrayList12;
                                        str4 = str37;
                                        str19 = str38;
                                        str3 = str39;
                                        i33 = i9;
                                        str17 = str2;
                                        arrayList15 = arrayList8;
                                        str16 = str13;
                                        str18 = str10;
                                        str20 = str12;
                                        hashMap3 = hashMap2;
                                        i13 = i12;
                                        j7 = j6;
                                        i14 = i11;
                                        arrayList23 = arrayList15;
                                    } else {
                                        if (str41 != null) {
                                            File file11 = new File(str41);
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append(str35);
                                            obj4 = "1";
                                            sb8.append(file11.length());
                                            str42 = str2;
                                            sb8.append(str42);
                                            sb8.append(file11.lastModified());
                                            str43 = sb8.toString();
                                            hashMap4 = hashMap2;
                                        } else {
                                            obj4 = "1";
                                            str42 = str2;
                                            hashMap4 = hashMap2;
                                            str43 = null;
                                        }
                                        if (hashMap4 != null) {
                                            MediaSendPrepareWorker mediaSendPrepareWorker3 = (MediaSendPrepareWorker) hashMap4.get(sendingMediaInfo5);
                                            TLRPC.TL_photo tL_photo9 = mediaSendPrepareWorker3.photo;
                                            HashMap hashMap9 = hashMap4;
                                            String str96 = mediaSendPrepareWorker3.parentObject;
                                            if (tL_photo9 == null) {
                                                try {
                                                    mediaSendPrepareWorker3.sync.await();
                                                } catch (Exception e4) {
                                                    FileLog.e(e4);
                                                }
                                                tL_photo9 = mediaSendPrepareWorker3.photo;
                                                str44 = str43;
                                                obj5 = obj4;
                                                str45 = str42;
                                                str4 = str37;
                                                str19 = str38;
                                                hashMap3 = hashMap9;
                                                str47 = mediaSendPrepareWorker3.parentObject;
                                            } else {
                                                str44 = str43;
                                                obj5 = obj4;
                                                str45 = str42;
                                                str4 = str37;
                                                str19 = str38;
                                                hashMap3 = hashMap9;
                                                str47 = str96;
                                            }
                                            obj6 = "groupId";
                                            obj7 = "originalPath";
                                            tL_photo = tL_photo9;
                                        } else {
                                            HashMap hashMap10 = hashMap4;
                                            if (z8 || sendingMediaInfo5.ttl != 0) {
                                                str44 = str43;
                                                obj5 = obj4;
                                                str45 = str42;
                                                str4 = str37;
                                                str19 = str38;
                                                hashMap3 = hashMap10;
                                                obj6 = "groupId";
                                                obj7 = "originalPath";
                                                tL_photo = null;
                                                str46 = null;
                                            } else {
                                                int i40 = sendingMediaInfo5.highQuality ? !z8 ? 6 : 7 : !z8 ? 0 : 3;
                                                Object[] sentFile4 = accountInstance.getMessagesStorage().getSentFile(str43, i40);
                                                String str97 = str43;
                                                if (sentFile4 != null) {
                                                    Object obj13 = sentFile4[0];
                                                    if (obj13 instanceof TLRPC.TL_photo) {
                                                        tL_photo2 = (TLRPC.TL_photo) obj13;
                                                        str48 = (String) sentFile4[1];
                                                        if (tL_photo2 == null) {
                                                            str46 = str48;
                                                        } else if (sendingMediaInfo5.uri != null) {
                                                            str46 = str48;
                                                            Object[] sentFile5 = accountInstance.getMessagesStorage().getSentFile(AndroidUtilities.getPath(sendingMediaInfo5.uri), i40);
                                                            if (sentFile5 != null) {
                                                                Object obj14 = sentFile5[0];
                                                                if (obj14 instanceof TLRPC.TL_photo) {
                                                                    str46 = (String) sentFile5[1];
                                                                    tL_photo3 = (TLRPC.TL_photo) obj14;
                                                                    hashMap3 = hashMap10;
                                                                    str44 = str97;
                                                                    obj5 = obj4;
                                                                    str4 = str37;
                                                                    obj6 = "groupId";
                                                                    str45 = str42;
                                                                    str19 = str38;
                                                                    obj7 = "originalPath";
                                                                    ensureMediaThumbExists(accountInstance, z8, tL_photo3, sendingMediaInfo5.path, sendingMediaInfo5.uri, 0L);
                                                                    tL_photo = tL_photo3;
                                                                }
                                                            }
                                                        } else {
                                                            str46 = str48;
                                                        }
                                                        tL_photo3 = tL_photo2;
                                                        hashMap3 = hashMap10;
                                                        str44 = str97;
                                                        obj5 = obj4;
                                                        str4 = str37;
                                                        obj6 = "groupId";
                                                        str45 = str42;
                                                        str19 = str38;
                                                        obj7 = "originalPath";
                                                        ensureMediaThumbExists(accountInstance, z8, tL_photo3, sendingMediaInfo5.path, sendingMediaInfo5.uri, 0L);
                                                        tL_photo = tL_photo3;
                                                    }
                                                }
                                                str48 = null;
                                                tL_photo2 = null;
                                                if (tL_photo2 == null) {
                                                }
                                                tL_photo3 = tL_photo2;
                                                hashMap3 = hashMap10;
                                                str44 = str97;
                                                obj5 = obj4;
                                                str4 = str37;
                                                obj6 = "groupId";
                                                str45 = str42;
                                                str19 = str38;
                                                obj7 = "originalPath";
                                                ensureMediaThumbExists(accountInstance, z8, tL_photo3, sendingMediaInfo5.path, sendingMediaInfo5.uri, 0L);
                                                tL_photo = tL_photo3;
                                            }
                                            if (tL_photo == null) {
                                                TLRPC.TL_photo generatePhotoSizes = accountInstance.getSendMessagesHelper().generatePhotoSizes(sendingMediaInfo5.path, sendingMediaInfo5.uri);
                                                if (z8 && sendingMediaInfo5.canDeleteAfter) {
                                                    new File(sendingMediaInfo5.path).delete();
                                                }
                                                tL_photo = generatePhotoSizes;
                                            }
                                            str47 = str46;
                                        }
                                        if (tL_photo != null) {
                                            final HashMap hashMap11 = new HashMap();
                                            final Bitmap[] bitmapArr = new Bitmap[1];
                                            final String[] strArr = new String[1];
                                            ArrayList<TLRPC.InputDocument> arrayList32 = sendingMediaInfo5.masks;
                                            boolean z21 = (arrayList32 == null || arrayList32.isEmpty()) ? false : true;
                                            tL_photo.has_stickers = z21;
                                            if (z21) {
                                                SerializedData serializedData2 = new SerializedData((sendingMediaInfo5.masks.size() * 20) + 4);
                                                serializedData2.writeInt32(sendingMediaInfo5.masks.size());
                                                for (int i41 = 0; i41 < sendingMediaInfo5.masks.size(); i41++) {
                                                    sendingMediaInfo5.masks.get(i41).serializeToStream(serializedData2);
                                                }
                                                str50 = str10;
                                                hashMap11.put(str50, Utilities.bytesToHex(serializedData2.toByteArray()));
                                                serializedData2.cleanup();
                                            } else {
                                                str50 = str10;
                                            }
                                            String str98 = str44;
                                            if (str98 != null) {
                                                hashMap11.put(obj7, str98);
                                            }
                                            if (str47 != null) {
                                                hashMap11.put(str12, str47);
                                            }
                                            if (z2) {
                                                try {
                                                    if (arrayList.size() == 1) {
                                                    }
                                                    accountInstance2 = accountInstance;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    accountInstance2 = accountInstance;
                                                    FileLog.e(e);
                                                    if (z2) {
                                                    }
                                                    final boolean z22 = sendingMediaInfo5.highQuality;
                                                    String str99 = str50;
                                                    final String str100 = str47;
                                                    str49 = str12;
                                                    j11 = j12;
                                                    i22 = i24;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda109
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            SendMessagesHelper.lambda$prepareSendingMedia$111(bitmapArr, strArr, messageObject, accountInstance, tL_photo, hashMap11, sendingMediaInfo5, str100, j, messageObject2, messageObject3, z3, i, i2, z5, storyItem, replyQuote, str, i3, j2, z4, j3, j4, messageSuggestionParams, z22);
                                                        }
                                                    });
                                                    i33 = i25;
                                                    arrayList19 = arrayList11;
                                                    arrayList18 = arrayList29;
                                                    arrayList17 = arrayList24;
                                                    arrayList20 = arrayList25;
                                                    i13 = i23;
                                                    str16 = str13;
                                                    str17 = str45;
                                                    str18 = str99;
                                                    str20 = str49;
                                                    j7 = j11;
                                                    i14 = i22;
                                                    arrayList23 = arrayList8;
                                                    obj = null;
                                                    i34 = i13 + 1;
                                                    arrayList16 = arrayList;
                                                    hashMap = hashMap3;
                                                    str7 = str14;
                                                    str2 = str17;
                                                    str5 = str16;
                                                    z6 = z8;
                                                    str8 = str18;
                                                    str9 = str20;
                                                    j14 = j7;
                                                    str6 = str19;
                                                    i4 = i14;
                                                    i5 = 1;
                                                    arrayList23 = arrayList23;
                                                }
                                                if (z2) {
                                                    i25 = i9 + 1;
                                                    StringBuilder sb9 = new StringBuilder();
                                                    sb9.append("");
                                                    arrayList11 = arrayList4;
                                                    str3 = str39;
                                                    j12 = j6;
                                                    sb9.append(j12);
                                                    hashMap11.put(obj6, sb9.toString());
                                                    if (i25 != 10) {
                                                        i24 = i11;
                                                        i23 = i12;
                                                    } else {
                                                        i23 = i12;
                                                        i24 = i11;
                                                    }
                                                    hashMap11.put("final", obj5);
                                                    j15 = 0;
                                                } else {
                                                    arrayList11 = arrayList4;
                                                    str3 = str39;
                                                    i23 = i12;
                                                    j12 = j6;
                                                    i24 = i11;
                                                    i25 = i9;
                                                }
                                                final boolean z222 = sendingMediaInfo5.highQuality;
                                                String str992 = str50;
                                                final String str1002 = str47;
                                                str49 = str12;
                                                j11 = j12;
                                                i22 = i24;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda109
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.lambda$prepareSendingMedia$111(bitmapArr, strArr, messageObject, accountInstance, tL_photo, hashMap11, sendingMediaInfo5, str1002, j, messageObject2, messageObject3, z3, i, i2, z5, storyItem, replyQuote, str, i3, j2, z4, j3, j4, messageSuggestionParams, z222);
                                                    }
                                                });
                                                i33 = i25;
                                                arrayList19 = arrayList11;
                                                arrayList18 = arrayList29;
                                                arrayList17 = arrayList24;
                                                arrayList20 = arrayList25;
                                                i13 = i23;
                                                str16 = str13;
                                                str17 = str45;
                                                str18 = str992;
                                            }
                                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, AndroidUtilities.getPhotoSize(sendingMediaInfo5.highQuality));
                                            if (closestPhotoSizeWithSize != null) {
                                                accountInstance2 = accountInstance;
                                                try {
                                                    strArr[0] = getKeyForPhotoSize(accountInstance2, closestPhotoSizeWithSize, bitmapArr, false, false);
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    FileLog.e(e);
                                                    if (z2) {
                                                    }
                                                    final boolean z2222 = sendingMediaInfo5.highQuality;
                                                    String str9922 = str50;
                                                    final String str10022 = str47;
                                                    str49 = str12;
                                                    j11 = j12;
                                                    i22 = i24;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda109
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            SendMessagesHelper.lambda$prepareSendingMedia$111(bitmapArr, strArr, messageObject, accountInstance, tL_photo, hashMap11, sendingMediaInfo5, str10022, j, messageObject2, messageObject3, z3, i, i2, z5, storyItem, replyQuote, str, i3, j2, z4, j3, j4, messageSuggestionParams, z2222);
                                                        }
                                                    });
                                                    i33 = i25;
                                                    arrayList19 = arrayList11;
                                                    arrayList18 = arrayList29;
                                                    arrayList17 = arrayList24;
                                                    arrayList20 = arrayList25;
                                                    i13 = i23;
                                                    str16 = str13;
                                                    str17 = str45;
                                                    str18 = str9922;
                                                    str20 = str49;
                                                    j7 = j11;
                                                    i14 = i22;
                                                    arrayList23 = arrayList8;
                                                    obj = null;
                                                    i34 = i13 + 1;
                                                    arrayList16 = arrayList;
                                                    hashMap = hashMap3;
                                                    str7 = str14;
                                                    str2 = str17;
                                                    str5 = str16;
                                                    z6 = z8;
                                                    str8 = str18;
                                                    str9 = str20;
                                                    j14 = j7;
                                                    str6 = str19;
                                                    i4 = i14;
                                                    i5 = 1;
                                                    arrayList23 = arrayList23;
                                                }
                                                if (z2) {
                                                }
                                                final boolean z22222 = sendingMediaInfo5.highQuality;
                                                String str99222 = str50;
                                                final String str100222 = str47;
                                                str49 = str12;
                                                j11 = j12;
                                                i22 = i24;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda109
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        SendMessagesHelper.lambda$prepareSendingMedia$111(bitmapArr, strArr, messageObject, accountInstance, tL_photo, hashMap11, sendingMediaInfo5, str100222, j, messageObject2, messageObject3, z3, i, i2, z5, storyItem, replyQuote, str, i3, j2, z4, j3, j4, messageSuggestionParams, z22222);
                                                    }
                                                });
                                                i33 = i25;
                                                arrayList19 = arrayList11;
                                                arrayList18 = arrayList29;
                                                arrayList17 = arrayList24;
                                                arrayList20 = arrayList25;
                                                i13 = i23;
                                                str16 = str13;
                                                str17 = str45;
                                                str18 = str99222;
                                            }
                                            accountInstance2 = accountInstance;
                                            if (z2) {
                                            }
                                            final boolean z222222 = sendingMediaInfo5.highQuality;
                                            String str992222 = str50;
                                            final String str1002222 = str47;
                                            str49 = str12;
                                            j11 = j12;
                                            i22 = i24;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda109
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    SendMessagesHelper.lambda$prepareSendingMedia$111(bitmapArr, strArr, messageObject, accountInstance, tL_photo, hashMap11, sendingMediaInfo5, str1002222, j, messageObject2, messageObject3, z3, i, i2, z5, storyItem, replyQuote, str, i3, j2, z4, j3, j4, messageSuggestionParams, z222222);
                                                }
                                            });
                                            i33 = i25;
                                            arrayList19 = arrayList11;
                                            arrayList18 = arrayList29;
                                            arrayList17 = arrayList24;
                                            arrayList20 = arrayList25;
                                            i13 = i23;
                                            str16 = str13;
                                            str17 = str45;
                                            str18 = str992222;
                                        } else {
                                            str3 = str39;
                                            String str101 = str19;
                                            str49 = str12;
                                            j11 = j6;
                                            i22 = i11;
                                            String str102 = str44;
                                            if (arrayList4 == null) {
                                                arrayList19 = new ArrayList();
                                                arrayList18 = new ArrayList();
                                                arrayList10 = new ArrayList();
                                                ArrayList arrayList33 = new ArrayList();
                                                arrayList17 = new ArrayList();
                                                arrayList9 = arrayList33;
                                            } else {
                                                arrayList19 = arrayList4;
                                                arrayList9 = arrayList22;
                                                arrayList18 = arrayList29;
                                                arrayList17 = arrayList24;
                                                arrayList10 = arrayList25;
                                            }
                                            arrayList19.add(str41);
                                            arrayList18.add(str102);
                                            arrayList17.add(sendingMediaInfo5.uri);
                                            arrayList10.add(sendingMediaInfo5.caption);
                                            arrayList9.add(sendingMediaInfo5.entities);
                                            arrayList20 = arrayList10;
                                            arrayList22 = arrayList9;
                                            i33 = i9;
                                            i13 = i12;
                                            str16 = str13;
                                            str17 = str45;
                                            str18 = str10;
                                            str19 = str101;
                                        }
                                        str20 = str49;
                                        j7 = j11;
                                        i14 = i22;
                                        arrayList23 = arrayList8;
                                    }
                                }
                                str41 = str36;
                                z10 = false;
                                arrayList8 = arrayList23;
                                if (z10) {
                                }
                            }
                            str41 = str36;
                            r38 = str40;
                            z10 = true;
                            arrayList8 = r38;
                            if (z10) {
                            }
                        }
                    }
                    obj = null;
                    i34 = i13 + 1;
                    arrayList16 = arrayList;
                    hashMap = hashMap3;
                    str7 = str14;
                    str2 = str17;
                    str5 = str16;
                    z6 = z8;
                    str8 = str18;
                    str9 = str20;
                    j14 = j7;
                    str6 = str19;
                    i4 = i14;
                    i5 = 1;
                    arrayList23 = arrayList23;
                }
            }
            i9 = i33;
            j5 = j14;
            searchImage = sendingMediaInfo5.searchImage;
            ArrayList arrayList242 = arrayList17;
            ArrayList arrayList252 = arrayList20;
            i10 = i34;
            if (searchImage == null) {
            }
            ArrayList arrayList292 = arrayList18;
            arrayList4 = arrayList19;
            i11 = i4;
            hashMap2 = hashMap;
            str10 = str8;
            str11 = str6;
            str12 = str9;
            str13 = str5;
            j6 = j5;
            i12 = i10;
            z8 = z6;
            str14 = str7;
            if (!sendingMediaInfo5.isVideo) {
            }
            str15 = str2;
            hashMap3 = hashMap2;
            if (z) {
            }
            if (z) {
            }
            i13 = i12;
            str16 = str13;
            str17 = str15;
            str18 = str10;
            str19 = str11;
            str20 = str12;
            j7 = j6;
            i14 = i11;
            obj = null;
            if (arrayList4 != null) {
            }
            arrayList19.add(sendingMediaInfo.path);
            arrayList18.add(sendingMediaInfo.path);
            arrayList17.add(sendingMediaInfo.uri);
            arrayList20.add(sendingMediaInfo.caption);
            arrayList5.add(sendingMediaInfo.entities);
            arrayList22 = arrayList5;
            i33 = i9;
            i34 = i13 + 1;
            arrayList16 = arrayList;
            hashMap = hashMap3;
            str7 = str14;
            str2 = str17;
            str5 = str16;
            z6 = z8;
            str8 = str18;
            str9 = str20;
            j14 = j7;
            str6 = str19;
            i4 = i14;
            i5 = 1;
            arrayList23 = arrayList23;
        }
        ArrayList arrayList34 = arrayList17;
        ArrayList arrayList35 = arrayList18;
        ArrayList arrayList36 = arrayList19;
        ArrayList arrayList37 = arrayList20;
        boolean z23 = z6;
        int i42 = i4;
        long j20 = j15;
        if (j20 != 0) {
            finishGroup(accountInstance, j20, i);
        }
        if (inputContentInfoCompat != null) {
            inputContentInfoCompat.releasePermission();
        }
        if (arrayList36 != null && !arrayList36.isEmpty()) {
            int i43 = 1;
            long[] jArr = new long[1];
            int size3 = arrayList36.size();
            int i44 = 0;
            while (i44 < size3) {
                if (!z || z23) {
                    i6 = i42;
                } else {
                    i6 = i42;
                    if (i6 > i43) {
                        i7 = 10;
                        if (i33 % 10 == 0) {
                            jArr[0] = Utilities.random.nextLong();
                            i33 = 0;
                            i8 = i33 + 1;
                            ArrayList arrayList38 = arrayList36;
                            String str103 = (String) arrayList38.get(i44);
                            ArrayList arrayList39 = arrayList35;
                            String str104 = (String) arrayList39.get(i44);
                            ArrayList arrayList40 = arrayList34;
                            Uri uri6 = (Uri) arrayList40.get(i44);
                            ArrayList arrayList41 = arrayList22;
                            ArrayList arrayList42 = (ArrayList) arrayList41.get(i44);
                            if (i8 != i7 || i44 == size3 - 1) {
                                arrayList3 = arrayList37;
                                z7 = true;
                            } else {
                                arrayList3 = arrayList37;
                                z7 = false;
                            }
                            arrayList22 = arrayList41;
                            handleError(prepareSendingDocumentInternal(accountInstance, str103, str104, uri6, arrayList23, j, messageObject2, messageObject3, storyItem, replyQuote, arrayList42, messageObject, jArr, z7, (CharSequence) arrayList3.get(i44), z3, i, 0, null, z, str, i3, j2, z4, j3, j4, messageSuggestionParams), accountInstance);
                            i44++;
                            arrayList36 = arrayList38;
                            arrayList37 = arrayList3;
                            arrayList34 = arrayList40;
                            arrayList35 = arrayList39;
                            i33 = i8;
                            i42 = i6;
                            size3 = size3;
                            i43 = 1;
                        } else {
                            i8 = i33 + 1;
                            ArrayList arrayList382 = arrayList36;
                            String str1032 = (String) arrayList382.get(i44);
                            ArrayList arrayList392 = arrayList35;
                            String str1042 = (String) arrayList392.get(i44);
                            ArrayList arrayList402 = arrayList34;
                            Uri uri62 = (Uri) arrayList402.get(i44);
                            ArrayList arrayList412 = arrayList22;
                            ArrayList arrayList422 = (ArrayList) arrayList412.get(i44);
                            if (i8 != i7) {
                            }
                            arrayList3 = arrayList37;
                            z7 = true;
                            arrayList22 = arrayList412;
                            handleError(prepareSendingDocumentInternal(accountInstance, str1032, str1042, uri62, arrayList23, j, messageObject2, messageObject3, storyItem, replyQuote, arrayList422, messageObject, jArr, z7, (CharSequence) arrayList3.get(i44), z3, i, 0, null, z, str, i3, j2, z4, j3, j4, messageSuggestionParams), accountInstance);
                            i44++;
                            arrayList36 = arrayList382;
                            arrayList37 = arrayList3;
                            arrayList34 = arrayList402;
                            arrayList35 = arrayList392;
                            i33 = i8;
                            i42 = i6;
                            size3 = size3;
                            i43 = 1;
                        }
                    }
                }
                i7 = 10;
                i8 = i33 + 1;
                ArrayList arrayList3822 = arrayList36;
                String str10322 = (String) arrayList3822.get(i44);
                ArrayList arrayList3922 = arrayList35;
                String str10422 = (String) arrayList3922.get(i44);
                ArrayList arrayList4022 = arrayList34;
                Uri uri622 = (Uri) arrayList4022.get(i44);
                ArrayList arrayList4122 = arrayList22;
                ArrayList arrayList4222 = (ArrayList) arrayList4122.get(i44);
                if (i8 != i7) {
                }
                arrayList3 = arrayList37;
                z7 = true;
                arrayList22 = arrayList4122;
                handleError(prepareSendingDocumentInternal(accountInstance, str10322, str10422, uri622, arrayList23, j, messageObject2, messageObject3, storyItem, replyQuote, arrayList4222, messageObject, jArr, z7, (CharSequence) arrayList3.get(i44), z3, i, 0, null, z, str, i3, j2, z4, j3, j4, messageSuggestionParams), accountInstance);
                i44++;
                arrayList36 = arrayList3822;
                arrayList37 = arrayList3;
                arrayList34 = arrayList4022;
                arrayList35 = arrayList3922;
                i33 = i8;
                i42 = i6;
                size3 = size3;
                i43 = 1;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("total send time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingMedia$107(MediaSendPrepareWorker mediaSendPrepareWorker, AccountInstance accountInstance, SendingMediaInfo sendingMediaInfo, boolean z) {
        mediaSendPrepareWorker.photo = accountInstance.getSendMessagesHelper().generatePhotoSizes(null, sendingMediaInfo.path, sendingMediaInfo.uri, sendingMediaInfo.highQuality);
        if (z && sendingMediaInfo.canDeleteAfter) {
            new File(sendingMediaInfo.path).delete();
        }
        mediaSendPrepareWorker.sync.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingMedia$108(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str3, int i3, boolean z2, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, str, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str2);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_document, null, str, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, i2, 0, str2, null, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str3;
        of.quick_reply_shortcut_id = i3;
        if (z2) {
            of.effect_id = j2;
        }
        of.invert_media = z3;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingMedia$109(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, boolean z, SendingMediaInfo sendingMediaInfo, HashMap hashMap, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z2, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, int i3, String str2, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_photo, null, null, z ? sendingMediaInfo.searchImage.imageUrl : null, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_photo, z ? sendingMediaInfo.searchImage.imageUrl : null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z2, i, i2, sendingMediaInfo.ttl, str, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut_id = i3;
        of.quick_reply_shortcut = str2;
        of.effect_id = j2;
        of.invert_media = z3;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingMedia$110(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str4, int i3, long j2, boolean z2, TLRPC.PhotoSize photoSize, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tL_document, str2, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str3);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, i2, sendingMediaInfo.ttl, str3, null, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str4;
        of.quick_reply_shortcut_id = i3;
        of.effect_id = j2;
        of.invert_media = z2;
        of.stars = sendingMediaInfo.stars;
        of.cover = photoSize;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingMedia$111(Bitmap[] bitmapArr, String[] strArr, MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, boolean z2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str2, int i3, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams, boolean z4) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_photo, null, null, null, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_photo, null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, i2, sendingMediaInfo.ttl, str, z2, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str2;
        of.quick_reply_shortcut_id = i3;
        of.effect_id = j2;
        of.invert_media = z3;
        of.stars = sendingMediaInfo.stars;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        of.sendingHighQuality = z4;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r2 == 270(0x10e, float:3.78E-43)) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [double] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fillVideoAttribute(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, VideoEditedInfo videoEditedInfo) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        ?? r2 = 0;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            if (mediaMetadataRetriever.extractMetadata(9) != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(r2) / 1000.0d;
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            MediaMetadataRetriever mediaMetadataRetriever3 = extractMetadata3;
            if (extractMetadata3 != null) {
                int intValue = Utilities.parseInt((CharSequence) extractMetadata3).intValue();
                if (videoEditedInfo != null) {
                    videoEditedInfo.rotationValue = intValue;
                    mediaMetadataRetriever3 = intValue;
                } else {
                    if (intValue != 90) {
                        mediaMetadataRetriever3 = intValue;
                    }
                    int i = tL_documentAttributeVideo.w;
                    int i2 = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.w = i2;
                    tL_documentAttributeVideo.h = i;
                    mediaMetadataRetriever3 = i2;
                }
            }
            try {
                mediaMetadataRetriever.release();
                mediaMetadataRetriever2 = mediaMetadataRetriever3;
            } catch (Exception e2) {
                FileLog.e(e2);
                mediaMetadataRetriever2 = mediaMetadataRetriever3;
            }
        } catch (Exception e3) {
            e = e3;
            r2 = mediaMetadataRetriever;
            FileLog.e(e);
            if (r2 != 0) {
                try {
                    r2.release();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            try {
                Context context = ApplicationLoader.applicationContext;
                File file = new File(str);
                MediaPlayer create = MediaPlayer.create(context, Uri.fromFile(file));
                mediaMetadataRetriever2 = file;
                if (create != null) {
                    r2 = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.duration = r2;
                    tL_documentAttributeVideo.w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                    mediaMetadataRetriever2 = r2;
                }
            } catch (Exception e5) {
                FileLog.e(e5);
                mediaMetadataRetriever2 = r2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            throw th;
        }
    }

    public static Bitmap createVideoThumbnail(String str, int i) {
        float f = i == 2 ? 1920.0f : i == 3 ? 96.0f : 512.0f;
        Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, 0L);
        if (createVideoThumbnailAtTime == null) {
            return createVideoThumbnailAtTime;
        }
        int width = createVideoThumbnailAtTime.getWidth();
        int height = createVideoThumbnailAtTime.getHeight();
        float f2 = width;
        if (f2 <= f && height <= f) {
            return createVideoThumbnailAtTime;
        }
        float max = Math.max(width, height) / f;
        return Bitmap.createScaledBitmap(createVideoThumbnailAtTime, (int) (f2 / max), (int) (height / max), true);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j) {
        return createVideoThumbnailAtTime(str, j, null, false);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j, int[] iArr, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (z) {
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, null);
            bitmap2 = animatedFileDrawable.getFrameAtTime(j, z);
            if (iArr != null) {
                iArr[0] = animatedFileDrawable.getOrientation();
            }
            animatedFileDrawable.recycle();
            if (bitmap2 == null) {
                return createVideoThumbnailAtTime(str, j, iArr, false);
            }
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    bitmap = mediaMetadataRetriever.getFrameAtTime(j, 1);
                    if (bitmap == null) {
                        try {
                            bitmap = mediaMetadataRetriever.getFrameAtTime(j, 3);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    bitmap = null;
                }
                bitmap2 = bitmap;
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
            }
        }
        return bitmap2;
    }

    private static VideoEditedInfo createCompressionSettings(String str) {
        int[] iArr = new int[11];
        AnimatedFileDrawable.getVideoInfo(str, iArr);
        if (iArr[0] == 0) {
            if (!BuildVars.LOGS_ENABLED) {
                return null;
            }
            FileLog.d("video hasn't avc1 atom");
            return null;
        }
        long length = new File(str).length();
        int videoBitrate = MediaController.getVideoBitrate(str);
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        float f = iArr[4];
        long j = iArr[5];
        int i = iArr[7];
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.bitrate = videoBitrate;
        videoEditedInfo.originalPath = str;
        videoEditedInfo.framerate = i;
        videoEditedInfo.estimatedDuration = (long) Math.ceil(f);
        boolean z = true;
        int i2 = iArr[1];
        videoEditedInfo.originalWidth = i2;
        videoEditedInfo.resultWidth = i2;
        int i3 = iArr[2];
        videoEditedInfo.originalHeight = i3;
        videoEditedInfo.resultHeight = i3;
        videoEditedInfo.rotationValue = iArr[8];
        videoEditedInfo.originalDuration = (long) (f * 1000.0f);
        float max = Math.max(i2, i3);
        float f2 = 640.0f;
        int i4 = max > 1280.0f ? 4 : max > 854.0f ? 3 : max > 640.0f ? 2 : 1;
        int round = Math.round(DownloadController.getInstance(UserConfig.selectedAccount).getMaxVideoBitrate() / (100.0f / i4));
        if (round > i4) {
            round = i4;
        }
        if (new File(str).length() < 1048576000) {
            if (round != i4 || Math.max(videoEditedInfo.originalWidth, videoEditedInfo.originalHeight) > 1280) {
                if (round == 1) {
                    f2 = 432.0f;
                } else if (round != 2) {
                    f2 = round != 3 ? 1280.0f : 848.0f;
                }
                int i5 = videoEditedInfo.originalWidth;
                int i6 = videoEditedInfo.originalHeight;
                float f3 = f2 / (i5 > i6 ? i5 : i6);
                videoEditedInfo.resultWidth = Math.round((i5 * f3) / 2.0f) * 2;
                videoEditedInfo.resultHeight = Math.round((videoEditedInfo.originalHeight * f3) / 2.0f) * 2;
            } else {
                z = false;
            }
            videoBitrate = MediaController.makeVideoBitrate(videoEditedInfo.originalHeight, videoEditedInfo.originalWidth, videoBitrate, videoEditedInfo.resultHeight, videoEditedInfo.resultWidth);
        } else {
            z = false;
        }
        if (!z) {
            videoEditedInfo.resultWidth = videoEditedInfo.originalWidth;
            videoEditedInfo.resultHeight = videoEditedInfo.originalHeight;
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = length;
        } else {
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = (long) (j + (((f / 1000.0f) * MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoBitrate, false)) / 8.0f));
        }
        if (videoEditedInfo.estimatedSize == 0) {
            videoEditedInfo.estimatedSize = 1L;
        }
        return videoEditedInfo;
    }

    public static void prepareSendingVideo(AccountInstance accountInstance, String str, VideoEditedInfo videoEditedInfo, String str2, TLRPC.Photo photo, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, int i, MessageObject messageObject3, boolean z, int i2, int i3, boolean z2, boolean z3, CharSequence charSequence, String str3, int i4, long j2, long j3) {
        prepareSendingVideo(accountInstance, str, videoEditedInfo, str2, photo, j, messageObject, messageObject2, storyItem, replyQuote, arrayList, i, messageObject3, z, i2, i3, z2, z3, charSequence, str3, i4, j2, j3, 0L, null);
    }

    public static void prepareSendingVideo(final AccountInstance accountInstance, final String str, final VideoEditedInfo videoEditedInfo, final String str2, final TLRPC.Photo photo, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final ArrayList<TLRPC.MessageEntity> arrayList, final int i, final MessageObject messageObject3, final boolean z, final int i2, final int i3, final boolean z2, final boolean z3, final CharSequence charSequence, final String str3, final int i4, final long j2, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingVideo$114(VideoEditedInfo.this, str, j, i, accountInstance, str2, photo, charSequence, messageObject3, z3, messageObject, messageObject2, arrayList, z, i2, i3, storyItem, replyQuote, i4, str3, j2, j3, j4, messageSuggestionParams, z2);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$prepareSendingVideo$114(VideoEditedInfo videoEditedInfo, String str, final long j, final int i, final AccountInstance accountInstance, String str2, TLRPC.Photo photo, CharSequence charSequence, final MessageObject messageObject, final boolean z, final MessageObject messageObject2, final MessageObject messageObject3, final ArrayList arrayList, final boolean z2, final int i2, final int i3, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final int i4, final String str3, final long j2, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams, boolean z3) {
        String str4;
        long j5;
        long j6;
        String str5;
        TLRPC.TL_document tL_document;
        String str6;
        TLRPC.TL_document tL_document2;
        final Bitmap bitmap;
        final String str7;
        boolean z4;
        int i5;
        Bitmap bitmap2;
        TLRPC.PhotoSize fileToSize;
        VideoEditedInfo videoEditedInfo2;
        String str8;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        int i6;
        int i7;
        Object[] sentFile;
        final String str9 = str;
        VideoEditedInfo createCompressionSettings = videoEditedInfo != null ? videoEditedInfo : createCompressionSettings(str);
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        boolean z5 = createCompressionSettings != null && createCompressionSettings.roundVideo;
        if (createCompressionSettings != null || str9.endsWith("mp4") || z5) {
            File file = new File(str9);
            String str10 = str9 + file.length() + "_" + file.lastModified();
            if (createCompressionSettings != null) {
                if (!z5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str10);
                    sb.append(createCompressionSettings.estimatedDuration);
                    sb.append("_");
                    sb.append(createCompressionSettings.startTime);
                    sb.append("_");
                    sb.append(createCompressionSettings.endTime);
                    sb.append(createCompressionSettings.muted ? "_m" : "");
                    str10 = sb.toString();
                    if (createCompressionSettings.resultWidth != createCompressionSettings.originalWidth) {
                        str10 = str10 + "_" + createCompressionSettings.resultWidth;
                    }
                }
                j5 = createCompressionSettings.startTime;
                if (j5 >= 0) {
                    str4 = str10;
                    if (!isEncryptedDialog && i == 0 && (createCompressionSettings == null || (createCompressionSettings.filterState == null && createCompressionSettings.paintPath == null && createCompressionSettings.mediaEntities == null && createCompressionSettings.cropState == null))) {
                        sentFile = accountInstance.getMessagesStorage().getSentFile(str4, isEncryptedDialog ? 2 : 5);
                        if (sentFile != null) {
                            Object obj = sentFile[0];
                            if (obj instanceof TLRPC.TL_document) {
                                TLRPC.TL_document tL_document3 = (TLRPC.TL_document) obj;
                                String str11 = (String) sentFile[1];
                                j6 = j5;
                                str5 = "_";
                                ensureMediaThumbExists(accountInstance, isEncryptedDialog, tL_document3, str, null, j6);
                                tL_document = tL_document3;
                                str6 = str11;
                                if (tL_document == null) {
                                    Bitmap bitmap3 = (createCompressionSettings == null || !createCompressionSettings.notReadyYet) ? null : createCompressionSettings.thumb;
                                    if (bitmap3 == null) {
                                        bitmap3 = createVideoThumbnailAtTime(str9, j6);
                                    }
                                    if (bitmap3 == null) {
                                        bitmap3 = createVideoThumbnail(str9, 1);
                                    }
                                    int i8 = (isEncryptedDialog || i != 0) ? 90 : NotificationCenter.chatlistFolderUpdate;
                                    float f = i8;
                                    TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap3, f, f, i8 > 90 ? 80 : 55, isEncryptedDialog);
                                    if (bitmap3 == null || scaleAndSaveImage == null) {
                                        videoEditedInfo2 = createCompressionSettings;
                                    } else if (z5) {
                                        if (isEncryptedDialog) {
                                            bitmap3 = Bitmap.createScaledBitmap(bitmap3, 90, 90, true);
                                            Utilities.blurBitmap(bitmap3, 7, 1, bitmap3.getWidth(), bitmap3.getHeight(), bitmap3.getRowBytes());
                                            Utilities.blurBitmap(bitmap3, 7, 1, bitmap3.getWidth(), bitmap3.getHeight(), bitmap3.getRowBytes());
                                            Utilities.blurBitmap(bitmap3, 7, 1, bitmap3.getWidth(), bitmap3.getHeight(), bitmap3.getRowBytes());
                                            StringBuilder sb2 = new StringBuilder();
                                            videoEditedInfo2 = createCompressionSettings;
                                            sb2.append(scaleAndSaveImage.location.volume_id);
                                            sb2.append(str5);
                                            sb2.append(scaleAndSaveImage.location.local_id);
                                            sb2.append("@%d_%d_b2");
                                            str8 = String.format(sb2.toString(), Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)), Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)));
                                        } else {
                                            videoEditedInfo2 = createCompressionSettings;
                                            Utilities.blurBitmap(bitmap3, 3, 1, bitmap3.getWidth(), bitmap3.getHeight(), bitmap3.getRowBytes());
                                            str8 = String.format(scaleAndSaveImage.location.volume_id + str5 + scaleAndSaveImage.location.local_id + "@%d_%d_b", Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)), Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)));
                                        }
                                        TLRPC.TL_document tL_document4 = new TLRPC.TL_document();
                                        if (scaleAndSaveImage != null) {
                                            tL_document4.thumbs.add(scaleAndSaveImage);
                                            tL_document4.flags |= 1;
                                        }
                                        tL_document4.file_reference = new byte[0];
                                        tL_document4.mime_type = "video/mp4";
                                        accountInstance.getUserConfig().saveConfig(false);
                                        if (!isEncryptedDialog) {
                                            if (accountInstance.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) == null) {
                                                return;
                                            } else {
                                                tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo_layer159();
                                            }
                                        } else {
                                            tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            tL_documentAttributeVideo.supports_streaming = true;
                                        }
                                        tL_documentAttributeVideo.round_message = z5;
                                        tL_document4.attributes.add(tL_documentAttributeVideo);
                                        createCompressionSettings = videoEditedInfo2;
                                        if (videoEditedInfo2 == null && createCompressionSettings.notReadyYet) {
                                            tL_documentAttributeVideo.w = createCompressionSettings.resultWidth;
                                            tL_documentAttributeVideo.h = createCompressionSettings.resultHeight;
                                            tL_documentAttributeVideo.duration = createCompressionSettings.estimatedDuration / 1000.0d;
                                            tL_document4.size = createCompressionSettings.estimatedSize;
                                        } else if (createCompressionSettings == null && createCompressionSettings.needConvert()) {
                                            if (createCompressionSettings.muted) {
                                                tL_document4.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                                fillVideoAttribute(str9, tL_documentAttributeVideo, createCompressionSettings);
                                                createCompressionSettings.originalWidth = tL_documentAttributeVideo.w;
                                                createCompressionSettings.originalHeight = tL_documentAttributeVideo.h;
                                            } else {
                                                tL_documentAttributeVideo.duration = createCompressionSettings.estimatedDuration / 1000.0d;
                                            }
                                            int i9 = createCompressionSettings.rotationValue;
                                            MediaController.CropState cropState = createCompressionSettings.cropState;
                                            if (cropState != null) {
                                                i6 = cropState.transformWidth;
                                                i7 = cropState.transformHeight;
                                                i9 += cropState.transformRotation;
                                            } else {
                                                i6 = createCompressionSettings.resultWidth;
                                                i7 = createCompressionSettings.resultHeight;
                                            }
                                            if (i9 == 90 || i9 == 270) {
                                                tL_documentAttributeVideo.w = i7;
                                                tL_documentAttributeVideo.h = i6;
                                            } else {
                                                tL_documentAttributeVideo.w = i6;
                                                tL_documentAttributeVideo.h = i7;
                                            }
                                            tL_document4.size = createCompressionSettings.estimatedSize;
                                        } else {
                                            if (file.exists()) {
                                                tL_document4.size = (int) file.length();
                                            }
                                            fillVideoAttribute(str9, tL_documentAttributeVideo, null);
                                        }
                                        tL_document2 = tL_document4;
                                        z4 = false;
                                        str7 = str8;
                                        bitmap = bitmap3;
                                    } else {
                                        videoEditedInfo2 = createCompressionSettings;
                                        bitmap3 = null;
                                    }
                                    str8 = null;
                                    TLRPC.TL_document tL_document42 = new TLRPC.TL_document();
                                    if (scaleAndSaveImage != null) {
                                    }
                                    tL_document42.file_reference = new byte[0];
                                    tL_document42.mime_type = "video/mp4";
                                    accountInstance.getUserConfig().saveConfig(false);
                                    if (!isEncryptedDialog) {
                                    }
                                    tL_documentAttributeVideo.round_message = z5;
                                    tL_document42.attributes.add(tL_documentAttributeVideo);
                                    createCompressionSettings = videoEditedInfo2;
                                    if (videoEditedInfo2 == null) {
                                    }
                                    if (createCompressionSettings == null) {
                                    }
                                    if (file.exists()) {
                                    }
                                    fillVideoAttribute(str9, tL_documentAttributeVideo, null);
                                    tL_document2 = tL_document42;
                                    z4 = false;
                                    str7 = str8;
                                    bitmap = bitmap3;
                                } else {
                                    long j7 = j6;
                                    String str12 = null;
                                    if (tL_document.thumbs.isEmpty()) {
                                        Bitmap bitmap4 = (createCompressionSettings == null || !createCompressionSettings.notReadyYet) ? null : createCompressionSettings.thumb;
                                        if (bitmap4 == null) {
                                            bitmap4 = createVideoThumbnailAtTime(str9, j7);
                                        }
                                        if (bitmap4 == null) {
                                            bitmap4 = createVideoThumbnail(str9, 1);
                                        }
                                        int i10 = (isEncryptedDialog || i != 0) ? 90 : NotificationCenter.chatlistFolderUpdate;
                                        float f2 = i10;
                                        TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(bitmap4, f2, f2, i10 > 90 ? 80 : 55, isEncryptedDialog);
                                        if (bitmap4 == null || scaleAndSaveImage2 == null) {
                                            i5 = 1;
                                        } else {
                                            if (!z5) {
                                                i5 = 1;
                                                bitmap2 = null;
                                            } else if (isEncryptedDialog) {
                                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap4, 90, 90, true);
                                                Utilities.blurBitmap(createScaledBitmap, 7, 1, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getRowBytes());
                                                Utilities.blurBitmap(createScaledBitmap, 7, 1, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getRowBytes());
                                                Utilities.blurBitmap(createScaledBitmap, 7, 1, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getRowBytes());
                                                str12 = String.format(scaleAndSaveImage2.location.volume_id + str5 + scaleAndSaveImage2.location.local_id + "@%d_%d_b2", Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)), Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)));
                                                i5 = 1;
                                                bitmap2 = createScaledBitmap;
                                            } else {
                                                Utilities.blurBitmap(bitmap4, 3, 1, bitmap4.getWidth(), bitmap4.getHeight(), bitmap4.getRowBytes());
                                                i5 = 1;
                                                str12 = String.format(scaleAndSaveImage2.location.volume_id + str5 + scaleAndSaveImage2.location.local_id + "@%d_%d_b", Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)), Integer.valueOf((int) (AndroidUtilities.roundMessageSize / AndroidUtilities.density)));
                                            }
                                            if (scaleAndSaveImage2 != null) {
                                                tL_document.thumbs.add(scaleAndSaveImage2);
                                                tL_document.flags |= i5;
                                            }
                                            bitmap = bitmap2;
                                            str7 = str12;
                                            z4 = false;
                                            tL_document2 = tL_document;
                                        }
                                        bitmap2 = bitmap4;
                                        if (scaleAndSaveImage2 != null) {
                                        }
                                        bitmap = bitmap2;
                                        str7 = str12;
                                        z4 = false;
                                        tL_document2 = tL_document;
                                    } else {
                                        tL_document2 = tL_document;
                                        bitmap = null;
                                        str7 = null;
                                        z4 = false;
                                    }
                                }
                                fileToSize = ImageLoader.fileToSize(str2, z4);
                                if (fileToSize == null && photo != null) {
                                    fileToSize = new ImageLoader.PhotoSizeFromPhoto(photo);
                                }
                                final TLRPC.PhotoSize photoSize = fileToSize;
                                if (createCompressionSettings != null && createCompressionSettings.needConvert()) {
                                    File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".mp4");
                                    SharedConfig.saveConfig();
                                    str9 = file2.getAbsolutePath();
                                }
                                final HashMap hashMap = new HashMap();
                                final String charSequence2 = charSequence != null ? charSequence.toString() : "";
                                if (str4 != null) {
                                    hashMap.put("originalPath", str4);
                                }
                                if (str6 != null) {
                                    hashMap.put("parentObject", str6);
                                }
                                final VideoEditedInfo videoEditedInfo3 = createCompressionSettings;
                                final String str13 = str6;
                                final TLRPC.TL_document tL_document5 = tL_document2;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda58
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SendMessagesHelper.lambda$prepareSendingVideo$113(bitmap, str7, messageObject, accountInstance, videoEditedInfo3, tL_document5, str9, photoSize, hashMap, z, str13, j, messageObject2, messageObject3, charSequence2, arrayList, z2, i2, i3, i, storyItem, replyQuote, i4, str3, j2, j3, j4, messageSuggestionParams);
                                    }
                                });
                                return;
                            }
                        }
                    }
                    j6 = j5;
                    str5 = "_";
                    tL_document = null;
                    str6 = null;
                    if (tL_document == null) {
                    }
                    fileToSize = ImageLoader.fileToSize(str2, z4);
                    if (fileToSize == null) {
                        fileToSize = new ImageLoader.PhotoSizeFromPhoto(photo);
                    }
                    final TLRPC.PhotoSize photoSize2 = fileToSize;
                    if (createCompressionSettings != null) {
                        File file22 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".mp4");
                        SharedConfig.saveConfig();
                        str9 = file22.getAbsolutePath();
                    }
                    final HashMap hashMap2 = new HashMap();
                    if (charSequence != null) {
                    }
                    if (str4 != null) {
                    }
                    if (str6 != null) {
                    }
                    final VideoEditedInfo videoEditedInfo32 = createCompressionSettings;
                    final String str132 = str6;
                    final TLRPC.TL_document tL_document52 = tL_document2;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda58
                        @Override // java.lang.Runnable
                        public final void run() {
                            SendMessagesHelper.lambda$prepareSendingVideo$113(bitmap, str7, messageObject, accountInstance, videoEditedInfo32, tL_document52, str9, photoSize2, hashMap2, z, str132, j, messageObject2, messageObject3, charSequence2, arrayList, z2, i2, i3, i, storyItem, replyQuote, i4, str3, j2, j3, j4, messageSuggestionParams);
                        }
                    });
                    return;
                }
            }
            str4 = str10;
            j5 = 0;
            if (!isEncryptedDialog) {
                sentFile = accountInstance.getMessagesStorage().getSentFile(str4, isEncryptedDialog ? 2 : 5);
                if (sentFile != null) {
                }
            }
            j6 = j5;
            str5 = "_";
            tL_document = null;
            str6 = null;
            if (tL_document == null) {
            }
            fileToSize = ImageLoader.fileToSize(str2, z4);
            if (fileToSize == null) {
            }
            final TLRPC.PhotoSize photoSize22 = fileToSize;
            if (createCompressionSettings != null) {
            }
            final HashMap hashMap22 = new HashMap();
            if (charSequence != null) {
            }
            if (str4 != null) {
            }
            if (str6 != null) {
            }
            final VideoEditedInfo videoEditedInfo322 = createCompressionSettings;
            final String str1322 = str6;
            final TLRPC.TL_document tL_document522 = tL_document2;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda58
                @Override // java.lang.Runnable
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingVideo$113(bitmap, str7, messageObject, accountInstance, videoEditedInfo322, tL_document522, str9, photoSize22, hashMap22, z, str1322, j, messageObject2, messageObject3, charSequence2, arrayList, z2, i2, i3, i, storyItem, replyQuote, i4, str3, j2, j3, j4, messageSuggestionParams);
                }
            });
            return;
        }
        prepareSendingDocumentInternal(accountInstance, str, str, null, null, j, messageObject2, messageObject3, storyItem, replyQuote, arrayList, messageObject, null, false, charSequence, z2, i2, i3, null, z3, str3, i4, 0L, false, j3, j4, messageSuggestionParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepareSendingVideo$113(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, TLRPC.PhotoSize photoSize, HashMap hashMap, boolean z, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, String str4, ArrayList arrayList, boolean z2, int i, int i2, int i3, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, int i4, String str5, long j2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tL_document, str2, photoSize, hashMap, false, z, str3);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, str4, arrayList, null, hashMap, z2, i, i2, i3, str3, null, false, z);
        of.replyToStoryItem = storyItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut_id = i4;
        of.quick_reply_shortcut = str5;
        of.effect_id = j2;
        of.cover = photoSize;
        of.payStars = j3;
        of.monoForumPeer = j4;
        of.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static class SendMessageParams {
        public String caption;
        public TLRPC.PhotoSize cover;
        public long dice_stake;
        public TLRPC.TL_document document;
        public long effect_id;
        public ArrayList<TLRPC.MessageEntity> entities;
        public TLRPC.TL_game game;
        public boolean hasMediaSpoilers;
        public boolean invert_media;
        public TLRPC.TL_messageMediaInvoice invoice;
        public TLRPC.MessageMedia location;
        public TLRPC.TL_messageMediaWebPage mediaWebPage;
        public String message;
        public long monoForumPeer;
        public boolean notify;
        public HashMap<String, String> params;
        public Object parentObject;
        public String path;
        public long payStars;
        public long peer;
        public TLRPC.TL_photo photo;
        public TLRPC.TL_messageMediaPoll poll;
        public String quick_reply_shortcut;
        public int quick_reply_shortcut_id;
        public TLRPC.ReplyMarkup replyMarkup;
        public ChatActivity.ReplyQuote replyQuote;
        public MessageObject replyToMsg;
        public TL_stories.StoryItem replyToStoryItem;
        public MessageObject replyToTopMsg;
        public MessageObject retryMessageObject;
        public int scheduleDate;
        public int scheduleRepeatPeriod;
        public boolean searchLinks = true;
        public MessageObject.SendAnimationData sendAnimationData;
        public boolean sendingHighQuality;
        public TL_stories.StoryItem sendingStory;
        public long stars;
        public MessageSuggestionParams suggestionParams;
        public TLRPC.TL_messageMediaToDo todo;
        public int ttl;
        public boolean updateStickersOrder;
        public TLRPC.User user;
        public VideoEditedInfo videoEditedInfo;
        public TLRPC.WebPage webPage;

        public static SendMessageParams of(String str, long j) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false);
        }

        public static SendMessageParams of(MessageObject messageObject) {
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            SendMessageParams of = of(null, null, null, null, null, null, null, null, null, null, dialogId, message.attachPath, null, null, null, true, messageObject, null, message.reply_markup, message.params, !message.silent, messageObject.scheduled ? message.date : 0, 0, 0, null, null, false);
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null) {
                TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message2.quick_reply_shortcut;
                if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                    of.quick_reply_shortcut = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                }
                of.quick_reply_shortcut_id = messageObject.getQuickReplyId();
                of.payStars = messageObject.messageOwner.paid_message_stars;
            }
            return of;
        }

        public static SendMessageParams of(TLRPC.User user, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2) {
            return of(null, null, null, null, null, user, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, sendAnimationData, z2);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, boolean z3) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, sendAnimationData, z2, z3);
        }

        public static SendMessageParams of(String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z2, int i, int i2, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, webPage, z, null, arrayList, replyMarkup, hashMap, z2, i, i2, 0, null, sendAnimationData, z3);
        }

        public static SendMessageParams of(TLRPC.MessageMedia messageMedia, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2) {
            return of(null, null, messageMedia, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, null, tL_messageMediaPoll, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_game tL_game, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, tL_game, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, int i3, Object obj, boolean z2, boolean z3) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, null, z2, z3);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, int i3, Object obj, boolean z2) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, null, z2);
        }

        private static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z2, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, str2, messageMedia, tL_photo, videoEditedInfo, user, tL_document, tL_game, tL_messageMediaPoll, tL_messageMediaInvoice, j, str3, messageObject, messageObject2, webPage, z, messageObject3, arrayList, replyMarkup, hashMap, z2, i, i2, i3, obj, sendAnimationData, z3, false);
        }

        public static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z2, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3, boolean z4) {
            SendMessageParams sendMessageParams = new SendMessageParams();
            sendMessageParams.message = str;
            sendMessageParams.caption = str2;
            sendMessageParams.location = messageMedia;
            sendMessageParams.photo = tL_photo;
            sendMessageParams.videoEditedInfo = videoEditedInfo;
            sendMessageParams.user = user;
            sendMessageParams.document = tL_document;
            sendMessageParams.game = tL_game;
            sendMessageParams.poll = tL_messageMediaPoll;
            sendMessageParams.invoice = tL_messageMediaInvoice;
            sendMessageParams.peer = j;
            sendMessageParams.path = str3;
            sendMessageParams.replyToMsg = messageObject;
            sendMessageParams.replyToTopMsg = messageObject2;
            sendMessageParams.webPage = webPage;
            sendMessageParams.searchLinks = z;
            sendMessageParams.retryMessageObject = messageObject3;
            sendMessageParams.entities = arrayList;
            sendMessageParams.replyMarkup = replyMarkup;
            sendMessageParams.params = hashMap;
            sendMessageParams.notify = z2;
            sendMessageParams.scheduleDate = i;
            sendMessageParams.scheduleRepeatPeriod = i2;
            sendMessageParams.ttl = i3;
            sendMessageParams.parentObject = obj;
            sendMessageParams.sendAnimationData = sendAnimationData;
            sendMessageParams.updateStickersOrder = z3;
            sendMessageParams.hasMediaSpoilers = z4;
            return sendMessageParams;
        }
    }

    public TLRPC.Message getMessageFromUpdate(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateNewMessage) {
            return ((TLRPC.TL_updateNewMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
            return ((TLRPC.TL_updateNewChannelMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
            return ((TLRPC.TL_updateNewScheduledMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
            return ((TLRPC.TL_updateQuickReplyMessage) update).message;
        }
        return null;
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
        }
    }
}

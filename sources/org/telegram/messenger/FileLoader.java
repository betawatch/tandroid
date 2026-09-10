package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class FileLoader extends BaseController {
    public static final long DEFAULT_MAX_FILE_SIZE = 2097152000;
    public static final long DEFAULT_MAX_FILE_SIZE_PREMIUM = 4194304000L;
    public static final int IMAGE_TYPE_ANIMATION = 2;
    public static final int IMAGE_TYPE_LOTTIE = 1;
    public static final int IMAGE_TYPE_SVG = 3;
    public static final int IMAGE_TYPE_SVG_WHITE = 4;
    public static final int IMAGE_TYPE_THEME_PREVIEW = 5;
    public static final int MEDIA_DIR_AUDIO = 1;
    public static final int MEDIA_DIR_CACHE = 4;
    public static final int MEDIA_DIR_DOCUMENT = 3;
    public static final int MEDIA_DIR_FILES = 5;
    public static final int MEDIA_DIR_IMAGE = 0;
    public static final int MEDIA_DIR_IMAGE_PUBLIC = 100;
    public static final int MEDIA_DIR_STORIES = 6;
    public static final int MEDIA_DIR_VIDEO = 2;
    public static final int MEDIA_DIR_VIDEO_PUBLIC = 101;
    public static final int PRELOAD_CACHE_TYPE = 11;
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 0;
    public static final int PRIORITY_NORMAL = 1;
    public static final int PRIORITY_NORMAL_UP = 2;
    private static final int PRIORITY_STREAM = 4;
    private static Pattern sentPattern;
    private int currentUploadOperationsCount;
    private int currentUploadSmallOperationsCount;
    private FileLoaderDelegate delegate;
    Runnable dumpFilesQueueRunnable;
    private final FilePathDatabase filePathDatabase;
    private String forceLoadingFile;
    private final FileLoaderPriorityQueue[] largeFilesQueue;
    private int lastReferenceId;
    private final ConcurrentHashMap<String, FileLoadOperation> loadOperationPaths;
    private final ConcurrentHashMap<String, LoadOperationUIObject> loadOperationPathsUI;
    private final HashMap<String, Boolean> loadingVideos;
    private final ConcurrentHashMap<Integer, Object> parentObjectReferences;
    private int priorityIncreasePointer;
    private final FileLoaderPriorityQueue[] smallFilesQueue;
    private final ConcurrentHashMap<String, FileUploadOperation> uploadOperationPaths;
    private final ConcurrentHashMap<String, FileUploadOperation> uploadOperationPathsEnc;
    private final LinkedList<FileUploadOperation> uploadOperationQueue;
    private final HashMap<String, Long> uploadSizes;
    private final LinkedList<FileUploadOperation> uploadSmallOperationQueue;
    private static volatile DispatchQueue fileLoaderQueue = new DispatchQueue("fileUploadQueue");
    private static SparseArray<File> mediaDirs = null;
    private static final FileLoader[] Instance = new FileLoader[4];

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 1 implements FileUploadOperation.FileUploadOperationDelegate {
        final /* synthetic */ boolean val$encrypted;
        final /* synthetic */ String val$location;
        final /* synthetic */ boolean val$small;

        public 1(boolean z10, String str, boolean z11) {
            this.val$encrypted = z10;
            this.val$location = str;
            this.val$small = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didFailedUploadingFile$1(boolean z10, String str, boolean z11) {
            FileUploadOperation fileUploadOperation;
            FileUploadOperation fileUploadOperation2;
            if (z10) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedUpload(str, z10);
            }
            if (z11) {
                FileLoader.access$810(FileLoader.this);
                if (FileLoader.this.currentUploadSmallOperationsCount >= 1 || (fileUploadOperation2 = (FileUploadOperation) FileLoader.this.uploadSmallOperationQueue.poll()) == null) {
                    return;
                }
                FileLoader.access$808(FileLoader.this);
                fileUploadOperation2.start();
                return;
            }
            FileLoader.access$1010(FileLoader.this);
            if (FileLoader.this.currentUploadOperationsCount >= 1 || (fileUploadOperation = (FileUploadOperation) FileLoader.this.uploadOperationQueue.poll()) == null) {
                return;
            }
            FileLoader.access$1008(FileLoader.this);
            fileUploadOperation.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didFinishUploadingFile$0(boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
            FileUploadOperation fileUploadOperation2;
            FileUploadOperation fileUploadOperation3;
            if (z10) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (z11) {
                FileLoader.access$810(FileLoader.this);
                if (FileLoader.this.currentUploadSmallOperationsCount < 1 && (fileUploadOperation3 = (FileUploadOperation) FileLoader.this.uploadSmallOperationQueue.poll()) != null) {
                    FileLoader.access$808(FileLoader.this);
                    fileUploadOperation3.start();
                }
            } else {
                FileLoader.access$1010(FileLoader.this);
                if (FileLoader.this.currentUploadOperationsCount < 1 && (fileUploadOperation2 = (FileUploadOperation) FileLoader.this.uploadOperationQueue.poll()) != null) {
                    FileLoader.access$1008(FileLoader.this);
                    fileUploadOperation2.start();
                }
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidUploaded(str, inputFile, inputEncryptedFile, bArr, bArr2, fileUploadOperation.getTotalFileSize());
            }
        }

        @Override // org.telegram.messenger.FileUploadOperation.FileUploadOperationDelegate
        public void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j3, long j10) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileUploadProgressChanged(fileUploadOperation, this.val$location, j3, j10, this.val$encrypted);
            }
        }

        @Override // org.telegram.messenger.FileUploadOperation.FileUploadOperationDelegate
        public void didFailedUploadingFile(FileUploadOperation fileUploadOperation) {
            FileLoader.fileLoaderQueue.postRunnable(new g3(this, this.val$encrypted, this.val$location, this.val$small));
        }

        @Override // org.telegram.messenger.FileUploadOperation.FileUploadOperationDelegate
        public void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
            FileLoader.fileLoaderQueue.postRunnable(new h3(this, this.val$encrypted, this.val$location, this.val$small, inputFile, inputEncryptedFile, bArr, bArr2, fileUploadOperation));
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 2 implements FileLoadOperation.FileLoadOperationDelegate {
        final /* synthetic */ TLRPC.Document val$document;
        final /* synthetic */ String val$fileName;
        final /* synthetic */ int val$finalType;
        final /* synthetic */ Object val$parentObject;

        public 2(Object obj, TLRPC.Document document, String str, int i10) {
            this.val$parentObject = obj;
            this.val$document = document;
            this.val$fileName = str;
            this.val$finalType = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$didPreFinishLoading$0(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
            fileLoadOperation.preFinished = true;
            fileLoaderPriorityQueue.checkLoadingOperations();
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j3, long j10) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileLoadProgressChanged(fileLoadOperation, this.val$fileName, j3, j10);
            }
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i10) {
            FileLoader.this.loadOperationPathsUI.remove(this.val$fileName);
            FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue());
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedLoad(this.val$fileName, i10);
            }
            if (this.val$document != null && (this.val$parentObject instanceof MessageObject) && i10 == 0) {
                FileLoader.this.getDownloadController().onDownloadFail((MessageObject) this.val$parentObject, i10);
            } else if (i10 == -1) {
                LaunchActivity.E(2);
            }
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file) {
            if (!fileLoadOperation.isPreloadVideoOperation() && fileLoadOperation.isPreloadFinished()) {
                FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue(), 0L);
                return;
            }
            FilePathDatabase.FileMeta fileMetadataFromParent = FileLoader.getFileMetadataFromParent(FileLoader.this.currentAccount, this.val$parentObject);
            if (fileMetadataFromParent != null) {
                FileLoader.this.getFileLoader().getFileDatabase().saveFileDialogId(file, fileMetadataFromParent);
            }
            Object obj = this.val$parentObject;
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                if (this.val$document != null && messageObject.putInDownloadsStore) {
                    FileLoader.this.getDownloadController().onDownloadComplete(messageObject);
                }
            }
            if (!fileLoadOperation.isPreloadVideoOperation()) {
                FileLoader.this.loadOperationPathsUI.remove(this.val$fileName);
                if (FileLoader.this.delegate != null) {
                    FileLoader.this.delegate.fileDidLoaded(this.val$fileName, file, this.val$parentObject, this.val$finalType);
                }
            }
            FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue(), 0L);
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file) {
            FileLoader.fileLoaderQueue.postRunnable(new i3(0, fileLoadOperation, fileLoadOperation.getQueue()));
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public boolean hasAnotherRefOnFile(String str) {
            return FileLoader.this.getFileDatabase().hasAnotherRefOnFile(str);
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public boolean isLocallyCreatedFile(String str) {
            return FileLoader.this.getFileDatabase().isLocallyCreated(str);
        }

        @Override // org.telegram.messenger.FileLoadOperation.FileLoadOperationDelegate
        public void saveFilePath(FilePathDatabase.PathData pathData, File file) {
            FileLoader.this.getFileDatabase().putPath(pathData.id, pathData.dc, pathData.type, 0, file != null ? file.toString() : null);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface FileLoaderDelegate {
        void fileDidFailedLoad(String str, int i10);

        void fileDidFailedUpload(String str, boolean z10);

        void fileDidLoaded(String str, File file, Object obj, int i10);

        void fileDidUploaded(String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3);

        void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j3, long j10);

        void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, String str, long j3, long j10, boolean z10);
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface FileResolver {
        File getFile();
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class LoadOperationUIObject {
        Runnable loadInternalRunnable;

        private LoadOperationUIObject() {
        }

        public /* synthetic */ LoadOperationUIObject(1 r12) {
            this();
        }
    }

    public FileLoader(int i10) {
        super(i10);
        this.smallFilesQueue = new FileLoaderPriorityQueue[5];
        this.largeFilesQueue = new FileLoaderPriorityQueue[5];
        this.uploadOperationQueue = new LinkedList<>();
        this.uploadSmallOperationQueue = new LinkedList<>();
        this.uploadOperationPaths = new ConcurrentHashMap<>();
        this.uploadOperationPathsEnc = new ConcurrentHashMap<>();
        this.currentUploadOperationsCount = 0;
        this.currentUploadSmallOperationsCount = 0;
        this.loadOperationPaths = new ConcurrentHashMap<>();
        this.loadOperationPathsUI = new ConcurrentHashMap<>(10, 1.0f, 2);
        this.uploadSizes = new HashMap<>();
        this.loadingVideos = new HashMap<>();
        this.delegate = null;
        this.parentObjectReferences = new ConcurrentHashMap<>();
        this.dumpFilesQueueRunnable = new y2(this, 0);
        this.filePathDatabase = new FilePathDatabase(i10);
        int i11 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i11 >= fileLoaderPriorityQueueArr.length) {
                dumpFilesQueue();
                return;
            }
            StringBuilder sb2 = new StringBuilder("smallFilesQueue dc");
            int i12 = i11 + 1;
            sb2.append(i12);
            fileLoaderPriorityQueueArr[i11] = new FileLoaderPriorityQueue(i10, sb2.toString(), 0, fileLoaderQueue);
            this.largeFilesQueue[i11] = new FileLoaderPriorityQueue(i10, hc.b.j(i12, "largeFilesQueue dc"), 1, fileLoaderQueue);
            i11 = i12;
        }
    }

    public static /* synthetic */ int access$1008(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int access$1010(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int access$808(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int access$810(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i10 - 1;
        return i10;
    }

    private void addOperationToQueue(FileLoadOperation fileLoadOperation, LinkedList<FileLoadOperation> linkedList) {
        int priority = fileLoadOperation.getPriority();
        if (priority <= 0) {
            linkedList.add(fileLoadOperation);
            return;
        }
        int size = linkedList.size();
        int size2 = linkedList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            if (linkedList.get(i10).getPriority() < priority) {
                size = i10;
                break;
            }
            i10++;
        }
        linkedList.add(size, fileLoadOperation);
    }

    private void awaitFileLoadOperation(CountDownLatch countDownLatch, boolean z10) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            if (z10) {
                awaitFileLoadOperation(countDownLatch, false);
            }
        }
    }

    public static long bytesToLong(byte[] bArr) {
        long j3 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j3 = (j3 << 8) ^ (bArr[i10] & 255);
        }
        return j3;
    }

    public static boolean canSaveAsFile(Object obj) {
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.isDocument() && !messageObject.isRoundVideo() && !messageObject.isVoice()) {
                return true;
            }
        }
        return false;
    }

    private boolean canSaveToPublicStorage(Object obj) {
        FilePathDatabase.FileMeta fileMetadataFromParent;
        MessageObject messageObject;
        if (!BuildVars.NO_SCOPED_STORAGE && (fileMetadataFromParent = getFileMetadataFromParent(this.currentAccount, obj)) != null) {
            long j3 = fileMetadataFromParent.dialogId;
            if (!getMessagesController().isPeerNoForwards(j3) && !DialogObject.isEncryptedDialog(j3)) {
                int i10 = 2;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.isRoundVideo() || messageObject.isVoice() || messageObject.isAnyKindOfSticker() || messageObject.messageOwner.noforwards) {
                        return false;
                    }
                } else {
                    int i11 = fileMetadataFromParent.messageType;
                    if (i11 != 5 && i11 != 13 && i11 != 2) {
                        messageObject = null;
                    }
                }
                if (j3 >= 0) {
                    i10 = 1;
                } else if (ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(-j3)))) {
                    i10 = 4;
                }
                if (SaveToGallerySettingsHelper.needSave(i10, fileMetadataFromParent, messageObject, this.currentAccount)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static File checkDirectory(int i10) {
        return mediaDirs.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
        checkDownloadQueue(fileLoadOperation, fileLoaderPriorityQueue, 0L);
    }

    public static boolean checkUploadFileSize(int i10, long j3) {
        boolean isPremium = AccountInstance.getInstance(i10).getUserConfig().isPremium();
        if (j3 >= DEFAULT_MAX_FILE_SIZE) {
            return j3 < 4194304000L && isPremium;
        }
        return true;
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, file, -1);
    }

    public static String fixFileName(String str) {
        return str != null ? str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim() : str;
    }

    public static String getAttachFileName(TLObject tLObject) {
        return getAttachFileName(tLObject, null);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10) {
        return getClosestPhotoSizeWithSize(arrayList, i10, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10) {
        return getClosestVideoSizeWithSize(arrayList, i10, false);
    }

    public static File getDirectory(int i10) {
        File file = mediaDirs.get(i10);
        if (file == null && i10 != 4) {
            file = mediaDirs.get(4);
        }
        if (BuildVars.NO_SCOPED_STORAGE && file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
            } catch (Exception unused) {
            }
        }
        return file;
    }

    public static String getDocumentExtension(TLRPC.Document document) {
        String documentFileName = getDocumentFileName(document);
        int lastIndexOf = documentFileName.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? documentFileName.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = document.mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public static String getDocumentFileName(TLRPC.Document document) {
        String str = null;
        if (document == null) {
            return null;
        }
        String str2 = document.file_name_fixed;
        if (str2 != null) {
            return str2;
        }
        String str3 = document.file_name;
        if (str3 == null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String fixFileName = fixFileName(str3);
        return fixFileName != null ? fixFileName : "";
    }

    public static TLRPC.VideoSize getEmojiMarkup(ArrayList<TLRPC.VideoSize> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if ((arrayList.get(i10) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList.get(i10) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    public static String getExtensionByMimeType(String str) {
        if (str == null) {
            return "";
        }
        switch (str) {
            case "audio/ogg":
                return ".ogg";
            case "video/mp4":
                return ".mp4";
            case "video/x-matroska":
                return ".mkv";
            default:
                return "";
        }
    }

    public static String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static FilePathDatabase.FileMeta getFileMetadataFromParent(int i10, Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof MessageObject)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                FilePathDatabase.FileMeta fileMeta = new FilePathDatabase.FileMeta();
                fileMeta.dialogId = ((TL_stories.StoryItem) obj).dialogId;
                fileMeta.messageType = 23;
                return fileMeta;
            }
            MessageObject messageObject = (MessageObject) obj;
            FilePathDatabase.FileMeta fileMeta2 = new FilePathDatabase.FileMeta();
            fileMeta2.messageId = messageObject.getId();
            fileMeta2.dialogId = messageObject.getDialogId();
            fileMeta2.messageType = messageObject.type;
            fileMeta2.messageSize = messageObject.getSize();
            return fileMeta2;
        }
        String str = (String) obj;
        if (!str.startsWith("sent_")) {
            return null;
        }
        if (sentPattern == null) {
            sentPattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
        }
        try {
            Matcher matcher = sentPattern.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            FilePathDatabase.FileMeta fileMeta3 = new FilePathDatabase.FileMeta();
            fileMeta3.messageId = Integer.parseInt(matcher.group(1));
            fileMeta3.dialogId = Long.parseLong(matcher.group(2));
            fileMeta3.messageType = Integer.parseInt(matcher.group(3));
            fileMeta3.messageSize = Long.parseLong(matcher.group(4));
            return fileMeta3;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static FileLoader getInstance(int i10) {
        FileLoader fileLoader;
        FileLoader[] fileLoaderArr = Instance;
        FileLoader fileLoader2 = fileLoaderArr[i10];
        if (fileLoader2 != null) {
            return fileLoader2;
        }
        synchronized (FileLoader.class) {
            try {
                fileLoader = fileLoaderArr[i10];
                if (fileLoader == null) {
                    fileLoader = new FileLoader(i10);
                    fileLoaderArr[i10] = fileLoader;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fileLoader;
    }

    public static File getInternalCacheDir() {
        return ApplicationLoader.applicationContext.getCacheDir();
    }

    public static String getMessageFileName(TLRPC.Message message) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize3;
        if (message == null) {
            return "";
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (closestPhotoSizeWithSize3 = getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                    return getAttachFileName(closestPhotoSizeWithSize3);
                }
            }
        } else {
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getAttachFileName(MessageObject.getMedia(message).document);
            }
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getAttachFileName(closestPhotoSizeWithSize2);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getAttachFileName(MessageObject.getMedia(message).webpage.document);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getAttachFileName(closestPhotoSizeWithSize);
                    }
                }
            } else if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).webPhoto) != null) {
                return Utilities.MD5(webDocument.url) + "." + ImageLoader.getHttpUrlExtension(webDocument.url, getMimeTypePart(webDocument.mime_type));
            }
        }
        return "";
    }

    public static String getMimeTypePart(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
    }

    public static TLRPC.TL_photoPathSize getPathPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i10);
                if (!(photoSize instanceof TLRPC.TL_photoPathSize)) {
                    return (TLRPC.TL_photoPathSize) photoSize;
                }
            }
        }
        return null;
    }

    public static long getPhotoId(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return ((TLRPC.Photo) tLObject).id;
        }
        if (tLObject instanceof TLRPC.ChatPhoto) {
            return ((TLRPC.ChatPhoto) tLObject).photo_id;
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            return ((TLRPC.UserProfilePhoto) tLObject).photo_id;
        }
        return 0L;
    }

    private int getPriorityValue(int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i10 == 3) {
            i11 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i11 + 1;
            i12 = 1048577;
        } else {
            if (i10 != 2) {
                return i10 == 1 ? 65536 : 0;
            }
            i11 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i11 + 1;
            i12 = 65537;
        }
        return i11 + i12;
    }

    public static TLRPC.TL_photoStrippedSize getStrippedPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize getVectorMarkupVideoSize(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i10 = 0; i10 < photo.video_sizes.size(); i10++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i10);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean isSamePhoto(TLObject tLObject, TLObject tLObject2) {
        if ((tLObject == null && tLObject2 != null) || (tLObject != null && tLObject2 == null)) {
            return false;
        }
        if (tLObject == null && tLObject2 == null) {
            return true;
        }
        if (tLObject.getClass() != tLObject2.getClass()) {
            return false;
        }
        return tLObject instanceof TLRPC.UserProfilePhoto ? ((TLRPC.UserProfilePhoto) tLObject).photo_id == ((TLRPC.UserProfilePhoto) tLObject2).photo_id : (tLObject instanceof TLRPC.ChatPhoto) && ((TLRPC.ChatPhoto) tLObject).photo_id == ((TLRPC.ChatPhoto) tLObject2).photo_id;
    }

    public static boolean isVideoMimeType(String str) {
        if ("video/mp4".equals(str)) {
            return true;
        }
        return SharedConfig.streamMkv && "video/x-matroska".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$10() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$9(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelFileUpload$2(boolean z10, String str) {
        FileUploadOperation fileUploadOperation = !z10 ? this.uploadOperationPaths.get(str) : this.uploadOperationPathsEnc.get(str);
        this.uploadSizes.remove(str);
        if (fileUploadOperation != null) {
            this.uploadOperationPathsEnc.remove(str);
            this.uploadOperationQueue.remove(fileUploadOperation);
            this.uploadSmallOperationQueue.remove(fileUploadOperation);
            fileUploadOperation.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelLoadAllFiles$12(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelLoadFile$7(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelLoadFile$8() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changePriority$11(String str, int i10) {
        int priorityValue;
        FileLoadOperation fileLoadOperation = this.loadOperationPaths.get(str);
        if (fileLoadOperation == null || fileLoadOperation.getPriority() == (priorityValue = getPriorityValue(i10))) {
            return;
        }
        fileLoadOperation.setPriority(priorityValue);
        FileLoaderPriorityQueue queue = fileLoadOperation.getQueue();
        queue.remove(fileLoadOperation);
        queue.add(fileLoadOperation);
        queue.checkLoadingOperations();
        StringBuilder sb2 = new StringBuilder("update priority ");
        sb2.append(str);
        sb2.append(" position in queue ");
        sb2.append(fileLoadOperation.getPositionInQueue());
        sb2.append(" account=");
        hc.b.q(this.currentAccount, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCurrentDownloadsFiles$17(ArrayList arrayList) {
        getDownloadController().recentDownloadingFiles.removeAll(arrayList);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDownloadQueue$15(FileLoaderPriorityQueue fileLoaderPriorityQueue, FileLoadOperation fileLoadOperation) {
        if (fileLoaderPriorityQueue.remove(fileLoadOperation)) {
            this.loadOperationPaths.remove(fileLoadOperation.getFileName());
            fileLoaderPriorityQueue.checkLoadingOperations(fileLoadOperation.isStory);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkUploadNewDataAvailable$3(boolean z10, String str, long j3, long j10, Float f7) {
        FileUploadOperation fileUploadOperation = z10 ? this.uploadOperationPathsEnc.get(str) : this.uploadOperationPaths.get(str);
        if (fileUploadOperation != null) {
            fileUploadOperation.checkNewDataAvailable(j3, j10, f7);
        } else if (j10 != 0) {
            this.uploadSizes.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteFiles$16(ArrayList arrayList, int i10) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            File file = (File) arrayList.get(i11);
            File file2 = new File(file.getAbsolutePath() + ".enc");
            if (file2.exists()) {
                try {
                    if (!file2.delete()) {
                        file2.deleteOnExit();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    File file3 = new File(getInternalCacheDir(), file.getName() + ".enc.key");
                    if (!file3.delete()) {
                        file3.deleteOnExit();
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (file.exists()) {
                try {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            try {
                File file4 = new File(file.getParentFile(), "q_" + file.getName());
                if (file4.exists() && !file4.delete()) {
                    file4.deleteOnExit();
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (i10 == 2) {
            ImageLoader.getInstance().clearMemory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFile$13(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        loadFileInternal(document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str, j3, i10, null, 0L, false, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadStreamFile$14(FileLoadOperation[] fileLoadOperationArr, TLRPC.Document document, ImageLocation imageLocation, Object obj, int i10, FileLoadOperationStream fileLoadOperationStream, long j3, boolean z10, int i11, CountDownLatch countDownLatch) {
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || imageLocation == null) ? null : imageLocation.location;
        if (document == null && imageLocation != null) {
            str = "mp4";
        }
        fileLoadOperationArr[0] = loadFileInternal(document, null, null, tL_fileLocationToBeDeprecated, imageLocation, obj, str, (document != null || imageLocation == null) ? 0L : imageLocation.currentSize, i10, fileLoadOperationStream, j3, z10, i11);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$18() {
        int i10 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i10 >= fileLoaderPriorityQueueArr.length) {
                dumpFilesQueue();
                return;
            }
            if (fileLoaderPriorityQueueArr[i10].getCount() > 0 || this.largeFilesQueue[i10].getCount() > 0) {
                FileLog.d("download queue: dc" + (i10 + 1) + " account=" + this.currentAccount + " small_operations=" + this.smallFilesQueue[i10].getCount() + " large_operations=" + this.largeFilesQueue[i10].getCount());
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNetworkChanged$4(boolean z10) {
        Iterator<Map.Entry<String, FileUploadOperation>> it = this.uploadOperationPaths.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onNetworkChanged(z10);
        }
        Iterator<Map.Entry<String, FileUploadOperation>> it2 = this.uploadOperationPathsEnc.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onNetworkChanged(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setForceStreamLoadingFile$6(TLRPC.FileLocation fileLocation, String str) {
        String attachFileName = getAttachFileName(fileLocation, str);
        this.forceLoadingFile = attachFileName;
        FileLoadOperation fileLoadOperation = this.loadOperationPaths.get(attachFileName);
        if (fileLoadOperation != null) {
            if (fileLoadOperation.isPreloadVideoOperation()) {
                fileLoadOperation.setIsPreloadVideoOperation(false);
            }
            fileLoadOperation.setForceRequest(true);
            fileLoadOperation.setPriority(getPriorityValue(4));
            fileLoadOperation.getQueue().remove(fileLoadOperation);
            fileLoadOperation.getQueue().add(fileLoadOperation);
            fileLoadOperation.getQueue().checkLoadingOperations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFile$19(NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uploadFile$20(String str, Utilities.Callback callback, Runnable runnable, int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            if (objArr[0] == str) {
                callback.run((TLRPC.InputFile) objArr[1]);
                runnable.run();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed && objArr[0] == str) {
            callback.run(null);
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFile$5(boolean z10, String str, long j3, int i10, boolean z11, boolean z12) {
        long j10;
        if (z10) {
            if (this.uploadOperationPathsEnc.containsKey(str)) {
                return;
            }
        } else if (this.uploadOperationPaths.containsKey(str)) {
            return;
        }
        if (j3 == 0 || this.uploadSizes.get(str) == null) {
            j10 = j3;
        } else {
            this.uploadSizes.remove(str);
            j10 = 0;
        }
        FileUploadOperation fileUploadOperation = new FileUploadOperation(this.currentAccount, str, z10, j10, i10);
        FileLoaderDelegate fileLoaderDelegate = this.delegate;
        if (fileLoaderDelegate != null && j3 != 0) {
            fileLoaderDelegate.fileUploadProgressChanged(fileUploadOperation, str, 0L, j3, z10);
            fileUploadOperation = fileUploadOperation;
        }
        if (z10) {
            this.uploadOperationPathsEnc.put(str, fileUploadOperation);
        } else {
            this.uploadOperationPaths.put(str, fileUploadOperation);
        }
        if (z11) {
            fileUploadOperation.setForceSmallFile();
        }
        fileUploadOperation.setDelegate(new 1(z10, str, z12));
        if (z12) {
            int i11 = this.currentUploadSmallOperationsCount;
            if (i11 >= 1) {
                this.uploadSmallOperationQueue.add(fileUploadOperation);
                return;
            } else {
                this.currentUploadSmallOperationsCount = i11 + 1;
                fileUploadOperation.start();
                return;
            }
        }
        int i12 = this.currentUploadOperationsCount;
        if (i12 >= 1) {
            this.uploadOperationQueue.add(fileUploadOperation);
        } else {
            this.currentUploadOperationsCount = i12 + 1;
            fileUploadOperation.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
    
        if (r4 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0219, code lost:
    
        if (r4 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021b, code lost:
    
        r2 = r4;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021e, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private FileLoadOperation loadFileInternal(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, FileLoadOperationStream fileLoadOperationStream, long j10, boolean z10, int i11) {
        String str2;
        String str3;
        String attachFileName;
        int i12;
        ?? r02;
        int i13;
        long j11;
        int i14;
        int i15;
        long j12;
        int i16;
        int i17;
        FileLoadOperation fileLoadOperation;
        boolean z11;
        FileLoadOperation fileLoadOperation2;
        long j13;
        int i18;
        File directory;
        String str4;
        String str5;
        File file;
        boolean z12;
        File directory2;
        boolean z13;
        FileStreamLoadOperation fileStreamLoadOperation;
        FileLoadOperation fileLoadOperation3;
        boolean z14;
        boolean z15;
        1 r52 = null;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (secureDocument != null) {
                attachFileName = getAttachFileName(secureDocument);
            } else if (document != null) {
                attachFileName = getAttachFileName(document);
            } else {
                if (webFile == null) {
                    str3 = null;
                    if (str3 != null || str3.contains("-2147483648")) {
                        return null;
                    }
                    if (str3.startsWith("0_0")) {
                        FileLog.e(new RuntimeException("cant get hash from " + document));
                        return null;
                    }
                    if (i11 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                        this.loadOperationPathsUI.put(str3, new LoadOperationUIObject(r52));
                    }
                    if (document != null && (obj instanceof MessageObject)) {
                        MessageObject messageObject = (MessageObject) obj;
                        if (messageObject.putInDownloadsStore && !messageObject.isAnyKindOfSticker()) {
                            getDownloadController().startDownloadFile(document, messageObject);
                        }
                    }
                    FileLoadOperation fileLoadOperation4 = this.loadOperationPaths.get(str3);
                    int priorityValue = getPriorityValue(i10);
                    if (fileLoadOperation4 != null) {
                        if (i11 != 10 && fileLoadOperation4.isPreloadVideoOperation()) {
                            fileLoadOperation4.setIsPreloadVideoOperation(false);
                        }
                        fileLoadOperation4.setForceRequest(priorityValue > 0);
                        fileLoadOperation4.setStream(fileLoadOperationStream, z10, j10);
                        if (fileLoadOperation4.getPriority() != priorityValue) {
                            fileLoadOperation4.setPriority(priorityValue);
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        fileLoadOperation4.getQueue().add(fileLoadOperation4);
                        fileLoadOperation4.updateProgress();
                        if (z15) {
                            fileLoadOperation4.getQueue().checkLoadingOperations();
                        }
                        return fileLoadOperation4;
                    }
                    File directory3 = getDirectory(4);
                    if (secureDocument == null) {
                        if (tL_fileLocationToBeDeprecated == null) {
                            i12 = priorityValue;
                            r02 = 1;
                            r02 = 1;
                            r02 = 1;
                            r02 = 1;
                            r02 = 1;
                            z11 = true;
                            z14 = true;
                            i13 = 0;
                            FileLoadOperation fileLoadOperation5 = fileLoadOperation4;
                            if (document != null) {
                                FileLoadOperation fileLoadOperation6 = new FileLoadOperation(document, obj);
                                if (MessageObject.isVoiceDocument(document)) {
                                    j12 = 0;
                                    i16 = 0;
                                    i17 = 1;
                                } else if (MessageObject.isVideoDocument(document)) {
                                    j12 = document.id;
                                    i16 = document.dc_id;
                                    i17 = 2;
                                } else {
                                    j12 = document.id;
                                    i16 = document.dc_id;
                                    i17 = 3;
                                }
                                if (MessageObject.isRoundVideoDocument(document)) {
                                    i15 = i17;
                                    j11 = 0;
                                    i14 = 0;
                                    fileLoadOperation2 = fileLoadOperation6;
                                } else {
                                    i14 = i16;
                                    i15 = i17;
                                    j11 = j12;
                                    fileLoadOperation2 = fileLoadOperation6;
                                }
                            } else {
                                if (webFile != null) {
                                    FileLoadOperation fileLoadOperation7 = new FileLoadOperation(this.currentAccount, webFile);
                                    fileLoadOperation5 = fileLoadOperation7;
                                    if (webFile.location == null) {
                                        if (MessageObject.isVoiceWebDocument(webFile)) {
                                            j11 = 0;
                                            i14 = 0;
                                            i15 = 1;
                                            fileLoadOperation2 = fileLoadOperation7;
                                        } else if (MessageObject.isVideoWebDocument(webFile)) {
                                            j11 = 0;
                                            i14 = 0;
                                            i15 = 2;
                                            fileLoadOperation2 = fileLoadOperation7;
                                        } else if (MessageObject.isImageWebDocument(webFile)) {
                                            j11 = 0;
                                            i14 = 0;
                                            fileLoadOperation = fileLoadOperation7;
                                        } else {
                                            j11 = 0;
                                            fileLoadOperation3 = fileLoadOperation7;
                                        }
                                    }
                                }
                                j11 = 0;
                                i14 = 0;
                                i15 = 4;
                                fileLoadOperation2 = fileLoadOperation5;
                            }
                            int clamp = Utilities.clamp(fileLoadOperation2.getDatacenterId() - r02, 4, i13);
                            boolean z16 = obj instanceof TL_stories.StoryItem;
                            FileLoaderPriorityQueue fileLoaderPriorityQueue = (fileLoadOperation2.totalBytesCount <= 20971520 || z16) ? this.largeFilesQueue[clamp] : this.smallFilesQueue[clamp];
                            if (i11 == 0 && i11 != 10 && !z16) {
                                if (i11 == 2) {
                                    fileLoadOperation2.setEncryptFile(r02);
                                }
                                str4 = str3;
                                directory = directory3;
                                j13 = j11;
                                i18 = i15;
                            } else if (j11 != 0) {
                                String path = getFileDatabase().getPath(j11, i14, i15, true);
                                j13 = j11;
                                int i19 = i14;
                                i18 = i15;
                                if (path != null) {
                                    File file2 = new File(path);
                                    if (file2.exists()) {
                                        str5 = file2.getName();
                                        file = file2.getParentFile();
                                        z12 = true;
                                        if (!z12) {
                                            file = getDirectory(i18);
                                            if (z16) {
                                                directory2 = getDirectory(6);
                                            } else if ((i18 == 0 || i18 == 2) && canSaveToPublicStorage(obj)) {
                                                directory2 = i18 == 0 ? getDirectory(100) : getDirectory(101);
                                            } else {
                                                if (TextUtils.isEmpty(getDocumentFileName(document)) || !canSaveAsFile(obj)) {
                                                    str5 = str3;
                                                } else {
                                                    String documentFileName = getDocumentFileName(document);
                                                    File directory4 = getDirectory(5);
                                                    if (directory4 != null) {
                                                        file = directory4;
                                                        str5 = documentFileName;
                                                        z13 = true;
                                                        if (z13) {
                                                            fileLoadOperation2.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                                                        }
                                                    } else {
                                                        str5 = documentFileName;
                                                    }
                                                }
                                                z13 = false;
                                                if (z13) {
                                                }
                                            }
                                            str5 = str3;
                                            if (z13) {
                                            }
                                        }
                                        directory = file;
                                        str4 = str5;
                                    }
                                }
                                str5 = str3;
                                file = directory3;
                                z12 = false;
                                if (!z12) {
                                }
                                directory = file;
                                str4 = str5;
                            } else {
                                j13 = j11;
                                i18 = i15;
                                directory = getDirectory(i18);
                                str4 = str3;
                            }
                            String str6 = str3;
                            FileLoadOperation fileLoadOperation8 = fileLoadOperation2;
                            fileLoadOperation8.setPaths(this.currentAccount, str6, fileLoaderPriorityQueue, directory, directory3, str4);
                            if (i11 == 10) {
                                fileLoadOperation8.setIsPreloadVideoOperation(r02);
                            }
                            fileLoadOperation8.setDelegate(new 2(obj, document, str6, i18));
                            this.loadOperationPaths.put(str6, fileLoadOperation8);
                            int i20 = i12;
                            fileLoadOperation8.setPriority(i20);
                            fileStreamLoadOperation = fileLoadOperationStream == null ? FileStreamLoadOperation.allStreams.get(Long.valueOf(j13)) : fileLoadOperationStream;
                            if (fileStreamLoadOperation != null) {
                                fileLoadOperation8.setStream(fileStreamLoadOperation, z10, j10);
                            }
                            fileLoaderPriorityQueue.add(fileLoadOperation8);
                            fileLoaderPriorityQueue.checkLoadingOperations(!fileLoadOperation8.isStory && i20 >= 1048576);
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder v = a4.a.v("create load operation fileName=", str6, " documentName=");
                                v.append(getDocumentFileName(document));
                                v.append(" size=");
                                v.append(AndroidUtilities.formatFileSize(fileLoadOperation8.totalBytesCount));
                                v.append(" position in queue ");
                                v.append(fileLoadOperation8.getPositionInQueue());
                                v.append(" account=");
                                hc.b.w(v, this.currentAccount, " cacheType=", i11, " priority=");
                                v.append(fileLoadOperation8.getPriority());
                                v.append(" stream=");
                                v.append(fileStreamLoadOperation);
                                FileLog.d(v.toString());
                            }
                            return fileLoadOperation8;
                        }
                        long j14 = tL_fileLocationToBeDeprecated.volume_id;
                        i12 = priorityValue;
                        z11 = true;
                        i13 = 0;
                        i14 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
                        fileLoadOperation = new FileLoadOperation(imageLocation, obj, str2, j3);
                        j11 = j14;
                        i15 = 0;
                        r02 = z11;
                        fileLoadOperation2 = fileLoadOperation;
                        int clamp2 = Utilities.clamp(fileLoadOperation2.getDatacenterId() - r02, 4, i13);
                        boolean z162 = obj instanceof TL_stories.StoryItem;
                        FileLoaderPriorityQueue fileLoaderPriorityQueue2 = (fileLoadOperation2.totalBytesCount <= 20971520 || z162) ? this.largeFilesQueue[clamp2] : this.smallFilesQueue[clamp2];
                        if (i11 == 0) {
                        }
                        if (j11 != 0) {
                        }
                        String str62 = str3;
                        FileLoadOperation fileLoadOperation82 = fileLoadOperation2;
                        fileLoadOperation82.setPaths(this.currentAccount, str62, fileLoaderPriorityQueue2, directory, directory3, str4);
                        if (i11 == 10) {
                        }
                        fileLoadOperation82.setDelegate(new 2(obj, document, str62, i18));
                        this.loadOperationPaths.put(str62, fileLoadOperation82);
                        int i202 = i12;
                        fileLoadOperation82.setPriority(i202);
                        if (fileLoadOperationStream == null) {
                        }
                        if (fileStreamLoadOperation != null) {
                        }
                        fileLoaderPriorityQueue2.add(fileLoadOperation82);
                        fileLoaderPriorityQueue2.checkLoadingOperations(!fileLoadOperation82.isStory && i202 >= 1048576);
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        return fileLoadOperation82;
                    }
                    i12 = priorityValue;
                    j11 = 0;
                    z14 = true;
                    i13 = 0;
                    fileLoadOperation3 = new FileLoadOperation(secureDocument);
                    i14 = 0;
                    i15 = 3;
                    r02 = z14;
                    fileLoadOperation2 = fileLoadOperation3;
                    int clamp22 = Utilities.clamp(fileLoadOperation2.getDatacenterId() - r02, 4, i13);
                    boolean z1622 = obj instanceof TL_stories.StoryItem;
                    FileLoaderPriorityQueue fileLoaderPriorityQueue22 = (fileLoadOperation2.totalBytesCount <= 20971520 || z1622) ? this.largeFilesQueue[clamp22] : this.smallFilesQueue[clamp22];
                    if (i11 == 0) {
                    }
                    if (j11 != 0) {
                    }
                    String str622 = str3;
                    FileLoadOperation fileLoadOperation822 = fileLoadOperation2;
                    fileLoadOperation822.setPaths(this.currentAccount, str622, fileLoaderPriorityQueue22, directory, directory3, str4);
                    if (i11 == 10) {
                    }
                    fileLoadOperation822.setDelegate(new 2(obj, document, str622, i18));
                    this.loadOperationPaths.put(str622, fileLoadOperation822);
                    int i2022 = i12;
                    fileLoadOperation822.setPriority(i2022);
                    if (fileLoadOperationStream == null) {
                    }
                    if (fileStreamLoadOperation != null) {
                    }
                    fileLoaderPriorityQueue22.add(fileLoadOperation822);
                    fileLoaderPriorityQueue22.checkLoadingOperations(!fileLoadOperation822.isStory && i2022 >= 1048576);
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    return fileLoadOperation822;
                }
                attachFileName = getAttachFileName(webFile);
            }
        }
        str3 = attachFileName;
        if (str3 != null) {
        }
        return null;
    }

    public static byte[] longToBytes(long j3) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j3);
        return allocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeLoadingVideoInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$removeLoadingVideo$1(TLRPC.Document document, boolean z10) {
        String attachFileName = getAttachFileName(document);
        StringBuilder u10 = a4.a.u(attachFileName);
        u10.append(z10 ? "p" : "");
        if (this.loadingVideos.remove(u10.toString()) != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public static void setMediaDirs(SparseArray<File> sparseArray) {
        mediaDirs = sparseArray;
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return;
        }
        String fileName = fileLoadOperation.getFileName();
        LoadOperationUIObject remove = this.loadOperationPathsUI.remove(fileName);
        Runnable runnable = remove != null ? remove.loadInternalRunnable : null;
        boolean z10 = remove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new a3(this, fileName, 1));
        if (z10) {
            AndroidUtilities.runOnUIThread(new y2(this, 2));
        }
    }

    public void cancelFileUpload(String str, boolean z10) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new s6(this, z10, str, 1));
    }

    public void cancelLoadAllFiles() {
        for (String str : this.loadOperationPathsUI.keySet()) {
            LoadOperationUIObject loadOperationUIObject = this.loadOperationPathsUI.get(str);
            Runnable runnable = loadOperationUIObject != null ? loadOperationUIObject.loadInternalRunnable : null;
            if (runnable != null) {
                fileLoaderQueue.cancelRunnable(runnable);
            }
            fileLoaderQueue.postRunnable(new a3(this, str, 2));
        }
    }

    public void cancelLoadFile(TLRPC.Document document) {
        cancelLoadFile(document, false);
    }

    public void cancelLoadFiles(ArrayList<String> arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cancelLoadFile(null, null, null, null, null, arrayList.get(i10), true);
        }
    }

    public void changePriority(int i10, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, String str2) {
        if (fileLocation == null && document == null && webFile == null && secureDocument == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = getAttachFileName(fileLocation, str);
        } else if (document != null) {
            str2 = getAttachFileName(document);
        } else if (secureDocument != null) {
            str2 = getAttachFileName(secureDocument);
        } else if (webFile != null) {
            str2 = getAttachFileName(webFile);
        }
        fileLoaderQueue.postRunnable(new v4(this, str2, i10, 3));
    }

    public void checkCurrentDownloadsFiles() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().recentDownloadingFiles);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((MessageObject) arrayList2.get(i10)).checkMediaExistance();
            if (((MessageObject) arrayList2.get(i10)).mediaExists) {
                arrayList.add((MessageObject) arrayList2.get(i10));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f2(6, this, arrayList));
    }

    public boolean checkLoadCaughtPremiumFloodWait(String str) {
        FileLoadOperation fileLoadOperation;
        if (str == null || (fileLoadOperation = this.loadOperationPaths.get(str)) == null || !fileLoadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileLoadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        getFileDatabase().checkMediaExistance(arrayList);
    }

    public boolean checkUploadCaughtPremiumFloodWait(String str) {
        FileUploadOperation fileUploadOperation;
        if (str == null || (fileUploadOperation = this.uploadOperationPaths.get(str)) == null || !fileUploadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileUploadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public void checkUploadNewDataAvailable(String str, boolean z10, long j3, long j10) {
        checkUploadNewDataAvailable(str, z10, j3, j10, null);
    }

    public void clearFilePaths() {
        this.filePathDatabase.clear();
    }

    public void clearRecentDownloadedFiles() {
        getDownloadController().clearRecentDownloadedFiles();
    }

    public void deleteFiles(ArrayList<File> arrayList, int i10) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        fileLoaderQueue.postRunnable(new u6(arrayList, i10, 5));
    }

    public void dumpFilesQueue() {
        if (BuildVars.LOGS_ENABLED) {
            fileLoaderQueue.cancelRunnable(this.dumpFilesQueueRunnable);
            fileLoaderQueue.postRunnable(this.dumpFilesQueueRunnable, 10000L);
        }
    }

    public FileLoadOperation findLoadOperationByRequestToken(int i10) {
        for (FileLoadOperation fileLoadOperation : this.loadOperationPaths.values()) {
            if (fileLoadOperation != null && fileLoadOperation.uiRequestTokens.contains(Integer.valueOf(i10))) {
                return fileLoadOperation;
            }
        }
        return null;
    }

    public FileUploadOperation findUploadOperationByRequestToken(int i10) {
        for (FileUploadOperation fileUploadOperation : this.uploadOperationPaths.values()) {
            if (fileUploadOperation != null && fileUploadOperation.uiRequestTokens.contains(Integer.valueOf(i10))) {
                return fileUploadOperation;
            }
        }
        return null;
    }

    public float getBufferedProgressFromPosition(float f7, String str) {
        FileLoadOperation fileLoadOperation;
        if (TextUtils.isEmpty(str) || (fileLoadOperation = this.loadOperationPaths.get(str)) == null) {
            return 0.0f;
        }
        return fileLoadOperation.getDownloadedLengthFromOffset(f7);
    }

    public void getCurrentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().downloadingFiles);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).isDownloadingFile = true;
        }
    }

    public FilePathDatabase getFileDatabase() {
        return this.filePathDatabase;
    }

    public DispatchQueue getFileLoaderQueue() {
        return fileLoaderQueue;
    }

    public int getFileReference(Object obj) {
        int i10 = this.lastReferenceId;
        this.lastReferenceId = i10 + 1;
        this.parentObjectReferences.put(Integer.valueOf(i10), obj);
        return i10;
    }

    public File getLocalFile(ImageLocation imageLocation) {
        String attachFileName;
        if (imageLocation == null) {
            return null;
        }
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
        if (tL_fileLocationToBeDeprecated != null) {
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, null);
        } else {
            TLRPC.Document document = imageLocation.document;
            if (document != null) {
                attachFileName = getAttachFileName(document);
            } else {
                WebFile webFile = imageLocation.webFile;
                attachFileName = webFile != null ? getAttachFileName(webFile) : null;
            }
        }
        if (attachFileName == null) {
            return null;
        }
        File file = new File(getDirectory(4), attachFileName);
        if (file.exists()) {
            return file;
        }
        File file2 = new File(getDirectory(0), attachFileName);
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(getDirectory(2), attachFileName);
        if (file3.exists()) {
            return file3;
        }
        File file4 = new File(getDirectory(5), attachFileName);
        if (file4.exists()) {
            return file4;
        }
        return null;
    }

    public Object getParentObject(int i10) {
        return this.parentObjectReferences.get(Integer.valueOf(i10));
    }

    public File getPathToAttach(TLObject tLObject) {
        return getPathToAttach(tLObject, null, false);
    }

    public File getPathToMessage(TLRPC.Message message) {
        return getPathToMessage(message, true);
    }

    public void getRecentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().recentDownloadingFiles);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).isDownloadingFile = true;
        }
    }

    public boolean isLoadingFile(String str) {
        return str != null && this.loadOperationPathsUI.containsKey(str);
    }

    public boolean isLoadingVideo(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return false;
        }
        HashMap<String, Boolean> hashMap = this.loadingVideos;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getAttachFileName(document));
        sb2.append(z10 ? "p" : "");
        return hashMap.containsKey(sb2.toString());
    }

    public boolean isLoadingVideoAny(TLRPC.Document document) {
        return isLoadingVideo(document, false) || isLoadingVideo(document, true);
    }

    public void loadFile(ImageLocation imageLocation, Object obj, String str, int i10, int i11) {
        if (imageLocation == null) {
            return;
        }
        loadFile(imageLocation.document, imageLocation.secureDocument, imageLocation.webFile, imageLocation.location, imageLocation, obj, str, imageLocation.getSize(), i10, (i11 != 0 || (!imageLocation.isEncrypted() && (imageLocation.photoSize == null || imageLocation.getSize() != 0))) ? i11 : 1);
    }

    public FileLoadOperation loadStreamFile(FileLoadOperationStream fileLoadOperationStream, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j3, boolean z10, int i10) {
        return loadStreamFile(fileLoadOperationStream, document, imageLocation, obj, j3, z10, i10, document == null ? 1 : 0);
    }

    public void onNetworkChanged(boolean z10) {
        fileLoaderQueue.postRunnable(new ai.j(8, this, z10));
    }

    public void removeLoadingVideo(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            AndroidUtilities.runOnUIThread(new z2(this, document, z10, 1));
        } else {
            lambda$removeLoadingVideo$1(document, z10);
        }
    }

    public void setDelegate(FileLoaderDelegate fileLoaderDelegate) {
        this.delegate = fileLoaderDelegate;
    }

    public void setForceStreamLoadingFile(TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new f0(this, fileLocation, str, 22));
    }

    public void setLoadingVideo(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            AndroidUtilities.runOnUIThread(new z2(this, document, z10, 0));
        } else {
            lambda$setLoadingVideo$0(document, z10);
        }
    }

    public void setLoadingVideoForPlayer(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return;
        }
        String attachFileName = getAttachFileName(document);
        HashMap<String, Boolean> hashMap = this.loadingVideos;
        StringBuilder u10 = a4.a.u(attachFileName);
        u10.append(z10 ? "" : "p");
        if (hashMap.containsKey(u10.toString())) {
            HashMap<String, Boolean> hashMap2 = this.loadingVideos;
            StringBuilder u11 = a4.a.u(attachFileName);
            u11.append(z10 ? "p" : "");
            hashMap2.put(u11.toString(), Boolean.TRUE);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    /* renamed from: setLoadingVideoInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$setLoadingVideo$0(TLRPC.Document document, boolean z10) {
        String attachFileName = getAttachFileName(document);
        StringBuilder u10 = a4.a.u(attachFileName);
        u10.append(z10 ? "p" : "");
        this.loadingVideos.put(u10.toString(), Boolean.TRUE);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
    }

    public void setLocalPathTo(TLObject tLObject, String str) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            this.filePathDatabase.putPath(document.id, document.dc_id, document.key != null ? 4 : MessageObject.isVoiceDocument(document) ? 1 : MessageObject.isVideoDocument(document) ? 2 : 3, 1, str);
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                return;
            }
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.filePathDatabase.putPath(fileLocation.volume_id, fileLocation.dc_id + (fileLocation.local_id << 16), (fileLocation == null || fileLocation.key != null || (fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0) ? 4 : 0, 1, str);
        }
    }

    public void uploadFile(String str, boolean z10, boolean z11, int i10) {
        uploadFile(str, z10, z11, 0L, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue, long j3) {
        fileLoaderQueue.postRunnable(new f0(this, fileLoaderPriorityQueue, fileLoadOperation, 23), j3);
    }

    public static boolean copyFile(InputStream inputStream, File file, int i10) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i11 += read;
            if (i10 > 0 && i11 >= i10) {
                break;
            }
        }
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
        return true;
    }

    public static String getAttachFileName(TLObject tLObject, String str) {
        return getAttachFileName(tLObject, null, str);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10, boolean z10) {
        return getClosestPhotoSizeWithSize(arrayList, i10, z10, null, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10, boolean z10) {
        return getClosestVideoSizeWithSize(arrayList, i10, z10, false);
    }

    public void cancelLoadFile(TLRPC.Document document, boolean z10) {
        cancelLoadFile(document, null, null, null, null, null, z10);
    }

    public void checkUploadNewDataAvailable(String str, boolean z10, long j3, long j10, Float f7) {
        fileLoaderQueue.postRunnable(new f3(this, z10, str, j3, j10, f7));
    }

    public File getPathToAttach(TLObject tLObject, boolean z10) {
        return getPathToAttach(tLObject, null, z10);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z10) {
        return getPathToMessage(message, false, z10);
    }

    public FileLoadOperation loadStreamFile(final FileLoadOperationStream fileLoadOperationStream, final TLRPC.Document document, final ImageLocation imageLocation, final Object obj, final long j3, final boolean z10, final int i10, final int i11) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final FileLoadOperation[] fileLoadOperationArr = new FileLoadOperation[1];
        fileLoaderQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.c3
            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.lambda$loadStreamFile$14(fileLoadOperationArr, document, imageLocation, obj, i10, fileLoadOperationStream, j3, z10, i11, countDownLatch);
            }
        });
        awaitFileLoadOperation(countDownLatch, true);
        return fileLoadOperationArr[0];
    }

    public void uploadFile(final String str, final boolean z10, final boolean z11, final long j3, final int i10, final boolean z12) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.e3
            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.lambda$uploadFile$5(z10, str, j3, i10, z12, z11);
            }
        });
    }

    public static String getAttachFileName(TLObject tLObject, String str, String str2) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String documentFileName = getDocumentFileName(document);
            int lastIndexOf = documentFileName.lastIndexOf(46);
            String substring = lastIndexOf != -1 ? documentFileName.substring(lastIndexOf) : "";
            if (substring.length() <= 1) {
                substring = getExtensionByMimeType(document.mime_type);
            }
            if (substring.length() > 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                return a4.a.r(sb2, document.id, substring);
            }
            return document.dc_id + "_" + document.id;
        }
        if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(secureDocument.secureFile.dc_id);
            sb3.append("_");
            return a4.a.r(sb3, secureDocument.secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile.dc_id);
            sb4.append("_");
            return a4.a.r(sb4, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof WebFile) {
            WebFile webFile = (WebFile) tLObject;
            return Utilities.MD5(webFile.url) + "." + ImageLoader.getHttpUrlExtension(webFile.url, getMimeTypePart(webFile.mime_type));
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(photoSize.location.volume_id);
            sb5.append("_");
            sb5.append(photoSize.location.local_id);
            sb5.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb5.append(str2);
            return sb5.toString();
        }
        if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(tL_videoSize.location.volume_id);
            sb6.append("_");
            sb6.append(tL_videoSize.location.local_id);
            sb6.append(".");
            if (str2 == null) {
                str2 = "mp4";
            }
            sb6.append(str2);
            return sb6.toString();
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                return "";
            }
            TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(fileLocation3.volume_id);
            sb7.append("_");
            sb7.append(fileLocation3.local_id);
            sb7.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb7.append(str2);
            return sb7.toString();
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            if (str == null) {
                str = "s";
            }
            TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
            if (userProfilePhoto.photo_small != null) {
                if ("s".equals(str)) {
                    return getAttachFileName(userProfilePhoto.photo_small, str2);
                }
                return getAttachFileName(userProfilePhoto.photo_big, str2);
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(userProfilePhoto.photo_id);
            sb8.append("_");
            sb8.append(str);
            sb8.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb8.append(str2);
            return sb8.toString();
        }
        if (!(tLObject instanceof TLRPC.ChatPhoto)) {
            return "";
        }
        TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
        if (chatPhoto.photo_small != null) {
            if ("s".equals(str)) {
                return getAttachFileName(chatPhoto.photo_small, str2);
            }
            return getAttachFileName(chatPhoto.photo_big, str2);
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(chatPhoto.photo_id);
        sb9.append("_");
        sb9.append(str);
        sb9.append(".");
        if (str2 == null) {
            str2 = "jpg";
        }
        sb9.append(str2);
        return sb9.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0061, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10, boolean z10, TLRPC.PhotoSize photoSize, boolean z11) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i12);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z11 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z10) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i10 > i11) {
                                    if (i11 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i11 = max;
                    } else {
                        max = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i10) {
                                    if (i11 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i11 = max;
                    }
                }
            }
        }
        return photoSize2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r4.dc_id != Integer.MIN_VALUE) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if (r4.dc_id != Integer.MIN_VALUE) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10, boolean z10, boolean z11) {
        int max;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.VideoSize videoSize2 = arrayList.get(i12);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    if (z10) {
                        max = Math.min(videoSize2.h, videoSize2.w);
                        if (videoSize != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation = videoSize.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (i10 > i11) {
                                if (i11 >= max) {
                                }
                            }
                        }
                        videoSize = videoSize2;
                        i11 = max;
                    } else {
                        max = Math.max(videoSize2.w, videoSize2.h);
                        if (videoSize != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation2 = videoSize.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (max <= i10) {
                                if (i11 >= max) {
                                }
                            }
                        }
                        videoSize = videoSize2;
                        i11 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public void cancelLoadFile(SecureDocument secureDocument) {
        cancelLoadFile(null, secureDocument, null, null, null, null, false);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z10) {
        return getPathToAttach(tLObject, null, str, z10, true);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z10, boolean z11) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize3;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (closestPhotoSizeWithSize3 = getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize3, null, z10, z11);
                }
            }
        } else {
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getPathToAttach(MessageObject.getMedia(message).document, null, z10 || MessageObject.getMedia(message).ttl_seconds != 0, z11);
            }
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize2, null, z10 || MessageObject.getMedia(message).ttl_seconds != 0, z11);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getPathToAttach(MessageObject.getMedia(message).webpage.document, null, z10, z11);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getPathToAttach(closestPhotoSizeWithSize, null, z10, z11);
                    }
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return getPathToAttach(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).photo, null, true, z11);
            }
        }
        return new File("");
    }

    public void loadFile(SecureDocument secureDocument, int i10) {
        if (secureDocument == null) {
            return;
        }
        loadFile(null, secureDocument, null, null, null, null, null, 0L, i10, 1);
    }

    public void uploadFile(final String str, final Utilities.Callback<TLRPC.InputFile> callback) {
        final f2 f2Var = new f2(5, this, r0);
        NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.messenger.b3
            @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                FileLoader.lambda$uploadFile$20(str, callback, f2Var, i10, i11, objArr);
            }
        }};
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
        uploadFile(str, false, false, 67108864);
    }

    public void cancelLoadFile(WebFile webFile) {
        cancelLoadFile(null, null, webFile, null, null, null, false);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z10, boolean z11) {
        return getPathToAttach(tLObject, null, str, z10, z11);
    }

    public void loadFile(TLRPC.Document document, Object obj, int i10, int i11) {
        if (document == null) {
            return;
        }
        loadFile(document, null, null, null, null, obj, null, 0L, i10, (i11 != 0 || document.key == null) ? i11 : 1);
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize) {
        cancelLoadFile(photoSize, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File getPathToAttach(TLObject tLObject, String str, String str2, boolean z10, boolean z11) {
        File directory;
        long j3;
        int i10;
        int i11;
        File directory2;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        String path;
        int i16 = 4;
        if (z10) {
            directory = getDirectory(4);
        } else {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                if (document.key == null) {
                    if (MessageObject.isVoiceDocument(document)) {
                        i16 = 1;
                    } else {
                        i16 = MessageObject.isVideoDocument(document) ? 2 : 3;
                    }
                }
                j10 = document.id;
                i14 = document.dc_id;
                directory2 = getDirectory(i16);
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return getPathToAttach(getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize(true)), str2, false, z11);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        directory2 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                            directory2 = getDirectory(0);
                        } else {
                            directory2 = getDirectory(4);
                            TLRPC.FileLocation fileLocation2 = photoSize.location;
                            j10 = fileLocation2.volume_id;
                            i12 = fileLocation2.dc_id;
                            i13 = fileLocation2.local_id;
                        }
                    }
                    i16 = 0;
                    TLRPC.FileLocation fileLocation22 = photoSize.location;
                    j10 = fileLocation22.volume_id;
                    i12 = fileLocation22.dc_id;
                    i13 = fileLocation22.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 != null && fileLocation3.key == null && ((fileLocation3.volume_id != -2147483648L || fileLocation3.local_id >= 0) && tL_videoSize.size >= 0)) {
                        directory2 = getDirectory(0);
                        i16 = 0;
                    } else {
                        directory2 = getDirectory(4);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j10 = fileLocation4.volume_id;
                    i12 = fileLocation4.dc_id;
                    i13 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j3 = fileLocation5.volume_id;
                        if (j3 != -2147483648L || fileLocation5.local_id >= 0) {
                            i10 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            directory = getDirectory(0);
                            i11 = i10;
                            i15 = 0;
                            if (directory == null) {
                                return new File("");
                            }
                            if (j3 != 0 && (path = getInstance(UserConfig.selectedAccount).getFileDatabase().getPath(j3, i11, i15, z11)) != null) {
                                return new File(path);
                            }
                            return new File(directory, getAttachFileName(tLObject, str2));
                        }
                    }
                    directory = getDirectory(4);
                    j3 = 0;
                    i10 = 0;
                    i11 = i10;
                    i15 = 0;
                    if (directory == null) {
                    }
                } else if (!(tLObject instanceof TLRPC.UserProfilePhoto) && !(tLObject instanceof TLRPC.ChatPhoto)) {
                    if (tLObject instanceof WebFile) {
                        WebFile webFile = (WebFile) tLObject;
                        if (webFile.mime_type.startsWith("image/")) {
                            directory = getDirectory(0);
                        } else if (webFile.mime_type.startsWith("audio/")) {
                            directory = getDirectory(1);
                        } else if (webFile.mime_type.startsWith("video/")) {
                            directory = getDirectory(2);
                        } else {
                            directory = getDirectory(3);
                        }
                    } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof SecureDocument)) {
                        directory = getDirectory(4);
                    } else {
                        j3 = 0;
                        directory = null;
                        i11 = 0;
                        i15 = 0;
                        if (directory == null) {
                        }
                    }
                } else {
                    if (str == null) {
                        str = "s";
                    }
                    if ("s".equals(str)) {
                        directory = getDirectory(4);
                    } else {
                        directory = getDirectory(0);
                    }
                }
                i14 = (i13 << 16) + i12;
            }
            i11 = i14;
            directory = directory2;
            i15 = i16;
            j3 = j10;
            if (directory == null) {
            }
        }
        j3 = 0;
        i11 = 0;
        i15 = 0;
        if (directory == null) {
        }
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize, boolean z10) {
        cancelLoadFile(null, null, null, photoSize.location, null, null, z10);
    }

    public void loadFile(WebFile webFile, int i10, int i11) {
        loadFile(null, null, webFile, null, null, null, null, 0L, i10, i11);
    }

    private void loadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        String str2;
        String str3;
        String attachFileName;
        d3 d3Var;
        1 r13 = null;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (document != null) {
                attachFileName = getAttachFileName(document);
            } else if (webFile != null) {
                attachFileName = getAttachFileName(webFile);
            } else {
                str3 = null;
                d3Var = new d3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j3, i10, i11);
                if (i11 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                    LoadOperationUIObject loadOperationUIObject = new LoadOperationUIObject(r13);
                    loadOperationUIObject.loadInternalRunnable = d3Var;
                    this.loadOperationPathsUI.put(str3, loadOperationUIObject);
                }
                fileLoaderQueue.postRunnable(d3Var);
            }
        }
        str3 = attachFileName;
        d3Var = new d3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j3, i10, i11);
        if (i11 != 10) {
            LoadOperationUIObject loadOperationUIObject2 = new LoadOperationUIObject(r13);
            loadOperationUIObject2.loadInternalRunnable = d3Var;
            this.loadOperationPathsUI.put(str3, loadOperationUIObject2);
        }
        fileLoaderQueue.postRunnable(d3Var);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str) {
        cancelLoadFile(fileLocation, str, false);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str, boolean z10) {
        cancelLoadFile(null, null, null, fileLocation, str, null, z10);
    }

    public void cancelLoadFile(String str) {
        cancelLoadFile(null, null, null, null, null, str, true);
    }

    private void cancelLoadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, String str2, boolean z10) {
        if (fileLocation == null && document == null && webFile == null && secureDocument == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = getAttachFileName(fileLocation, str);
        } else if (document != null) {
            str2 = getAttachFileName(document);
        } else if (secureDocument != null) {
            str2 = getAttachFileName(secureDocument);
        } else if (webFile != null) {
            str2 = getAttachFileName(webFile);
        }
        LoadOperationUIObject remove = this.loadOperationPathsUI.remove(str2);
        Runnable runnable = remove != null ? remove.loadInternalRunnable : null;
        boolean z11 = remove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new a3(this, str2, 0));
        if (!z11 || document == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new y2(this, 1));
    }

    public static boolean isSamePhoto(TLRPC.FileLocation fileLocation, TLRPC.Photo photo) {
        if (fileLocation != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.FileLocation fileLocation2 = photo.sizes.get(i10).location;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id) {
                    return true;
                }
            }
            if ((-fileLocation.volume_id) == photo.id) {
                return true;
            }
        }
        return false;
    }
}

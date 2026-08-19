package org.telegram.messenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Storage.CacheModel;

/* loaded from: classes3.dex */
public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static ImmutableByteArrayOutputStream filesQueueByteBuffer = null;
    private static int globalRequestPointer = 0;
    private static final int preloadMaxBytes = 2097152;
    private static final int stateCanceled = 4;
    private static final int stateCancelling = 5;
    private static final int stateDownloading = 1;
    private static final int stateFailed = 2;
    private static final int stateFinished = 3;
    private static final int stateIdle = 0;
    private final boolean FULL_LOGS;
    private boolean allowDisordererFileSave;
    private int bigFileSizeFrom;
    private long bytesCountPadding;
    private File cacheFileFinal;
    private boolean cacheFileFinalReady;
    private File cacheFileGzipTemp;
    private File cacheFileParts;
    private File cacheFilePreload;
    private File cacheFileTemp;
    private File cacheIvTemp;
    private final Runnable cancelAfterNoStreamListeners;
    private ArrayList<RequestInfo> cancelledRequestInfos;
    public volatile boolean caughtPremiumFloodWait;
    private byte[] cdnCheckBytes;
    private int cdnChunkCheckSize;
    private int cdnDatacenterId;
    private HashMap<Long, TLRPC.TL_fileHash> cdnHashes;
    private byte[] cdnIv;
    private byte[] cdnKey;
    private byte[] cdnToken;
    private volatile boolean closeFilePartsStreamOnWriteEnd;
    public int currentAccount;
    private int currentDownloadChunkSize;
    private int currentMaxDownloadRequests;
    private int currentType;
    private int datacenterId;
    private ArrayList<RequestInfo> delayedRequestInfos;
    private FileLoadOperationDelegate delegate;
    private long documentId;
    private int downloadChunkSize;
    private int downloadChunkSizeAnimation;
    private int downloadChunkSizeBig;
    private long downloadedBytes;
    private boolean encryptFile;
    private byte[] encryptIv;
    private byte[] encryptKey;
    private String ext;
    private FilePathDatabase.FileMeta fileMetadata;
    private String fileName;
    private RandomAccessFile fileOutputStream;
    private RandomAccessFile filePartsStream;
    private RandomAccessFile fileReadStream;
    private Runnable fileWriteRunnable;
    private RandomAccessFile fiv;
    private boolean forceSmallChunk;
    private long foundMoovSize;
    private int initialDatacenterId;
    private boolean isCdn;
    private boolean isForceRequest;
    private boolean isPreloadVideoOperation;
    public boolean isStory;
    private boolean isStream;
    private byte[] iv;
    private byte[] key;
    protected long lastProgressUpdateTime;
    protected TLRPC.InputFileLocation location;
    private int maxCdnParts;
    private int maxDownloadRequests;
    private int maxDownloadRequestsAnimation;
    private int maxDownloadRequestsBig;
    private int moovFound;
    private long nextAtomOffset;
    private boolean nextPartWasPreloaded;
    private long nextPreloadDownloadOffset;
    private ArrayList<Range> notCheckedCdnRanges;
    private ArrayList<Range> notLoadedBytesRanges;
    private volatile ArrayList<Range> notLoadedBytesRangesCopy;
    private ArrayList<Range> notRequestedBytesRanges;
    public Object parentObject;
    public FilePathDatabase.PathData pathSaveData;
    private volatile boolean paused;
    public boolean preFinished;
    private boolean preloadFinished;
    private long preloadNotRequestedBytesCount;
    private int preloadPrefixSize;
    private RandomAccessFile preloadStream;
    private int preloadStreamFileOffset;
    private byte[] preloadTempBuffer;
    private int preloadTempBufferCount;
    private HashMap<Long, PreloadRange> preloadedBytesRanges;
    private int priority;
    private FileLoaderPriorityQueue priorityQueue;
    private RequestInfo priorityRequestInfo;
    private int renameRetryCount;
    public ArrayList<RequestInfo> requestInfos;
    private long requestedBytesCount;
    private HashMap<Long, Integer> requestedPreloadedBytesRanges;
    private boolean requestedReference;
    private boolean requestingCdnOffsets;
    protected boolean requestingReference;
    private int requestsCount;
    private boolean reuploadingCdn;
    private long startTime;
    private boolean started;
    private volatile int state;
    private String storeFileName;
    private File storePath;
    FileLoadOperationStream stream;
    private ArrayList<FileLoadOperationStream> streamListeners;
    long streamOffset;
    boolean streamPriority;
    private long streamPriorityStartOffset;
    private long streamStartOffset;
    private boolean supportsPreloading;
    private File tempPath;
    public long totalBytesCount;
    private int totalPreloadedBytes;
    long totalTime;
    public final ArrayList<Integer> uiRequestTokens;
    private boolean ungzip;
    private WebFile webFile;
    private TLRPC.InputWebFileLocation webLocation;
    private volatile boolean writingToFilePartsStream;
    public static volatile DispatchQueue filesQueue = new DispatchQueue("writeFileQueue");
    private static final Object lockObject = new Object();

    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j, long j2);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public void setStream(final FileLoadOperationStream fileLoadOperationStream, boolean z, long j) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j;
        this.streamPriority = z;
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$aIPrMqUafVk9CHPkrLsBAmTwp60(FileLoadOperation.this, fileLoadOperationStream);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aIPrMqUafVk9CHPkrLsBAmTwp60(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream) {
        if (fileLoadOperation.streamListeners == null) {
            fileLoadOperation.streamListeners = new ArrayList<>();
        }
        if (fileLoadOperationStream != null && !fileLoadOperation.streamListeners.contains(fileLoadOperationStream)) {
            fileLoadOperation.streamListeners.add(fileLoadOperationStream);
        }
        if (!fileLoadOperation.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(fileLoadOperation.cancelAfterNoStreamListeners);
        }
        if (fileLoadOperationStream == null || fileLoadOperation.state == 1 || fileLoadOperation.state == 0) {
            return;
        }
        fileLoadOperationStream.newDataAvailable();
    }

    public int getPositionInQueue() {
        return getQueue().getPosition(this);
    }

    public boolean checkPrefixPreloadFinished() {
        int i = this.preloadPrefixSize;
        if (i > 0 && this.downloadedBytes > i) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    j = Math.min(j, arrayList.get(i2).start);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return true;
                }
            }
            if (j > this.preloadPrefixSize) {
                return true;
            }
        }
        return false;
    }

    protected static class RequestInfo {
        public boolean cancelled;
        public boolean cancelling;
        public int chunkSize;
        public int connectionType;
        private boolean forceSmallChunk;
        private long offset;
        public long requestStartTime;
        public int requestToken;
        private TLRPC.TL_upload_file response;
        private TLRPC.TL_upload_cdnFile responseCdn;
        private TLRPC.TL_upload_webFile responseWeb;
        public Runnable whenCancelled;

        protected RequestInfo() {
        }
    }

    public static class Range {
        private long end;
        private long start;

        private Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j, long j2) {
            this.fileOffset = j;
            this.length = j2;
        }
    }

    private void updateParams() {
        if ((this.preloadPrefixSize > 0 || MessagesController.getInstance(this.currentAccount).getfileExperimentalParams) && !this.forceSmallChunk) {
            this.downloadChunkSizeBig = TLObject.FLAG_19;
            this.maxDownloadRequests = 8;
            this.maxDownloadRequestsBig = 8;
        } else {
            this.downloadChunkSizeBig = 131072;
            this.maxDownloadRequests = 4;
            this.maxDownloadRequestsBig = 4;
        }
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / this.downloadChunkSizeBig);
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$IbDGTS_p-Bx-3XIQphxaYlWvQ-U(FileLoadOperation.this);
            }
        };
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.location = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.id = imageLocation.photoId;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = imageLocation.location;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = imageLocation.access_hash;
                tL_inputPhotoFileLocation.file_reference = imageLocation.file_reference;
                tL_inputPhotoFileLocation.thumb_size = imageLocation.thumbSize;
                if (imageLocation.imageType == 2) {
                    this.allowDisordererFileSave = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j5 = imageLocation.documentId;
                tL_inputDocumentFileLocation.id = j5;
                this.documentId = j5;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = imageLocation.location;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = imageLocation.access_hash;
                tL_inputDocumentFileLocation.file_reference = imageLocation.file_reference;
                tL_inputDocumentFileLocation.thumb_size = imageLocation.thumbSize;
            }
            TLRPC.InputFileLocation inputFileLocation = this.location;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.location = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = imageLocation.location;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = imageLocation.access_hash;
            byte[] bArr2 = imageLocation.file_reference;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.allowDisordererFileSave = true;
        }
        int i = imageLocation.imageType;
        this.ungzip = i == 1 || i == 3;
        int i2 = imageLocation.dc_id;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        this.currentType = 16777216;
        this.totalBytesCount = j;
        this.ext = str == null ? "jpg" : str;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$IbDGTS_p-Bx-3XIQphxaYlWvQ-U(FileLoadOperation.this);
            }
        };
        updateParams();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.location = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.datacenterId = tL_secureFile.dc_id;
        this.totalBytesCount = tL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = 67108864;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i, WebFile webFile) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$IbDGTS_p-Bx-3XIQphxaYlWvQ-U(FileLoadOperation.this);
            }
        };
        updateParams();
        this.currentAccount = i;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i2 = MessagesController.getInstance(i).webFileDatacenterId;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
        if (webFile.mime_type.startsWith("image/")) {
            this.currentType = 16777216;
        } else if (webFile.mime_type.equals("audio/ogg")) {
            this.currentType = ConnectionsManager.FileTypeAudio;
        } else if (webFile.mime_type.startsWith("video/")) {
            this.currentType = 33554432;
        } else {
            this.currentType = 67108864;
        }
        this.allowDisordererFileSave = true;
        this.ext = ImageLoader.getHttpUrlExtension(webFile.url, mimeTypePart);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0125 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0040, B:6:0x0054, B:7:0x00ca, B:9:0x00d4, B:13:0x00e2, B:15:0x00ec, B:17:0x00f6, B:18:0x00fe, B:20:0x0106, B:23:0x0110, B:24:0x011b, B:26:0x0125, B:27:0x013b, B:29:0x0143, B:34:0x012a, B:36:0x0132, B:37:0x0137, B:38:0x0119, B:40:0x007c, B:42:0x0080, B:44:0x0099, B:45:0x009d, B:47:0x00ae, B:51:0x00b8, B:49:0x00c7), top: B:2:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143 A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0040, B:6:0x0054, B:7:0x00ca, B:9:0x00d4, B:13:0x00e2, B:15:0x00ec, B:17:0x00f6, B:18:0x00fe, B:20:0x0106, B:23:0x0110, B:24:0x011b, B:26:0x0125, B:27:0x013b, B:29:0x0143, B:34:0x012a, B:36:0x0132, B:37:0x0137, B:38:0x0119, B:40:0x007c, B:42:0x0080, B:44:0x0099, B:45:0x009d, B:47:0x00ae, B:51:0x00b8, B:49:0x00c7), top: B:2:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0040, B:6:0x0054, B:7:0x00ca, B:9:0x00d4, B:13:0x00e2, B:15:0x00ec, B:17:0x00f6, B:18:0x00fe, B:20:0x0106, B:23:0x0110, B:24:0x011b, B:26:0x0125, B:27:0x013b, B:29:0x0143, B:34:0x012a, B:36:0x0132, B:37:0x0137, B:38:0x0119, B:40:0x007c, B:42:0x0080, B:44:0x0099, B:45:0x009d, B:47:0x00ae, B:51:0x00b8, B:49:0x00c7), top: B:2:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileLoadOperation(TLRPC.Document document, Object obj) {
        boolean z;
        long j;
        String documentFileName;
        int lastIndexOf;
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (FileLoader.DEFAULT_MAX_FILE_SIZE / 131072);
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$IbDGTS_p-Bx-3XIQphxaYlWvQ-U(FileLoadOperation.this);
            }
        };
        updateParams();
        try {
            this.parentObject = obj;
            this.isStory = obj instanceof TL_stories.TL_storyItem;
            this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.location = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i = document.dc_id;
                this.datacenterId = i;
                this.initialDatacenterId = i;
                byte[] bArr = new byte[32];
                this.iv = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.key = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j2 = document.id;
                tL_inputDocumentFileLocation.id = j2;
                this.documentId = j2;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i2 = document.dc_id;
                this.datacenterId = i2;
                this.initialDatacenterId = i2;
                this.allowDisordererFileSave = true;
                int size = document.attributes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.supportsPreloading = true;
                        this.preloadPrefixSize = document.attributes.get(i3).preload_prefix_size;
                        break;
                    }
                    i3++;
                }
            }
            if (!"application/x-tgsticker".equals(document.mime_type) && !"application/x-tgwallpattern".equals(document.mime_type)) {
                z = false;
                this.ungzip = z;
                j = document.size;
                this.totalBytesCount = j;
                if (this.key != null && j % 16 != 0) {
                    long j3 = 16 - (j % 16);
                    this.bytesCountPadding = j3;
                    this.totalBytesCount = j + j3;
                }
                documentFileName = FileLoader.getDocumentFileName(document);
                this.ext = documentFileName;
                if (documentFileName != null && (lastIndexOf = documentFileName.lastIndexOf(46)) != -1) {
                    this.ext = this.ext.substring(lastIndexOf);
                    if (!"audio/ogg".equals(document.mime_type)) {
                        this.currentType = ConnectionsManager.FileTypeAudio;
                    } else if (FileLoader.isVideoMimeType(document.mime_type)) {
                        this.currentType = 33554432;
                    } else {
                        this.currentType = 67108864;
                    }
                    if (this.ext.length() > 1) {
                        this.ext = FileLoader.getExtensionByMimeType(document.mime_type);
                        return;
                    }
                    return;
                }
                this.ext = "";
                if (!"audio/ogg".equals(document.mime_type)) {
                }
                if (this.ext.length() > 1) {
                }
            }
            z = true;
            this.ungzip = z;
            j = document.size;
            this.totalBytesCount = j;
            if (this.key != null) {
                long j32 = 16 - (j % 16);
                this.bytesCountPadding = j32;
                this.totalBytesCount = j + j32;
            }
            documentFileName = FileLoader.getDocumentFileName(document);
            this.ext = documentFileName;
            if (documentFileName != null) {
                this.ext = this.ext.substring(lastIndexOf);
                if (!"audio/ogg".equals(document.mime_type)) {
                }
                if (this.ext.length() > 1) {
                }
            }
            this.ext = "";
            if (!"audio/ogg".equals(document.mime_type)) {
            }
            if (this.ext.length() > 1) {
            }
        } catch (Exception e) {
            FileLog.e(e);
            onFail(true, 0);
        }
    }

    public void setEncryptFile(boolean z) {
        this.encryptFile = z;
        if (z) {
            this.allowDisordererFileSave = false;
        }
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public void setForceRequest(boolean z) {
        this.isForceRequest = z;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPaths(int i, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public FileLoaderPriorityQueue getQueue() {
        return this.priorityQueue;
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    private void removePart(ArrayList<Range> arrayList, long j, long j2) {
        boolean z;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Range range = arrayList.get(i2);
            if (j == range.end) {
                range.end = j2;
            } else if (j2 == range.start) {
                range.start = j;
            }
            z = true;
        }
        z = false;
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda21
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FileLoadOperation.$r8$lambda$jrrmjRfBdFxX5rOyA6qI-6qziWE((FileLoadOperation.Range) obj, (FileLoadOperation.Range) obj2);
            }
        });
        while (i < arrayList.size() - 1) {
            Range range2 = arrayList.get(i);
            int i3 = i + 1;
            Range range3 = arrayList.get(i3);
            if (range2.end == range3.start) {
                range2.end = range3.end;
                arrayList.remove(i3);
                i--;
            }
            i++;
        }
        if (z) {
            return;
        }
        arrayList.add(new Range(j, j2));
    }

    public static /* synthetic */ int $r8$lambda$jrrmjRfBdFxX5rOyA6qI-6qziWE(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    private void addPart(ArrayList<Range> arrayList, long j, long j2, boolean z) {
        long j3;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Range range = arrayList.get(i);
            if (j > range.start) {
                if (j2 < range.end) {
                    j3 = j;
                    arrayList.add(0, new Range(range.start, j3));
                    range.start = j2;
                } else {
                    j3 = j;
                    if (j3 < range.end) {
                        range.end = j3;
                    }
                }
                z2 = true;
                break;
            }
            if (j2 >= range.end) {
                arrayList.remove(i);
            } else if (j2 > range.start) {
                range.start = j2;
            }
            j3 = j;
            z2 = true;
            break;
        }
        j3 = j;
        if (z) {
            if (z2) {
                final ArrayList arrayList2 = new ArrayList(arrayList);
                if (this.fileWriteRunnable != null) {
                    filesQueue.cancelRunnable(this.fileWriteRunnable);
                }
                synchronized (this) {
                    this.writingToFilePartsStream = true;
                }
                DispatchQueue dispatchQueue = filesQueue;
                Runnable runnable = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda25
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLoadOperation.$r8$lambda$MdKLK1tGNaOfCQR1-nMxBOyXfeU(FileLoadOperation.this, arrayList2);
                    }
                };
                this.fileWriteRunnable = runnable;
                dispatchQueue.postRunnable(runnable);
                notifyStreamListeners();
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j3 + " - " + j2);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$MdKLK1tGNaOfCQR1-nMxBOyXfeU(FileLoadOperation fileLoadOperation, ArrayList arrayList) {
        fileLoadOperation.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            if (AndroidUtilities.isENOSPC(e)) {
                LaunchActivity.checkFreeDiscSpaceStatic(1);
            } else if (AndroidUtilities.isEROFS(e)) {
                SharedConfig.checkSdCard(fileLoadOperation.cacheFileFinal);
            }
        }
        if (fileLoadOperation.filePartsStream == null) {
            return;
        }
        int size = arrayList.size();
        int i = (size * 16) + 4;
        ImmutableByteArrayOutputStream immutableByteArrayOutputStream = filesQueueByteBuffer;
        if (immutableByteArrayOutputStream == null) {
            filesQueueByteBuffer = new ImmutableByteArrayOutputStream(i);
        } else {
            immutableByteArrayOutputStream.reset();
        }
        filesQueueByteBuffer.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) arrayList.get(i2);
            filesQueueByteBuffer.writeLong(range.start);
            filesQueueByteBuffer.writeLong(range.end);
        }
        synchronized (fileLoadOperation) {
            try {
                RandomAccessFile randomAccessFile = fileLoadOperation.filePartsStream;
                if (randomAccessFile == null) {
                    return;
                }
                randomAccessFile.seek(0L);
                fileLoadOperation.filePartsStream.write(filesQueueByteBuffer.buf, 0, i);
                fileLoadOperation.writingToFilePartsStream = false;
                if (fileLoadOperation.closeFilePartsStreamOnWriteEnd) {
                    try {
                        fileLoadOperation.filePartsStream.getChannel().close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    fileLoadOperation.filePartsStream.close();
                    fileLoadOperation.filePartsStream = null;
                }
                fileLoadOperation.totalTime += System.currentTimeMillis() - currentTimeMillis;
            } finally {
            }
        }
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.streamListeners.get(i).newDataAvailable();
            }
        }
    }

    protected File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    protected File getCurrentFile() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$Cy1sXdcHQV6ntsmZ77tNEhPS0mM(FileLoadOperation.this, fileArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return fileArr[0];
    }

    public static /* synthetic */ void $r8$lambda$Cy1sXdcHQV6ntsmZ77tNEhPS0mM(FileLoadOperation fileLoadOperation, File[] fileArr, CountDownLatch countDownLatch) {
        if (fileLoadOperation.state == 3 && !fileLoadOperation.preloadFinished) {
            fileArr[0] = fileLoadOperation.cacheFileFinal;
        } else {
            fileArr[0] = fileLoadOperation.cacheFileTemp;
        }
        countDownLatch.countDown();
    }

    protected File getCurrentFileFast() {
        if (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) {
            return this.cacheFileFinal;
        }
        return this.cacheFileTemp;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j, long j2) {
        long j3;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            if (this.state == 3) {
                return j2;
            }
            long j4 = this.downloadedBytes;
            if (j4 == 0) {
                return 0L;
            }
            return Math.min(j2, Math.max(j4 - j, 0L));
        }
        int size = arrayList.size();
        Range range = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                j3 = j2;
                break;
            }
            Range range2 = arrayList.get(i);
            if (j <= range2.start && (range == null || range2.start < range.start)) {
                range = range2;
            }
            if (range2.start <= j && range2.end > j) {
                j3 = 0;
                break;
            }
            i++;
        }
        if (j3 == 0) {
            return 0L;
        }
        if (range != null) {
            return Math.min(j2, range.start - j);
        }
        return Math.min(j2, Math.max(this.totalBytesCount - j, 0L));
    }

    protected float getDownloadedLengthFromOffset(float f) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        if (this.totalBytesCount == 0 || arrayList == null) {
            return 0.0f;
        }
        return f + (getDownloadedLengthFromOffsetInternal(arrayList, (int) (r4 * f), r4) / this.totalBytesCount);
    }

    protected long[] getDownloadedLengthFromOffset(final long j, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long[] jArr = new long[2];
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$z09Yn-iD4r24QWQ-5cEQps6s3T0(FileLoadOperation.this, jArr, j, j2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$z09Yn-iD4r24QWQ-5cEQps6s3T0(FileLoadOperation fileLoadOperation, long[] jArr, long j, long j2, CountDownLatch countDownLatch) {
        FileLoadOperation fileLoadOperation2;
        fileLoadOperation.getClass();
        try {
            fileLoadOperation2 = fileLoadOperation;
            try {
                jArr[0] = fileLoadOperation2.getDownloadedLengthFromOffsetInternal(fileLoadOperation.notLoadedBytesRanges, j, j2);
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                jArr[0] = 0;
                if (fileLoadOperation2.state == 3) {
                }
                countDownLatch.countDown();
            }
        } catch (Throwable th2) {
            th = th2;
            fileLoadOperation2 = fileLoadOperation;
        }
        if (fileLoadOperation2.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getDocumentId() {
        return this.documentId;
    }

    protected void removeStreamListener(final FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$Zx8nYjN28M3jJdc0DnWTRtmLSKQ(FileLoadOperation.this, fileLoadOperationStream);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Zx8nYjN28M3jJdc0DnWTRtmLSKQ(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream) {
        if (fileLoadOperation.streamListeners == null) {
            return;
        }
        FileLog.e("FileLoadOperation " + fileLoadOperation.getFileName() + " removing stream listener " + fileLoadOperationStream);
        fileLoadOperation.streamListeners.remove(fileLoadOperationStream);
    }

    public static /* synthetic */ void $r8$lambda$IbDGTS_p-Bx-3XIQphxaYlWvQ-U(FileLoadOperation fileLoadOperation) {
        fileLoadOperation.pause();
        FileLoader.getInstance(fileLoadOperation.currentAccount).cancelLoadFile(fileLoadOperation.getFileName());
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges == null) {
            return;
        }
        this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$KBtsGQBA6jF20iflz9NrjgtsRos(FileLoadOperation.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$KBtsGQBA6jF20iflz9NrjgtsRos(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation.isStory) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            fileLoadOperation.clearOperation(null, false, true);
            return;
        }
        for (int i = 0; i < fileLoadOperation.requestInfos.size(); i++) {
            ConnectionsManager.getInstance(fileLoadOperation.currentAccount).failNotRunningRequest(fileLoadOperation.requestInfos.get(i).requestToken);
        }
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0434, code lost:
    
        if (r9 != r30.cacheFileFinal.length()) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08ed A[Catch: Exception -> 0x08f2, TRY_LEAVE, TryCatch #6 {Exception -> 0x08f2, blocks: (B:244:0x08dc, B:246:0x08ed), top: B:243:0x08dc }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0490  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j, final boolean z) {
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        boolean exists;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        long j3;
        ?? r12;
        long j4;
        ArrayList<Range> arrayList;
        ?? r6;
        long j5;
        long j6;
        boolean z5;
        boolean z6;
        int i2;
        this.startTime = System.currentTimeMillis();
        updateParams();
        if (this.currentDownloadChunkSize == 0) {
            if (this.forceSmallChunk) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: restart with small chunk");
                }
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            } else if (this.isStory) {
                this.currentDownloadChunkSize = this.downloadChunkSizeBig;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsBig;
            } else if (this.isStream) {
                this.currentDownloadChunkSize = this.downloadChunkSizeAnimation;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsAnimation;
            } else {
                boolean z7 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z7 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z7 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        final boolean z8 = this.state != 0;
        boolean z9 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.$r8$lambda$AjDyTHXJZKzXkVi74T4G73LZdRA(FileLoadOperation.this, z, j, fileLoadOperationStream, z8);
                }
            });
        } else if (z8) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.this.startDownloadRequest(-1);
                }
            });
        }
        if (z8) {
            return z9;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j7 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j / j7) * j7;
        if (this.allowDisordererFileSave) {
            long j8 = this.totalBytesCount;
            if (j8 > 0 && j8 > j7) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation != null) {
            String MD5 = Utilities.MD5(this.webFile.url);
            if (this.encryptFile) {
                String str9 = MD5 + ".temp.enc";
                str2 = MD5 + "." + this.ext + ".enc";
                if (this.key != null) {
                    str3 = MD5 + "_64.iv.enc";
                    str = str9;
                    j2 = 0;
                    str4 = null;
                    str8 = null;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (obj instanceof TLRPC.TL_theme) {
                        this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), "remote" + ((TLRPC.TL_theme) obj).id + ".attheme");
                    } else if (!this.encryptFile) {
                        this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                    } else {
                        this.cacheFileFinal = new File(this.storePath, str2);
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                        if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                            long j9 = this.totalBytesCount;
                            if (j9 != j2) {
                                if (!this.ungzip) {
                                }
                            }
                        }
                        if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                            }
                            if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                                this.cacheFileFinal.delete();
                            }
                            exists = false;
                        }
                    }
                    if (!exists) {
                        this.cacheFileTemp = new File(this.tempPath, str);
                        if (this.ungzip) {
                            this.cacheFileGzipTemp = new File(this.tempPath, str + ".gz");
                        }
                        if (this.encryptFile) {
                            File file = new File(FileLoader.getInternalCacheDir(), str2 + ".key");
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rws");
                                long length = file.length();
                                byte[] bArr = new byte[32];
                                this.encryptKey = bArr;
                                this.encryptIv = new byte[16];
                                if (length > j2 && length % 48 == j2) {
                                    randomAccessFile.read(bArr, 0, 32);
                                    randomAccessFile.read(this.encryptIv, 0, 16);
                                    z3 = false;
                                } else {
                                    Utilities.random.nextBytes(bArr);
                                    Utilities.random.nextBytes(this.encryptIv);
                                    randomAccessFile.write(this.encryptKey);
                                    randomAccessFile.write(this.encryptIv);
                                    z3 = true;
                                }
                                try {
                                    try {
                                        randomAccessFile.getChannel().close();
                                    } catch (Exception e) {
                                        e = e;
                                        if (AndroidUtilities.isENOSPC(e)) {
                                            LaunchActivity.checkFreeDiscSpaceStatic(1);
                                            FileLog.e((Throwable) e, false);
                                        } else if (AndroidUtilities.isEROFS(e)) {
                                            SharedConfig.checkSdCard(this.cacheFileFinal);
                                            FileLog.e((Throwable) e, false);
                                        } else {
                                            FileLog.e(e);
                                        }
                                        final boolean[] zArr = {false};
                                        long j10 = 8;
                                        if (this.supportsPreloading) {
                                        }
                                        z4 = z3;
                                        j3 = 8;
                                        r12 = 1;
                                        j4 = 2;
                                        if (str4 != null) {
                                        }
                                        if (this.fileMetadata != null) {
                                        }
                                        if (!this.cacheFileTemp.exists()) {
                                        }
                                        arrayList = this.notLoadedBytesRanges;
                                        if (arrayList != null) {
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                        }
                                        if (str3 != null) {
                                        }
                                        if (!this.isPreloadVideoOperation) {
                                        }
                                        updateProgress();
                                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                        this.fileOutputStream = randomAccessFile2;
                                        j5 = this.downloadedBytes;
                                        if (j5 != 0) {
                                        }
                                        r6 = 0;
                                        if (this.fileOutputStream == null) {
                                        }
                                    }
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                                randomAccessFile.close();
                            } catch (Exception e3) {
                                e = e3;
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        final boolean[] zArr2 = {false};
                        long j102 = 8;
                        if (this.supportsPreloading || str8 == null) {
                            z4 = z3;
                            j3 = 8;
                            r12 = 1;
                            j4 = 2;
                        } else {
                            this.cacheFilePreload = new File(this.tempPath, str8);
                            try {
                                RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.cacheFilePreload, "rws");
                                this.preloadStream = randomAccessFile3;
                                long length2 = randomAccessFile3.length();
                                this.preloadStreamFileOffset = 1;
                                long j11 = 1;
                                if (length2 > 1) {
                                    zArr2[0] = this.preloadStream.readByte() != 0;
                                    while (j11 < length2) {
                                        if (length2 - j11 < j102) {
                                            break;
                                        }
                                        long readLong = this.preloadStream.readLong();
                                        if (length2 - (j11 + j102) < j102 || readLong < j2) {
                                            break;
                                        }
                                        j4 = 2;
                                        try {
                                            if (readLong <= this.totalBytesCount) {
                                                long readLong2 = this.preloadStream.readLong();
                                                long j12 = j11 + 16;
                                                if (length2 - j12 >= readLong2 && readLong2 <= this.currentDownloadChunkSize) {
                                                    PreloadRange preloadRange = new PreloadRange(j12, readLong2);
                                                    long j13 = j12 + readLong2;
                                                    this.preloadStream.seek(j13);
                                                    if (length2 - j13 >= 24) {
                                                        j3 = j102;
                                                        try {
                                                            long readLong3 = this.preloadStream.readLong();
                                                            this.foundMoovSize = readLong3;
                                                            if (readLong3 != j2) {
                                                                z5 = true;
                                                                i2 = 1;
                                                                z5 = true;
                                                                try {
                                                                    z4 = z3;
                                                                    try {
                                                                        this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                                        this.preloadNotRequestedBytesCount = readLong3;
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        FileLog.e((Throwable) e, false);
                                                                        z6 = z5;
                                                                        r12 = z6;
                                                                        if (!this.isPreloadVideoOperation) {
                                                                        }
                                                                        if (str4 != null) {
                                                                        }
                                                                        if (this.fileMetadata != null) {
                                                                        }
                                                                        if (!this.cacheFileTemp.exists()) {
                                                                        }
                                                                        arrayList = this.notLoadedBytesRanges;
                                                                        if (arrayList != null) {
                                                                        }
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                        }
                                                                        if (str3 != null) {
                                                                        }
                                                                        if (!this.isPreloadVideoOperation) {
                                                                            copyNotLoadedRanges();
                                                                        }
                                                                        updateProgress();
                                                                        RandomAccessFile randomAccessFile22 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                                        this.fileOutputStream = randomAccessFile22;
                                                                        j5 = this.downloadedBytes;
                                                                        if (j5 != 0) {
                                                                        }
                                                                        r6 = 0;
                                                                        if (this.fileOutputStream == null) {
                                                                        }
                                                                    }
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z4 = z3;
                                                                    FileLog.e((Throwable) e, false);
                                                                    z6 = z5;
                                                                    r12 = z6;
                                                                    if (!this.isPreloadVideoOperation) {
                                                                    }
                                                                    if (str4 != null) {
                                                                    }
                                                                    if (this.fileMetadata != null) {
                                                                    }
                                                                    if (!this.cacheFileTemp.exists()) {
                                                                    }
                                                                    arrayList = this.notLoadedBytesRanges;
                                                                    if (arrayList != null) {
                                                                    }
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                    }
                                                                    if (str3 != null) {
                                                                    }
                                                                    if (!this.isPreloadVideoOperation) {
                                                                    }
                                                                    updateProgress();
                                                                    RandomAccessFile randomAccessFile222 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                                    this.fileOutputStream = randomAccessFile222;
                                                                    j5 = this.downloadedBytes;
                                                                    if (j5 != 0) {
                                                                    }
                                                                    r6 = 0;
                                                                    if (this.fileOutputStream == null) {
                                                                    }
                                                                }
                                                            } else {
                                                                z4 = z3;
                                                                i2 = 1;
                                                            }
                                                            this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                            this.nextAtomOffset = this.preloadStream.readLong();
                                                            long j14 = j13 + 24;
                                                            if (this.preloadedBytesRanges == null) {
                                                                this.preloadedBytesRanges = new HashMap<>();
                                                            }
                                                            if (this.requestedPreloadedBytesRanges == null) {
                                                                this.requestedPreloadedBytesRanges = new HashMap<>();
                                                            }
                                                            this.preloadedBytesRanges.put(Long.valueOf(readLong), preloadRange);
                                                            this.requestedPreloadedBytesRanges.put(Long.valueOf(readLong), Integer.valueOf(i2));
                                                            this.totalPreloadedBytes = (int) (this.totalPreloadedBytes + readLong2);
                                                            this.preloadStreamFileOffset = (int) (this.preloadStreamFileOffset + readLong2 + 36);
                                                            j102 = j3;
                                                            z3 = z4;
                                                            j11 = j14;
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z4 = z3;
                                                            z5 = true;
                                                            FileLog.e((Throwable) e, false);
                                                            z6 = z5;
                                                            r12 = z6;
                                                            if (!this.isPreloadVideoOperation) {
                                                            }
                                                            if (str4 != null) {
                                                            }
                                                            if (this.fileMetadata != null) {
                                                            }
                                                            if (!this.cacheFileTemp.exists()) {
                                                            }
                                                            arrayList = this.notLoadedBytesRanges;
                                                            if (arrayList != null) {
                                                            }
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            if (str3 != null) {
                                                            }
                                                            if (!this.isPreloadVideoOperation) {
                                                            }
                                                            updateProgress();
                                                            RandomAccessFile randomAccessFile2222 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                            this.fileOutputStream = randomAccessFile2222;
                                                            j5 = this.downloadedBytes;
                                                            if (j5 != 0) {
                                                            }
                                                            r6 = 0;
                                                            if (this.fileOutputStream == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = z3;
                                            j3 = j102;
                                            z5 = true;
                                            break;
                                        } catch (Exception e7) {
                                            e = e7;
                                            z4 = z3;
                                            j3 = j102;
                                        }
                                    }
                                }
                                z4 = z3;
                                j3 = j102;
                                z5 = true;
                                j4 = 2;
                                this.preloadStream.seek(this.preloadStreamFileOffset);
                                z6 = z5;
                            } catch (Exception e8) {
                                e = e8;
                                z4 = z3;
                                j3 = j102;
                                z5 = true;
                                j4 = 2;
                            }
                            r12 = z6;
                            if (!this.isPreloadVideoOperation) {
                                r12 = z6;
                                if (this.preloadedBytesRanges == null) {
                                    this.cacheFilePreload = null;
                                    try {
                                        RandomAccessFile randomAccessFile4 = this.preloadStream;
                                        r12 = z6;
                                        if (randomAccessFile4 != null) {
                                            try {
                                                randomAccessFile4.getChannel().close();
                                            } catch (Exception e9) {
                                                FileLog.e(e9);
                                            }
                                            this.preloadStream.close();
                                            this.preloadStream = null;
                                            r12 = z6;
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        r12 = z6;
                                    }
                                }
                            }
                        }
                        if (str4 != null) {
                            this.cacheFileParts = new File(this.tempPath, str4);
                            if (!this.cacheFileTemp.exists()) {
                                this.cacheFileParts.delete();
                            }
                            try {
                                RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileParts, "rws");
                                this.filePartsStream = randomAccessFile5;
                                long length3 = randomAccessFile5.length();
                                if (length3 % j3 == 4) {
                                    int readInt = this.filePartsStream.readInt();
                                    if (readInt <= (length3 - 4) / j4) {
                                        for (int i3 = 0; i3 < readInt; i3++) {
                                            long readLong4 = this.filePartsStream.readLong();
                                            long readLong5 = this.filePartsStream.readLong();
                                            this.notLoadedBytesRanges.add(new Range(readLong4, readLong5));
                                            this.notRequestedBytesRanges.add(new Range(readLong4, readLong5));
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11, (AndroidUtilities.isFilNotFoundException(e11) ? 1 : 0) ^ r12);
                            }
                        }
                        if (this.fileMetadata != null) {
                            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
                        }
                        if (!this.cacheFileTemp.exists()) {
                            ArrayList<Range> arrayList2 = this.notLoadedBytesRanges;
                            if (arrayList2 != null && arrayList2.isEmpty()) {
                                long j15 = 0;
                                this.notLoadedBytesRanges.add(new Range(j15, this.totalBytesCount));
                                this.notRequestedBytesRanges.add(new Range(j15, this.totalBytesCount));
                            }
                        } else if (z4) {
                            this.cacheFileTemp.delete();
                        } else {
                            long length4 = this.cacheFileTemp.length();
                            if (str3 != null && length4 % this.currentDownloadChunkSize != j2) {
                                this.requestedBytesCount = j2;
                            } else {
                                long floorDiv = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * this.currentDownloadChunkSize;
                                this.downloadedBytes = floorDiv;
                                this.requestedBytesCount = floorDiv;
                            }
                            ArrayList<Range> arrayList3 = this.notLoadedBytesRanges;
                            if (arrayList3 != null && arrayList3.isEmpty()) {
                                this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                                this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                            }
                        }
                        arrayList = this.notLoadedBytesRanges;
                        if (arrayList != null) {
                            this.downloadedBytes = this.totalBytesCount;
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                Range range = this.notLoadedBytesRanges.get(i4);
                                this.downloadedBytes -= range.end - range.start;
                            }
                            this.requestedBytesCount = this.downloadedBytes;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            if (this.isPreloadVideoOperation) {
                                FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                            } else {
                                FileLog.d("start loading file to temp = " + this.cacheFileTemp + " final = " + this.cacheFileFinal + " priority" + this.priority);
                            }
                        }
                        if (str3 != null) {
                            this.cacheIvTemp = new File(this.tempPath, str3);
                            try {
                                this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                                if (this.downloadedBytes != 0 && !z4) {
                                    long length5 = this.cacheIvTemp.length();
                                    if (length5 <= 0) {
                                        j6 = 0;
                                    } else if (length5 % 64 == 0) {
                                        this.fiv.read(this.iv, 0, 64);
                                    } else {
                                        j6 = 0;
                                    }
                                    this.downloadedBytes = j6;
                                    this.requestedBytesCount = j6;
                                }
                            } catch (Exception e12) {
                                this.downloadedBytes = 0L;
                                this.requestedBytesCount = 0L;
                                if (AndroidUtilities.isENOSPC(e12)) {
                                    LaunchActivity.checkFreeDiscSpaceStatic(r12);
                                    FileLog.e((Throwable) e12, false);
                                } else if (AndroidUtilities.isEROFS(e12)) {
                                    SharedConfig.checkSdCard(this.cacheFileFinal);
                                    FileLog.e((Throwable) e12, false);
                                } else {
                                    FileLog.e(e12);
                                }
                            }
                        }
                        if (!this.isPreloadVideoOperation && this.downloadedBytes != 0 && this.totalBytesCount > 0) {
                            copyNotLoadedRanges();
                        }
                        updateProgress();
                        try {
                            RandomAccessFile randomAccessFile22222 = new RandomAccessFile(this.cacheFileTemp, "rws");
                            this.fileOutputStream = randomAccessFile22222;
                            j5 = this.downloadedBytes;
                            if (j5 != 0) {
                                randomAccessFile22222.seek(j5);
                            }
                            r6 = 0;
                        } catch (Exception e13) {
                            r6 = 0;
                            FileLog.e((Throwable) e13, false);
                            if (AndroidUtilities.isENOSPC(e13)) {
                                LaunchActivity.checkFreeDiscSpaceStatic(r12);
                                onFail(r12, -1);
                                return false;
                            }
                            if (AndroidUtilities.isEROFS(e13)) {
                                SharedConfig.checkSdCard(this.cacheFileFinal);
                                FileLog.e((Throwable) e13, false);
                                onFail(r12, -1);
                                return false;
                            }
                        }
                        if (this.fileOutputStream == null) {
                            onFail(r12, r6);
                            return r6;
                        }
                        this.started = r12;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$uxa2nRVkcn7jYcobqxOcH-prXhM(FileLoadOperation.this, zArr2);
                            }
                        });
                        return r12;
                    }
                    this.started = true;
                    try {
                        onFinishLoadingFile(false, 1, false);
                        FilePathDatabase.PathData pathData = this.pathSaveData;
                        if (pathData != null) {
                            this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                        }
                        return true;
                    } catch (Exception e14) {
                        FileLog.e((Throwable) e14, false);
                        if (AndroidUtilities.isENOSPC(e14)) {
                            z2 = true;
                            LaunchActivity.checkFreeDiscSpaceStatic(1);
                            i = -1;
                            onFail(true, -1);
                        } else {
                            i = -1;
                            z2 = true;
                        }
                        if (AndroidUtilities.isEROFS(e14)) {
                            SharedConfig.checkSdCard(this.cacheFileFinal);
                            onFail(z2, i);
                            return false;
                        }
                        onFail(z2, 0);
                        return z2;
                    }
                }
                str = str9;
                j2 = 0;
                str3 = null;
                str4 = null;
                str8 = null;
                this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                this.cancelledRequestInfos = new ArrayList<>();
                this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                this.state = 1;
                obj = this.parentObject;
                if (obj instanceof TLRPC.TL_theme) {
                }
                exists = this.cacheFileFinal.exists();
                this.cacheFileFinalReady = exists;
                if (exists) {
                }
                if (!exists) {
                }
            } else {
                String str10 = MD5 + ".temp";
                String str11 = MD5 + "." + this.ext;
                if (this.key != null) {
                    str3 = MD5 + "_64.iv";
                    str = str10;
                    j2 = 0;
                    str2 = str11;
                    str4 = null;
                    str8 = null;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (obj instanceof TLRPC.TL_theme) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (!exists) {
                    }
                } else {
                    str = str10;
                    j2 = 0;
                    str2 = str11;
                    str3 = null;
                    str4 = null;
                    str8 = null;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (obj instanceof TLRPC.TL_theme) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (!exists) {
                    }
                }
            }
        } else {
            TLRPC.InputFileLocation inputFileLocation = this.location;
            long j16 = inputFileLocation.volume_id;
            j2 = 0;
            if (j16 != 0 && inputFileLocation.local_id != 0) {
                int i5 = this.datacenterId;
                if (i5 == Integer.MIN_VALUE || j16 == -2147483648L || i5 == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    str6 = this.location.volume_id + "_" + this.location.local_id + ".temp.enc";
                    str2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext + ".enc";
                    if (this.key != null) {
                        str7 = this.location.volume_id + "_" + this.location.local_id + "_64.iv.enc";
                        String str12 = str6;
                        str3 = str7;
                        str = str12;
                    }
                    str = str6;
                    str3 = null;
                } else {
                    str = this.location.volume_id + "_" + this.location.local_id + ".temp";
                    str2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext;
                    str3 = this.key != null ? this.location.volume_id + "_" + this.location.local_id + "_64.iv" : null;
                    str4 = this.notLoadedBytesRanges != null ? this.location.volume_id + "_" + this.location.local_id + "_64.pt" : null;
                    str5 = this.location.volume_id + "_" + this.location.local_id + "_64.preload";
                    str8 = str5;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (obj instanceof TLRPC.TL_theme) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (!exists) {
                    }
                }
            } else {
                if (this.datacenterId == 0 || inputFileLocation.id == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    str6 = this.datacenterId + "_" + this.location.id + ".temp.enc";
                    str2 = this.datacenterId + "_" + this.location.id + this.ext + ".enc";
                    if (this.key != null) {
                        str7 = this.datacenterId + "_" + this.location.id + "_64.iv.enc";
                        String str122 = str6;
                        str3 = str7;
                        str = str122;
                    }
                    str = str6;
                    str3 = null;
                } else {
                    str = this.datacenterId + "_" + this.location.id + ".temp";
                    str2 = this.datacenterId + "_" + this.location.id + this.ext;
                    str3 = this.key != null ? this.datacenterId + "_" + this.location.id + "_64.iv" : null;
                    str4 = this.notLoadedBytesRanges != null ? this.datacenterId + "_" + this.location.id + "_64.pt" : null;
                    str5 = this.datacenterId + "_" + this.location.id + "_64.preload";
                    str8 = str5;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (obj instanceof TLRPC.TL_theme) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (!exists) {
                    }
                }
            }
            str4 = null;
            str8 = null;
            this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
            this.cancelledRequestInfos = new ArrayList<>();
            this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
            this.state = 1;
            obj = this.parentObject;
            if (obj instanceof TLRPC.TL_theme) {
            }
            exists = this.cacheFileFinal.exists();
            this.cacheFileFinalReady = exists;
            if (exists) {
            }
            if (!exists) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$AjDyTHXJZKzXkVi74T4G73LZdRA(final FileLoadOperation fileLoadOperation, boolean z, long j, FileLoadOperationStream fileLoadOperationStream, boolean z2) {
        if (fileLoadOperation.streamListeners == null) {
            fileLoadOperation.streamListeners = new ArrayList<>();
        }
        if (z) {
            long j2 = fileLoadOperation.currentDownloadChunkSize;
            long j3 = (j / j2) * j2;
            RequestInfo requestInfo = fileLoadOperation.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j3) {
                RequestInfo requestInfo2 = fileLoadOperation.priorityRequestInfo;
                final int i = requestInfo2.requestToken;
                fileLoadOperation.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLoadOperation.this.uiRequestTokens.remove(Integer.valueOf(i));
                    }
                });
                fileLoadOperation.requestedBytesCount -= fileLoadOperation.currentDownloadChunkSize;
                fileLoadOperation.removePart(fileLoadOperation.notRequestedBytesRanges, fileLoadOperation.priorityRequestInfo.offset, fileLoadOperation.priorityRequestInfo.offset + fileLoadOperation.currentDownloadChunkSize);
                if (fileLoadOperation.priorityRequestInfo.requestToken != 0) {
                    ConnectionsManager.getInstance(fileLoadOperation.currentAccount).cancelRequest(fileLoadOperation.priorityRequestInfo.requestToken, true);
                    fileLoadOperation.requestsCount--;
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get cancel request at offset " + fileLoadOperation.priorityRequestInfo.offset);
                }
                fileLoadOperation.priorityRequestInfo = null;
            }
            if (fileLoadOperation.priorityRequestInfo == null) {
                fileLoadOperation.streamPriorityStartOffset = j3;
            }
        } else {
            long j4 = fileLoadOperation.currentDownloadChunkSize;
            fileLoadOperation.streamStartOffset = (j / j4) * j4;
        }
        if (!fileLoadOperation.streamListeners.contains(fileLoadOperationStream)) {
            fileLoadOperation.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + fileLoadOperation.getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!fileLoadOperation.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(fileLoadOperation.cancelAfterNoStreamListeners);
        }
        if (z2) {
            if (fileLoadOperation.preloadedBytesRanges != null && fileLoadOperation.getDownloadedLengthFromOffsetInternal(fileLoadOperation.notLoadedBytesRanges, fileLoadOperation.streamStartOffset, 1L) == 0 && fileLoadOperation.preloadedBytesRanges.get(Long.valueOf(fileLoadOperation.streamStartOffset)) != null) {
                fileLoadOperation.nextPartWasPreloaded = true;
            }
            fileLoadOperation.startDownloadRequest(-1);
            fileLoadOperation.nextPartWasPreloaded = false;
        }
        if (fileLoadOperation.notLoadedBytesRanges != null) {
            fileLoadOperation.notifyStreamListeners();
        }
    }

    public static /* synthetic */ void $r8$lambda$uxa2nRVkcn7jYcobqxOcH-prXhM(FileLoadOperation fileLoadOperation, boolean[] zArr) {
        boolean z = fileLoadOperation.isPreloadVideoOperation && zArr[0];
        int i = fileLoadOperation.preloadPrefixSize;
        boolean z2 = i > 0 && fileLoadOperation.downloadedBytes >= ((long) i) && fileLoadOperation.canFinishPreload();
        long j = fileLoadOperation.totalBytesCount;
        if (j != 0 && (z || fileLoadOperation.downloadedBytes == j || z2)) {
            try {
                fileLoadOperation.onFinishLoadingFile(false, 1, true);
                return;
            } catch (Exception unused) {
                fileLoadOperation.onFail(true, 0);
                return;
            }
        }
        fileLoadOperation.startDownloadRequest(-1);
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j = this.downloadedBytes;
            long j2 = this.totalBytesCount;
            if (j == j2 || j2 <= 0) {
                return;
            }
            fileLoadOperationDelegate.didChangedLoadProgress(this, j, j2);
        }
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void setIsPreloadVideoOperation(final boolean z) {
        if (this.isPreloadVideoOperation != z) {
            if (!z || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z + " file=" + this.fileName);
                if (!z && this.isPreloadVideoOperation) {
                    if (this.state == 3) {
                        this.isPreloadVideoOperation = z;
                        this.state = 0;
                        this.preloadFinished = false;
                        start();
                        return;
                    }
                    if (this.state == 1) {
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$AHUcgcyjleCAb_DZSXdAeDpVYiQ(FileLoadOperation.this, z);
                            }
                        });
                        return;
                    } else {
                        this.isPreloadVideoOperation = z;
                        return;
                    }
                }
                this.isPreloadVideoOperation = z;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$AHUcgcyjleCAb_DZSXdAeDpVYiQ(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.requestedBytesCount = 0L;
        fileLoadOperation.clearOperation(null, true, true);
        fileLoadOperation.isPreloadVideoOperation = z;
        fileLoadOperation.startDownloadRequest(-1);
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public void cancel() {
        cancel(false);
    }

    private void cancel(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.this.cancelOnStage(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelOnStage(boolean z) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.$r8$lambda$ZbkCjEZwmArqOgVJyY5DVszwQ-k(FileLoadOperation.this);
                }
            });
        }
        if (z) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (file5.delete()) {
                        return;
                    }
                    this.cacheFilePreload.deleteOnExit();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$ZbkCjEZwmArqOgVJyY5DVszwQ-k(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.onFail(false, 1);
        }
    }

    private void cancelRequests(final Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("cancelRequests");
        sb.append(runnable != null ? " with callback" : "");
        FileLog.d(sb.toString());
        if (this.requestInfos != null) {
            final int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            int i = 0;
            for (int i2 = 0; i2 < this.requestInfos.size(); i2++) {
                final RequestInfo requestInfo = this.requestInfos.get(i2);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken);
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$nGf2vg6_qrzCPXWCMNer3l8-Da0(FileLoadOperation.RequestInfo.this, iArr, runnable);
                            }
                        };
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$CDuAUjvsTX7Jq3JXybb-Y9NKqJ4(FileLoadOperation.RequestInfo.this);
                            }
                        });
                    }
                    char c = requestInfo.connectionType == 2 ? (char) 0 : (char) 1;
                    iArr2[c] = iArr2[c] + requestInfo.chunkSize;
                }
            }
            while (i < 2) {
                int i3 = i == 0 ? 2 : 65538;
                if (iArr2[i] > 1048576) {
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
                }
                i++;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$nGf2vg6_qrzCPXWCMNer3l8-Da0(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            runnable.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$CDuAUjvsTX7Jq3JXybb-Y9NKqJ4(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void cleanup() {
        try {
            RandomAccessFile randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            if (this.filePartsStream != null) {
                synchronized (this) {
                    if (!this.writingToFilePartsStream) {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    } else {
                        this.closeFilePartsStreamOnWriteEnd = true;
                    }
                }
            }
        } catch (Exception e8) {
            FileLog.e(e8);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.fiv = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (this.delayedRequestInfos != null) {
            for (int i = 0; i < this.delayedRequestInfos.size(); i++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i);
                if (requestInfo.response != null) {
                    requestInfo.response.disableFree = false;
                    requestInfo.response.freeResources();
                } else if (requestInfo.responseWeb != null) {
                    requestInfo.responseWeb.disableFree = false;
                    requestInfo.responseWeb.freeResources();
                } else if (requestInfo.responseCdn != null) {
                    requestInfo.responseCdn.disableFree = false;
                    requestInfo.responseCdn.freeResources();
                }
            }
            this.delayedRequestInfos.clear();
        }
    }

    private void onFinishLoadingFile(final boolean z, int i, boolean z2) {
        if (this.state == 1 || this.state == 5) {
            this.state = 3;
            notifyStreamListeners();
            cleanup();
            if (this.isPreloadVideoOperation || z2) {
                this.preloadFinished = true;
                if (BuildVars.DEBUG_VERSION) {
                    if (i == 1) {
                        FileLog.d("file already exist " + this.cacheFileTemp);
                    } else {
                        FileLog.d("finished preloading file to " + this.cacheFileTemp + " loaded " + this.downloadedBytes + " of " + this.totalBytesCount + " prefSize=" + this.preloadPrefixSize);
                    }
                }
                if (this.fileMetadata != null) {
                    if (this.cacheFileTemp != null) {
                        FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileTemp)));
                    }
                    if (this.cacheFileParts != null) {
                        FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileParts)));
                    }
                }
                this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
                this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
                return;
            }
            final File file = this.cacheIvTemp;
            final File file2 = this.cacheFileParts;
            final File file3 = this.cacheFilePreload;
            final File file4 = this.cacheFileTemp;
            filesQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.$r8$lambda$VR284php6E0_hR0gtNT9yJxsRfc(FileLoadOperation.this, file, file2, file3, file4, z);
                }
            });
            this.cacheIvTemp = null;
            this.cacheFileParts = null;
            this.cacheFilePreload = null;
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #3 {all -> 0x0123, blocks: (B:46:0x0115, B:48:0x011d), top: B:45:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$VR284php6E0_hR0gtNT9yJxsRfc(final FileLoadOperation fileLoadOperation, File file, File file2, File file3, File file4, final boolean z) {
        Throwable th;
        File file5;
        boolean copyFile;
        String str;
        fileLoadOperation.getClass();
        if (file != null) {
            file.delete();
        }
        if (file2 != null) {
            file2.delete();
        }
        if (file3 != null) {
            file3.delete();
        }
        if (file4 != null) {
            if (fileLoadOperation.ungzip) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file4));
                    FileLoader.copyFile(gZIPInputStream, fileLoadOperation.cacheFileGzipTemp, 2097152);
                    gZIPInputStream.close();
                    file4.delete();
                    file5 = fileLoadOperation.cacheFileGzipTemp;
                    try {
                        fileLoadOperation.ungzip = false;
                    } catch (ZipException unused) {
                        file4 = file5;
                        fileLoadOperation.ungzip = false;
                        if (!fileLoadOperation.ungzip) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("unable to ungzip temp = " + file4 + " to final = " + fileLoadOperation.cacheFileFinal);
                        }
                        file4 = file5;
                        if (!fileLoadOperation.ungzip) {
                        }
                    }
                } catch (ZipException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    file5 = file4;
                }
                file4 = file5;
            }
            if (!fileLoadOperation.ungzip) {
                if (fileLoadOperation.parentObject instanceof TLRPC.TL_theme) {
                    try {
                        copyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                    } catch (Exception e) {
                        FileLog.e(e);
                        copyFile = false;
                        if (!copyFile) {
                        }
                        if (!copyFile) {
                        }
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda30
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(FileLoadOperation.this, z);
                            }
                        });
                    }
                } else {
                    try {
                        if (fileLoadOperation.pathSaveData != null) {
                            synchronized (lockObject) {
                                try {
                                    fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, fileLoadOperation.storeFileName);
                                    int i = 1;
                                    while (fileLoadOperation.cacheFileFinal.exists()) {
                                        int lastIndexOf = fileLoadOperation.storeFileName.lastIndexOf(46);
                                        if (lastIndexOf > 0) {
                                            str = fileLoadOperation.storeFileName.substring(0, lastIndexOf) + " (" + i + ")" + fileLoadOperation.storeFileName.substring(lastIndexOf);
                                        } else {
                                            str = fileLoadOperation.storeFileName + " (" + i + ")";
                                        }
                                        fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, str);
                                        i++;
                                    }
                                } finally {
                                }
                            }
                        }
                        copyFile = file4.renameTo(fileLoadOperation.cacheFileFinal);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        copyFile = false;
                        if (!copyFile) {
                            try {
                                copyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                                if (copyFile) {
                                }
                            } catch (Throwable th4) {
                                FileLog.e(th4);
                            }
                        }
                        if (!copyFile) {
                        }
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda30
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(FileLoadOperation.this, z);
                            }
                        });
                    }
                }
                if (!copyFile && fileLoadOperation.renameRetryCount == 3) {
                    copyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                    if (copyFile) {
                        fileLoadOperation.cacheFileFinal.delete();
                    }
                }
                if (!copyFile) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("unable to rename temp = " + file4 + " to final = " + fileLoadOperation.cacheFileFinal + " retry = " + fileLoadOperation.renameRetryCount);
                    }
                    int i2 = fileLoadOperation.renameRetryCount + 1;
                    fileLoadOperation.renameRetryCount = i2;
                    if (i2 < 3) {
                        fileLoadOperation.state = 1;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda28
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.$r8$lambda$Td4LvGKldQtADOBnT076fEkxr7Q(FileLoadOperation.this, z);
                            }
                        }, 200L);
                        return;
                    } else {
                        fileLoadOperation.cacheFileFinal = file4;
                        fileLoadOperation.cacheFileFinalReady = false;
                    }
                } else {
                    fileLoadOperation.cacheFileFinalReady = true;
                    if (fileLoadOperation.pathSaveData != null && fileLoadOperation.cacheFileFinal.exists()) {
                        fileLoadOperation.delegate.saveFilePath(fileLoadOperation.pathSaveData, fileLoadOperation.cacheFileFinal);
                    }
                }
            } else {
                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLoadOperation.this.onFail(false, 0);
                    }
                });
                return;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.$r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(FileLoadOperation.this, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Td4LvGKldQtADOBnT076fEkxr7Q(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.getClass();
        try {
            fileLoadOperation.onFinishLoadingFile(z, 0, false);
        } catch (Exception unused) {
            fileLoadOperation.onFail(false, 0);
        }
    }

    public static /* synthetic */ void $r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + fileLoadOperation.cacheFileFinal + " time = " + (System.currentTimeMillis() - fileLoadOperation.startTime) + " dc = " + fileLoadOperation.datacenterId + " size = " + AndroidUtilities.formatFileSize(fileLoadOperation.totalBytesCount));
        }
        if (z) {
            int i = fileLoadOperation.currentType;
            if (i == 50331648) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i == 33554432) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i == 16777216) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i == 67108864) {
                String str = fileLoadOperation.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || fileLoadOperation.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                } else {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                }
            }
        }
        fileLoadOperation.delegate.didFinishLoadingFile(fileLoadOperation, fileLoadOperation.cacheFileFinal);
    }

    private void delayRequestInfo(RequestInfo requestInfo) {
        this.delayedRequestInfos.add(requestInfo);
        if (requestInfo.response != null) {
            requestInfo.response.disableFree = true;
        } else if (requestInfo.responseWeb != null) {
            requestInfo.responseWeb.disableFree = true;
        } else if (requestInfo.responseCdn != null) {
            requestInfo.responseCdn.disableFree = true;
        }
    }

    private long findNextPreloadDownloadOffset(long j, long j2, NativeByteBuffer nativeByteBuffer) {
        long j3;
        int limit = nativeByteBuffer.limit();
        long j4 = j;
        do {
            if (j4 >= j2 - (this.preloadTempBuffer != null ? 16 : 0)) {
                j3 = j2 + limit;
                if (j4 < j3) {
                    if (j4 >= j3 - 16) {
                        long j5 = j3 - j4;
                        if (j5 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        this.preloadTempBufferCount = (int) j5;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                        return j3;
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i, 16 - i, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j6 = j4 - j2;
                        if (j6 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        nativeByteBuffer.position((int) j6);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i2 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i2 == 0) {
                        return 0L;
                    }
                    if (i2 == 1) {
                        i2 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i2;
                    }
                    j4 += i2;
                }
            }
            return 0L;
        } while (j4 < j3);
        return j4;
    }

    private void requestFileOffsets(long j) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda22
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FileLoadOperation.$r8$lambda$xgWfPCP1UZUPPhxwgbeN2K1mCR4(FileLoadOperation.this, tLObject, tL_error);
            }
        }, null, null, 0, this.datacenterId, 1, true);
    }

    public static /* synthetic */ void $r8$lambda$xgWfPCP1UZUPPhxwgbeN2K1mCR4(FileLoadOperation fileLoadOperation, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            fileLoadOperation.onFail(false, 0);
            return;
        }
        fileLoadOperation.getClass();
        if (tLObject instanceof Vector) {
            fileLoadOperation.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i = 0; i < vector.objects.size(); i++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i2 = 0; i2 < fileLoadOperation.delayedRequestInfos.size(); i2++) {
                RequestInfo requestInfo = fileLoadOperation.delayedRequestInfos.get(i2);
                if (fileLoadOperation.notLoadedBytesRanges != null || fileLoadOperation.downloadedBytes == requestInfo.offset) {
                    fileLoadOperation.delayedRequestInfos.remove(i2);
                    if (fileLoadOperation.processRequestResult(requestInfo, null)) {
                        return;
                    }
                    if (requestInfo.response != null) {
                        requestInfo.response.disableFree = false;
                        requestInfo.response.freeResources();
                        return;
                    } else if (requestInfo.responseWeb != null) {
                        requestInfo.responseWeb.disableFree = false;
                        requestInfo.responseWeb.freeResources();
                        return;
                    } else {
                        if (requestInfo.responseCdn != null) {
                            requestInfo.responseCdn.disableFree = false;
                            requestInfo.responseCdn.freeResources();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0415, code lost:
    
        if (r5 == (r12 - r3)) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0419, code lost:
    
        if (r11 != false) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05eb A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05f3 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0268 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032d A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0363 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c9 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0552 A[Catch: Exception -> 0x009a, TryCatch #1 {Exception -> 0x009a, blocks: (B:69:0x0088, B:71:0x008c, B:73:0x0096, B:75:0x009d, B:77:0x00a3, B:80:0x00c8, B:82:0x00d2, B:84:0x00da, B:86:0x00ea, B:88:0x00f8, B:90:0x0101, B:92:0x0115, B:93:0x0153, B:95:0x0157, B:97:0x017b, B:98:0x01a4, B:100:0x01a8, B:101:0x01af, B:103:0x01da, B:105:0x01e8, B:107:0x01fd, B:108:0x0211, B:109:0x021c, B:110:0x0208, B:111:0x0214, B:112:0x021e, B:114:0x023f, B:116:0x0243, B:118:0x0249, B:120:0x024f, B:125:0x025b, B:128:0x057b, B:130:0x0583, B:132:0x058f, B:134:0x059a, B:137:0x059f, B:139:0x05ab, B:141:0x05b1, B:142:0x05c0, B:144:0x05c6, B:145:0x05d5, B:147:0x05db, B:149:0x05eb, B:150:0x05f3, B:152:0x05f8, B:154:0x05fd, B:157:0x0268, B:159:0x026c, B:161:0x0277, B:165:0x0289, B:167:0x028d, B:169:0x0292, B:171:0x0298, B:175:0x02a4, B:178:0x02ce, B:180:0x02d7, B:182:0x02f0, B:184:0x02f8, B:189:0x030b, B:190:0x0321, B:191:0x0322, B:192:0x0329, B:194:0x032d, B:195:0x035f, B:197:0x0363, B:199:0x0370, B:200:0x03a7, B:202:0x03c9, B:204:0x03db, B:206:0x03eb, B:209:0x03f3, B:211:0x0404, B:213:0x040c, B:215:0x0412, B:219:0x041b, B:221:0x042b, B:222:0x043d, B:227:0x044b, B:228:0x0452, B:229:0x0453, B:231:0x0460, B:232:0x0495, B:234:0x04a4, B:236:0x04a8, B:238:0x04ac, B:239:0x04fa, B:241:0x04fe, B:243:0x051d, B:245:0x0526, B:247:0x053c, B:250:0x054e, B:252:0x0552, B:253:0x055e, B:255:0x0566, B:257:0x056b, B:262:0x02b2, B:266:0x02bc, B:278:0x0603, B:280:0x00aa, B:282:0x00b0, B:283:0x00b7, B:285:0x00bd), top: B:68:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        long j;
        String str;
        char c;
        char c2;
        boolean z;
        boolean z2;
        boolean z3;
        RandomAccessFile randomAccessFile;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        Integer num;
        if (this.state != 1 && this.state != 5) {
            if (BuildVars.DEBUG_VERSION && this.state == 3) {
                FileLog.e(new FileLog.IgnoreSentException("trying to write to finished file " + this.fileName + " offset " + requestInfo.offset + " " + this.totalBytesCount + " reqToken=" + requestInfo.requestToken + " (state=" + this.state + ")"));
            }
            return false;
        }
        final int i3 = requestInfo.requestToken;
        this.requestInfos.remove(requestInfo);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.this.uiRequestTokens.remove(Integer.valueOf(i3));
            }
        });
        String str2 = " id = ";
        String str3 = " secret = ";
        if (tL_error == null) {
            try {
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    if (requestInfo.response != null) {
                        nativeByteBuffer2 = requestInfo.response.bytes;
                    } else if (requestInfo.responseWeb != null) {
                        nativeByteBuffer2 = requestInfo.responseWeb.bytes;
                    } else if (requestInfo.responseCdn != null) {
                        nativeByteBuffer2 = requestInfo.responseCdn.bytes;
                    } else {
                        nativeByteBuffer = null;
                        if (nativeByteBuffer != null || nativeByteBuffer.limit() == 0) {
                            onFinishLoadingFile(true, 0, false);
                            return false;
                        }
                        int limit = nativeByteBuffer.limit();
                        if (this.isCdn) {
                            long j2 = requestInfo.offset;
                            j = 0;
                            long j3 = this.cdnChunkCheckSize;
                            long j4 = (j2 / j3) * j3;
                            HashMap<Long, TLRPC.TL_fileHash> hashMap = this.cdnHashes;
                            if ((hashMap != null ? hashMap.get(Long.valueOf(j4)) : null) == null) {
                                delayRequestInfo(requestInfo);
                                requestFileOffsets(j4);
                                return true;
                            }
                        } else {
                            j = 0;
                        }
                        if (requestInfo.responseCdn != null) {
                            long j5 = requestInfo.offset / 16;
                            c = '\f';
                            byte[] bArr = this.cdnIv;
                            str = " volume_id = ";
                            c2 = '\r';
                            bArr[15] = (byte) (j5 & 255);
                            bArr[14] = (byte) ((j5 >> 8) & 255);
                            bArr[13] = (byte) ((j5 >> 16) & 255);
                            bArr[12] = (byte) ((j5 >> 24) & 255);
                            Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr, 0, nativeByteBuffer.limit());
                        } else {
                            str = " volume_id = ";
                            c = '\f';
                            c2 = '\r';
                        }
                        if (this.isPreloadVideoOperation) {
                            this.preloadStream.writeLong(requestInfo.offset);
                            long j6 = limit;
                            this.preloadStream.writeLong(j6);
                            this.preloadStreamFileOffset += 16;
                            this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + limit);
                            }
                            if (this.preloadedBytesRanges == null) {
                                this.preloadedBytesRanges = new HashMap<>();
                            }
                            this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j6));
                            this.totalPreloadedBytes += limit;
                            this.preloadStreamFileOffset += limit;
                            if (this.moovFound == 0) {
                                long findNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                                if (findNextPreloadDownloadOffset < j) {
                                    findNextPreloadDownloadOffset *= -1;
                                    long j7 = this.nextPreloadDownloadOffset + this.currentDownloadChunkSize;
                                    this.nextPreloadDownloadOffset = j7;
                                    if (j7 < this.totalBytesCount / 2) {
                                        long j8 = 1048576 + findNextPreloadDownloadOffset;
                                        this.foundMoovSize = j8;
                                        this.preloadNotRequestedBytesCount = j8;
                                        this.moovFound = 1;
                                    } else {
                                        this.foundMoovSize = 2097152L;
                                        this.preloadNotRequestedBytesCount = 2097152L;
                                        this.moovFound = 2;
                                    }
                                    this.nextPreloadDownloadOffset = -1L;
                                } else {
                                    this.nextPreloadDownloadOffset += this.currentDownloadChunkSize;
                                }
                                this.nextAtomOffset = findNextPreloadDownloadOffset;
                            }
                            this.preloadStream.writeLong(this.foundMoovSize);
                            this.preloadStream.writeLong(this.nextPreloadDownloadOffset);
                            this.preloadStream.writeLong(this.nextAtomOffset);
                            this.preloadStreamFileOffset += 24;
                            long j9 = this.nextPreloadDownloadOffset;
                            if (j9 != j && ((this.moovFound == 0 || this.foundMoovSize >= j) && this.totalPreloadedBytes <= 2097152 && j9 < this.totalBytesCount)) {
                                z4 = false;
                                if (!z4) {
                                    this.preloadStream.seek(j);
                                    this.preloadStream.write(1);
                                } else if (this.moovFound != 0) {
                                    this.foundMoovSize -= this.currentDownloadChunkSize;
                                }
                                z5 = false;
                            }
                            z4 = true;
                            if (!z4) {
                            }
                            z5 = false;
                        } else {
                            long j10 = limit;
                            long j11 = this.downloadedBytes + j10;
                            this.downloadedBytes = j11;
                            long j12 = this.totalBytesCount;
                            if (j12 > 0) {
                                if (j11 < j12 && ((i = this.preloadPrefixSize) <= 0 || j11 < i || !canFinishPreload() || !this.requestInfos.isEmpty())) {
                                    z6 = false;
                                    z = z6;
                                    z2 = this.downloadedBytes < this.totalBytesCount;
                                }
                                z6 = true;
                                z = z6;
                                if (this.downloadedBytes < this.totalBytesCount) {
                                }
                            } else {
                                int i4 = this.currentDownloadChunkSize;
                                if (limit == i4 && ((j12 != j11 && j11 % i4 == 0) || (j12 > 0 && j12 > j11))) {
                                    z = false;
                                    z2 = false;
                                }
                                z = true;
                                z2 = false;
                            }
                            boolean z7 = BuildVars.DEBUG_VERSION;
                            byte[] bArr2 = this.key;
                            if (bArr2 != null) {
                                Utilities.aesIgeEncryption(nativeByteBuffer.buffer, bArr2, this.iv, false, true, 0, nativeByteBuffer.limit());
                                if (z && this.bytesCountPadding != 0) {
                                    z3 = z2;
                                    long limit2 = nativeByteBuffer.limit() - this.bytesCountPadding;
                                    if (BuildVars.DEBUG_VERSION && limit2 > 2147483647L) {
                                        throw new RuntimeException("Out of limit" + limit2);
                                    }
                                    nativeByteBuffer.limit((int) limit2);
                                    if (this.encryptFile) {
                                        long j13 = requestInfo.offset / 16;
                                        byte[] bArr3 = this.encryptIv;
                                        bArr3[15] = (byte) (j13 & 255);
                                        bArr3[14] = (byte) ((j13 >> 8) & 255);
                                        bArr3[c2] = (byte) ((j13 >> 16) & 255);
                                        bArr3[c] = (byte) ((j13 >> 24) & 255);
                                        Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer.limit());
                                    }
                                    if (this.notLoadedBytesRanges != null) {
                                        this.fileOutputStream.seek(requestInfo.offset);
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                                        }
                                    }
                                    this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                                    addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j10, true);
                                    if (this.isCdn) {
                                        long j14 = requestInfo.offset / this.cdnChunkCheckSize;
                                        int size = this.notCheckedCdnRanges.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size) {
                                                break;
                                            }
                                            Range range = this.notCheckedCdnRanges.get(i5);
                                            if (range.start > j14 || j14 > range.end) {
                                                i5++;
                                                str = str;
                                                str3 = str3;
                                                j14 = j14;
                                                str2 = str2;
                                            } else {
                                                long j15 = this.cdnChunkCheckSize;
                                                long j16 = j14 * j15;
                                                long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j16, j15);
                                                if (downloadedLengthFromOffsetInternal != 0) {
                                                    String str4 = str2;
                                                    if (downloadedLengthFromOffsetInternal != this.cdnChunkCheckSize) {
                                                        long j17 = this.totalBytesCount;
                                                        if (j17 > 0) {
                                                        }
                                                        if (j17 <= 0) {
                                                        }
                                                    }
                                                    TLRPC.TL_fileHash tL_fileHash = this.cdnHashes.get(Long.valueOf(j16));
                                                    if (this.fileReadStream == null) {
                                                        this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                        this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                                    }
                                                    this.fileReadStream.seek(j16);
                                                    if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > 2147483647L) {
                                                        throw new RuntimeException("!!!");
                                                    }
                                                    this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                                    if (this.encryptFile) {
                                                        long j18 = j16 / 16;
                                                        byte[] bArr4 = this.encryptIv;
                                                        bArr4[15] = (byte) (j18 & 255);
                                                        bArr4[14] = (byte) ((j18 >> 8) & 255);
                                                        bArr4[c2] = (byte) ((j18 >> 16) & 255);
                                                        bArr4[c] = (byte) ((j18 >> 24) & 255);
                                                        Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                                    }
                                                    if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, downloadedLengthFromOffsetInternal), tL_fileHash.hash)) {
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            if (this.location != null) {
                                                                FileLog.e("invalid cdn hash " + this.location + str4 + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + str + this.location.volume_id + str3 + this.location.secret);
                                                            } else if (this.webLocation != null) {
                                                                FileLog.e("invalid cdn hash  " + this.webLocation + str4 + this.fileName);
                                                            }
                                                        }
                                                        onFail(false, 0);
                                                        this.cacheFileTemp.delete();
                                                        return false;
                                                    }
                                                    this.cdnHashes.remove(Long.valueOf(j16));
                                                    addPart(this.notCheckedCdnRanges, j14, j14 + 1, false);
                                                }
                                            }
                                        }
                                    }
                                    randomAccessFile = this.fiv;
                                    if (randomAccessFile != null) {
                                        randomAccessFile.seek(0L);
                                        this.fiv.write(this.iv);
                                    }
                                    if (this.totalBytesCount > 0 && this.state == 1) {
                                        copyNotLoadedRanges();
                                        this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                                    }
                                    z4 = z;
                                    z5 = z3;
                                }
                            }
                            z3 = z2;
                            if (this.encryptFile) {
                            }
                            if (this.notLoadedBytesRanges != null) {
                            }
                            this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                            addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j10, true);
                            if (this.isCdn) {
                            }
                            randomAccessFile = this.fiv;
                            if (randomAccessFile != null) {
                            }
                            if (this.totalBytesCount > 0) {
                                copyNotLoadedRanges();
                                this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                            }
                            z4 = z;
                            z5 = z3;
                        }
                        while (i2 < this.delayedRequestInfos.size()) {
                            RequestInfo requestInfo2 = this.delayedRequestInfos.get(i2);
                            i2 = (this.notLoadedBytesRanges == null && this.downloadedBytes != requestInfo2.offset) ? i2 + 1 : 0;
                            this.delayedRequestInfos.remove(i2);
                            if (!processRequestResult(requestInfo2, null)) {
                                if (requestInfo2.response != null) {
                                    requestInfo2.response.disableFree = false;
                                    requestInfo2.response.freeResources();
                                } else if (requestInfo2.responseWeb != null) {
                                    requestInfo2.responseWeb.disableFree = false;
                                    requestInfo2.responseWeb.freeResources();
                                } else if (requestInfo2.responseCdn != null) {
                                    requestInfo2.responseCdn.disableFree = false;
                                    requestInfo2.responseCdn.freeResources();
                                }
                            }
                            if (!z4) {
                                onFinishLoadingFile(true, 0, z5);
                            } else if (this.state != 4 && this.state != 5) {
                                startDownloadRequest(requestInfo.connectionType);
                            }
                        }
                        if (!z4) {
                        }
                    }
                    nativeByteBuffer = nativeByteBuffer2;
                    if (nativeByteBuffer != null) {
                    }
                    onFinishLoadingFile(true, 0, false);
                    return false;
                }
                delayRequestInfo(requestInfo);
                return false;
            } catch (Exception e) {
                FileLog.e(e, (AndroidUtilities.isFilNotFoundException(e) || AndroidUtilities.isENOSPC(e)) ? false : true);
                if (AndroidUtilities.isENOSPC(e)) {
                    onFail(false, -1);
                    return false;
                }
                if (AndroidUtilities.isEROFS(e)) {
                    SharedConfig.checkSdCard(this.cacheFileFinal);
                    onFail(true, -1);
                    return false;
                }
                onFail(false, 0);
            }
        } else if (tL_error.text.contains("LIMIT_INVALID") && !requestInfo.forceSmallChunk) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + requestInfo.chunkSize);
            if (!this.forceSmallChunk) {
                this.forceSmallChunk = true;
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            }
            startDownloadRequest(requestInfo.connectionType);
        } else if (tL_error.text.contains("FILE_MIGRATE_")) {
            Scanner scanner = new Scanner(tL_error.text.replace("FILE_MIGRATE_", ""));
            scanner.useDelimiter("");
            try {
                num = Integer.valueOf(scanner.nextInt());
            } catch (Exception unused) {
                num = null;
            }
            if (num == null) {
                onFail(false, 0);
            } else {
                this.datacenterId = num.intValue();
                this.downloadedBytes = 0L;
                this.requestedBytesCount = 0L;
                startDownloadRequest(requestInfo.connectionType);
            }
        } else {
            if (tL_error.text.contains("OFFSET_INVALID")) {
                if (this.downloadedBytes % this.currentDownloadChunkSize == 0) {
                    try {
                        onFinishLoadingFile(true, 0, false);
                        return false;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        onFail(false, 0);
                        return false;
                    }
                }
                onFail(false, 0);
                return false;
            }
            if (tL_error.text.contains("RETRY_LIMIT")) {
                onFail(false, 2);
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    TLRPC.InputFileLocation inputFileLocation = this.location;
                    if (inputFileLocation != null) {
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            FileLog.e(tL_error.text + " " + this.location + " peer_did = " + DialogObject.getPeerDialogId(((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).big);
                        } else {
                            FileLog.e(tL_error.text + " " + this.location + " id = " + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + str3 + this.location.secret);
                        }
                    } else if (this.webLocation != null) {
                        FileLog.e(tL_error.text + " " + this.webLocation + " id = " + this.fileName);
                    }
                }
                onFail(false, 0);
                return false;
            }
        }
        return false;
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onFail(boolean z, final int i) {
        cleanup();
        this.state = i == 1 ? 4 : 2;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long currentTimeMillis = this.startTime != 0 ? System.currentTimeMillis() - this.startTime : 0L;
            if (i == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + currentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i + " time = " + currentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.$r8$lambda$maafuPct8aqEBc9YU0uxFjK-ukM(FileLoadOperation.this, i);
                }
            });
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
        notifyStreamListeners();
    }

    public static /* synthetic */ void $r8$lambda$maafuPct8aqEBc9YU0uxFjK-ukM(FileLoadOperation fileLoadOperation, int i) {
        FileLoadOperationDelegate fileLoadOperationDelegate = fileLoadOperation.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(fileLoadOperation, i);
        }
        fileLoadOperation.notifyStreamListeners();
    }

    private void clearOperation(RequestInfo requestInfo, boolean z, boolean z2) {
        int[] iArr = new int[2];
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < this.requestInfos.size()) {
            final RequestInfo requestInfo2 = this.requestInfos.get(i);
            long min = Math.min(requestInfo2.offset, j);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + requestInfo2.chunkSize);
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z2) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            FileLoadOperation.$r8$lambda$Foz_40_ipmHQ9nzNP1r71YBabK8(FileLoadOperation.this, requestInfo2);
                        }
                    };
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            FileLoadOperation.$r8$lambda$WZILNyIhrBQAst1rN6aS3FVcWXI(FileLoadOperation.RequestInfo.this);
                        }
                    });
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i++;
            j = min;
        }
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 == 0 ? 2 : 65538;
            if (iArr[i2] > 1048576) {
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
            }
            i2++;
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.this.uiRequestTokens.clear();
            }
        });
        long j2 = j;
        for (int i4 = 0; i4 < this.delayedRequestInfos.size(); i4++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i4);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, requestInfo3.offset + requestInfo3.chunkSize);
            }
            if (requestInfo3.response != null) {
                requestInfo3.response.disableFree = false;
                requestInfo3.response.freeResources();
            } else if (requestInfo3.responseWeb != null) {
                requestInfo3.responseWeb.disableFree = false;
                requestInfo3.responseWeb.freeResources();
            } else if (requestInfo3.responseCdn != null) {
                requestInfo3.responseCdn.disableFree = false;
                requestInfo3.responseCdn.freeResources();
            }
            j2 = Math.min(requestInfo3.offset, j2);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = j2;
            this.requestedBytesCount = j2;
        }
    }

    public static /* synthetic */ void $r8$lambda$Foz_40_ipmHQ9nzNP1r71YBabK8(FileLoadOperation fileLoadOperation, RequestInfo requestInfo) {
        fileLoadOperation.getClass();
        requestInfo.whenCancelled = null;
        fileLoadOperation.cancelledRequestInfos.remove(requestInfo);
        requestInfo.cancelled = true;
    }

    public static /* synthetic */ void $r8$lambda$WZILNyIhrBQAst1rN6aS3FVcWXI(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void requestReference(RequestInfo requestInfo) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.requestingReference) {
            return;
        }
        clearOperation(null, false, false);
        this.requestingReference = true;
        this.requestedReference = true;
        Object obj = this.parentObject;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.getId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.parentObject = webPage;
                this.isStory = false;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " file reference expired ");
        }
        FileRefController.getInstance(this.currentAccount).requestReference(this.parentObject, this.location, this, requestInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startDownloadRequest(int i) {
        int i2;
        int max;
        int i3;
        long j;
        boolean z;
        long j2;
        long j3;
        final int i4;
        final TLRPC.TL_upload_getFile tL_upload_getFile;
        boolean z2;
        long j4;
        TLRPC.InputFileLocation inputFileLocation;
        int i5;
        HashMap<Long, PreloadRange> hashMap;
        PreloadRange preloadRange;
        boolean z3;
        NativeByteBuffer nativeByteBuffer;
        ArrayList<Range> arrayList;
        boolean z4;
        FileLoadOperation fileLoadOperation = this;
        int i6 = 2;
        ?? r9 = 0;
        boolean z5 = true;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.state = 1;
        }
        if (fileLoadOperation.paused || fileLoadOperation.reuploadingCdn || fileLoadOperation.state != 1 || fileLoadOperation.requestingReference) {
            return;
        }
        long j5 = 0;
        if (fileLoadOperation.isStory || fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || fileLoadOperation.requestInfos.size() + fileLoadOperation.delayedRequestInfos.size() < fileLoadOperation.currentMaxDownloadRequests) {
            if (fileLoadOperation.isPreloadVideoOperation) {
                if (fileLoadOperation.requestedBytesCount > 2097152) {
                    return;
                }
                if (fileLoadOperation.moovFound != 0 && fileLoadOperation.requestInfos.size() > 0) {
                    return;
                }
            }
            if (fileLoadOperation.isStory) {
                max = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            } else if (fileLoadOperation.streamPriorityStartOffset == 0 && !fileLoadOperation.nextPartWasPreloaded && ((!fileLoadOperation.isPreloadVideoOperation || fileLoadOperation.moovFound != 0) && fileLoadOperation.totalBytesCount > 0)) {
                max = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            } else {
                i2 = 1;
                if (!fileLoadOperation.requestedReference && FileRefController.getInstance(fileLoadOperation.currentAccount).applyCachedFileReference(fileLoadOperation.parentObject, fileLoadOperation.location, fileLoadOperation)) {
                    FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
                }
                i3 = 0;
                final FileLoadOperation fileLoadOperation2 = fileLoadOperation;
                while (i3 < i2) {
                    if (fileLoadOperation2.isPreloadVideoOperation) {
                        if (fileLoadOperation2.moovFound != 0 && fileLoadOperation2.preloadNotRequestedBytesCount <= j5) {
                            boolean z6 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        long j6 = fileLoadOperation2.nextPreloadDownloadOffset;
                        if (j6 == -1) {
                            int i7 = (2097152 / fileLoadOperation2.currentDownloadChunkSize) + i6;
                            long j7 = j5;
                            while (i7 != 0) {
                                if (fileLoadOperation2.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j7))) {
                                    long j8 = fileLoadOperation2.currentDownloadChunkSize;
                                    j7 += j8;
                                    long j9 = j5;
                                    long j10 = fileLoadOperation2.totalBytesCount;
                                    if (j7 > j10) {
                                        j6 = j7;
                                        j = j9;
                                        z5 = false;
                                    } else {
                                        if (fileLoadOperation2.moovFound == i6 && j7 == r1 * 8) {
                                            j7 = ((j10 - 1048576) / j8) * j8;
                                        }
                                        i7--;
                                        j5 = j9;
                                        z5 = true;
                                    }
                                } else {
                                    j6 = j7;
                                    j = j5;
                                }
                                z4 = true;
                                break;
                            }
                            j = j5;
                            z4 = true;
                            j6 = j7;
                            z5 = false;
                            if (!z5 && fileLoadOperation2.requestInfos.isEmpty()) {
                                fileLoadOperation2.onFinishLoadingFile(r9, r9, r9);
                            }
                        } else {
                            j = j5;
                            z4 = true;
                        }
                        if (fileLoadOperation2.requestedPreloadedBytesRanges == null) {
                            fileLoadOperation2.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        fileLoadOperation2.requestedPreloadedBytesRanges.put(Long.valueOf(j6), Integer.valueOf(z4 ? 1 : 0));
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("start next preload from " + j6 + " size " + fileLoadOperation2.totalBytesCount + " for " + fileLoadOperation2.cacheFilePreload);
                        }
                        fileLoadOperation2.preloadNotRequestedBytesCount -= fileLoadOperation2.currentDownloadChunkSize;
                        j3 = j6;
                        z = z4;
                    } else {
                        j = j5;
                        z = 1;
                        z = 1;
                        ArrayList<Range> arrayList2 = fileLoadOperation2.notRequestedBytesRanges;
                        if (arrayList2 != null) {
                            long j11 = fileLoadOperation2.streamPriorityStartOffset;
                            if (j11 == j) {
                                j11 = fileLoadOperation2.streamStartOffset;
                            }
                            int size = arrayList2.size();
                            long j12 = Long.MAX_VALUE;
                            int i8 = 0;
                            long j13 = Long.MAX_VALUE;
                            while (true) {
                                if (i8 >= size) {
                                    j2 = j13;
                                    break;
                                }
                                Range range = fileLoadOperation2.notRequestedBytesRanges.get(i8);
                                if (j11 != j) {
                                    if (range.start <= j11 && range.end > j11) {
                                        j2 = j11;
                                        j12 = Long.MAX_VALUE;
                                        break;
                                    } else if (j11 < range.start && range.start < j13) {
                                        j13 = range.start;
                                    }
                                }
                                j12 = Math.min(j12, range.start);
                                i8++;
                            }
                            if (j2 == Long.MAX_VALUE) {
                                if (j12 == Long.MAX_VALUE) {
                                    boolean z7 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                j3 = j12;
                            }
                        } else {
                            j2 = fileLoadOperation2.requestedBytesCount;
                        }
                        j3 = j2;
                    }
                    int i9 = fileLoadOperation2.preloadPrefixSize;
                    if (i9 > 0 && j3 >= i9 && fileLoadOperation2.canFinishPreload()) {
                        boolean z8 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    long j14 = fileLoadOperation2.totalBytesCount;
                    if (j14 > j && j3 > j && j3 >= j14) {
                        boolean z9 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    if (!fileLoadOperation2.isPreloadVideoOperation && (arrayList = fileLoadOperation2.notRequestedBytesRanges) != null) {
                        fileLoadOperation2.addPart(arrayList, j3, fileLoadOperation2.currentDownloadChunkSize + j3, false);
                        boolean z10 = BuildVars.DEBUG_VERSION;
                    }
                    long j15 = fileLoadOperation2.totalBytesCount;
                    boolean z11 = j15 <= j || i3 == i2 + (-1) || (j15 > j && ((long) fileLoadOperation2.currentDownloadChunkSize) + j3 >= j15);
                    if (i == -1) {
                        i4 = fileLoadOperation2.requestsCount % 2 == 0 ? 2 : 65538;
                    } else {
                        i4 = i;
                    }
                    int i10 = fileLoadOperation2.isForceRequest ? 32 : 0;
                    if (fileLoadOperation2.isCdn) {
                        TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                        tL_upload_getCdnFile.file_token = fileLoadOperation2.cdnToken;
                        tL_upload_getCdnFile.offset = j3;
                        tL_upload_getCdnFile.limit = fileLoadOperation2.currentDownloadChunkSize;
                        i10 |= z;
                        tL_upload_getFile = tL_upload_getCdnFile;
                    } else if (fileLoadOperation2.webLocation != null) {
                        TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                        tL_upload_getWebFile.location = fileLoadOperation2.webLocation;
                        tL_upload_getWebFile.offset = (int) j3;
                        tL_upload_getWebFile.limit = fileLoadOperation2.currentDownloadChunkSize;
                        tL_upload_getFile = tL_upload_getWebFile;
                    } else {
                        TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                        tL_upload_getFile2.location = fileLoadOperation2.location;
                        tL_upload_getFile2.offset = j3;
                        tL_upload_getFile2.limit = fileLoadOperation2.currentDownloadChunkSize;
                        tL_upload_getFile2.cdn_supported = z;
                        tL_upload_getFile = tL_upload_getFile2;
                    }
                    fileLoadOperation2.requestedBytesCount += fileLoadOperation2.currentDownloadChunkSize;
                    final RequestInfo requestInfo = new RequestInfo();
                    fileLoadOperation2.requestInfos.add(requestInfo);
                    requestInfo.offset = j3;
                    requestInfo.chunkSize = fileLoadOperation2.currentDownloadChunkSize;
                    requestInfo.forceSmallChunk = fileLoadOperation2.forceSmallChunk;
                    requestInfo.connectionType = i4;
                    if (!fileLoadOperation2.isPreloadVideoOperation && fileLoadOperation2.supportsPreloading && fileLoadOperation2.preloadStream != null && (hashMap = fileLoadOperation2.preloadedBytesRanges) != null && (preloadRange = hashMap.get(Long.valueOf(requestInfo.offset))) != null) {
                        requestInfo.response = new TLRPC.TL_upload_file();
                        try {
                            if (BuildVars.DEBUG_VERSION) {
                                try {
                                    if (preloadRange.length > 2147483647L) {
                                        throw new RuntimeException("cast long to integer");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                            fileLoadOperation2.preloadStream.seek(preloadRange.fileOffset);
                            fileLoadOperation2.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                            z3 = false;
                            z2 = false;
                        } catch (Exception unused2) {
                            z3 = false;
                        }
                        try {
                            nativeByteBuffer.buffer.position(0);
                            requestInfo.response.bytes = nativeByteBuffer;
                            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FileLoadOperation.$r8$lambda$drnn5CDhM9_HquwsfjxFQMbcgpg(FileLoadOperation.this, requestInfo);
                                }
                            });
                            j4 = j;
                        } catch (Exception unused3) {
                            z2 = z3;
                            if (fileLoadOperation2.streamPriorityStartOffset == j) {
                            }
                            inputFileLocation = fileLoadOperation2.location;
                            if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            }
                            requestInfo.forceSmallChunk = fileLoadOperation2.forceSmallChunk;
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            int i11 = i10 | 2048;
                            final int i12 = !fileLoadOperation2.isCdn ? fileLoadOperation2.cdnDatacenterId : fileLoadOperation2.datacenterId;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(fileLoadOperation2.currentAccount);
                            final FileLoadOperation fileLoadOperation3 = fileLoadOperation2;
                            fileLoadOperation2 = fileLoadOperation3;
                            final int sendRequestSync = connectionsManager.sendRequestSync(tL_upload_getFile, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    FileLoadOperation.$r8$lambda$cms_68n3kdyASkghRjcxI-fsFy8(FileLoadOperation.this, requestInfo, i12, i4, tL_upload_getFile, tLObject, tL_error);
                                }
                            }, null, null, i11, i12, i4, z11);
                            requestInfo.requestToken = sendRequestSync;
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FileLoadOperation.this.uiRequestTokens.add(Integer.valueOf(sendRequestSync));
                                }
                            });
                            i5 = 1;
                            fileLoadOperation2.requestsCount++;
                            i3 += i5;
                            j5 = j4;
                            i6 = 2;
                            z5 = true;
                            fileLoadOperation2 = fileLoadOperation2;
                            r9 = z2;
                        }
                        i5 = 1;
                        i3 += i5;
                        j5 = j4;
                        i6 = 2;
                        z5 = true;
                        fileLoadOperation2 = fileLoadOperation2;
                        r9 = z2;
                    }
                    z2 = false;
                    if (fileLoadOperation2.streamPriorityStartOffset == j) {
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("frame get offset = " + fileLoadOperation2.streamPriorityStartOffset);
                        }
                        j4 = j;
                        fileLoadOperation2.streamPriorityStartOffset = j4;
                        fileLoadOperation2.priorityRequestInfo = requestInfo;
                    } else {
                        j4 = j;
                    }
                    inputFileLocation = fileLoadOperation2.location;
                    if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j4) {
                        requestInfo.forceSmallChunk = fileLoadOperation2.forceSmallChunk;
                        if (BuildVars.LOGS_ENABLED) {
                            requestInfo.requestStartTime = System.currentTimeMillis();
                        }
                        int i112 = i10 | 2048;
                        final int i122 = !fileLoadOperation2.isCdn ? fileLoadOperation2.cdnDatacenterId : fileLoadOperation2.datacenterId;
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(fileLoadOperation2.currentAccount);
                        final FileLoadOperation fileLoadOperation32 = fileLoadOperation2;
                        fileLoadOperation2 = fileLoadOperation32;
                        final int sendRequestSync2 = connectionsManager2.sendRequestSync(tL_upload_getFile, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                FileLoadOperation.$r8$lambda$cms_68n3kdyASkghRjcxI-fsFy8(FileLoadOperation.this, requestInfo, i122, i4, tL_upload_getFile, tLObject, tL_error);
                            }
                        }, null, null, i112, i122, i4, z11);
                        requestInfo.requestToken = sendRequestSync2;
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("debug_loading: " + fileLoadOperation2.cacheFileFinal.getName() + " dc=" + i122 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i4 + " priority=" + fileLoadOperation2.priority);
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.this.uiRequestTokens.add(Integer.valueOf(sendRequestSync2));
                            }
                        });
                        i5 = 1;
                        fileLoadOperation2.requestsCount++;
                        i3 += i5;
                        j5 = j4;
                        i6 = 2;
                        z5 = true;
                        fileLoadOperation2 = fileLoadOperation2;
                        r9 = z2;
                    } else {
                        fileLoadOperation2.requestReference(requestInfo);
                        z2 = z2;
                        i5 = 1;
                        i3 += i5;
                        j5 = j4;
                        i6 = 2;
                        z5 = true;
                        fileLoadOperation2 = fileLoadOperation2;
                        r9 = z2;
                    }
                }
            }
            i2 = max;
            if (!fileLoadOperation.requestedReference) {
                FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
            }
            i3 = 0;
            final FileLoadOperation fileLoadOperation22 = fileLoadOperation;
            while (i3 < i2) {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$drnn5CDhM9_HquwsfjxFQMbcgpg(FileLoadOperation fileLoadOperation, RequestInfo requestInfo) {
        fileLoadOperation.processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    public static /* synthetic */ void $r8$lambda$cms_68n3kdyASkghRjcxI-fsFy8(final FileLoadOperation fileLoadOperation, final RequestInfo requestInfo, int i, final int i2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        fileLoadOperation.getClass();
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!fileLoadOperation.requestInfos.contains(requestInfo)) {
            if (!fileLoadOperation.cancelledRequestInfos.contains(requestInfo)) {
                return;
            }
            int i3 = 0;
            boolean z = false;
            while (i3 < fileLoadOperation.requestInfos.size()) {
                RequestInfo requestInfo2 = fileLoadOperation.requestInfos.get(i3);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (!z) {
                        fileLoadOperation.requestInfos.set(i3, requestInfo);
                        z = true;
                    } else {
                        fileLoadOperation.requestInfos.remove(i3);
                        i3--;
                    }
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 < fileLoadOperation.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = fileLoadOperation.cancelledRequestInfos.get(i4);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                fileLoadOperation.cancelledRequestInfos.remove(i4);
                i4 += -1;
            }
            i4++;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " time=" + (System.currentTimeMillis() - requestInfo.requestStartTime) + " dcId=" + i + " cdn=" + fileLoadOperation.isCdn + " conType=" + i2 + " reqId" + requestInfo.requestToken);
        }
        if (requestInfo == fileLoadOperation.priorityRequestInfo) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("frame get request completed " + fileLoadOperation.priorityRequestInfo.offset);
            }
            fileLoadOperation.priorityRequestInfo = null;
        }
        if (tL_error != null) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            if (tL_error.code == -2000) {
                fileLoadOperation.requestInfos.remove(requestInfo);
                fileLoadOperation.requestedBytesCount -= requestInfo.chunkSize;
                fileLoadOperation.removePart(fileLoadOperation.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + requestInfo.chunkSize);
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                fileLoadOperation.requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                fileLoadOperation.isCdn = false;
                fileLoadOperation.clearOperation(requestInfo, false, false);
                fileLoadOperation.startDownloadRequest(i2);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i5 = 0; i5 < tL_upload_fileCdnRedirect.file_hashes.size(); i5++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i5);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
            if (bArr2 == null || (bArr = tL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                Runnable runnable2 = requestInfo.whenCancelled;
                if (runnable2 != null) {
                    runnable2.run();
                }
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "bad redirect response";
                tL_error2.code = 400;
                fileLoadOperation.processRequestResult(requestInfo, tL_error2);
                return;
            }
            fileLoadOperation.isCdn = true;
            if (fileLoadOperation.notCheckedCdnRanges == null) {
                ArrayList<Range> arrayList = new ArrayList<>();
                fileLoadOperation.notCheckedCdnRanges = arrayList;
                arrayList.add(new Range(0L, fileLoadOperation.maxCdnParts));
            }
            fileLoadOperation.cdnDatacenterId = tL_upload_fileCdnRedirect.dc_id;
            fileLoadOperation.cdnIv = tL_upload_fileCdnRedirect.encryption_iv;
            fileLoadOperation.cdnKey = tL_upload_fileCdnRedirect.encryption_key;
            fileLoadOperation.cdnToken = tL_upload_fileCdnRedirect.file_token;
            fileLoadOperation.clearOperation(requestInfo, false, false);
            fileLoadOperation.startDownloadRequest(i2);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (fileLoadOperation.reuploadingCdn) {
                return;
            }
            fileLoadOperation.clearOperation(requestInfo, false, false);
            fileLoadOperation.reuploadingCdn = true;
            TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
            tL_upload_reuploadCdnFile.file_token = fileLoadOperation.cdnToken;
            tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
            ConnectionsManager.getInstance(fileLoadOperation.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error3) {
                    FileLoadOperation.$r8$lambda$xIsS8tcOFL4CbN7Yw5q_YGpbhjY(FileLoadOperation.this, i2, requestInfo, tLObject3, tL_error3);
                }
            }, null, null, 0, fileLoadOperation.datacenterId, 1, true);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_file) {
            requestInfo.response = (TLRPC.TL_upload_file) tLObject2;
        } else if (tLObject2 instanceof TLRPC.TL_upload_webFile) {
            requestInfo.responseWeb = (TLRPC.TL_upload_webFile) tLObject2;
            if (fileLoadOperation.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                fileLoadOperation.totalBytesCount = requestInfo.responseWeb.size;
            }
        } else {
            requestInfo.responseCdn = (TLRPC.TL_upload_cdnFile) tLObject2;
        }
        if (tLObject2 != null) {
            int i6 = fileLoadOperation.currentType;
            if (i6 == 50331648) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i6 == 33554432) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i6 == 16777216) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i6 == 67108864) {
                String str = fileLoadOperation.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || fileLoadOperation.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                }
            }
        }
        fileLoadOperation.processRequestResult(requestInfo, tL_error);
        Runnable runnable3 = requestInfo.whenCancelled;
        if (runnable3 != null) {
            runnable3.run();
        }
    }

    public static /* synthetic */ void $r8$lambda$xIsS8tcOFL4CbN7Yw5q_YGpbhjY(FileLoadOperation fileLoadOperation, int i, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        fileLoadOperation.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i2);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            fileLoadOperation.startDownloadRequest(i);
            return;
        }
        if (tL_error != null) {
            if (tL_error.text.equals("FILE_TOKEN_INVALID") || tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                fileLoadOperation.isCdn = false;
                fileLoadOperation.clearOperation(requestInfo, false, false);
                fileLoadOperation.startDownloadRequest(i);
                return;
            }
            fileLoadOperation.onFail(false, 0);
        }
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public static long floorDiv(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    public boolean isFinished() {
        return this.state == 3;
    }
}

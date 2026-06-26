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
                FileLoadOperation.this.lambda$setStream$0(fileLoadOperationStream);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStream$0(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (fileLoadOperationStream != null && !this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (fileLoadOperationStream == null || this.state == 1 || this.state == 0) {
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

    private static class PreloadRange {
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
                FileLoadOperation.this.lambda$new$6();
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
                FileLoadOperation.this.lambda$new$6();
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
                FileLoadOperation.this.lambda$new$6();
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
                FileLoadOperation.this.lambda$new$6();
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
                int lambda$removePart$1;
                lambda$removePart$1 = FileLoadOperation.lambda$removePart$1((FileLoadOperation.Range) obj, (FileLoadOperation.Range) obj2);
                return lambda$removePart$1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$removePart$1(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    private void addPart(ArrayList<Range> arrayList, long j, long j2, boolean z) {
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Range range = arrayList.get(i);
            if (j > range.start) {
                if (j2 < range.end) {
                    arrayList.add(0, new Range(range.start, j));
                    range.start = j2;
                } else if (j < range.end) {
                    range.end = j;
                }
                z2 = true;
                break;
            }
            if (j2 >= range.end) {
                arrayList.remove(i);
            } else if (j2 > range.start) {
                range.start = j2;
            }
            z2 = true;
            break;
        }
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
                        FileLoadOperation.this.lambda$addPart$2(arrayList2);
                    }
                };
                this.fileWriteRunnable = runnable;
                dispatchQueue.postRunnable(runnable);
                notifyStreamListeners();
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j + " - " + j2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addPart$2(ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            if (AndroidUtilities.isENOSPC(e)) {
                LaunchActivity.checkFreeDiscSpaceStatic(1);
            } else if (AndroidUtilities.isEROFS(e)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
            }
        }
        if (this.filePartsStream == null) {
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
        synchronized (this) {
            try {
                RandomAccessFile randomAccessFile = this.filePartsStream;
                if (randomAccessFile == null) {
                    return;
                }
                randomAccessFile.seek(0L);
                this.filePartsStream.write(filesQueueByteBuffer.buf, 0, i);
                this.writingToFilePartsStream = false;
                if (this.closeFilePartsStreamOnWriteEnd) {
                    try {
                        this.filePartsStream.getChannel().close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    this.filePartsStream.close();
                    this.filePartsStream = null;
                }
                this.totalTime += System.currentTimeMillis() - currentTimeMillis;
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
                FileLoadOperation.this.lambda$getCurrentFile$3(fileArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return fileArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCurrentFile$3(File[] fileArr, CountDownLatch countDownLatch) {
        if (this.state == 3 && !this.preloadFinished) {
            fileArr[0] = this.cacheFileFinal;
        } else {
            fileArr[0] = this.cacheFileTemp;
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
                FileLoadOperation.this.lambda$getDownloadedLengthFromOffset$4(jArr, j, j2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDownloadedLengthFromOffset$4(long[] jArr, long j, long j2, CountDownLatch countDownLatch) {
        try {
            jArr[0] = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j, j2);
        } catch (Throwable th) {
            FileLog.e(th);
            jArr[0] = 0;
        }
        if (this.state == 3) {
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
                FileLoadOperation.this.lambda$removeStreamListener$5(fileLoadOperationStream);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeStreamListener$5(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            return;
        }
        FileLog.e("FileLoadOperation " + getFileName() + " removing stream listener " + fileLoadOperationStream);
        this.streamListeners.remove(fileLoadOperationStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6() {
        pause();
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(getFileName());
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
                FileLoadOperation.this.lambda$pause$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$7() {
        if (this.isStory) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            clearOperation(null, false, true);
            return;
        }
        for (int i = 0; i < this.requestInfos.size(); i++) {
            ConnectionsManager.getInstance(this.currentAccount).failNotRunningRequest(this.requestInfos.get(i).requestToken);
        }
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0432, code lost:
    
        if (r5 != r29.cacheFileFinal.length()) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0929 A[Catch: Exception -> 0x092f, TRY_LEAVE, TryCatch #0 {Exception -> 0x092f, blocks: (B:242:0x0918, B:244:0x0929), top: B:241:0x0918 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x048e  */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j, final boolean z) {
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
        boolean z2;
        int i;
        int i2;
        boolean z3;
        String str9;
        String str10;
        String str11;
        boolean z4;
        String str12;
        ArrayList<Range> arrayList;
        ?? r1;
        boolean z5;
        long j2;
        RandomAccessFile randomAccessFile;
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
                boolean z6 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z6 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z6 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        boolean z7 = this.state != 0;
        boolean z8 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            final boolean z9 = z7;
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.this.lambda$start$9(z, j, fileLoadOperationStream, z9);
                }
            });
        } else if (z7) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.this.lambda$start$10();
                }
            });
        }
        if (z7) {
            return z8;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j3 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j / j3) * j3;
        if (this.allowDisordererFileSave) {
            long j4 = this.totalBytesCount;
            if (j4 > 0 && j4 > j3) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation != null) {
            String MD5 = Utilities.MD5(this.webFile.url);
            if (this.encryptFile) {
                str6 = MD5 + ".temp.enc";
                str2 = MD5 + "." + this.ext + ".enc";
                if (this.key != null) {
                    str7 = MD5 + "_64.iv.enc";
                    str4 = null;
                    str8 = null;
                    String str13 = str6;
                    str3 = str7;
                    str = str13;
                    this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                    this.cancelledRequestInfos = new ArrayList<>();
                    this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                    this.state = 1;
                    obj = this.parentObject;
                    if (!(obj instanceof TLRPC.TL_theme)) {
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
                            long j5 = this.totalBytesCount;
                            if (j5 != 0) {
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
                    if (exists) {
                        this.cacheFileTemp = new File(this.tempPath, str);
                        if (this.ungzip) {
                            this.cacheFileGzipTemp = new File(this.tempPath, str + ".gz");
                        }
                        String str14 = "rws";
                        if (this.encryptFile) {
                            File file = new File(FileLoader.getInternalCacheDir(), str2 + ".key");
                            try {
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
                                long length = file.length();
                                byte[] bArr = new byte[32];
                                this.encryptKey = bArr;
                                this.encryptIv = new byte[16];
                                if (length > 0 && length % 48 == 0) {
                                    randomAccessFile2.read(bArr, 0, 32);
                                    randomAccessFile2.read(this.encryptIv, 0, 16);
                                    z3 = false;
                                } else {
                                    Utilities.random.nextBytes(bArr);
                                    Utilities.random.nextBytes(this.encryptIv);
                                    randomAccessFile2.write(this.encryptKey);
                                    randomAccessFile2.write(this.encryptIv);
                                    z3 = true;
                                }
                                try {
                                    try {
                                        randomAccessFile2.getChannel().close();
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
                                        i2 = 1;
                                        final boolean[] zArr = new boolean[i2];
                                        zArr[0] = false;
                                        if (this.supportsPreloading) {
                                        }
                                        str9 = str3;
                                        str10 = str4;
                                        str11 = "rws";
                                        z4 = z3;
                                        if (str10 == null) {
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
                                        if (str9 != null) {
                                        }
                                        if (!this.isPreloadVideoOperation) {
                                            copyNotLoadedRanges();
                                        }
                                        updateProgress();
                                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.cacheFileTemp, str12);
                                        this.fileOutputStream = randomAccessFile3;
                                        j2 = this.downloadedBytes;
                                        if (j2 != 0) {
                                        }
                                        r1 = 0;
                                        z5 = true;
                                        if (this.fileOutputStream == null) {
                                        }
                                    }
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                                randomAccessFile2.close();
                            } catch (Exception e3) {
                                e = e3;
                                z3 = false;
                            }
                            i2 = 1;
                        } else {
                            i2 = 1;
                            z3 = false;
                        }
                        final boolean[] zArr2 = new boolean[i2];
                        zArr2[0] = false;
                        if (this.supportsPreloading || str8 == null) {
                            str9 = str3;
                            str10 = str4;
                            str11 = "rws";
                            z4 = z3;
                        } else {
                            this.cacheFilePreload = new File(this.tempPath, str8);
                            try {
                                RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.cacheFilePreload, "rws");
                                this.preloadStream = randomAccessFile4;
                                long length2 = randomAccessFile4.length();
                                this.preloadStreamFileOffset = 1;
                                long j6 = 1;
                                if (length2 > 1) {
                                    zArr2[0] = this.preloadStream.readByte() != 0;
                                    while (j6 < length2) {
                                        if (length2 - j6 < 8) {
                                            break;
                                        }
                                        long readLong = this.preloadStream.readLong();
                                        if (length2 - (j6 + 8) < 8 || readLong < 0) {
                                            break;
                                        }
                                        boolean z10 = z3;
                                        try {
                                            if (readLong <= this.totalBytesCount) {
                                                long readLong2 = this.preloadStream.readLong();
                                                long j7 = j6 + 16;
                                                if (length2 - j7 >= readLong2 && readLong2 <= this.currentDownloadChunkSize) {
                                                    PreloadRange preloadRange = new PreloadRange(j7, readLong2);
                                                    long j8 = j7 + readLong2;
                                                    this.preloadStream.seek(j8);
                                                    if (length2 - j8 >= 24) {
                                                        long j9 = length2;
                                                        long readLong3 = this.preloadStream.readLong();
                                                        this.foundMoovSize = readLong3;
                                                        if (readLong3 != 0) {
                                                            str9 = str3;
                                                            z4 = z10;
                                                            try {
                                                                str10 = str4;
                                                                str11 = str14;
                                                                try {
                                                                    this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                                    this.preloadNotRequestedBytesCount = readLong3;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    FileLog.e((Throwable) e, false);
                                                                    if (!this.isPreloadVideoOperation) {
                                                                        this.cacheFilePreload = null;
                                                                        try {
                                                                            randomAccessFile = this.preloadStream;
                                                                            if (randomAccessFile != null) {
                                                                            }
                                                                        } catch (Exception e5) {
                                                                            FileLog.e(e5);
                                                                        }
                                                                    }
                                                                    if (str10 == null) {
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
                                                                    if (str9 != null) {
                                                                    }
                                                                    if (!this.isPreloadVideoOperation) {
                                                                    }
                                                                    updateProgress();
                                                                    RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.cacheFileTemp, str12);
                                                                    this.fileOutputStream = randomAccessFile32;
                                                                    j2 = this.downloadedBytes;
                                                                    if (j2 != 0) {
                                                                    }
                                                                    r1 = 0;
                                                                    z5 = true;
                                                                    if (this.fileOutputStream == null) {
                                                                    }
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                str10 = str4;
                                                                str11 = str14;
                                                                FileLog.e((Throwable) e, false);
                                                                if (!this.isPreloadVideoOperation) {
                                                                }
                                                                if (str10 == null) {
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
                                                                if (str9 != null) {
                                                                }
                                                                if (!this.isPreloadVideoOperation) {
                                                                }
                                                                updateProgress();
                                                                RandomAccessFile randomAccessFile322 = new RandomAccessFile(this.cacheFileTemp, str12);
                                                                this.fileOutputStream = randomAccessFile322;
                                                                j2 = this.downloadedBytes;
                                                                if (j2 != 0) {
                                                                }
                                                                r1 = 0;
                                                                z5 = true;
                                                                if (this.fileOutputStream == null) {
                                                                }
                                                            }
                                                        } else {
                                                            str9 = str3;
                                                            z4 = z10;
                                                            str10 = str4;
                                                            str11 = str14;
                                                        }
                                                        this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                        this.nextAtomOffset = this.preloadStream.readLong();
                                                        long j10 = j8 + 24;
                                                        if (this.preloadedBytesRanges == null) {
                                                            this.preloadedBytesRanges = new HashMap<>();
                                                        }
                                                        if (this.requestedPreloadedBytesRanges == null) {
                                                            this.requestedPreloadedBytesRanges = new HashMap<>();
                                                        }
                                                        this.preloadedBytesRanges.put(Long.valueOf(readLong), preloadRange);
                                                        this.requestedPreloadedBytesRanges.put(Long.valueOf(readLong), 1);
                                                        this.totalPreloadedBytes = (int) (this.totalPreloadedBytes + readLong2);
                                                        this.preloadStreamFileOffset = (int) (this.preloadStreamFileOffset + readLong2 + 36);
                                                        z3 = z4;
                                                        length2 = j9;
                                                        str4 = str10;
                                                        str14 = str11;
                                                        j6 = j10;
                                                        str3 = str9;
                                                    }
                                                }
                                            }
                                            str9 = str3;
                                            z4 = z10;
                                            str10 = str4;
                                            str11 = str14;
                                            break;
                                        } catch (Exception e7) {
                                            e = e7;
                                            str9 = str3;
                                            z4 = z10;
                                        }
                                    }
                                }
                                str9 = str3;
                                str10 = str4;
                                str11 = str14;
                                z4 = z3;
                                this.preloadStream.seek(this.preloadStreamFileOffset);
                            } catch (Exception e8) {
                                e = e8;
                                str9 = str3;
                                str10 = str4;
                                str11 = str14;
                                z4 = z3;
                            }
                            if (!this.isPreloadVideoOperation && this.preloadedBytesRanges == null) {
                                this.cacheFilePreload = null;
                                randomAccessFile = this.preloadStream;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.getChannel().close();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    this.preloadStream.close();
                                    this.preloadStream = null;
                                }
                            }
                        }
                        if (str10 == null) {
                            this.cacheFileParts = new File(this.tempPath, str10);
                            if (!this.cacheFileTemp.exists()) {
                                this.cacheFileParts.delete();
                            }
                            try {
                                str12 = str11;
                            } catch (Exception e10) {
                                e = e10;
                                str12 = str11;
                            }
                            try {
                                RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileParts, str12);
                                this.filePartsStream = randomAccessFile5;
                                long length3 = randomAccessFile5.length();
                                if (length3 % 8 == 4) {
                                    int readInt = this.filePartsStream.readInt();
                                    if (readInt <= (length3 - 4) / 2) {
                                        for (int i3 = 0; i3 < readInt; i3++) {
                                            long readLong4 = this.filePartsStream.readLong();
                                            long readLong5 = this.filePartsStream.readLong();
                                            this.notLoadedBytesRanges.add(new Range(readLong4, readLong5));
                                            this.notRequestedBytesRanges.add(new Range(readLong4, readLong5));
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                FileLog.e(e, !AndroidUtilities.isFilNotFoundException(e));
                                if (this.fileMetadata != null) {
                                }
                                if (!this.cacheFileTemp.exists()) {
                                }
                                arrayList = this.notLoadedBytesRanges;
                                if (arrayList != null) {
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                }
                                if (str9 != null) {
                                }
                                if (!this.isPreloadVideoOperation) {
                                }
                                updateProgress();
                                RandomAccessFile randomAccessFile3222 = new RandomAccessFile(this.cacheFileTemp, str12);
                                this.fileOutputStream = randomAccessFile3222;
                                j2 = this.downloadedBytes;
                                if (j2 != 0) {
                                }
                                r1 = 0;
                                z5 = true;
                                if (this.fileOutputStream == null) {
                                }
                            }
                        } else {
                            str12 = str11;
                        }
                        if (this.fileMetadata != null) {
                            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                            FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
                        }
                        if (!this.cacheFileTemp.exists()) {
                            ArrayList<Range> arrayList2 = this.notLoadedBytesRanges;
                            if (arrayList2 != null && arrayList2.isEmpty()) {
                                long j11 = 0;
                                this.notLoadedBytesRanges.add(new Range(j11, this.totalBytesCount));
                                this.notRequestedBytesRanges.add(new Range(j11, this.totalBytesCount));
                            }
                        } else if (z4) {
                            this.cacheFileTemp.delete();
                        } else {
                            long length4 = this.cacheFileTemp.length();
                            if (str9 != null && length4 % this.currentDownloadChunkSize != 0) {
                                this.requestedBytesCount = 0L;
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
                        if (str9 != null) {
                            this.cacheIvTemp = new File(this.tempPath, str9);
                            try {
                                this.fiv = new RandomAccessFile(this.cacheIvTemp, str12);
                                long j12 = 0;
                                if (this.downloadedBytes != 0 && !z4) {
                                    long length5 = this.cacheIvTemp.length();
                                    if (length5 > 0) {
                                        if (length5 % 64 == 0) {
                                            this.fiv.read(this.iv, 0, 64);
                                        } else {
                                            j12 = 0;
                                        }
                                    }
                                    this.downloadedBytes = j12;
                                    this.requestedBytesCount = j12;
                                }
                            } catch (Exception e12) {
                                this.downloadedBytes = 0L;
                                this.requestedBytesCount = 0L;
                                if (AndroidUtilities.isENOSPC(e12)) {
                                    LaunchActivity.checkFreeDiscSpaceStatic(1);
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
                            RandomAccessFile randomAccessFile32222 = new RandomAccessFile(this.cacheFileTemp, str12);
                            this.fileOutputStream = randomAccessFile32222;
                            j2 = this.downloadedBytes;
                            if (j2 != 0) {
                                randomAccessFile32222.seek(j2);
                            }
                            r1 = 0;
                            z5 = true;
                        } catch (Exception e13) {
                            r1 = 0;
                            FileLog.e((Throwable) e13, false);
                            if (AndroidUtilities.isENOSPC(e13)) {
                                LaunchActivity.checkFreeDiscSpaceStatic(1);
                                onFail(true, -1);
                                return false;
                            }
                            z5 = true;
                            if (AndroidUtilities.isEROFS(e13)) {
                                SharedConfig.checkSdCard(this.cacheFileFinal);
                                FileLog.e((Throwable) e13, false);
                                onFail(true, -1);
                                return false;
                            }
                        }
                        if (this.fileOutputStream == null) {
                            onFail(z5, r1);
                            return r1;
                        }
                        this.started = z5;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda19
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.this.lambda$start$11(zArr2);
                            }
                        });
                    } else {
                        this.started = true;
                        try {
                            onFinishLoadingFile(false, 1, false);
                            FilePathDatabase.PathData pathData = this.pathSaveData;
                            if (pathData != null) {
                                this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                            }
                        } catch (Exception e14) {
                            FileLog.e((Throwable) e14, false);
                            if (AndroidUtilities.isENOSPC(e14)) {
                                z2 = true;
                                LaunchActivity.checkFreeDiscSpaceStatic(1);
                                i = -1;
                                onFail(true, -1);
                            } else {
                                z2 = true;
                                i = -1;
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
                    return true;
                }
                str = str6;
                str3 = null;
            } else {
                String str15 = MD5 + ".temp";
                String str16 = MD5 + "." + this.ext;
                if (this.key != null) {
                    str3 = MD5 + "_64.iv";
                    str = str15;
                    str2 = str16;
                } else {
                    str = str15;
                    str2 = str16;
                    str3 = null;
                }
            }
        } else {
            TLRPC.InputFileLocation inputFileLocation = this.location;
            long j13 = inputFileLocation.volume_id;
            if (j13 != 0 && inputFileLocation.local_id != 0) {
                int i5 = this.datacenterId;
                if (i5 == Integer.MIN_VALUE || j13 == -2147483648L || i5 == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    str6 = this.location.volume_id + "_" + this.location.local_id + ".temp.enc";
                    str2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext + ".enc";
                    if (this.key != null) {
                        str7 = this.location.volume_id + "_" + this.location.local_id + "_64.iv.enc";
                        str4 = null;
                        str8 = null;
                        String str132 = str6;
                        str3 = str7;
                        str = str132;
                        this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                        this.cancelledRequestInfos = new ArrayList<>();
                        this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                        this.state = 1;
                        obj = this.parentObject;
                        if (!(obj instanceof TLRPC.TL_theme)) {
                        }
                        exists = this.cacheFileFinal.exists();
                        this.cacheFileFinalReady = exists;
                        if (exists) {
                        }
                        if (exists) {
                        }
                        return true;
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
                    if (!(obj instanceof TLRPC.TL_theme)) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (exists) {
                    }
                    return true;
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
                        str4 = null;
                        str8 = null;
                        String str1322 = str6;
                        str3 = str7;
                        str = str1322;
                        this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
                        this.cancelledRequestInfos = new ArrayList<>();
                        this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
                        this.state = 1;
                        obj = this.parentObject;
                        if (!(obj instanceof TLRPC.TL_theme)) {
                        }
                        exists = this.cacheFileFinal.exists();
                        this.cacheFileFinalReady = exists;
                        if (exists) {
                        }
                        if (exists) {
                        }
                        return true;
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
                    if (!(obj instanceof TLRPC.TL_theme)) {
                    }
                    exists = this.cacheFileFinal.exists();
                    this.cacheFileFinalReady = exists;
                    if (exists) {
                    }
                    if (exists) {
                    }
                    return true;
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
        if (!(obj instanceof TLRPC.TL_theme)) {
        }
        exists = this.cacheFileFinal.exists();
        this.cacheFileFinalReady = exists;
        if (exists) {
        }
        if (exists) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$9(boolean z, long j, FileLoadOperationStream fileLoadOperationStream, boolean z2) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z) {
            long j2 = this.currentDownloadChunkSize;
            long j3 = (j / j2) * j2;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j3) {
                RequestInfo requestInfo2 = this.priorityRequestInfo;
                final int i = requestInfo2.requestToken;
                this.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLoadOperation.this.lambda$start$8(i);
                    }
                });
                this.requestedBytesCount -= this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.currentDownloadChunkSize + this.priorityRequestInfo.offset);
                if (this.priorityRequestInfo.requestToken != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.priorityRequestInfo.requestToken, true);
                    this.requestsCount--;
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get cancel request at offset " + this.priorityRequestInfo.offset);
                }
                this.priorityRequestInfo = null;
            }
            if (this.priorityRequestInfo == null) {
                this.streamPriorityStartOffset = j3;
            }
        } else {
            long j4 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j / j4) * j4;
        }
        if (!this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (z2) {
            if (this.preloadedBytesRanges != null && getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, this.streamStartOffset, 1L) == 0 && this.preloadedBytesRanges.get(Long.valueOf(this.streamStartOffset)) != null) {
                this.nextPartWasPreloaded = true;
            }
            startDownloadRequest(-1);
            this.nextPartWasPreloaded = false;
        }
        if (this.notLoadedBytesRanges != null) {
            notifyStreamListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$8(int i) {
        this.uiRequestTokens.remove(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$10() {
        startDownloadRequest(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$11(boolean[] zArr) {
        boolean z = this.isPreloadVideoOperation && zArr[0];
        int i = this.preloadPrefixSize;
        boolean z2 = i > 0 && this.downloadedBytes >= ((long) i) && canFinishPreload();
        long j = this.totalBytesCount;
        if (j != 0 && (z || this.downloadedBytes == j || z2)) {
            try {
                onFinishLoadingFile(false, 1, true);
                return;
            } catch (Exception unused) {
                onFail(true, 0);
                return;
            }
        }
        startDownloadRequest(-1);
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
                                FileLoadOperation.this.lambda$setIsPreloadVideoOperation$12(z);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsPreloadVideoOperation$12(boolean z) {
        this.requestedBytesCount = 0L;
        clearOperation(null, true, true);
        this.isPreloadVideoOperation = z;
        startDownloadRequest(-1);
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
                FileLoadOperation.this.lambda$cancel$13(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelOnStage, reason: merged with bridge method [inline-methods] */
    public void lambda$cancel$13(boolean z) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.this.lambda$cancelOnStage$14();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelOnStage$14() {
        if (this.state == 5) {
            onFail(false, 1);
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
                                FileLoadOperation.lambda$cancelRequests$15(FileLoadOperation.RequestInfo.this, iArr, runnable);
                            }
                        };
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.lambda$cancelRequests$16(FileLoadOperation.RequestInfo.this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelRequests$15(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelRequests$16(RequestInfo requestInfo) {
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
                    FileLoadOperation.this.lambda$onFinishLoadingFile$20(file, file2, file3, file4, z);
                }
            });
            this.cacheIvTemp = null;
            this.cacheFileParts = null;
            this.cacheFilePreload = null;
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #1 {all -> 0x0120, blocks: (B:45:0x0112, B:47:0x011a), top: B:44:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$onFinishLoadingFile$20(File file, File file2, File file3, File file4, final boolean z) {
        Throwable th;
        File file5;
        boolean copyFile;
        String str;
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
            if (this.ungzip) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file4));
                    FileLoader.copyFile(gZIPInputStream, this.cacheFileGzipTemp, 2097152);
                    gZIPInputStream.close();
                    file4.delete();
                    file5 = this.cacheFileGzipTemp;
                    try {
                        this.ungzip = false;
                    } catch (ZipException unused) {
                        file4 = file5;
                        this.ungzip = false;
                        if (!this.ungzip) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("unable to ungzip temp = " + file4 + " to final = " + this.cacheFileFinal);
                        }
                        file4 = file5;
                        if (!this.ungzip) {
                        }
                    }
                } catch (ZipException unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    file5 = file4;
                }
                file4 = file5;
            }
            if (!this.ungzip) {
                if (this.parentObject instanceof TLRPC.TL_theme) {
                    try {
                        copyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
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
                                FileLoadOperation.this.lambda$onFinishLoadingFile$19(z);
                            }
                        });
                    }
                } else {
                    try {
                        if (this.pathSaveData != null) {
                            synchronized (lockObject) {
                                try {
                                    this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                                    int i = 1;
                                    while (this.cacheFileFinal.exists()) {
                                        int lastIndexOf = this.storeFileName.lastIndexOf(46);
                                        if (lastIndexOf > 0) {
                                            str = this.storeFileName.substring(0, lastIndexOf) + " (" + i + ")" + this.storeFileName.substring(lastIndexOf);
                                        } else {
                                            str = this.storeFileName + " (" + i + ")";
                                        }
                                        this.cacheFileFinal = new File(this.storePath, str);
                                        i++;
                                    }
                                } finally {
                                }
                            }
                        }
                        copyFile = file4.renameTo(this.cacheFileFinal);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        copyFile = false;
                        if (!copyFile) {
                            try {
                                copyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
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
                                FileLoadOperation.this.lambda$onFinishLoadingFile$19(z);
                            }
                        });
                    }
                }
                if (!copyFile && this.renameRetryCount == 3) {
                    copyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                    if (copyFile) {
                        this.cacheFileFinal.delete();
                    }
                }
                if (!copyFile) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                    }
                    int i2 = this.renameRetryCount + 1;
                    this.renameRetryCount = i2;
                    if (i2 < 3) {
                        this.state = 1;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda28
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.this.lambda$onFinishLoadingFile$17(z);
                            }
                        }, 200L);
                        return;
                    } else {
                        this.cacheFileFinal = file4;
                        this.cacheFileFinalReady = false;
                    }
                } else {
                    this.cacheFileFinalReady = true;
                    if (this.pathSaveData != null && this.cacheFileFinal.exists()) {
                        this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                    }
                }
            } else {
                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLoadOperation.this.lambda$onFinishLoadingFile$18();
                    }
                });
                return;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                FileLoadOperation.this.lambda$onFinishLoadingFile$19(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$17(boolean z) {
        try {
            onFinishLoadingFile(z, 0, false);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$18() {
        onFail(false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$19(boolean z) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + this.cacheFileFinal + " time = " + (System.currentTimeMillis() - this.startTime) + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
        }
        if (z) {
            int i = this.currentType;
            if (i == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i == 67108864) {
                String str = this.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                }
            }
        }
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
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
                FileLoadOperation.this.lambda$requestFileOffsets$21(tLObject, tL_error);
            }
        }, null, null, 0, this.datacenterId, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFileOffsets$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            onFail(false, 0);
            return;
        }
        if (tLObject instanceof Vector) {
            this.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i = 0; i < vector.objects.size(); i++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i2 = 0; i2 < this.delayedRequestInfos.size(); i2++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i2);
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    this.delayedRequestInfos.remove(i2);
                    if (processRequestResult(requestInfo, null)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0419, code lost:
    
        if (r1 == (r5 - r3)) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0602 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x060a A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0264 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ce A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0322 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0361 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c8 A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x056a A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x057e A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:67:0x0087, B:69:0x008b, B:71:0x0095, B:73:0x009c, B:75:0x00a2, B:78:0x00c7, B:80:0x00d1, B:82:0x00d9, B:84:0x00e7, B:86:0x00f5, B:89:0x00fc, B:91:0x0110, B:92:0x0145, B:94:0x0149, B:96:0x016d, B:97:0x0196, B:99:0x019a, B:100:0x01a1, B:102:0x01cc, B:104:0x01de, B:106:0x01f3, B:107:0x0209, B:108:0x0214, B:109:0x01ff, B:110:0x020c, B:111:0x0216, B:113:0x0239, B:115:0x023d, B:117:0x0243, B:119:0x0249, B:124:0x0255, B:126:0x0594, B:128:0x059c, B:130:0x05a8, B:132:0x05b3, B:135:0x05b6, B:137:0x05c2, B:139:0x05c8, B:140:0x05d7, B:142:0x05dd, B:143:0x05ec, B:145:0x05f2, B:147:0x0602, B:148:0x060a, B:150:0x060f, B:152:0x0614, B:155:0x0264, B:157:0x0268, B:159:0x0272, B:163:0x0284, B:165:0x0288, B:167:0x028d, B:169:0x0293, B:173:0x029f, B:176:0x02c5, B:178:0x02ce, B:180:0x02e7, B:182:0x02ef, B:187:0x0301, B:188:0x0317, B:189:0x0318, B:190:0x031e, B:192:0x0322, B:193:0x035d, B:195:0x0361, B:197:0x036e, B:198:0x03a5, B:200:0x03c8, B:202:0x03da, B:204:0x03ea, B:207:0x03f2, B:209:0x0407, B:211:0x040e, B:213:0x0416, B:215:0x0426, B:217:0x0436, B:218:0x0448, B:223:0x0456, B:224:0x045d, B:225:0x045e, B:227:0x046d, B:228:0x04ad, B:230:0x04bc, B:232:0x04c0, B:234:0x04c4, B:235:0x0510, B:237:0x0514, B:239:0x0533, B:241:0x053c, B:242:0x0566, B:244:0x056a, B:245:0x0576, B:247:0x057e, B:249:0x0583, B:257:0x0554, B:265:0x02ac, B:269:0x02b4, B:277:0x061a, B:279:0x00a9, B:281:0x00af, B:282:0x00b6, B:284:0x00bc), top: B:66:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        boolean z;
        byte[] bArr;
        String str;
        String str2;
        boolean z2;
        RandomAccessFile randomAccessFile;
        boolean z3;
        long j;
        long j2;
        boolean z4;
        int i;
        int i2;
        Integer num;
        boolean z5 = false;
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
                FileLoadOperation.this.lambda$processRequestResult$22(i3);
            }
        });
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
                            long j3 = requestInfo.offset;
                            long j4 = this.cdnChunkCheckSize;
                            long j5 = (j3 / j4) * j4;
                            HashMap<Long, TLRPC.TL_fileHash> hashMap = this.cdnHashes;
                            if ((hashMap != null ? hashMap.get(Long.valueOf(j5)) : null) == null) {
                                delayRequestInfo(requestInfo);
                                requestFileOffsets(j5);
                                return true;
                            }
                        }
                        if (requestInfo.responseCdn != null) {
                            long j6 = requestInfo.offset / 16;
                            byte[] bArr2 = this.cdnIv;
                            bArr2[15] = (byte) (j6 & 255);
                            bArr2[14] = (byte) ((j6 >> 8) & 255);
                            bArr2[13] = (byte) ((j6 >> 16) & 255);
                            bArr2[12] = (byte) ((j6 >> 24) & 255);
                            Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr2, 0, nativeByteBuffer.limit());
                        }
                        if (this.isPreloadVideoOperation) {
                            this.preloadStream.writeLong(requestInfo.offset);
                            long j7 = limit;
                            this.preloadStream.writeLong(j7);
                            this.preloadStreamFileOffset += 16;
                            this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + limit);
                            }
                            if (this.preloadedBytesRanges == null) {
                                this.preloadedBytesRanges = new HashMap<>();
                            }
                            this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j7));
                            this.totalPreloadedBytes += limit;
                            this.preloadStreamFileOffset += limit;
                            if (this.moovFound == 0) {
                                long findNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                                if (findNextPreloadDownloadOffset < 0) {
                                    findNextPreloadDownloadOffset *= -1;
                                    long j8 = this.nextPreloadDownloadOffset + this.currentDownloadChunkSize;
                                    this.nextPreloadDownloadOffset = j8;
                                    if (j8 < this.totalBytesCount / 2) {
                                        long j9 = 1048576 + findNextPreloadDownloadOffset;
                                        this.foundMoovSize = j9;
                                        this.preloadNotRequestedBytesCount = j9;
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
                            long j10 = this.nextPreloadDownloadOffset;
                            if (j10 != 0 && ((this.moovFound == 0 || this.foundMoovSize >= 0) && this.totalPreloadedBytes <= 2097152 && j10 < this.totalBytesCount)) {
                                z3 = false;
                                if (!z3) {
                                    this.preloadStream.seek(0L);
                                    this.preloadStream.write(1);
                                } else if (this.moovFound != 0) {
                                    this.foundMoovSize -= this.currentDownloadChunkSize;
                                }
                            }
                            z3 = true;
                            if (!z3) {
                            }
                        } else {
                            long j11 = limit;
                            long j12 = this.downloadedBytes + j11;
                            this.downloadedBytes = j12;
                            long j13 = this.totalBytesCount;
                            if (j13 > 0) {
                                if (j12 < j13 && ((i = this.preloadPrefixSize) <= 0 || j12 < i || !canFinishPreload() || !this.requestInfos.isEmpty())) {
                                    z4 = false;
                                    z = z4;
                                    if (this.downloadedBytes < this.totalBytesCount) {
                                        z5 = true;
                                        boolean z6 = BuildVars.DEBUG_VERSION;
                                        bArr = this.key;
                                        if (bArr != null) {
                                            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer.limit());
                                            if (z && this.bytesCountPadding != 0) {
                                                str = " local_id = ";
                                                long limit2 = nativeByteBuffer.limit() - this.bytesCountPadding;
                                                if (BuildVars.DEBUG_VERSION && limit2 > 2147483647L) {
                                                    throw new RuntimeException("Out of limit" + limit2);
                                                }
                                                nativeByteBuffer.limit((int) limit2);
                                                if (this.encryptFile) {
                                                    long j14 = requestInfo.offset / 16;
                                                    byte[] bArr3 = this.encryptIv;
                                                    str2 = str;
                                                    bArr3[15] = (byte) (j14 & 255);
                                                    bArr3[14] = (byte) ((j14 >> 8) & 255);
                                                    bArr3[13] = (byte) ((j14 >> 16) & 255);
                                                    bArr3[12] = (byte) ((j14 >> 24) & 255);
                                                    Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer.limit());
                                                } else {
                                                    str2 = str;
                                                }
                                                if (this.notLoadedBytesRanges != null) {
                                                    this.fileOutputStream.seek(requestInfo.offset);
                                                    if (BuildVars.DEBUG_VERSION) {
                                                        FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                                                    }
                                                }
                                                this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                                                String str4 = str2;
                                                addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j11, true);
                                                if (this.isCdn) {
                                                    long j15 = requestInfo.offset / this.cdnChunkCheckSize;
                                                    int size = this.notCheckedCdnRanges.size();
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 >= size) {
                                                            break;
                                                        }
                                                        Range range = this.notCheckedCdnRanges.get(i4);
                                                        if (range.start > j15 || j15 > range.end) {
                                                            i4++;
                                                            str3 = str3;
                                                            z = z;
                                                        } else {
                                                            long j16 = this.cdnChunkCheckSize;
                                                            long j17 = j15 * j16;
                                                            long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j17, j16);
                                                            if (downloadedLengthFromOffsetInternal != 0) {
                                                                if (downloadedLengthFromOffsetInternal != this.cdnChunkCheckSize) {
                                                                    long j18 = this.totalBytesCount;
                                                                    j = j17;
                                                                    if (j18 > 0) {
                                                                    }
                                                                    if (j18 <= 0 && z) {
                                                                    }
                                                                } else {
                                                                    j = j17;
                                                                }
                                                                TLRPC.TL_fileHash tL_fileHash = this.cdnHashes.get(Long.valueOf(j));
                                                                if (this.fileReadStream == null) {
                                                                    this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                                    this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                                                }
                                                                this.fileReadStream.seek(j);
                                                                if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > 2147483647L) {
                                                                    throw new RuntimeException("!!!");
                                                                }
                                                                z2 = z;
                                                                this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                                                if (this.encryptFile) {
                                                                    long j19 = j / 16;
                                                                    byte[] bArr4 = this.encryptIv;
                                                                    j2 = j;
                                                                    bArr4[15] = (byte) (j19 & 255);
                                                                    bArr4[14] = (byte) ((j19 >> 8) & 255);
                                                                    bArr4[13] = (byte) ((j19 >> 16) & 255);
                                                                    bArr4[12] = (byte) ((j19 >> 24) & 255);
                                                                    Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                                                } else {
                                                                    j2 = j;
                                                                }
                                                                if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, downloadedLengthFromOffsetInternal), tL_fileHash.hash)) {
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                        if (this.location != null) {
                                                                            FileLog.e("invalid cdn hash " + this.location + " id = " + this.location.id + str4 + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + str3 + this.location.secret);
                                                                        } else if (this.webLocation != null) {
                                                                            FileLog.e("invalid cdn hash  " + this.webLocation + " id = " + this.fileName);
                                                                        }
                                                                    }
                                                                    onFail(false, 0);
                                                                    this.cacheFileTemp.delete();
                                                                    return false;
                                                                }
                                                                this.cdnHashes.remove(Long.valueOf(j2));
                                                                addPart(this.notCheckedCdnRanges, j15, j15 + 1, false);
                                                            }
                                                        }
                                                    }
                                                }
                                                z2 = z;
                                                randomAccessFile = this.fiv;
                                                if (randomAccessFile != null) {
                                                    randomAccessFile.seek(0L);
                                                    this.fiv.write(this.iv);
                                                }
                                                if (this.totalBytesCount > 0 && this.state == 1) {
                                                    copyNotLoadedRanges();
                                                    this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                                                }
                                                z3 = z2;
                                            }
                                        }
                                        str = " local_id = ";
                                        if (this.encryptFile) {
                                        }
                                        if (this.notLoadedBytesRanges != null) {
                                        }
                                        this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                                        String str42 = str2;
                                        addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j11, true);
                                        if (this.isCdn) {
                                        }
                                        z2 = z;
                                        randomAccessFile = this.fiv;
                                        if (randomAccessFile != null) {
                                        }
                                        if (this.totalBytesCount > 0) {
                                            copyNotLoadedRanges();
                                            this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                                        }
                                        z3 = z2;
                                    }
                                }
                                z4 = true;
                                z = z4;
                                if (this.downloadedBytes < this.totalBytesCount) {
                                }
                            } else {
                                int i5 = this.currentDownloadChunkSize;
                                if (limit == i5 && ((j13 != j12 && j12 % i5 == 0) || (j13 > 0 && j13 > j12))) {
                                    z = false;
                                }
                                z = true;
                            }
                            z5 = false;
                            boolean z62 = BuildVars.DEBUG_VERSION;
                            bArr = this.key;
                            if (bArr != null) {
                            }
                            str = " local_id = ";
                            if (this.encryptFile) {
                            }
                            if (this.notLoadedBytesRanges != null) {
                            }
                            this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                            String str422 = str2;
                            addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j11, true);
                            if (this.isCdn) {
                            }
                            z2 = z;
                            randomAccessFile = this.fiv;
                            if (randomAccessFile != null) {
                            }
                            if (this.totalBytesCount > 0) {
                            }
                            z3 = z2;
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
                            if (!z3) {
                                onFinishLoadingFile(true, 0, z5);
                            } else if (this.state != 4 && this.state != 5) {
                                startDownloadRequest(requestInfo.connectionType);
                            }
                        }
                        if (!z3) {
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
                return false;
            }
        }
        if (tL_error.text.contains("LIMIT_INVALID") && !requestInfo.forceSmallChunk) {
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
                return false;
            }
            this.datacenterId = num.intValue();
            this.downloadedBytes = 0L;
            this.requestedBytesCount = 0L;
            startDownloadRequest(requestInfo.connectionType);
        } else if (tL_error.text.contains("OFFSET_INVALID")) {
            if (this.downloadedBytes % this.currentDownloadChunkSize == 0) {
                try {
                    onFinishLoadingFile(true, 0, false);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    onFail(false, 0);
                }
            } else {
                onFail(false, 0);
            }
        } else if (tL_error.text.contains("RETRY_LIMIT")) {
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
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processRequestResult$22(int i) {
        this.uiRequestTokens.remove(Integer.valueOf(i));
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    protected void onFail(boolean z, final int i) {
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
                    FileLoadOperation.this.lambda$onFail$23(i);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFail$23(int i) {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
        notifyStreamListeners();
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
                            FileLoadOperation.this.lambda$clearOperation$24(requestInfo2);
                        }
                    };
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda10
                        @Override // java.lang.Runnable
                        public final void run() {
                            FileLoadOperation.lambda$clearOperation$25(FileLoadOperation.RequestInfo.this);
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
                FileLoadOperation.this.lambda$clearOperation$26();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearOperation$24(RequestInfo requestInfo) {
        requestInfo.whenCancelled = null;
        this.cancelledRequestInfos.remove(requestInfo);
        requestInfo.cancelled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearOperation$25(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearOperation$26() {
        this.uiRequestTokens.clear();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void startDownloadRequest(int i) {
        int i2;
        int max;
        int i3;
        long j;
        long j2;
        int i4;
        long j3;
        long j4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        TLRPC.TL_upload_getFile tL_upload_getFile;
        final RequestInfo requestInfo;
        long j5;
        TLRPC.InputFileLocation inputFileLocation;
        long j6;
        HashMap<Long, PreloadRange> hashMap;
        PreloadRange preloadRange;
        ArrayList<Range> arrayList;
        int i9 = -1;
        int i10 = 2;
        boolean z2 = false;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (this.state == 5) {
            this.state = 1;
        }
        if (this.paused || this.reuploadingCdn || this.state != 1 || this.requestingReference) {
            return;
        }
        long j7 = 0;
        if (this.isStory || this.streamPriorityStartOffset != 0 || this.nextPartWasPreloaded || this.requestInfos.size() + this.delayedRequestInfos.size() < this.currentMaxDownloadRequests) {
            if (this.isPreloadVideoOperation) {
                if (this.requestedBytesCount > 2097152) {
                    return;
                }
                if (this.moovFound != 0 && this.requestInfos.size() > 0) {
                    return;
                }
            }
            if (this.isStory) {
                max = Math.max(0, this.currentMaxDownloadRequests - this.requestInfos.size());
            } else if (this.streamPriorityStartOffset == 0 && !this.nextPartWasPreloaded && ((!this.isPreloadVideoOperation || this.moovFound != 0) && this.totalBytesCount > 0)) {
                max = Math.max(0, this.currentMaxDownloadRequests - this.requestInfos.size());
            } else {
                i2 = 1;
                if (!this.requestedReference && FileRefController.getInstance(this.currentAccount).applyCachedFileReference(this.parentObject, this.location, this)) {
                    FileLog.d(this.fileName + " before download updated file ref from file ref cache!");
                }
                i3 = 0;
                while (i3 < i2) {
                    if (this.isPreloadVideoOperation) {
                        if (this.moovFound != 0 && this.preloadNotRequestedBytesCount <= j7) {
                            boolean z3 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        j = this.nextPreloadDownloadOffset;
                        if (j == -1) {
                            int i11 = (2097152 / this.currentDownloadChunkSize) + i10;
                            long j8 = j7;
                            while (true) {
                                if (i11 == 0) {
                                    j = j8;
                                    z2 = false;
                                    break;
                                }
                                if (!this.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j8))) {
                                    j = j8;
                                    z2 = true;
                                    break;
                                }
                                long j9 = this.currentDownloadChunkSize;
                                j8 += j9;
                                long j10 = this.totalBytesCount;
                                if (j8 > j10) {
                                    j = j8;
                                    break;
                                }
                                if (this.moovFound == i10 && j8 == r0 * 8) {
                                    j8 = ((j10 - 1048576) / j9) * j9;
                                }
                                i11 += i9;
                                i10 = 2;
                                z2 = false;
                            }
                            if (!z2 && this.requestInfos.isEmpty()) {
                                onFinishLoadingFile(false, 0, false);
                            }
                        }
                        if (this.requestedPreloadedBytesRanges == null) {
                            this.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        this.requestedPreloadedBytesRanges.put(Long.valueOf(j), 1);
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("start next preload from " + j + " size " + this.totalBytesCount + " for " + this.cacheFilePreload);
                        }
                        this.preloadNotRequestedBytesCount -= this.currentDownloadChunkSize;
                    } else {
                        ArrayList<Range> arrayList2 = this.notRequestedBytesRanges;
                        if (arrayList2 != null) {
                            long j11 = this.streamPriorityStartOffset;
                            if (j11 == 0) {
                                j11 = this.streamStartOffset;
                            }
                            int size = arrayList2.size();
                            long j12 = Long.MAX_VALUE;
                            j2 = Long.MAX_VALUE;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size) {
                                    j = j12;
                                    break;
                                }
                                Range range = this.notRequestedBytesRanges.get(i12);
                                if (j11 != 0) {
                                    if (range.start <= j11 && range.end > j11) {
                                        j = j11;
                                        j2 = Long.MAX_VALUE;
                                        break;
                                    } else if (j11 < range.start && range.start < j12) {
                                        j12 = range.start;
                                    }
                                }
                                j2 = Math.min(j2, range.start);
                                i12++;
                                j12 = j12;
                            }
                            if (j == Long.MAX_VALUE) {
                                if (j2 == Long.MAX_VALUE) {
                                    boolean z4 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                i4 = this.preloadPrefixSize;
                                if (i4 <= 0 && j2 >= i4 && canFinishPreload()) {
                                    boolean z5 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                j3 = this.totalBytesCount;
                                if (j3 <= 0 && j2 > 0 && j2 >= j3) {
                                    boolean z6 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                if (!this.isPreloadVideoOperation && (arrayList = this.notRequestedBytesRanges) != null) {
                                    addPart(arrayList, j2, j2 + this.currentDownloadChunkSize, false);
                                    boolean z7 = BuildVars.DEBUG_VERSION;
                                }
                                j4 = this.totalBytesCount;
                                if (j4 > 0 || i3 == i2 - 1 || (j4 > 0 && this.currentDownloadChunkSize + j2 >= j4)) {
                                    i5 = i;
                                    i6 = -1;
                                    z = true;
                                } else {
                                    i5 = i;
                                    i6 = -1;
                                    z = false;
                                }
                                if (i5 != i6) {
                                    i10 = 2;
                                    i7 = this.requestsCount % 2 == 0 ? 2 : 65538;
                                } else {
                                    i10 = 2;
                                    i7 = i5;
                                }
                                i8 = !this.isForceRequest ? 32 : 0;
                                if (!this.isCdn) {
                                    TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                                    tL_upload_getCdnFile.file_token = this.cdnToken;
                                    tL_upload_getCdnFile.offset = j2;
                                    tL_upload_getCdnFile.limit = this.currentDownloadChunkSize;
                                    i8 |= 1;
                                    tL_upload_getFile = tL_upload_getCdnFile;
                                } else if (this.webLocation != null) {
                                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                                    tL_upload_getWebFile.location = this.webLocation;
                                    tL_upload_getWebFile.offset = (int) j2;
                                    tL_upload_getWebFile.limit = this.currentDownloadChunkSize;
                                    tL_upload_getFile = tL_upload_getWebFile;
                                } else {
                                    TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                                    tL_upload_getFile2.location = this.location;
                                    tL_upload_getFile2.offset = j2;
                                    tL_upload_getFile2.limit = this.currentDownloadChunkSize;
                                    tL_upload_getFile2.cdn_supported = true;
                                    tL_upload_getFile = tL_upload_getFile2;
                                }
                                final TLRPC.TL_upload_getFile tL_upload_getFile3 = tL_upload_getFile;
                                this.requestedBytesCount += this.currentDownloadChunkSize;
                                requestInfo = new RequestInfo();
                                this.requestInfos.add(requestInfo);
                                requestInfo.offset = j2;
                                requestInfo.chunkSize = this.currentDownloadChunkSize;
                                requestInfo.forceSmallChunk = this.forceSmallChunk;
                                requestInfo.connectionType = i7;
                                if (!this.isPreloadVideoOperation && this.supportsPreloading && this.preloadStream != null && (hashMap = this.preloadedBytesRanges) != null && (preloadRange = hashMap.get(Long.valueOf(requestInfo.offset))) != null) {
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
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                                        this.preloadStream.seek(preloadRange.fileOffset);
                                        this.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        nativeByteBuffer.buffer.position(0);
                                        requestInfo.response.bytes = nativeByteBuffer;
                                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                FileLoadOperation.this.lambda$startDownloadRequest$27(requestInfo);
                                            }
                                        });
                                        j6 = 0;
                                    } catch (Exception unused3) {
                                        if (this.streamPriorityStartOffset != 0) {
                                        }
                                        inputFileLocation = this.location;
                                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                        }
                                        requestInfo.forceSmallChunk = this.forceSmallChunk;
                                        if (BuildVars.LOGS_ENABLED) {
                                        }
                                        int i13 = i8 | 2048;
                                        final int i14 = this.isCdn ? this.cdnDatacenterId : this.datacenterId;
                                        j6 = j5;
                                        final int i15 = i7;
                                        final int sendRequestSync = ConnectionsManager.getInstance(this.currentAccount).sendRequestSync(tL_upload_getFile3, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                FileLoadOperation.this.lambda$startDownloadRequest$29(requestInfo, i14, i15, tL_upload_getFile3, tLObject, tL_error);
                                            }
                                        }, null, null, i13, i14, i7, z);
                                        requestInfo.requestToken = sendRequestSync;
                                        if (BuildVars.LOGS_ENABLED) {
                                        }
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                FileLoadOperation.this.lambda$startDownloadRequest$30(sendRequestSync);
                                            }
                                        });
                                        this.requestsCount++;
                                        i3++;
                                        j7 = j6;
                                        i9 = -1;
                                        z2 = false;
                                    }
                                    i3++;
                                    j7 = j6;
                                    i9 = -1;
                                    z2 = false;
                                }
                                if (this.streamPriorityStartOffset != 0) {
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.d("frame get offset = " + this.streamPriorityStartOffset);
                                    }
                                    j5 = 0;
                                    this.streamPriorityStartOffset = 0L;
                                    this.priorityRequestInfo = requestInfo;
                                } else {
                                    j5 = 0;
                                }
                                inputFileLocation = this.location;
                                if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j5) {
                                    requestInfo.forceSmallChunk = this.forceSmallChunk;
                                    if (BuildVars.LOGS_ENABLED) {
                                        requestInfo.requestStartTime = System.currentTimeMillis();
                                    }
                                    int i132 = i8 | 2048;
                                    final int i142 = this.isCdn ? this.cdnDatacenterId : this.datacenterId;
                                    j6 = j5;
                                    final int i152 = i7;
                                    final int sendRequestSync2 = ConnectionsManager.getInstance(this.currentAccount).sendRequestSync(tL_upload_getFile3, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            FileLoadOperation.this.lambda$startDownloadRequest$29(requestInfo, i142, i152, tL_upload_getFile3, tLObject, tL_error);
                                        }
                                    }, null, null, i132, i142, i7, z);
                                    requestInfo.requestToken = sendRequestSync2;
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " dc=" + i142 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i7 + " priority=" + this.priority);
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            FileLoadOperation.this.lambda$startDownloadRequest$30(sendRequestSync2);
                                        }
                                    });
                                    this.requestsCount++;
                                } else {
                                    requestReference(requestInfo);
                                    j6 = j5;
                                }
                                i3++;
                                j7 = j6;
                                i9 = -1;
                                z2 = false;
                            }
                        } else {
                            j = this.requestedBytesCount;
                        }
                    }
                    j2 = j;
                    i4 = this.preloadPrefixSize;
                    if (i4 <= 0) {
                    }
                    j3 = this.totalBytesCount;
                    if (j3 <= 0) {
                    }
                    if (!this.isPreloadVideoOperation) {
                        addPart(arrayList, j2, j2 + this.currentDownloadChunkSize, false);
                        boolean z72 = BuildVars.DEBUG_VERSION;
                    }
                    j4 = this.totalBytesCount;
                    if (j4 > 0) {
                    }
                    i5 = i;
                    i6 = -1;
                    z = true;
                    if (i5 != i6) {
                    }
                    if (!this.isForceRequest) {
                    }
                    if (!this.isCdn) {
                    }
                    final TLObject tL_upload_getFile32 = tL_upload_getFile;
                    this.requestedBytesCount += this.currentDownloadChunkSize;
                    requestInfo = new RequestInfo();
                    this.requestInfos.add(requestInfo);
                    requestInfo.offset = j2;
                    requestInfo.chunkSize = this.currentDownloadChunkSize;
                    requestInfo.forceSmallChunk = this.forceSmallChunk;
                    requestInfo.connectionType = i7;
                    if (!this.isPreloadVideoOperation) {
                        requestInfo.response = new TLRPC.TL_upload_file();
                        if (BuildVars.DEBUG_VERSION) {
                        }
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((int) preloadRange.length);
                        this.preloadStream.seek(preloadRange.fileOffset);
                        this.preloadStream.getChannel().read(nativeByteBuffer2.buffer);
                        nativeByteBuffer2.buffer.position(0);
                        requestInfo.response.bytes = nativeByteBuffer2;
                        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                FileLoadOperation.this.lambda$startDownloadRequest$27(requestInfo);
                            }
                        });
                        j6 = 0;
                        i3++;
                        j7 = j6;
                        i9 = -1;
                        z2 = false;
                    }
                    if (this.streamPriorityStartOffset != 0) {
                    }
                    inputFileLocation = this.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    }
                    requestInfo.forceSmallChunk = this.forceSmallChunk;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    int i1322 = i8 | 2048;
                    final int i1422 = this.isCdn ? this.cdnDatacenterId : this.datacenterId;
                    j6 = j5;
                    final int i1522 = i7;
                    final int sendRequestSync22 = ConnectionsManager.getInstance(this.currentAccount).sendRequestSync(tL_upload_getFile32, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            FileLoadOperation.this.lambda$startDownloadRequest$29(requestInfo, i1422, i1522, tL_upload_getFile32, tLObject, tL_error);
                        }
                    }, null, null, i1322, i1422, i7, z);
                    requestInfo.requestToken = sendRequestSync22;
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            FileLoadOperation.this.lambda$startDownloadRequest$30(sendRequestSync22);
                        }
                    });
                    this.requestsCount++;
                    i3++;
                    j7 = j6;
                    i9 = -1;
                    z2 = false;
                }
            }
            i2 = max;
            if (!this.requestedReference) {
                FileLog.d(this.fileName + " before download updated file ref from file ref cache!");
            }
            i3 = 0;
            while (i3 < i2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$27(RequestInfo requestInfo) {
        processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$29(final RequestInfo requestInfo, int i, final int i2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!this.requestInfos.contains(requestInfo)) {
            if (!this.cancelledRequestInfos.contains(requestInfo)) {
                return;
            }
            int i3 = 0;
            boolean z = false;
            while (i3 < this.requestInfos.size()) {
                RequestInfo requestInfo2 = this.requestInfos.get(i3);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (!z) {
                        this.requestInfos.set(i3, requestInfo);
                        z = true;
                    } else {
                        this.requestInfos.remove(i3);
                        i3--;
                    }
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 < this.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = this.cancelledRequestInfos.get(i4);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                this.cancelledRequestInfos.remove(i4);
                i4 += -1;
            }
            i4++;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " time=" + (System.currentTimeMillis() - requestInfo.requestStartTime) + " dcId=" + i + " cdn=" + this.isCdn + " conType=" + i2 + " reqId" + requestInfo.requestToken);
        }
        if (requestInfo == this.priorityRequestInfo) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("frame get request completed " + this.priorityRequestInfo.offset);
            }
            this.priorityRequestInfo = null;
        }
        if (tL_error != null) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            if (tL_error.code == -2000) {
                this.requestInfos.remove(requestInfo);
                this.requestedBytesCount -= requestInfo.chunkSize;
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + requestInfo.chunkSize);
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                this.isCdn = false;
                clearOperation(requestInfo, false, false);
                startDownloadRequest(i2);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i5 = 0; i5 < tL_upload_fileCdnRedirect.file_hashes.size(); i5++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i5);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
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
                processRequestResult(requestInfo, tL_error2);
                return;
            }
            this.isCdn = true;
            if (this.notCheckedCdnRanges == null) {
                ArrayList<Range> arrayList = new ArrayList<>();
                this.notCheckedCdnRanges = arrayList;
                arrayList.add(new Range(0L, this.maxCdnParts));
            }
            this.cdnDatacenterId = tL_upload_fileCdnRedirect.dc_id;
            this.cdnIv = tL_upload_fileCdnRedirect.encryption_iv;
            this.cdnKey = tL_upload_fileCdnRedirect.encryption_key;
            this.cdnToken = tL_upload_fileCdnRedirect.file_token;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i2);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (this.reuploadingCdn) {
                return;
            }
            clearOperation(requestInfo, false, false);
            this.reuploadingCdn = true;
            TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
            tL_upload_reuploadCdnFile.file_token = this.cdnToken;
            tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new RequestDelegate() { // from class: org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error3) {
                    FileLoadOperation.this.lambda$startDownloadRequest$28(i2, requestInfo, tLObject3, tL_error3);
                }
            }, null, null, 0, this.datacenterId, 1, true);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_file) {
            requestInfo.response = (TLRPC.TL_upload_file) tLObject2;
        } else if (tLObject2 instanceof TLRPC.TL_upload_webFile) {
            requestInfo.responseWeb = (TLRPC.TL_upload_webFile) tLObject2;
            if (this.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                this.totalBytesCount = requestInfo.responseWeb.size;
            }
        } else {
            requestInfo.responseCdn = (TLRPC.TL_upload_cdnFile) tLObject2;
        }
        if (tLObject2 != null) {
            int i6 = this.currentType;
            if (i6 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i6 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i6 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i6 == 67108864) {
                String str = this.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                }
            }
        }
        processRequestResult(requestInfo, tL_error);
        Runnable runnable3 = requestInfo.whenCancelled;
        if (runnable3 != null) {
            runnable3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$28(int i, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i2);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            startDownloadRequest(i);
            return;
        }
        if (tL_error != null) {
            if (tL_error.text.equals("FILE_TOKEN_INVALID") || tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                this.isCdn = false;
                clearOperation(requestInfo, false, false);
                startDownloadRequest(i);
                return;
            }
            onFail(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$30(int i) {
        this.uiRequestTokens.add(Integer.valueOf(i));
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

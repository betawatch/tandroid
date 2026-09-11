package org.telegram.messenger;

import hg.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static yf.a0 filesQueueByteBuffer = null;
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

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j3, long j10);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i10);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j3, long j10) {
            this.fileOffset = j3;
            this.length = j10;
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class Range {
        private long end;
        private long start;

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }

        private Range(long j3, long j10) {
            this.start = j3;
            this.end = j10;
        }
    }

    /* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
    public static class RequestInfo {
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
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j3) {
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
        this.cancelAfterNoStreamListeners = new o2(this, 5);
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j10 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j10;
            tL_inputEncryptedFileLocation.volume_id = j10;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j11 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j11;
            tL_inputPeerPhotoFileLocation.volume_id = j11;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j12 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j12;
            tL_inputStickerSetThumb.volume_id = j12;
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
                long j13 = imageLocation.documentId;
                tL_inputDocumentFileLocation.id = j13;
                this.documentId = j13;
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
        int i10 = imageLocation.imageType;
        this.ungzip = i10 == 1 || i10 == 3;
        int i11 = imageLocation.dc_id;
        this.datacenterId = i11;
        this.initialDatacenterId = i11;
        this.currentType = 16777216;
        this.totalBytesCount = j3;
        this.ext = str == null ? "jpg" : str;
    }

    private void addPart(ArrayList<Range> arrayList, long j3, long j10, boolean z10) {
        long j11;
        if (arrayList == null || j10 < j3) {
            return;
        }
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Range range = arrayList.get(i10);
            if (j3 > range.start) {
                if (j10 < range.end) {
                    j11 = j3;
                    arrayList.add(0, new Range(range.start, j11));
                    range.start = j10;
                } else {
                    j11 = j3;
                    if (j11 < range.end) {
                        range.end = j11;
                    }
                }
                z11 = true;
                break;
            }
            if (j10 >= range.end) {
                arrayList.remove(i10);
            } else if (j10 > range.start) {
                range.start = j10;
            }
            j11 = j3;
            z11 = true;
            break;
        }
        j11 = j3;
        if (z10) {
            if (!z11) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j11 + " - " + j10);
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (this.fileWriteRunnable != null) {
                filesQueue.cancelRunnable(this.fileWriteRunnable);
            }
            synchronized (this) {
                this.writingToFilePartsStream = true;
            }
            DispatchQueue dispatchQueue = filesQueue;
            b2 b2Var = new b2(4, this, arrayList2);
            this.fileWriteRunnable = b2Var;
            dispatchQueue.postRunnable(b2Var);
            notifyStreamListeners();
        }
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelOnStage, reason: merged with bridge method [inline-methods] */
    public void lambda$cancel$13(boolean z10) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new o2(this, 4));
        }
        if (z10) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (file5.delete()) {
                        return;
                    }
                    this.cacheFilePreload.deleteOnExit();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
        }
    }

    private void cancelRequests(Runnable runnable) {
        FileLog.d("cancelRequests".concat(runnable != null ? " with callback" : ""));
        if (this.requestInfos != null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            int i10 = 0;
            for (int i11 = 0; i11 < this.requestInfos.size(); i11++) {
                RequestInfo requestInfo = this.requestInfos.get(i11);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        i2.g.o(requestInfo.requestToken, new StringBuilder("cancelRequests cancel "));
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new f0(requestInfo, iArr, runnable, 21);
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new n2(requestInfo, 1));
                    }
                    char c10 = requestInfo.connectionType == 2 ? (char) 0 : (char) 1;
                    iArr2[c10] = iArr2[c10] + requestInfo.chunkSize;
                }
            }
            while (i10 < 2) {
                int i12 = i10 == 0 ? 2 : 65538;
                if (iArr2[i10] > 1048576) {
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i12);
                }
                i10++;
            }
        }
    }

    private void cleanup() {
        try {
            RandomAccessFile randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        try {
            if (this.filePartsStream != null) {
                synchronized (this) {
                    if (this.writingToFilePartsStream) {
                        this.closeFilePartsStreamOnWriteEnd = true;
                    } else {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    }
                }
            }
        } catch (Exception e16) {
            FileLog.e(e16);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.fiv = null;
            }
        } catch (Exception e17) {
            FileLog.e(e17);
        }
        if (this.delayedRequestInfos != null) {
            for (int i10 = 0; i10 < this.delayedRequestInfos.size(); i10++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i10);
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

    private void clearOperation(RequestInfo requestInfo, boolean z10, boolean z11) {
        int[] iArr = new int[2];
        long j3 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < this.requestInfos.size()) {
            RequestInfo requestInfo2 = this.requestInfos.get(i10);
            long min = Math.min(requestInfo2.offset, j3);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + requestInfo2.chunkSize);
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z11) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new s2(this, requestInfo2, 1);
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new n2(requestInfo2, 0));
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i10++;
            j3 = min;
        }
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 2 : 65538;
            if (iArr[i11] > 1048576) {
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i12);
            }
            i11++;
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new o2(this, 0));
        long j10 = j3;
        for (int i13 = 0; i13 < this.delayedRequestInfos.size(); i13++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i13);
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
            j10 = Math.min(requestInfo3.offset, j10);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z10 && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = j10;
            this.requestedBytesCount = j10;
        }
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges == null) {
            return;
        }
        this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
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

    private long findNextPreloadDownloadOffset(long j3, long j10, NativeByteBuffer nativeByteBuffer) {
        long j11;
        int limit = nativeByteBuffer.limit();
        long j12 = j3;
        do {
            if (j12 >= j10 - (this.preloadTempBuffer != null ? 16 : 0)) {
                j11 = j10 + limit;
                if (j12 < j11) {
                    if (j12 >= j11 - 16) {
                        long j13 = j11 - j12;
                        if (j13 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        this.preloadTempBufferCount = (int) j13;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                        return j11;
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i10 = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j14 = j12 - j10;
                        if (j14 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        nativeByteBuffer.position((int) j14);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i11 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i11 == 0) {
                        return 0L;
                    }
                    if (i11 == 1) {
                        i11 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i11;
                    }
                    j12 += i11;
                }
            }
            return 0L;
        } while (j12 < j11);
        return j12;
    }

    public static long floorDiv(long j3, long j10) {
        long j11 = j3 / j10;
        return ((j3 ^ j10) >= 0 || j10 * j11 == j3) ? j11 : j11 - 1;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j3, long j10) {
        long j11;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            if (this.state == 3) {
                return j10;
            }
            long j12 = this.downloadedBytes;
            if (j12 == 0) {
                return 0L;
            }
            return Math.min(j10, Math.max(j12 - j3, 0L));
        }
        int size = arrayList.size();
        Range range = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                j11 = j10;
                break;
            }
            Range range2 = arrayList.get(i10);
            if (j3 <= range2.start && (range == null || range2.start < range.start)) {
                range = range2;
            }
            if (range2.start <= j3 && range2.end > j3) {
                j11 = 0;
                break;
            }
            i10++;
        }
        if (j11 == 0) {
            return 0L;
        }
        return range != null ? Math.min(j10, range.start - j3) : Math.min(j10, Math.max(this.totalBytesCount - j3, 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addPart$2(ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e7) {
            FileLog.e((Throwable) e7, false);
            if (AndroidUtilities.isENOSPC(e7)) {
                LaunchActivity.E(1);
            } else if (AndroidUtilities.isEROFS(e7)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
            }
        }
        if (this.filePartsStream == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = (size * 16) + 4;
        yf.a0 a0Var = filesQueueByteBuffer;
        if (a0Var == null) {
            filesQueueByteBuffer = new yf.a0(i10);
        } else {
            a0Var.b();
        }
        filesQueueByteBuffer.c(size);
        for (int i11 = 0; i11 < size; i11++) {
            Range range = (Range) arrayList.get(i11);
            filesQueueByteBuffer.d(range.start);
            filesQueueByteBuffer.d(range.end);
        }
        synchronized (this) {
            try {
                RandomAccessFile randomAccessFile = this.filePartsStream;
                if (randomAccessFile == null) {
                    return;
                }
                randomAccessFile.seek(0L);
                this.filePartsStream.write(filesQueueByteBuffer.a, 0, i10);
                this.writingToFilePartsStream = false;
                if (this.closeFilePartsStreamOnWriteEnd) {
                    try {
                        this.filePartsStream.getChannel().close();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    this.filePartsStream.close();
                    this.filePartsStream = null;
                }
                this.totalTime = (System.currentTimeMillis() - currentTimeMillis) + this.totalTime;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelOnStage$14() {
        if (this.state == 5) {
            onFail(false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelRequests$15(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCurrentFile$3(File[] fileArr, CountDownLatch countDownLatch) {
        if (this.state != 3 || this.preloadFinished) {
            fileArr[0] = this.cacheFileTemp;
        } else {
            fileArr[0] = this.cacheFileFinal;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getDownloadedLengthFromOffset$4(long[] jArr, long j3, long j10, CountDownLatch countDownLatch) {
        FileLoadOperation fileLoadOperation;
        try {
            fileLoadOperation = this;
        } catch (Throwable th2) {
            th = th2;
            fileLoadOperation = this;
        }
        try {
            jArr[0] = fileLoadOperation.getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j3, j10);
        } catch (Throwable th3) {
            th = th3;
            FileLog.e(th);
            jArr[0] = 0;
            if (fileLoadOperation.state == 3) {
            }
            countDownLatch.countDown();
        }
        if (fileLoadOperation.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6() {
        pause();
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(getFileName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFail$23(int i10) {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i10);
        }
        notifyStreamListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$17(boolean z10) {
        try {
            onFinishLoadingFile(z10, 0, false);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$18() {
        onFail(false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFinishLoadingFile$19(boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + this.cacheFileFinal + " time = " + (System.currentTimeMillis() - this.startTime) + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
        }
        if (z10) {
            int i10 = this.currentType;
            if (i10 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i10 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i10 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i10 == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                }
            }
        }
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116 A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #7 {all -> 0x011c, blocks: (B:45:0x010e, B:47:0x0116), top: B:44:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$onFinishLoadingFile$20(File file, File file2, File file3, File file4, boolean z10) {
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
                } catch (ZipException unused) {
                } catch (Throwable th2) {
                    th = th2;
                    file5 = file4;
                }
                try {
                    this.ungzip = false;
                } catch (ZipException unused2) {
                    file4 = file5;
                    this.ungzip = false;
                    if (this.ungzip) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("unable to ungzip temp = " + file4 + " to final = " + this.cacheFileFinal);
                    }
                    file4 = file5;
                    if (this.ungzip) {
                    }
                }
                file4 = file5;
            }
            if (this.ungzip) {
                Utilities.stageQueue.postRunnable(new o2(this, 3));
                return;
            }
            if (this.parentObject instanceof TLRPC.TL_theme) {
                try {
                    copyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    copyFile = false;
                    if (!copyFile) {
                    }
                    if (copyFile) {
                    }
                    Utilities.stageQueue.postRunnable(new p2(this, z10, 3));
                }
            } else {
                try {
                    if (this.pathSaveData != null) {
                        synchronized (lockObject) {
                            try {
                                this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                                int i10 = 1;
                                while (this.cacheFileFinal.exists()) {
                                    int lastIndexOf = this.storeFileName.lastIndexOf(46);
                                    if (lastIndexOf > 0) {
                                        str = this.storeFileName.substring(0, lastIndexOf) + " (" + i10 + ")" + this.storeFileName.substring(lastIndexOf);
                                    } else {
                                        str = this.storeFileName + " (" + i10 + ")";
                                    }
                                    this.cacheFileFinal = new File(this.storePath, str);
                                    i10++;
                                }
                            } finally {
                            }
                        }
                    }
                    copyFile = file4.renameTo(this.cacheFileFinal);
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                    if (copyFile) {
                    }
                    Utilities.stageQueue.postRunnable(new p2(this, z10, 3));
                }
            }
            if (!copyFile && this.renameRetryCount == 3) {
                copyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                if (copyFile) {
                    this.cacheFileFinal.delete();
                }
            }
            if (copyFile) {
                this.cacheFileFinalReady = true;
                if (this.pathSaveData != null && this.cacheFileFinal.exists()) {
                    this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                }
                int i11 = this.renameRetryCount + 1;
                this.renameRetryCount = i11;
                if (i11 < 3) {
                    this.state = 1;
                    Utilities.stageQueue.postRunnable(new p2(this, z10, 2), 200L);
                    return;
                } else {
                    this.cacheFileFinal = file4;
                    this.cacheFileFinalReady = false;
                }
            }
        }
        Utilities.stageQueue.postRunnable(new p2(this, z10, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$7() {
        if (!this.isStory) {
            for (int i10 = 0; i10 < this.requestInfos.size(); i10++) {
                ConnectionsManager.getInstance(this.currentAccount).failNotRunningRequest(this.requestInfos.get(i10).requestToken);
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            clearOperation(null, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processRequestResult$22(int i10) {
        this.uiRequestTokens.remove(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$removePart$1(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
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
                for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i10);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i11 = 0; i11 < this.delayedRequestInfos.size(); i11++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i11);
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    this.delayedRequestInfos.remove(i11);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsPreloadVideoOperation$12(boolean z10) {
        this.requestedBytesCount = 0L;
        clearOperation(null, true, true);
        this.isPreloadVideoOperation = z10;
        startDownloadRequest(-1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$10() {
        startDownloadRequest(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$11(boolean[] zArr) {
        boolean z10 = this.isPreloadVideoOperation && zArr[0];
        int i10 = this.preloadPrefixSize;
        boolean z11 = i10 > 0 && this.downloadedBytes >= ((long) i10) && canFinishPreload();
        long j3 = this.totalBytesCount;
        if (j3 == 0 || !(z10 || this.downloadedBytes == j3 || z11)) {
            startDownloadRequest(-1);
            return;
        }
        try {
            onFinishLoadingFile(false, 1, true);
        } catch (Exception unused) {
            onFail(true, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$8(int i10) {
        this.uiRequestTokens.remove(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$9(boolean z10, long j3, FileLoadOperationStream fileLoadOperationStream, boolean z11) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z10) {
            long j10 = this.currentDownloadChunkSize;
            long j11 = (j3 / j10) * j10;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j11) {
                RequestInfo requestInfo2 = this.priorityRequestInfo;
                int i10 = requestInfo2.requestToken;
                this.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new m2(this, i10, 2));
                this.requestedBytesCount -= this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.priorityRequestInfo.offset + this.currentDownloadChunkSize);
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
                this.streamPriorityStartOffset = j11;
            }
        } else {
            long j12 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j3 / j12) * j12;
        }
        if (!this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (z11) {
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
    public /* synthetic */ void lambda$startDownloadRequest$27(RequestInfo requestInfo) {
        processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$28(int i10, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            startDownloadRequest(i10);
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                onFail(false, 0);
                return;
            }
            this.isCdn = false;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadRequest$29(RequestInfo requestInfo, int i10, int i11, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
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
            int i12 = 0;
            boolean z10 = false;
            while (i12 < this.requestInfos.size()) {
                RequestInfo requestInfo2 = this.requestInfos.get(i12);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (z10) {
                        this.requestInfos.remove(i12);
                        i12--;
                    } else {
                        this.requestInfos.set(i12, requestInfo);
                        z10 = true;
                    }
                }
                i12++;
            }
        }
        int i13 = 0;
        while (i13 < this.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = this.cancelledRequestInfos.get(i13);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                this.cancelledRequestInfos.remove(i13);
                i13 += -1;
            }
            i13++;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_loading: ");
            sb2.append(this.cacheFileFinal.getName());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - requestInfo.requestStartTime);
            sb2.append(" dcId=");
            sb2.append(i10);
            sb2.append(" cdn=");
            sb2.append(this.isCdn);
            sb2.append(" conType=");
            sb2.append(i11);
            sb2.append(" reqId");
            i2.g.o(requestInfo.requestToken, sb2);
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
                startDownloadRequest(i11);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i14 = 0; i14 < tL_upload_fileCdnRedirect.file_hashes.size(); i14++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i14);
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
            startDownloadRequest(i11);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new va(this, i11, requestInfo, 1), null, null, 0, this.datacenterId, 1, true);
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
            int i15 = this.currentType;
            if (i15 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i15 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i15 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i15 == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
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
    public /* synthetic */ void lambda$startDownloadRequest$30(int i10) {
        this.uiRequestTokens.add(Integer.valueOf(i10));
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.streamListeners.get(i10).newDataAvailable();
            }
        }
    }

    private void onFinishLoadingFile(boolean z10, int i10, boolean z11) {
        if (this.state == 1 || this.state == 5) {
            this.state = 3;
            notifyStreamListeners();
            cleanup();
            if (!this.isPreloadVideoOperation && !z11) {
                filesQueue.postRunnable(new i2.b1(this, this.cacheIvTemp, this.cacheFileParts, this.cacheFilePreload, this.cacheFileTemp, z10, 2));
                this.cacheIvTemp = null;
                this.cacheFileParts = null;
                this.cacheFilePreload = null;
                this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
                return;
            }
            this.preloadFinished = true;
            if (BuildVars.DEBUG_VERSION) {
                if (i10 == 1) {
                    FileLog.d("file already exist " + this.cacheFileTemp);
                } else {
                    StringBuilder sb2 = new StringBuilder("finished preloading file to ");
                    sb2.append(this.cacheFileTemp);
                    sb2.append(" loaded ");
                    sb2.append(this.downloadedBytes);
                    sb2.append(" of ");
                    sb2.append(this.totalBytesCount);
                    sb2.append(" prefSize=");
                    i2.g.o(this.preloadPrefixSize, sb2);
                }
            }
            if (this.fileMetadata != null) {
                if (this.cacheFileTemp != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new ai.b(this.cacheFileTemp)));
                }
                if (this.cacheFileParts != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new ai.b(this.cacheFileParts)));
                }
            }
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
            this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
        }
    }

    private void removePart(ArrayList<Range> arrayList, long j3, long j10) {
        boolean z10;
        if (arrayList == null || j10 < j3) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Range range = arrayList.get(i11);
            if (j3 == range.end) {
                range.end = j10;
            } else if (j10 == range.start) {
                range.start = j3;
            }
            z10 = true;
        }
        z10 = false;
        Collections.sort(arrayList, new d(5));
        while (i10 < arrayList.size() - 1) {
            Range range2 = arrayList.get(i10);
            int i12 = i10 + 1;
            Range range3 = arrayList.get(i12);
            if (range2.end == range3.start) {
                range2.end = range3.end;
                arrayList.remove(i12);
                i10--;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        arrayList.add(new Range(j3, j10));
    }

    private void requestFileOffsets(long j3) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j3;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new g0(this, 3), null, null, 0, this.datacenterId, 1, true);
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

    public void cancel() {
        cancel(false);
    }

    public boolean checkPrefixPreloadFinished() {
        int i10 = this.preloadPrefixSize;
        if (i10 > 0 && this.downloadedBytes > i10) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long j3 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    j3 = Math.min(j3, arrayList.get(i11).start);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return true;
                }
            }
            if (j3 > this.preloadPrefixSize) {
                return true;
            }
        }
        return false;
    }

    public File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    public File getCurrentFile() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new f0(this, fileArr, countDownLatch, 20));
        try {
            countDownLatch.await();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        return fileArr[0];
    }

    public File getCurrentFileFast() {
        return (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) ? this.cacheFileFinal : this.cacheFileTemp;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public long getDocumentId() {
        return this.documentId;
    }

    public float getDownloadedLengthFromOffset(float f7) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        if (this.totalBytesCount == 0 || arrayList == null) {
            return 0.0f;
        }
        return (getDownloadedLengthFromOffsetInternal(arrayList, (int) (r4 * f7), r4) / this.totalBytesCount) + f7;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getPositionInQueue() {
        return getQueue().getPosition(this);
    }

    public int getPriority() {
        return this.priority;
    }

    public FileLoaderPriorityQueue getQueue() {
        return this.priorityQueue;
    }

    public boolean isFinished() {
        return this.state == 3;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public void onFail(boolean z10, int i10) {
        cleanup();
        this.state = i10 == 1 ? 4 : 2;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long currentTimeMillis = this.startTime != 0 ? System.currentTimeMillis() - this.startTime : 0L;
            if (i10 == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + currentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i10 + " time = " + currentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z10) {
            Utilities.stageQueue.postRunnable(new m2(this, i10, 0));
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i10);
        }
        notifyStreamListeners();
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new o2(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0413, code lost:
    
        if (r5 == (r10 - r3)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0417, code lost:
    
        if (r8 != false) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025e A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05f1 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05f7 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026c A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d8 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0331 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0367 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c8 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055c A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0570 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:73:0x0082, B:75:0x0086, B:77:0x0092, B:79:0x009b, B:81:0x00a1, B:83:0x00c5, B:85:0x00ce, B:280:0x00e1, B:282:0x00e9, B:284:0x00f7, B:88:0x0107, B:90:0x011b, B:91:0x0159, B:93:0x015d, B:95:0x0181, B:96:0x01a4, B:98:0x01a8, B:99:0x01af, B:101:0x01da, B:103:0x01e9, B:105:0x01fe, B:106:0x0214, B:107:0x021f, B:108:0x020a, B:109:0x0217, B:110:0x0221, B:112:0x0242, B:114:0x0246, B:116:0x024c, B:118:0x0252, B:123:0x025e, B:126:0x0583, B:128:0x058b, B:130:0x0597, B:132:0x05a2, B:135:0x05a5, B:137:0x05b1, B:139:0x05b7, B:140:0x05c6, B:142:0x05cc, B:143:0x05db, B:145:0x05e1, B:147:0x05f1, B:149:0x05f7, B:151:0x05fc, B:153:0x0601, B:157:0x026c, B:159:0x0270, B:161:0x027b, B:165:0x0290, B:167:0x0294, B:169:0x0299, B:171:0x029f, B:175:0x02ab, B:178:0x02d2, B:180:0x02d8, B:182:0x02f1, B:184:0x02fc, B:189:0x030e, B:190:0x031f, B:191:0x0320, B:192:0x032d, B:194:0x0331, B:195:0x0363, B:197:0x0367, B:199:0x0374, B:200:0x03a5, B:202:0x03c8, B:204:0x03da, B:206:0x03ea, B:209:0x03f2, B:211:0x0401, B:213:0x040a, B:215:0x0410, B:219:0x0558, B:221:0x055c, B:222:0x0568, B:224:0x0570, B:226:0x0575, B:228:0x0419, B:230:0x0429, B:231:0x043b, B:236:0x0449, B:237:0x0450, B:238:0x0451, B:240:0x045e, B:241:0x049b, B:243:0x04aa, B:245:0x04ae, B:247:0x04b2, B:248:0x04ff, B:250:0x0505, B:252:0x0524, B:254:0x052d, B:257:0x0546, B:265:0x02b9, B:269:0x02c1, B:304:0x060e, B:306:0x00a8, B:308:0x00ae, B:309:0x00b5, B:311:0x00bb), top: B:72:0x0082 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        long j3;
        String str;
        char c10;
        char c11;
        char c12;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        String str2;
        long j10;
        long j11;
        long j12;
        RandomAccessFile randomAccessFile;
        boolean z13;
        long j13;
        long j14;
        int i10;
        int i11;
        Integer num;
        int i12 = 1;
        if (this.state != 1 && this.state != 5) {
            if (!BuildVars.DEBUG_VERSION || this.state != 3) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder("trying to write to finished file ");
            sb2.append(this.fileName);
            sb2.append(" offset ");
            sb2.append(requestInfo.offset);
            sb2.append(" ");
            sb2.append(this.totalBytesCount);
            sb2.append(" reqToken=");
            sb2.append(requestInfo.requestToken);
            sb2.append(" (state=");
            FileLog.e(new FileLog.IgnoreSentException(a4.a.n(this.state, ")", sb2)));
            return false;
        }
        int i13 = requestInfo.requestToken;
        this.requestInfos.remove(requestInfo);
        AndroidUtilities.runOnUIThread(new m2(this, i13, i12));
        if (tL_error == null) {
            try {
                if (this.notLoadedBytesRanges == null) {
                    j3 = 0;
                    if (this.downloadedBytes != requestInfo.offset) {
                        delayRequestInfo(requestInfo);
                        return false;
                    }
                } else {
                    j3 = 0;
                }
                NativeByteBuffer nativeByteBuffer = requestInfo.response != null ? requestInfo.response.bytes : requestInfo.responseWeb != null ? requestInfo.responseWeb.bytes : requestInfo.responseCdn != null ? requestInfo.responseCdn.bytes : null;
                if (nativeByteBuffer == null || nativeByteBuffer.limit() == 0) {
                    onFinishLoadingFile(true, 0, false);
                    return false;
                }
                int limit = nativeByteBuffer.limit();
                if (this.isCdn) {
                    try {
                        long j15 = requestInfo.offset;
                        str = " id = ";
                        long j16 = this.cdnChunkCheckSize;
                        long j17 = j16 * (j15 / j16);
                        HashMap<Long, TLRPC.TL_fileHash> hashMap = this.cdnHashes;
                        if ((hashMap != null ? hashMap.get(Long.valueOf(j17)) : null) == null) {
                            delayRequestInfo(requestInfo);
                            requestFileOffsets(j17);
                            return true;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e, (AndroidUtilities.isFilNotFoundException(e) || AndroidUtilities.isENOSPC(e)) ? false : true);
                        if (AndroidUtilities.isENOSPC(e)) {
                            onFail(false, -1);
                        } else if (AndroidUtilities.isEROFS(e)) {
                            SharedConfig.checkSdCard(this.cacheFileFinal);
                            onFail(true, -1);
                        } else {
                            onFail(false, 0);
                        }
                        return false;
                    }
                } else {
                    str = " id = ";
                }
                if (requestInfo.responseCdn != null) {
                    long j18 = requestInfo.offset / 16;
                    byte[] bArr2 = this.cdnIv;
                    c10 = '\r';
                    c12 = '\b';
                    bArr2[15] = (byte) (j18 & 255);
                    bArr2[14] = (byte) ((j18 >> 8) & 255);
                    bArr2[13] = (byte) ((j18 >> 16) & 255);
                    bArr2[12] = (byte) ((j18 >> 24) & 255);
                    c11 = '\f';
                    Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr2, 0, nativeByteBuffer.limit());
                } else {
                    c10 = '\r';
                    c11 = '\f';
                    c12 = '\b';
                }
                if (this.isPreloadVideoOperation) {
                    this.preloadStream.writeLong(requestInfo.offset);
                    long j19 = limit;
                    this.preloadStream.writeLong(j19);
                    this.preloadStreamFileOffset += 16;
                    this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + limit);
                    }
                    if (this.preloadedBytesRanges == null) {
                        this.preloadedBytesRanges = new HashMap<>();
                    }
                    this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j19));
                    this.totalPreloadedBytes += limit;
                    this.preloadStreamFileOffset += limit;
                    if (this.moovFound == 0) {
                        long findNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                        if (findNextPreloadDownloadOffset < j3) {
                            findNextPreloadDownloadOffset *= -1;
                            long j20 = this.nextPreloadDownloadOffset + this.currentDownloadChunkSize;
                            this.nextPreloadDownloadOffset = j20;
                            if (j20 < this.totalBytesCount / 2) {
                                long j21 = 1048576 + findNextPreloadDownloadOffset;
                                this.foundMoovSize = j21;
                                this.preloadNotRequestedBytesCount = j21;
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
                    long j22 = this.nextPreloadDownloadOffset;
                    if (j22 != j3 && ((this.moovFound == 0 || this.foundMoovSize >= j3) && this.totalPreloadedBytes <= 2097152 && j22 < this.totalBytesCount)) {
                        z13 = false;
                        if (!z13) {
                            this.preloadStream.seek(j3);
                            this.preloadStream.write(1);
                        } else if (this.moovFound != 0) {
                            this.foundMoovSize -= this.currentDownloadChunkSize;
                        }
                        z12 = false;
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    z12 = false;
                } else {
                    NativeByteBuffer nativeByteBuffer2 = nativeByteBuffer;
                    long j23 = limit;
                    long j24 = this.downloadedBytes + j23;
                    this.downloadedBytes = j24;
                    long j25 = this.totalBytesCount;
                    if (j25 > 0) {
                        if (j24 < j25 && ((i10 = this.preloadPrefixSize) <= 0 || j24 < i10 || !canFinishPreload() || !this.requestInfos.isEmpty())) {
                            z10 = false;
                            if (this.downloadedBytes < this.totalBytesCount) {
                                z11 = z10;
                                z12 = true;
                                boolean z14 = BuildVars.DEBUG_VERSION;
                                bArr = this.key;
                                if (bArr != null) {
                                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer2.limit());
                                    if (z11) {
                                        j11 = 2147483647L;
                                        j10 = 0;
                                        if (this.bytesCountPadding != 0) {
                                            str2 = " local_id = ";
                                            long limit2 = nativeByteBuffer2.limit() - this.bytesCountPadding;
                                            if (BuildVars.DEBUG_VERSION && limit2 > 2147483647L) {
                                                throw new RuntimeException("Out of limit" + limit2);
                                            }
                                            nativeByteBuffer2.limit((int) limit2);
                                        } else {
                                            str2 = " local_id = ";
                                        }
                                        if (this.encryptFile) {
                                            long j26 = requestInfo.offset / 16;
                                            byte[] bArr3 = this.encryptIv;
                                            bArr3[15] = (byte) (j26 & 255);
                                            bArr3[14] = (byte) ((j26 >> c12) & 255);
                                            bArr3[c10] = (byte) ((j26 >> 16) & 255);
                                            bArr3[c11] = (byte) ((j26 >> 24) & 255);
                                            Utilities.aesCtrDecryption(nativeByteBuffer2.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer2.limit());
                                        }
                                        if (this.notLoadedBytesRanges != null) {
                                            this.fileOutputStream.seek(requestInfo.offset);
                                            if (BuildVars.DEBUG_VERSION) {
                                                FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                                            }
                                        }
                                        this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                                        String str3 = str2;
                                        long j27 = j10;
                                        addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j23, true);
                                        if (this.isCdn) {
                                            long j28 = requestInfo.offset / this.cdnChunkCheckSize;
                                            int size = this.notCheckedCdnRanges.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 >= size) {
                                                    break;
                                                }
                                                Range range = this.notCheckedCdnRanges.get(i14);
                                                if (range.start > j28 || j28 > range.end) {
                                                    i14++;
                                                    str = str;
                                                    j28 = j28;
                                                    str3 = str3;
                                                    j27 = j27;
                                                } else {
                                                    long j29 = this.cdnChunkCheckSize;
                                                    long j30 = j28 * j29;
                                                    long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j30, j29);
                                                    if (downloadedLengthFromOffsetInternal != j27) {
                                                        j12 = j27;
                                                        if (downloadedLengthFromOffsetInternal != this.cdnChunkCheckSize) {
                                                            long j31 = this.totalBytesCount;
                                                            if (j31 > j12) {
                                                            }
                                                            if (j31 <= j12) {
                                                            }
                                                        }
                                                        TLRPC.TL_fileHash tL_fileHash = this.cdnHashes.get(Long.valueOf(j30));
                                                        if (this.fileReadStream == null) {
                                                            this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                            this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                                        }
                                                        this.fileReadStream.seek(j30);
                                                        if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > j11) {
                                                            throw new RuntimeException("!!!");
                                                        }
                                                        this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                                        if (this.encryptFile) {
                                                            long j32 = j30 / 16;
                                                            byte[] bArr4 = this.encryptIv;
                                                            j13 = j30;
                                                            bArr4[15] = (byte) (j32 & 255);
                                                            bArr4[14] = (byte) ((j32 >> c12) & 255);
                                                            bArr4[c10] = (byte) ((j32 >> 16) & 255);
                                                            bArr4[c11] = (byte) ((j32 >> 24) & 255);
                                                            Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                                            j14 = downloadedLengthFromOffsetInternal;
                                                        } else {
                                                            j13 = j30;
                                                            j14 = downloadedLengthFromOffsetInternal;
                                                        }
                                                        if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, j14), tL_fileHash.hash)) {
                                                            if (BuildVars.LOGS_ENABLED) {
                                                                if (this.location != null) {
                                                                    FileLog.e("invalid cdn hash " + this.location + str + this.location.id + str3 + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                                                                } else {
                                                                    String str4 = str;
                                                                    if (this.webLocation != null) {
                                                                        FileLog.e("invalid cdn hash  " + this.webLocation + str4 + this.fileName);
                                                                    }
                                                                }
                                                            }
                                                            onFail(false, 0);
                                                            this.cacheFileTemp.delete();
                                                            return false;
                                                        }
                                                        this.cdnHashes.remove(Long.valueOf(j13));
                                                        addPart(this.notCheckedCdnRanges, j28, j28 + 1, false);
                                                    }
                                                }
                                            }
                                        }
                                        j12 = j27;
                                        randomAccessFile = this.fiv;
                                        if (randomAccessFile != null) {
                                            randomAccessFile.seek(j12);
                                            this.fiv.write(this.iv);
                                        }
                                        if (this.totalBytesCount > 0 && this.state == 1) {
                                            copyNotLoadedRanges();
                                            this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                                        }
                                        z13 = z11;
                                    }
                                }
                                str2 = " local_id = ";
                                j10 = 0;
                                j11 = 2147483647L;
                                if (this.encryptFile) {
                                }
                                if (this.notLoadedBytesRanges != null) {
                                }
                                this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                                String str32 = str2;
                                long j272 = j10;
                                addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j23, true);
                                if (this.isCdn) {
                                }
                                j12 = j272;
                                randomAccessFile = this.fiv;
                                if (randomAccessFile != null) {
                                }
                                if (this.totalBytesCount > 0) {
                                    copyNotLoadedRanges();
                                    this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                                }
                                z13 = z11;
                            }
                        }
                        z10 = true;
                        if (this.downloadedBytes < this.totalBytesCount) {
                        }
                    } else {
                        int i15 = this.currentDownloadChunkSize;
                        if (limit == i15 && ((j25 != j24 && j24 % i15 == 0) || (j25 > 0 && j25 > j24))) {
                            z10 = false;
                        }
                        z10 = true;
                    }
                    z11 = z10;
                    z12 = false;
                    boolean z142 = BuildVars.DEBUG_VERSION;
                    bArr = this.key;
                    if (bArr != null) {
                    }
                    str2 = " local_id = ";
                    j10 = 0;
                    j11 = 2147483647L;
                    if (this.encryptFile) {
                    }
                    if (this.notLoadedBytesRanges != null) {
                    }
                    this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                    String str322 = str2;
                    long j2722 = j10;
                    addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j23, true);
                    if (this.isCdn) {
                    }
                    j12 = j2722;
                    randomAccessFile = this.fiv;
                    if (randomAccessFile != null) {
                    }
                    if (this.totalBytesCount > 0) {
                    }
                    z13 = z11;
                }
                while (i11 < this.delayedRequestInfos.size()) {
                    RequestInfo requestInfo2 = this.delayedRequestInfos.get(i11);
                    i11 = (this.notLoadedBytesRanges == null && this.downloadedBytes != requestInfo2.offset) ? i11 + 1 : 0;
                    this.delayedRequestInfos.remove(i11);
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
                    if (!z13) {
                        onFinishLoadingFile(true, 0, z12);
                        return false;
                    }
                    if (this.state != 4 && this.state != 5) {
                        startDownloadRequest(requestInfo.connectionType);
                        return false;
                    }
                }
                if (!z13) {
                }
            } catch (Exception e10) {
                e = e10;
            }
        } else {
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
                return false;
            }
            if (!tL_error.text.contains("FILE_MIGRATE_")) {
                if (tL_error.text.contains("OFFSET_INVALID")) {
                    if (this.downloadedBytes % this.currentDownloadChunkSize != 0) {
                        onFail(false, 0);
                        return false;
                    }
                    try {
                        onFinishLoadingFile(true, 0, false);
                        return false;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        onFail(false, 0);
                        return false;
                    }
                }
                if (tL_error.text.contains("RETRY_LIMIT")) {
                    onFail(false, 2);
                    return false;
                }
                if (BuildVars.LOGS_ENABLED) {
                    TLRPC.InputFileLocation inputFileLocation = this.location;
                    if (inputFileLocation != null) {
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            FileLog.e(tL_error.text + " " + this.location + " peer_did = " + DialogObject.getPeerDialogId(((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).big);
                        } else {
                            FileLog.e(tL_error.text + " " + this.location + " id = " + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                        }
                    } else if (this.webLocation != null) {
                        FileLog.e(tL_error.text + " " + this.webLocation + " id = " + this.fileName);
                    }
                }
                onFail(false, 0);
                return false;
            }
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
        }
        return false;
    }

    public void removeStreamListener(FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new q2(this, fileLoadOperationStream, 0));
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public void setEncryptFile(boolean z10) {
        this.encryptFile = z10;
        if (z10) {
            this.allowDisordererFileSave = false;
        }
    }

    public void setForceRequest(boolean z10) {
        this.isForceRequest = z10;
    }

    public void setIsPreloadVideoOperation(boolean z10) {
        if (this.isPreloadVideoOperation != z10) {
            if (!z10 || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z10 + " file=" + this.fileName);
                if (z10 || !this.isPreloadVideoOperation) {
                    this.isPreloadVideoOperation = z10;
                    return;
                }
                if (this.state == 3) {
                    this.isPreloadVideoOperation = z10;
                    this.state = 0;
                    this.preloadFinished = false;
                    start();
                    return;
                }
                if (this.state == 1) {
                    Utilities.stageQueue.postRunnable(new p2(this, z10, 0));
                } else {
                    this.isPreloadVideoOperation = z10;
                }
            }
        }
    }

    public void setPaths(int i10, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i10;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setStream(FileLoadOperationStream fileLoadOperationStream, boolean z10, long j3) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j3;
        this.streamPriority = z10;
        Utilities.stageQueue.postRunnable(new q2(this, fileLoadOperationStream, 1));
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startDownloadRequest(int i10) {
        int i11;
        int max;
        int i12;
        long j3;
        long j10;
        int i13;
        TLRPC.TL_upload_getFile tL_upload_getFile;
        long j11;
        HashMap<Long, PreloadRange> hashMap;
        PreloadRange preloadRange;
        ArrayList<Range> arrayList;
        boolean z10;
        FileLoadOperation fileLoadOperation = this;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.state = 1;
        }
        if (fileLoadOperation.paused || fileLoadOperation.reuploadingCdn || fileLoadOperation.state != 1 || fileLoadOperation.requestingReference) {
            return;
        }
        long j12 = 0;
        if (fileLoadOperation.isStory || fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || fileLoadOperation.delayedRequestInfos.size() + fileLoadOperation.requestInfos.size() < fileLoadOperation.currentMaxDownloadRequests) {
            if (fileLoadOperation.isPreloadVideoOperation) {
                if (fileLoadOperation.requestedBytesCount > 2097152) {
                    return;
                }
                if (fileLoadOperation.moovFound != 0 && fileLoadOperation.requestInfos.size() > 0) {
                    return;
                }
            }
            int i14 = 0;
            if (fileLoadOperation.isStory) {
                max = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            } else {
                if (fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || ((fileLoadOperation.isPreloadVideoOperation && fileLoadOperation.moovFound == 0) || fileLoadOperation.totalBytesCount <= 0)) {
                    i11 = 1;
                    if (!fileLoadOperation.requestedReference && FileRefController.getInstance(fileLoadOperation.currentAccount).applyCachedFileReference(fileLoadOperation.parentObject, fileLoadOperation.location, fileLoadOperation)) {
                        FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
                    }
                    i12 = 0;
                    while (i12 < i11) {
                        if (!fileLoadOperation.isPreloadVideoOperation) {
                            j3 = j12;
                            ArrayList<Range> arrayList2 = fileLoadOperation.notRequestedBytesRanges;
                            if (arrayList2 != null) {
                                long j13 = fileLoadOperation.streamPriorityStartOffset;
                                if (j13 == j3) {
                                    j13 = fileLoadOperation.streamStartOffset;
                                }
                                int size = arrayList2.size();
                                int i15 = 0;
                                long j14 = Long.MAX_VALUE;
                                long j15 = Long.MAX_VALUE;
                                while (true) {
                                    if (i15 >= size) {
                                        j13 = j14;
                                        break;
                                    }
                                    Range range = fileLoadOperation.notRequestedBytesRanges.get(i15);
                                    if (j13 != j3) {
                                        if (range.start <= j13 && range.end > j13) {
                                            j15 = Long.MAX_VALUE;
                                            break;
                                        } else if (j13 < range.start && range.start < j14) {
                                            j14 = range.start;
                                        }
                                    }
                                    j15 = Math.min(j15, range.start);
                                    i15++;
                                }
                                if (j13 != Long.MAX_VALUE) {
                                    j10 = j13;
                                } else {
                                    if (j15 == Long.MAX_VALUE) {
                                        boolean z11 = BuildVars.DEBUG_VERSION;
                                        return;
                                    }
                                    j10 = j15;
                                }
                            } else {
                                j10 = fileLoadOperation.requestedBytesCount;
                            }
                        } else {
                            if (fileLoadOperation.moovFound != 0 && fileLoadOperation.preloadNotRequestedBytesCount <= j12) {
                                boolean z12 = BuildVars.DEBUG_VERSION;
                                return;
                            }
                            j10 = fileLoadOperation.nextPreloadDownloadOffset;
                            if (j10 == -1) {
                                int i16 = (2097152 / fileLoadOperation.currentDownloadChunkSize) + 2;
                                long j16 = j12;
                                while (true) {
                                    if (i16 == 0) {
                                        j3 = j12;
                                        j10 = j16;
                                        break;
                                    }
                                    if (!fileLoadOperation.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j16))) {
                                        j10 = j16;
                                        j3 = j12;
                                        z10 = true;
                                        break;
                                    }
                                    long j17 = fileLoadOperation.currentDownloadChunkSize;
                                    j16 += j17;
                                    long j18 = fileLoadOperation.totalBytesCount;
                                    if (j16 > j18) {
                                        j10 = j16;
                                        j3 = j12;
                                        break;
                                    }
                                    long j19 = j12;
                                    if (fileLoadOperation.moovFound == 2 && j16 == r4 * 8) {
                                        j16 = ((j18 - 1048576) / j17) * j17;
                                    }
                                    i16--;
                                    j12 = j19;
                                }
                                if (!z10 && fileLoadOperation.requestInfos.isEmpty()) {
                                    fileLoadOperation.onFinishLoadingFile(false, 0, false);
                                }
                            } else {
                                j3 = j12;
                            }
                            if (fileLoadOperation.requestedPreloadedBytesRanges == null) {
                                fileLoadOperation.requestedPreloadedBytesRanges = new HashMap<>();
                            }
                            fileLoadOperation.requestedPreloadedBytesRanges.put(Long.valueOf(j10), 1);
                            if (BuildVars.DEBUG_VERSION) {
                                StringBuilder t10 = a4.a.t(j10, "start next preload from ", " size ");
                                t10.append(fileLoadOperation.totalBytesCount);
                                t10.append(" for ");
                                t10.append(fileLoadOperation.cacheFilePreload);
                                FileLog.d(t10.toString());
                            }
                            fileLoadOperation.preloadNotRequestedBytesCount -= fileLoadOperation.currentDownloadChunkSize;
                        }
                        long j20 = j10;
                        int i17 = fileLoadOperation.preloadPrefixSize;
                        if (i17 > 0 && j20 >= i17 && fileLoadOperation.canFinishPreload()) {
                            boolean z13 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        long j21 = fileLoadOperation.totalBytesCount;
                        if (j21 > j3 && j20 > j3 && j20 >= j21) {
                            boolean z14 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        if (!fileLoadOperation.isPreloadVideoOperation && (arrayList = fileLoadOperation.notRequestedBytesRanges) != null) {
                            fileLoadOperation.addPart(arrayList, j20, fileLoadOperation.currentDownloadChunkSize + j20, false);
                            boolean z15 = BuildVars.DEBUG_VERSION;
                        }
                        long j22 = fileLoadOperation.totalBytesCount;
                        boolean z16 = j22 <= j3 || i12 == i11 + (-1) || (j22 > j3 && ((long) fileLoadOperation.currentDownloadChunkSize) + j20 >= j22);
                        if (i10 == -1) {
                            i13 = fileLoadOperation.requestsCount % 2 == 0 ? 2 : 65538;
                        } else {
                            i13 = i10;
                        }
                        int i18 = fileLoadOperation.isForceRequest ? 32 : 0;
                        if (fileLoadOperation.isCdn) {
                            TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                            tL_upload_getCdnFile.file_token = fileLoadOperation.cdnToken;
                            tL_upload_getCdnFile.offset = j20;
                            tL_upload_getCdnFile.limit = fileLoadOperation.currentDownloadChunkSize;
                            i18 |= 1;
                            tL_upload_getFile = tL_upload_getCdnFile;
                        } else if (fileLoadOperation.webLocation != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = fileLoadOperation.webLocation;
                            tL_upload_getWebFile.offset = (int) j20;
                            tL_upload_getWebFile.limit = fileLoadOperation.currentDownloadChunkSize;
                            tL_upload_getFile = tL_upload_getWebFile;
                        } else {
                            TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                            tL_upload_getFile2.location = fileLoadOperation.location;
                            tL_upload_getFile2.offset = j20;
                            tL_upload_getFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                            tL_upload_getFile2.cdn_supported = true;
                            tL_upload_getFile = tL_upload_getFile2;
                        }
                        TLRPC.TL_upload_getFile tL_upload_getFile3 = tL_upload_getFile;
                        fileLoadOperation.requestedBytesCount += fileLoadOperation.currentDownloadChunkSize;
                        RequestInfo requestInfo = new RequestInfo();
                        fileLoadOperation.requestInfos.add(requestInfo);
                        requestInfo.offset = j20;
                        requestInfo.chunkSize = fileLoadOperation.currentDownloadChunkSize;
                        requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                        requestInfo.connectionType = i13;
                        if (!fileLoadOperation.isPreloadVideoOperation && fileLoadOperation.supportsPreloading && fileLoadOperation.preloadStream != null && (hashMap = fileLoadOperation.preloadedBytesRanges) != null && (preloadRange = hashMap.get(Long.valueOf(requestInfo.offset))) != null) {
                            requestInfo.response = new TLRPC.TL_upload_file();
                            try {
                                if (BuildVars.DEBUG_VERSION && preloadRange.length > 2147483647L) {
                                    throw new RuntimeException("cast long to integer");
                                }
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                                fileLoadOperation.preloadStream.seek(preloadRange.fileOffset);
                                fileLoadOperation.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                                nativeByteBuffer.buffer.position(0);
                                requestInfo.response.bytes = nativeByteBuffer;
                                Utilities.stageQueue.postRunnable(new s2(fileLoadOperation, requestInfo, i14));
                                j11 = j3;
                            } catch (Exception unused) {
                            }
                            i12++;
                            j12 = j11;
                        }
                        if (fileLoadOperation.streamPriorityStartOffset != j3) {
                            if (BuildVars.DEBUG_VERSION) {
                                i2.g.w(new StringBuilder("frame get offset = "), fileLoadOperation.streamPriorityStartOffset);
                            }
                            j11 = j3;
                            fileLoadOperation.streamPriorityStartOffset = j11;
                            fileLoadOperation.priorityRequestInfo = requestInfo;
                        } else {
                            j11 = j3;
                        }
                        TLRPC.InputFileLocation inputFileLocation = fileLoadOperation.location;
                        if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) && ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id == j11) {
                            fileLoadOperation.requestReference(requestInfo);
                        } else {
                            requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                            if (BuildVars.LOGS_ENABLED) {
                                requestInfo.requestStartTime = System.currentTimeMillis();
                            }
                            int i19 = i18 | 2048;
                            int i20 = fileLoadOperation.isCdn ? fileLoadOperation.cdnDatacenterId : fileLoadOperation.datacenterId;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                            FileLoadOperation fileLoadOperation2 = fileLoadOperation;
                            fileLoadOperation = fileLoadOperation2;
                            int sendRequestSync = connectionsManager.sendRequestSync(tL_upload_getFile3, new r(fileLoadOperation2, requestInfo, i20, i13, tL_upload_getFile3, 2), null, null, i19, i20, i13, z16);
                            requestInfo.requestToken = sendRequestSync;
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder sb2 = new StringBuilder("debug_loading: ");
                                sb2.append(fileLoadOperation.cacheFileFinal.getName());
                                sb2.append(" dc=");
                                sb2.append(i20);
                                sb2.append(" send reqId ");
                                sb2.append(requestInfo.requestToken);
                                sb2.append(" offset=");
                                sb2.append(requestInfo.offset);
                                sb2.append(" conType=");
                                sb2.append(i13);
                                sb2.append(" priority=");
                                i2.g.o(fileLoadOperation.priority, sb2);
                            }
                            AndroidUtilities.runOnUIThread(new m2(fileLoadOperation, sendRequestSync, 3));
                            fileLoadOperation.requestsCount++;
                        }
                        i12++;
                        j12 = j11;
                    }
                }
                max = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            }
            i11 = max;
            if (!fileLoadOperation.requestedReference) {
                FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
            }
            i12 = 0;
            while (i12 < i11) {
            }
        }
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j3 = this.downloadedBytes;
            long j10 = this.totalBytesCount;
            if (j3 == j10 || j10 <= 0) {
                return;
            }
            fileLoadOperationDelegate.didChangedLoadProgress(this, j3, j10);
        }
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    private void cancel(boolean z10) {
        Utilities.stageQueue.postRunnable(new p2(this, z10, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x038f, code lost:
    
        if (r9 != r30.cacheFileFinal.length()) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0818 A[Catch: Exception -> 0x081c, TRY_LEAVE, TryCatch #9 {Exception -> 0x081c, blocks: (B:245:0x0807, B:247:0x0818), top: B:244:0x0807 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03e8  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j3, final boolean z10) {
        long j10;
        String r10;
        String str;
        String str2;
        String str3;
        String r11;
        String r12;
        String r13;
        Object obj;
        boolean exists;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        long j11;
        long j12;
        int i11;
        ArrayList<Range> arrayList;
        ?? r72;
        long j13;
        long j14;
        RandomAccessFile randomAccessFile;
        String str4;
        String t10;
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
                boolean z14 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z14 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z14 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        final boolean z15 = this.state != 0;
        boolean z16 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.r2
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoadOperation.this.lambda$start$9(z10, j3, fileLoadOperationStream, z15);
                }
            });
        } else if (z15) {
            Utilities.stageQueue.postRunnable(new o2(this, 1));
        }
        if (z15) {
            return z16;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j15 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j3 / j15) * j15;
        if (this.allowDisordererFileSave) {
            long j16 = this.totalBytesCount;
            if (j16 > 0 && j16 > j15) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation != null) {
            String MD5 = Utilities.MD5(this.webFile.url);
            if (this.encryptFile) {
                str4 = org.telegram.ui.Cells.p6.t(MD5, ".temp.enc");
                str = a4.a.s(w.f.g(MD5, "."), this.ext, ".enc");
                if (this.key != null) {
                    t10 = org.telegram.ui.Cells.p6.t(MD5, "_64.iv.enc");
                    String str5 = str4;
                    str2 = t10;
                    r10 = str5;
                    j10 = 0;
                }
                t10 = null;
                String str52 = str4;
                str2 = t10;
                r10 = str52;
                j10 = 0;
            } else {
                String t11 = org.telegram.ui.Cells.p6.t(MD5, ".temp");
                StringBuilder g10 = w.f.g(MD5, ".");
                g10.append(this.ext);
                String sb2 = g10.toString();
                if (this.key != null) {
                    t10 = org.telegram.ui.Cells.p6.t(MD5, "_64.iv");
                    str4 = t11;
                    str = sb2;
                    String str522 = str4;
                    str2 = t10;
                    r10 = str522;
                    j10 = 0;
                } else {
                    str4 = t11;
                    str = sb2;
                    t10 = null;
                    String str5222 = str4;
                    str2 = t10;
                    r10 = str5222;
                    j10 = 0;
                }
            }
            this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
            this.cancelledRequestInfos = new ArrayList<>();
            this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
            this.state = 1;
            obj = this.parentObject;
            if (!(obj instanceof TLRPC.TL_theme)) {
                this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), a4.a.r(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).id, ".attheme"));
            } else if (this.encryptFile) {
                this.cacheFileFinal = new File(this.storePath, str);
            } else {
                this.cacheFileFinal = new File(this.storePath, this.storeFileName);
            }
            exists = this.cacheFileFinal.exists();
            this.cacheFileFinalReady = exists;
            if (exists) {
                if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                    long j17 = this.totalBytesCount;
                    if (j17 != j10) {
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
                this.cacheFileTemp = new File(this.tempPath, r10);
                if (this.ungzip) {
                    this.cacheFileGzipTemp = new File(this.tempPath, org.telegram.ui.Cells.p6.t(r10, ".gz"));
                }
                if (this.encryptFile) {
                    File file = new File(FileLoader.getInternalCacheDir(), org.telegram.ui.Cells.p6.t(str, ".key"));
                    try {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
                        long length = file.length();
                        byte[] bArr = new byte[32];
                        this.encryptKey = bArr;
                        this.encryptIv = new byte[16];
                        if (length <= j10 || length % 48 != j10) {
                            Utilities.random.nextBytes(bArr);
                            Utilities.random.nextBytes(this.encryptIv);
                            randomAccessFile2.write(this.encryptKey);
                            randomAccessFile2.write(this.encryptIv);
                            z12 = true;
                        } else {
                            randomAccessFile2.read(bArr, 0, 32);
                            randomAccessFile2.read(this.encryptIv, 0, 16);
                            z12 = false;
                        }
                        try {
                            try {
                                randomAccessFile2.getChannel().close();
                            } catch (Exception e7) {
                                e = e7;
                                if (AndroidUtilities.isENOSPC(e)) {
                                    LaunchActivity.E(1);
                                    FileLog.e((Throwable) e, false);
                                } else if (AndroidUtilities.isEROFS(e)) {
                                    SharedConfig.checkSdCard(this.cacheFileFinal);
                                    FileLog.e((Throwable) e, false);
                                } else {
                                    FileLog.e(e);
                                }
                                boolean[] zArr = {false};
                                long j18 = 8;
                                if (this.supportsPreloading) {
                                }
                                z13 = z12;
                                j11 = 8;
                                j12 = 2;
                                i11 = 1;
                                if (str3 != null) {
                                }
                                if (this.fileMetadata != null) {
                                }
                                if (this.cacheFileTemp.exists()) {
                                }
                                arrayList = this.notLoadedBytesRanges;
                                if (arrayList != null) {
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                }
                                if (str2 != null) {
                                }
                                if (!this.isPreloadVideoOperation) {
                                }
                                updateProgress();
                                RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                this.fileOutputStream = randomAccessFile3;
                                j13 = this.downloadedBytes;
                                if (j13 != 0) {
                                }
                                z11 = true;
                                r72 = 0;
                                if (this.fileOutputStream != null) {
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        randomAccessFile2.close();
                    } catch (Exception e11) {
                        e = e11;
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                boolean[] zArr2 = {false};
                long j182 = 8;
                if (this.supportsPreloading || r11 == null) {
                    z13 = z12;
                    j11 = 8;
                    j12 = 2;
                    i11 = 1;
                } else {
                    this.cacheFilePreload = new File(this.tempPath, r11);
                    try {
                        RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.cacheFilePreload, "rws");
                        this.preloadStream = randomAccessFile4;
                        long length2 = randomAccessFile4.length();
                        this.preloadStreamFileOffset = 1;
                        long j19 = 1;
                        if (length2 > 1) {
                            zArr2[0] = this.preloadStream.readByte() != 0;
                            while (j19 < length2) {
                                if (length2 - j19 < j182) {
                                    break;
                                }
                                long readLong = this.preloadStream.readLong();
                                if (length2 - (j19 + j182) < j182 || readLong < j10) {
                                    break;
                                }
                                j12 = 2;
                                try {
                                    if (readLong <= this.totalBytesCount) {
                                        long readLong2 = this.preloadStream.readLong();
                                        long j20 = j19 + 16;
                                        if (length2 - j20 >= readLong2 && readLong2 <= this.currentDownloadChunkSize) {
                                            PreloadRange preloadRange = new PreloadRange(j20, readLong2);
                                            long j21 = j20 + readLong2;
                                            this.preloadStream.seek(j21);
                                            if (length2 - j21 >= 24) {
                                                j11 = j182;
                                                try {
                                                    long readLong3 = this.preloadStream.readLong();
                                                    this.foundMoovSize = readLong3;
                                                    if (readLong3 != j10) {
                                                        z13 = z12;
                                                        try {
                                                            i11 = 1;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            i11 = 1;
                                                            FileLog.e((Throwable) e, false);
                                                            if (!this.isPreloadVideoOperation) {
                                                                this.cacheFilePreload = null;
                                                                try {
                                                                    randomAccessFile = this.preloadStream;
                                                                    if (randomAccessFile != null) {
                                                                    }
                                                                } catch (Exception e13) {
                                                                    FileLog.e(e13);
                                                                }
                                                            }
                                                            if (str3 != null) {
                                                            }
                                                            if (this.fileMetadata != null) {
                                                            }
                                                            if (this.cacheFileTemp.exists()) {
                                                            }
                                                            arrayList = this.notLoadedBytesRanges;
                                                            if (arrayList != null) {
                                                            }
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            if (str2 != null) {
                                                            }
                                                            if (!this.isPreloadVideoOperation) {
                                                                copyNotLoadedRanges();
                                                            }
                                                            updateProgress();
                                                            RandomAccessFile randomAccessFile32 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                            this.fileOutputStream = randomAccessFile32;
                                                            j13 = this.downloadedBytes;
                                                            if (j13 != 0) {
                                                            }
                                                            z11 = true;
                                                            r72 = 0;
                                                            if (this.fileOutputStream != null) {
                                                            }
                                                        }
                                                        try {
                                                            this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                            this.preloadNotRequestedBytesCount = readLong3;
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            FileLog.e((Throwable) e, false);
                                                            if (!this.isPreloadVideoOperation) {
                                                            }
                                                            if (str3 != null) {
                                                            }
                                                            if (this.fileMetadata != null) {
                                                            }
                                                            if (this.cacheFileTemp.exists()) {
                                                            }
                                                            arrayList = this.notLoadedBytesRanges;
                                                            if (arrayList != null) {
                                                            }
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            if (str2 != null) {
                                                            }
                                                            if (!this.isPreloadVideoOperation) {
                                                            }
                                                            updateProgress();
                                                            RandomAccessFile randomAccessFile322 = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                            this.fileOutputStream = randomAccessFile322;
                                                            j13 = this.downloadedBytes;
                                                            if (j13 != 0) {
                                                            }
                                                            z11 = true;
                                                            r72 = 0;
                                                            if (this.fileOutputStream != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z13 = z12;
                                                        i11 = 1;
                                                    }
                                                    this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                    this.nextAtomOffset = this.preloadStream.readLong();
                                                    long j22 = j21 + 24;
                                                    if (this.preloadedBytesRanges == null) {
                                                        this.preloadedBytesRanges = new HashMap<>();
                                                    }
                                                    if (this.requestedPreloadedBytesRanges == null) {
                                                        this.requestedPreloadedBytesRanges = new HashMap<>();
                                                    }
                                                    this.preloadedBytesRanges.put(Long.valueOf(readLong), preloadRange);
                                                    this.requestedPreloadedBytesRanges.put(Long.valueOf(readLong), Integer.valueOf(i11));
                                                    this.totalPreloadedBytes = (int) (this.totalPreloadedBytes + readLong2);
                                                    this.preloadStreamFileOffset = (int) (readLong2 + 36 + this.preloadStreamFileOffset);
                                                    z12 = z13;
                                                    j182 = j11;
                                                    j19 = j22;
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    z13 = z12;
                                                }
                                            }
                                        }
                                    }
                                    z13 = z12;
                                    j11 = j182;
                                    break;
                                } catch (Exception e16) {
                                    e = e16;
                                    z13 = z12;
                                    j11 = j182;
                                }
                            }
                        }
                        z13 = z12;
                        j11 = j182;
                        j12 = 2;
                        i11 = 1;
                        this.preloadStream.seek(this.preloadStreamFileOffset);
                    } catch (Exception e17) {
                        e = e17;
                        z13 = z12;
                        j11 = j182;
                        j12 = 2;
                    }
                    if (!this.isPreloadVideoOperation && this.preloadedBytesRanges == null) {
                        this.cacheFilePreload = null;
                        randomAccessFile = this.preloadStream;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.getChannel().close();
                            } catch (Exception e18) {
                                FileLog.e(e18);
                            }
                            this.preloadStream.close();
                            this.preloadStream = null;
                        }
                    }
                }
                if (str3 != null) {
                    this.cacheFileParts = new File(this.tempPath, str3);
                    if (!this.cacheFileTemp.exists()) {
                        this.cacheFileParts.delete();
                    }
                    try {
                        RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileParts, "rws");
                        this.filePartsStream = randomAccessFile5;
                        long length3 = randomAccessFile5.length();
                        if (length3 % j11 == 4) {
                            int readInt = this.filePartsStream.readInt();
                            if (readInt <= (length3 - 4) / j12) {
                                for (int i12 = 0; i12 < readInt; i12++) {
                                    long readLong4 = this.filePartsStream.readLong();
                                    long readLong5 = this.filePartsStream.readLong();
                                    this.notLoadedBytesRanges.add(new Range(readLong4, readLong5));
                                    this.notRequestedBytesRanges.add(new Range(readLong4, readLong5));
                                }
                            }
                        }
                    } catch (Exception e19) {
                        FileLog.e(e19, !AndroidUtilities.isFilNotFoundException(e19));
                    }
                }
                if (this.fileMetadata != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
                }
                if (this.cacheFileTemp.exists()) {
                    ArrayList<Range> arrayList2 = this.notLoadedBytesRanges;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        long j23 = 0;
                        this.notLoadedBytesRanges.add(new Range(j23, this.totalBytesCount));
                        this.notRequestedBytesRanges.add(new Range(j23, this.totalBytesCount));
                    }
                } else if (z13) {
                    this.cacheFileTemp.delete();
                } else {
                    long length4 = this.cacheFileTemp.length();
                    if (str2 == null || length4 % this.currentDownloadChunkSize == j10) {
                        long floorDiv = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * this.currentDownloadChunkSize;
                        this.downloadedBytes = floorDiv;
                        this.requestedBytesCount = floorDiv;
                    } else {
                        this.requestedBytesCount = j10;
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
                    for (int i13 = 0; i13 < size; i13++) {
                        Range range = this.notLoadedBytesRanges.get(i13);
                        this.downloadedBytes -= range.end - range.start;
                    }
                    this.requestedBytesCount = this.downloadedBytes;
                }
                if (BuildVars.LOGS_ENABLED) {
                    if (this.isPreloadVideoOperation) {
                        FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                    } else {
                        StringBuilder sb3 = new StringBuilder("start loading file to temp = ");
                        sb3.append(this.cacheFileTemp);
                        sb3.append(" final = ");
                        sb3.append(this.cacheFileFinal);
                        sb3.append(" priority");
                        i2.g.o(this.priority, sb3);
                    }
                }
                if (str2 != null) {
                    this.cacheIvTemp = new File(this.tempPath, str2);
                    try {
                        this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                        if (this.downloadedBytes != 0 && !z13) {
                            long length5 = this.cacheIvTemp.length();
                            if (length5 <= 0) {
                                j14 = 0;
                            } else if (length5 % 64 == 0) {
                                this.fiv.read(this.iv, 0, 64);
                            } else {
                                j14 = 0;
                            }
                            this.downloadedBytes = j14;
                            this.requestedBytesCount = j14;
                        }
                    } catch (Exception e20) {
                        this.downloadedBytes = 0L;
                        this.requestedBytesCount = 0L;
                        if (AndroidUtilities.isENOSPC(e20)) {
                            LaunchActivity.E(i11);
                            FileLog.e((Throwable) e20, false);
                        } else if (AndroidUtilities.isEROFS(e20)) {
                            SharedConfig.checkSdCard(this.cacheFileFinal);
                            FileLog.e((Throwable) e20, false);
                        } else {
                            FileLog.e(e20);
                        }
                    }
                }
                if (!this.isPreloadVideoOperation && this.downloadedBytes != 0 && this.totalBytesCount > 0) {
                    copyNotLoadedRanges();
                }
                updateProgress();
                try {
                    RandomAccessFile randomAccessFile3222 = new RandomAccessFile(this.cacheFileTemp, "rws");
                    this.fileOutputStream = randomAccessFile3222;
                    j13 = this.downloadedBytes;
                    if (j13 != 0) {
                        randomAccessFile3222.seek(j13);
                    }
                    z11 = true;
                    r72 = 0;
                } catch (Exception e21) {
                    r72 = 0;
                    FileLog.e((Throwable) e21, false);
                    if (AndroidUtilities.isENOSPC(e21)) {
                        LaunchActivity.E(i11);
                        onFail(true, -1);
                        return false;
                    }
                    z11 = true;
                    if (AndroidUtilities.isEROFS(e21)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        FileLog.e((Throwable) e21, false);
                        onFail(true, -1);
                        return false;
                    }
                }
                if (this.fileOutputStream != null) {
                    onFail(z11, r72);
                    return r72;
                }
                this.started = z11;
                Utilities.stageQueue.postRunnable(new b2(3, this, zArr2));
            } else {
                z11 = true;
                this.started = true;
                try {
                    onFinishLoadingFile(false, 1, false);
                    FilePathDatabase.PathData pathData = this.pathSaveData;
                    if (pathData != null) {
                        this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                        return true;
                    }
                } catch (Exception e22) {
                    FileLog.e((Throwable) e22, false);
                    if (AndroidUtilities.isENOSPC(e22)) {
                        z11 = true;
                        LaunchActivity.E(1);
                        i10 = -1;
                        onFail(true, -1);
                    } else {
                        i10 = -1;
                        z11 = true;
                    }
                    if (AndroidUtilities.isEROFS(e22)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        onFail(z11, i10);
                        return false;
                    }
                    onFail(z11, 0);
                }
            }
            return z11;
        }
        TLRPC.InputFileLocation inputFileLocation = this.location;
        long j24 = inputFileLocation.volume_id;
        j10 = 0;
        if (j24 == 0 || inputFileLocation.local_id == 0) {
            if (this.datacenterId == 0 || inputFileLocation.id == 0) {
                onFail(true, 0);
                return false;
            }
            if (!this.encryptFile) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.datacenterId);
                sb4.append("_");
                r10 = a4.a.r(sb4, this.location.id, ".temp");
                str = this.datacenterId + "_" + this.location.id + this.ext;
                if (this.key != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.datacenterId);
                    sb5.append("_");
                    str2 = a4.a.r(sb5, this.location.id, "_64.iv");
                } else {
                    str2 = null;
                }
                if (this.notLoadedBytesRanges != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.datacenterId);
                    sb6.append("_");
                    str3 = a4.a.r(sb6, this.location.id, "_64.pt");
                } else {
                    str3 = null;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(this.datacenterId);
                sb7.append("_");
                r11 = a4.a.r(sb7, this.location.id, "_64.preload");
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
                return z11;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(this.datacenterId);
            sb8.append("_");
            r12 = a4.a.r(sb8, this.location.id, ".temp.enc");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(this.datacenterId);
            sb9.append("_");
            sb9.append(this.location.id);
            str = a4.a.s(sb9, this.ext, ".enc");
            if (this.key != null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(this.datacenterId);
                sb10.append("_");
                r13 = a4.a.r(sb10, this.location.id, "_64.iv.enc");
                String str6 = r12;
                str2 = r13;
                r10 = str6;
            }
            r10 = r12;
            str2 = null;
        } else {
            int i14 = this.datacenterId;
            if (i14 == Integer.MIN_VALUE || j24 == -2147483648L || i14 == 0) {
                onFail(true, 0);
                return false;
            }
            if (!this.encryptFile) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(this.location.volume_id);
                sb11.append("_");
                r10 = a4.a.n(this.location.local_id, ".temp", sb11);
                str = this.location.volume_id + "_" + this.location.local_id + "." + this.ext;
                if (this.key != null) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(this.location.volume_id);
                    sb12.append("_");
                    str2 = a4.a.n(this.location.local_id, "_64.iv", sb12);
                } else {
                    str2 = null;
                }
                if (this.notLoadedBytesRanges != null) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(this.location.volume_id);
                    sb13.append("_");
                    str3 = a4.a.n(this.location.local_id, "_64.pt", sb13);
                } else {
                    str3 = null;
                }
                StringBuilder sb14 = new StringBuilder();
                sb14.append(this.location.volume_id);
                sb14.append("_");
                r11 = a4.a.n(this.location.local_id, "_64.preload", sb14);
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
                return z11;
            }
            StringBuilder sb15 = new StringBuilder();
            sb15.append(this.location.volume_id);
            sb15.append("_");
            r12 = a4.a.n(this.location.local_id, ".temp.enc", sb15);
            StringBuilder sb16 = new StringBuilder();
            sb16.append(this.location.volume_id);
            sb16.append("_");
            sb16.append(this.location.local_id);
            sb16.append(".");
            str = a4.a.s(sb16, this.ext, ".enc");
            if (this.key != null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(this.location.volume_id);
                sb17.append("_");
                r13 = a4.a.n(this.location.local_id, "_64.iv.enc", sb17);
                String str62 = r12;
                str2 = r13;
                r10 = str62;
            }
            r10 = r12;
            str2 = null;
        }
        str3 = null;
        r11 = null;
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
        return z11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, long[]] */
    public long[] getDownloadedLengthFromOffset(long j3, long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? r22 = new long[2];
        Utilities.stageQueue.postRunnable(new t2(this, (Serializable) r22, j3, j10, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return r22;
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
        this.cancelAfterNoStreamListeners = new o2(this, 5);
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

    public FileLoadOperation(int i10, WebFile webFile) {
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
        this.cancelAfterNoStreamListeners = new o2(this, 5);
        updateParams();
        this.currentAccount = i10;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i11 = MessagesController.getInstance(i10).webFileDatacenterId;
        this.datacenterId = i11;
        this.initialDatacenterId = i11;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0126 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0041, B:6:0x0055, B:7:0x00cb, B:9:0x00d5, B:13:0x00e3, B:15:0x00ed, B:17:0x00f7, B:18:0x00ff, B:20:0x0107, B:23:0x0111, B:24:0x011c, B:26:0x0126, B:27:0x013c, B:29:0x0144, B:34:0x012b, B:36:0x0133, B:37:0x0138, B:38:0x011a, B:40:0x007d, B:42:0x0081, B:44:0x009a, B:45:0x009e, B:47:0x00af, B:51:0x00b9, B:49:0x00c8), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0041, B:6:0x0055, B:7:0x00cb, B:9:0x00d5, B:13:0x00e3, B:15:0x00ed, B:17:0x00f7, B:18:0x00ff, B:20:0x0107, B:23:0x0111, B:24:0x011c, B:26:0x0126, B:27:0x013c, B:29:0x0144, B:34:0x012b, B:36:0x0133, B:37:0x0138, B:38:0x011a, B:40:0x007d, B:42:0x0081, B:44:0x009a, B:45:0x009e, B:47:0x00af, B:51:0x00b9, B:49:0x00c8), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:3:0x0041, B:6:0x0055, B:7:0x00cb, B:9:0x00d5, B:13:0x00e3, B:15:0x00ed, B:17:0x00f7, B:18:0x00ff, B:20:0x0107, B:23:0x0111, B:24:0x011c, B:26:0x0126, B:27:0x013c, B:29:0x0144, B:34:0x012b, B:36:0x0133, B:37:0x0138, B:38:0x011a, B:40:0x007d, B:42:0x0081, B:44:0x009a, B:45:0x009e, B:47:0x00af, B:51:0x00b9, B:49:0x00c8), top: B:2:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileLoadOperation(TLRPC.Document document, Object obj) {
        boolean z10;
        long j3;
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
        this.cancelAfterNoStreamListeners = new o2(this, 5);
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
                int i10 = document.dc_id;
                this.datacenterId = i10;
                this.initialDatacenterId = i10;
                byte[] bArr = new byte[32];
                this.iv = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.key = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j10 = document.id;
                tL_inputDocumentFileLocation.id = j10;
                this.documentId = j10;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i11 = document.dc_id;
                this.datacenterId = i11;
                this.initialDatacenterId = i11;
                this.allowDisordererFileSave = true;
                int size = document.attributes.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    if (document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.supportsPreloading = true;
                        this.preloadPrefixSize = document.attributes.get(i12).preload_prefix_size;
                        break;
                    }
                    i12++;
                }
            }
            if (!"application/x-tgsticker".equals(document.mime_type) && !"application/x-tgwallpattern".equals(document.mime_type)) {
                z10 = false;
                this.ungzip = z10;
                j3 = document.size;
                this.totalBytesCount = j3;
                if (this.key != null && j3 % 16 != 0) {
                    long j11 = 16 - (j3 % 16);
                    this.bytesCountPadding = j11;
                    this.totalBytesCount = j3 + j11;
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
            z10 = true;
            this.ungzip = z10;
            j3 = document.size;
            this.totalBytesCount = j3;
            if (this.key != null) {
                long j112 = 16 - (j3 % 16);
                this.bytesCountPadding = j112;
                this.totalBytesCount = j3 + j112;
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
        } catch (Exception e7) {
            FileLog.e(e7);
            onFail(true, 0);
        }
    }
}

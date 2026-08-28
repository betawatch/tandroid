package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements FileLoadOperationStream {
    private volatile boolean canceled;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    private int debugCanceledCount;
    private boolean debugReportSend;
    private TLRPC.Document document;
    private String finishedFilePath;
    private boolean finishedLoadingFile;
    private long lastOffset;
    private FileLoadOperation loadOperation;
    private int loadingPriority;
    private ImageLocation location;
    private Object parentObject;
    private boolean preview;
    private final Object sync = new Object();
    private boolean waitingForLoad;

    public AnimatedFileDrawableStream(TLRPC.Document document, ImageLocation imageLocation, Object obj, int i9, boolean z10, int i10, int i11) {
        this.document = document;
        this.location = imageLocation;
        this.parentObject = obj;
        this.currentAccount = i9;
        this.preview = z10;
        this.loadingPriority = i10;
        this.loadOperation = FileLoader.getInstance(i9).loadStreamFile(this, this.document, this.location, this.parentObject, 0L, this.preview, i10, i11);
    }

    private void cancelLoadingInternal() {
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.document);
        if (this.location != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.location.location, "mp4");
        }
    }

    public void cancel() {
        cancel(true);
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public TLRPC.Document getDocument() {
        return this.document;
    }

    public String getFinishedFilePath() {
        return this.finishedFilePath;
    }

    public ImageLocation getLocation() {
        return this.location;
    }

    public Object getParentObject() {
        return this.document;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isFinishedLoadingFile() {
        return this.finishedLoadingFile;
    }

    public boolean isPreview() {
        return this.preview;
    }

    public boolean isWaitingForLoad() {
        return this.waitingForLoad;
    }

    @Override // org.telegram.messenger.FileLoadOperationStream
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.countDownLatch = null;
        }
    }

    public int read(int i9, int i10) {
        long j10;
        long j11;
        synchronized (this.sync) {
            try {
                if (this.canceled) {
                    int i11 = this.debugCanceledCount + 1;
                    this.debugCanceledCount = i11;
                    if (!this.debugReportSend && i11 > 200) {
                        this.debugReportSend = true;
                        FileLog.e(new RuntimeException("infinity stream reading!!!"));
                    }
                    return 0;
                }
                if (i10 == 0) {
                    return 0;
                }
                long j12 = 0;
                while (j12 == 0) {
                    try {
                        j10 = i9;
                        long[] downloadedLengthFromOffset = this.loadOperation.getDownloadedLengthFromOffset(j10, i10);
                        j11 = downloadedLengthFromOffset[0];
                        try {
                            if (!this.finishedLoadingFile && downloadedLengthFromOffset[1] != 0) {
                                this.finishedLoadingFile = true;
                                this.finishedFilePath = this.loadOperation.getCacheFileFinal().getAbsolutePath();
                            }
                        } catch (Exception e10) {
                            e = e10;
                            j12 = j11;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    if (j11 == 0) {
                        synchronized (this.sync) {
                            try {
                                if (this.canceled) {
                                    cancelLoadingInternal();
                                    return 0;
                                }
                                this.countDownLatch = new CountDownLatch(1);
                                if (this.loadOperation.isPaused() || this.lastOffset != j10 || this.preview) {
                                    FileLoadOperation loadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, this.location, this.parentObject, j10, this.preview, this.loadingPriority);
                                    FileLoadOperation fileLoadOperation = this.loadOperation;
                                    if (fileLoadOperation != loadStreamFile) {
                                        fileLoadOperation.removeStreamListener(this);
                                        this.loadOperation = loadStreamFile;
                                    }
                                    this.lastOffset = j10 + j11;
                                }
                                synchronized (this.sync) {
                                    try {
                                        if (this.canceled) {
                                            this.countDownLatch = null;
                                            cancelLoadingInternal();
                                            return 0;
                                        }
                                    } finally {
                                    }
                                }
                                if (!this.preview) {
                                    FileLoader.getInstance(this.currentAccount).setLoadingVideo(this.document, false, true);
                                }
                                CountDownLatch countDownLatch = this.countDownLatch;
                                if (countDownLatch != null) {
                                    this.waitingForLoad = true;
                                    countDownLatch.await();
                                    this.waitingForLoad = false;
                                }
                            } finally {
                            }
                            e = e10;
                            j12 = j11;
                            FileLog.e((Throwable) e, false);
                            return (int) j12;
                        }
                    }
                    j12 = j11;
                }
                this.lastOffset = i9 + j12;
                return (int) j12;
            } finally {
            }
        }
    }

    public void reset() {
        synchronized (this.sync) {
            this.canceled = false;
        }
    }

    public void cancel(boolean z10) {
        if (this.canceled) {
            return;
        }
        synchronized (this.sync) {
            try {
                CountDownLatch countDownLatch = this.countDownLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.countDownLatch = null;
                    if (z10 && !this.canceled && !this.preview) {
                        FileLoader.getInstance(this.currentAccount).removeLoadingVideo(this.document, false, true);
                    }
                }
                Object obj = this.parentObject;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    if (DownloadController.getInstance(messageObject.currentAccount).isDownloading(messageObject.getId())) {
                        z10 = false;
                    }
                }
                if (z10) {
                    cancelLoadingInternal();
                }
                this.canceled = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

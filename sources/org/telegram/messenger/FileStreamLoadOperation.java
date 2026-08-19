package org.telegram.messenger;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$-EL;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class FileStreamLoadOperation extends BaseDataSource implements FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private TLRPC.Document document;
    private RandomAccessFile file;
    private FileLoadOperation loadOperation;
    private boolean opened;
    private Object parentObject;
    private long requestedLength;
    private Uri uri;

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        Map map;
        map = Collections.EMPTY_MAP;
        return map;
    }

    public FileStreamLoadOperation() {
        super(true);
    }

    @Deprecated
    public FileStreamLoadOperation(TransferListener transferListener) {
        this();
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.id))) == null) {
            return 3;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        int intValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = intValue;
        this.parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
        this.document.size = Utilities.parseLong(this.uri.getQueryParameter("size")).longValue();
        this.document.dc_id = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("dc")).intValue();
        this.document.mime_type = this.uri.getQueryParameter("mime");
        this.document.file_reference = Utilities.hexToBytes(this.uri.getQueryParameter("reference"));
        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
        tL_documentAttributeFilename.file_name = this.uri.getQueryParameter("name");
        this.document.attributes.add(tL_documentAttributeFilename);
        if (this.document.mime_type.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            this.document.attributes.add(new TLRPC.TL_documentAttributeVideo());
        } else if (this.document.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.document.attributes.add(new TLRPC.TL_documentAttributeAudio());
        }
        allStreams.put(Long.valueOf(this.document.id), this);
        this.currentOffset = dataSpec.position;
        this.requestedLength = dataSpec.length;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j = this.document.size - dataSpec.position;
        this.bytesRemaining = j;
        long j2 = this.requestedLength;
        if (j2 != -1) {
            this.bytesRemaining = Math.min(j, j2);
        }
        this.opened = true;
        transferStarted(dataSpec);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            File currentFile = fileLoadOperation.getCurrentFile();
            this.currentFile = currentFile;
            if (currentFile != null) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.currentFile, "r");
                    this.file = randomAccessFile;
                    randomAccessFile.seek(this.currentOffset);
                    if (this.loadOperation.isFinished()) {
                        this.isNetwork = false;
                        long length = this.currentFile.length() - this.currentOffset;
                        this.bytesRemaining = length;
                        long j3 = this.requestedLength;
                        if (j3 != -1) {
                            this.bytesRemaining = Math.min(length, j3 - this.bytesTransferred);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        FileLog.e("FileStreamLoadOperation " + this.document.id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
        return this.bytesRemaining;
    }

    private int getCurrentPriority() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(priorityMap, Long.valueOf(this.document.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0019, code lost:
    
        if (r12.opened == false) goto L21;
     */
    @Override // com.google.android.exoplayer2.upstream.DataReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) {
        Exception exc;
        InterruptedException interruptedException;
        Exception e;
        InterruptedException e2;
        FileStreamLoadOperation fileStreamLoadOperation;
        RandomAccessFile randomAccessFile;
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j < i2) {
            i2 = (int) j;
        }
        int i3 = 0;
        while (true) {
            if (i3 == 0) {
                try {
                } catch (InterruptedException e3) {
                    interruptedException = e3;
                    FileLog.e(interruptedException);
                    return -3;
                } catch (Exception e4) {
                    exc = e4;
                    throw new IOException(exc);
                }
            }
            randomAccessFile = this.file;
            if (randomAccessFile != null) {
                break;
            }
            try {
                i3 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i2)[0];
                if (i3 == 0) {
                    this.countDownLatch = new CountDownLatch(1);
                    fileStreamLoadOperation = this;
                    try {
                        FileLoadOperation loadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(fileStreamLoadOperation, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
                        FileLoadOperation fileLoadOperation = fileStreamLoadOperation.loadOperation;
                        if (fileLoadOperation != loadStreamFile) {
                            fileLoadOperation.removeStreamListener(this);
                            fileStreamLoadOperation.loadOperation = loadStreamFile;
                        }
                        CountDownLatch countDownLatch = fileStreamLoadOperation.countDownLatch;
                        if (countDownLatch != null) {
                            countDownLatch.await();
                            fileStreamLoadOperation.countDownLatch = null;
                        }
                    } catch (InterruptedException e5) {
                        e2 = e5;
                        interruptedException = e2;
                        FileLog.e(interruptedException);
                        return -3;
                    } catch (Exception e6) {
                        e = e6;
                        exc = e;
                        throw new IOException(exc);
                    }
                } else {
                    fileStreamLoadOperation = this;
                }
                File currentFileFast = fileStreamLoadOperation.loadOperation.getCurrentFileFast();
                if (fileStreamLoadOperation.file == null || !Objects.equals(fileStreamLoadOperation.currentFile, currentFileFast)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("check stream file " + currentFileFast);
                    }
                    RandomAccessFile randomAccessFile2 = fileStreamLoadOperation.file;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (Exception unused) {
                        }
                    }
                    fileStreamLoadOperation.currentFile = currentFileFast;
                    if (currentFileFast != null) {
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(fileStreamLoadOperation.currentFile, "r");
                            fileStreamLoadOperation.file = randomAccessFile3;
                            randomAccessFile3.seek(fileStreamLoadOperation.currentOffset);
                            if (fileStreamLoadOperation.loadOperation.isFinished()) {
                                fileStreamLoadOperation.isNetwork = false;
                                long length = fileStreamLoadOperation.currentFile.length() - fileStreamLoadOperation.currentOffset;
                                fileStreamLoadOperation.bytesRemaining = length;
                                long j2 = fileStreamLoadOperation.requestedLength;
                                if (j2 != -1) {
                                    fileStreamLoadOperation.bytesRemaining = Math.min(length, j2 - fileStreamLoadOperation.bytesTransferred);
                                }
                            }
                        } catch (Throwable unused2) {
                            if (fileStreamLoadOperation.loadOperation.isFinished() && !fileStreamLoadOperation.currentFile.exists()) {
                                FileLoader.getInstance(fileStreamLoadOperation.currentAccount).cancelLoadFile(fileStreamLoadOperation.loadOperation.getFileName());
                                FileLoadOperation loadStreamFile2 = FileLoader.getInstance(fileStreamLoadOperation.currentAccount).loadStreamFile(fileStreamLoadOperation, fileStreamLoadOperation.document, null, fileStreamLoadOperation.parentObject, fileStreamLoadOperation.currentOffset, false, getCurrentPriority());
                                FileLoadOperation fileLoadOperation2 = fileStreamLoadOperation.loadOperation;
                                if (fileLoadOperation2 != loadStreamFile2) {
                                    fileLoadOperation2.removeStreamListener(this);
                                    fileStreamLoadOperation.loadOperation = loadStreamFile2;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException e7) {
                e2 = e7;
                interruptedException = e2;
                FileLog.e(interruptedException);
                return -3;
            } catch (Exception e8) {
                e = e8;
                exc = e;
                throw new IOException(exc);
            }
        }
        if (!this.opened) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i, i3);
        if (read > 0) {
            long j3 = read;
            this.currentOffset += j3;
            this.bytesRemaining -= j3;
            this.bytesTransferred += j3;
            bytesTransferred(read);
        }
        return read;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.id + " close me=" + this);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.id));
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.countDownLatch = null;
        }
    }

    @Override // org.telegram.messenger.FileLoadOperationStream
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        this.countDownLatch = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.id), Integer.valueOf(i));
        }
    }

    public static Uri prepareUri(int i, TLRPC.Document document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(document);
        File pathToAttach = FileLoader.getInstance(i).getPathToAttach(document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("?account=");
            sb.append(i);
            sb.append("&id=");
            sb.append(document.id);
            sb.append("&hash=");
            sb.append(document.access_hash);
            sb.append("&dc=");
            sb.append(document.dc_id);
            sb.append("&size=");
            sb.append(document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(FileLoader.getInstance(i).getFileReference(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.bytesToHex(bArr));
            return Uri.parse("tg://" + attachFileName + sb.toString());
        } catch (UnsupportedEncodingException e) {
            FileLog.e(e);
            return null;
        }
    }
}

package org.telegram.messenger;

import android.net.Uri;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FileStreamLoadOperation extends com.google.android.exoplayer2.upstream.g implements FileLoadOperationStream {
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

    public FileStreamLoadOperation() {
        super(true);
    }

    private int getCurrentPriority() {
        Integer num = (Integer) ConcurrentMap$-EL.getOrDefault(priorityMap, Long.valueOf(this.document.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.id))) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static Uri prepareUri(int i9, TLRPC.Document document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(document);
        File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i9);
            sb2.append("&id=");
            sb2.append(document.id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(FileLoader.getInstance(i9).getFileReference(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.bytesToHex(bArr));
            return Uri.parse("tg://" + attachFileName + sb2.toString());
        } catch (UnsupportedEncodingException e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i9) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.id), Integer.valueOf(i9));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
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
            } catch (Exception e10) {
                FileLog.e(e10);
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

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.m
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public Uri getUri() {
        return this.uri;
    }

    @Override // org.telegram.messenger.FileLoadOperationStream
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        this.countDownLatch = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public long open(com.google.android.exoplayer2.upstream.q qVar) {
        Uri uri = qVar.a;
        long j10 = qVar.e;
        this.uri = uri;
        transferInitializing(qVar);
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
        this.currentOffset = j10;
        this.requestedLength = qVar.f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j11 = this.document.size - j10;
        this.bytesRemaining = j11;
        long j12 = this.requestedLength;
        if (j12 != -1) {
            this.bytesRemaining = Math.min(j11, j12);
        }
        this.opened = true;
        transferStarted(qVar);
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
                        long j13 = this.requestedLength;
                        if (j13 != -1) {
                            this.bytesRemaining = Math.min(length, j13 - this.bytesTransferred);
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

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0019, code lost:
    
        if (r12.opened == false) goto L21;
     */
    @Override // com.google.android.exoplayer2.upstream.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i9, int i10) {
        Exception exc;
        InterruptedException interruptedException;
        Exception e10;
        InterruptedException e11;
        FileStreamLoadOperation fileStreamLoadOperation;
        RandomAccessFile randomAccessFile;
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.bytesRemaining;
        if (j10 == 0) {
            return -1;
        }
        if (j10 < i10) {
            i10 = (int) j10;
        }
        int i11 = 0;
        while (true) {
            if (i11 == 0) {
                try {
                } catch (InterruptedException e12) {
                    interruptedException = e12;
                    FileLog.e(interruptedException);
                    return -3;
                } catch (Exception e13) {
                    exc = e13;
                    throw new IOException(exc);
                }
            }
            randomAccessFile = this.file;
            if (randomAccessFile != null) {
                break;
            }
            try {
                i11 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i10)[0];
                if (i11 == 0) {
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
                    } catch (InterruptedException e14) {
                        e11 = e14;
                        interruptedException = e11;
                        FileLog.e(interruptedException);
                        return -3;
                    } catch (Exception e15) {
                        e10 = e15;
                        exc = e10;
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
                                long j11 = fileStreamLoadOperation.requestedLength;
                                if (j11 != -1) {
                                    fileStreamLoadOperation.bytesRemaining = Math.min(length, j11 - fileStreamLoadOperation.bytesTransferred);
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
            } catch (InterruptedException e16) {
                e11 = e16;
                interruptedException = e11;
                FileLog.e(interruptedException);
                return -3;
            } catch (Exception e17) {
                e10 = e17;
                exc = e10;
                throw new IOException(exc);
            }
        }
        if (!this.opened) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i9, i11);
        if (read > 0) {
            long j12 = read;
            this.currentOffset += j12;
            this.bytesRemaining -= j12;
            this.bytesTransferred += j12;
            bytesTransferred(read);
        }
        return read;
    }

    @Deprecated
    public FileStreamLoadOperation(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this();
        if (y0Var != null) {
            addTransferListener(y0Var);
        }
    }
}

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class FileStreamLoadOperation implements g5.m, FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private g5.p dataSpec;
    private TLRPC.Document document;
    private RandomAccessFile file;
    protected boolean isNetwork;
    private int listenerCount;
    private final ArrayList<g5.v0> listeners;
    private FileLoadOperation loadOperation;
    private boolean opened;
    private Object parentObject;
    private long requestedLength;
    private Uri uri;

    public FileStreamLoadOperation() {
        this.isNetwork = true;
        this.listeners = new ArrayList<>(1);
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

    public static Uri prepareUri(int i10, TLRPC.Document document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(document);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb = new StringBuilder("?account=");
            sb.append(i10);
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
            sb.append(FileLoader.getInstance(i10).getFileReference(obj));
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

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.id), Integer.valueOf(i10));
        }
    }

    @Override // g5.m
    public final void addTransferListener(g5.v0 v0Var) {
        v0Var.getClass();
        if (this.listeners.contains(v0Var)) {
            return;
        }
        this.listeners.add(v0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i10) {
        g5.p pVar = this.dataSpec;
        int i11 = h5.d0.a;
        for (int i12 = 0; i12 < this.listenerCount; i12++) {
            g5.v0 v0Var = this.listeners.get(i12);
            boolean z4 = this.isNetwork;
            g5.s sVar = (g5.s) v0Var;
            synchronized (sVar) {
                if (z4) {
                    if (pVar != null) {
                        try {
                            if ((pVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    sVar.h += i10;
                }
            }
        }
    }

    @Override // g5.m
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

    @Override // g5.m
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // g5.m
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

    @Override // g5.m
    public long open(g5.p pVar) {
        Uri uri = pVar.a;
        long j10 = pVar.e;
        this.uri = uri;
        transferInitializing(pVar);
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
        this.requestedLength = pVar.f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j11 = this.document.size - j10;
        this.bytesRemaining = j11;
        long j12 = this.requestedLength;
        if (j12 != -1) {
            this.bytesRemaining = Math.min(j11, j12);
        }
        this.opened = true;
        transferStarted(pVar);
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
    @Override // g5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i10, int i11) {
        Exception exc;
        InterruptedException interruptedException;
        Exception e;
        InterruptedException e6;
        FileStreamLoadOperation fileStreamLoadOperation;
        RandomAccessFile randomAccessFile;
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.bytesRemaining;
        if (j10 == 0) {
            return -1;
        }
        if (j10 < i11) {
            i11 = (int) j10;
        }
        int i12 = 0;
        while (true) {
            if (i12 == 0) {
                try {
                } catch (InterruptedException e10) {
                    interruptedException = e10;
                    FileLog.e(interruptedException);
                    return -3;
                } catch (Exception e11) {
                    exc = e11;
                    throw new IOException(exc);
                }
            }
            randomAccessFile = this.file;
            if (randomAccessFile != null) {
                break;
            }
            try {
                i12 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i11)[0];
                if (i12 == 0) {
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
                    } catch (InterruptedException e12) {
                        e6 = e12;
                        interruptedException = e6;
                        FileLog.e(interruptedException);
                        return -3;
                    } catch (Exception e13) {
                        e = e13;
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
            } catch (InterruptedException e14) {
                e6 = e14;
                interruptedException = e6;
                FileLog.e(interruptedException);
                return -3;
            } catch (Exception e15) {
                e = e15;
                exc = e;
                throw new IOException(exc);
            }
        }
        if (!this.opened) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i10, i12);
        if (read > 0) {
            long j12 = read;
            this.currentOffset += j12;
            this.bytesRemaining -= j12;
            this.bytesTransferred += j12;
            bytesTransferred(read);
        }
        return read;
    }

    public final void transferEnded() {
        g5.p pVar = this.dataSpec;
        int i10 = h5.d0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            ((g5.s) this.listeners.get(i11)).e(pVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g5.p pVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(g5.p pVar) {
        this.dataSpec = pVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((g5.s) this.listeners.get(i10)).f(pVar, this.isNetwork);
        }
    }

    @Deprecated
    public FileStreamLoadOperation(g5.v0 v0Var) {
        this();
        if (v0Var != null) {
            addTransferListener(v0Var);
        }
    }
}

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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class FileStreamLoadOperation implements g2.h, FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private g2.m dataSpec;
    private TLRPC.Document document;
    private RandomAccessFile file;
    protected boolean isNetwork;
    private int listenerCount;
    private final ArrayList<g2.c0> listeners;
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
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i10);
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
            sb2.append(FileLoader.getInstance(i10).getFileReference(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.bytesToHex(bArr));
            return Uri.parse("tg://" + attachFileName + sb2.toString());
        } catch (UnsupportedEncodingException e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.id), Integer.valueOf(i10));
        }
    }

    @Override // g2.h
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        if (this.listeners.contains(c0Var)) {
            return;
        }
        this.listeners.add(c0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i10) {
        g2.m mVar = this.dataSpec;
        String str = e2.d0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            g2.c0 c0Var = this.listeners.get(i11);
            boolean z10 = this.isNetwork;
            y2.f fVar = (y2.f) c0Var;
            synchronized (fVar) {
                if (z10) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.i += i10;
                }
            }
        }
    }

    @Override // g2.h
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
            } catch (Exception e7) {
                FileLog.e(e7);
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

    @Override // g2.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // g2.h
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

    @Override // g2.h
    public long open(g2.m mVar) {
        Uri uri = mVar.a;
        long j3 = mVar.e;
        this.uri = uri;
        transferInitializing(mVar);
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
        this.currentOffset = j3;
        this.requestedLength = mVar.f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j10 = this.document.size - j3;
        this.bytesRemaining = j10;
        long j11 = this.requestedLength;
        if (j11 != -1) {
            this.bytesRemaining = Math.min(j10, j11);
        }
        this.opened = true;
        transferStarted(mVar);
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
                        long j12 = this.requestedLength;
                        if (j12 != -1) {
                            this.bytesRemaining = Math.min(length, j12 - this.bytesTransferred);
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
    @Override // b2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i10, int i11) {
        Exception exc;
        InterruptedException interruptedException;
        Exception e7;
        InterruptedException e10;
        FileStreamLoadOperation fileStreamLoadOperation;
        RandomAccessFile randomAccessFile;
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.bytesRemaining;
        if (j3 == 0) {
            return -1;
        }
        if (j3 < i11) {
            i11 = (int) j3;
        }
        int i12 = 0;
        while (true) {
            if (i12 == 0) {
                try {
                } catch (InterruptedException e11) {
                    interruptedException = e11;
                    FileLog.e(interruptedException);
                    return -3;
                } catch (Exception e12) {
                    exc = e12;
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
                    } catch (InterruptedException e13) {
                        e10 = e13;
                        interruptedException = e10;
                        FileLog.e(interruptedException);
                        return -3;
                    } catch (Exception e14) {
                        e7 = e14;
                        exc = e7;
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
                                long j10 = fileStreamLoadOperation.requestedLength;
                                if (j10 != -1) {
                                    fileStreamLoadOperation.bytesRemaining = Math.min(length, j10 - fileStreamLoadOperation.bytesTransferred);
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
            } catch (InterruptedException e15) {
                e10 = e15;
                interruptedException = e10;
                FileLog.e(interruptedException);
                return -3;
            } catch (Exception e16) {
                e7 = e16;
                exc = e7;
                throw new IOException(exc);
            }
        }
        if (!this.opened) {
            return 0;
        }
        int read = randomAccessFile.read(bArr, i10, i12);
        if (read > 0) {
            long j11 = read;
            this.currentOffset += j11;
            this.bytesRemaining -= j11;
            this.bytesTransferred += j11;
            bytesTransferred(read);
        }
        return read;
    }

    public final void transferEnded() {
        g2.m mVar = this.dataSpec;
        String str = e2.d0.a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).e(mVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g2.m mVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(g2.m mVar) {
        this.dataSpec = mVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).f(mVar, this.isNetwork);
        }
    }

    @Deprecated
    public FileStreamLoadOperation(g2.c0 c0Var) {
        this();
        if (c0Var != null) {
            addTransferListener(c0Var);
        }
    }
}

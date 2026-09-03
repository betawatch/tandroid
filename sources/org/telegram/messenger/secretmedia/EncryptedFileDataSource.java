package org.telegram.messenger.secretmedia;

import android.net.Uri;
import g5.g;
import g5.n;
import g5.p;
import g5.v0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLoader;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class EncryptedFileDataSource extends g {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th2) {
            super(th2);
        }
    }

    public EncryptedFileDataSource() {
        super(false);
    }

    @Override // g5.m
    public void close() {
        try {
            this.fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.fileInputStream = null;
        this.uri = null;
    }

    @Override // g5.g, g5.m
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // g5.m
    public Uri getUri() {
        return this.uri;
    }

    @Override // g5.m
    public long open(p pVar) {
        Uri uri = pVar.a;
        long j10 = pVar.f;
        long j11 = pVar.e;
        this.uri = uri;
        File file = new File(pVar.a.getPath());
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(FileLoader.getInternalCacheDir(), w2.k(file.getName(), ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(j11);
        int length = (int) file.length();
        transferInitializing(pVar);
        long j12 = length;
        if (j11 > j12) {
            throw new n(2008);
        }
        int i10 = (int) (j12 - j11);
        this.bytesRemaining = i10;
        if (j10 != -1) {
            this.bytesRemaining = (int) Math.min(i10, j10);
        }
        this.opened = true;
        transferStarted(pVar);
        return j10 != -1 ? j10 : this.bytesRemaining;
    }

    @Override // g5.j
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.bytesRemaining;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        try {
            this.fileInputStream.read(bArr, i10, min);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Deprecated
    public EncryptedFileDataSource(v0 v0Var) {
        this();
        if (v0Var != null) {
            addTransferListener(v0Var);
        }
    }
}

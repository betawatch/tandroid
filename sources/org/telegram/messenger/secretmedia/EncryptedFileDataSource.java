package org.telegram.messenger.secretmedia;

import android.net.Uri;
import i2.c;
import i2.d0;
import i2.k;
import i2.n;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class EncryptedFileDataSource extends c {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th2) {
            super(th2);
        }
    }

    public EncryptedFileDataSource() {
        super(false);
    }

    @Override // i2.h
    public void close() {
        try {
            this.fileInputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.fileInputStream = null;
        this.uri = null;
    }

    @Override // i2.c, i2.h
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // i2.h
    public Uri getUri() {
        return this.uri;
    }

    @Override // i2.h
    public long open(n nVar) {
        this.uri = nVar.a;
        File file = new File(nVar.a.getPath());
        String name = file.getName();
        Pattern pattern = w7.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(t0.b.getCacheDir(), t4.c.q(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(nVar.e);
        int length = (int) file.length();
        transferInitializing(nVar);
        long j10 = nVar.e;
        long j11 = length;
        if (j10 > j11) {
            throw new k(2008);
        }
        int i3 = (int) (j11 - j10);
        this.bytesRemaining = i3;
        long j12 = nVar.f;
        if (j12 != -1) {
            this.bytesRemaining = (int) Math.min(i3, j12);
        }
        this.opened = true;
        transferStarted(nVar);
        long j13 = nVar.f;
        return j13 != -1 ? j13 : this.bytesRemaining;
    }

    @Override // d2.o
    public int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.bytesRemaining;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        try {
            this.fileInputStream.read(bArr, i3, min);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Deprecated
    public EncryptedFileDataSource(d0 d0Var) {
        this();
        if (d0Var != null) {
            addTransferListener(d0Var);
        }
    }
}

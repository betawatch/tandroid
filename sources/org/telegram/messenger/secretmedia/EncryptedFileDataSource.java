package org.telegram.messenger.secretmedia;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class EncryptedFileDataSource extends sf0 {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th) {
            super(th);
        }
    }

    @Deprecated
    public EncryptedFileDataSource(v2c v2cVar) {
        this();
        if (v2cVar != null) {
            addTransferListener(v2cVar);
        }
    }

    @Override // h73
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

    @Override // sf0, h73
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // h73
    public Uri getUri() {
        return this.uri;
    }

    @Override // h73
    public long open(n73 n73Var) {
        this.uri = n73Var.a;
        File file = new File(n73Var.a.getPath());
        String name = file.getName();
        Pattern pattern = xb4.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(a.b.getCacheDir(), qd4.o(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(n73Var.e);
        int length = (int) file.length();
        transferInitializing(n73Var);
        long j = n73Var.e;
        long j2 = length;
        if (j > j2) {
            throw new k73(2008);
        }
        int i = (int) (j2 - j);
        this.bytesRemaining = i;
        long j3 = n73Var.f;
        if (j3 != -1) {
            this.bytesRemaining = (int) Math.min(i, j3);
        }
        this.opened = true;
        transferStarted(n73Var);
        long j4 = n73Var.f;
        return j4 != -1 ? j4 : this.bytesRemaining;
    }

    @Override // z63
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        try {
            this.fileInputStream.read(bArr, i, min);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    public EncryptedFileDataSource() {
        super(false);
    }
}

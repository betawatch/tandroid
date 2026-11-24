package org.telegram.messenger.secretmedia;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class EncryptedFileDataSource extends qg0 {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th) {
            super(th);
        }
    }

    @Deprecated
    public EncryptedFileDataSource(w0c w0cVar) {
        this();
        if (w0cVar != null) {
            addTransferListener(w0cVar);
        }
    }

    @Override // a83
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

    @Override // qg0, a83
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // a83
    public Uri getUri() {
        return this.uri;
    }

    @Override // a83
    public long open(g83 g83Var) {
        this.uri = g83Var.a;
        File file = new File(g83Var.a.getPath());
        String name = file.getName();
        Pattern pattern = bc4.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(a.b.getCacheDir(), td4.p(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(g83Var.e);
        int length = (int) file.length();
        transferInitializing(g83Var);
        long j = g83Var.e;
        long j2 = length;
        if (j > j2) {
            throw new d83(2008);
        }
        int i = (int) (j2 - j);
        this.bytesRemaining = i;
        long j3 = g83Var.f;
        if (j3 != -1) {
            this.bytesRemaining = (int) Math.min(i, j3);
        }
        this.opened = true;
        transferStarted(g83Var);
        long j4 = g83Var.f;
        return j4 != -1 ? j4 : this.bytesRemaining;
    }

    @Override // s73
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

package org.telegram.messenger.secretmedia;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class EncryptedFileDataSource extends qf0 {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th) {
            super(th);
        }
    }

    @Deprecated
    public EncryptedFileDataSource(vyb vybVar) {
        this();
        if (vybVar != null) {
            addTransferListener(vybVar);
        }
    }

    @Override // o63
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

    @Override // qf0, o63
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // o63
    public Uri getUri() {
        return this.uri;
    }

    @Override // o63
    public long open(u63 u63Var) {
        this.uri = u63Var.a;
        File file = new File(u63Var.a.getPath());
        String name = file.getName();
        Pattern pattern = ba4.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(a.b.getCacheDir(), tb4.o(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(u63Var.e);
        int length = (int) file.length();
        transferInitializing(u63Var);
        long j = u63Var.e;
        long j2 = length;
        if (j > j2) {
            throw new r63(2008);
        }
        int i = (int) (j2 - j);
        this.bytesRemaining = i;
        long j3 = u63Var.f;
        if (j3 != -1) {
            this.bytesRemaining = (int) Math.min(i, j3);
        }
        this.opened = true;
        transferStarted(u63Var);
        long j4 = u63Var.f;
        return j4 != -1 ? j4 : this.bytesRemaining;
    }

    @Override // g63
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

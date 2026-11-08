package j2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import h2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u extends c {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean d;

    @Override // j2.h
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new t(e10, 2000);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override // j2.h
    public final Uri getUri() {
        return this.b;
    }

    @Override // j2.h
    public final long open(m mVar) {
        Uri uri = mVar.a;
        long j3 = mVar.e;
        this.b = uri;
        transferInitializing(mVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long j10 = mVar.f;
                if (j10 == -1) {
                    j10 = this.a.length() - j3;
                }
                this.c = j10;
                if (j10 < 0) {
                    throw new t(null, null, 2008);
                }
                this.d = true;
                transferStarted(mVar);
                return this.c;
            } catch (IOException e10) {
                throw new t(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new t(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            n10.append(fragment);
            throw new t(n10.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new t(e12, 2006);
        } catch (RuntimeException e13) {
            throw new t(e13, 2000);
        }
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.c;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = m0.a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j3, i10));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e10) {
            throw new t(e10, 2000);
        }
    }
}

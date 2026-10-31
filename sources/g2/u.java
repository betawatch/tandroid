package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e2.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends c {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean d;

    @Override // g2.h
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new t(e, 2000);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.b;
    }

    @Override // g2.h
    public final long open(n nVar) {
        Uri uri = nVar.a;
        long j10 = nVar.e;
        this.b = uri;
        transferInitializing(nVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = nVar.f;
                if (j11 == -1) {
                    j11 = this.a.length() - j10;
                }
                this.c = j11;
                if (j11 < 0) {
                    throw new t(null, null, 2008);
                }
                this.d = true;
                transferStarted(nVar);
                return this.c;
            } catch (IOException e) {
                throw new t(e, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new t(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder v = a1.g.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            v.append(fragment);
            throw new t(v.toString(), e7, 1004);
        } catch (SecurityException e10) {
            throw new t(e10, 2006);
        } catch (RuntimeException e11) {
            throw new t(e11, 2000);
        }
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = l0.a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new t(e, 2000);
        }
    }
}

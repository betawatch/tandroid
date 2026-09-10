package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t extends c {
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
                throw new s(e, 2000);
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
                    throw new s(null, null, 2008);
                }
                this.d = true;
                transferStarted(mVar);
                return this.c;
            } catch (IOException e) {
                throw new s(e, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new s(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder w10 = a4.a.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            w10.append(fragment);
            throw new s(w10.toString(), e7, 1004);
        } catch (SecurityException e10) {
            throw new s(e10, 2006);
        } catch (RuntimeException e11) {
            throw new s(e11, 2000);
        }
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.c;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = e2.d0.a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j3, i11));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new s(e, 2000);
        }
    }
}

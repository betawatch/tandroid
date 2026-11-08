package j2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import h2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends c {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long d;
    public boolean e;

    public b(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // j2.h
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
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
        try {
            Uri uri = mVar.a;
            long j3 = mVar.e;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j3) < j3) {
                throw new a(null, 2008);
            }
            long j10 = mVar.f;
            if (j10 != -1) {
                this.d = j10;
            } else {
                long available = this.c.available();
                this.d = available;
                if (available == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            transferStarted(mVar);
            return this.d;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.d;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i10 = (int) Math.min(j3, i10);
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            }
            InputStream inputStream = this.c;
            String str = m0.a;
            int read = inputStream.read(bArr, i7, i10);
            if (read != -1) {
                long j10 = this.d;
                if (j10 != -1) {
                    this.d = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

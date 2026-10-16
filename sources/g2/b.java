package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import e2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    @Override // g2.h
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
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
        try {
            Uri uri = mVar.a;
            long j10 = mVar.e;
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
            if (open.skip(j10) < j10) {
                throw new a(null, 2008);
            }
            long j11 = mVar.f;
            if (j11 != -1) {
                this.d = j11;
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
        } catch (a e) {
            throw e;
        } catch (IOException e7) {
            throw new a(e7, e7 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.d;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new a(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            String str = m0.a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j11 = this.d;
                if (j11 != -1) {
                    this.d = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

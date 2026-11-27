// default package

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lx extends sf0 {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long d;
    public boolean e;

    public lx(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // h73
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new kx(e, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override // h73
    public final Uri getUri() {
        return this.b;
    }

    @Override // h73
    public final long open(n73 n73Var) {
        try {
            Uri uri = n73Var.a;
            long j = n73Var.e;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(n73Var);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j) < j) {
                throw new kx(null, 2008);
            }
            long j2 = n73Var.f;
            if (j2 != -1) {
                this.d = j2;
            } else {
                long available = this.c.available();
                this.d = available;
                if (available == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            transferStarted(n73Var);
            return this.d;
        } catch (kx e) {
            throw e;
        } catch (IOException e2) {
            throw new kx(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // z63
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new kx(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            String str = gcc.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.d;
                if (j2 != -1) {
                    this.d = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}

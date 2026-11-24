// default package

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kx extends qf0 {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long d;
    public boolean e;

    public kx(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // o63
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new jx(e, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override // o63
    public final Uri getUri() {
        return this.b;
    }

    @Override // o63
    public final long open(u63 u63Var) {
        try {
            Uri uri = u63Var.a;
            long j = u63Var.e;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(u63Var);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j) < j) {
                throw new jx(null, 2008);
            }
            long j2 = u63Var.f;
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
            transferStarted(u63Var);
            return this.d;
        } catch (jx e) {
            throw e;
        } catch (IOException e2) {
            throw new jx(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // g63
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
                    throw new jx(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            String str = g8c.a;
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

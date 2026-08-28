package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends g {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long d;
    public boolean e;

    public c(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(q qVar) {
        try {
            Uri uri = qVar.a;
            long j10 = qVar.e;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(qVar);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j10) < j10) {
                throw new b(null, 2008);
            }
            long j11 = qVar.f;
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
            transferStarted(qVar);
            return this.d;
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.d;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new b(e10, 2000);
                }
            }
            InputStream inputStream = this.c;
            int i11 = d5.f0.a;
            int read = inputStream.read(bArr, i9, i10);
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

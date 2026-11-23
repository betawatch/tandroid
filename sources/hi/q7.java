package hi;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q7 extends MediaDataSource {
    public final Uri a;
    public final long b;
    public volatile org.telegram.messenger.r8 c;
    public long d = -1;
    public volatile boolean e;

    public q7(long j3, Uri uri) {
        this.a = uri;
        this.b = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
        org.telegram.messenger.r8 r8Var = this.c;
        if (r8Var != null) {
            try {
                r8Var.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0001, B:5:0x0005, B:15:0x0013, B:17:0x0017, B:20:0x003d, B:27:0x004e, B:30:0x0056, B:31:0x005d, B:32:0x0020, B:34:0x0027, B:35:0x002a, B:36:0x005e, B:37:0x0065), top: B:2:0x0001 }] */
    @Override // android.media.MediaDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int readAt(long j3, byte[] bArr, int i7, int i10) {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j3 >= this.b) {
                return -1;
            }
            if (i10 == 0) {
                return 0;
            }
            if (this.c != null) {
                if (j3 != this.d) {
                }
                int read = this.c.read(bArr, i7, i10);
                if (!this.e) {
                    throw new IOException("closed");
                }
                if (read <= 0) {
                    return read == 0 ? 0 : -1;
                }
                this.d += read;
                return read;
            }
            org.telegram.messenger.r8 r8Var = this.c;
            this.c = null;
            if (r8Var != null) {
                r8Var.close();
            }
            org.telegram.messenger.r8 r8Var2 = new org.telegram.messenger.r8();
            r8Var2.open(new j2.m(j3, this.a));
            this.c = r8Var2;
            this.d = j3;
            int read2 = this.c.read(bArr, i7, i10);
            if (!this.e) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

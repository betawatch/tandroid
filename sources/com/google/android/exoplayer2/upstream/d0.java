package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d0 extends g {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean d;

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new c0(e10, 2000);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // com.google.android.exoplayer2.upstream.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(q qVar) {
        boolean b10;
        Uri uri = qVar.a;
        long j10 = qVar.e;
        this.b = uri;
        transferInitializing(qVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = qVar.f;
                if (j11 == -1) {
                    j11 = this.a.length() - j10;
                }
                this.c = j11;
                if (j11 < 0) {
                    throw new c0(null, null, 2008);
                }
                this.d = true;
                transferStarted(qVar);
                return this.c;
            } catch (IOException e10) {
                throw new c0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (f5.d0.a >= 21) {
                    b10 = b0.b(e11.getCause());
                }
                i10 = 2005;
                throw new c0(e11, i10);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder k9 = th.k("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            k9.append(fragment);
            throw new c0(k9.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new c0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new c0(e13, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
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
            int i12 = f5.d0.a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e10) {
            throw new c0(e10, 2000);
        }
    }
}

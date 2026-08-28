package com.google.android.exoplayer2.upstream;

import java.io.InputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends InputStream {
    public final m a;
    public final q b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public o(m mVar, q qVar) {
        this.a = mVar;
        this.b = qVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.open(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        d5.a.i(!this.e);
        a();
        int read = this.a.read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}

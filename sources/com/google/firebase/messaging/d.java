package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class d extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;

    public d(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i9) {
        ((FilterInputStream) this).in.mark(i9);
        this.c = this.b;
    }

    private final synchronized void b(int i9) {
        this.c = this.b;
        super.mark(i9);
    }

    private final synchronized void c() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.c;
    }

    private final synchronized void d() {
        super.reset();
        this.b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        switch (this.a) {
            case 0:
                a(i9);
                break;
            default:
                b(i9);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        switch (this.a) {
            case 0:
                if (this.b == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.b--;
                }
                return read;
            default:
                int read2 = super.read();
                if (read2 >= 0) {
                    this.b++;
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.a) {
            case 0:
                c();
                break;
            default:
                d();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        switch (this.a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.b));
                this.b -= skip;
                return skip;
            default:
                long j11 = this.b;
                long skip2 = super.skip(j10);
                this.b = j11 + skip2;
                return skip2;
        }
    }

    public d(InputStream inputStream, long j10) {
        super(inputStream);
        this.b = j10;
    }

    public d(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        switch (this.a) {
            case 0:
                long j10 = this.b;
                if (j10 == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i9, (int) Math.min(i10, j10));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            default:
                long j11 = this.b;
                int read2 = super.read(bArr, i9, i10);
                if (read2 > 0) {
                    this.b = j11 + read2;
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.a) {
            case 1:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }
}

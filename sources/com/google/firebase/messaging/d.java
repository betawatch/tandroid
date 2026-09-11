package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class d extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;

    public d(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.c = this.b;
    }

    private final synchronized void b(int i10) {
        this.c = this.b;
        super.mark(i10);
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
    public final synchronized void mark(int i10) {
        switch (this.a) {
            case 0:
                a(i10);
                break;
            default:
                b(i10);
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
    public long skip(long j3) {
        switch (this.a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j3, this.b));
                this.b -= skip;
                return skip;
            default:
                long j10 = this.b;
                long skip2 = super.skip(j3);
                this.b = j10 + skip2;
                return skip2;
        }
    }

    public d(InputStream inputStream, long j3) {
        super(inputStream);
        this.b = j3;
    }

    public d(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        switch (this.a) {
            case 0:
                long j3 = this.b;
                if (j3 == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j3));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            default:
                long j10 = this.b;
                int read2 = super.read(bArr, i10, i11);
                if (read2 > 0) {
                    this.b = j10 + read2;
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

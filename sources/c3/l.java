package c3;

import b2.p0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class l implements r {
    public final b2.o b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        p0.a("media3.extractor");
    }

    public l(b2.o oVar, long j10, long j11) {
        this.b = oVar;
        this.d = j10;
        this.c = j11;
    }

    @Override // c3.r
    public final void a(int i10, int i11, byte[] bArr) {
        j(bArr, i10, i11, false);
    }

    public final void b(int i10) {
        int i11 = this.f + i10;
        byte[] bArr = this.e;
        if (i11 > bArr.length) {
            this.e = Arrays.copyOf(this.e, e2.m0.i(bArr.length * 2, 65536 + i11, i11 + TLObject.FLAG_19));
        }
    }

    public final int c(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.r
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            e(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = c(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        return i13 != -1;
    }

    public final void e(int i10) {
        int i11 = this.h - i10;
        this.h = i11;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i11 < bArr.length - TLObject.FLAG_19 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.e = bArr2;
    }

    @Override // c3.r
    public final long getLength() {
        return this.c;
    }

    @Override // c3.r
    public final long getPosition() {
        return this.d;
    }

    @Override // c3.r
    public final int h(int i10, int i11, byte[] bArr) {
        l lVar;
        int min;
        b(i11);
        int i12 = this.h;
        int i13 = this.f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            lVar = this;
            min = lVar.c(this.e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(lVar.e, lVar.f, bArr, i10, min);
        lVar.f += min;
        return min;
    }

    @Override // c3.r
    public final boolean i(int i10, boolean z10) {
        int min = Math.min(this.h, i10);
        e(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.a;
            i11 = c(bArr, -i11, Math.min(i10, bArr.length + i11), i11, z10);
        }
        if (i11 != -1) {
            this.d += i11;
        }
        return i11 != -1;
    }

    @Override // c3.r
    public final boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        if (!u(i11, z10)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i11, bArr, i10, i11);
        return true;
    }

    @Override // c3.r
    public final long k() {
        return this.d + this.f;
    }

    @Override // c3.r
    public final void l(int i10) {
        u(i10, false);
    }

    @Override // c3.r
    public final void q() {
        this.f = 0;
    }

    @Override // c3.r
    public final void r(int i10) {
        i(i10, false);
    }

    @Override // b2.o
    public final int read(byte[] bArr, int i10, int i11) {
        l lVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            e(min);
            i13 = min;
        }
        if (i13 == 0) {
            lVar = this;
            i13 = lVar.c(bArr, i10, i11, 0, true);
        } else {
            lVar = this;
        }
        if (i13 != -1) {
            lVar.d += i13;
        }
        return i13;
    }

    @Override // c3.r
    public final void readFully(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    @Override // c3.r
    public final int skip(int i10) {
        l lVar;
        int min = Math.min(this.h, i10);
        e(min);
        if (min == 0) {
            byte[] bArr = this.a;
            lVar = this;
            min = lVar.c(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override // c3.r
    public final boolean u(int i10, boolean z10) {
        b(i10);
        int i11 = this.h - this.f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z11 = z10;
            i11 = c(this.e, this.f, i12, i11, z11);
            if (i11 == -1) {
                return false;
            }
            this.h = this.f + i11;
            i10 = i12;
            z10 = z11;
        }
        this.f += i10;
        return true;
    }
}

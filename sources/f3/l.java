package f3;

import e2.m0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l implements p {
    public final e2.n b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[TLObject.FLAG_12];

    static {
        m0.a("media3.extractor");
    }

    public l(e2.n nVar, long j3, long j10) {
        this.b = nVar;
        this.d = j3;
        this.c = j10;
    }

    public final void a(int i7) {
        int i10 = this.f + i7;
        byte[] bArr = this.e;
        if (i10 > bArr.length) {
            this.e = Arrays.copyOf(this.e, h2.m0.i(bArr.length * 2, 65536 + i10, i10 + TLObject.FLAG_19));
        }
    }

    @Override // f3.p
    public final void b(int i7, int i10, byte[] bArr) {
        k(bArr, i7, i10, false);
    }

    @Override // f3.p
    public final boolean c(byte[] bArr, int i7, int i10, boolean z9) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.e, 0, bArr, i7, min);
            e(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = d(bArr, i7, i10, i12, z9);
        }
        if (i12 != -1) {
            this.d += i12;
        }
        return i12 != -1;
    }

    public final int d(byte[] bArr, int i7, int i10, int i11, boolean z9) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i7 + i11, i10 - i11);
        if (read != -1) {
            return i11 + read;
        }
        if (i11 == 0 && z9) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(int i7) {
        int i10 = this.h - i7;
        this.h = i10;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i10 < bArr.length - TLObject.FLAG_19 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        this.e = bArr2;
    }

    @Override // f3.p
    public final long getLength() {
        return this.c;
    }

    @Override // f3.p
    public final long getPosition() {
        return this.d;
    }

    @Override // f3.p
    public final int i(int i7, int i10, byte[] bArr) {
        l lVar;
        int min;
        a(i10);
        int i11 = this.h;
        int i12 = this.f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.d(this.e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.e, lVar.f, bArr, i7, min);
        lVar.f += min;
        return min;
    }

    @Override // f3.p
    public final boolean j(int i7, boolean z9) {
        int min = Math.min(this.h, i7);
        e(min);
        int i10 = min;
        while (i10 < i7 && i10 != -1) {
            byte[] bArr = this.a;
            i10 = d(bArr, -i10, Math.min(i7, bArr.length + i10), i10, z9);
        }
        if (i10 != -1) {
            this.d += i10;
        }
        return i10 != -1;
    }

    @Override // f3.p
    public final boolean k(byte[] bArr, int i7, int i10, boolean z9) {
        if (!v(i10, z9)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i10, bArr, i7, i10);
        return true;
    }

    @Override // f3.p
    public final long l() {
        return this.d + this.f;
    }

    @Override // f3.p
    public final void m(int i7) {
        v(i7, false);
    }

    @Override // f3.p
    public final void q() {
        this.f = 0;
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        l lVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.e, 0, bArr, i7, min);
            e(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.d(bArr, i7, i10, 0, true);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.d += i12;
        }
        return i12;
    }

    @Override // f3.p
    public final void readFully(byte[] bArr, int i7, int i10) {
        c(bArr, i7, i10, false);
    }

    @Override // f3.p
    public final void s(int i7) {
        j(i7, false);
    }

    @Override // f3.p
    public final int skip(int i7) {
        l lVar;
        int min = Math.min(this.h, i7);
        e(min);
        if (min == 0) {
            byte[] bArr = this.a;
            lVar = this;
            min = lVar.d(bArr, 0, Math.min(i7, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override // f3.p
    public final boolean v(int i7, boolean z9) {
        a(i7);
        int i10 = this.h - this.f;
        while (i10 < i7) {
            int i11 = i7;
            boolean z10 = z9;
            i10 = d(this.e, this.f, i11, i10, z10);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f + i10;
            i7 = i11;
            z9 = z10;
        }
        this.f += i7;
        return true;
    }
}

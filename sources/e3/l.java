package e3;

import d2.o0;
import g2.n0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements p {
    public final d2.o b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[TLObject.FLAG_12];

    static {
        o0.a("media3.extractor");
    }

    public l(d2.o oVar, long j10, long j11) {
        this.b = oVar;
        this.d = j10;
        this.c = j11;
    }

    public final void a(int i3) {
        int i10 = this.f + i3;
        byte[] bArr = this.e;
        if (i10 > bArr.length) {
            this.e = Arrays.copyOf(this.e, n0.i(bArr.length * 2, 65536 + i10, i10 + TLObject.FLAG_19));
        }
    }

    public final int b(byte[] bArr, int i3, int i10, int i11, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i3 + i11, i10 - i11);
        if (read != -1) {
            return i11 + read;
        }
        if (i11 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // e3.p
    public final void c(int i3, int i10, byte[] bArr) {
        h(bArr, i3, i10, false);
    }

    @Override // e3.p
    public final boolean d(byte[] bArr, int i3, int i10, boolean z10) {
        int min;
        int i11 = this.h;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.e, 0, bArr, i3, min);
            f(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = b(bArr, i3, i10, i12, z10);
        }
        if (i12 != -1) {
            this.d += i12;
        }
        return i12 != -1;
    }

    @Override // e3.p
    public final int e(int i3, int i10, byte[] bArr) {
        l lVar;
        int min;
        a(i10);
        int i11 = this.h;
        int i12 = this.f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            lVar = this;
            min = lVar.b(this.e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            lVar.h += min;
        } else {
            lVar = this;
            min = Math.min(i10, i13);
        }
        System.arraycopy(lVar.e, lVar.f, bArr, i3, min);
        lVar.f += min;
        return min;
    }

    public final void f(int i3) {
        int i10 = this.h - i3;
        this.h = i10;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i10 < bArr.length - TLObject.FLAG_19 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        this.e = bArr2;
    }

    @Override // e3.p
    public final boolean g(int i3, boolean z10) {
        int min = Math.min(this.h, i3);
        f(min);
        int i10 = min;
        while (i10 < i3 && i10 != -1) {
            byte[] bArr = this.a;
            i10 = b(bArr, -i10, Math.min(i3, bArr.length + i10), i10, z10);
        }
        if (i10 != -1) {
            this.d += i10;
        }
        return i10 != -1;
    }

    @Override // e3.p
    public final long getLength() {
        return this.c;
    }

    @Override // e3.p
    public final long getPosition() {
        return this.d;
    }

    @Override // e3.p
    public final boolean h(byte[] bArr, int i3, int i10, boolean z10) {
        if (!w(i10, z10)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i10, bArr, i3, i10);
        return true;
    }

    @Override // e3.p
    public final long k() {
        return this.d + this.f;
    }

    @Override // e3.p
    public final void n(int i3) {
        w(i3, false);
    }

    @Override // e3.p
    public final void o() {
        this.f = 0;
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        l lVar;
        int i11 = this.h;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.e, 0, bArr, i3, min);
            f(min);
            i12 = min;
        }
        if (i12 == 0) {
            lVar = this;
            i12 = lVar.b(bArr, i3, i10, 0, true);
        } else {
            lVar = this;
        }
        if (i12 != -1) {
            lVar.d += i12;
        }
        return i12;
    }

    @Override // e3.p
    public final void readFully(byte[] bArr, int i3, int i10) {
        d(bArr, i3, i10, false);
    }

    @Override // e3.p
    public final int skip(int i3) {
        l lVar;
        int min = Math.min(this.h, i3);
        f(min);
        if (min == 0) {
            byte[] bArr = this.a;
            lVar = this;
            min = lVar.b(bArr, 0, Math.min(i3, bArr.length), 0, true);
        } else {
            lVar = this;
        }
        if (min != -1) {
            lVar.d += min;
        }
        return min;
    }

    @Override // e3.p
    public final void u(int i3) {
        g(i3, false);
    }

    @Override // e3.p
    public final boolean w(int i3, boolean z10) {
        a(i3);
        int i10 = this.h - this.f;
        while (i10 < i3) {
            int i11 = i3;
            boolean z11 = z10;
            i10 = b(this.e, this.f, i11, i10, z11);
            if (i10 == -1) {
                return false;
            }
            this.h = this.f + i10;
            i3 = i11;
            z10 = z11;
        }
        this.f += i3;
        return true;
    }
}

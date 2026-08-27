package m3;

import d5.g0;
import h3.r0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements l {
    public final com.google.android.exoplayer2.upstream.j b;
    public final long c;
    public long d;
    public int f;
    public int h;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        r0.a("goog.exo.extractor");
    }

    public h(com.google.android.exoplayer2.upstream.j jVar, long j10, long j11) {
        this.b = jVar;
        this.d = j10;
        this.c = j11;
    }

    public final boolean a(int i10, boolean z10) {
        c(i10);
        int i11 = this.h - this.f;
        while (i11 < i10) {
            int i12 = i10;
            boolean z11 = z10;
            i11 = f(this.e, this.f, i12, i11, z11);
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

    @Override // m3.l
    public final void b(int i10, int i11, byte[] bArr) {
        g(bArr, i10, i11, false);
    }

    public final void c(int i10) {
        int i11 = this.f + i10;
        byte[] bArr = this.e;
        if (i11 > bArr.length) {
            this.e = Arrays.copyOf(this.e, g0.h(bArr.length * 2, 65536 + i11, i11 + TLObject.FLAG_19));
        }
    }

    @Override // m3.l
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.h;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            h(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = f(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.d += i13;
        }
        return i13 != -1;
    }

    @Override // m3.l
    public final int e(int i10, int i11, byte[] bArr) {
        h hVar;
        int min;
        c(i11);
        int i12 = this.h;
        int i13 = this.f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            hVar = this;
            min = hVar.f(this.e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            hVar.h += min;
        } else {
            hVar = this;
            min = Math.min(i11, i14);
        }
        System.arraycopy(hVar.e, hVar.f, bArr, i10, min);
        hVar.f += min;
        return min;
    }

    public final int f(byte[] bArr, int i10, int i11, int i12, boolean z10) {
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

    @Override // m3.l
    public final boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i11, bArr, i10, i11);
        return true;
    }

    @Override // m3.l
    public final long getLength() {
        return this.c;
    }

    @Override // m3.l
    public final long getPosition() {
        return this.d;
    }

    public final void h(int i10) {
        int i11 = this.h - i10;
        this.h = i11;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i11 < bArr.length - TLObject.FLAG_19 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.e = bArr2;
    }

    @Override // m3.l
    public final long i() {
        return this.d + this.f;
    }

    @Override // m3.l
    public final void j(int i10) {
        a(i10, false);
    }

    @Override // m3.l
    public final void q() {
        this.f = 0;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar;
        int i12 = this.h;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.e, 0, bArr, i10, min);
            h(min);
            i13 = min;
        }
        if (i13 == 0) {
            hVar = this;
            i13 = hVar.f(bArr, i10, i11, 0, true);
        } else {
            hVar = this;
        }
        if (i13 != -1) {
            hVar.d += i13;
        }
        return i13;
    }

    @Override // m3.l
    public final void readFully(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    @Override // m3.l
    public final int skip(int i10) {
        h hVar;
        int min = Math.min(this.h, i10);
        h(min);
        if (min == 0) {
            byte[] bArr = this.a;
            hVar = this;
            min = hVar.f(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            hVar = this;
        }
        if (min != -1) {
            hVar.d += min;
        }
        return min;
    }

    @Override // m3.l
    public final void t(int i10) {
        int min = Math.min(this.h, i10);
        h(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = this.a;
            i11 = f(bArr, -i11, Math.min(i10, bArr.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.d += i11;
        }
    }
}

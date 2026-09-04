package k2;

import java.nio.ByteBuffer;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j0 extends c2.i {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public j0() {
        byte[] bArr = e2.d0.b;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i10 = this.p;
            short s10 = this.j;
            if (i10 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s10) {
                        int i11 = this.n;
                        position = ((limit3 / i11) * i11) + i11;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                e2.d.g(this.t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s10) {
                        int i12 = this.n;
                        limit = (position2 / i12) * i12;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i13 = this.t;
                int i14 = this.u;
                int i15 = i13 + i14;
                byte[] bArr = this.s;
                if (i15 < bArr.length) {
                    i13 = bArr.length;
                } else {
                    i15 = i14 - (bArr.length - i13);
                }
                int i16 = i13 - i15;
                boolean z10 = limit < limit4;
                int min = Math.min(position3, i16);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i15, min);
                int i17 = this.u + min;
                this.u = i17;
                e2.d.g(i17 <= this.s.length);
                boolean z11 = z10 && position3 < i16;
                l(z11);
                if (z11) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // c2.i
    public final c2.f f(c2.f fVar) {
        if (fVar.c == 2) {
            return fVar.a == -1 ? c2.f.e : fVar;
        }
        throw new c2.g(fVar);
    }

    @Override // c2.i
    public final void g() {
        if (isActive()) {
            int i10 = this.b.b * 2;
            this.n = i10;
            int i11 = ((((int) ((this.l * r0.a) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.s.length != i11) {
                this.s = new byte[i11];
                this.v = new byte[i11];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // c2.i
    public final void h() {
        if (this.u > 0) {
            l(true);
            this.r = 0;
        }
    }

    @Override // c2.i
    public final void i() {
        this.o = false;
        byte[] bArr = e2.d0.b;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // c2.i, c2.h
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    public final int k(int i10) {
        int length = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        e2.d.g(length >= 0);
        int min = (int) Math.min((i10 * this.i) + 0.5f, length);
        int i11 = this.n;
        return (min / i11) * i11;
    }

    public final void l(boolean z10) {
        int length;
        int k10;
        int i10 = this.u;
        byte[] bArr = this.s;
        if (i10 == bArr.length || z10) {
            if (this.r == 0) {
                if (z10) {
                    m(i10, 3);
                    length = i10;
                } else {
                    e2.d.g(i10 >= bArr.length / 2);
                    length = this.s.length / 2;
                    m(length, 0);
                }
                k10 = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int k11 = k(length2) + (this.s.length / 2);
                m(k11, 2);
                k10 = k11;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                k10 = k(length);
                m(k10, 1);
            }
            e2.d.f("bytesConsumed is not aligned to frame size: %s" + length, length % this.n == 0);
            e2.d.g(i10 >= k10);
            this.u -= length;
            int i11 = this.t + length;
            this.t = i11;
            this.t = i11 % this.s.length;
            this.r = (k10 / this.n) + this.r;
            this.q += (length - k10) / r2;
        }
    }

    public final void m(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        e2.d.b(this.u >= i10);
        if (i11 == 2) {
            int i12 = this.t;
            int i13 = this.u;
            int i14 = i12 + i13;
            byte[] bArr = this.s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.v, 0, i15);
                    System.arraycopy(this.s, 0, this.v, i15, length);
                }
            }
        } else {
            int i16 = this.t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i10 - length2);
            }
        }
        e2.d.a("sizeToOutput is not aligned to frame size: " + i10, i10 % this.n == 0);
        e2.d.g(this.t < this.s.length);
        byte[] bArr3 = this.v;
        e2.d.a("byteOutput size is not aligned to frame size " + i10, i10 % this.n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.k;
                if (i11 == 0) {
                    i21 = ((((i18 * MediaDataController.MAX_STYLE_RUNS_COUNT) / (i10 - 1)) * (i21 - 100)) / MediaDataController.MAX_STYLE_RUNS_COUNT) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * MediaDataController.MAX_STYLE_RUNS_COUNT) * (100 - i21)) / (i10 - 1)) / MediaDataController.MAX_STYLE_RUNS_COUNT;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = Byte.MIN_VALUE;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        j(i10).put(bArr3, 0, i10).flip();
    }
}

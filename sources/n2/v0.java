package n2;

import a8.ia;
import a8.ja;
import java.nio.ByteBuffer;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class v0 extends f2.o {
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

    public v0() {
        byte[] bArr = h2.m0.b;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i7 = this.p;
            short s5 = this.j;
            if (i7 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s5) {
                        int i10 = this.n;
                        position = ((limit3 / i10) * i10) + i10;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException();
                }
                ia.p(this.t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s5) {
                        int i11 = this.n;
                        limit = (position2 / i11) * i11;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i12 = this.t;
                int i13 = this.u;
                int i14 = i12 + i13;
                byte[] bArr = this.s;
                if (i14 < bArr.length) {
                    i12 = bArr.length;
                } else {
                    i14 = i13 - (bArr.length - i12);
                }
                int i15 = i12 - i14;
                boolean z9 = limit < limit4;
                int min = Math.min(position3, i15);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i14, min);
                int i16 = this.u + min;
                this.u = i16;
                ia.p(i16 <= this.s.length);
                boolean z10 = z9 && position3 < i15;
                n(z10);
                if (z10) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // f2.o
    public final f2.k h(f2.k kVar) {
        if (kVar.c == 2) {
            return kVar.a == -1 ? f2.k.e : kVar;
        }
        throw new f2.m(kVar);
    }

    @Override // f2.o
    public final void i() {
        if (isActive()) {
            int i7 = this.b.b * 2;
            this.n = i7;
            int i10 = ((((int) ((this.l * r0.a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.s.length != i10) {
                this.s = new byte[i10];
                this.v = new byte[i10];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // f2.o, f2.n
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    @Override // f2.o
    public final void j() {
        if (this.u > 0) {
            n(true);
            this.r = 0;
        }
    }

    @Override // f2.o
    public final void k() {
        this.o = false;
        byte[] bArr = h2.m0.b;
        this.s = bArr;
        this.v = bArr;
    }

    public final int m(int i7) {
        int length = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        ia.p(length >= 0);
        int min = (int) Math.min((i7 * this.i) + 0.5f, length);
        int i10 = this.n;
        return (min / i10) * i10;
    }

    public final void n(boolean z9) {
        int length;
        int m10;
        int i7 = this.u;
        byte[] bArr = this.s;
        if (i7 == bArr.length || z9) {
            if (this.r == 0) {
                if (z9) {
                    o(i7, 3);
                    length = i7;
                } else {
                    ia.p(i7 >= bArr.length / 2);
                    length = this.s.length / 2;
                    o(length, 0);
                }
                m10 = length;
            } else if (z9) {
                int length2 = i7 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m11 = m(length2) + (this.s.length / 2);
                o(m11, 2);
                m10 = m11;
                length = length3;
            } else {
                length = i7 - (bArr.length / 2);
                m10 = m(length);
                o(m10, 1);
            }
            if (!(length % this.n == 0)) {
                throw new IllegalStateException(ja.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            ia.p(i7 >= m10);
            this.u -= length;
            int i10 = this.t + length;
            this.t = i10;
            this.t = i10 % this.s.length;
            this.r = (m10 / this.n) + this.r;
            this.q += (length - m10) / r2;
        }
    }

    public final void o(int i7, int i10) {
        if (i7 == 0) {
            return;
        }
        ia.f(this.u >= i7);
        if (i10 == 2) {
            int i11 = this.t;
            int i12 = this.u;
            int i13 = i11 + i12;
            byte[] bArr = this.s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i7, this.v, 0, i7);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.v, 0, i7);
                } else {
                    int i14 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.v, 0, i14);
                    System.arraycopy(this.s, 0, this.v, i14, length);
                }
            }
        } else {
            int i15 = this.t;
            int i16 = i15 + i7;
            byte[] bArr2 = this.s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.v, 0, i7);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i7 - length2);
            }
        }
        ia.c(i7, "sizeToOutput is not aligned to frame size: %s", i7 % this.n == 0);
        ia.p(this.t < this.s.length);
        byte[] bArr3 = this.v;
        ia.c(i7, "byteOutput size is not aligned to frame size %s", i7 % this.n == 0);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i7; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & 255);
                int i20 = this.k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i7 - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i7 - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = Byte.MIN_VALUE;
                } else {
                    bArr3[i17] = (byte) (i21 & qs.e4);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        l(i7).put(bArr3, 0, i7).flip();
    }
}

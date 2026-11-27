// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ela extends ef0 {
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // q20
    public final void d(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            boolean z = this.k;
            if (!z) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.n.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3 - 1) & 255) | (byteBuffer.get(limit3) << 8)) > 1024) {
                        int i = this.i;
                        position = ((limit3 / i) * i) + i;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.k = true;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (!z) {
                    grb.g();
                    return;
                }
                yve.p(this.o < this.n.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2 - 1) & 255) | (byteBuffer.get(position2) << 8)) > 1024) {
                        int i2 = this.i;
                        limit = (position2 / i2) * i2;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.o;
                int i4 = this.p;
                int i5 = i3 + i4;
                byte[] bArr = this.n;
                if (i5 < bArr.length) {
                    i3 = bArr.length;
                } else {
                    i5 = i4 - (bArr.length - i3);
                }
                int i6 = i3 - i5;
                boolean z2 = limit < limit4;
                int min = Math.min(position3, i6);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.n, i5, min);
                int i7 = this.p + min;
                this.p = i7;
                yve.p(i7 <= this.n.length);
                boolean z3 = z2 && position3 < i6;
                n(z3);
                if (z3) {
                    this.k = false;
                    this.m = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // ef0
    public final void i() {
        if (isActive()) {
            int i = this.b.b << 1;
            this.i = i;
            int i2 = ((((((int) ((100000 * r0.a) / 1000000)) * i) / 2) / i) * i) << 1;
            if (this.n.length != i2) {
                this.n = new byte[i2];
                this.q = new byte[i2];
            }
        }
        this.k = false;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // ef0, q20
    public final boolean isActive() {
        return super.isActive() && this.j;
    }

    @Override // ef0
    public final void j() {
        if (this.p > 0) {
            n(true);
            this.m = 0;
        }
    }

    @Override // ef0
    public final void k() {
        this.j = false;
        byte[] bArr = gcc.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final int m(int i) {
        int length = ((((int) ((2000000 * this.b.a) / 1000000)) - this.m) * this.i) - (this.n.length / 2);
        yve.p(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (min / i2) * i2;
    }

    public final void n(boolean z) {
        int length;
        int m;
        int i = this.p;
        byte[] bArr = this.n;
        if (i == bArr.length || z) {
            if (this.m == 0) {
                if (z) {
                    o(i, 3);
                    length = i;
                } else {
                    yve.p(i >= bArr.length / 2);
                    length = this.n.length / 2;
                    o(length, 0);
                }
                m = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m2 = m(length2) + (this.n.length / 2);
                o(m2, 2);
                m = m2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                m = m(length);
                o(m, 1);
            }
            if (!(length % this.i == 0)) {
                grb.i(fze.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            yve.p(i >= m);
            this.p -= length;
            int i2 = this.o + length;
            this.o = i2;
            this.o = i2 % this.n.length;
            this.m = (m / this.i) + this.m;
            this.l += (length - m) / r2;
        }
    }

    public final void o(int i, int i2) {
        if (i == 0) {
            return;
        }
        yve.f(this.p >= i);
        int i3 = this.o;
        if (i2 == 2) {
            int i4 = this.p;
            int i5 = i3 + i4;
            byte[] bArr = this.n;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.q, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.q;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.n, 0, this.q, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.n, 0, this.q, length3, i - length3);
            }
        }
        yve.c(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        yve.p(this.o < this.n.length);
        byte[] bArr5 = this.q;
        yve.c(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            int i8 = (i / this.i) - 1;
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr5[i9] & 255) | (bArr5[i10] << 8);
                int i12 = 10;
                if (i2 == 0) {
                    int i13 = i9 / this.i;
                    if (i8 != 0) {
                        i12 = ((((i13 * 1000) / i8) * (-90)) / 1000) + 100;
                    }
                } else if (i2 == 2) {
                    i12 = i8 == 0 ? 100 : ((((i9 / this.i) * 90000) / i8) / 1000) + 10;
                }
                int i14 = (i11 * i12) / 100;
                if (i14 >= 32767) {
                    bArr5[i9] = -1;
                    bArr5[i10] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr5[i9] = 0;
                    bArr5[i10] = Byte.MIN_VALUE;
                } else {
                    bArr5[i9] = (byte) (i14 & jn7.d4);
                    bArr5[i10] = (byte) (i14 >> 8);
                }
            }
        }
        l(i).put(bArr5, 0, i).flip();
    }
}

package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q0 extends a0 {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public q0() {
        byte[] bArr = h5.d0.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // l3.n
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i10 = this.p;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > this.k) {
                            int i11 = this.l;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 == 1) {
                int limit3 = byteBuffer.limit();
                int k10 = k(byteBuffer);
                int position2 = k10 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i12 = this.q;
                int i13 = length - i12;
                if (k10 >= limit3 || position2 >= i13) {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    int i14 = this.q + min;
                    this.q = i14;
                    byte[] bArr2 = this.n;
                    if (i14 == bArr2.length) {
                        if (this.s) {
                            l(this.r, bArr2);
                            this.t += (this.q - (this.r * 2)) / this.l;
                        } else {
                            this.t += (i14 - this.r) / this.l;
                        }
                        m(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(i12, bArr);
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int k11 = k(byteBuffer);
                byteBuffer.limit(k11);
                this.t += byteBuffer.remaining() / this.l;
                m(byteBuffer, this.o, this.r);
                if (k11 < limit4) {
                    l(this.r, this.o);
                    this.p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // l3.a0
    public final l f(l lVar) {
        if (lVar.c == 2) {
            return this.m ? lVar : l.e;
        }
        throw new m(lVar);
    }

    @Override // l3.a0
    public final void g() {
        if (this.m) {
            l lVar = this.b;
            int i10 = lVar.d;
            this.l = i10;
            int i11 = lVar.a;
            int i12 = ((int) ((this.i * i11) / 1000000)) * i10;
            if (this.n.length != i12) {
                this.n = new byte[i12];
            }
            int i13 = ((int) ((this.j * i11) / 1000000)) * i10;
            this.r = i13;
            if (this.o.length != i13) {
                this.o = new byte[i13];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // l3.a0
    public final void h() {
        int i10 = this.q;
        if (i10 > 0) {
            l(i10, this.n);
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.l;
    }

    @Override // l3.a0
    public final void i() {
        this.m = false;
        this.r = 0;
        byte[] bArr = h5.d0.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // l3.a0, l3.n
    public final boolean isActive() {
        return this.m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i10 = this.l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i10, byte[] bArr) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i11 = this.r - min;
        System.arraycopy(bArr, i10 - i11, this.o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i11, min);
    }
}

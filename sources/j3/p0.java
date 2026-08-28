package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends x {
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

    public p0() {
        byte[] bArr = d5.f0.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i9 = this.p;
            if (i9 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > this.k) {
                            int i10 = this.l;
                            position = ((limit2 / i10) * i10) + i10;
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
            } else if (i9 == 1) {
                int limit3 = byteBuffer.limit();
                int k10 = k(byteBuffer);
                int position2 = k10 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i11 = this.q;
                int i12 = length - i11;
                if (k10 >= limit3 || position2 >= i12) {
                    int min = Math.min(position2, i12);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    int i13 = this.q + min;
                    this.q = i13;
                    byte[] bArr2 = this.n;
                    if (i13 == bArr2.length) {
                        if (this.s) {
                            l(this.r, bArr2);
                            this.t += (this.q - (this.r * 2)) / this.l;
                        } else {
                            this.t += (i13 - this.r) / this.l;
                        }
                        m(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(i11, bArr);
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i9 != 2) {
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

    @Override // j3.x
    public final h f(h hVar) {
        if (hVar.c == 2) {
            return this.m ? hVar : h.e;
        }
        throw new i(hVar);
    }

    @Override // j3.x
    public final void g() {
        if (this.m) {
            h hVar = this.b;
            int i9 = hVar.d;
            this.l = i9;
            int i10 = hVar.a;
            int i11 = ((int) ((this.i * i10) / 1000000)) * i9;
            if (this.n.length != i11) {
                this.n = new byte[i11];
            }
            int i12 = ((int) ((this.j * i10) / 1000000)) * i9;
            this.r = i12;
            if (this.o.length != i12) {
                this.o = new byte[i12];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // j3.x
    public final void h() {
        int i9 = this.q;
        if (i9 > 0) {
            l(i9, this.n);
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.l;
    }

    @Override // j3.x
    public final void i() {
        this.m = false;
        this.r = 0;
        byte[] bArr = d5.f0.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // j3.x, j3.j
    public final boolean isActive() {
        return this.m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i9 = this.l;
                return (position / i9) * i9;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i9, byte[] bArr) {
        j(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i10 = this.r - min;
        System.arraycopy(bArr, i9 - i10, this.o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i10, min);
    }
}

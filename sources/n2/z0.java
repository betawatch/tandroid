package n2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z0 extends f2.o {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // f2.o, f2.n
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // f2.o, f2.n
    public final ByteBuffer b() {
        int i7;
        if (super.a() && (i7 = this.n) > 0) {
            l(i7).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i10 = i7 - min;
        int length = (this.n + i10) - this.m.length;
        ByteBuffer l10 = l(length);
        int i11 = h2.m0.i(length, 0, this.n);
        l10.put(this.m, 0, i11);
        int i12 = h2.m0.i(length - i11, 0, i10);
        byteBuffer.limit(byteBuffer.position() + i12);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i13 = i10 - i12;
        int i14 = this.n - i11;
        this.n = i14;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i11, bArr, 0, i14);
        byteBuffer.get(this.m, this.n, i13);
        this.n += i13;
        l10.flip();
    }

    @Override // f2.o, f2.n
    public final long g(long j3) {
        return Math.max(0L, j3 - h2.m0.Y(this.b.a, this.j + this.i));
    }

    @Override // f2.o
    public final f2.k h(f2.k kVar) {
        if (!h2.m0.M(kVar.c)) {
            throw new f2.m(kVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? f2.k.e : kVar;
    }

    @Override // f2.o
    public final void i() {
        if (this.k) {
            this.k = false;
            int i7 = this.j;
            int i10 = this.b.d;
            this.m = new byte[i7 * i10];
            this.l = this.i * i10;
        }
        this.n = 0;
    }

    @Override // f2.o
    public final void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // f2.o
    public final void k() {
        this.m = h2.m0.b;
    }
}

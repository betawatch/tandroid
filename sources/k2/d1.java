package k2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d1 extends c2.p {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // c2.p, c2.o
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.n) > 0) {
            l(i10).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // c2.o
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.n + i11) - this.m.length;
        ByteBuffer l4 = l(length);
        int i12 = e2.n0.i(length, 0, this.n);
        l4.put(this.m, 0, i12);
        int i13 = e2.n0.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        l4.put(byteBuffer);
        byteBuffer.limit(limit);
        int i14 = i11 - i13;
        int i15 = this.n - i12;
        this.n = i15;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.m, this.n, i14);
        this.n += i14;
        l4.flip();
    }

    @Override // c2.p, c2.o
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // c2.p, c2.o
    public final long g(long j10) {
        return Math.max(0L, j10 - e2.n0.Y(this.b.a, this.j + this.i));
    }

    @Override // c2.p
    public final c2.l h(c2.l lVar) {
        if (!e2.n0.M(lVar.c)) {
            throw new c2.n(lVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? c2.l.e : lVar;
    }

    @Override // c2.p
    public final void i() {
        if (this.k) {
            this.k = false;
            int i10 = this.j;
            int i11 = this.b.d;
            this.m = new byte[i10 * i11];
            this.l = this.i * i11;
        }
        this.n = 0;
    }

    @Override // c2.p
    public final void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // c2.p
    public final void k() {
        this.m = e2.n0.b;
    }
}

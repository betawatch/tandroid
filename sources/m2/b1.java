package m2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b1 extends e2.n {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // e2.n, e2.m
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // e2.n, e2.m
    public final ByteBuffer b() {
        int i3;
        if (super.a() && (i3 = this.n) > 0) {
            l(i3).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // e2.m
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        if (i3 == 0) {
            return;
        }
        int min = Math.min(i3, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i10 = i3 - min;
        int length = (this.n + i10) - this.m.length;
        ByteBuffer l10 = l(length);
        int i11 = g2.n0.i(length, 0, this.n);
        l10.put(this.m, 0, i11);
        int i12 = g2.n0.i(length - i11, 0, i10);
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

    @Override // e2.n, e2.m
    public final long g(long j10) {
        return Math.max(0L, j10 - g2.n0.Y(this.b.a, this.j + this.i));
    }

    @Override // e2.n
    public final e2.j h(e2.j jVar) {
        if (!g2.n0.M(jVar.c)) {
            throw new e2.l(jVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? e2.j.e : jVar;
    }

    @Override // e2.n
    public final void i() {
        if (this.k) {
            this.k = false;
            int i3 = this.j;
            int i10 = this.b.d;
            this.m = new byte[i3 * i10];
            this.l = this.i * i10;
        }
        this.n = 0;
    }

    @Override // e2.n
    public final void j() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // e2.n
    public final void k() {
        this.m = g2.n0.b;
    }
}

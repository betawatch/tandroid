package k2;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m0 extends c2.i {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // c2.i, c2.h
    public final ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.n) > 0) {
            j(i10).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // c2.i, c2.h
    public final boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
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
        ByteBuffer j3 = j(length);
        int h = e2.d0.h(length, 0, this.n);
        j3.put(this.m, 0, h);
        int h10 = e2.d0.h(length - h, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h10);
        j3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h10;
        int i13 = this.n - h;
        this.n = i13;
        byte[] bArr = this.m;
        System.arraycopy(bArr, h, bArr, 0, i13);
        byteBuffer.get(this.m, this.n, i12);
        this.n += i12;
        j3.flip();
    }

    @Override // c2.i
    public final c2.f f(c2.f fVar) {
        if (!e2.d0.K(fVar.c)) {
            throw new c2.g(fVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? c2.f.e : fVar;
    }

    @Override // c2.i
    public final void g() {
        if (this.k) {
            this.k = false;
            int i10 = this.j;
            int i11 = this.b.d;
            this.m = new byte[i10 * i11];
            this.l = this.i * i11;
        }
        this.n = 0;
    }

    @Override // c2.i
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // c2.i
    public final void i() {
        this.m = e2.d0.b;
    }
}

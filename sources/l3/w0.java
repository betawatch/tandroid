package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class w0 extends a0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // l3.a0, l3.n
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.n) > 0) {
            j(i10).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // l3.n
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
        ByteBuffer j10 = j(length);
        int h = h5.d0.h(length, 0, this.n);
        j10.put(this.m, 0, h);
        int h9 = h5.d0.h(length - h, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h9);
        j10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h9;
        int i13 = this.n - h;
        this.n = i13;
        byte[] bArr = this.m;
        System.arraycopy(bArr, h, bArr, 0, i13);
        byteBuffer.get(this.m, this.n, i12);
        this.n += i12;
        j10.flip();
    }

    @Override // l3.a0, l3.n
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // l3.a0
    public final l f(l lVar) {
        if (lVar.c != 2) {
            throw new m(lVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? l.e : lVar;
    }

    @Override // l3.a0
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

    @Override // l3.a0
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // l3.a0
    public final void i() {
        this.m = h5.d0.f;
    }
}

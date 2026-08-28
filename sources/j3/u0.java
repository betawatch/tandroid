package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u0 extends x {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // j3.x, j3.j
    public final ByteBuffer a() {
        int i9;
        if (super.d() && (i9 = this.n) > 0) {
            j(i9).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        if (i9 == 0) {
            return;
        }
        int min = Math.min(i9, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i10 = i9 - min;
        int length = (this.n + i10) - this.m.length;
        ByteBuffer j10 = j(length);
        int h = d5.f0.h(length, 0, this.n);
        j10.put(this.m, 0, h);
        int h10 = d5.f0.h(length - h, 0, i10);
        byteBuffer.limit(byteBuffer.position() + h10);
        j10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i11 = i10 - h10;
        int i12 = this.n - h;
        this.n = i12;
        byte[] bArr = this.m;
        System.arraycopy(bArr, h, bArr, 0, i12);
        byteBuffer.get(this.m, this.n, i11);
        this.n += i11;
        j10.flip();
    }

    @Override // j3.x, j3.j
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // j3.x
    public final h f(h hVar) {
        if (hVar.c != 2) {
            throw new i(hVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? h.e : hVar;
    }

    @Override // j3.x
    public final void g() {
        if (this.k) {
            this.k = false;
            int i9 = this.j;
            int i10 = this.b.d;
            this.m = new byte[i9 * i10];
            this.l = this.i * i10;
        }
        this.n = 0;
    }

    @Override // j3.x
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // j3.x
    public final void i() {
        this.m = d5.f0.f;
    }
}

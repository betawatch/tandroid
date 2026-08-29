package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v0 extends y {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // l3.y, l3.j
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.n) > 0) {
            j(i10).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // l3.j
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
        int h = f5.d0.h(length, 0, this.n);
        j10.put(this.m, 0, h);
        int h10 = f5.d0.h(length - h, 0, i11);
        byteBuffer.limit(byteBuffer.position() + h10);
        j10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - h10;
        int i13 = this.n - h;
        this.n = i13;
        byte[] bArr = this.m;
        System.arraycopy(bArr, h, bArr, 0, i13);
        byteBuffer.get(this.m, this.n, i12);
        this.n += i12;
        j10.flip();
    }

    @Override // l3.y, l3.j
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // l3.y
    public final h f(h hVar) {
        if (hVar.c != 2) {
            throw new i(hVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? h.e : hVar;
    }

    @Override // l3.y
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

    @Override // l3.y
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // l3.y
    public final void i() {
        this.m = f5.d0.f;
    }
}

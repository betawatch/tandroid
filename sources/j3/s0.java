package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s0 implements j {
    public int b;
    public float c;
    public float d;
    public h e;
    public h f;
    public h g;
    public h h;
    public boolean i;
    public r0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // j3.j
    public final ByteBuffer a() {
        r0 r0Var = this.j;
        if (r0Var != null) {
            int i10 = r0Var.b;
            int i11 = r0Var.m * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i10, r0Var.m);
                int i12 = min * i10;
                shortBuffer.put(r0Var.l, 0, i12);
                int i13 = r0Var.m - min;
                r0Var.m = i13;
                short[] sArr = r0Var.l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.o += i11;
                this.k.limit(i11);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = j.a;
        return byteBuffer;
    }

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r0 r0Var = this.j;
            r0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = r0Var.b;
            int i11 = remaining2 / i10;
            short[] c10 = r0Var.c(r0Var.j, r0Var.k, i11);
            r0Var.j = c10;
            asShortBuffer.get(c10, r0Var.k * i10, ((i11 * i10) * 2) / 2);
            r0Var.k += i11;
            r0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // j3.j
    public final void c() {
        r0 r0Var = this.j;
        if (r0Var != null) {
            int i10 = r0Var.k;
            float f10 = r0Var.c;
            float f11 = r0Var.d;
            int c10 = r0Var.m + ((int) i0.a.c(i10 / (f10 / f11), r0Var.o, r0Var.e * f11, 0.5f));
            short[] sArr = r0Var.j;
            int i11 = r0Var.h * 2;
            r0Var.j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.k = i11 + r0Var.k;
            r0Var.f();
            if (r0Var.m > c10) {
                r0Var.m = c10;
            }
            r0Var.k = 0;
            r0Var.r = 0;
            r0Var.o = 0;
        }
        this.p = true;
    }

    @Override // j3.j
    public final boolean d() {
        if (!this.p) {
            return false;
        }
        r0 r0Var = this.j;
        return r0Var == null || (r0Var.m * r0Var.b) * 2 == 0;
    }

    @Override // j3.j
    public final h e(h hVar) {
        if (hVar.c != 2) {
            throw new i(hVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = hVar.a;
        }
        this.e = hVar;
        h hVar2 = new h(i10, hVar.b, 2);
        this.f = hVar2;
        this.i = true;
        return hVar2;
    }

    @Override // j3.j
    public final void flush() {
        if (isActive()) {
            h hVar = this.e;
            this.g = hVar;
            h hVar2 = this.f;
            this.h = hVar2;
            if (this.i) {
                this.j = new r0(hVar.a, this.c, hVar.b, this.d, hVar2.a);
            } else {
                r0 r0Var = this.j;
                if (r0Var != null) {
                    r0Var.k = 0;
                    r0Var.m = 0;
                    r0Var.o = 0;
                    r0Var.p = 0;
                    r0Var.q = 0;
                    r0Var.r = 0;
                    r0Var.s = 0;
                    r0Var.t = 0;
                    r0Var.u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.m = j.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // j3.j
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // j3.j
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        h hVar = h.e;
        this.e = hVar;
        this.f = hVar;
        this.g = hVar;
        this.h = hVar;
        ByteBuffer byteBuffer = j.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
